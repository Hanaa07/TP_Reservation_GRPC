package com.hotel.tp_reservation_grpc.services;

import com.hotel.tp_reservation_grpc.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    Utilisateur createUtilisateur(Utilisateur utilisateur);
    Utilisateur getUtilisateurById(Long id);
    List<Utilisateur> getAllUtilisateurs();
    Utilisateur updateUtilisateur(Long id, Utilisateur utilisateur);
    void deleteUtilisateur(Long id);
}
