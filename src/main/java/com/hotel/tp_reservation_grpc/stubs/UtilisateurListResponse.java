// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: utilisateur.proto

package com.hotel.tp_reservation_grpc.stubs;

/**
 * Protobuf type {@code UtilisateurListResponse}
 */
public  final class UtilisateurListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UtilisateurListResponse)
    UtilisateurListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UtilisateurListResponse.newBuilder() to construct.
  private UtilisateurListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UtilisateurListResponse() {
    utilisateurs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UtilisateurListResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UtilisateurListResponse(
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
              utilisateurs_ = new java.util.ArrayList<com.hotel.tp_reservation_grpc.stubs.Utilisateur>();
              mutable_bitField0_ |= 0x00000001;
            }
            utilisateurs_.add(
                input.readMessage(com.hotel.tp_reservation_grpc.stubs.Utilisateur.parser(), extensionRegistry));
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
        utilisateurs_ = java.util.Collections.unmodifiableList(utilisateurs_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_UtilisateurListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_UtilisateurListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse.class, com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse.Builder.class);
  }

  public static final int UTILISATEURS_FIELD_NUMBER = 1;
  private java.util.List<com.hotel.tp_reservation_grpc.stubs.Utilisateur> utilisateurs_;
  /**
   * <code>repeated .Utilisateur utilisateurs = 1;</code>
   */
  public java.util.List<com.hotel.tp_reservation_grpc.stubs.Utilisateur> getUtilisateursList() {
    return utilisateurs_;
  }
  /**
   * <code>repeated .Utilisateur utilisateurs = 1;</code>
   */
  public java.util.List<? extends com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder> 
      getUtilisateursOrBuilderList() {
    return utilisateurs_;
  }
  /**
   * <code>repeated .Utilisateur utilisateurs = 1;</code>
   */
  public int getUtilisateursCount() {
    return utilisateurs_.size();
  }
  /**
   * <code>repeated .Utilisateur utilisateurs = 1;</code>
   */
  public com.hotel.tp_reservation_grpc.stubs.Utilisateur getUtilisateurs(int index) {
    return utilisateurs_.get(index);
  }
  /**
   * <code>repeated .Utilisateur utilisateurs = 1;</code>
   */
  public com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder getUtilisateursOrBuilder(
      int index) {
    return utilisateurs_.get(index);
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
    for (int i = 0; i < utilisateurs_.size(); i++) {
      output.writeMessage(1, utilisateurs_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < utilisateurs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, utilisateurs_.get(i));
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
    if (!(obj instanceof com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse)) {
      return super.equals(obj);
    }
    com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse other = (com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse) obj;

    if (!getUtilisateursList()
        .equals(other.getUtilisateursList())) return false;
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
    if (getUtilisateursCount() > 0) {
      hash = (37 * hash) + UTILISATEURS_FIELD_NUMBER;
      hash = (53 * hash) + getUtilisateursList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parseFrom(
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
  public static Builder newBuilder(com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse prototype) {
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
   * Protobuf type {@code UtilisateurListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UtilisateurListResponse)
      com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_UtilisateurListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_UtilisateurListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse.class, com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse.Builder.class);
    }

    // Construct using com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse.newBuilder()
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
        getUtilisateursFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (utilisateursBuilder_ == null) {
        utilisateurs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        utilisateursBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_UtilisateurListResponse_descriptor;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse getDefaultInstanceForType() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse build() {
      com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse buildPartial() {
      com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse result = new com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse(this);
      int from_bitField0_ = bitField0_;
      if (utilisateursBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          utilisateurs_ = java.util.Collections.unmodifiableList(utilisateurs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.utilisateurs_ = utilisateurs_;
      } else {
        result.utilisateurs_ = utilisateursBuilder_.build();
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
      if (other instanceof com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse) {
        return mergeFrom((com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse other) {
      if (other == com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse.getDefaultInstance()) return this;
      if (utilisateursBuilder_ == null) {
        if (!other.utilisateurs_.isEmpty()) {
          if (utilisateurs_.isEmpty()) {
            utilisateurs_ = other.utilisateurs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUtilisateursIsMutable();
            utilisateurs_.addAll(other.utilisateurs_);
          }
          onChanged();
        }
      } else {
        if (!other.utilisateurs_.isEmpty()) {
          if (utilisateursBuilder_.isEmpty()) {
            utilisateursBuilder_.dispose();
            utilisateursBuilder_ = null;
            utilisateurs_ = other.utilisateurs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            utilisateursBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUtilisateursFieldBuilder() : null;
          } else {
            utilisateursBuilder_.addAllMessages(other.utilisateurs_);
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
      com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.hotel.tp_reservation_grpc.stubs.Utilisateur> utilisateurs_ =
      java.util.Collections.emptyList();
    private void ensureUtilisateursIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        utilisateurs_ = new java.util.ArrayList<com.hotel.tp_reservation_grpc.stubs.Utilisateur>(utilisateurs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Utilisateur, com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder, com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder> utilisateursBuilder_;

    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public java.util.List<com.hotel.tp_reservation_grpc.stubs.Utilisateur> getUtilisateursList() {
      if (utilisateursBuilder_ == null) {
        return java.util.Collections.unmodifiableList(utilisateurs_);
      } else {
        return utilisateursBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public int getUtilisateursCount() {
      if (utilisateursBuilder_ == null) {
        return utilisateurs_.size();
      } else {
        return utilisateursBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Utilisateur getUtilisateurs(int index) {
      if (utilisateursBuilder_ == null) {
        return utilisateurs_.get(index);
      } else {
        return utilisateursBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public Builder setUtilisateurs(
        int index, com.hotel.tp_reservation_grpc.stubs.Utilisateur value) {
      if (utilisateursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUtilisateursIsMutable();
        utilisateurs_.set(index, value);
        onChanged();
      } else {
        utilisateursBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public Builder setUtilisateurs(
        int index, com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder builderForValue) {
      if (utilisateursBuilder_ == null) {
        ensureUtilisateursIsMutable();
        utilisateurs_.set(index, builderForValue.build());
        onChanged();
      } else {
        utilisateursBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public Builder addUtilisateurs(com.hotel.tp_reservation_grpc.stubs.Utilisateur value) {
      if (utilisateursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUtilisateursIsMutable();
        utilisateurs_.add(value);
        onChanged();
      } else {
        utilisateursBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public Builder addUtilisateurs(
        int index, com.hotel.tp_reservation_grpc.stubs.Utilisateur value) {
      if (utilisateursBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUtilisateursIsMutable();
        utilisateurs_.add(index, value);
        onChanged();
      } else {
        utilisateursBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public Builder addUtilisateurs(
        com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder builderForValue) {
      if (utilisateursBuilder_ == null) {
        ensureUtilisateursIsMutable();
        utilisateurs_.add(builderForValue.build());
        onChanged();
      } else {
        utilisateursBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public Builder addUtilisateurs(
        int index, com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder builderForValue) {
      if (utilisateursBuilder_ == null) {
        ensureUtilisateursIsMutable();
        utilisateurs_.add(index, builderForValue.build());
        onChanged();
      } else {
        utilisateursBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public Builder addAllUtilisateurs(
        java.lang.Iterable<? extends com.hotel.tp_reservation_grpc.stubs.Utilisateur> values) {
      if (utilisateursBuilder_ == null) {
        ensureUtilisateursIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, utilisateurs_);
        onChanged();
      } else {
        utilisateursBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public Builder clearUtilisateurs() {
      if (utilisateursBuilder_ == null) {
        utilisateurs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        utilisateursBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public Builder removeUtilisateurs(int index) {
      if (utilisateursBuilder_ == null) {
        ensureUtilisateursIsMutable();
        utilisateurs_.remove(index);
        onChanged();
      } else {
        utilisateursBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder getUtilisateursBuilder(
        int index) {
      return getUtilisateursFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder getUtilisateursOrBuilder(
        int index) {
      if (utilisateursBuilder_ == null) {
        return utilisateurs_.get(index);  } else {
        return utilisateursBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public java.util.List<? extends com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder> 
         getUtilisateursOrBuilderList() {
      if (utilisateursBuilder_ != null) {
        return utilisateursBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(utilisateurs_);
      }
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder addUtilisateursBuilder() {
      return getUtilisateursFieldBuilder().addBuilder(
          com.hotel.tp_reservation_grpc.stubs.Utilisateur.getDefaultInstance());
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder addUtilisateursBuilder(
        int index) {
      return getUtilisateursFieldBuilder().addBuilder(
          index, com.hotel.tp_reservation_grpc.stubs.Utilisateur.getDefaultInstance());
    }
    /**
     * <code>repeated .Utilisateur utilisateurs = 1;</code>
     */
    public java.util.List<com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder> 
         getUtilisateursBuilderList() {
      return getUtilisateursFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Utilisateur, com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder, com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder> 
        getUtilisateursFieldBuilder() {
      if (utilisateursBuilder_ == null) {
        utilisateursBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.hotel.tp_reservation_grpc.stubs.Utilisateur, com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder, com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder>(
                utilisateurs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        utilisateurs_ = null;
      }
      return utilisateursBuilder_;
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


    // @@protoc_insertion_point(builder_scope:UtilisateurListResponse)
  }

  // @@protoc_insertion_point(class_scope:UtilisateurListResponse)
  private static final com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse();
  }

  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UtilisateurListResponse>
      PARSER = new com.google.protobuf.AbstractParser<UtilisateurListResponse>() {
    @java.lang.Override
    public UtilisateurListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UtilisateurListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UtilisateurListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UtilisateurListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hotel.tp_reservation_grpc.stubs.UtilisateurListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

