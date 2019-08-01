(ns org.tensorflow.framework.ResourceHandleProto
  " Protocol buffer representing a handle to a tensorflow resource. Handles are
  not valid across executions, but can be serialized back and forth from within
  a single run.
 Protobuf type tensorflow.ResourceHandleProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ResourceHandleProto]))

(def *-device-field-number
  "Static Constant.

  type: int"
  ResourceHandleProto/DEVICE_FIELD_NUMBER)

(def *-container-field-number
  "Static Constant.

  type: int"
  ResourceHandleProto/CONTAINER_FIELD_NUMBER)

(def *-name-field-number
  "Static Constant.

  type: int"
  ResourceHandleProto/NAME_FIELD_NUMBER)

(def *-hash-code-field-number
  "Static Constant.

  type: int"
  ResourceHandleProto/HASH_CODE_FIELD_NUMBER)

(def *-maybe-type-name-field-number
  "Static Constant.

  type: int"
  ResourceHandleProto/MAYBE_TYPE_NAME_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ResourceHandleProto/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ResourceHandleProto`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.ResourceHandleProto [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ResourceHandleProto/parseFrom data extension-registry))
  (^org.tensorflow.framework.ResourceHandleProto [^java.nio.ByteBuffer data]
    (ResourceHandleProto/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ResourceHandleProto`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ResourceHandleProto [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ResourceHandleProto/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.ResourceHandleProto [^java.io.InputStream input]
    (ResourceHandleProto/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.ResourceHandleProto`

  returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^org.tensorflow.framework.ResourceHandleProto prototype]
    (ResourceHandleProto/newBuilder prototype))
  (^org.tensorflow.framework.ResourceHandleProto$Builder []
    (ResourceHandleProto/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.ResourceHandleProto`"
  (^org.tensorflow.framework.ResourceHandleProto []
    (ResourceHandleProto/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ResourceHandleProto>`"
  (^com.github.os72.protobuf351.Parser []
    (ResourceHandleProto/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^ResourceHandleProto this]
    (-> this (.getUnknownFields))))

(defn get-maybe-type-name
  "For debug-only, the name of the type pointed to by this handle, if
   available.
  string maybe_type_name = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProto this]
    (-> this (.getMaybeTypeName))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ResourceHandleProto this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ResourceHandleProto`"
  (^org.tensorflow.framework.ResourceHandleProto [^ResourceHandleProto this]
    (-> this (.getDefaultInstanceForType))))

(defn get-maybe-type-name-bytes
  "For debug-only, the name of the type pointed to by this handle, if
   available.
  string maybe_type_name = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProto this]
    (-> this (.getMaybeTypeNameBytes))))

(defn get-name-bytes
  "Unique name of this resource.
  string name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProto this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^ResourceHandleProto this]
    (-> this (.getSerializedSize))))

(defn get-name
  "Unique name of this resource.
  string name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProto this]
    (-> this (.getName))))

(defn get-container-bytes
  "Container in which this resource is placed.
  string container = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProto this]
    (-> this (.getContainerBytes))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^ResourceHandleProto this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-container
  "Container in which this resource is placed.
  string container = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProto this]
    (-> this (.getContainer))))

(defn get-device-bytes
  "Unique name for the device containing the resource.
  string device = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ResourceHandleProto this]
    (-> this (.getDeviceBytes))))

(defn get-device
  "Unique name for the device containing the resource.
  string device = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ResourceHandleProto this]
    (-> this (.getDevice))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ResourceHandleProto this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ResourceHandleProto>`"
  (^com.github.os72.protobuf351.Parser [^ResourceHandleProto this]
    (-> this (.getParserForType))))

(defn get-hash-code
  "Hash code for the type of the resource. Is only valid in the same device
   and in the same execution.
  uint64 hash_code = 4;

  returns: `long`"
  (^Long [^ResourceHandleProto this]
    (-> this (.getHashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ResourceHandleProto this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.ResourceHandleProto$Builder`"
  (^org.tensorflow.framework.ResourceHandleProto$Builder [^ResourceHandleProto this]
    (-> this (.toBuilder))))

