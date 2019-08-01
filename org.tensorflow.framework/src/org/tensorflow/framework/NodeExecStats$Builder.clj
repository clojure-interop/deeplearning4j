(ns org.tensorflow.framework.NodeExecStats$Builder
  " Time/size stats recorded for a single execution of a graph node.
 Protobuf type tensorflow.NodeExecStats"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NodeExecStats$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (NodeExecStats$Builder/getDescriptor )))

(defn clear-output
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearOutput))))

(defn set-node-name-bytes
  "TODO(tucker): Use some more compact form of node identity than
   the full string name.  Either all processes should agree on a
   global id (cost_id?) for each node, or we should use a hash of
   the name.
  string node_name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNodeNameBytes value))))

(defn clear-scheduled-micros
  "int64 scheduled_micros = 9;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearScheduledMicros))))

(defn add-output-builder
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.addOutputBuilder index)))
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeExecStats$Builder this]
    (-> this (.addOutputBuilder))))

(defn set-timeline-label-bytes
  "string timeline_label = 8;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setTimelineLabelBytes value))))

(defn get-referenced-tensor-or-builder-list
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `java.util.List<? extends org.tensorflow.framework.AllocationDescriptionOrBuilder>`"
  ([^NodeExecStats$Builder this]
    (-> this (.getReferencedTensorOrBuilderList))))

(defn get-referenced-tensor-builder
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.getReferencedTensorBuilder index))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn clear-op-start-rel-micros
  "int64 op_start_rel_micros = 3;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearOpStartRelMicros))))

(defn get-referenced-tensor-or-builder
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`

  returns: `org.tensorflow.framework.AllocationDescriptionOrBuilder`"
  (^org.tensorflow.framework.AllocationDescriptionOrBuilder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.getReferencedTensorOrBuilder index))))

(defn get-memory-builder
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.getMemoryBuilder index))))

(defn build-partial
  "returns: `org.tensorflow.framework.NodeExecStats`"
  (^org.tensorflow.framework.NodeExecStats [^NodeExecStats$Builder this]
    (-> this (.buildPartial))))

(defn clear-op-end-rel-micros
  "int64 op_end_rel_micros = 4;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearOpEndRelMicros))))

(defn add-all-referenced-tensor
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^java.lang.Iterable values]
    (-> this (.addAllReferencedTensor values))))

(defn remove-referenced-tensor
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.removeReferencedTensor index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^NodeExecStats$Builder this]
    (-> this (.isInitialized))))

(defn set-thread-id
  "uint32 thread_id = 10;

  value - `int`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Integer value]
    (-> this (.setThreadId value))))

(defn clear-memory
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearMemory))))

(defn remove-output
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.removeOutput index))))

(defn get-output-builder-list
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `java.util.List<org.tensorflow.framework.NodeOutput$Builder>`"
  (^java.util.List [^NodeExecStats$Builder this]
    (-> this (.getOutputBuilderList))))

(defn get-memory-stats-or-builder
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `org.tensorflow.framework.MemoryStatsOrBuilder`"
  (^org.tensorflow.framework.MemoryStatsOrBuilder [^NodeExecStats$Builder this]
    (-> this (.getMemoryStatsOrBuilder))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.NodeExecStats`"
  (^org.tensorflow.framework.NodeExecStats [^NodeExecStats$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-all-start-micros
  "int64 all_start_micros = 2;

  returns: `long`"
  (^Long [^NodeExecStats$Builder this]
    (-> this (.getAllStartMicros))))

(defn get-thread-id
  "uint32 thread_id = 10;

  returns: `int`"
  (^Integer [^NodeExecStats$Builder this]
    (-> this (.getThreadId))))

(defn set-output
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`
  value - `org.tensorflow.framework.NodeOutput`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Integer index ^org.tensorflow.framework.NodeOutput value]
    (-> this (.setOutput index value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn merge-memory-stats
  ".tensorflow.MemoryStats memory_stats = 12;

  value - `org.tensorflow.framework.MemoryStats`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^org.tensorflow.framework.MemoryStats value]
    (-> this (.mergeMemoryStats value))))

(defn remove-memory
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.removeMemory index))))

(defn add-referenced-tensor-builder
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`

  returns: `org.tensorflow.framework.AllocationDescription$Builder`"
  (^org.tensorflow.framework.AllocationDescription$Builder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.addReferencedTensorBuilder index)))
  (^org.tensorflow.framework.AllocationDescription$Builder [^NodeExecStats$Builder this]
    (-> this (.addReferencedTensorBuilder))))

(defn get-memory-or-builder
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocatorMemoryUsedOrBuilder`"
  (^org.tensorflow.framework.AllocatorMemoryUsedOrBuilder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.getMemoryOrBuilder index))))

(defn get-output-or-builder
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`

  returns: `org.tensorflow.framework.NodeOutputOrBuilder`"
  (^org.tensorflow.framework.NodeOutputOrBuilder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.getOutputOrBuilder index))))

