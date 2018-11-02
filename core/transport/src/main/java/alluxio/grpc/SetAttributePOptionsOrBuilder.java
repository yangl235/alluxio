// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_system_master.proto

package alluxio.grpc;

public interface SetAttributePOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.SetAttributePOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool pinned = 1;</code>
   */
  boolean hasPinned();
  /**
   * <code>optional bool pinned = 1;</code>
   */
  boolean getPinned();

  /**
   * <code>optional int64 ttl = 2;</code>
   */
  boolean hasTtl();
  /**
   * <code>optional int64 ttl = 2;</code>
   */
  long getTtl();

  /**
   * <code>optional bool persisted = 3;</code>
   */
  boolean hasPersisted();
  /**
   * <code>optional bool persisted = 3;</code>
   */
  boolean getPersisted();

  /**
   * <code>optional string owner = 4;</code>
   */
  boolean hasOwner();
  /**
   * <code>optional string owner = 4;</code>
   */
  java.lang.String getOwner();
  /**
   * <code>optional string owner = 4;</code>
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>optional string group = 5;</code>
   */
  boolean hasGroup();
  /**
   * <code>optional string group = 5;</code>
   */
  java.lang.String getGroup();
  /**
   * <code>optional string group = 5;</code>
   */
  com.google.protobuf.ByteString
      getGroupBytes();

  /**
   * <code>optional int32 mode = 6;</code>
   */
  boolean hasMode();
  /**
   * <code>optional int32 mode = 6;</code>
   */
  int getMode();

  /**
   * <code>optional bool recursive = 7;</code>
   */
  boolean hasRecursive();
  /**
   * <code>optional bool recursive = 7;</code>
   */
  boolean getRecursive();

  /**
   * <code>optional .alluxio.grpc.TtlAction ttlAction = 8;</code>
   */
  boolean hasTtlAction();
  /**
   * <code>optional .alluxio.grpc.TtlAction ttlAction = 8;</code>
   */
  alluxio.grpc.TtlAction getTtlAction();

  /**
   * <code>optional .alluxio.grpc.FileSystemMasterCommonPOptions commonOptions = 9;</code>
   */
  boolean hasCommonOptions();
  /**
   * <code>optional .alluxio.grpc.FileSystemMasterCommonPOptions commonOptions = 9;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptions getCommonOptions();
  /**
   * <code>optional .alluxio.grpc.FileSystemMasterCommonPOptions commonOptions = 9;</code>
   */
  alluxio.grpc.FileSystemMasterCommonPOptionsOrBuilder getCommonOptionsOrBuilder();
}
