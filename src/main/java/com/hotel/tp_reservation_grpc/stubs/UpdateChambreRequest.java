// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chambre.proto

package com.hotel.tp_reservation_grpc.stubs;

/**
 * Protobuf type {@code UpdateChambreRequest}
 */
public  final class UpdateChambreRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UpdateChambreRequest)
    UpdateChambreRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateChambreRequest.newBuilder() to construct.
  private UpdateChambreRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateChambreRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateChambreRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateChambreRequest(
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
          case 8: {

            id_ = input.readInt64();
            break;
          }
          case 18: {
            com.hotel.tp_reservation_grpc.stubs.Chambre.Builder subBuilder = null;
            if (chambre_ != null) {
              subBuilder = chambre_.toBuilder();
            }
            chambre_ = input.readMessage(com.hotel.tp_reservation_grpc.stubs.Chambre.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(chambre_);
              chambre_ = subBuilder.buildPartial();
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
    return com.hotel.tp_reservation_grpc.stubs.ChambreProto.internal_static_UpdateChambreRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hotel.tp_reservation_grpc.stubs.ChambreProto.internal_static_UpdateChambreRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest.class, com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  public long getId() {
    return id_;
  }

  public static final int CHAMBRE_FIELD_NUMBER = 2;
  private com.hotel.tp_reservation_grpc.stubs.Chambre chambre_;
  /**
   * <code>.Chambre chambre = 2;</code>
   * @return Whether the chambre field is set.
   */
  public boolean hasChambre() {
    return chambre_ != null;
  }
  /**
   * <code>.Chambre chambre = 2;</code>
   * @return The chambre.
   */
  public com.hotel.tp_reservation_grpc.stubs.Chambre getChambre() {
    return chambre_ == null ? com.hotel.tp_reservation_grpc.stubs.Chambre.getDefaultInstance() : chambre_;
  }
  /**
   * <code>.Chambre chambre = 2;</code>
   */
  public com.hotel.tp_reservation_grpc.stubs.ChambreOrBuilder getChambreOrBuilder() {
    return getChambre();
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
    if (id_ != 0L) {
      output.writeInt64(1, id_);
    }
    if (chambre_ != null) {
      output.writeMessage(2, getChambre());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, id_);
    }
    if (chambre_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChambre());
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
    if (!(obj instanceof com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest)) {
      return super.equals(obj);
    }
    com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest other = (com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest) obj;

    if (getId()
        != other.getId()) return false;
    if (hasChambre() != other.hasChambre()) return false;
    if (hasChambre()) {
      if (!getChambre()
          .equals(other.getChambre())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    if (hasChambre()) {
      hash = (37 * hash) + CHAMBRE_FIELD_NUMBER;
      hash = (53 * hash) + getChambre().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parseFrom(
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
  public static Builder newBuilder(com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest prototype) {
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
   * Protobuf type {@code UpdateChambreRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UpdateChambreRequest)
      com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hotel.tp_reservation_grpc.stubs.ChambreProto.internal_static_UpdateChambreRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hotel.tp_reservation_grpc.stubs.ChambreProto.internal_static_UpdateChambreRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest.class, com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest.Builder.class);
    }

    // Construct using com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest.newBuilder()
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
      id_ = 0L;

      if (chambreBuilder_ == null) {
        chambre_ = null;
      } else {
        chambre_ = null;
        chambreBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hotel.tp_reservation_grpc.stubs.ChambreProto.internal_static_UpdateChambreRequest_descriptor;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest getDefaultInstanceForType() {
      return com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest build() {
      com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest buildPartial() {
      com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest result = new com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest(this);
      result.id_ = id_;
      if (chambreBuilder_ == null) {
        result.chambre_ = chambre_;
      } else {
        result.chambre_ = chambreBuilder_.build();
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
      if (other instanceof com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest) {
        return mergeFrom((com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest other) {
      if (other == com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.hasChambre()) {
        mergeChambre(other.getChambre());
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
      com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>int64 id = 1;</code>
     * @return The id.
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>int64 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private com.hotel.tp_reservation_grpc.stubs.Chambre chambre_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Chambre, com.hotel.tp_reservation_grpc.stubs.Chambre.Builder, com.hotel.tp_reservation_grpc.stubs.ChambreOrBuilder> chambreBuilder_;
    /**
     * <code>.Chambre chambre = 2;</code>
     * @return Whether the chambre field is set.
     */
    public boolean hasChambre() {
      return chambreBuilder_ != null || chambre_ != null;
    }
    /**
     * <code>.Chambre chambre = 2;</code>
     * @return The chambre.
     */
    public com.hotel.tp_reservation_grpc.stubs.Chambre getChambre() {
      if (chambreBuilder_ == null) {
        return chambre_ == null ? com.hotel.tp_reservation_grpc.stubs.Chambre.getDefaultInstance() : chambre_;
      } else {
        return chambreBuilder_.getMessage();
      }
    }
    /**
     * <code>.Chambre chambre = 2;</code>
     */
    public Builder setChambre(com.hotel.tp_reservation_grpc.stubs.Chambre value) {
      if (chambreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chambre_ = value;
        onChanged();
      } else {
        chambreBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 2;</code>
     */
    public Builder setChambre(
        com.hotel.tp_reservation_grpc.stubs.Chambre.Builder builderForValue) {
      if (chambreBuilder_ == null) {
        chambre_ = builderForValue.build();
        onChanged();
      } else {
        chambreBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 2;</code>
     */
    public Builder mergeChambre(com.hotel.tp_reservation_grpc.stubs.Chambre value) {
      if (chambreBuilder_ == null) {
        if (chambre_ != null) {
          chambre_ =
            com.hotel.tp_reservation_grpc.stubs.Chambre.newBuilder(chambre_).mergeFrom(value).buildPartial();
        } else {
          chambre_ = value;
        }
        onChanged();
      } else {
        chambreBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 2;</code>
     */
    public Builder clearChambre() {
      if (chambreBuilder_ == null) {
        chambre_ = null;
        onChanged();
      } else {
        chambre_ = null;
        chambreBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Chambre chambre = 2;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Chambre.Builder getChambreBuilder() {
      
      onChanged();
      return getChambreFieldBuilder().getBuilder();
    }
    /**
     * <code>.Chambre chambre = 2;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.ChambreOrBuilder getChambreOrBuilder() {
      if (chambreBuilder_ != null) {
        return chambreBuilder_.getMessageOrBuilder();
      } else {
        return chambre_ == null ?
            com.hotel.tp_reservation_grpc.stubs.Chambre.getDefaultInstance() : chambre_;
      }
    }
    /**
     * <code>.Chambre chambre = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Chambre, com.hotel.tp_reservation_grpc.stubs.Chambre.Builder, com.hotel.tp_reservation_grpc.stubs.ChambreOrBuilder> 
        getChambreFieldBuilder() {
      if (chambreBuilder_ == null) {
        chambreBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.hotel.tp_reservation_grpc.stubs.Chambre, com.hotel.tp_reservation_grpc.stubs.Chambre.Builder, com.hotel.tp_reservation_grpc.stubs.ChambreOrBuilder>(
                getChambre(),
                getParentForChildren(),
                isClean());
        chambre_ = null;
      }
      return chambreBuilder_;
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


    // @@protoc_insertion_point(builder_scope:UpdateChambreRequest)
  }

  // @@protoc_insertion_point(class_scope:UpdateChambreRequest)
  private static final com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest();
  }

  public static com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateChambreRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateChambreRequest>() {
    @java.lang.Override
    public UpdateChambreRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateChambreRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateChambreRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateChambreRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hotel.tp_reservation_grpc.stubs.UpdateChambreRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

