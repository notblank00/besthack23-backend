// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Response.proto

package ru.sovcombank.hackaton.proto;

/**
 * Protobuf type {@code ru.sovcombank.hackaton.proto.Response}
 */
public final class Response extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ru.sovcombank.hackaton.proto.Response)
    ResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Response.newBuilder() to construct.
  private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Response() {
    command_ = 0;
    answerType_ = 0;
    errorText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Response();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return ru.sovcombank.hackaton.proto.ResponseProto.internal_static_ru_sovcombank_hackaton_proto_Response_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return ru.sovcombank.hackaton.proto.ResponseProto.internal_static_ru_sovcombank_hackaton_proto_Response_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ru.sovcombank.hackaton.proto.Response.class, ru.sovcombank.hackaton.proto.Response.Builder.class);
  }

  private int bitField0_;
  public static final int COMMAND_FIELD_NUMBER = 1;
  private int command_ = 0;
  /**
   * <pre>
   * Тип команды на которую отвечаем. (ctHandshake - ответ на приветствие, ctExecCommand - ответ на исполнение команды, ctStatus - ответ на запрос статуса сервиса.)
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.CommandType command = 1;</code>
   * @return The enum numeric value on the wire for command.
   */
  @java.lang.Override public int getCommandValue() {
    return command_;
  }
  /**
   * <pre>
   * Тип команды на которую отвечаем. (ctHandshake - ответ на приветствие, ctExecCommand - ответ на исполнение команды, ctStatus - ответ на запрос статуса сервиса.)
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.CommandType command = 1;</code>
   * @return The command.
   */
  @java.lang.Override public ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType getCommand() {
    ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType result = ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType.forNumber(command_);
    return result == null ? ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType.UNRECOGNIZED : result;
  }

  public static final int ANSWERTYPE_FIELD_NUMBER = 2;
  private int answerType_ = 0;
  /**
   * <pre>
   * Тип ответа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.AnswerType answerType = 2;</code>
   * @return The enum numeric value on the wire for answerType.
   */
  @java.lang.Override public int getAnswerTypeValue() {
    return answerType_;
  }
  /**
   * <pre>
   * Тип ответа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.AnswerType answerType = 2;</code>
   * @return The answerType.
   */
  @java.lang.Override public ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType getAnswerType() {
    ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType result = ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType.forNumber(answerType_);
    return result == null ? ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType.UNRECOGNIZED : result;
  }

  public static final int ERRORTEXT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object errorText_ = "";
  /**
   * <pre>
   * Описание ошибки в случае если тип ответа atNotSupported или atAnswerError
   * </pre>
   *
   * <code>optional string errorText = 3;</code>
   * @return Whether the errorText field is set.
   */
  @java.lang.Override
  public boolean hasErrorText() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Описание ошибки в случае если тип ответа atNotSupported или atAnswerError
   * </pre>
   *
   * <code>optional string errorText = 3;</code>
   * @return The errorText.
   */
  @java.lang.Override
  public java.lang.String getErrorText() {
    java.lang.Object ref = errorText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Описание ошибки в случае если тип ответа atNotSupported или atAnswerError
   * </pre>
   *
   * <code>optional string errorText = 3;</code>
   * @return The bytes for errorText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getErrorTextBytes() {
    java.lang.Object ref = errorText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private ru.sovcombank.hackaton.proto.Status status_;
  /**
   * <pre>
   * Статус
   * </pre>
   *
   * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
   * @return Whether the status field is set.
   */
  @java.lang.Override
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Статус
   * </pre>
   *
   * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
   * @return The status.
   */
  @java.lang.Override
  public ru.sovcombank.hackaton.proto.Status getStatus() {
    return status_ == null ? ru.sovcombank.hackaton.proto.Status.getDefaultInstance() : status_;
  }
  /**
   * <pre>
   * Статус
   * </pre>
   *
   * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
   */
  @java.lang.Override
  public ru.sovcombank.hackaton.proto.StatusOrBuilder getStatusOrBuilder() {
    return status_ == null ? ru.sovcombank.hackaton.proto.Status.getDefaultInstance() : status_;
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
    if (command_ != ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType.ctHandshake.getNumber()) {
      output.writeEnum(1, command_);
    }
    if (answerType_ != ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType.atNotSupported.getNumber()) {
      output.writeEnum(2, answerType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorText_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(4, getStatus());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (command_ != ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType.ctHandshake.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, command_);
    }
    if (answerType_ != ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType.atNotSupported.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, answerType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, errorText_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getStatus());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ru.sovcombank.hackaton.proto.Response)) {
      return super.equals(obj);
    }
    ru.sovcombank.hackaton.proto.Response other = (ru.sovcombank.hackaton.proto.Response) obj;

    if (command_ != other.command_) return false;
    if (answerType_ != other.answerType_) return false;
    if (hasErrorText() != other.hasErrorText()) return false;
    if (hasErrorText()) {
      if (!getErrorText()
          .equals(other.getErrorText())) return false;
    }
    if (hasStatus() != other.hasStatus()) return false;
    if (hasStatus()) {
      if (!getStatus()
          .equals(other.getStatus())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COMMAND_FIELD_NUMBER;
    hash = (53 * hash) + command_;
    hash = (37 * hash) + ANSWERTYPE_FIELD_NUMBER;
    hash = (53 * hash) + answerType_;
    if (hasErrorText()) {
      hash = (37 * hash) + ERRORTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getErrorText().hashCode();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ru.sovcombank.hackaton.proto.Response parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.sovcombank.hackaton.proto.Response parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.sovcombank.hackaton.proto.Response parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.sovcombank.hackaton.proto.Response parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.sovcombank.hackaton.proto.Response parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ru.sovcombank.hackaton.proto.Response parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ru.sovcombank.hackaton.proto.Response parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.sovcombank.hackaton.proto.Response parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.sovcombank.hackaton.proto.Response parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ru.sovcombank.hackaton.proto.Response parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ru.sovcombank.hackaton.proto.Response parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ru.sovcombank.hackaton.proto.Response parseFrom(
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
  public static Builder newBuilder(ru.sovcombank.hackaton.proto.Response prototype) {
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
   * Protobuf type {@code ru.sovcombank.hackaton.proto.Response}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ru.sovcombank.hackaton.proto.Response)
      ru.sovcombank.hackaton.proto.ResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ru.sovcombank.hackaton.proto.ResponseProto.internal_static_ru_sovcombank_hackaton_proto_Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ru.sovcombank.hackaton.proto.ResponseProto.internal_static_ru_sovcombank_hackaton_proto_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ru.sovcombank.hackaton.proto.Response.class, ru.sovcombank.hackaton.proto.Response.Builder.class);
    }

    // Construct using ru.sovcombank.hackaton.proto.Response.newBuilder()
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
        getStatusFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      command_ = 0;
      answerType_ = 0;
      errorText_ = "";
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return ru.sovcombank.hackaton.proto.ResponseProto.internal_static_ru_sovcombank_hackaton_proto_Response_descriptor;
    }

    @java.lang.Override
    public ru.sovcombank.hackaton.proto.Response getDefaultInstanceForType() {
      return ru.sovcombank.hackaton.proto.Response.getDefaultInstance();
    }

    @java.lang.Override
    public ru.sovcombank.hackaton.proto.Response build() {
      ru.sovcombank.hackaton.proto.Response result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public ru.sovcombank.hackaton.proto.Response buildPartial() {
      ru.sovcombank.hackaton.proto.Response result = new ru.sovcombank.hackaton.proto.Response(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(ru.sovcombank.hackaton.proto.Response result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.command_ = command_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.answerType_ = answerType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.errorText_ = errorText_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.status_ = statusBuilder_ == null
            ? status_
            : statusBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof ru.sovcombank.hackaton.proto.Response) {
        return mergeFrom((ru.sovcombank.hackaton.proto.Response)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ru.sovcombank.hackaton.proto.Response other) {
      if (other == ru.sovcombank.hackaton.proto.Response.getDefaultInstance()) return this;
      if (other.command_ != 0) {
        setCommandValue(other.getCommandValue());
      }
      if (other.answerType_ != 0) {
        setAnswerTypeValue(other.getAnswerTypeValue());
      }
      if (other.hasErrorText()) {
        errorText_ = other.errorText_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasStatus()) {
        mergeStatus(other.getStatus());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              command_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              answerType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              errorText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getStatusFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int command_ = 0;
    /**
     * <pre>
     * Тип команды на которую отвечаем. (ctHandshake - ответ на приветствие, ctExecCommand - ответ на исполнение команды, ctStatus - ответ на запрос статуса сервиса.)
     * </pre>
     *
     * <code>.ru.sovcombank.hackaton.proto.CommandType command = 1;</code>
     * @return The enum numeric value on the wire for command.
     */
    @java.lang.Override public int getCommandValue() {
      return command_;
    }
    /**
     * <pre>
     * Тип команды на которую отвечаем. (ctHandshake - ответ на приветствие, ctExecCommand - ответ на исполнение команды, ctStatus - ответ на запрос статуса сервиса.)
     * </pre>
     *
     * <code>.ru.sovcombank.hackaton.proto.CommandType command = 1;</code>
     * @param value The enum numeric value on the wire for command to set.
     * @return This builder for chaining.
     */
    public Builder setCommandValue(int value) {
      command_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Тип команды на которую отвечаем. (ctHandshake - ответ на приветствие, ctExecCommand - ответ на исполнение команды, ctStatus - ответ на запрос статуса сервиса.)
     * </pre>
     *
     * <code>.ru.sovcombank.hackaton.proto.CommandType command = 1;</code>
     * @return The command.
     */
    @java.lang.Override
    public ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType getCommand() {
      ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType result = ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType.forNumber(command_);
      return result == null ? ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Тип команды на которую отвечаем. (ctHandshake - ответ на приветствие, ctExecCommand - ответ на исполнение команды, ctStatus - ответ на запрос статуса сервиса.)
     * </pre>
     *
     * <code>.ru.sovcombank.hackaton.proto.CommandType command = 1;</code>
     * @param value The command to set.
     * @return This builder for chaining.
     */
    public Builder setCommand(ru.sovcombank.hackaton.proto.MessageEnumsProto.CommandType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      command_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Тип команды на которую отвечаем. (ctHandshake - ответ на приветствие, ctExecCommand - ответ на исполнение команды, ctStatus - ответ на запрос статуса сервиса.)
     * </pre>
     *
     * <code>.ru.sovcombank.hackaton.proto.CommandType command = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommand() {
      bitField0_ = (bitField0_ & ~0x00000001);
      command_ = 0;
      onChanged();
      return this;
    }

    private int answerType_ = 0;
    /**
     * <pre>
     * Тип ответа
     * </pre>
     *
     * <code>.ru.sovcombank.hackaton.proto.AnswerType answerType = 2;</code>
     * @return The enum numeric value on the wire for answerType.
     */
    @java.lang.Override public int getAnswerTypeValue() {
      return answerType_;
    }
    /**
     * <pre>
     * Тип ответа
     * </pre>
     *
     * <code>.ru.sovcombank.hackaton.proto.AnswerType answerType = 2;</code>
     * @param value The enum numeric value on the wire for answerType to set.
     * @return This builder for chaining.
     */
    public Builder setAnswerTypeValue(int value) {
      answerType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Тип ответа
     * </pre>
     *
     * <code>.ru.sovcombank.hackaton.proto.AnswerType answerType = 2;</code>
     * @return The answerType.
     */
    @java.lang.Override
    public ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType getAnswerType() {
      ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType result = ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType.forNumber(answerType_);
      return result == null ? ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Тип ответа
     * </pre>
     *
     * <code>.ru.sovcombank.hackaton.proto.AnswerType answerType = 2;</code>
     * @param value The answerType to set.
     * @return This builder for chaining.
     */
    public Builder setAnswerType(ru.sovcombank.hackaton.proto.MessageEnumsProto.AnswerType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      answerType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Тип ответа
     * </pre>
     *
     * <code>.ru.sovcombank.hackaton.proto.AnswerType answerType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAnswerType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      answerType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object errorText_ = "";
    /**
     * <pre>
     * Описание ошибки в случае если тип ответа atNotSupported или atAnswerError
     * </pre>
     *
     * <code>optional string errorText = 3;</code>
     * @return Whether the errorText field is set.
     */
    public boolean hasErrorText() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Описание ошибки в случае если тип ответа atNotSupported или atAnswerError
     * </pre>
     *
     * <code>optional string errorText = 3;</code>
     * @return The errorText.
     */
    public java.lang.String getErrorText() {
      java.lang.Object ref = errorText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Описание ошибки в случае если тип ответа atNotSupported или atAnswerError
     * </pre>
     *
     * <code>optional string errorText = 3;</code>
     * @return The bytes for errorText.
     */
    public com.google.protobuf.ByteString
        getErrorTextBytes() {
      java.lang.Object ref = errorText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Описание ошибки в случае если тип ответа atNotSupported или atAnswerError
     * </pre>
     *
     * <code>optional string errorText = 3;</code>
     * @param value The errorText to set.
     * @return This builder for chaining.
     */
    public Builder setErrorText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      errorText_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Описание ошибки в случае если тип ответа atNotSupported или atAnswerError
     * </pre>
     *
     * <code>optional string errorText = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearErrorText() {
      errorText_ = getDefaultInstance().getErrorText();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Описание ошибки в случае если тип ответа atNotSupported или atAnswerError
     * </pre>
     *
     * <code>optional string errorText = 3;</code>
     * @param value The bytes for errorText to set.
     * @return This builder for chaining.
     */
    public Builder setErrorTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      errorText_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private ru.sovcombank.hackaton.proto.Status status_;
    private com.google.protobuf.SingleFieldBuilderV3<
        ru.sovcombank.hackaton.proto.Status, ru.sovcombank.hackaton.proto.Status.Builder, ru.sovcombank.hackaton.proto.StatusOrBuilder> statusBuilder_;
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
     * @return Whether the status field is set.
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
     * @return The status.
     */
    public ru.sovcombank.hackaton.proto.Status getStatus() {
      if (statusBuilder_ == null) {
        return status_ == null ? ru.sovcombank.hackaton.proto.Status.getDefaultInstance() : status_;
      } else {
        return statusBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
     */
    public Builder setStatus(ru.sovcombank.hackaton.proto.Status value) {
      if (statusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        status_ = value;
      } else {
        statusBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
     */
    public Builder setStatus(
        ru.sovcombank.hackaton.proto.Status.Builder builderForValue) {
      if (statusBuilder_ == null) {
        status_ = builderForValue.build();
      } else {
        statusBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
     */
    public Builder mergeStatus(ru.sovcombank.hackaton.proto.Status value) {
      if (statusBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          status_ != null &&
          status_ != ru.sovcombank.hackaton.proto.Status.getDefaultInstance()) {
          getStatusBuilder().mergeFrom(value);
        } else {
          status_ = value;
        }
      } else {
        statusBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000008);
      status_ = null;
      if (statusBuilder_ != null) {
        statusBuilder_.dispose();
        statusBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
     */
    public ru.sovcombank.hackaton.proto.Status.Builder getStatusBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getStatusFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
     */
    public ru.sovcombank.hackaton.proto.StatusOrBuilder getStatusOrBuilder() {
      if (statusBuilder_ != null) {
        return statusBuilder_.getMessageOrBuilder();
      } else {
        return status_ == null ?
            ru.sovcombank.hackaton.proto.Status.getDefaultInstance() : status_;
      }
    }
    /**
     * <pre>
     * Статус
     * </pre>
     *
     * <code>optional .ru.sovcombank.hackaton.proto.Status status = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        ru.sovcombank.hackaton.proto.Status, ru.sovcombank.hackaton.proto.Status.Builder, ru.sovcombank.hackaton.proto.StatusOrBuilder> 
        getStatusFieldBuilder() {
      if (statusBuilder_ == null) {
        statusBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            ru.sovcombank.hackaton.proto.Status, ru.sovcombank.hackaton.proto.Status.Builder, ru.sovcombank.hackaton.proto.StatusOrBuilder>(
                getStatus(),
                getParentForChildren(),
                isClean());
        status_ = null;
      }
      return statusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ru.sovcombank.hackaton.proto.Response)
  }

  // @@protoc_insertion_point(class_scope:ru.sovcombank.hackaton.proto.Response)
  private static final ru.sovcombank.hackaton.proto.Response DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ru.sovcombank.hackaton.proto.Response();
  }

  public static ru.sovcombank.hackaton.proto.Response getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Response>
      PARSER = new com.google.protobuf.AbstractParser<Response>() {
    @java.lang.Override
    public Response parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Response> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Response> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public ru.sovcombank.hackaton.proto.Response getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

