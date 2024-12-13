// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: utilisateur.proto

package com.hotel.tp_reservation_grpc.stubs;

/**
 * Protobuf type {@code Utilisateur}
 */
public  final class Utilisateur extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Utilisateur)
    UtilisateurOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Utilisateur.newBuilder() to construct.
  private Utilisateur(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Utilisateur() {
    nom_ = "";
    motDePasse_ = "";
    role_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Utilisateur();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Utilisateur(
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
            java.lang.String s = input.readStringRequireUtf8();

            nom_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            motDePasse_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            role_ = rawValue;
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
    return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_Utilisateur_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_Utilisateur_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hotel.tp_reservation_grpc.stubs.Utilisateur.class, com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder.class);
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

  public static final int NOM_FIELD_NUMBER = 2;
  private volatile java.lang.Object nom_;
  /**
   * <code>string nom = 2;</code>
   * @return The nom.
   */
  public java.lang.String getNom() {
    java.lang.Object ref = nom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nom_ = s;
      return s;
    }
  }
  /**
   * <code>string nom = 2;</code>
   * @return The bytes for nom.
   */
  public com.google.protobuf.ByteString
      getNomBytes() {
    java.lang.Object ref = nom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MOTDEPASSE_FIELD_NUMBER = 3;
  private volatile java.lang.Object motDePasse_;
  /**
   * <code>string motDePasse = 3;</code>
   * @return The motDePasse.
   */
  public java.lang.String getMotDePasse() {
    java.lang.Object ref = motDePasse_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      motDePasse_ = s;
      return s;
    }
  }
  /**
   * <code>string motDePasse = 3;</code>
   * @return The bytes for motDePasse.
   */
  public com.google.protobuf.ByteString
      getMotDePasseBytes() {
    java.lang.Object ref = motDePasse_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      motDePasse_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLE_FIELD_NUMBER = 4;
  private int role_;
  /**
   * <code>.Role role = 4;</code>
   * @return The enum numeric value on the wire for role.
   */
  public int getRoleValue() {
    return role_;
  }
  /**
   * <code>.Role role = 4;</code>
   * @return The role.
   */
  public com.hotel.tp_reservation_grpc.stubs.Role getRole() {
    @SuppressWarnings("deprecation")
    com.hotel.tp_reservation_grpc.stubs.Role result = com.hotel.tp_reservation_grpc.stubs.Role.valueOf(role_);
    return result == null ? com.hotel.tp_reservation_grpc.stubs.Role.UNRECOGNIZED : result;
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
    if (!getNomBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nom_);
    }
    if (!getMotDePasseBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, motDePasse_);
    }
    if (role_ != com.hotel.tp_reservation_grpc.stubs.Role.USER.getNumber()) {
      output.writeEnum(4, role_);
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
    if (!getNomBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nom_);
    }
    if (!getMotDePasseBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, motDePasse_);
    }
    if (role_ != com.hotel.tp_reservation_grpc.stubs.Role.USER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, role_);
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
    if (!(obj instanceof com.hotel.tp_reservation_grpc.stubs.Utilisateur)) {
      return super.equals(obj);
    }
    com.hotel.tp_reservation_grpc.stubs.Utilisateur other = (com.hotel.tp_reservation_grpc.stubs.Utilisateur) obj;

    if (getId()
        != other.getId()) return false;
    if (!getNom()
        .equals(other.getNom())) return false;
    if (!getMotDePasse()
        .equals(other.getMotDePasse())) return false;
    if (role_ != other.role_) return false;
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
    hash = (37 * hash) + NOM_FIELD_NUMBER;
    hash = (53 * hash) + getNom().hashCode();
    hash = (37 * hash) + MOTDEPASSE_FIELD_NUMBER;
    hash = (53 * hash) + getMotDePasse().hashCode();
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur parseFrom(
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
  public static Builder newBuilder(com.hotel.tp_reservation_grpc.stubs.Utilisateur prototype) {
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
   * Protobuf type {@code Utilisateur}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Utilisateur)
      com.hotel.tp_reservation_grpc.stubs.UtilisateurOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_Utilisateur_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_Utilisateur_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hotel.tp_reservation_grpc.stubs.Utilisateur.class, com.hotel.tp_reservation_grpc.stubs.Utilisateur.Builder.class);
    }

    // Construct using com.hotel.tp_reservation_grpc.stubs.Utilisateur.newBuilder()
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

      nom_ = "";

      motDePasse_ = "";

      role_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hotel.tp_reservation_grpc.stubs.UtilisateurProto.internal_static_Utilisateur_descriptor;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.Utilisateur getDefaultInstanceForType() {
      return com.hotel.tp_reservation_grpc.stubs.Utilisateur.getDefaultInstance();
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.Utilisateur build() {
      com.hotel.tp_reservation_grpc.stubs.Utilisateur result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hotel.tp_reservation_grpc.stubs.Utilisateur buildPartial() {
      com.hotel.tp_reservation_grpc.stubs.Utilisateur result = new com.hotel.tp_reservation_grpc.stubs.Utilisateur(this);
      result.id_ = id_;
      result.nom_ = nom_;
      result.motDePasse_ = motDePasse_;
      result.role_ = role_;
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
      if (other instanceof com.hotel.tp_reservation_grpc.stubs.Utilisateur) {
        return mergeFrom((com.hotel.tp_reservation_grpc.stubs.Utilisateur)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hotel.tp_reservation_grpc.stubs.Utilisateur other) {
      if (other == com.hotel.tp_reservation_grpc.stubs.Utilisateur.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getNom().isEmpty()) {
        nom_ = other.nom_;
        onChanged();
      }
      if (!other.getMotDePasse().isEmpty()) {
        motDePasse_ = other.motDePasse_;
        onChanged();
      }
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
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
      com.hotel.tp_reservation_grpc.stubs.Utilisateur parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hotel.tp_reservation_grpc.stubs.Utilisateur) e.getUnfinishedMessage();
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

    private java.lang.Object nom_ = "";
    /**
     * <code>string nom = 2;</code>
     * @return The nom.
     */
    public java.lang.String getNom() {
      java.lang.Object ref = nom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string nom = 2;</code>
     * @return The bytes for nom.
     */
    public com.google.protobuf.ByteString
        getNomBytes() {
      java.lang.Object ref = nom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nom = 2;</code>
     * @param value The nom to set.
     * @return This builder for chaining.
     */
    public Builder setNom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nom_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string nom = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNom() {
      
      nom_ = getDefaultInstance().getNom();
      onChanged();
      return this;
    }
    /**
     * <code>string nom = 2;</code>
     * @param value The bytes for nom to set.
     * @return This builder for chaining.
     */
    public Builder setNomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nom_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object motDePasse_ = "";
    /**
     * <code>string motDePasse = 3;</code>
     * @return The motDePasse.
     */
    public java.lang.String getMotDePasse() {
      java.lang.Object ref = motDePasse_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        motDePasse_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string motDePasse = 3;</code>
     * @return The bytes for motDePasse.
     */
    public com.google.protobuf.ByteString
        getMotDePasseBytes() {
      java.lang.Object ref = motDePasse_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        motDePasse_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string motDePasse = 3;</code>
     * @param value The motDePasse to set.
     * @return This builder for chaining.
     */
    public Builder setMotDePasse(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      motDePasse_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string motDePasse = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMotDePasse() {
      
      motDePasse_ = getDefaultInstance().getMotDePasse();
      onChanged();
      return this;
    }
    /**
     * <code>string motDePasse = 3;</code>
     * @param value The bytes for motDePasse to set.
     * @return This builder for chaining.
     */
    public Builder setMotDePasseBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      motDePasse_ = value;
      onChanged();
      return this;
    }

    private int role_ = 0;
    /**
     * <code>.Role role = 4;</code>
     * @return The enum numeric value on the wire for role.
     */
    public int getRoleValue() {
      return role_;
    }
    /**
     * <code>.Role role = 4;</code>
     * @param value The enum numeric value on the wire for role to set.
     * @return This builder for chaining.
     */
    public Builder setRoleValue(int value) {
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Role role = 4;</code>
     * @return The role.
     */
    public com.hotel.tp_reservation_grpc.stubs.Role getRole() {
      @SuppressWarnings("deprecation")
      com.hotel.tp_reservation_grpc.stubs.Role result = com.hotel.tp_reservation_grpc.stubs.Role.valueOf(role_);
      return result == null ? com.hotel.tp_reservation_grpc.stubs.Role.UNRECOGNIZED : result;
    }
    /**
     * <code>.Role role = 4;</code>
     * @param value The role to set.
     * @return This builder for chaining.
     */
    public Builder setRole(com.hotel.tp_reservation_grpc.stubs.Role value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Role role = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRole() {
      
      role_ = 0;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:Utilisateur)
  }

  // @@protoc_insertion_point(class_scope:Utilisateur)
  private static final com.hotel.tp_reservation_grpc.stubs.Utilisateur DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hotel.tp_reservation_grpc.stubs.Utilisateur();
  }

  public static com.hotel.tp_reservation_grpc.stubs.Utilisateur getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Utilisateur>
      PARSER = new com.google.protobuf.AbstractParser<Utilisateur>() {
    @java.lang.Override
    public Utilisateur parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Utilisateur(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Utilisateur> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Utilisateur> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hotel.tp_reservation_grpc.stubs.Utilisateur getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
