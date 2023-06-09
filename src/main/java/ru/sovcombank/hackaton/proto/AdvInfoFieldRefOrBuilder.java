// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdvInfoFieldRef.proto

package ru.sovcombank.hackaton.proto;

public interface AdvInfoFieldRefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ru.sovcombank.hackaton.proto.AdvInfoFieldRef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Идентификатор поля
   * </pre>
   *
   * <code>string alias = 1;</code>
   * @return The alias.
   */
  java.lang.String getAlias();
  /**
   * <pre>
   * Идентификатор поля
   * </pre>
   *
   * <code>string alias = 1;</code>
   * @return The bytes for alias.
   */
  com.google.protobuf.ByteString
      getAliasBytes();

  /**
   * <pre>
   * Заголовок поля
   * </pre>
   *
   * <code>optional string caption = 2;</code>
   * @return Whether the caption field is set.
   */
  boolean hasCaption();
  /**
   * <pre>
   * Заголовок поля
   * </pre>
   *
   * <code>optional string caption = 2;</code>
   * @return The caption.
   */
  java.lang.String getCaption();
  /**
   * <pre>
   * Заголовок поля
   * </pre>
   *
   * <code>optional string caption = 2;</code>
   * @return The bytes for caption.
   */
  com.google.protobuf.ByteString
      getCaptionBytes();

  /**
   * <pre>
   * Тип данных поля
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.DataType dataType = 3;</code>
   * @return The enum numeric value on the wire for dataType.
   */
  int getDataTypeValue();
  /**
   * <pre>
   * Тип данных поля
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.DataType dataType = 3;</code>
   * @return The dataType.
   */
  ru.sovcombank.hackaton.proto.MessageEnumsProto.DataType getDataType();
}
