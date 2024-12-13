package com.hotel.tp_reservation_grpc.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: client.proto")
public final class ClientServiceGrpc {

  private ClientServiceGrpc() {}

  public static final String SERVICE_NAME = "ClientService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ClientRequest,
      com.hotel.tp_reservation_grpc.stubs.ClientResponse> getCreateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateClient",
      requestType = com.hotel.tp_reservation_grpc.stubs.ClientRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ClientRequest,
      com.hotel.tp_reservation_grpc.stubs.ClientResponse> getCreateClientMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ClientRequest, com.hotel.tp_reservation_grpc.stubs.ClientResponse> getCreateClientMethod;
    if ((getCreateClientMethod = ClientServiceGrpc.getCreateClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getCreateClientMethod = ClientServiceGrpc.getCreateClientMethod) == null) {
          ClientServiceGrpc.getCreateClientMethod = getCreateClientMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.ClientRequest, com.hotel.tp_reservation_grpc.stubs.ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "CreateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("CreateClient"))
                  .build();
          }
        }
     }
     return getCreateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ClientIdRequest,
      com.hotel.tp_reservation_grpc.stubs.ClientResponse> getGetClientByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetClientById",
      requestType = com.hotel.tp_reservation_grpc.stubs.ClientIdRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ClientIdRequest,
      com.hotel.tp_reservation_grpc.stubs.ClientResponse> getGetClientByIdMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ClientIdRequest, com.hotel.tp_reservation_grpc.stubs.ClientResponse> getGetClientByIdMethod;
    if ((getGetClientByIdMethod = ClientServiceGrpc.getGetClientByIdMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetClientByIdMethod = ClientServiceGrpc.getGetClientByIdMethod) == null) {
          ClientServiceGrpc.getGetClientByIdMethod = getGetClientByIdMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.ClientIdRequest, com.hotel.tp_reservation_grpc.stubs.ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "GetClientById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ClientIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetClientById"))
                  .build();
          }
        }
     }
     return getGetClientByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.EmptyRequest,
      com.hotel.tp_reservation_grpc.stubs.ClientListResponse> getGetAllClientsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllClients",
      requestType = com.hotel.tp_reservation_grpc.stubs.EmptyRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.ClientListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.EmptyRequest,
      com.hotel.tp_reservation_grpc.stubs.ClientListResponse> getGetAllClientsMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.EmptyRequest, com.hotel.tp_reservation_grpc.stubs.ClientListResponse> getGetAllClientsMethod;
    if ((getGetAllClientsMethod = ClientServiceGrpc.getGetAllClientsMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getGetAllClientsMethod = ClientServiceGrpc.getGetAllClientsMethod) == null) {
          ClientServiceGrpc.getGetAllClientsMethod = getGetAllClientsMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.EmptyRequest, com.hotel.tp_reservation_grpc.stubs.ClientListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "GetAllClients"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ClientListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("GetAllClients"))
                  .build();
          }
        }
     }
     return getGetAllClientsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest,
      com.hotel.tp_reservation_grpc.stubs.ClientResponse> getUpdateClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateClient",
      requestType = com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.ClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest,
      com.hotel.tp_reservation_grpc.stubs.ClientResponse> getUpdateClientMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest, com.hotel.tp_reservation_grpc.stubs.ClientResponse> getUpdateClientMethod;
    if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getUpdateClientMethod = ClientServiceGrpc.getUpdateClientMethod) == null) {
          ClientServiceGrpc.getUpdateClientMethod = getUpdateClientMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest, com.hotel.tp_reservation_grpc.stubs.ClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "UpdateClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ClientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("UpdateClient"))
                  .build();
          }
        }
     }
     return getUpdateClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ClientIdRequest,
      com.hotel.tp_reservation_grpc.stubs.EmptyResponse> getDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteClient",
      requestType = com.hotel.tp_reservation_grpc.stubs.ClientIdRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ClientIdRequest,
      com.hotel.tp_reservation_grpc.stubs.EmptyResponse> getDeleteClientMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ClientIdRequest, com.hotel.tp_reservation_grpc.stubs.EmptyResponse> getDeleteClientMethod;
    if ((getDeleteClientMethod = ClientServiceGrpc.getDeleteClientMethod) == null) {
      synchronized (ClientServiceGrpc.class) {
        if ((getDeleteClientMethod = ClientServiceGrpc.getDeleteClientMethod) == null) {
          ClientServiceGrpc.getDeleteClientMethod = getDeleteClientMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.ClientIdRequest, com.hotel.tp_reservation_grpc.stubs.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientService", "DeleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ClientIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.EmptyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientServiceMethodDescriptorSupplier("DeleteClient"))
                  .build();
          }
        }
     }
     return getDeleteClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientServiceStub newStub(io.grpc.Channel channel) {
    return new ClientServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createClient(com.hotel.tp_reservation_grpc.stubs.ClientRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateClientMethod(), responseObserver);
    }

    /**
     */
    public void getClientById(com.hotel.tp_reservation_grpc.stubs.ClientIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetClientByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllClients(com.hotel.tp_reservation_grpc.stubs.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllClientsMethod(), responseObserver);
    }

    /**
     */
    public void updateClient(com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateClientMethod(), responseObserver);
    }

    /**
     */
    public void deleteClient(com.hotel.tp_reservation_grpc.stubs.ClientIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.ClientRequest,
                com.hotel.tp_reservation_grpc.stubs.ClientResponse>(
                  this, METHODID_CREATE_CLIENT)))
          .addMethod(
            getGetClientByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.ClientIdRequest,
                com.hotel.tp_reservation_grpc.stubs.ClientResponse>(
                  this, METHODID_GET_CLIENT_BY_ID)))
          .addMethod(
            getGetAllClientsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.EmptyRequest,
                com.hotel.tp_reservation_grpc.stubs.ClientListResponse>(
                  this, METHODID_GET_ALL_CLIENTS)))
          .addMethod(
            getUpdateClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest,
                com.hotel.tp_reservation_grpc.stubs.ClientResponse>(
                  this, METHODID_UPDATE_CLIENT)))
          .addMethod(
            getDeleteClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.ClientIdRequest,
                com.hotel.tp_reservation_grpc.stubs.EmptyResponse>(
                  this, METHODID_DELETE_CLIENT)))
          .build();
    }
  }

  /**
   */
  public static final class ClientServiceStub extends io.grpc.stub.AbstractStub<ClientServiceStub> {
    private ClientServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceStub(channel, callOptions);
    }

    /**
     */
    public void createClient(com.hotel.tp_reservation_grpc.stubs.ClientRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getClientById(com.hotel.tp_reservation_grpc.stubs.ClientIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetClientByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllClients(com.hotel.tp_reservation_grpc.stubs.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllClientsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateClient(com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteClient(com.hotel.tp_reservation_grpc.stubs.ClientIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientServiceBlockingStub extends io.grpc.stub.AbstractStub<ClientServiceBlockingStub> {
    private ClientServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.ClientResponse createClient(com.hotel.tp_reservation_grpc.stubs.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.ClientResponse getClientById(com.hotel.tp_reservation_grpc.stubs.ClientIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetClientByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.ClientListResponse getAllClients(com.hotel.tp_reservation_grpc.stubs.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllClientsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.ClientResponse updateClient(com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.EmptyResponse deleteClient(com.hotel.tp_reservation_grpc.stubs.ClientIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteClientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientServiceFutureStub extends io.grpc.stub.AbstractStub<ClientServiceFutureStub> {
    private ClientServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.ClientResponse> createClient(
        com.hotel.tp_reservation_grpc.stubs.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.ClientResponse> getClientById(
        com.hotel.tp_reservation_grpc.stubs.ClientIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetClientByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.ClientListResponse> getAllClients(
        com.hotel.tp_reservation_grpc.stubs.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllClientsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.ClientResponse> updateClient(
        com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.EmptyResponse> deleteClient(
        com.hotel.tp_reservation_grpc.stubs.ClientIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CLIENT = 0;
  private static final int METHODID_GET_CLIENT_BY_ID = 1;
  private static final int METHODID_GET_ALL_CLIENTS = 2;
  private static final int METHODID_UPDATE_CLIENT = 3;
  private static final int METHODID_DELETE_CLIENT = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CLIENT:
          serviceImpl.createClient((com.hotel.tp_reservation_grpc.stubs.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientResponse>) responseObserver);
          break;
        case METHODID_GET_CLIENT_BY_ID:
          serviceImpl.getClientById((com.hotel.tp_reservation_grpc.stubs.ClientIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_CLIENTS:
          serviceImpl.getAllClients((com.hotel.tp_reservation_grpc.stubs.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CLIENT:
          serviceImpl.updateClient((com.hotel.tp_reservation_grpc.stubs.UpdateClientRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ClientResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT:
          serviceImpl.deleteClient((com.hotel.tp_reservation_grpc.stubs.ClientIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.EmptyResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hotel.tp_reservation_grpc.stubs.ClientProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientService");
    }
  }

  private static final class ClientServiceFileDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier {
    ClientServiceFileDescriptorSupplier() {}
  }

  private static final class ClientServiceMethodDescriptorSupplier
      extends ClientServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ClientServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientServiceFileDescriptorSupplier())
              .addMethod(getCreateClientMethod())
              .addMethod(getGetClientByIdMethod())
              .addMethod(getGetAllClientsMethod())
              .addMethod(getUpdateClientMethod())
              .addMethod(getDeleteClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
