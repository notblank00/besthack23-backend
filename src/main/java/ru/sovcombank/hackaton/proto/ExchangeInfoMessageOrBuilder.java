// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ExchangeInfoMessage.proto

package ru.sovcombank.hackaton.proto;

public interface ExchangeInfoMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ru.sovcombank.hackaton.proto.ExchangeInfoMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Тело заголовка документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   * Тело заголовка документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Header header = 1;</code>
   * @return The header.
   */
  ru.sovcombank.hackaton.proto.Header getHeader();
  /**
   * <pre>
   * Тело заголовка документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Header header = 1;</code>
   */
  ru.sovcombank.hackaton.proto.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   * Тело запроса документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Request request = 2;</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * Тело запроса документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Request request = 2;</code>
   * @return The request.
   */
  ru.sovcombank.hackaton.proto.Request getRequest();
  /**
   * <pre>
   * Тело запроса документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Request request = 2;</code>
   */
  ru.sovcombank.hackaton.proto.RequestOrBuilder getRequestOrBuilder();

  /**
   * <pre>
   * Тело ответа документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Response response = 3;</code>
   * @return Whether the response field is set.
   */
  boolean hasResponse();
  /**
   * <pre>
   * Тело ответа документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Response response = 3;</code>
   * @return The response.
   */
  ru.sovcombank.hackaton.proto.Response getResponse();
  /**
   * <pre>
   * Тело ответа документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Response response = 3;</code>
   */
  ru.sovcombank.hackaton.proto.ResponseOrBuilder getResponseOrBuilder();

  /**
   * <pre>
   * Тело события документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Event event = 4;</code>
   * @return Whether the event field is set.
   */
  boolean hasEvent();
  /**
   * <pre>
   * Тело события документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Event event = 4;</code>
   * @return The event.
   */
  ru.sovcombank.hackaton.proto.Event getEvent();
  /**
   * <pre>
   * Тело события документа
   * </pre>
   *
   * <code>.ru.sovcombank.hackaton.proto.Event event = 4;</code>
   */
  ru.sovcombank.hackaton.proto.EventOrBuilder getEventOrBuilder();

  public ru.sovcombank.hackaton.proto.ExchangeInfoMessage.BodyCase getBodyCase();
}
