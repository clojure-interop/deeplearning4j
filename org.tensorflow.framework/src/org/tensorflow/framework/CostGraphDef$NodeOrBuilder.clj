(ns org.tensorflow.framework.CostGraphDef$NodeOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef$NodeOrBuilder]))

(defn get-input-info-or-builder
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder [^CostGraphDef$NodeOrBuilder this ^Integer index]
    (-> this (.getInputInfoOrBuilder index))))

(defn get-input-info-or-builder-list
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder>`"
  ([^CostGraphDef$NodeOrBuilder this]
    (-> this (.getInputInfoOrBuilderList))))

(defn get-output-info
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^CostGraphDef$NodeOrBuilder this ^Integer index]
    (-> this (.getOutputInfo index))))

(defn get-device-persistent-memory-size
  "int64 device_persistent_memory_size = 16;

  returns: `long`"
  (^Long [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getDevicePersistentMemorySize))))

(defn get-name-bytes
  "The name of the node. Names are globally unique.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-name
  "The name of the node. Names are globally unique.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getName))))

(defn get-is-final?
  "If true, the output is permanent: it can't be discarded, because this
   node is part of the \"final output\". Nodes may depend on final nodes.
  bool is_final = 7;

  returns: `boolean`"
  (^Boolean [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getIsFinal))))

(defn get-control-input-list
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getControlInputList))))

(defn get-device-temp-memory-size
  "int64 device_temp_memory_size = 11;

  returns: `long`"
  (^Long [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getDeviceTempMemorySize))))

(defn get-host-temp-memory-size
  "int64 host_temp_memory_size = 10;

  returns: `long`"
  (^Long [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getHostTempMemorySize))))

(defn get-control-input
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  index - `int`

  returns: `int`"
  (^Integer [^CostGraphDef$NodeOrBuilder this ^Integer index]
    (-> this (.getControlInput index))))

(defn get-device-bytes
  "The device of the node. Can be empty if the node is mapped to the
   default partition or partitioning hasn't been run yet.
  string device = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getDeviceBytes))))

(defn get-device
  "The device of the node. Can be empty if the node is mapped to the
   default partition or partitioning hasn't been run yet.
  string device = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getDevice))))

(defn get-input-info
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^CostGraphDef$NodeOrBuilder this ^Integer index]
    (-> this (.getInputInfo index))))

(defn get-id
  "The id of the node. Node ids are only unique inside a partition.
  int32 id = 3;

  returns: `int`"
  (^Integer [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getId))))

(defn get-compute-time
  "Analytical estimate of the computational cost of this node, in
   microseconds.
  int64 compute_time = 14;

  returns: `long`"
  (^Long [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getComputeTime))))

(defn get-input-info-list
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node$InputInfo>`"
  (^java.util.List [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getInputInfoList))))

(defn get-output-info-or-builder-list
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `java.util.List<? extends org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder>`"
  ([^CostGraphDef$NodeOrBuilder this]
    (-> this (.getOutputInfoOrBuilderList))))

(defn get-output-info-list
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node$OutputInfo>`"
  (^java.util.List [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getOutputInfoList))))

(defn get-temporary-memory-size
  "Temporary memory used by this node.
  int64 temporary_memory_size = 6;

  returns: `long`"
  (^Long [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getTemporaryMemorySize))))

(defn get-output-info-or-builder
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder [^CostGraphDef$NodeOrBuilder this ^Integer index]
    (-> this (.getOutputInfoOrBuilder index))))

(defn get-host-persistent-memory-size
  "int64 host_persistent_memory_size = 12;

  returns: `long`"
  (^Long [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getHostPersistentMemorySize))))

(defn get-output-info-count
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `int`"
  (^Integer [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getOutputInfoCount))))

(defn get-input-info-count
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `int`"
  (^Integer [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getInputInfoCount))))

(defn get-control-input-count
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  returns: `int`"
  (^Integer [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getControlInputCount))))

(defn get-memory-time
  "Analytical estimate of the memory access cost of this node, in
   microseconds.
  int64 memory_time = 15;

  returns: `long`"
  (^Long [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getMemoryTime))))

(defn get-compute-cost
  "Estimate of the computational cost of this node, in microseconds.
  int64 compute_cost = 9;

  returns: `long`"
  (^Long [^CostGraphDef$NodeOrBuilder this]
    (-> this (.getComputeCost))))

