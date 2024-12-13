package com.hotel.tp_reservation_grpc.services;

import com.hotel.tp_reservation_grpc.entities.Reservation;

import java.util.List;

public interface ReservationService {
    Reservation createReservation(Reservation reservation);
    Reservation getReservation(Long id);
    List<Reservation> getAllReservations();
    Reservation updateReservation(Long id, Reservation newReservation);
    void deleteReservation(Long id);
}