(ns org.tensorflow.framework.MemoryLogTensorOutputOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework MemoryLogTensorOutputOrBuilder]))

(defn get-step-id
  "Process-unique step id.
  int64 step_id = 1;

  returns: `long`"
  (^Long [^MemoryLogTensorOutputOrBuilder this]
    (-> this (.getStepId))))

(defn get-kernel-name
  "Name of the kernel producing an output as set in GraphDef, e.g.,
   \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^MemoryLogTensorOutputOrBuilder this]
    (-> this (.getKernelName))))

(defn get-kernel-name-bytes
  "Name of the kernel producing an output as set in GraphDef, e.g.,
   \"affine2/weights/Assign\".
  string kernel_name = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^MemoryLogTensorOutputOrBuilder this]
    (-> this (.getKernelNameBytes))))

(defn get-index
  "Index of the output being set.
  int32 index = 3;

  returns: `int`"
  (^Integer [^MemoryLogTensorOutputOrBuilder this]
    (-> this (.getIndex))))

(defn has-tensor?
  "Output tensor details.
  .tensorflow.TensorDescription tensor = 4;

  returns: `boolean`"
  (^Boolean [^MemoryLogTensorOutputOrBuilder this]
    (-> this (.hasTensor))))

(defn get-tensor
  "Output tensor details.
  .tensorflow.TensorDescription tensor = 4;

  returns: `org.tensorflow.framework.TensorDescription`"
  (^org.tensorflow.framework.TensorDescription [^MemoryLogTensorOutputOrBuilder this]
    (-> this (.getTensor))))

(defn get-tensor-or-builder
  "Output tensor details.
  .tensorflow.TensorDescription tensor = 4;

  returns: `org.tensorflow.framework.TensorDescriptionOrBuilder`"
  (^org.tensorflow.framework.TensorDescriptionOrBuilder [^MemoryLogTensorOutputOrBuilder this]
    (-> this (.getTensorOrBuilder))))

