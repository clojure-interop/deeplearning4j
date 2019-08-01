(ns org.tensorflow.framework.MemoryStats$Builder
  " For memory tracking.
 Protobuf type tensorflow.MemoryStats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryStats$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryStats$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.MemoryStats`"
  (^org.tensorflow.framework.MemoryStats [^MemoryStats$Builder this]
    (-> this (.buildPartial))))

(defn clear-host-persistent-memory-size
  "int64 host_persistent_memory_size = 3;

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this]
    (-> this (.clearHostPersistentMemorySize))))

(defn clear-device-persistent-tensor-alloc-ids
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this]
    (-> this (.clearDevicePersistentTensorAllocIds))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryStats$Builder this]
    (-> this (.isInitialized))))

(defn get-host-persistent-tensor-alloc-ids-list
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^MemoryStats$Builder this]
    (-> this (.getHostPersistentTensorAllocIdsList))))

(defn clear-host-temp-memory-size
  "int64 host_temp_memory_size = 1;

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this]
    (-> this (.clearHostTempMemorySize))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryStats`"
  (^org.tensorflow.framework.MemoryStats [^MemoryStats$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-device-persistent-memory-size
  "int64 device_persistent_memory_size = 4;

  returns: `long`"
  (^Long [^MemoryStats$Builder this]
    (-> this (.getDevicePersistentMemorySize))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-device-persistent-tensor-alloc-ids
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  index - `int`

  returns: `long`"
  (^Long [^MemoryStats$Builder this ^Integer index]
    (-> this (.getDevicePersistentTensorAllocIds index))))

(defn get-host-persistent-tensor-alloc-ids-count
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  returns: `int`"
  (^Integer [^MemoryStats$Builder this]
    (-> this (.getHostPersistentTensorAllocIdsCount))))

(defn add-all-device-persistent-tensor-alloc-ids
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^java.lang.Iterable values]
    (-> this (.addAllDevicePersistentTensorAllocIds values))))

(defn clear-device-persistent-memory-size
  "int64 device_persistent_memory_size = 4;

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this]
    (-> this (.clearDevicePersistentMemorySize))))

(defn get-host-persistent-tensor-alloc-ids
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  index - `int`

  returns: `long`"
  (^Long [^MemoryStats$Builder this ^Integer index]
    (-> this (.getHostPersistentTensorAllocIds index))))

(defn add-all-host-persistent-tensor-alloc-ids
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^java.lang.Iterable values]
    (-> this (.addAllHostPersistentTensorAllocIds values))))

(defn set-host-persistent-memory-size
  "int64 host_persistent_memory_size = 3;

  value - `long`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^Long value]
    (-> this (.setHostPersistentMemorySize value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-host-temp-memory-size
  "int64 host_temp_memory_size = 1;

  value - `long`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^Long value]
    (-> this (.setHostTempMemorySize value))))

(defn get-device-persistent-tensor-alloc-ids-count
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  returns: `int`"
  (^Integer [^MemoryStats$Builder this]
    (-> this (.getDevicePersistentTensorAllocIdsCount))))

(defn get-device-temp-memory-size
  "int64 device_temp_memory_size = 2;

  returns: `long`"
  (^Long [^MemoryStats$Builder this]
    (-> this (.getDeviceTempMemorySize))))

(defn get-host-temp-memory-size
  "int64 host_temp_memory_size = 1;

  returns: `long`"
  (^Long [^MemoryStats$Builder this]
    (-> this (.getHostTempMemorySize))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn add-host-persistent-tensor-alloc-ids
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  value - `long`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^Long value]
    (-> this (.addHostPersistentTensorAllocIds value))))

(defn build
  "returns: `org.tensorflow.framework.MemoryStats`"
  (^org.tensorflow.framework.MemoryStats [^MemoryStats$Builder this]
    (-> this (.build))))

(defn clear-device-temp-memory-size
  "int64 device_temp_memory_size = 2;

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this]
    (-> this (.clearDeviceTempMemorySize))))

(defn set-device-temp-memory-size
  "int64 device_temp_memory_size = 2;

  value - `long`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^Long value]
    (-> this (.setDeviceTempMemorySize value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryStats$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-device-persistent-tensor-alloc-ids-list
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^MemoryStats$Builder this]
    (-> this (.getDevicePersistentTensorAllocIdsList))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^MemoryStats$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-host-persistent-tensor-alloc-ids
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  index - `int`
  value - `long`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^Integer index ^Long value]
    (-> this (.setHostPersistentTensorAllocIds index value))))

(defn get-host-persistent-memory-size
  "int64 host_persistent_memory_size = 3;

  returns: `long`"
  (^Long [^MemoryStats$Builder this]
    (-> this (.getHostPersistentMemorySize))))

(defn clear
  "returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this]
    (-> this (.clear))))

(defn add-device-persistent-tensor-alloc-ids
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  value - `long`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^Long value]
    (-> this (.addDevicePersistentTensorAllocIds value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-host-persistent-tensor-alloc-ids
  "repeated int64 host_persistent_tensor_alloc_ids = 5;

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this]
    (-> this (.clearHostPersistentTensorAllocIds))))

(defn set-device-persistent-memory-size
  "int64 device_persistent_memory_size = 4;

  value - `long`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^Long value]
    (-> this (.setDevicePersistentMemorySize value))))

(defn set-device-persistent-tensor-alloc-ids
  "repeated int64 device_persistent_tensor_alloc_ids = 6;

  index - `int`
  value - `long`

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^MemoryStats$Builder this ^Integer index ^Long value]
    (-> this (.setDevicePersistentTensorAllocIds index value))))

