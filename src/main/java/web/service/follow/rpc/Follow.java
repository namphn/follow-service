// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: follow.proto

package web.service.follow.rpc;

public final class Follow {
  private Follow() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFollowerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFollowerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFollowerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFollowerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFollowingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFollowingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetFollowingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetFollowingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014follow.proto\"$\n\022GetFollowerRequest\022\016\n\006" +
      "userId\030\001 \001(\t\"(\n\023GetFollowerResponse\022\021\n\tf" +
      "ollowers\030\001 \003(\t\"%\n\023GetFollowingRequest\022\016\n" +
      "\006userId\030\001 \001(\t\")\n\024GetFollowingResponse\022\021\n" +
      "\tfollowing\030\001 \003(\t2\211\001\n\020FollowRpcService\0228\n" +
      "\013getFollower\022\023.GetFollowerRequest\032\024.GetF" +
      "ollowerResponse\022;\n\014getFollowing\022\024.GetFol" +
      "lowingRequest\032\025.GetFollowingResponseB\035\n\026" +
      "web.service.follow.rpcP\001\210\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_GetFollowerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetFollowerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFollowerRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_GetFollowerResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GetFollowerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFollowerResponse_descriptor,
        new java.lang.String[] { "Followers", });
    internal_static_GetFollowingRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GetFollowingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFollowingRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_GetFollowingResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GetFollowingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetFollowingResponse_descriptor,
        new java.lang.String[] { "Following", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}