package com.hotel.tp_reservation_grpc.controllers;

import com.hotel.tp_reservation_grpc.entities.Reservation;
import com.hotel.tp_reservation_grpc.repositories.ReservationRepository;
import com.hotel.tp_reservation_grpc.stubs.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;

@GrpcService
public class ReservationServiceImpl extends ReservationServiceGrpc.ReservationServiceImplBase {

    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public void createReservation(ReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
        Reservation reservation = new Reservation();
        reservation.setDateDebut(request.getReservation().getDateDebut());
        reservation.setDateFin(request.getReservation().getDateFin());
        reservation.setPreferences(request.getReservation().getPreferences());

        Reservation savedReservation = reservationRepository.save(reservation);

        ReservationResponse response = ReservationResponse.newBuilder()
                .setReservation(mapToProto(savedReservation))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getReservationById(ReservationIdRequest request, StreamObserver<ReservationResponse> responseObserver) {
        Reservation reservation = reservationRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Reservation not found with id: " + request.getId()));

        ReservationResponse response = ReservationResponse.newBuilder()
                .setReservation(mapToProto(reservation))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllReservations(EmptyRequest request, StreamObserver<ReservationListResponse> responseObserver) {
        ReservationListResponse response = ReservationListResponse.newBuilder()
                .addAllReservations(reservationRepository.findAll()
                        .stream()
                        .map(this::mapToProto)
                        .collect(Collectors.toList()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateReservation(UpdateReservationRequest request, StreamObserver<ReservationResponse> responseObserver) {
        Reservation existingReservation = reservationRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Reservation not found with id: " + request.getId()));

        existingReservation.setDateDebut(request.getReservation().getDateDebut());
        existingReservation.setDateFin(request.getReservation().getDateFin());
        existingReservation.setPreferences(request.getReservation().getPreferences());

        Reservation updatedReservation = reservationRepository.save(existingReservation);

        ReservationResponse response = ReservationResponse.newBuilder()
                .setReservation(mapToProto(updatedReservation))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteReservation(ReservationIdRequest request, StreamObserver<EmptyResponse> responseObserver) {
        reservationRepository.deleteById(request.getId());
        responseObserver.onNext(EmptyResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    private com.hotel.tp_reservation_grpc.stubs.Reservation mapToProto(Reservation reservation) {
        return com.hotel.tp_reservation_grpc.stubs.Reservation.newBuilder()
                .setId(reservation.getId())
                .setDateDebut(reservation.getDateDebut())
                .setDateFin(reservation.getDateFin())
                .setPreferences(reservation.getPreferences())
                .build();
    }
}
