(ns org.tensorflow.framework.MemoryLogRawAllocation
  "Protobuf type tensorflow.MemoryLogRawAllocation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogRawAllocation]))

(def *-step-id-field-number
  "Static Constant.

  type: int"
  MemoryLogRawAllocation/STEP_ID_FIELD_NUMBER)

(def *-operation-field-number
  "Static Constant.

  type: int"
  MemoryLogRawAllocation/OPERATION_FIELD_NUMBER)

(def *-num-bytes-field-number
  "Static Constant.

  type: int"
  MemoryLogRawAllocation/NUM_BYTES_FIELD_NUMBER)

(def *-ptr-field-number
  "Static Constant.

  type: int"
  MemoryLogRawAllocation/PTR_FIELD_NUMBER)

(def *-allocation-id-field-number
  "Static Constant.

  type: int"
  MemoryLogRawAllocation/ALLOCATION_ID_FIELD_NUMBER)

(def *-allocator-name-field-number
  "Static Constant.

  type: int"
  MemoryLogRawAllocation/ALLOCATOR_NAME_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogRawAllocation/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.MemoryLogRawAllocation [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogRawAllocation/parseFrom data extension-registry))
  (^org.tensorflow.framework.MemoryLogRawAllocation [^java.nio.ByteBuffer data]
    (MemoryLogRawAllocation/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogRawAllocation [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogRawAllocation/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.MemoryLogRawAllocation [^java.io.InputStream input]
    (MemoryLogRawAllocation/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.MemoryLogRawAllocation`

  returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^org.tensorflow.framework.MemoryLogRawAllocation prototype]
    (MemoryLogRawAllocation/newBuilder prototype))
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder []
    (MemoryLogRawAllocation/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.MemoryLogRawAllocation`"
  (^org.tensorflow.framework.MemoryLogRawAllocation []
    (MemoryLogRawAllocation/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogRawAllocation>`"
  (^com.github.os72.protobuf351.Parser []
    (MemoryLogRawAllocation/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^MemoryLogRawAllocation this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogRawAllocation this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogRawAllocation`"
  (^org.tensorflow.framework.MemoryLogRawAllocation [^MemoryLogRawAllocation this]
    (-> this (.getDefaultInstanceForType))))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogRawAllocation this]
    (-> this (.getStepId))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^MemoryLogRawAllocation this]
    (-> this (.getSerializedSize))))

(defn get-allocation-id
  "Id of the tensor buffer being allocated, used to match to a
   corresponding deallocation.
  int64 allocation_id = 5;

  returns: `long`"
  (^Long [^MemoryLogRawAllocation this]
    (-> this (.getAllocationId))))

(defn get-operation-bytes
  "Name of the operation making the allocation.
  string operation = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawAllocation this]
    (-> this (.getOperationBytes))))

(defn get-allocator-name
  "Name of the allocator used.
  string allocator_name = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawAllocation this]
    (-> this (.getAllocatorName))))

(defn get-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawAllocation this]
    (-> this (.getAllocatorNameBytes))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^MemoryLogRawAllocation this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-ptr
  "Address of the allocation.
  uint64 ptr = 4;

  returns: `long`"
  (^Long [^MemoryLogRawAllocation this]
    (-> this (.getPtr))))

(defn get-num-bytes
  "Number of bytes in the allocation.
  int64 num_bytes = 3;

  returns: `long`"
  (^Long [^MemoryLogRawAllocation this]
    (-> this (.getNumBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MemoryLogRawAllocation this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogRawAllocation>`"
  (^com.github.os72.protobuf351.Parser [^MemoryLogRawAllocation this]
    (-> this (.getParserForType))))

(defn get-operation
  "Name of the operation making the allocation.
  string operation = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawAllocation this]
    (-> this (.getOperation))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MemoryLogRawAllocation this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.MemoryLogRawAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawAllocation$Builder [^MemoryLogRawAllocation this]
    (-> this (.toBuilder))))

