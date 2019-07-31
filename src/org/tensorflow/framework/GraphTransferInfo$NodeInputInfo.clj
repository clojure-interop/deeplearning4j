(ns org.tensorflow.framework.GraphTransferInfo$NodeInputInfo
  "Protobuf type tensorflow.GraphTransferInfo.NodeInputInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeInputInfo]))

(def *-node-id-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInputInfo/NODE_ID_FIELD_NUMBER)

(def *-node-input-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInputInfo/NODE_INPUT_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$NodeInputInfo/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$NodeInputInfo/parseFrom data extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^java.nio.ByteBuffer data]
    (GraphTransferInfo$NodeInputInfo/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$NodeInputInfo/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^java.io.InputStream input]
    (GraphTransferInfo$NodeInputInfo/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo prototype]
    (GraphTransferInfo$NodeInputInfo/newBuilder prototype))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder []
    (GraphTransferInfo$NodeInputInfo/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo []
    (GraphTransferInfo$NodeInputInfo/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$NodeInputInfo>`"
  (^com.github.os72.protobuf351.Parser []
    (GraphTransferInfo$NodeInputInfo/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.getUnknownFields))))

(defn get-node-input-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder [^GraphTransferInfo$NodeInputInfo this ^Integer index]
    (-> this (.getNodeInputOrBuilder index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.getSerializedSize))))

(defn get-node-input-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder>`"
  ([^GraphTransferInfo$NodeInputInfo this]
    (-> this (.getNodeInputOrBuilderList))))

(defn get-node-id
  "int32 node_id = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.getNodeId))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^GraphTransferInfo$NodeInputInfo this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-node-input-count
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.getNodeInputCount))))

(defn get-node-input-list
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInput>`"
  (^java.util.List [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.getNodeInputList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$NodeInputInfo>`"
  (^com.github.os72.protobuf351.Parser [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeInputInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.newBuilderForType))))

(defn get-node-input
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^GraphTransferInfo$NodeInputInfo this ^Integer index]
    (-> this (.getNodeInput index))))

(defn to-builder
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo this]
    (-> this (.toBuilder))))

