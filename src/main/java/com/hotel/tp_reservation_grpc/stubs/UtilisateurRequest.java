// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: utilisateur.proto

package com.hotel.tp_reservation_grpc.stubs;

/**
 * Protobuf type {@code UtilisateurRequest}
 */
public  final class UtilisateurRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UtilisateurRequest)
    UtilisateurRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UtilisateurRequest.newBuilder() to construct.
  private UtilisateurRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UtilisateurRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UtilisateurRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UtilisateurRequest(
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
            com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder subBuilder = null;
            if (utilisateur_ != null) {
              subBuilder = utilisateur_.toBuilder();
            }
            utilisateur_ = input.readMessage(com.hotel.tp_reservation_grpc.stubs.Utilisateur.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(utilisateur_);
              utilisateur_ = subBuilder.buildPartial();
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
    return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_UtilisateurRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_UtilisateurRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest.class, com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest.Builder.class);
  }

  public static final int UTILISATEUR_FIELD_NUMBER = 1;
  private com.hotel.tp_reservation_grpc.stubs.Utilisateur utilisateur_;
  /**
   * <code>.Utilisateur utilisateur = 1;</code>
   * @return Whether the utilisateur field is set.
   */
  public boolean hasUtilisateur() {
    return utilisateur_ != null;
  }
  /**
   * <code>.Utilisateur utilisateur = 1;</code>
   * @return The utilisateur.
   */
  public com.hotel.tp_reservation_grpc.stubs.Utilisateur getUtilisateur() {
    return utilisateur_ == null ? com.hotel.tp_reservation_grpc.stubs.Utilisateur.getDefaultInstance() : utilisateur_;
  }
  /**
   * <code>.Utilisateur utilisateur = 1;</code>
   */
  public com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder getUtilisateurOrBuilder() {
    return getUtilisateur();
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
    if (utilisateur_ != null) {
      output.writeMessage(1, getUtilisateur());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (utilisateur_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUtilisateur());
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
    if (!(obj instanceof com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest)) {
      return super.equals(obj);
    }
    com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest other = (com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest) obj;

    if (hasUtilisateur() != other.hasUtilisateur()) return false;
    if (hasUtilisateur()) {
      if (!getUtilisateur()
          .equals(other.getUtilisateur())) return false;
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
    if (hasUtilisateur()) {
      hash = (37 * hash) + UTILISATEUR_FIELD_NUMBER;
      hash = (53 * hash) + getUtilisateur().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parseFrom(
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
  public static Builder newBuilder(com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest prototype) {
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
   * Protobuf type {@code UtilisateurRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UtilisateurRequest)
      com.hotel.tp_reservation_grpc.stubs.UtilisateurRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_UtilisateurRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_UtilisateurRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest.class, com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest.Builder.class);
    }

    // Construct using com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest.newBuilder()
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
      if (utilisateurBuilder_ == null) {
        utilisateur_ = null;
      } else {
        utilisateur_ = null;
        utilisateurBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_UtilisateurRequest_descriptor;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest getDefaultInstanceForType() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest build() {
      com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest buildPartial() {
      com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest result = new com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest(this);
      if (utilisateurBuilder_ == null) {
        result.utilisateur_ = utilisateur_;
      } else {
        result.utilisateur_ = utilisateurBuilder_.build();
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
      if (other instanceof com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest) {
        return mergeFrom((com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest other) {
      if (other == com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest.getDefaultInstance()) return this;
      if (other.hasUtilisateur()) {
        mergeUtilisateur(other.getUtilisateur());
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
      com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.hotel.tp_reservation_grpc.stubs.Utilisateur utilisateur_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Utilisateur, com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder, com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder> utilisateurBuilder_;
    /**
     * <code>.Utilisateur utilisateur = 1;</code>
     * @return Whether the utilisateur field is set.
     */
    public boolean hasUtilisateur() {
      return utilisateurBuilder_ != null || utilisateur_ != null;
    }
    /**
     * <code>.Utilisateur utilisateur = 1;</code>
     * @return The utilisateur.
     */
    public com.hotel.tp_reservation_grpc.stubs.Utilisateur getUtilisateur() {
      if (utilisateurBuilder_ == null) {
        return utilisateur_ == null ? com.hotel.tp_reservation_grpc.stubs.Utilisateur.getDefaultInstance() : utilisateur_;
      } else {
        return utilisateurBuilder_.getMessage();
      }
    }
    /**
     * <code>.Utilisateur utilisateur = 1;</code>
     */
    public Builder setUtilisateur(com.hotel.tp_reservation_grpc.stubs.Utilisateur value) {
      if (utilisateurBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        utilisateur_ = value;
        onChanged();
      } else {
        utilisateurBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Utilisateur utilisateur = 1;</code>
     */
    public Builder setUtilisateur(
        com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder builderForValue) {
      if (utilisateurBuilder_ == null) {
        utilisateur_ = builderForValue.build();
        onChanged();
      } else {
        utilisateurBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Utilisateur utilisateur = 1;</code>
     */
    public Builder mergeUtilisateur(com.hotel.tp_reservation_grpc.stubs.Utilisateur value) {
      if (utilisateurBuilder_ == null) {
        if (utilisateur_ != null) {
          utilisateur_ =
            com.hotel.tp_reservation_grpc.stubs.Utilisateur.newBuilder(utilisateur_).mergeFrom(value).buildPartial();
        } else {
          utilisateur_ = value;
        }
        onChanged();
      } else {
        utilisateurBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Utilisateur utilisateur = 1;</code>
     */
    public Builder clearUtilisateur() {
      if (utilisateurBuilder_ == null) {
        utilisateur_ = null;
        onChanged();
      } else {
        utilisateur_ = null;
        utilisateurBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Utilisateur utilisateur = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder getUtilisateurBuilder() {
      
      onChanged();
      return getUtilisateurFieldBuilder().getBuilder();
    }
    /**
     * <code>.Utilisateur utilisateur = 1;</code>
     */
    public com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder getUtilisateurOrBuilder() {
      if (utilisateurBuilder_ != null) {
        return utilisateurBuilder_.getMessageOrBuilder();
      } else {
        return utilisateur_ == null ?
            com.hotel.tp_reservation_grpc.stubs.Utilisateur.getDefaultInstance() : utilisateur_;
      }
    }
    /**
     * <code>.Utilisateur utilisateur = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.hotel.tp_reservation_grpc.stubs.Utilisateur, com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder, com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder> 
        getUtilisateurFieldBuilder() {
      if (utilisateurBuilder_ == null) {
        utilisateurBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.hotel.tp_reservation_grpc.stubs.Utilisateur, com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder, com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder>(
                getUtilisateur(),
                getParentForChildren(),
                isClean());
        utilisateur_ = null;
      }
      return utilisateurBuilder_;
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


    // @@protoc_insertion_point(builder_scope:UtilisateurRequest)
  }

  // @@protoc_insertion_point(class_scope:UtilisateurRequest)
  private static final com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest();
  }

  public static com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UtilisateurRequest>
      PARSER = new com.google.protobuf.AbstractParser<UtilisateurRequest>() {
    @java.lang.Override
    public UtilisateurRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UtilisateurRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UtilisateurRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UtilisateurRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hotel.tp_reservation_grpc.stubs.UtilisateurRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
