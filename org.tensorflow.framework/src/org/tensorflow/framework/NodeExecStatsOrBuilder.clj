(ns org.tensorflow.framework.NodeExecStatsOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NodeExecStatsOrBuilder]))

(defn get-referenced-tensor-or-builder-list
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `java.util.List<? extends org.tensorflow.framework.AllocationDescriptionOrBuilder>`"
  ([^NodeExecStatsOrBuilder this]
    (-> this (.getReferencedTensorOrBuilderList))))

(defn get-referenced-tensor-or-builder
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`

  returns: `org.tensorflow.framework.AllocationDescriptionOrBuilder`"
  (^org.tensorflow.framework.AllocationDescriptionOrBuilder [^NodeExecStatsOrBuilder this ^Integer index]
    (-> this (.getReferencedTensorOrBuilder index))))

(defn get-memory-stats-or-builder
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `org.tensorflow.framework.MemoryStatsOrBuilder`"
  (^org.tensorflow.framework.MemoryStatsOrBuilder [^NodeExecStatsOrBuilder this]
    (-> this (.getMemoryStatsOrBuilder))))

(defn get-all-start-micros
  "int64 all_start_micros = 2;

  returns: `long`"
  (^Long [^NodeExecStatsOrBuilder this]
    (-> this (.getAllStartMicros))))

(defn get-thread-id
  "uint32 thread_id = 10;

  returns: `int`"
  (^Integer [^NodeExecStatsOrBuilder this]
    (-> this (.getThreadId))))

(defn get-memory-or-builder
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocatorMemoryUsedOrBuilder`"
  (^org.tensorflow.framework.AllocatorMemoryUsedOrBuilder [^NodeExecStatsOrBuilder this ^Integer index]
    (-> this (.getMemoryOrBuilder index))))

(defn get-output-or-builder
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`

  returns: `org.tensorflow.framework.NodeOutputOrBuilder`"
  (^org.tensorflow.framework.NodeOutputOrBuilder [^NodeExecStatsOrBuilder this ^Integer index]
    (-> this (.getOutputOrBuilder index))))

(defn get-memory-or-builder-list
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.AllocatorMemoryUsedOrBuilder>`"
  ([^NodeExecStatsOrBuilder this]
    (-> this (.getMemoryOrBuilderList))))

(defn get-op-end-rel-micros
  "int64 op_end_rel_micros = 4;

  returns: `long`"
  (^Long [^NodeExecStatsOrBuilder this]
    (-> this (.getOpEndRelMicros))))

(defn has-memory-stats?
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `boolean`"
  (^Boolean [^NodeExecStatsOrBuilder this]
    (-> this (.hasMemoryStats))))

(defn get-output-list
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `java.util.List<org.tensorflow.framework.NodeOutput>`"
  (^java.util.List [^NodeExecStatsOrBuilder this]
    (-> this (.getOutputList))))

(defn get-node-name
  "TODO(tucker): Use some more compact form of node identity than
   the full string name.  Either all processes should agree on a
   global id (cost_id?) for each node, or we should use a hash of
   the name.
  string node_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeExecStatsOrBuilder this]
    (-> this (.getNodeName))))

(defn get-node-name-bytes
  "TODO(tucker): Use some more compact form of node identity than
   the full string name.  Either all processes should agree on a
   global id (cost_id?) for each node, or we should use a hash of
   the name.
  string node_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeExecStatsOrBuilder this]
    (-> this (.getNodeNameBytes))))

(defn get-memory-stats
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `org.tensorflow.framework.MemoryStats`"
  (^org.tensorflow.framework.MemoryStats [^NodeExecStatsOrBuilder this]
    (-> this (.getMemoryStats))))

(defn get-timeline-label
  "string timeline_label = 8;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeExecStatsOrBuilder this]
    (-> this (.getTimelineLabel))))

(defn get-referenced-tensor-list
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `java.util.List<org.tensorflow.framework.AllocationDescription>`"
  (^java.util.List [^NodeExecStatsOrBuilder this]
    (-> this (.getReferencedTensorList))))

(defn get-output-count
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `int`"
  (^Integer [^NodeExecStatsOrBuilder this]
    (-> this (.getOutputCount))))

(defn get-scheduled-micros
  "int64 scheduled_micros = 9;

  returns: `long`"
  (^Long [^NodeExecStatsOrBuilder this]
    (-> this (.getScheduledMicros))))

(defn get-referenced-tensor
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`

  returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription [^NodeExecStatsOrBuilder this ^Integer index]
    (-> this (.getReferencedTensor index))))

(defn get-output-or-builder-list
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeOutputOrBuilder>`"
  ([^NodeExecStatsOrBuilder this]
    (-> this (.getOutputOrBuilderList))))

(defn get-memory-list
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `java.util.List<org.tensorflow.framework.AllocatorMemoryUsed>`"
  (^java.util.List [^NodeExecStatsOrBuilder this]
    (-> this (.getMemoryList))))

(defn get-referenced-tensor-count
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `int`"
  (^Integer [^NodeExecStatsOrBuilder this]
    (-> this (.getReferencedTensorCount))))

(defn get-op-start-rel-micros
  "int64 op_start_rel_micros = 3;

  returns: `long`"
  (^Long [^NodeExecStatsOrBuilder this]
    (-> this (.getOpStartRelMicros))))

(defn get-memory-count
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `int`"
  (^Integer [^NodeExecStatsOrBuilder this]
    (-> this (.getMemoryCount))))

(defn get-all-end-rel-micros
  "int64 all_end_rel_micros = 5;

  returns: `long`"
  (^Long [^NodeExecStatsOrBuilder this]
    (-> this (.getAllEndRelMicros))))

(defn get-output
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`

  returns: `org.tensorflow.framework.NodeOutput`"
  (^org.tensorflow.framework.NodeOutput [^NodeExecStatsOrBuilder this ^Integer index]
    (-> this (.getOutput index))))

(defn get-timeline-label-bytes
  "string timeline_label = 8;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeExecStatsOrBuilder this]
    (-> this (.getTimelineLabelBytes))))

(defn get-memory
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed`"
  (^org.tensorflow.framework.AllocatorMemoryUsed [^NodeExecStatsOrBuilder this ^Integer index]
    (-> this (.getMemory index))))

