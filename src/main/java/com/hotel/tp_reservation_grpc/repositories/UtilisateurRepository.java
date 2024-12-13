package com.hotel.tp_reservation_grpc.repositories;

import com.hotel.tp_reservation_grpc.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    Optional<Utilisateur> findByNom(String nom);
}
