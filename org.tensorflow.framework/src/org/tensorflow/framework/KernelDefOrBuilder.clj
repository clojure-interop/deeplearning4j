(ns org.tensorflow.framework.KernelDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework KernelDefOrBuilder]))

(defn get-host-memory-arg-count
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  returns: `int`"
  (^Integer [^KernelDefOrBuilder this]
    (-> this (.getHostMemoryArgCount))))

(defn get-device-type
  "Type of device this kernel runs on.
  string device_type = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDefOrBuilder this]
    (-> this (.getDeviceType))))

(defn get-constraint
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^KernelDefOrBuilder this ^Integer index]
    (-> this (.getConstraint index))))

(defn get-host-memory-arg-list
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^KernelDefOrBuilder this]
    (-> this (.getHostMemoryArgList))))

(defn get-constraint-list
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `java.util.List<org.tensorflow.framework.KernelDef$AttrConstraint>`"
  (^java.util.List [^KernelDefOrBuilder this]
    (-> this (.getConstraintList))))

(defn get-constraint-or-builder
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder [^KernelDefOrBuilder this ^Integer index]
    (-> this (.getConstraintOrBuilder index))))

(defn get-host-memory-arg-bytes
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDefOrBuilder this ^Integer index]
    (-> this (.getHostMemoryArgBytes index))))

(defn get-constraint-or-builder-list
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder>`"
  ([^KernelDefOrBuilder this]
    (-> this (.getConstraintOrBuilderList))))

(defn get-constraint-count
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `int`"
  (^Integer [^KernelDefOrBuilder this]
    (-> this (.getConstraintCount))))

(defn get-label
  "This allows experimental kernels to be registered for an op that
   won't be used unless the user specifies a \"_kernel\" attr with
   value matching this.
  string label = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDefOrBuilder this]
    (-> this (.getLabel))))

(defn get-device-type-bytes
  "Type of device this kernel runs on.
  string device_type = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDefOrBuilder this]
    (-> this (.getDeviceTypeBytes))))

(defn get-op-bytes
  "Must match the name of an Op.
  string op = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDefOrBuilder this]
    (-> this (.getOpBytes))))

(defn get-op
  "Must match the name of an Op.
  string op = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDefOrBuilder this]
    (-> this (.getOp))))

(defn get-host-memory-arg
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDefOrBuilder this ^Integer index]
    (-> this (.getHostMemoryArg index))))

(defn get-label-bytes
  "This allows experimental kernels to be registered for an op that
   won't be used unless the user specifies a \"_kernel\" attr with
   value matching this.
  string label = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDefOrBuilder this]
    (-> this (.getLabelBytes))))