(defn set-op-end-rel-micros
  "int64 op_end_rel_micros = 4;

  value - `long`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Long value]
    (-> this (.setOpEndRelMicros value))))

(defn get-memory-or-builder-list
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `java.util.List<? extends org.tensorflow.framework.AllocatorMemoryUsedOrBuilder>`"
  ([^NodeExecStats$Builder this]
    (-> this (.getMemoryOrBuilderList))))

(defn get-op-end-rel-micros
  "int64 op_end_rel_micros = 4;

  returns: `long`"
  (^Long [^NodeExecStats$Builder this]
    (-> this (.getOpEndRelMicros))))

(defn clear-memory-stats
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearMemoryStats))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn has-memory-stats?
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `boolean`"
  (^Boolean [^NodeExecStats$Builder this]
    (-> this (.hasMemoryStats))))

(defn add-all-output
  "repeated .tensorflow.NodeOutput output = 7;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOutput values))))

(defn get-output-list
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `java.util.List<org.tensorflow.framework.NodeOutput>`"
  (^java.util.List [^NodeExecStats$Builder this]
    (-> this (.getOutputList))))

(defn set-node-name
  "TODO(tucker): Use some more compact form of node identity than
   the full string name.  Either all processes should agree on a
   global id (cost_id?) for each node, or we should use a hash of
   the name.
  string node_name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^java.lang.String value]
    (-> this (.setNodeName value))))

(defn add-referenced-tensor
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`
  value - `org.tensorflow.framework.AllocationDescription`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Integer index ^org.tensorflow.framework.AllocationDescription value]
    (-> this (.addReferencedTensor index value)))
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^org.tensorflow.framework.AllocationDescription value]
    (-> this (.addReferencedTensor value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-referenced-tensor-builder-list
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `java.util.List<org.tensorflow.framework.AllocationDescription$Builder>`"
  (^java.util.List [^NodeExecStats$Builder this]
    (-> this (.getReferencedTensorBuilderList))))

(defn get-node-name
  "TODO(tucker): Use some more compact form of node identity than
   the full string name.  Either all processes should agree on a
   global id (cost_id?) for each node, or we should use a hash of
   the name.
  string node_name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeExecStats$Builder this]
    (-> this (.getNodeName))))

(defn set-all-end-rel-micros
  "int64 all_end_rel_micros = 5;

  value - `long`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Long value]
    (-> this (.setAllEndRelMicros value))))

(defn build
  "returns: `org.tensorflow.framework.NodeExecStats`"
  (^org.tensorflow.framework.NodeExecStats [^NodeExecStats$Builder this]
    (-> this (.build))))

(defn get-node-name-bytes
  "TODO(tucker): Use some more compact form of node identity than
   the full string name.  Either all processes should agree on a
   global id (cost_id?) for each node, or we should use a hash of
   the name.
  string node_name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeExecStats$Builder this]
    (-> this (.getNodeNameBytes))))

(defn get-output-builder
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`

  returns: `org.tensorflow.framework.NodeOutput$Builder`"
  (^org.tensorflow.framework.NodeOutput$Builder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.getOutputBuilder index))))

(defn get-memory-stats
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `org.tensorflow.framework.MemoryStats`"
  (^org.tensorflow.framework.MemoryStats [^NodeExecStats$Builder this]
    (-> this (.getMemoryStats))))

(defn add-memory-builder
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed$Builder`"
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^NodeExecStats$Builder this ^Integer index]
    (-> this (.addMemoryBuilder index)))
  (^org.tensorflow.framework.AllocatorMemoryUsed$Builder [^NodeExecStats$Builder this]
    (-> this (.addMemoryBuilder))))

(defn get-timeline-label
  "string timeline_label = 8;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeExecStats$Builder this]
    (-> this (.getTimelineLabel))))

(defn set-memory-stats
  ".tensorflow.MemoryStats memory_stats = 12;

  value - `org.tensorflow.framework.MemoryStats`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^org.tensorflow.framework.MemoryStats value]
    (-> this (.setMemoryStats value))))

(defn get-referenced-tensor-list
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `java.util.List<org.tensorflow.framework.AllocationDescription>`"
  (^java.util.List [^NodeExecStats$Builder this]
    (-> this (.getReferencedTensorList))))

(defn get-output-count
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `int`"
  (^Integer [^NodeExecStats$Builder this]
    (-> this (.getOutputCount))))

(defn clear-all-end-rel-micros
  "int64 all_end_rel_micros = 5;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearAllEndRelMicros))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-memory-builder-list
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `java.util.List<org.tensorflow.framework.AllocatorMemoryUsed$Builder>`"
  (^java.util.List [^NodeExecStats$Builder this]
    (-> this (.getMemoryBuilderList))))

(defn add-output
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`
  value - `org.tensorflow.framework.NodeOutput`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Integer index ^org.tensorflow.framework.NodeOutput value]
    (-> this (.addOutput index value)))
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^org.tensorflow.framework.NodeOutput value]
    (-> this (.addOutput value))))

(defn get-scheduled-micros
  "int64 scheduled_micros = 9;

  returns: `long`"
  (^Long [^NodeExecStats$Builder this]
    (-> this (.getScheduledMicros))))

