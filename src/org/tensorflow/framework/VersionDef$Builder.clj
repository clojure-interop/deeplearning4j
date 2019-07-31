(ns org.tensorflow.framework.VersionDef$Builder
  " Version information for a piece of serialized data
  There are different types of versions for each type of data
  (GraphDef, etc.), but they all have the same common shape
  described here.
  Each consumer has \"consumer\" and \"min_producer\" versions (specified
  elsewhere).  A consumer is allowed to consume this data if
    producer >= min_producer
    consumer >= min_consumer
    consumer not in bad_consumers
 Protobuf type tensorflow.VersionDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework VersionDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (VersionDef$Builder/getDescriptor )))

(defn clear-producer
  "The version of the code that produced this data.
  int32 producer = 1;

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this]
    (-> this (.clearProducer))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-producer
  "The version of the code that produced this data.
  int32 producer = 1;

  value - `int`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^Integer value]
    (-> this (.setProducer value))))

(defn build-partial
  "returns: `org.tensorflow.framework.VersionDef`"
  (^org.tensorflow.framework.VersionDef [^VersionDef$Builder this]
    (-> this (.buildPartial))))

(defn clear-min-consumer
  "Any consumer below this version is not allowed to consume this data.
  int32 min_consumer = 2;

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this]
    (-> this (.clearMinConsumer))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^VersionDef$Builder this]
    (-> this (.isInitialized))))

(defn get-min-consumer
  "Any consumer below this version is not allowed to consume this data.
  int32 min_consumer = 2;

  returns: `int`"
  (^Integer [^VersionDef$Builder this]
    (-> this (.getMinConsumer))))

(defn set-min-consumer
  "Any consumer below this version is not allowed to consume this data.
  int32 min_consumer = 2;

  value - `int`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^Integer value]
    (-> this (.setMinConsumer value))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.VersionDef`"
  (^org.tensorflow.framework.VersionDef [^VersionDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-bad-consumers
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  index - `int`
  value - `int`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^Integer index ^Integer value]
    (-> this (.setBadConsumers index value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-all-bad-consumers
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllBadConsumers values))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-producer
  "The version of the code that produced this data.
  int32 producer = 1;

  returns: `int`"
  (^Integer [^VersionDef$Builder this]
    (-> this (.getProducer))))

(defn build
  "returns: `org.tensorflow.framework.VersionDef`"
  (^org.tensorflow.framework.VersionDef [^VersionDef$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.VersionDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-bad-consumers
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this]
    (-> this (.clearBadConsumers))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-bad-consumers-count
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  returns: `int`"
  (^Integer [^VersionDef$Builder this]
    (-> this (.getBadConsumersCount))))

(defn clone
  "returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^VersionDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this]
    (-> this (.clear))))

(defn get-bad-consumers-list
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^VersionDef$Builder this]
    (-> this (.getBadConsumersList))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn add-bad-consumers
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  value - `int`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef$Builder this ^Integer value]
    (-> this (.addBadConsumers value))))

(defn get-bad-consumers
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  index - `int`

  returns: `int`"
  (^Integer [^VersionDef$Builder this ^Integer index]
    (-> this (.getBadConsumers index))))

