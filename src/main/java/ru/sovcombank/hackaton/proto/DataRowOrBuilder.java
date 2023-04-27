// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataRow.proto

package ru.sovcombank.hackaton.proto;

public interface DataRowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ru.sovcombank.hackaton.proto.DataRow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Идентификатор записи
   * </pre>
   *
   * <code>string rowIdent = 1;</code>
   * @return The rowIdent.
   */
  java.lang.String getRowIdent();
  /**
   * <pre>
   * Идентификатор записи
   * </pre>
   *
   * <code>string rowIdent = 1;</code>
   * @return The bytes for rowIdent.
   */
  com.google.protobuf.ByteString
      getRowIdentBytes();

  /**
   * <pre>
   * Инкрементальное удаление записи (Удаление записи при инкрементальной передаче данных)
   * </pre>
   *
   * <code>bool incrementDelete = 2;</code>
   * @return The incrementDelete.
   */
  boolean getIncrementDelete();

  /**
   * <pre>
   * Описание значения поля
   * </pre>
   *
   * <code>repeated .ru.sovcombank.hackaton.proto.ValueRef values = 3;</code>
   */
  java.util.List<ru.sovcombank.hackaton.proto.ValueRef> 
      getValuesList();
  /**
   * <pre>
   * Описание значения поля
   * </pre>
   *
   * <code>repeated .ru.sovcombank.hackaton.proto.ValueRef values = 3;</code>
   */
  ru.sovcombank.hackaton.proto.ValueRef getValues(int index);
  /**
   * <pre>
   * Описание значения поля
   * </pre>
   *
   * <code>repeated .ru.sovcombank.hackaton.proto.ValueRef values = 3;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * Описание значения поля
   * </pre>
   *
   * <code>repeated .ru.sovcombank.hackaton.proto.ValueRef values = 3;</code>
   */
  java.util.List<? extends ru.sovcombank.hackaton.proto.ValueRefOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   * Описание значения поля
   * </pre>
   *
   * <code>repeated .ru.sovcombank.hackaton.proto.ValueRef values = 3;</code>
   */
  ru.sovcombank.hackaton.proto.ValueRefOrBuilder getValuesOrBuilder(
      int index);
}
