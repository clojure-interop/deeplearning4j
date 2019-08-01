(ns org.tensorflow.framework.AllocationRecord
  " An allocation/de-allocation operation performed by the allocator.
 Protobuf type tensorflow.AllocationRecord"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AllocationRecord]))

(def *-alloc-micros-field-number
  "Static Constant.

  type: int"
  AllocationRecord/ALLOC_MICROS_FIELD_NUMBER)

(def *-alloc-bytes-field-number
  "Static Constant.

  type: int"
  AllocationRecord/ALLOC_BYTES_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (AllocationRecord/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AllocationRecord`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.AllocationRecord [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (AllocationRecord/parseFrom data extension-registry))
  (^org.tensorflow.framework.AllocationRecord [^java.nio.ByteBuffer data]
    (AllocationRecord/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AllocationRecord`

  throws: java.io.IOException"
  (^org.tensorflow.framework.AllocationRecord [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (AllocationRecord/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.AllocationRecord [^java.io.InputStream input]
    (AllocationRecord/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.AllocationRecord`

  returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^org.tensorflow.framework.AllocationRecord prototype]
    (AllocationRecord/newBuilder prototype))
  (^org.tensorflow.framework.AllocationRecord$Builder []
    (AllocationRecord/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.AllocationRecord`"
  (^org.tensorflow.framework.AllocationRecord []
    (AllocationRecord/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.AllocationRecord>`"
  (^com.github.os72.protobuf351.Parser []
    (AllocationRecord/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^AllocationRecord this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^AllocationRecord this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.AllocationRecord`"
  (^org.tensorflow.framework.AllocationRecord [^AllocationRecord this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^AllocationRecord this]
    (-> this (.getSerializedSize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^AllocationRecord this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-alloc-bytes
  "Number of bytes allocated, or de-allocated if negative.
  int64 alloc_bytes = 2;

  returns: `long`"
  (^Long [^AllocationRecord this]
    (-> this (.getAllocBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AllocationRecord this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.AllocationRecord>`"
  (^com.github.os72.protobuf351.Parser [^AllocationRecord this]
    (-> this (.getParserForType))))

(defn get-alloc-micros
  "The timestamp of the operation.
  int64 alloc_micros = 1;

  returns: `long`"
  (^Long [^AllocationRecord this]
    (-> this (.getAllocMicros))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AllocationRecord this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.AllocationRecord$Builder`"
  (^org.tensorflow.framework.AllocationRecord$Builder [^AllocationRecord this]
    (-> this (.toBuilder))))

