(ns org.tensorflow.framework.MemoryLogTensorAllocationOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogTensorAllocationOrBuilder]))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogTensorAllocationOrBuilder this]
    (-> this (.getStepId))))

(defn get-kernel-name
  "Name of the kernel making the allocation as set in GraphDef,
   e.g., \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogTensorAllocationOrBuilder this]
    (-> this (.getKernelName))))

(defn get-kernel-name-bytes
  "Name of the kernel making the allocation as set in GraphDef,
   e.g., \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogTensorAllocationOrBuilder this]
    (-> this (.getKernelNameBytes))))

(defn has-tensor?
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `boolean`"
  (^Boolean [^MemoryLogTensorAllocationOrBuilder this]
    (-> this (.hasTensor))))

(defn get-tensor
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^MemoryLogTensorAllocationOrBuilder this]
    (-> this (.getTensor))))

(defn get-tensor-or-builder
  "Allocated tensor details.
  .tensorflow.TensorDescription tensor = 3;

  returns: `org.tensorflow.framework.TensorDescriptionOrBuilder`"
  (^org.tensorflow.framework.TensorDescriptionOrBuilder [^MemoryLogTensorAllocationOrBuilder this]
    (-> this (.getTensorOrBuilder))))

