(ns org.tensorflow.framework.StepStats$Builder
  "Protobuf type tensorflow.StepStats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework StepStats$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (StepStats$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.StepStats`"
  (^org.tensorflow.framework.StepStats [^StepStats$Builder this]
    (-> this (.buildPartial))))

(defn clear-dev-stats
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this]
    (-> this (.clearDevStats))))

(defn get-dev-stats-or-builder-list
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.DeviceStepStatsOrBuilder>`"
  ([^StepStats$Builder this]
    (-> this (.getDevStatsOrBuilderList))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^StepStats$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.StepStats`"
  (^org.tensorflow.framework.StepStats [^StepStats$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn add-dev-stats
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`
  value - `org.tensorflow.framework.DeviceStepStats`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^Integer index ^org.tensorflow.framework.DeviceStepStats value]
    (-> this (.addDevStats index value)))
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^org.tensorflow.framework.DeviceStepStats value]
    (-> this (.addDevStats value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-dev-stats
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`
  value - `org.tensorflow.framework.DeviceStepStats`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^Integer index ^org.tensorflow.framework.DeviceStepStats value]
    (-> this (.setDevStats index value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-dev-stats-count
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `int`"
  (^Integer [^StepStats$Builder this]
    (-> this (.getDevStatsCount))))

(defn add-all-dev-stats
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^java.lang.Iterable values]
    (-> this (.addAllDevStats values))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn remove-dev-stats
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^Integer index]
    (-> this (.removeDevStats index))))

(defn add-dev-stats-builder
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^StepStats$Builder this ^Integer index]
    (-> this (.addDevStatsBuilder index)))
  (^org.tensorflow.framework.DeviceStepStats$Builder [^StepStats$Builder this]
    (-> this (.addDevStatsBuilder))))

(defn build
  "returns: `org.tensorflow.framework.StepStats`"
  (^org.tensorflow.framework.StepStats [^StepStats$Builder this]
    (-> this (.build))))

(defn get-dev-stats-builder-list
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `java.util.List<org.tensorflow.framework.DeviceStepStats$Builder>`"
  (^java.util.List [^StepStats$Builder this]
    (-> this (.getDevStatsBuilderList))))

(defn get-dev-stats-list
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `java.util.List<org.tensorflow.framework.DeviceStepStats>`"
  (^java.util.List [^StepStats$Builder this]
    (-> this (.getDevStatsList))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.StepStats$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-dev-stats
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`

  returns: `org.tensorflow.framework.DeviceStepStats`"
  (^org.tensorflow.framework.DeviceStepStats [^StepStats$Builder this ^Integer index]
    (-> this (.getDevStats index))))

(defn clone
  "returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^StepStats$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.StepStats$Builder`"
  (^org.tensorflow.framework.StepStats$Builder [^StepStats$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-dev-stats-or-builder
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`

  returns: `org.tensorflow.framework.DeviceStepStatsOrBuilder`"
  (^org.tensorflow.framework.DeviceStepStatsOrBuilder [^StepStats$Builder this ^Integer index]
    (-> this (.getDevStatsOrBuilder index))))

(defn get-dev-stats-builder
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^StepStats$Builder this ^Integer index]
    (-> this (.getDevStatsBuilder index))))

