(ns org.tensorflow.framework.MemoryLogTensorOutput
  "Protobuf type tensorflow.MemoryLogTensorOutput"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogTensorOutput]))

(def *-step-id-field-number
  "Static Constant.

  type: int"
  MemoryLogTensorOutput/STEP_ID_FIELD_NUMBER)

(def *-kernel-name-field-number
  "Static Constant.

  type: int"
  MemoryLogTensorOutput/KERNEL_NAME_FIELD_NUMBER)

(def *-index-field-number
  "Static Constant.

  type: int"
  MemoryLogTensorOutput/INDEX_FIELD_NUMBER)

(def *-tensor-field-number
  "Static Constant.

  type: int"
  MemoryLogTensorOutput/TENSOR_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogTensorOutput/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogTensorOutput`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.MemoryLogTensorOutput [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogTensorOutput/parseFrom data extension-registry))
  (^org.tensorflow.framework.MemoryLogTensorOutput [^java.nio.ByteBuffer data]
    (MemoryLogTensorOutput/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogTensorOutput`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogTensorOutput [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (MemoryLogTensorOutput/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.MemoryLogTensorOutput [^java.io.InputStream input]
    (MemoryLogTensorOutput/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.MemoryLogTensorOutput`

  returns: `org.tensorflow.framework.MemoryLogTensorOutput$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorOutput$Builder [^org.tensorflow.framework.MemoryLogTensorOutput prototype]
    (MemoryLogTensorOutput/newBuilder prototype))
  (^org.tensorflow.framework.MemoryLogTensorOutput$Builder []
    (MemoryLogTensorOutput/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.MemoryLogTensorOutput`"
  (^org.tensorflow.framework.MemoryLogTensorOutput []
    (MemoryLogTensorOutput/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogTensorOutput>`"
  (^com.github.os72.protobuf351.Parser []
    (MemoryLogTensorOutput/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^MemoryLogTensorOutput this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogTensorOutput this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogTensorOutput`"
  (^org.tensorflow.framework.MemoryLogTensorOutput [^MemoryLogTensorOutput this]
    (-> this (.getDefaultInstanceForType))))

(defn get-index
  "Index of the output being set.
  int32 index = 3;

  returns: `int`"
  (^Integer [^MemoryLogTensorOutput this]
    (-> this (.getIndex))))

(defn get-kernel-name-bytes
  "Name of the kernel producing an output as set in GraphDef, e.g.,
   \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogTensorOutput this]
    (-> this (.getKernelNameBytes))))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogTensorOutput this]
    (-> this (.getStepId))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^MemoryLogTensorOutput this]
    (-> this (.getSerializedSize))))

(defn get-kernel-name
  "Name of the kernel producing an output as set in GraphDef, e.g.,
   \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogTensorOutput this]
    (-> this (.getKernelName))))

(defn has-tensor?
  "Output tensor details.
  .tensorflow.TensorDescription tensor = 4;

  returns: `boolean`"
  (^Boolean [^MemoryLogTensorOutput this]
    (-> this (.hasTensor))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^MemoryLogTensorOutput this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-tensor-or-builder
  "Output tensor details.
  .tensorflow.TensorDescription tensor = 4;

  returns: `org.tensorflow.framework.TensorDescriptionOrBuilder`"
  (^org.tensorflow.framework.TensorDescriptionOrBuilder [^MemoryLogTensorOutput this]
    (-> this (.getTensorOrBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MemoryLogTensorOutput this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.MemoryLogTensorOutput>`"
  (^com.github.os72.protobuf351.Parser [^MemoryLogTensorOutput this]
    (-> this (.getParserForType))))

(defn get-tensor
  "Output tensor details.
  .tensorflow.TensorDescription tensor = 4;

  returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^MemoryLogTensorOutput this]
    (-> this (.getTensor))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MemoryLogTensorOutput this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.MemoryLogTensorOutput$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorOutput$Builder [^MemoryLogTensorOutput this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.MemoryLogTensorOutput$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorOutput$Builder [^MemoryLogTensorOutput this]
    (-> this (.toBuilder))))

