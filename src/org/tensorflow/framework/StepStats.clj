(ns org.tensorflow.framework.StepStats
  "Protobuf type tensorflow.StepStats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework StepStats]))

(def *-dev-stats-field-number
  "Static Constant.

  type: int"
  StepStats/DEV_STATS_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (StepStats/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.StepStats`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.StepStats [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (StepStats/parseFrom data extension-registry))
  (^org.tensorflow.framework.StepStats [^java.nio.ByteBuffer data]
    (StepStats/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.StepStats`

  throws: java.io.IOException"
  (^org.tensorflow.framework.StepStats [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (StepStats/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.StepStats [^java.io.InputStream input]
    (StepStats/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.StepStats`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^org.tensorflow.framework.StepStats prototype]
    (StepStats/newBuilder prototype))
  (^org.tensorflow.framework.StepStats$Builder []
    (StepStats/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.StepStats`"
  (^org.tensorflow.framework.StepStats []
    (StepStats/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.StepStats>`"
  (^com.github.os72.protobuf351.Parser []
    (StepStats/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^StepStats this]
    (-> this (.getUnknownFields))))

(defn get-dev-stats-or-builder-list
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.DeviceStepStatsOrBuilder>`"
  ([^StepStats this]
    (-> this (.getDevStatsOrBuilderList))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^StepStats this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.StepStats`"
  (^org.tensorflow.framework.StepStats [^StepStats this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^StepStats this]
    (-> this (.getSerializedSize))))

(defn get-dev-stats-count
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `int`"
  (^Integer [^StepStats this]
    (-> this (.getDevStatsCount))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^StepStats this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-dev-stats-list
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `java.util.List<org.tensorflow.framework.DeviceStepStats>`"
  (^java.util.List [^StepStats this]
    (-> this (.getDevStatsList))))

(defn get-dev-stats
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`

  returns: `org.tensorflow.framework.DeviceStepStats`"
  (^org.tensorflow.framework.DeviceStepStats [^StepStats this ^Integer index]
    (-> this (.getDevStats index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^StepStats this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.StepStats>`"
  (^com.github.os72.protobuf351.Parser [^StepStats this]
    (-> this (.getParserForType))))

(defn get-dev-stats-or-builder
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`

  returns: `org.tensorflow.framework.DeviceStepStatsOrBuilder`"
  (^org.tensorflow.framework.DeviceStepStatsOrBuilder [^StepStats this ^Integer index]
    (-> this (.getDevStatsOrBuilder index))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^StepStats this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats this]
    (-> this (.toBuilder))))

