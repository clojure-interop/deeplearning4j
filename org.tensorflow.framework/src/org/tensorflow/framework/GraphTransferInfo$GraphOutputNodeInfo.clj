(ns org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo
  "Protobuf type tensorflow.GraphTransferInfo.GraphOutputNodeInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$GraphOutputNodeInfo]))

(def *-name-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$GraphOutputNodeInfo/NAME_FIELD_NUMBER)

(def *-shape-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$GraphOutputNodeInfo/SHAPE_FIELD_NUMBER)

(def *-dtype-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$GraphOutputNodeInfo/DTYPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$GraphOutputNodeInfo/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$GraphOutputNodeInfo/parseFrom data extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo [^java.nio.ByteBuffer data]
    (GraphTransferInfo$GraphOutputNodeInfo/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$GraphOutputNodeInfo/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo [^java.io.InputStream input]
    (GraphTransferInfo$GraphOutputNodeInfo/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder [^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo prototype]
    (GraphTransferInfo$GraphOutputNodeInfo/newBuilder prototype))
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder []
    (GraphTransferInfo$GraphOutputNodeInfo/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo []
    (GraphTransferInfo$GraphOutputNodeInfo/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo>`"
  (^com.github.os72.protobuf351.Parser []
    (GraphTransferInfo$GraphOutputNodeInfo/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.getUnknownFields))))

(defn get-shape-list
  "repeated int64 shape = 2;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.getShapeList))))

(defn get-dtype
  ".tensorflow.DataType dtype = 3;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.getDtype))))

(defn get-shape-count
  "repeated int64 shape = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.getShapeCount))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.getSerializedSize))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^GraphTransferInfo$GraphOutputNodeInfo this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 3;

  returns: `int`"
  (^Integer [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.getDtypeValue))))

(defn get-shape
  "repeated int64 shape = 2;

  index - `int`

  returns: `long`"
  (^Long [^GraphTransferInfo$GraphOutputNodeInfo this ^Integer index]
    (-> this (.getShape index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo>`"
  (^com.github.os72.protobuf351.Parser [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GraphTransferInfo$GraphOutputNodeInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphOutputNodeInfo$Builder [^GraphTransferInfo$GraphOutputNodeInfo this]
    (-> this (.toBuilder))))

