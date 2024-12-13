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
    comments = "Source: chambre.proto")
public final class ChambreServiceGrpc {

  private ChambreServiceGrpc() {}

  public static final String SERVICE_NAME = "ChambreService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ChambreRequest,
      com.hotel.tp_reservation_grpc.stubs.ChambreResponse> getCreateChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateChambre",
      requestType = com.hotel.tp_reservation_grpc.stubs.ChambreRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.ChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ChambreRequest,
      com.hotel.tp_reservation_grpc.stubs.ChambreResponse> getCreateChambreMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ChambreRequest, com.hotel.tp_reservation_grpc.stubs.ChambreResponse> getCreateChambreMethod;
    if ((getCreateChambreMethod = ChambreServiceGrpc.getCreateChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getCreateChambreMethod = ChambreServiceGrpc.getCreateChambreMethod) == null) {
          ChambreServiceGrpc.getCreateChambreMethod = getCreateChambreMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.ChambreRequest, com.hotel.tp_reservation_grpc.stubs.ChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "CreateChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("CreateChambre"))
                  .build();
          }
        }
     }
     return getCreateChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest,
      com.hotel.tp_reservation_grpc.stubs.ChambreResponse> getGetChambreByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetChambreById",
      requestType = com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.ChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest,
      com.hotel.tp_reservation_grpc.stubs.ChambreResponse> getGetChambreByIdMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest, com.hotel.tp_reservation_grpc.stubs.ChambreResponse> getGetChambreByIdMethod;
    if ((getGetChambreByIdMethod = ChambreServiceGrpc.getGetChambreByIdMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getGetChambreByIdMethod = ChambreServiceGrpc.getGetChambreByIdMethod) == null) {
          ChambreServiceGrpc.getGetChambreByIdMethod = getGetChambreByIdMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest, com.hotel.tp_reservation_grpc.stubs.ChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "GetChambreById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("GetChambreById"))
                  .build();
          }
        }
     }
     return getGetChambreByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.EmptyRequest,
      com.hotel.tp_reservation_grpc.stubs.ChambreListResponse> getGetAllChambresMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllChambres",
      requestType = com.hotel.tp_reservation_grpc.stubs.EmptyRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.ChambreListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.EmptyRequest,
      com.hotel.tp_reservation_grpc.stubs.ChambreListResponse> getGetAllChambresMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.EmptyRequest, com.hotel.tp_reservation_grpc.stubs.ChambreListResponse> getGetAllChambresMethod;
    if ((getGetAllChambresMethod = ChambreServiceGrpc.getGetAllChambresMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getGetAllChambresMethod = ChambreServiceGrpc.getGetAllChambresMethod) == null) {
          ChambreServiceGrpc.getGetAllChambresMethod = getGetAllChambresMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.EmptyRequest, com.hotel.tp_reservation_grpc.stubs.ChambreListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "GetAllChambres"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.EmptyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ChambreListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("GetAllChambres"))
                  .build();
          }
        }
     }
     return getGetAllChambresMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest,
      com.hotel.tp_reservation_grpc.stubs.ChambreResponse> getUpdateChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateChambre",
      requestType = com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.ChambreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest,
      com.hotel.tp_reservation_grpc.stubs.ChambreResponse> getUpdateChambreMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest, com.hotel.tp_reservation_grpc.stubs.ChambreResponse> getUpdateChambreMethod;
    if ((getUpdateChambreMethod = ChambreServiceGrpc.getUpdateChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getUpdateChambreMethod = ChambreServiceGrpc.getUpdateChambreMethod) == null) {
          ChambreServiceGrpc.getUpdateChambreMethod = getUpdateChambreMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest, com.hotel.tp_reservation_grpc.stubs.ChambreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "UpdateChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ChambreResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("UpdateChambre"))
                  .build();
          }
        }
     }
     return getUpdateChambreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest,
      com.hotel.tp_reservation_grpc.stubs.EmptyResponse> getDeleteChambreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteChambre",
      requestType = com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest.class,
      responseType = com.hotel.tp_reservation_grpc.stubs.EmptyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest,
      com.hotel.tp_reservation_grpc.stubs.EmptyResponse> getDeleteChambreMethod() {
    io.grpc.MethodDescriptor<com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest, com.hotel.tp_reservation_grpc.stubs.EmptyResponse> getDeleteChambreMethod;
    if ((getDeleteChambreMethod = ChambreServiceGrpc.getDeleteChambreMethod) == null) {
      synchronized (ChambreServiceGrpc.class) {
        if ((getDeleteChambreMethod = ChambreServiceGrpc.getDeleteChambreMethod) == null) {
          ChambreServiceGrpc.getDeleteChambreMethod = getDeleteChambreMethod = 
              io.grpc.MethodDescriptor.<com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest, com.hotel.tp_reservation_grpc.stubs.EmptyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ChambreService", "DeleteChambre"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hotel.tp_reservation_grpc.stubs.EmptyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ChambreServiceMethodDescriptorSupplier("DeleteChambre"))
                  .build();
          }
        }
     }
     return getDeleteChambreMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChambreServiceStub newStub(io.grpc.Channel channel) {
    return new ChambreServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChambreServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChambreServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChambreServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChambreServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChambreServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createChambre(com.hotel.tp_reservation_grpc.stubs.ChambreRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateChambreMethod(), responseObserver);
    }

    /**
     */
    public void getChambreById(com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetChambreByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllChambres(com.hotel.tp_reservation_grpc.stubs.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllChambresMethod(), responseObserver);
    }

    /**
     */
    public void updateChambre(com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateChambreMethod(), responseObserver);
    }

    /**
     */
    public void deleteChambre(com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.EmptyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteChambreMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.ChambreRequest,
                com.hotel.tp_reservation_grpc.stubs.ChambreResponse>(
                  this, METHODID_CREATE_CHAMBRE)))
          .addMethod(
            getGetChambreByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest,
                com.hotel.tp_reservation_grpc.stubs.ChambreResponse>(
                  this, METHODID_GET_CHAMBRE_BY_ID)))
          .addMethod(
            getGetAllChambresMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.EmptyRequest,
                com.hotel.tp_reservation_grpc.stubs.ChambreListResponse>(
                  this, METHODID_GET_ALL_CHAMBRES)))
          .addMethod(
            getUpdateChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest,
                com.hotel.tp_reservation_grpc.stubs.ChambreResponse>(
                  this, METHODID_UPDATE_CHAMBRE)))
          .addMethod(
            getDeleteChambreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest,
                com.hotel.tp_reservation_grpc.stubs.EmptyResponse>(
                  this, METHODID_DELETE_CHAMBRE)))
          .build();
    }
  }

  /**
   */
  public static final class ChambreServiceStub extends io.grpc.stub.AbstractStub<ChambreServiceStub> {
    private ChambreServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceStub(channel, callOptions);
    }

    /**
     */
    public void createChambre(com.hotel.tp_reservation_grpc.stubs.ChambreRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getChambreById(com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetChambreByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllChambres(com.hotel.tp_reservation_grpc.stubs.EmptyRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllChambresMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateChambre(com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateChambreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteChambre(com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest request,
        io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.EmptyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteChambreMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChambreServiceBlockingStub extends io.grpc.stub.AbstractStub<ChambreServiceBlockingStub> {
    private ChambreServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.ChambreResponse createChambre(com.hotel.tp_reservation_grpc.stubs.ChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.ChambreResponse getChambreById(com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetChambreByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.ChambreListResponse getAllChambres(com.hotel.tp_reservation_grpc.stubs.EmptyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllChambresMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.ChambreResponse updateChambre(com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateChambreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.hotel.tp_reservation_grpc.stubs.EmptyResponse deleteChambre(com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteChambreMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChambreServiceFutureStub extends io.grpc.stub.AbstractStub<ChambreServiceFutureStub> {
    private ChambreServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChambreServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChambreServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChambreServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.ChambreResponse> createChambre(
        com.hotel.tp_reservation_grpc.stubs.ChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.ChambreResponse> getChambreById(
        com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetChambreByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.ChambreListResponse> getAllChambres(
        com.hotel.tp_reservation_grpc.stubs.EmptyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllChambresMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.ChambreResponse> updateChambre(
        com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateChambreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hotel.tp_reservation_grpc.stubs.EmptyResponse> deleteChambre(
        com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteChambreMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CHAMBRE = 0;
  private static final int METHODID_GET_CHAMBRE_BY_ID = 1;
  private static final int METHODID_GET_ALL_CHAMBRES = 2;
  private static final int METHODID_UPDATE_CHAMBRE = 3;
  private static final int METHODID_DELETE_CHAMBRE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChambreServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChambreServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CHAMBRE:
          serviceImpl.createChambre((com.hotel.tp_reservation_grpc.stubs.ChambreRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreResponse>) responseObserver);
          break;
        case METHODID_GET_CHAMBRE_BY_ID:
          serviceImpl.getChambreById((com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_CHAMBRES:
          serviceImpl.getAllChambres((com.hotel.tp_reservation_grpc.stubs.EmptyRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CHAMBRE:
          serviceImpl.updateChambre((com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest) request,
              (io.grpc.stub.StreamObserver<com.hotel.tp_reservation_grpc.stubs.ChambreResponse>) responseObserver);
          break;
        case METHODID_DELETE_CHAMBRE:
          serviceImpl.deleteChambre((com.hotel.tp_reservation_grpc.stubs.ChambreIdRequest) request,
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

  private static abstract class ChambreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChambreServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hotel.tp_reservation_grpc.stubs.ChambreProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ChambreService");
    }
  }

  private static final class ChambreServiceFileDescriptorSupplier
      extends ChambreServiceBaseDescriptorSupplier {
    ChambreServiceFileDescriptorSupplier() {}
  }

  private static final class ChambreServiceMethodDescriptorSupplier
      extends ChambreServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChambreServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ChambreServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChambreServiceFileDescriptorSupplier())
              .addMethod(getCreateChambreMethod())
              .addMethod(getGetChambreByIdMethod())
              .addMethod(getGetAllChambresMethod())
              .addMethod(getUpdateChambreMethod())
              .addMethod(getDeleteChambreMethod())
              .build();
        }
      }
    }
    return result;
  }
}
