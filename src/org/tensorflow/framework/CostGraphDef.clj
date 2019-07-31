(ns org.tensorflow.framework.CostGraphDef
  "Protobuf type tensorflow.CostGraphDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef]))

(def *-node-field-number
  "Static Constant.

  type: int"
  CostGraphDef/NODE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (CostGraphDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.CostGraphDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (CostGraphDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.CostGraphDef [^java.nio.ByteBuffer data]
    (CostGraphDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.CostGraphDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (CostGraphDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.CostGraphDef [^java.io.InputStream input]
    (CostGraphDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.CostGraphDef`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^org.tensorflow.framework.CostGraphDef prototype]
    (CostGraphDef/newBuilder prototype))
  (^org.tensorflow.framework.CostGraphDef$Builder []
    (CostGraphDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.CostGraphDef`"
  (^org.tensorflow.framework.CostGraphDef []
    (CostGraphDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.CostGraphDef>`"
  (^com.github.os72.protobuf351.Parser []
    (CostGraphDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^CostGraphDef this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^CostGraphDef this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.CostGraphDef`"
  (^org.tensorflow.framework.CostGraphDef [^CostGraphDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-node-count
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `int`"
  (^Integer [^CostGraphDef this]
    (-> this (.getNodeCount))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^CostGraphDef this]
    (-> this (.getSerializedSize))))

(defn get-node
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node`"
  (^org.tensorflow.framework.CostGraphDef$Node [^CostGraphDef this ^Integer index]
    (-> this (.getNode index))))

(defn get-node-or-builder
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$NodeOrBuilder`"
  (^org.tensorflow.framework.CostGraphDef$NodeOrBuilder [^CostGraphDef this ^Integer index]
    (-> this (.getNodeOrBuilder index))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^CostGraphDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-node-or-builder-list
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.CostGraphDef$NodeOrBuilder>`"
  ([^CostGraphDef this]
    (-> this (.getNodeOrBuilderList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CostGraphDef this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.CostGraphDef>`"
  (^com.github.os72.protobuf351.Parser [^CostGraphDef this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CostGraphDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef this]
    (-> this (.newBuilderForType))))

(defn get-node-list
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node>`"
  (^java.util.List [^CostGraphDef this]
    (-> this (.getNodeList))))

(defn to-builder
  "returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef this]
    (-> this (.toBuilder))))

