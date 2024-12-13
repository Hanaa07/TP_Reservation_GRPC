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
    comments = "Source: utilisateur.proto")
public final class UtilisateurServiceGrpc {

  private UtilisateurServiceGrpc() {}

  public static final String SERVICE_NAME = "UtilisateurService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest,
      com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> getCreateUtilisateurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUtilisateur",
      requestType = com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest,
      com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> getCreateUtilisateurMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest, com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> getCreateUtilisateurMethod;
    if ((getCreateUtilisateurMethod = UtilisateurServiceGrpc.getCreateUtilisateurMethod) == null) {
      synchronized (UtilisateurServiceGrpc.class) {
        if ((getCreateUtilisateurMethod = UtilisateurServiceGrpc.getCreateUtilisateurMethod) == null) {
          UtilisateurServiceGrpc.getCreateUtilisateurMethod = getCreateUtilisateurMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest, com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UtilisateurService", "CreateUtilisateur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UtilisateurServiceMethodDescriptorSupplier("CreateUtilisateur"))
                  .build();
          }
        }
     }
     return getCreateUtilisateurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest,
      com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> getGetUtilisateurByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUtilisateurById",
      requestType = com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest,
      com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> getGetUtilisateurByIdMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest, com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> getGetUtilisateurByIdMethod;
    if ((getGetUtilisateurByIdMethod = UtilisateurServiceGrpc.getGetUtilisateurByIdMethod) == null) {
      synchronized (UtilisateurServiceGrpc.class) {
        if ((getGetUtilisateurByIdMethod = UtilisateurServiceGrpc.getGetUtilisateurByIdMethod) == null) {
          UtilisateurServiceGrpc.getGetUtilisateurByIdMethod = getGetUtilisateurByIdMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest, com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UtilisateurService", "GetUtilisateurById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UtilisateurServiceMethodDescriptorSupplier("GetUtilisateurById"))
                  .build();
          }
        }
     }
     return getGetUtilisateurByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.EmptyRequest,
      com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse> getGetAllUtilisateursMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUtilisateurs",
      requestType = com.hotel.tp_reservation_grpc.stubs.EmptyRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.EmptyRequest,
      com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse> getGetAllUtilisateursMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.EmptyRequest, com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse> getGetAllUtilisateursMethod;
    if ((getGetAllUtilisateursMethod = UtilisateurServiceGrpc.getGetAllUtilisateursMethod) == null) {
      synchronized (UtilisateurServiceGrpc.class) {
        if ((getGetAllUtilisateursMethod = UtilisateurServiceGrpc.getGetAllUtilisateursMethod) == null) {
          UtilisateurServiceGrpc.getGetAllUtilisateursMethod = getGetAllUtilisateursMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.EmptyRequest, com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UtilisateurService", "GetAllUtilisateurs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UtilisateurServiceMethodDescriptorSupplier("GetAllUtilisateurs"))
                  .build();
          }
        }
     }
     return getGetAllUtilisateursMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest,
      com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> getUpdateUtilisateurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUtilisateur",
      requestType = com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest,
      com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> getUpdateUtilisateurMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest, com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> getUpdateUtilisateurMethod;
    if ((getUpdateUtilisateurMethod = UtilisateurServiceGrpc.getUpdateUtilisateurMethod) == null) {
      synchronized (UtilisateurServiceGrpc.class) {
        if ((getUpdateUtilisateurMethod = UtilisateurServiceGrpc.getUpdateUtilisateurMethod) == null) {
          UtilisateurServiceGrpc.getUpdateUtilisateurMethod = getUpdateUtilisateurMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest, com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UtilisateurService", "UpdateUtilisateur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UtilisateurServiceMethodDescriptorSupplier("UpdateUtilisateur"))
                  .build();
          }
        }
     }
     return getUpdateUtilisateurMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest,
      com.hotel.tp_reservation_grpc.stubs.EmptyResponse> getDeleteUtilisateurMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUtilisateur",
      requestType = com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest,
      com.hotel.tp_reservation_grpc.stubs.EmptyResponse> getDeleteUtilisateurMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest, com.hotel.tp_reservation_grpc.stubs.EmptyResponse> getDeleteUtilisateurMethod;
    if ((getDeleteUtilisateurMethod = UtilisateurServiceGrpc.getDeleteUtilisateurMethod) == null) {
      synchronized (UtilisateurServiceGrpc.class) {
        if ((getDeleteUtilisateurMethod = UtilisateurServiceGrpc.getDeleteUtilisateurMethod) == null) {
          UtilisateurServiceGrpc.getDeleteUtilisateurMethod = getDeleteUtilisateurMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest, com.hotel.tp_reservation_grpc.stubs.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UtilisateurService", "DeleteUtilisateur"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.EmptyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UtilisateurServiceMethodDescriptorSupplier("DeleteUtilisateur"))
                  .build();
          }
        }
     }
     return getDeleteUtilisateurMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UtilisateurServiceStub newStub(io.grpc.Channel channel) {
    return new UtilisateurServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UtilisateurServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UtilisateurServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UtilisateurServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UtilisateurServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UtilisateurServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUtilisateur(com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUtilisateurMethod(), responseObserver);
    }

    /**
     */
    public void getUtilisateurById(com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUtilisateurByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllUtilisateurs(com.hotel.tp_reservation_grpc.stubs.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllUtilisateursMethod(), responseObserver);
    }

    /**
     */
    public void updateUtilisateur(com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUtilisateurMethod(), responseObserver);
    }

    /**
     */
    public void deleteUtilisateur(com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteUtilisateurMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUtilisateurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest,
                com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse>(
                  this, METHODID_CREATE_UTILISATEUR)))
          .addMethod(
            getGetUtilisateurByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest,
                com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse>(
                  this, METHODID_GET_UTILISATEUR_BY_ID)))
          .addMethod(
            getGetAllUtilisateursMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.EmptyRequest,
                com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse>(
                  this, METHODID_GET_ALL_UTILISATEURS)))
          .addMethod(
            getUpdateUtilisateurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest,
                com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse>(
                  this, METHODID_UPDATE_UTILISATEUR)))
          .addMethod(
            getDeleteUtilisateurMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest,
                com.hotel.tp_reservation_grpc.stubs.EmptyResponse>(
                  this, METHODID_DELETE_UTILISATEUR)))
          .build();
    }
  }

  /**
   */
  public static final class UtilisateurServiceStub extends io.grpc.stub.AbstractStub<UtilisateurServiceStub> {
    private UtilisateurServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UtilisateurServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilisateurServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UtilisateurServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUtilisateur(com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUtilisateurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUtilisateurById(com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUtilisateurByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUtilisateurs(com.hotel.tp_reservation_grpc.stubs.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllUtilisateursMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUtilisateur(com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUtilisateurMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUtilisateur(com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteUtilisateurMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UtilisateurServiceBlockingStub extends io.grpc.stub.AbstractStub<UtilisateurServiceBlockingStub> {
    private UtilisateurServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UtilisateurServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilisateurServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UtilisateurServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse createUtilisateur(com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUtilisateurMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse getUtilisateurById(com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUtilisateurByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse getAllUtilisateurs(com.hotel.tp_reservation_grpc.stubs.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllUtilisateursMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse updateUtilisateur(com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUtilisateurMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.EmptyResponse deleteUtilisateur(com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteUtilisateurMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UtilisateurServiceFutureStub extends io.grpc.stub.AbstractStub<UtilisateurServiceFutureStub> {
    private UtilisateurServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UtilisateurServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UtilisateurServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UtilisateurServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> createUtilisateur(
        com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUtilisateurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> getUtilisateurById(
        com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUtilisateurByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse> getAllUtilisateurs(
        com.hotel.tp_reservation_grpc.stubs.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllUtilisateursMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse> updateUtilisateur(
        com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUtilisateurMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.EmptyResponse> deleteUtilisateur(
        com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteUtilisateurMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_UTILISATEUR = 0;
  private static final int METHODID_GET_UTILISATEUR_BY_ID = 1;
  private static final int METHODID_GET_ALL_UTILISATEURS = 2;
  private static final int METHODID_UPDATE_UTILISATEUR = 3;
  private static final int METHODID_DELETE_UTILISATEUR = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UtilisateurServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UtilisateurServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_UTILISATEUR:
          serviceImpl.createUtilisateur((com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse>) responseObserver);
          break;
        case METHODID_GET_UTILISATEUR_BY_ID:
          serviceImpl.getUtilisateurById((com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_UTILISATEURS:
          serviceImpl.getAllUtilisateurs((com.hotel.tp_reservation_grpc.stubs.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_UTILISATEUR:
          serviceImpl.updateUtilisateur((com.hotel.tp_reservation_grpc.stubs.UpdateUtilisateurRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.UtilisateurResponse>) responseObserver);
          break;
        case METHODID_DELETE_UTILISATEUR:
          serviceImpl.deleteUtilisateur((com.hotel.tp_reservation_grpc.stubs.UtilisateurIdRequest) request,
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

  private static abstract class UtilisateurServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UtilisateurServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UtilisateurService");
    }
  }

  private static final class UtilisateurServiceFileDescriptorSupplier
      extends UtilisateurServiceBaseDescriptorSupplier {
    UtilisateurServiceFileDescriptorSupplier() {}
  }

  private static final class UtilisateurServiceMethodDescriptorSupplier
      extends UtilisateurServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UtilisateurServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UtilisateurServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UtilisateurServiceFileDescriptorSupplier())
              .addMethod(getCreateUtilisateurMethod())
              .addMethod(getGetUtilisateurByIdMethod())
              .addMethod(getGetAllUtilisateursMethod())
              .addMethod(getUpdateUtilisateurMethod())
              .addMethod(getDeleteUtilisateurMethod())
              .build();
        }
      }
    }
    return result;
  }
}
