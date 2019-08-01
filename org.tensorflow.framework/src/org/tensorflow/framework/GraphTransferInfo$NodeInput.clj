(ns org.tensorflow.framework.GraphTransferInfo$NodeInput
  "Protobuf type tensorflow.GraphTransferInfo.NodeInput"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeInput]))

(def *-node-id-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInput/NODE_ID_FIELD_NUMBER)

(def *-output-port-field-number
  "Static Constant.

  type: int"
  GraphTransferInfo$NodeInput/OUTPUT_PORT_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$NodeInput/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$NodeInput/parseFrom data extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^java.nio.ByteBuffer data]
    (GraphTransferInfo$NodeInput/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (GraphTransferInfo$NodeInput/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^java.io.InputStream input]
    (GraphTransferInfo$NodeInput/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.GraphTransferInfo$NodeInput`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^org.tensorflow.framework.GraphTransferInfo$NodeInput prototype]
    (GraphTransferInfo$NodeInput/newBuilder prototype))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder []
    (GraphTransferInfo$NodeInput/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput []
    (GraphTransferInfo$NodeInput/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$NodeInput>`"
  (^com.github.os72.protobuf351.Parser []
    (GraphTransferInfo$NodeInput/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^GraphTransferInfo$NodeInput this]
    (-> this (.getUnknownFields))))

(defn get-output-port
  "int32 output_port = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInput this]
    (-> this (.getOutputPort))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeInput this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^GraphTransferInfo$NodeInput this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInput this]
    (-> this (.getSerializedSize))))

(defn get-node-id
  "int32 node_id = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInput this]
    (-> this (.getNodeId))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^GraphTransferInfo$NodeInput this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInput this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.GraphTransferInfo$NodeInput>`"
  (^com.github.os72.protobuf351.Parser [^GraphTransferInfo$NodeInput this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeInput this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput this]
    (-> this (.toBuilder))))

