(ns org.tensorflow.framework.DeviceStepStats
  "Protobuf type tensorflow.DeviceStepStats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DeviceStepStats]))

(def *-device-field-number
  "Static Constant.

  type: int"
  DeviceStepStats/DEVICE_FIELD_NUMBER)

(def *-node-stats-field-number
  "Static Constant.

  type: int"
  DeviceStepStats/NODE_STATS_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (DeviceStepStats/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.DeviceStepStats`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.DeviceStepStats [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (DeviceStepStats/parseFrom data extension-registry))
  (^org.tensorflow.framework.DeviceStepStats [^java.nio.ByteBuffer data]
    (DeviceStepStats/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.DeviceStepStats`

  throws: java.io.IOException"
  (^org.tensorflow.framework.DeviceStepStats [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (DeviceStepStats/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.DeviceStepStats [^java.io.InputStream input]
    (DeviceStepStats/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.DeviceStepStats`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^org.tensorflow.framework.DeviceStepStats prototype]
    (DeviceStepStats/newBuilder prototype))
  (^org.tensorflow.framework.DeviceStepStats$Builder []
    (DeviceStepStats/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.DeviceStepStats`"
  (^org.tensorflow.framework.DeviceStepStats []
    (DeviceStepStats/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.DeviceStepStats>`"
  (^com.github.os72.protobuf351.Parser []
    (DeviceStepStats/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^DeviceStepStats this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^DeviceStepStats this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.DeviceStepStats`"
  (^org.tensorflow.framework.DeviceStepStats [^DeviceStepStats this]
    (-> this (.getDefaultInstanceForType))))

(defn get-node-stats-count
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `int`"
  (^Integer [^DeviceStepStats this]
    (-> this (.getNodeStatsCount))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^DeviceStepStats this]
    (-> this (.getSerializedSize))))

(defn get-node-stats-or-builder
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStatsOrBuilder`"
  (^org.tensorflow.framework.NodeExecStatsOrBuilder [^DeviceStepStats this ^Integer index]
    (-> this (.getNodeStatsOrBuilder index))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^DeviceStepStats this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-node-stats-or-builder-list
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeExecStatsOrBuilder>`"
  ([^DeviceStepStats this]
    (-> this (.getNodeStatsOrBuilderList))))

(defn get-node-stats-list
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `java.util.List<org.tensorflow.framework.NodeExecStats>`"
  (^java.util.List [^DeviceStepStats this]
    (-> this (.getNodeStatsList))))

(defn get-device-bytes
  "string device = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceStepStats this]
    (-> this (.getDeviceBytes))))

(defn get-device
  "string device = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceStepStats this]
    (-> this (.getDevice))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DeviceStepStats this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.DeviceStepStats>`"
  (^com.github.os72.protobuf351.Parser [^DeviceStepStats this]
    (-> this (.getParserForType))))

(defn get-node-stats
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStats`"
  (^org.tensorflow.framework.NodeExecStats [^DeviceStepStats this ^Integer index]
    (-> this (.getNodeStats index))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DeviceStepStats this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats this]
    (-> this (.toBuilder))))

