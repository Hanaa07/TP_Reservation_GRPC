package com.hotel.tp_reservation_grpc.controllers;

import com.hotel.tp_reservation_grpc.entities.Client;
import com.hotel.tp_reservation_grpc.repositories.ClientRepository;
import com.hotel.tp_reservation_grpc.stubs.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;

@GrpcService
public class ClientServiceImpl extends ClientServiceGrpc.ClientServiceImplBase {

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public void createClient(ClientRequest request, StreamObserver<ClientResponse> responseObserver) {
        Client client = new Client();
        client.setNom(request.getClient().getNom());
        client.setPrenom(request.getClient().getPrenom());
        client.setEmail(request.getClient().getEmail());
        client.setTelephone(request.getClient().getTelephone());

        Client savedClient = clientRepository.save(client);

        ClientResponse response = ClientResponse.newBuilder()
                .setClient(mapToProto(savedClient))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getClientById(ClientIdRequest request, StreamObserver<ClientResponse> responseObserver) {
        Client client = clientRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Client not found with id: " + request.getId()));

        ClientResponse response = ClientResponse.newBuilder()
                .setClient(mapToProto(client))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getAllClients(EmptyRequest request, StreamObserver<ClientListResponse> responseObserver) {
        ClientListResponse response = ClientListResponse.newBuilder()
                .addAllClients(clientRepository.findAll()
                        .stream()
                        .map(this::mapToProto)
                        .collect(Collectors.toList()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateClient(UpdateClientRequest request, StreamObserver<ClientResponse> responseObserver) {
        Client existingClient = clientRepository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Client not found with id: " + request.getId()));

        existingClient.setNom(request.getClient().getNom());
        existingClient.setPrenom(request.getClient().getPrenom());
        existingClient.setEmail(request.getClient().getEmail());
        existingClient.setTelephone(request.getClient().getTelephone());

        Client updatedClient = clientRepository.save(existingClient);

        ClientResponse response = ClientResponse.newBuilder()
                .setClient(mapToProto(updatedClient))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void deleteClient(ClientIdRequest request, StreamObserver<EmptyResponse> responseObserver) {
        clientRepository.deleteById(request.getId());
        responseObserver.onNext(EmptyResponse.newBuilder().build());
        responseObserver.onCompleted();
    }

    private com.hotel.tp_reservation_grpc.stubs.Client mapToProto(Client client) {
        return com.hotel.tp_reservation_grpc.stubs.Client.newBuilder()
                .setId(client.getId())
                .setNom(client.getNom())
                .setPrenom(client.getPrenom())
                .setEmail(client.getEmail())
                .setTelephone(client.getTelephone())
                .build();
    }
}
