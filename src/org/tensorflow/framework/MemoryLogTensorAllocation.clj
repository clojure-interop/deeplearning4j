(ns org.tensorflow.framework.MemoryLogTensorAllocation
  "Protobuf type tensorflow.MemoryLogTensorAllocation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogTensorAllocation]))

(def *-step-id-field-number
  "Static Constant.

  type: int"
  MemoryLogTensorAllocation/STEP_ID_FIELD_NUMBER)

(def *-kernel-name-field-number
  "Static Constant.

  type: int"
  MemoryLogTensorAllocation/KERNEL_NAME_FIELD_NUMBER)

(def *-tensor-field-number
  "Static Constant.

  type: int"
  MemoryLogTensorAllocation/TENSOR_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogTensorAllocation/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.MemoryLogTensorAllocation [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogTensorAllocation/parseFrom data extension-registry))
  (^org.tensorflow.framework.MemoryLogTensorAllocation [^java.nio.ByteBuffer data]
    (MemoryLogTensorAllocation/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogTensorAllocation [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogTensorAllocation/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.MemoryLogTensorAllocation [^java.io.InputStream input]
    (MemoryLogTensorAllocation/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.MemoryLogTensorAllocation`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^org.tensorflow.framework.MemoryLogTensorAllocation prototype]
    (MemoryLogTensorAllocation/newBuilder prototype))
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder []
    (MemoryLogTensorAllocation/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.MemoryLogTensorAllocation`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation []
    (MemoryLogTensorAllocation/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogTensorAllocation>`"
  (^com.github.os72.protobuf351.Parser []
    (MemoryLogTensorAllocation/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^MemoryLogTensorAllocation this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogTensorAllocation this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogTensorAllocation`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation [^MemoryLogTensorAllocation this]
    (-> this (.getDefaultInstanceForType))))

(defn get-kernel-name-bytes
  "Name of the kernel making the allocation as set in GraphDef,
   e.g., \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogTensorAllocation this]
    (-> this (.getKernelNameBytes))))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogTensorAllocation this]
    (-> this (.getStepId))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^MemoryLogTensorAllocation this]
    (-> this (.getSerializedSize))))

(defn get-kernel-name
  "Name of the kernel making the allocation as set in GraphDef,
   e.g., \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogTensorAllocation this]
    (-> this (.getKernelName))))

(defn has-tensor?
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `boolean`"
  (^Boolean [^MemoryLogTensorAllocation this]
    (-> this (.hasTensor))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^MemoryLogTensorAllocation this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-tensor-or-builder
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `org.tensorflow.framework.TensorDescriptionOrBuilder`"
  (^org.tensorflow.framework.TensorDescriptionOrBuilder [^MemoryLogTensorAllocation this]
    (-> this (.getTensorOrBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MemoryLogTensorAllocation this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogTensorAllocation>`"
  (^com.github.os72.protobuf351.Parser [^MemoryLogTensorAllocation this]
    (-> this (.getParserForType))))

(defn get-tensor
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^MemoryLogTensorAllocation this]
    (-> this (.getTensor))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MemoryLogTensorAllocation this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation this]
    (-> this (.toBuilder))))

