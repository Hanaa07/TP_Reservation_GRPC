package com.hotel.tp_reservation_grpc.controllers;

import com.hotel.tp_reservation_grpc.entities.Chambre;
import com.hotel.tp_reservation_grpc.repositories.ChambreRepository;
import com.hotel.tp_reservation_grpc.stubs.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;

@GrpcService
public class ChambreServiceImpl extends ChambreServiceGrpc.ChambreServiceImplBase {

    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public void createChambre(ChambreRequest request, StreamObserver<ChambreResponse> responseObserver) {
        Chambre chambre = new Chambre();
        chambre.setTypeChambre(request.getChambre().getTypeChambre());
        chambre.setPrix(request.getChambre().getPrix());
        chambre.setDisponible(request.getChambre().getDisponible());

        Chambre savedChambre = chambreRepository.save(chambre);

        ChambreResponse response = ChambreResponse.newBuilder()
                .setChambre(mapToProto(savedChambre))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getChambreById(ChambreIdRequest request, StreamObserver<ChambreResponse> responseObserver) {
        Chambre chambre = chambreRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Chambre not found with id: " + request.getId()));

        ChambreResponse response = ChambreResponse.newBuilder()
                .setChambre(mapToProto(chambre))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllChambres(EmptyRequest request, StreamObserver<ChambreListResponse> responseObserver) {
        ChambreListResponse response = ChambreListResponse.newBuilder()
                .addAllChambres(chambreRepository.findAll()
                        .stream()
                        .map(this::mapToProto)
                        .collect(Collectors.toList()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateChambre(UpdateChambreRequest request, StreamObserver<ChambreResponse> responseObserver) {
        Chambre existingChambre = chambreRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Chambre not found with id: " + request.getId()));

        existingChambre.setTypeChambre(request.getChambre().getTypeChambre());
        existingChambre.setPrix(request.getChambre().getPrix());
        existingChambre.setDisponible(request.getChambre().getDisponible());

        Chambre updatedChambre = chambreRepository.save(existingChambre);

        ChambreResponse response = ChambreResponse.newBuilder()
                .setChambre(mapToProto(updatedChambre))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteChambre(ChambreIdRequest request, StreamObserver<EmptyResponse> responseObserver) {
        chambreRepository.deleteById(request.getId());
        responseObserver.onNext(EmptyResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    private com.hotel.tp_reservation_grpc.stubs.Chambre mapToProto(Chambre chambre) {
        return com.hotel.tp_reservation_grpc.stubs.Chambre.newBuilder()
                .setId(chambre.getId())
                .setTypeChambre(chambre.getTypeChambre())
                .setPrix(chambre.getPrix())
                .setDisponible(chambre.isDisponible())
                .build();
    }
}