(ns org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo
  "Protobuf type tensorflow.GraphTransferInfo.ConstNodeInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$ConstNodeInfo]))

(def *-name-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$ConstNodeInfo/NAME_FIELD_NUMBER)

(def *-node-id-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$ConstNodeInfo/NODE_ID_FIELD_NUMBER)

(def *-shape-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$ConstNodeInfo/SHAPE_FIELD_NUMBER)

(def *-data-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$ConstNodeInfo/DATA_FIELD_NUMBER)

(def *-dtype-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$ConstNodeInfo/DTYPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$ConstNodeInfo/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$ConstNodeInfo/parseFrom data extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^java.nio.ByteBuffer data]
    (GraphTransferInfo$ConstNodeInfo/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$ConstNodeInfo/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^java.io.InputStream input]
    (GraphTransferInfo$ConstNodeInfo/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo prototype]
    (GraphTransferInfo$ConstNodeInfo/newBuilder prototype))
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder []
    (GraphTransferInfo$ConstNodeInfo/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo []
    (GraphTransferInfo$ConstNodeInfo/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo>`"
  (^com.github.os72.protobuf351.Parser []
    (GraphTransferInfo$ConstNodeInfo/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getUnknownFields))))

(defn get-shape-list
  "repeated int64 shape = 3;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getShapeList))))

(defn get-dtype
  ".tensorflow.DataType dtype = 5;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getDtype))))

(defn get-shape-count
  "repeated int64 shape = 3;

  returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getShapeCount))))

(defn get-data
  "bytes data = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getData))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getSerializedSize))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getName))))

(defn get-node-id
  "int32 node_id = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getNodeId))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^GraphTransferInfo$ConstNodeInfo this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 5;

  returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getDtypeValue))))

(defn get-shape
  "repeated int64 shape = 3;

  index - `int`

  returns: `long`"
  (^Long [^GraphTransferInfo$ConstNodeInfo this ^Integer index]
    (-> this (.getShape index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo>`"
  (^com.github.os72.protobuf351.Parser [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GraphTransferInfo$ConstNodeInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo this]
    (-> this (.toBuilder))))

