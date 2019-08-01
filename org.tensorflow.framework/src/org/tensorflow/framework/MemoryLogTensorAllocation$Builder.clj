(ns org.tensorflow.framework.MemoryLogTensorAllocation$Builder
  "Protobuf type tensorflow.MemoryLogTensorAllocation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogTensorAllocation$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (MemoryLogTensorAllocation$Builder/getDescriptor )))

(defn get-tensor-builder
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `org.tensorflow.framework.TensorDescription$Builder`"
  (^org.tensorflow.framework.TensorDescription$Builder [^MemoryLogTensorAllocation$Builder this]
    (-> this (.getTensorBuilder))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.MemoryLogTensorAllocation`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation [^MemoryLogTensorAllocation$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^MemoryLogTensorAllocation$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.MemoryLogTensorAllocation`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation [^MemoryLogTensorAllocation$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-kernel-name-bytes
  "Name of the kernel making the allocation as set in GraphDef,
   e.g., \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogTensorAllocation$Builder this]
    (-> this (.getKernelNameBytes))))

(defn merge-tensor
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  value - `org.tensorflow.framework.TensorDescription`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^org.tensorflow.framework.TensorDescription value]
    (-> this (.mergeTensor value))))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogTensorAllocation$Builder this]
    (-> this (.getStepId))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-kernel-name
  "Name of the kernel making the allocation as set in GraphDef,
   e.g., \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogTensorAllocation$Builder this]
    (-> this (.getKernelName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-kernel-name
  "Name of the kernel making the allocation as set in GraphDef,
   e.g., \"affine2/weights/Assign\".
  string kernel_name = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^java.lang.String value]
    (-> this (.setKernelName value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn has-tensor?
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `boolean`"
  (^Boolean [^MemoryLogTensorAllocation$Builder this]
    (-> this (.hasTensor))))

(defn build
  "returns: `org.tensorflow.framework.MemoryLogTensorAllocation`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation [^MemoryLogTensorAllocation$Builder this]
    (-> this (.build))))

(defn clear-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this]
    (-> this (.clearStepId))))

(defn get-tensor-or-builder
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `org.tensorflow.framework.TensorDescriptionOrBuilder`"
  (^org.tensorflow.framework.TensorDescriptionOrBuilder [^MemoryLogTensorAllocation$Builder this]
    (-> this (.getTensorOrBuilder))))

(defn clear-kernel-name
  "Name of the kernel making the allocation as set in GraphDef,
   e.g., \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this]
    (-> this (.clearKernelName))))

(defn set-step-id
  "Process-unique step id.
  int64 step_id = 1;

  value - `long`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^Long value]
    (-> this (.setStepId value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-tensor
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  value - `org.tensorflow.framework.TensorDescription`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^org.tensorflow.framework.TensorDescription value]
    (-> this (.setTensor value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^MemoryLogTensorAllocation$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this]
    (-> this (.clear))))

(defn set-kernel-name-bytes
  "Name of the kernel making the allocation as set in GraphDef,
   e.g., \"affine2/weights/Assign\".
  string kernel_name = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setKernelNameBytes value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-tensor
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^MemoryLogTensorAllocation$Builder this]
    (-> this (.getTensor))))

(defn clear-tensor
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `org.tensorflow.framework.MemoryLogTensorAllocation$Builder`"
  (^org.tensorflow.framework.MemoryLogTensorAllocation$Builder [^MemoryLogTensorAllocation$Builder this]
    (-> this (.clearTensor))))

