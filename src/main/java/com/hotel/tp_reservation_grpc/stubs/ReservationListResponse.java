// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: reservation.proto

package com.hotel.tp_reservation_grpc.stubs;

/**
 * Protobuf type {@code ReservationListResponse}
 */
public  final class ReservationListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ReservationListResponse)
    ReservationListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ReservationListResponse.newBuilder() to construct.
  private ReservationListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ReservationListResponse() {
    reservations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ReservationListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ReservationListResponse(
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
              reservations_ = new java.util.ArrayList<com.hotel.tp_reservation_grpc.stubs.Reservation>();
              mutable_bitField0_ |= 0x00000001;
            }
            reservations_.add(
                input.readMessage(com.hotel.tp_reservation_grpc.stubs.Reservation.parser(), extensionRegistry));
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
        reservations_ = java.util.Collections.unmodifiableList(reservations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hotel.tp_reservation_grpc.stubs.ReservationProto.internal_static_ReservationListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hotel.tp_reservation_grpc.stubs.ReservationProto.internal_static_ReservationListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hotel.tp_reservation_grpc.stubs.ReservationListResponse.class, com.hotel.tp_reservation_grpc.stubs.ReservationListResponse.Builder.class);
  }

  public static final int RESERVATIONS_FIELD_NUMBER = 1;
  private java.util.List<com.hotel.tp_reservation_grpc.stubs.Reservation> reservations_;
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  public java.util.List<com.hotel.tp_reservation_grpc.stubs.Reservation> getReservationsList() {
    return reservations_;
  }
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  public java.util.List<? extends com.hotel.tp_reservation_grpc.stubs.ReservationOrBuilder> 
      getReservationsOrBuilderList() {
    return reservations_;
  }
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  public int getReservationsCount() {
    return reservations_.size();
  }
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  public com.hotel.tp_reservation_grpc.stubs.Reservation getReservations(int index) {
    return reservations_.get(index);
  }
  /**
   * <code>repeated .Reservation reservations = 1;</code>
   */
  public com.hotel.tp_reservation_grpc.stubs.ReservationOrBuilder getReservationsOrBuilder(
      int index) {
    return reservations_.get(index);
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
    for (int i = 0; i < reservations_.size(); i++) {
      output.writeMessage(1, reservations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < reservations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, reservations_.get(i));
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
    if (!(obj instanceof com.hotel.tp_reservation_grpc.stubs.ReservationListResponse)) {
      return super.equals(obj);
    }
    com.hotel.tp_reservation_grpc.stubs.ReservationListResponse other = (com.hotel.tp_reservation_grpc.stubs.ReservationListResponse) obj;

    if (!getReservationsList()
        .equals(other.getReservationsList())) return false;
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
    if (getReservationsCount() > 0) {
      hash = (37 * hash) + RESERVATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getReservationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parseFrom(
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
  public static Builder newBuilder(com.hotel.tp_reservation_grpc.stubs.ReservationListResponse prototype) {
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
   * Protobuf type {@code ReservationListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReservationListResponse)
      com.hotel.tp_reservation_grpc.stubs.ReservationListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hotel.tp_reservation_grpc.stubs.ReservationProto.internal_static_ReservationListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hotel.tp_reservation_grpc.stubs.ReservationProto.internal_static_ReservationListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hotel.tp_reservation_grpc.stubs.ReservationListResponse.class, com.hotel.tp_reservation_grpc.stubs.ReservationListResponse.Builder.class);
    }

    // Construct using com.hotel.tp_reservation_grpc.stubs.ReservationListResponse.newBuilder()
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
        getReservationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (reservationsBuilder_ == null) {
        reservations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        reservationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hotel.tp_reservation_grpc.stubs.ReservationProto.internal_static_ReservationListResponse_descriptor;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.ReservationListResponse getDefaultInstanceForType() {
      return com.hotel.tp_reservation_grpc.stubs.ReservationListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.ReservationListResponse build() {
      com.hotel.tp_reservation_grpc.stubs.ReservationListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.ReservationListResponse buildPartial() {
      com.hotel.tp_reservation_grpc.stubs.ReservationListResponse result = new com.hotel.tp_reservation_grpc.stubs.ReservationListResponse(this);
      int from_bitField0_ = bitField0_;
      if (reservationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          reservations_ = java.util.Collections.unmodifiableList(reservations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.reservations_ = reservations_;
      } else {
        result.reservations_ = reservationsBuilder_.build();
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
      if (other instanceof com.hotel.tp_reservation_grpc.stubs.ReservationListResponse) {
        return mergeFrom((com.hotel.tp_reservation_grpc.stubs.ReservationListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hotel.tp_reservation_grpc.stubs.ReservationListResponse other) {
      if (other == com.hotel.tp_reservation_grpc.stubs.ReservationListResponse.getDefaultInstance()) return this;
      if (reservationsBuilder_ == null) {
        if (!other.reservations_.isEmpty()) {
          if (reservations_.isEmpty()) {
            reservations_ = other.reservations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureReservationsIsMutable();
            reservations_.addAll(other.reservations_);
          }
          onChanged();
        }
      } else {
        if (!other.reservations_.isEmpty()) {
          if (reservationsBuilder_.isEmpty()) {
            reservationsBuilder_.dispose();
            reservationsBuilder_ = null;
            reservations_ = other.reservations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            reservationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getReservationsFieldBuilder() : null;
          } else {
            reservationsBuilder_.addAllMessages(other.reservations_);
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
      com.hotel.tp_reservation_grpc.stubs.ReservationListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hotel.tp_reservation_grpc.stubs.ReservationListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.hotel.tp_reservation_grpc.stubs.Reservation> reservations_ =
      java.util.Collections.emptyList();
    private void ensureReservationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        reservations_ = new java.util.ArrayList<com.hotel.tp_reservation_grpc.stubs.Reservation>(reservations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Reservation, com.hotel.tp_reservation_grpc.stubs.Reservation.Builder, com.hotel.tp_reservation_grpc.stubs.ReservationOrBuilder> reservationsBuilder_;

    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public java.util.List<com.hotel.tp_reservation_grpc.stubs.Reservation> getReservationsList() {
      if (reservationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(reservations_);
      } else {
        return reservationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public int getReservationsCount() {
      if (reservationsBuilder_ == null) {
        return reservations_.size();
      } else {
        return reservationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Reservation getReservations(int index) {
      if (reservationsBuilder_ == null) {
        return reservations_.get(index);
      } else {
        return reservationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public Builder setReservations(
        int index, com.hotel.tp_reservation_grpc.stubs.Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.set(index, value);
        onChanged();
      } else {
        reservationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public Builder setReservations(
        int index, com.hotel.tp_reservation_grpc.stubs.Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.set(index, builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public Builder addReservations(com.hotel.tp_reservation_grpc.stubs.Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.add(value);
        onChanged();
      } else {
        reservationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        int index, com.hotel.tp_reservation_grpc.stubs.Reservation value) {
      if (reservationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureReservationsIsMutable();
        reservations_.add(index, value);
        onChanged();
      } else {
        reservationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        com.hotel.tp_reservation_grpc.stubs.Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.add(builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public Builder addReservations(
        int index, com.hotel.tp_reservation_grpc.stubs.Reservation.Builder builderForValue) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.add(index, builderForValue.build());
        onChanged();
      } else {
        reservationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public Builder addAllReservations(
        java.lang.Iterable<? extends com.hotel.tp_reservation_grpc.stubs.Reservation> values) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, reservations_);
        onChanged();
      } else {
        reservationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public Builder clearReservations() {
      if (reservationsBuilder_ == null) {
        reservations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        reservationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public Builder removeReservations(int index) {
      if (reservationsBuilder_ == null) {
        ensureReservationsIsMutable();
        reservations_.remove(index);
        onChanged();
      } else {
        reservationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Reservation.Builder getReservationsBuilder(
        int index) {
      return getReservationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.ReservationOrBuilder getReservationsOrBuilder(
        int index) {
      if (reservationsBuilder_ == null) {
        return reservations_.get(index);  } else {
        return reservationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public java.util.List<? extends com.hotel.tp_reservation_grpc.stubs.ReservationOrBuilder> 
         getReservationsOrBuilderList() {
      if (reservationsBuilder_ != null) {
        return reservationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(reservations_);
      }
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Reservation.Builder addReservationsBuilder() {
      return getReservationsFieldBuilder().addBuilder(
          com.hotel.tp_reservation_grpc.stubs.Reservation.getDefaultInstance());
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Reservation.Builder addReservationsBuilder(
        int index) {
      return getReservationsFieldBuilder().addBuilder(
          index, com.hotel.tp_reservation_grpc.stubs.Reservation.getDefaultInstance());
    }
    /**
     * <code>repeated .Reservation reservations = 1;</code>
     */
    public java.util.List<com.hotel.tp_reservation_grpc.stubs.Reservation.Builder> 
         getReservationsBuilderList() {
      return getReservationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Reservation, com.hotel.tp_reservation_grpc.stubs.Reservation.Builder, com.hotel.tp_reservation_grpc.stubs.ReservationOrBuilder> 
        getReservationsFieldBuilder() {
      if (reservationsBuilder_ == null) {
        reservationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.hotel.tp_reservation_grpc.stubs.Reservation, com.hotel.tp_reservation_grpc.stubs.Reservation.Builder, com.hotel.tp_reservation_grpc.stubs.ReservationOrBuilder>(
                reservations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        reservations_ = null;
      }
      return reservationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ReservationListResponse)
  }

  // @@protoc_insertion_point(class_scope:ReservationListResponse)
  private static final com.hotel.tp_reservation_grpc.stubs.ReservationListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hotel.tp_reservation_grpc.stubs.ReservationListResponse();
  }

  public static com.hotel.tp_reservation_grpc.stubs.ReservationListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReservationListResponse>
      PARSER = new com.google.protobuf.AbstractParser<ReservationListResponse>() {
    @java.lang.Override
    public ReservationListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ReservationListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ReservationListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReservationListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hotel.tp_reservation_grpc.stubs.ReservationListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

