// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package com.hotel.tp_reservation_grpc.stubs;

/**
 * Protobuf type {@code ClientRequest}
 */
public  final class ClientRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ClientRequest)
    ClientRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientRequest.newBuilder() to construct.
  private ClientRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            com.hotel.tp_reservation_grpc.stubs.Client.Builder subBuilder = null;
            if (client_ != null) {
              subBuilder = client_.toBuilder();
            }
            client_ = input.readMessage(com.hotel.tp_reservation_grpc.stubs.Client.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(client_);
              client_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hotel.tp_reservation_grpc.stubs.ClientProto.internal_static_ClientRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hotel.tp_reservation_grpc.stubs.ClientProto.internal_static_ClientRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hotel.tp_reservation_grpc.stubs.ClientRequest.class, com.hotel.tp_reservation_grpc.stubs.ClientRequest.Builder.class);
  }

  public static final int CLIENT_FIELD_NUMBER = 1;
  private com.hotel.tp_reservation_grpc.stubs.Client client_;
  /**
   * <code>.Client client = 1;</code>
   * @return Whether the client field is set.
   */
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <code>.Client client = 1;</code>
   * @return The client.
   */
  public com.hotel.tp_reservation_grpc.stubs.Client getClient() {
    return client_ == null ? com.hotel.tp_reservation_grpc.stubs.Client.getDefaultInstance() : client_;
  }
  /**
   * <code>.Client client = 1;</code>
   */
  public com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder getClientOrBuilder() {
    return getClient();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (client_ != null) {
      output.writeMessage(1, getClient());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClient());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hotel.tp_reservation_grpc.stubs.ClientRequest)) {
      return super.equals(obj);
    }
    com.hotel.tp_reservation_grpc.stubs.ClientRequest other = (com.hotel.tp_reservation_grpc.stubs.ClientRequest) obj;

    if (hasClient() != other.hasClient()) return false;
    if (hasClient()) {
      if (!getClient()
          .equals(other.getClient())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hotel.tp_reservation_grpc.stubs.ClientRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ClientRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ClientRequest)
      com.hotel.tp_reservation_grpc.stubs.ClientRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hotel.tp_reservation_grpc.stubs.ClientProto.internal_static_ClientRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hotel.tp_reservation_grpc.stubs.ClientProto.internal_static_ClientRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hotel.tp_reservation_grpc.stubs.ClientRequest.class, com.hotel.tp_reservation_grpc.stubs.ClientRequest.Builder.class);
    }

    // Construct using com.hotel.tp_reservation_grpc.stubs.ClientRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (clientBuilder_ == null) {
        client_ = null;
      } else {
        client_ = null;
        clientBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hotel.tp_reservation_grpc.stubs.ClientProto.internal_static_ClientRequest_descriptor;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.ClientRequest getDefaultInstanceForType() {
      return com.hotel.tp_reservation_grpc.stubs.ClientRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.ClientRequest build() {
      com.hotel.tp_reservation_grpc.stubs.ClientRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.ClientRequest buildPartial() {
      com.hotel.tp_reservation_grpc.stubs.ClientRequest result = new com.hotel.tp_reservation_grpc.stubs.ClientRequest(this);
      if (clientBuilder_ == null) {
        result.client_ = client_;
      } else {
        result.client_ = clientBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hotel.tp_reservation_grpc.stubs.ClientRequest) {
        return mergeFrom((com.hotel.tp_reservation_grpc.stubs.ClientRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hotel.tp_reservation_grpc.stubs.ClientRequest other) {
      if (other == com.hotel.tp_reservation_grpc.stubs.ClientRequest.getDefaultInstance()) return this;
      if (other.hasClient()) {
        mergeClient(other.getClient());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hotel.tp_reservation_grpc.stubs.ClientRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hotel.tp_reservation_grpc.stubs.ClientRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.hotel.tp_reservation_grpc.stubs.Client client_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Client, com.hotel.tp_reservation_grpc.stubs.Client.Builder, com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder> clientBuilder_;
    /**
     * <code>.Client client = 1;</code>
     * @return Whether the client field is set.
     */
    public boolean hasClient() {
      return clientBuilder_ != null || client_ != null;
    }
    /**
     * <code>.Client client = 1;</code>
     * @return The client.
     */
    public com.hotel.tp_reservation_grpc.stubs.Client getClient() {
      if (clientBuilder_ == null) {
        return client_ == null ? com.hotel.tp_reservation_grpc.stubs.Client.getDefaultInstance() : client_;
      } else {
        return clientBuilder_.getMessage();
      }
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder setClient(com.hotel.tp_reservation_grpc.stubs.Client value) {
      if (clientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        client_ = value;
        onChanged();
      } else {
        clientBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder setClient(
        com.hotel.tp_reservation_grpc.stubs.Client.Builder builderForValue) {
      if (clientBuilder_ == null) {
        client_ = builderForValue.build();
        onChanged();
      } else {
        clientBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder mergeClient(com.hotel.tp_reservation_grpc.stubs.Client value) {
      if (clientBuilder_ == null) {
        if (client_ != null) {
          client_ =
            com.hotel.tp_reservation_grpc.stubs.Client.newBuilder(client_).mergeFrom(value).buildPartial();
        } else {
          client_ = value;
        }
        onChanged();
      } else {
        clientBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public Builder clearClient() {
      if (clientBuilder_ == null) {
        client_ = null;
        onChanged();
      } else {
        client_ = null;
        clientBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Client.Builder getClientBuilder() {
      
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <code>.Client client = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder getClientOrBuilder() {
      if (clientBuilder_ != null) {
        return clientBuilder_.getMessageOrBuilder();
      } else {
        return client_ == null ?
            com.hotel.tp_reservation_grpc.stubs.Client.getDefaultInstance() : client_;
      }
    }
    /**
     * <code>.Client client = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Client, com.hotel.tp_reservation_grpc.stubs.Client.Builder, com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder> 
        getClientFieldBuilder() {
      if (clientBuilder_ == null) {
        clientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.hotel.tp_reservation_grpc.stubs.Client, com.hotel.tp_reservation_grpc.stubs.Client.Builder, com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder>(
                getClient(),
                getParentForChildren(),
                isClean());
        client_ = null;
      }
      return clientBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ClientRequest)
  }

  // @@protoc_insertion_point(class_scope:ClientRequest)
  private static final com.hotel.tp_reservation_grpc.stubs.ClientRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hotel.tp_reservation_grpc.stubs.ClientRequest();
  }

  public static com.hotel.tp_reservation_grpc.stubs.ClientRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientRequest>
      PARSER = new com.google.protobuf.AbstractParser<ClientRequest>() {
    @java.lang.Override
    public ClientRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hotel.tp_reservation_grpc.stubs.ClientRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