(defn get-referenced-tensor
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`

  returns: `org.tensorflow.framework.AllocationDescription`"
  (^org.tensorflow.framework.AllocationDescription [^NodeExecStats$Builder this ^Integer index]
    (-> this (.getReferencedTensor index))))

(defn add-memory
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`
  value - `org.tensorflow.framework.AllocatorMemoryUsed`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Integer index ^org.tensorflow.framework.AllocatorMemoryUsed value]
    (-> this (.addMemory index value)))
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^org.tensorflow.framework.AllocatorMemoryUsed value]
    (-> this (.addMemory value))))

(defn get-output-or-builder-list
  "repeated .tensorflow.NodeOutput output = 7;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeOutputOrBuilder>`"
  ([^NodeExecStats$Builder this]
    (-> this (.getOutputOrBuilderList))))

(defn get-memory-list
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `java.util.List<org.tensorflow.framework.AllocatorMemoryUsed>`"
  (^java.util.List [^NodeExecStats$Builder this]
    (-> this (.getMemoryList))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^NodeExecStats$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-scheduled-micros
  "int64 scheduled_micros = 9;

  value - `long`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Long value]
    (-> this (.setScheduledMicros value))))

(defn add-all-memory
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^java.lang.Iterable values]
    (-> this (.addAllMemory values))))

(defn get-referenced-tensor-count
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `int`"
  (^Integer [^NodeExecStats$Builder this]
    (-> this (.getReferencedTensorCount))))

(defn clear-node-name
  "TODO(tucker): Use some more compact form of node identity than
   the full string name.  Either all processes should agree on a
   global id (cost_id?) for each node, or we should use a hash of
   the name.
  string node_name = 1;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearNodeName))))

(defn clear-thread-id
  "uint32 thread_id = 10;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearThreadId))))

(defn get-op-start-rel-micros
  "int64 op_start_rel_micros = 3;

  returns: `long`"
  (^Long [^NodeExecStats$Builder this]
    (-> this (.getOpStartRelMicros))))

(defn get-memory-count
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  returns: `int`"
  (^Integer [^NodeExecStats$Builder this]
    (-> this (.getMemoryCount))))

(defn get-all-end-rel-micros
  "int64 all_end_rel_micros = 5;

  returns: `long`"
  (^Long [^NodeExecStats$Builder this]
    (-> this (.getAllEndRelMicros))))

(defn set-memory
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`
  value - `org.tensorflow.framework.AllocatorMemoryUsed`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Integer index ^org.tensorflow.framework.AllocatorMemoryUsed value]
    (-> this (.setMemory index value))))

(defn get-output
  "repeated .tensorflow.NodeOutput output = 7;

  index - `int`

  returns: `org.tensorflow.framework.NodeOutput`"
  (^org.tensorflow.framework.NodeOutput [^NodeExecStats$Builder this ^Integer index]
    (-> this (.getOutput index))))

(defn clear
  "returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clear))))

(defn get-memory-stats-builder
  ".tensorflow.MemoryStats memory_stats = 12;

  returns: `org.tensorflow.framework.MemoryStats$Builder`"
  (^org.tensorflow.framework.MemoryStats$Builder [^NodeExecStats$Builder this]
    (-> this (.getMemoryStatsBuilder))))

(defn set-op-start-rel-micros
  "int64 op_start_rel_micros = 3;

  value - `long`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Long value]
    (-> this (.setOpStartRelMicros value))))

(defn set-timeline-label
  "string timeline_label = 8;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^java.lang.String value]
    (-> this (.setTimelineLabel value))))

(defn clear-timeline-label
  "string timeline_label = 8;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearTimelineLabel))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-timeline-label-bytes
  "string timeline_label = 8;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeExecStats$Builder this]
    (-> this (.getTimelineLabelBytes))))

(defn set-referenced-tensor
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  index - `int`
  value - `org.tensorflow.framework.AllocationDescription`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Integer index ^org.tensorflow.framework.AllocationDescription value]
    (-> this (.setReferencedTensor index value))))

(defn clear-all-start-micros
  "int64 all_start_micros = 2;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearAllStartMicros))))

(defn set-all-start-micros
  "int64 all_start_micros = 2;

  value - `long`

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this ^Long value]
    (-> this (.setAllStartMicros value))))

(defn get-memory
  "repeated .tensorflow.AllocatorMemoryUsed memory = 6;

  index - `int`

  returns: `org.tensorflow.framework.AllocatorMemoryUsed`"
  (^org.tensorflow.framework.AllocatorMemoryUsed [^NodeExecStats$Builder this ^Integer index]
    (-> this (.getMemory index))))

(defn clear-referenced-tensor
  "repeated .tensorflow.AllocationDescription referenced_tensor = 11;

  returns: `org.tensorflow.framework.NodeExecStats$Builder`"
  (^org.tensorflow.framework.NodeExecStats$Builder [^NodeExecStats$Builder this]
    (-> this (.clearReferencedTensor))))

