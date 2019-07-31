(ns org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo
  "Protobuf type tensorflow.GraphTransferInfo.NodeOutputInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeOutputInfo]))

(def *-node-id-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeOutputInfo/NODE_ID_FIELD_NUMBER)

(def *-max-byte-size-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeOutputInfo/MAX_BYTE_SIZE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$NodeOutputInfo/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$NodeOutputInfo/parseFrom data extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^java.nio.ByteBuffer data]
    (GraphTransferInfo$NodeOutputInfo/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$NodeOutputInfo/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^java.io.InputStream input]
    (GraphTransferInfo$NodeOutputInfo/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo prototype]
    (GraphTransferInfo$NodeOutputInfo/newBuilder prototype))
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder []
    (GraphTransferInfo$NodeOutputInfo/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo []
    (GraphTransferInfo$NodeOutputInfo/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo>`"
  (^com.github.os72.protobuf351.Parser []
    (GraphTransferInfo$NodeOutputInfo/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.isInitialized))))

(defn get-max-byte-size
  "repeated int32 max_byte_size = 2;

  index - `int`

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfo this ^Integer index]
    (-> this (.getMaxByteSize index))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.getSerializedSize))))

(defn get-max-byte-size-list
  "repeated int32 max_byte_size = 2;

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.getMaxByteSizeList))))

(defn get-max-byte-size-count
  "repeated int32 max_byte_size = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.getMaxByteSizeCount))))

(defn get-node-id
  "int32 node_id = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.getNodeId))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^GraphTransferInfo$NodeOutputInfo this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo>`"
  (^com.github.os72.protobuf351.Parser [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeOutputInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo this]
    (-> this (.toBuilder))))

