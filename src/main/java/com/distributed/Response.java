// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.distributed;

/**
 * Protobuf type {@code Response}
 */
public  final class Response extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Response)
    ResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Response.newBuilder() to construct.
  private Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Response() {
    processedWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    vectorClock_ = emptyIntList();
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
  private Response(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              processedWords_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            processedWords_.add(s);
            break;
          }
          case 16: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              vectorClock_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            vectorClock_.addInt(input.readInt32());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              vectorClock_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              vectorClock_.addInt(input.readInt32());
            }
            input.popLimit(limit);
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
        processedWords_ = processedWords_.getUnmodifiableView();
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        vectorClock_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.distributed.MessageOuterClass.internal_static_Response_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.distributed.MessageOuterClass.internal_static_Response_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.distributed.Response.class, com.distributed.Response.Builder.class);
  }

  public static final int PROCESSEDWORDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList processedWords_;
  /**
   * <pre>
   * List of processed words
   * </pre>
   *
   * <code>repeated string processedWords = 1;</code>
   * @return A list containing the processedWords.
   */
  public com.google.protobuf.ProtocolStringList
      getProcessedWordsList() {
    return processedWords_;
  }
  /**
   * <pre>
   * List of processed words
   * </pre>
   *
   * <code>repeated string processedWords = 1;</code>
   * @return The count of processedWords.
   */
  public int getProcessedWordsCount() {
    return processedWords_.size();
  }
  /**
   * <pre>
   * List of processed words
   * </pre>
   *
   * <code>repeated string processedWords = 1;</code>
   * @param index The index of the element to return.
   * @return The processedWords at the given index.
   */
  public java.lang.String getProcessedWords(int index) {
    return processedWords_.get(index);
  }
  /**
   * <pre>
   * List of processed words
   * </pre>
   *
   * <code>repeated string processedWords = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the processedWords at the given index.
   */
  public com.google.protobuf.ByteString
      getProcessedWordsBytes(int index) {
    return processedWords_.getByteString(index);
  }

  public static final int VECTORCLOCK_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.IntList vectorClock_;
  /**
   * <pre>
   * Updated vector clock
   * </pre>
   *
   * <code>repeated int32 vectorClock = 2;</code>
   * @return A list containing the vectorClock.
   */
  public java.util.List<java.lang.Integer>
      getVectorClockList() {
    return vectorClock_;
  }
  /**
   * <pre>
   * Updated vector clock
   * </pre>
   *
   * <code>repeated int32 vectorClock = 2;</code>
   * @return The count of vectorClock.
   */
  public int getVectorClockCount() {
    return vectorClock_.size();
  }
  /**
   * <pre>
   * Updated vector clock
   * </pre>
   *
   * <code>repeated int32 vectorClock = 2;</code>
   * @param index The index of the element to return.
   * @return The vectorClock at the given index.
   */
  public int getVectorClock(int index) {
    return vectorClock_.getInt(index);
  }
  private int vectorClockMemoizedSerializedSize = -1;

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
    getSerializedSize();
    for (int i = 0; i < processedWords_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, processedWords_.getRaw(i));
    }
    if (getVectorClockList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(vectorClockMemoizedSerializedSize);
    }
    for (int i = 0; i < vectorClock_.size(); i++) {
      output.writeInt32NoTag(vectorClock_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < processedWords_.size(); i++) {
        dataSize += computeStringSizeNoTag(processedWords_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getProcessedWordsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < vectorClock_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(vectorClock_.getInt(i));
      }
      size += dataSize;
      if (!getVectorClockList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      vectorClockMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.distributed.Response)) {
      return super.equals(obj);
    }
    com.distributed.Response other = (com.distributed.Response) obj;

    if (!getProcessedWordsList()
        .equals(other.getProcessedWordsList())) return false;
    if (!getVectorClockList()
        .equals(other.getVectorClockList())) return false;
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
    if (getProcessedWordsCount() > 0) {
      hash = (37 * hash) + PROCESSEDWORDS_FIELD_NUMBER;
      hash = (53 * hash) + getProcessedWordsList().hashCode();
    }
    if (getVectorClockCount() > 0) {
      hash = (37 * hash) + VECTORCLOCK_FIELD_NUMBER;
      hash = (53 * hash) + getVectorClockList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.distributed.Response parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.distributed.Response parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.distributed.Response parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.distributed.Response parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.distributed.Response parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.distributed.Response parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.distributed.Response parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.distributed.Response parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.distributed.Response parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.distributed.Response parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.distributed.Response parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.distributed.Response parseFrom(
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
  public static Builder newBuilder(com.distributed.Response prototype) {
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
   * Protobuf type {@code Response}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Response)
      com.distributed.ResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.distributed.MessageOuterClass.internal_static_Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.distributed.MessageOuterClass.internal_static_Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.distributed.Response.class, com.distributed.Response.Builder.class);
    }

    // Construct using com.distributed.Response.newBuilder()
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
      processedWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      vectorClock_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.distributed.MessageOuterClass.internal_static_Response_descriptor;
    }

    @java.lang.Override
    public com.distributed.Response getDefaultInstanceForType() {
      return com.distributed.Response.getDefaultInstance();
    }

    @java.lang.Override
    public com.distributed.Response build() {
      com.distributed.Response result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.distributed.Response buildPartial() {
      com.distributed.Response result = new com.distributed.Response(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        processedWords_ = processedWords_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.processedWords_ = processedWords_;
      if (((bitField0_ & 0x00000002) != 0)) {
        vectorClock_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.vectorClock_ = vectorClock_;
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
      if (other instanceof com.distributed.Response) {
        return mergeFrom((com.distributed.Response)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.distributed.Response other) {
      if (other == com.distributed.Response.getDefaultInstance()) return this;
      if (!other.processedWords_.isEmpty()) {
        if (processedWords_.isEmpty()) {
          processedWords_ = other.processedWords_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureProcessedWordsIsMutable();
          processedWords_.addAll(other.processedWords_);
        }
        onChanged();
      }
      if (!other.vectorClock_.isEmpty()) {
        if (vectorClock_.isEmpty()) {
          vectorClock_ = other.vectorClock_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureVectorClockIsMutable();
          vectorClock_.addAll(other.vectorClock_);
        }
        onChanged();
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
      com.distributed.Response parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.distributed.Response) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList processedWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureProcessedWordsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        processedWords_ = new com.google.protobuf.LazyStringArrayList(processedWords_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * List of processed words
     * </pre>
     *
     * <code>repeated string processedWords = 1;</code>
     * @return A list containing the processedWords.
     */
    public com.google.protobuf.ProtocolStringList
        getProcessedWordsList() {
      return processedWords_.getUnmodifiableView();
    }
    /**
     * <pre>
     * List of processed words
     * </pre>
     *
     * <code>repeated string processedWords = 1;</code>
     * @return The count of processedWords.
     */
    public int getProcessedWordsCount() {
      return processedWords_.size();
    }
    /**
     * <pre>
     * List of processed words
     * </pre>
     *
     * <code>repeated string processedWords = 1;</code>
     * @param index The index of the element to return.
     * @return The processedWords at the given index.
     */
    public java.lang.String getProcessedWords(int index) {
      return processedWords_.get(index);
    }
    /**
     * <pre>
     * List of processed words
     * </pre>
     *
     * <code>repeated string processedWords = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the processedWords at the given index.
     */
    public com.google.protobuf.ByteString
        getProcessedWordsBytes(int index) {
      return processedWords_.getByteString(index);
    }
    /**
     * <pre>
     * List of processed words
     * </pre>
     *
     * <code>repeated string processedWords = 1;</code>
     * @param index The index to set the value at.
     * @param value The processedWords to set.
     * @return This builder for chaining.
     */
    public Builder setProcessedWords(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProcessedWordsIsMutable();
      processedWords_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of processed words
     * </pre>
     *
     * <code>repeated string processedWords = 1;</code>
     * @param value The processedWords to add.
     * @return This builder for chaining.
     */
    public Builder addProcessedWords(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureProcessedWordsIsMutable();
      processedWords_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of processed words
     * </pre>
     *
     * <code>repeated string processedWords = 1;</code>
     * @param values The processedWords to add.
     * @return This builder for chaining.
     */
    public Builder addAllProcessedWords(
        java.lang.Iterable<java.lang.String> values) {
      ensureProcessedWordsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, processedWords_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of processed words
     * </pre>
     *
     * <code>repeated string processedWords = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearProcessedWords() {
      processedWords_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * List of processed words
     * </pre>
     *
     * <code>repeated string processedWords = 1;</code>
     * @param value The bytes of the processedWords to add.
     * @return This builder for chaining.
     */
    public Builder addProcessedWordsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureProcessedWordsIsMutable();
      processedWords_.add(value);
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList vectorClock_ = emptyIntList();
    private void ensureVectorClockIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        vectorClock_ = mutableCopy(vectorClock_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     * Updated vector clock
     * </pre>
     *
     * <code>repeated int32 vectorClock = 2;</code>
     * @return A list containing the vectorClock.
     */
    public java.util.List<java.lang.Integer>
        getVectorClockList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(vectorClock_) : vectorClock_;
    }
    /**
     * <pre>
     * Updated vector clock
     * </pre>
     *
     * <code>repeated int32 vectorClock = 2;</code>
     * @return The count of vectorClock.
     */
    public int getVectorClockCount() {
      return vectorClock_.size();
    }
    /**
     * <pre>
     * Updated vector clock
     * </pre>
     *
     * <code>repeated int32 vectorClock = 2;</code>
     * @param index The index of the element to return.
     * @return The vectorClock at the given index.
     */
    public int getVectorClock(int index) {
      return vectorClock_.getInt(index);
    }
    /**
     * <pre>
     * Updated vector clock
     * </pre>
     *
     * <code>repeated int32 vectorClock = 2;</code>
     * @param index The index to set the value at.
     * @param value The vectorClock to set.
     * @return This builder for chaining.
     */
    public Builder setVectorClock(
        int index, int value) {
      ensureVectorClockIsMutable();
      vectorClock_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Updated vector clock
     * </pre>
     *
     * <code>repeated int32 vectorClock = 2;</code>
     * @param value The vectorClock to add.
     * @return This builder for chaining.
     */
    public Builder addVectorClock(int value) {
      ensureVectorClockIsMutable();
      vectorClock_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Updated vector clock
     * </pre>
     *
     * <code>repeated int32 vectorClock = 2;</code>
     * @param values The vectorClock to add.
     * @return This builder for chaining.
     */
    public Builder addAllVectorClock(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureVectorClockIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, vectorClock_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Updated vector clock
     * </pre>
     *
     * <code>repeated int32 vectorClock = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVectorClock() {
      vectorClock_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:Response)
  }

  // @@protoc_insertion_point(class_scope:Response)
  private static final com.distributed.Response DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.distributed.Response();
  }

  public static com.distributed.Response getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Response>
      PARSER = new com.google.protobuf.AbstractParser<Response>() {
    @java.lang.Override
    public Response parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Response(input, extensionRegistry);
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
  public com.distributed.Response getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
