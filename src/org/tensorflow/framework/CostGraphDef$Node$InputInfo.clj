(ns org.tensorflow.framework.CostGraphDef$Node$InputInfo
  " Inputs of this node. They must be executed before this node can be
  executed. An input is a particular output of another node, specified
  by the node id and the output index.
 Protobuf type tensorflow.CostGraphDef.Node.InputInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef$Node$InputInfo]))

(def *-preceding-node-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node$InputInfo/PRECEDING_NODE_FIELD_NUMBER)

(def *-preceding-port-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node$InputInfo/PRECEDING_PORT_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (CostGraphDef$Node$InputInfo/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (CostGraphDef$Node$InputInfo/parseFrom data extension-registry))
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^java.nio.ByteBuffer data]
    (CostGraphDef$Node$InputInfo/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo`

  throws: java.io.IOException"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (CostGraphDef$Node$InputInfo/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^java.io.InputStream input]
    (CostGraphDef$Node$InputInfo/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.CostGraphDef$Node$InputInfo`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^org.tensorflow.framework.CostGraphDef$Node$InputInfo prototype]
    (CostGraphDef$Node$InputInfo/newBuilder prototype))
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder []
    (CostGraphDef$Node$InputInfo/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo []
    (CostGraphDef$Node$InputInfo/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.CostGraphDef$Node$InputInfo>`"
  (^com.github.os72.protobuf351.Parser []
    (CostGraphDef$Node$InputInfo/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^CostGraphDef$Node$InputInfo this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$InputInfo this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^CostGraphDef$Node$InputInfo this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^CostGraphDef$Node$InputInfo this]
    (-> this (.getSerializedSize))))

(defn get-preceding-port
  "int32 preceding_port = 2;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$InputInfo this]
    (-> this (.getPrecedingPort))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^CostGraphDef$Node$InputInfo this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CostGraphDef$Node$InputInfo this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.CostGraphDef$Node$InputInfo>`"
  (^com.github.os72.protobuf351.Parser [^CostGraphDef$Node$InputInfo this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$InputInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-preceding-node
  "int32 preceding_node = 1;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$InputInfo this]
    (-> this (.getPrecedingNode))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo this]
    (-> this (.toBuilder))))

