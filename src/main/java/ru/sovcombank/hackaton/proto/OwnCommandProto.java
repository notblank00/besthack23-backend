// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: OwnCommand.proto

package ru.sovcombank.hackaton.proto;

public final class OwnCommandProto {
  private OwnCommandProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ru_sovcombank_hackaton_proto_OwnCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ru_sovcombank_hackaton_proto_OwnCommand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020OwnCommand.proto\022\034ru.sovcombank.hackat" +
      "on.proto\032\017Parameter.proto\"\244\001\n\nOwnCommand" +
      "\022\r\n\005alias\030\001 \001(\t\022\024\n\007caption\030\002 \001(\tH\000\210\001\001\022\030\n" +
      "\013description\030\003 \001(\tH\001\210\001\001\022;\n\nparameters\030\004 " +
      "\003(\0132\'.ru.sovcombank.hackaton.proto.Param" +
      "eterB\n\n\010_captionB\016\n\014_descriptionB\025B\017OwnC" +
      "ommandProtoH\001P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ru.sovcombank.hackaton.proto.ParameterProto.getDescriptor(),
        });
    internal_static_ru_sovcombank_hackaton_proto_OwnCommand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ru_sovcombank_hackaton_proto_OwnCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ru_sovcombank_hackaton_proto_OwnCommand_descriptor,
        new java.lang.String[] { "Alias", "Caption", "Description", "Parameters", "Caption", "Description", });
    ru.sovcombank.hackaton.proto.ParameterProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
