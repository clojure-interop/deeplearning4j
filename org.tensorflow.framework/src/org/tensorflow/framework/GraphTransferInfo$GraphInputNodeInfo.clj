(ns org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo
  "Protobuf type tensorflow.GraphTransferInfo.GraphInputNodeInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$GraphInputNodeInfo]))

(def *-name-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$GraphInputNodeInfo/NAME_FIELD_NUMBER)

(def *-shape-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$GraphInputNodeInfo/SHAPE_FIELD_NUMBER)

(def *-dtype-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$GraphInputNodeInfo/DTYPE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$GraphInputNodeInfo/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$GraphInputNodeInfo/parseFrom data extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo [^java.nio.ByteBuffer data]
    (GraphTransferInfo$GraphInputNodeInfo/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$GraphInputNodeInfo/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo [^java.io.InputStream input]
    (GraphTransferInfo$GraphInputNodeInfo/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder [^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo prototype]
    (GraphTransferInfo$GraphInputNodeInfo/newBuilder prototype))
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder []
    (GraphTransferInfo$GraphInputNodeInfo/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo []
    (GraphTransferInfo$GraphInputNodeInfo/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo>`"
  (^com.github.os72.protobuf351.Parser []
    (GraphTransferInfo$GraphInputNodeInfo/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.getUnknownFields))))

(defn get-shape-list
  "repeated int64 shape = 2;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.getShapeList))))

(defn get-dtype
  ".tensorflow.DataType dtype = 3;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.getDtype))))

(defn get-shape-count
  "repeated int64 shape = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.getShapeCount))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.getSerializedSize))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^GraphTransferInfo$GraphInputNodeInfo this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 3;

  returns: `int`"
  (^Integer [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.getDtypeValue))))

(defn get-shape
  "repeated int64 shape = 2;

  index - `int`

  returns: `long`"
  (^Long [^GraphTransferInfo$GraphInputNodeInfo this ^Integer index]
    (-> this (.getShape index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo>`"
  (^com.github.os72.protobuf351.Parser [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GraphTransferInfo$GraphInputNodeInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$GraphInputNodeInfo$Builder [^GraphTransferInfo$GraphInputNodeInfo this]
    (-> this (.toBuilder))))

