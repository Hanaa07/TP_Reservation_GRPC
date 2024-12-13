package com.hotel.tp_reservation_grpc.repositories;

import com.hotel.tp_reservation_grpc.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}