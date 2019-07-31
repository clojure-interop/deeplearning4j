(ns org.tensorflow.framework.DeviceStepStats$Builder
  "Protobuf type tensorflow.DeviceStepStats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework DeviceStepStats$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (DeviceStepStats$Builder/getDescriptor )))

(defn add-all-node-stats
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^java.lang.Iterable values]
    (-> this (.addAllNodeStats values))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-device
  "string device = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^java.lang.String value]
    (-> this (.setDevice value))))

(defn build-partial
  "returns: `org.tensorflow.framework.DeviceStepStats`"
  (^org.tensorflow.framework.DeviceStepStats [^DeviceStepStats$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^DeviceStepStats$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.DeviceStepStats`"
  (^org.tensorflow.framework.DeviceStepStats [^DeviceStepStats$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-node-stats-count
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `int`"
  (^Integer [^DeviceStepStats$Builder this]
    (-> this (.getNodeStatsCount))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn add-node-stats
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`
  value - `org.tensorflow.framework.NodeExecStats`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^Integer index ^org.tensorflow.framework.NodeExecStats value]
    (-> this (.addNodeStats index value)))
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^org.tensorflow.framework.NodeExecStats value]
    (-> this (.addNodeStats value))))

(defn add-node-stats-builder
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^DeviceStepStats$Builder this ^Integer index]
    (-> this (.addNodeStatsBuilder index)))
  (^org.tensorflow.framework.NodeExecStats$Builder [^DeviceStepStats$Builder this]
    (-> this (.addNodeStatsBuilder))))

(defn clear-node-stats
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this]
    (-> this (.clearNodeStats))))

(defn set-device-bytes
  "string device = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDeviceBytes value))))

(defn set-node-stats
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`
  value - `org.tensorflow.framework.NodeExecStats`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^Integer index ^org.tensorflow.framework.NodeExecStats value]
    (-> this (.setNodeStats index value))))

(defn remove-node-stats
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^Integer index]
    (-> this (.removeNodeStats index))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-node-stats-builder
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^DeviceStepStats$Builder this ^Integer index]
    (-> this (.getNodeStatsBuilder index))))

(defn get-node-stats-or-builder
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStatsOrBuilder`"
  (^org.tensorflow.framework.NodeExecStatsOrBuilder [^DeviceStepStats$Builder this ^Integer index]
    (-> this (.getNodeStatsOrBuilder index))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-node-stats-or-builder-list
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeExecStatsOrBuilder>`"
  ([^DeviceStepStats$Builder this]
    (-> this (.getNodeStatsOrBuilderList))))

(defn build
  "returns: `org.tensorflow.framework.DeviceStepStats`"
  (^org.tensorflow.framework.DeviceStepStats [^DeviceStepStats$Builder this]
    (-> this (.build))))

(defn get-node-stats-list
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `java.util.List<org.tensorflow.framework.NodeExecStats>`"
  (^java.util.List [^DeviceStepStats$Builder this]
    (-> this (.getNodeStatsList))))

(defn get-device-bytes
  "string device = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^DeviceStepStats$Builder this]
    (-> this (.getDeviceBytes))))

(defn get-device
  "string device = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^DeviceStepStats$Builder this]
    (-> this (.getDevice))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-device
  "string device = 1;

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this]
    (-> this (.clearDevice))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^DeviceStepStats$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.DeviceStepStats$Builder`"
  (^org.tensorflow.framework.DeviceStepStats$Builder [^DeviceStepStats$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-node-stats
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStats`"
  (^org.tensorflow.framework.NodeExecStats [^DeviceStepStats$Builder this ^Integer index]
    (-> this (.getNodeStats index))))

(defn get-node-stats-builder-list
  "repeated .tensorflow.NodeExecStats node_stats = 2;

  returns: `java.util.List<org.tensorflow.framework.NodeExecStats$Builder>`"
  (^java.util.List [^DeviceStepStats$Builder this]
    (-> this (.getNodeStatsBuilderList))))

