(ns org.tensorflow.framework.NodeExecStats
  " Time/size stats recorded for a single execution of a graph node.
 Protobuf type tensorflow.NodeExecStats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NodeExecStats]))

(def *-node-name-field-number
  "Static Constant.

  type: int"
  NodeExecStats/NODE_NAME_FIELD_NUMBER)

(def *-all-start-micros-field-number
  "Static Constant.

  type: int"
  NodeExecStats/ALL_START_MICROS_FIELD_NUMBER)

(def *-op-start-rel-micros-field-number
  "Static Constant.

  type: int"
  NodeExecStats/OP_START_REL_MICROS_FIELD_NUMBER)

(def *-op-end-rel-micros-field-number
  "Static Constant.

  type: int"
  NodeExecStats/OP_END_REL_MICROS_FIELD_NUMBER)

(def *-all-end-rel-micros-field-number
  "Static Constant.

  type: int"
  NodeExecStats/ALL_END_REL_MICROS_FIELD_NUMBER)

(def *-memory-field-number
  "Static Constant.

  type: int"
  NodeExecStats/MEMORY_FIELD_NUMBER)

(def *-output-field-number
  "Static Constant.

  type: int"
  NodeExecStats/OUTPUT_FIELD_NUMBER)

(def *-timeline-label-field-number
  "Static Constant.

  type: int"
  NodeExecStats/TIMELINE_LABEL_FIELD_NUMBER)

(def *-scheduled-micros-field-number
  "Static Constant.

  type: int"
  NodeExecStats/SCHEDULED_MICROS_FIELD_NUMBER)

(def *-thread-id-field-number
  "Static Constant.

  type: int"
  NodeExecStats/THREAD_ID_FIELD_NUMBER)

(def *-referenced-tensor-field-number
  "Static Constant.

  type: int"
  NodeExecStats/REFERENCED_TENSOR_FIELD_NUMBER)

