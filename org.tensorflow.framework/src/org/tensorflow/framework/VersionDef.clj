(ns org.tensorflow.framework.VersionDef
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
  (:import [org.tensorflow.framework VersionDef]))

(def *-producer-field-number
  "Static Constant.

  type: int"
  VersionDef/PRODUCER_FIELD_NUMBER)

(def *-min-consumer-field-number
  "Static Constant.

  type: int"
  VersionDef/MIN_CONSUMER_FIELD_NUMBER)

(def *-bad-consumers-field-number
  "Static Constant.

  type: int"
  VersionDef/BAD_CONSUMERS_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (VersionDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.VersionDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.VersionDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (VersionDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.VersionDef [^java.nio.ByteBuffer data]
    (VersionDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.VersionDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.VersionDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (VersionDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.VersionDef [^java.io.InputStream input]
    (VersionDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.VersionDef`

  returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^org.tensorflow.framework.VersionDef prototype]
    (VersionDef/newBuilder prototype))
  (^org.tensorflow.framework.VersionDef$Builder []
    (VersionDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.VersionDef`"
  (^org.tensorflow.framework.VersionDef []
    (VersionDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.VersionDef>`"
  (^com.github.os72.protobuf351.Parser []
    (VersionDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^VersionDef this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^VersionDef this]
    (-> this (.isInitialized))))

(defn get-min-consumer
  "Any consumer below this version is not allowed to consume this data.
  int32 min_consumer = 2;

  returns: `int`"
  (^Integer [^VersionDef this]
    (-> this (.getMinConsumer))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.VersionDef`"
  (^org.tensorflow.framework.VersionDef [^VersionDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^VersionDef this]
    (-> this (.getSerializedSize))))

(defn get-producer
  "The version of the code that produced this data.
  int32 producer = 1;

  returns: `int`"
  (^Integer [^VersionDef this]
    (-> this (.getProducer))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^VersionDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-bad-consumers-count
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  returns: `int`"
  (^Integer [^VersionDef this]
    (-> this (.getBadConsumersCount))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VersionDef this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.VersionDef>`"
  (^com.github.os72.protobuf351.Parser [^VersionDef this]
    (-> this (.getParserForType))))

(defn get-bad-consumers-list
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^VersionDef this]
    (-> this (.getBadConsumersList))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VersionDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.VersionDef$Builder`"
  (^org.tensorflow.framework.VersionDef$Builder [^VersionDef this]
    (-> this (.toBuilder))))

(defn get-bad-consumers
  "Specific consumer versions which are disallowed (e.g. due to bugs).
  repeated int32 bad_consumers = 3;

  index - `int`

  returns: `int`"
  (^Integer [^VersionDef this ^Integer index]
    (-> this (.getBadConsumers index))))

