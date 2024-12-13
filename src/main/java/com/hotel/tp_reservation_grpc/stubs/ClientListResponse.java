// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client.proto

package com.hotel.tp_reservation_grpc.stubs;

/**
 * Protobuf type {@code ClientListResponse}
 */
public  final class ClientListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ClientListResponse)
    ClientListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ClientListResponse.newBuilder() to construct.
  private ClientListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientListResponse() {
    clients_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ClientListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ClientListResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              clients_ = new java.util.ArrayList<com.hotel.tp_reservation_grpc.stubs.Client>();
              mutable_bitField0_ |= 0x00000001;
            }
            clients_.add(
                input.readMessage(com.hotel.tp_reservation_grpc.stubs.Client.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        clients_ = java.util.Collections.unmodifiableList(clients_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hotel.tp_reservation_grpc.stubs.ClientProto.internal_static_ClientListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hotel.tp_reservation_grpc.stubs.ClientProto.internal_static_ClientListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hotel.tp_reservation_grpc.stubs.ClientListResponse.class, com.hotel.tp_reservation_grpc.stubs.ClientListResponse.Builder.class);
  }

  public static final int CLIENTS_FIELD_NUMBER = 1;
  private java.util.List<com.hotel.tp_reservation_grpc.stubs.Client> clients_;
  /**
   * <code>repeated .Client clients = 1;</code>
   */
  public java.util.List<com.hotel.tp_reservation_grpc.stubs.Client> getClientsList() {
    return clients_;
  }
  /**
   * <code>repeated .Client clients = 1;</code>
   */
  public java.util.List<? extends com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder> 
      getClientsOrBuilderList() {
    return clients_;
  }
  /**
   * <code>repeated .Client clients = 1;</code>
   */
  public int getClientsCount() {
    return clients_.size();
  }
  /**
   * <code>repeated .Client clients = 1;</code>
   */
  public com.hotel.tp_reservation_grpc.stubs.Client getClients(int index) {
    return clients_.get(index);
  }
  /**
   * <code>repeated .Client clients = 1;</code>
   */
  public com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder getClientsOrBuilder(
      int index) {
    return clients_.get(index);
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
    for (int i = 0; i < clients_.size(); i++) {
      output.writeMessage(1, clients_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < clients_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, clients_.get(i));
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
    if (!(obj instanceof com.hotel.tp_reservation_grpc.stubs.ClientListResponse)) {
      return super.equals(obj);
    }
    com.hotel.tp_reservation_grpc.stubs.ClientListResponse other = (com.hotel.tp_reservation_grpc.stubs.ClientListResponse) obj;

    if (!getClientsList()
        .equals(other.getClientsList())) return false;
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
    if (getClientsCount() > 0) {
      hash = (37 * hash) + CLIENTS_FIELD_NUMBER;
      hash = (53 * hash) + getClientsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse parseFrom(
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
  public static Builder newBuilder(com.hotel.tp_reservation_grpc.stubs.ClientListResponse prototype) {
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
   * Protobuf type {@code ClientListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ClientListResponse)
      com.hotel.tp_reservation_grpc.stubs.ClientListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hotel.tp_reservation_grpc.stubs.ClientProto.internal_static_ClientListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hotel.tp_reservation_grpc.stubs.ClientProto.internal_static_ClientListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hotel.tp_reservation_grpc.stubs.ClientListResponse.class, com.hotel.tp_reservation_grpc.stubs.ClientListResponse.Builder.class);
    }

    // Construct using com.hotel.tp_reservation_grpc.stubs.ClientListResponse.newBuilder()
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
        getClientsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (clientsBuilder_ == null) {
        clients_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        clientsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hotel.tp_reservation_grpc.stubs.ClientProto.internal_static_ClientListResponse_descriptor;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.ClientListResponse getDefaultInstanceForType() {
      return com.hotel.tp_reservation_grpc.stubs.ClientListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.ClientListResponse build() {
      com.hotel.tp_reservation_grpc.stubs.ClientListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.ClientListResponse buildPartial() {
      com.hotel.tp_reservation_grpc.stubs.ClientListResponse result = new com.hotel.tp_reservation_grpc.stubs.ClientListResponse(this);
      int from_bitField0_ = bitField0_;
      if (clientsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          clients_ = java.util.Collections.unmodifiableList(clients_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.clients_ = clients_;
      } else {
        result.clients_ = clientsBuilder_.build();
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
      if (other instanceof com.hotel.tp_reservation_grpc.stubs.ClientListResponse) {
        return mergeFrom((com.hotel.tp_reservation_grpc.stubs.ClientListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hotel.tp_reservation_grpc.stubs.ClientListResponse other) {
      if (other == com.hotel.tp_reservation_grpc.stubs.ClientListResponse.getDefaultInstance()) return this;
      if (clientsBuilder_ == null) {
        if (!other.clients_.isEmpty()) {
          if (clients_.isEmpty()) {
            clients_ = other.clients_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureClientsIsMutable();
            clients_.addAll(other.clients_);
          }
          onChanged();
        }
      } else {
        if (!other.clients_.isEmpty()) {
          if (clientsBuilder_.isEmpty()) {
            clientsBuilder_.dispose();
            clientsBuilder_ = null;
            clients_ = other.clients_;
            bitField0_ = (bitField0_ & ~0x00000001);
            clientsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClientsFieldBuilder() : null;
          } else {
            clientsBuilder_.addAllMessages(other.clients_);
          }
        }
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
      com.hotel.tp_reservation_grpc.stubs.ClientListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hotel.tp_reservation_grpc.stubs.ClientListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.hotel.tp_reservation_grpc.stubs.Client> clients_ =
      java.util.Collections.emptyList();
    private void ensureClientsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        clients_ = new java.util.ArrayList<com.hotel.tp_reservation_grpc.stubs.Client>(clients_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Client, com.hotel.tp_reservation_grpc.stubs.Client.Builder, com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder> clientsBuilder_;

    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public java.util.List<com.hotel.tp_reservation_grpc.stubs.Client> getClientsList() {
      if (clientsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(clients_);
      } else {
        return clientsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public int getClientsCount() {
      if (clientsBuilder_ == null) {
        return clients_.size();
      } else {
        return clientsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Client getClients(int index) {
      if (clientsBuilder_ == null) {
        return clients_.get(index);
      } else {
        return clientsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder setClients(
        int index, com.hotel.tp_reservation_grpc.stubs.Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.set(index, value);
        onChanged();
      } else {
        clientsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder setClients(
        int index, com.hotel.tp_reservation_grpc.stubs.Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.set(index, builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder addClients(com.hotel.tp_reservation_grpc.stubs.Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.add(value);
        onChanged();
      } else {
        clientsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder addClients(
        int index, com.hotel.tp_reservation_grpc.stubs.Client value) {
      if (clientsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClientsIsMutable();
        clients_.add(index, value);
        onChanged();
      } else {
        clientsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder addClients(
        com.hotel.tp_reservation_grpc.stubs.Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.add(builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder addClients(
        int index, com.hotel.tp_reservation_grpc.stubs.Client.Builder builderForValue) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.add(index, builderForValue.build());
        onChanged();
      } else {
        clientsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder addAllClients(
        java.lang.Iterable<? extends com.hotel.tp_reservation_grpc.stubs.Client> values) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, clients_);
        onChanged();
      } else {
        clientsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder clearClients() {
      if (clientsBuilder_ == null) {
        clients_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        clientsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public Builder removeClients(int index) {
      if (clientsBuilder_ == null) {
        ensureClientsIsMutable();
        clients_.remove(index);
        onChanged();
      } else {
        clientsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Client.Builder getClientsBuilder(
        int index) {
      return getClientsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder getClientsOrBuilder(
        int index) {
      if (clientsBuilder_ == null) {
        return clients_.get(index);  } else {
        return clientsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public java.util.List<? extends com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder> 
         getClientsOrBuilderList() {
      if (clientsBuilder_ != null) {
        return clientsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(clients_);
      }
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Client.Builder addClientsBuilder() {
      return getClientsFieldBuilder().addBuilder(
          com.hotel.tp_reservation_grpc.stubs.Client.getDefaultInstance());
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Client.Builder addClientsBuilder(
        int index) {
      return getClientsFieldBuilder().addBuilder(
          index, com.hotel.tp_reservation_grpc.stubs.Client.getDefaultInstance());
    }
    /**
     * <code>repeated .Client clients = 1;</code>
     */
    public java.util.List<com.hotel.tp_reservation_grpc.stubs.Client.Builder> 
         getClientsBuilderList() {
      return getClientsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Client, com.hotel.tp_reservation_grpc.stubs.Client.Builder, com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder> 
        getClientsFieldBuilder() {
      if (clientsBuilder_ == null) {
        clientsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.hotel.tp_reservation_grpc.stubs.Client, com.hotel.tp_reservation_grpc.stubs.Client.Builder, com.hotel.tp_reservation_grpc.stubs.ClientOrBuilder>(
                clients_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        clients_ = null;
      }
      return clientsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ClientListResponse)
  }

  // @@protoc_insertion_point(class_scope:ClientListResponse)
  private static final com.hotel.tp_reservation_grpc.stubs.ClientListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hotel.tp_reservation_grpc.stubs.ClientListResponse();
  }

  public static com.hotel.tp_reservation_grpc.stubs.ClientListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientListResponse>
      PARSER = new com.google.protobuf.AbstractParser<ClientListResponse>() {
    @java.lang.Override
    public ClientListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ClientListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hotel.tp_reservation_grpc.stubs.ClientListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