(def *-memory-stats-field-number
  "Static Constant.

  type: int"
  NodeExecStats/MEMORY_STATS_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (NodeExecStats/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NodeExecStats`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.NodeExecStats [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (NodeExecStats/parseFrom data extension-registry))
  (^org.tensorflow.framework.NodeExecStats [^java.nio.ByteBuffer data]
    (NodeExecStats/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NodeExecStats`

  throws: java.io.IOException"
  (^org.tensorflow.framework.NodeExecStats [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (NodeExecStats/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.NodeExecStats [^java.io.InputStream input]
    (NodeExecStats/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.NodeExecStats`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^org.tensorflow.framework.NodeExecStats prototype]
    (NodeExecStats/newBuilder prototype))
  (^org.tensorflow.framework.NodeExecStats$Builder []
    (NodeExecStats/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.NodeExecStats`"
  (^org.tensorflow.framework.NodeExecStats []
    (NodeExecStats/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.NodeExecStats>`"
  (^com.github.os72.protobuf351.Parser []
    (NodeExecStats/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^NodeExecStats this]
    (-> this (.getUnknownFields))))

(defn get-referenced-tensor-or-builder-list
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `java.util.List<? extends org.tensorflow.framework.AllocationDescriptionOrBuilder>`"
  ([^NodeExecStats this]
    (-> this (.getReferencedTensorOrBuilderList))))

(defn get-referenced-tensor-or-builder
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`

  returns: `org.tensorflow.framework.AllocationDescriptionOrBuilder`"
  (^org.tensorflow.framework.AllocationDescriptionOrBuilder [^NodeExecStats this ^Integer index]
    (-> this (.getReferencedTensorOrBuilder index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^NodeExecStats this]
    (-> this (.isInitialized))))

(defn get-memory-stats-or-builder
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `org.tensorflow.framework.MemoryStatsOrBuilder`"
  (^org.tensorflow.framework.MemoryStatsOrBuilder [^NodeExecStats this]
    (-> this (.getMemoryStatsOrBuilder))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.NodeExecStats`"
  (^org.tensorflow.framework.NodeExecStats [^NodeExecStats this]
    (-> this (.getDefaultInstanceForType))))

(defn get-all-start-micros
  "int64 all_start_micros = 2;

  returns: `long`"
  (^Long [^NodeExecStats this]
    (-> this (.getAllStartMicros))))

(defn get-thread-id
  "uint32 thread_id = 10;

  returns: `int`"
  (^Integer [^NodeExecStats this]
    (-> this (.getThreadId))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^NodeExecStats this]
    (-> this (.getSerializedSize))))

(defn get-memory-or-builder
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocatorMemoryUsedOrBuilder`"
  (^org.tensorflow.framework.AllocatorMemoryUsedOrBuilder [^NodeExecStats this ^Integer index]
    (-> this (.getMemoryOrBuilder index))))

(defn get-output-or-builder
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`

  returns: `org.tensorflow.framework.NodeOutputOrBuilder`"
  (^org.tensorflow.framework.NodeOutputOrBuilder [^NodeExecStats this ^Integer index]
    (-> this (.getOutputOrBuilder index))))

(defn get-memory-or-builder-list
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.AllocatorMemoryUsedOrBuilder>`"
  ([^NodeExecStats this]
    (-> this (.getMemoryOrBuilderList))))

(defn get-op-end-rel-micros
  "int64 op_end_rel_micros = 4;

  returns: `long`"
  (^Long [^NodeExecStats this]
    (-> this (.getOpEndRelMicros))))

(defn has-memory-stats?
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `boolean`"
  (^Boolean [^NodeExecStats this]
    (-> this (.hasMemoryStats))))

(defn get-output-list
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `java.util.List<org.tensorflow.framework.NodeOutput>`"
  (^java.util.List [^NodeExecStats this]
    (-> this (.getOutputList))))

(defn get-node-name
  "TODO(tucker): Use some more compact form of node identity than
   the full string name.  Either all processes should agree on a
   global id (cost_id?) for each node, or we should use a hash of
   the name.
  string node_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeExecStats this]
    (-> this (.getNodeName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^NodeExecStats this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-node-name-bytes
  "TODO(tucker): Use some more compact form of node identity than
   the full string name.  Either all processes should agree on a
   global id (cost_id?) for each node, or we should use a hash of
   the name.
  string node_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeExecStats this]
    (-> this (.getNodeNameBytes))))

(defn get-memory-stats
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `org.tensorflow.framework.MemoryStats`"
  (^org.tensorflow.framework.MemoryStats [^NodeExecStats this]
    (-> this (.getMemoryStats))))

(defn get-timeline-label
  "string timeline_label = 8;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeExecStats this]
    (-> this (.getTimelineLabel))))

(defn get-referenced-tensor-list
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `java.util.List<org.tensorflow.framework.AllocationDescription>`"
  (^java.util.List [^NodeExecStats this]
    (-> this (.getReferencedTensorList))))

(defn get-output-count
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `int`"
  (^Integer [^NodeExecStats this]
    (-> this (.getOutputCount))))

(defn get-scheduled-micros
  "int64 scheduled_micros = 9;

  returns: `long`"
  (^Long [^NodeExecStats this]
    (-> this (.getScheduledMicros))))

(defn get-referenced-tensor
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`

  returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription [^NodeExecStats this ^Integer index]
    (-> this (.getReferencedTensor index))))

(defn get-output-or-builder-list
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeOutputOrBuilder>`"
  ([^NodeExecStats this]
    (-> this (.getOutputOrBuilderList))))

(defn get-memory-list
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `java.util.List<org.tensorflow.framework.AllocatorMemoryUsed>`"
  (^java.util.List [^NodeExecStats this]
    (-> this (.getMemoryList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeExecStats this]
    (-> this (.hashCode))))

(defn get-referenced-tensor-count
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `int`"
  (^Integer [^NodeExecStats this]
    (-> this (.getReferencedTensorCount))))

(defn get-op-start-rel-micros
  "int64 op_start_rel_micros = 3;

  returns: `long`"
  (^Long [^NodeExecStats this]
    (-> this (.getOpStartRelMicros))))

(defn get-memory-count
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `int`"
  (^Integer [^NodeExecStats this]
    (-> this (.getMemoryCount))))

(defn get-all-end-rel-micros
  "int64 all_end_rel_micros = 5;

  returns: `long`"
  (^Long [^NodeExecStats this]
    (-> this (.getAllEndRelMicros))))

(defn get-output
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`

  returns: `org.tensorflow.framework.NodeOutput`"
  (^org.tensorflow.framework.NodeOutput [^NodeExecStats this ^Integer index]
    (-> this (.getOutput index))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.NodeExecStats>`"
  (^com.github.os72.protobuf351.Parser [^NodeExecStats this]
    (-> this (.getParserForType))))

(defn get-timeline-label-bytes
  "string timeline_label = 8;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeExecStats this]
    (-> this (.getTimelineLabelBytes))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeExecStats this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats this]
    (-> this (.newBuilderForType))))

(defn get-memory
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed`"
  (^org.tensorflow.framework.AllocatorMemoryUsed [^NodeExecStats this ^Integer index]
    (-> this (.getMemory index))))

(defn to-builder
  "returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats this]
    (-> this (.toBuilder))))

