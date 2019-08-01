(ns org.tensorflow.framework.MemoryLogRawDeallocation
  "Protobuf type tensorflow.MemoryLogRawDeallocation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogRawDeallocation]))

(def *-step-id-field-number
  "Static Constant.

  type: int"
  MemoryLogRawDeallocation/STEP_ID_FIELD_NUMBER)

(def *-operation-field-number
  "Static Constant.

  type: int"
  MemoryLogRawDeallocation/OPERATION_FIELD_NUMBER)

(def *-allocation-id-field-number
  "Static Constant.

  type: int"
  MemoryLogRawDeallocation/ALLOCATION_ID_FIELD_NUMBER)

(def *-allocator-name-field-number
  "Static Constant.

  type: int"
  MemoryLogRawDeallocation/ALLOCATOR_NAME_FIELD_NUMBER)

(def *-deferred-field-number
  "Static Constant.

  type: int"
  MemoryLogRawDeallocation/DEFERRED_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogRawDeallocation/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.MemoryLogRawDeallocation [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogRawDeallocation/parseFrom data extension-registry))
  (^org.tensorflow.framework.MemoryLogRawDeallocation [^java.nio.ByteBuffer data]
    (MemoryLogRawDeallocation/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogRawDeallocation [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogRawDeallocation/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.MemoryLogRawDeallocation [^java.io.InputStream input]
    (MemoryLogRawDeallocation/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.MemoryLogRawDeallocation`

  returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^org.tensorflow.framework.MemoryLogRawDeallocation prototype]
    (MemoryLogRawDeallocation/newBuilder prototype))
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder []
    (MemoryLogRawDeallocation/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.MemoryLogRawDeallocation`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation []
    (MemoryLogRawDeallocation/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogRawDeallocation>`"
  (^com.github.os72.protobuf351.Parser []
    (MemoryLogRawDeallocation/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^MemoryLogRawDeallocation this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogRawDeallocation this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogRawDeallocation`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation [^MemoryLogRawDeallocation this]
    (-> this (.getDefaultInstanceForType))))

(defn get-deferred?
  "True if the deallocation is queued and will be performed later,
   e.g. for GPU lazy freeing of buffers.
  bool deferred = 5;

  returns: `boolean`"
  (^Boolean [^MemoryLogRawDeallocation this]
    (-> this (.getDeferred))))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogRawDeallocation this]
    (-> this (.getStepId))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^MemoryLogRawDeallocation this]
    (-> this (.getSerializedSize))))

(defn get-allocation-id
  "Id of the tensor buffer being deallocated, used to match to a
   corresponding allocation.
  int64 allocation_id = 3;

  returns: `long`"
  (^Long [^MemoryLogRawDeallocation this]
    (-> this (.getAllocationId))))

(defn get-operation-bytes
  "Name of the operation making the deallocation.
  string operation = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawDeallocation this]
    (-> this (.getOperationBytes))))

(defn get-allocator-name
  "Name of the allocator used.
  string allocator_name = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawDeallocation this]
    (-> this (.getAllocatorName))))

(defn get-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogRawDeallocation this]
    (-> this (.getAllocatorNameBytes))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^MemoryLogRawDeallocation this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MemoryLogRawDeallocation this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogRawDeallocation>`"
  (^com.github.os72.protobuf351.Parser [^MemoryLogRawDeallocation this]
    (-> this (.getParserForType))))

(defn get-operation
  "Name of the operation making the deallocation.
  string operation = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogRawDeallocation this]
    (-> this (.getOperation))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MemoryLogRawDeallocation this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.MemoryLogRawDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogRawDeallocation$Builder [^MemoryLogRawDeallocation this]
    (-> this (.toBuilder))))

