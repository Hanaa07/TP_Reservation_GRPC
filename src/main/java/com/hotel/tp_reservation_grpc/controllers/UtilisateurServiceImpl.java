package com.hotel.tp_reservation_grpc.controllers;

import com.hotel.tp_reservation_grpc.entities.Utilisateur;
import com.hotel.tp_reservation_grpc.repositories.UtilisateurRepository;
import com.hotel.tp_reservation_grpc.stubs.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.stream.Collectors;

@GrpcService
public class UtilisateurServiceImpl extends UtilisateurServiceGrpc.UtilisateurServiceImplBase {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void createUtilisateur(UtilisateurRequest request, StreamObserver<UtilisateurResponse> responseObserver) {
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(request.getUtilisateur().getNom());
        utilisateur.setMotDePasse(passwordEncoder.encode(request.getUtilisateur().getMotDePasse()));
        utilisateur.setRole(request.getUtilisateur().getRole());

        Utilisateur savedUtilisateur = utilisateurRepository.save(utilisateur);

        UtilisateurResponse response = UtilisateurResponse.newBuilder()
                .setUtilisateur(mapToProto(savedUtilisateur))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getUtilisateurById(UtilisateurIdRequest request, StreamObserver<UtilisateurResponse> responseObserver) {
        Utilisateur utilisateur = utilisateurRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Utilisateur not found with id: " + request.getId()));

        UtilisateurResponse response = UtilisateurResponse.newBuilder()
                .setUtilisateur(mapToProto(utilisateur))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllUtilisateurs(EmptyRequest request, StreamObserver<UtilisateurListResponse> responseObserver) {
        UtilisateurListResponse response = UtilisateurListResponse.newBuilder()
                .addAllUtilisateurs(utilisateurRepository.findAll()
                        .stream()
                        .map(this::mapToProto)
                        .collect(Collectors.toList()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateUtilisateur(UpdateUtilisateurRequest request, StreamObserver<UtilisateurResponse> responseObserver) {
        Utilisateur existingUtilisateur = utilisateurRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Utilisateur not found with id: " + request.getId()));

        existingUtilisateur.setNom(request.getUtilisateur().getNom());
        if (request.getUtilisateur().getMotDePasse() != null && !request.getUtilisateur().getMotDePasse().isEmpty()) {
            existingUtilisateur.setMotDePasse(passwordEncoder.encode(request.getUtilisateur().getMotDePasse()));
        }
        existingUtilisateur.setRole(request.getUtilisateur().getRole());

        Utilisateur updatedUtilisateur = utilisateurRepository.save(existingUtilisateur);

        UtilisateurResponse response = UtilisateurResponse.newBuilder()
                .setUtilisateur(mapToProto(updatedUtilisateur))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteUtilisateur(UtilisateurIdRequest request, StreamObserver<EmptyResponse> responseObserver) {
        utilisateurRepository.deleteById(request.getId());
        responseObserver.onNext(EmptyResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    private com.hotel.tp_reservation_grpc.stubs.Utilisateur mapToProto(Utilisateur utilisateur) {
        return com.hotel.tp_reservation_grpc.stubs.Utilisateur.newBuilder()
                .setId(utilisateur.getId())
                .setNom(utilisateur.getNom())
                .setMotDePasse(utilisateur.getMotDePasse())
                .setRole(utilisateur.getRole())
                .build();
    }
}
