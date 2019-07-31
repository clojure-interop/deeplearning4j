(ns org.tensorflow.framework.GraphTransferInfo$NodeInfo
  "Protobuf type tensorflow.GraphTransferInfo.NodeInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeInfo]))

(def *-name-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInfo/NAME_FIELD_NUMBER)

(def *-node-id-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInfo/NODE_ID_FIELD_NUMBER)

(def *-type-name-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInfo/TYPE_NAME_FIELD_NUMBER)

(def *-soc-op-id-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInfo/SOC_OP_ID_FIELD_NUMBER)

(def *-padding-id-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInfo/PADDING_ID_FIELD_NUMBER)

(def *-input-count-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInfo/INPUT_COUNT_FIELD_NUMBER)

(def *-output-count-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInfo/OUTPUT_COUNT_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$NodeInfo/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$NodeInfo/parseFrom data extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^java.nio.ByteBuffer data]
    (GraphTransferInfo$NodeInfo/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$NodeInfo/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^java.io.InputStream input]
    (GraphTransferInfo$NodeInfo/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.GraphTransferInfo$NodeInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^org.tensorflow.framework.GraphTransferInfo$NodeInfo prototype]
    (GraphTransferInfo$NodeInfo/newBuilder prototype))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder []
    (GraphTransferInfo$NodeInfo/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo []
    (GraphTransferInfo$NodeInfo/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$NodeInfo>`"
  (^com.github.os72.protobuf351.Parser []
    (GraphTransferInfo$NodeInfo/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^GraphTransferInfo$NodeInfo this]
    (-> this (.getUnknownFields))))

(defn get-padding-id
  "int32 padding_id = 5;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo this]
    (-> this (.getPaddingId))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeInfo this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^GraphTransferInfo$NodeInfo this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$NodeInfo this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "int32 input_count = 6;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo this]
    (-> this (.getInputCount))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo this]
    (-> this (.getSerializedSize))))

(defn get-type-name-bytes
  "string type_name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$NodeInfo this]
    (-> this (.getTypeNameBytes))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$NodeInfo this]
    (-> this (.getName))))

(defn get-node-id
  "int32 node_id = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo this]
    (-> this (.getNodeId))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^GraphTransferInfo$NodeInfo this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-output-count
  "int32 output_count = 7;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo this]
    (-> this (.getOutputCount))))

(defn get-soc-op-id
  "int32 soc_op_id = 4;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo this]
    (-> this (.getSocOpId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$NodeInfo>`"
  (^com.github.os72.protobuf351.Parser [^GraphTransferInfo$NodeInfo this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo this]
    (-> this (.newBuilderForType))))

(defn get-type-name
  "string type_name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$NodeInfo this]
    (-> this (.getTypeName))))

(defn to-builder
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo this]
    (-> this (.toBuilder))))

