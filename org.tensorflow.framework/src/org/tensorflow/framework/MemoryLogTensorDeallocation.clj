(ns org.tensorflow.framework.MemoryLogTensorDeallocation
  "Protobuf type tensorflow.MemoryLogTensorDeallocation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogTensorDeallocation]))

(def *-allocation-id-field-number
  "Static Constant.

  type: int"
  MemoryLogTensorDeallocation/ALLOCATION_ID_FIELD_NUMBER)

(def *-allocator-name-field-number
  "Static Constant.

  type: int"
  MemoryLogTensorDeallocation/ALLOCATOR_NAME_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogTensorDeallocation/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogTensorDeallocation/parseFrom data extension-registry))
  (^org.tensorflow.framework.MemoryLogTensorDeallocation [^java.nio.ByteBuffer data]
    (MemoryLogTensorDeallocation/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogTensorDeallocation/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.MemoryLogTensorDeallocation [^java.io.InputStream input]
    (MemoryLogTensorDeallocation/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.MemoryLogTensorDeallocation`

  returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^org.tensorflow.framework.MemoryLogTensorDeallocation prototype]
    (MemoryLogTensorDeallocation/newBuilder prototype))
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder []
    (MemoryLogTensorDeallocation/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.MemoryLogTensorDeallocation`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation []
    (MemoryLogTensorDeallocation/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogTensorDeallocation>`"
  (^com.github.os72.protobuf351.Parser []
    (MemoryLogTensorDeallocation/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^MemoryLogTensorDeallocation this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogTensorDeallocation this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogTensorDeallocation`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation [^MemoryLogTensorDeallocation this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^MemoryLogTensorDeallocation this]
    (-> this (.getSerializedSize))))

(defn get-allocation-id
  "Id of the tensor buffer being deallocated, used to match to a
   corresponding allocation.
  int64 allocation_id = 1;

  returns: `long`"
  (^Long [^MemoryLogTensorDeallocation this]
    (-> this (.getAllocationId))))

(defn get-allocator-name
  "Name of the allocator used.
  string allocator_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogTensorDeallocation this]
    (-> this (.getAllocatorName))))

(defn get-allocator-name-bytes
  "Name of the allocator used.
  string allocator_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogTensorDeallocation this]
    (-> this (.getAllocatorNameBytes))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^MemoryLogTensorDeallocation this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MemoryLogTensorDeallocation this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogTensorDeallocation>`"
  (^com.github.os72.protobuf351.Parser [^MemoryLogTensorDeallocation this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MemoryLogTensorDeallocation this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.MemoryLogTensorDeallocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorDeallocation$Builder [^MemoryLogTensorDeallocation this]
    (-> this (.toBuilder))))

