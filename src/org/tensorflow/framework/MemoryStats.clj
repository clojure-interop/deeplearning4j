(ns org.tensorflow.framework.MemoryStats
  " For memory tracking.
 Protobuf type tensorflow.MemoryStats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryStats]))

(def *-host-temp-memory-size-field-number
  "Static Constant.

  type: int"
  MemoryStats/HOST_TEMP_MEMORY_SIZE_FIELD_NUMBER)

(def *-device-temp-memory-size-field-number
  "Static Constant.

  type: int"
  MemoryStats/DEVICE_TEMP_MEMORY_SIZE_FIELD_NUMBER)

(def *-host-persistent-memory-size-field-number
  "Static Constant.

  type: int"
  MemoryStats/HOST_PERSISTENT_MEMORY_SIZE_FIELD_NUMBER)

(def *-device-persistent-memory-size-field-number
  "Static Constant.

  type: int"
  MemoryStats/DEVICE_PERSISTENT_MEMORY_SIZE_FIELD_NUMBER)

(def *-host-persistent-tensor-alloc-ids-field-number
  "Static Constant.

  type: int"
  MemoryStats/HOST_PERSISTENT_TENSOR_ALLOC_IDS_FIELD_NUMBER)

(def *-device-persistent-tensor-alloc-ids-field-number
  "Static Constant.

  type: int"
  MemoryStats/DEVICE_PERSISTENT_TENSOR_ALLOC_IDS_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryStats/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryStats`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.MemoryStats [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryStats/parseFrom data extension-registry))
  (^org.tensorflow.framework.MemoryStats [^java.nio.ByteBuffer data]
    (MemoryStats/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryStats`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryStats [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryStats/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.MemoryStats [^java.io.InputStream input]
    (MemoryStats/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.MemoryStats`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^org.tensorflow.framework.MemoryStats prototype]
    (MemoryStats/newBuilder prototype))
  (^org.tensorflow.framework.MemoryStats$Builder []
    (MemoryStats/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.MemoryStats`"
  (^org.tensorflow.framework.MemoryStats []
    (MemoryStats/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryStats>`"
  (^com.github.os72.protobuf351.Parser []
    (MemoryStats/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^MemoryStats this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryStats this]
    (-> this (.isInitialized))))

(defn get-host-persistent-tensor-alloc-ids-list
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^MemoryStats this]
    (-> this (.getHostPersistentTensorAllocIdsList))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryStats`"
  (^org.tensorflow.framework.MemoryStats [^MemoryStats this]
    (-> this (.getDefaultInstanceForType))))

(defn get-device-persistent-memory-size
  "int64 device_persistent_memory_size = 4;

  returns: `long`"
  (^Long [^MemoryStats this]
    (-> this (.getDevicePersistentMemorySize))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^MemoryStats this]
    (-> this (.getSerializedSize))))

(defn get-device-persistent-tensor-alloc-ids
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  index - `int`

  returns: `long`"
  (^Long [^MemoryStats this ^Integer index]
    (-> this (.getDevicePersistentTensorAllocIds index))))

(defn get-host-persistent-tensor-alloc-ids-count
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  returns: `int`"
  (^Integer [^MemoryStats this]
    (-> this (.getHostPersistentTensorAllocIdsCount))))

(defn get-host-persistent-tensor-alloc-ids
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  index - `int`

  returns: `long`"
  (^Long [^MemoryStats this ^Integer index]
    (-> this (.getHostPersistentTensorAllocIds index))))

(defn get-device-persistent-tensor-alloc-ids-count
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  returns: `int`"
  (^Integer [^MemoryStats this]
    (-> this (.getDevicePersistentTensorAllocIdsCount))))

(defn get-device-temp-memory-size
  "int64 device_temp_memory_size = 2;

  returns: `long`"
  (^Long [^MemoryStats this]
    (-> this (.getDeviceTempMemorySize))))

(defn get-host-temp-memory-size
  "int64 host_temp_memory_size = 1;

  returns: `long`"
  (^Long [^MemoryStats this]
    (-> this (.getHostTempMemorySize))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^MemoryStats this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-device-persistent-tensor-alloc-ids-list
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^MemoryStats this]
    (-> this (.getDevicePersistentTensorAllocIdsList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MemoryStats this]
    (-> this (.hashCode))))

(defn get-host-persistent-memory-size
  "int64 host_persistent_memory_size = 3;

  returns: `long`"
  (^Long [^MemoryStats this]
    (-> this (.getHostPersistentMemorySize))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryStats>`"
  (^com.github.os72.protobuf351.Parser [^MemoryStats this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MemoryStats this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats this]
    (-> this (.toBuilder))))

