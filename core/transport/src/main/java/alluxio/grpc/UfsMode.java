// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: file_system_master.proto

package alluxio.grpc;

/**
 * Protobuf enum {@code alluxio.grpc.UfsMode}
 */
public enum UfsMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NoAccess = 1;</code>
   */
  NoAccess(1),
  /**
   * <code>ReadOnly = 2;</code>
   */
  ReadOnly(2),
  /**
   * <code>ReadWrite = 3;</code>
   */
  ReadWrite(3),
  ;

  /**
   * <code>NoAccess = 1;</code>
   */
  public static final int NoAccess_VALUE = 1;
  /**
   * <code>ReadOnly = 2;</code>
   */
  public static final int ReadOnly_VALUE = 2;
  /**
   * <code>ReadWrite = 3;</code>
   */
  public static final int ReadWrite_VALUE = 3;


  public final int getNumber() {
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static UfsMode valueOf(int value) {
    return forNumber(value);
  }

  public static UfsMode forNumber(int value) {
    switch (value) {
      case 1: return NoAccess;
      case 2: return ReadOnly;
      case 3: return ReadWrite;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UfsMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      UfsMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<UfsMode>() {
          public UfsMode findValueByNumber(int number) {
            return UfsMode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return alluxio.grpc.FileSystemMasterProto.getDescriptor().getEnumTypes().get(4);
  }

  private static final UfsMode[] VALUES = values();

  public static UfsMode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private UfsMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:alluxio.grpc.UfsMode)
}

