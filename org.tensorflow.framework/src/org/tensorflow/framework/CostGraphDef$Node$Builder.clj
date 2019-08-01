(ns org.tensorflow.framework.CostGraphDef$Node$Builder
  "Protobuf type tensorflow.CostGraphDef.Node"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef$Node$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (CostGraphDef$Node$Builder/getDescriptor )))

(defn get-input-info-or-builder
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.getInputInfoOrBuilder index))))

(defn clear-name
  "The name of the node. Names are globally unique.
  string name = 1;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearName))))

(defn get-input-info-or-builder-list
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder>`"
  ([^CostGraphDef$Node$Builder this]
    (-> this (.getInputInfoOrBuilderList))))

(defn add-all-output-info
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOutputInfo values))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-output-info
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.getOutputInfo index))))

(defn remove-input-info
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.removeInputInfo index))))

(defn set-device
  "The device of the node. Can be empty if the node is mapped to the
   default partition or partitioning hasn't been run yet.
  string device = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^java.lang.String value]
    (-> this (.setDevice value))))

(defn build-partial
  "returns: `org.tensorflow.framework.CostGraphDef$Node`"
  (^org.tensorflow.framework.CostGraphDef$Node [^CostGraphDef$Node$Builder this]
    (-> this (.buildPartial))))

(defn clear-host-persistent-memory-size
  "int64 host_persistent_memory_size = 12;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearHostPersistentMemorySize))))

(defn set-control-input
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  index - `int`
  value - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Integer index ^Integer value]
    (-> this (.setControlInput index value))))

(defn set-is-final
  "If true, the output is permanent: it can't be discarded, because this
   node is part of the \"final output\". Nodes may depend on final nodes.
  bool is_final = 7;

  value - `boolean`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Boolean value]
    (-> this (.setIsFinal value))))

(defn clear-compute-time
  "Analytical estimate of the computational cost of this node, in
   microseconds.
  int64 compute_time = 14;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearComputeTime))))

(defn add-output-info
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`
  value - `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Integer index ^org.tensorflow.framework.CostGraphDef$Node$OutputInfo value]
    (-> this (.addOutputInfo index value)))
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^org.tensorflow.framework.CostGraphDef$Node$OutputInfo value]
    (-> this (.addOutputInfo value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$Builder this]
    (-> this (.isInitialized))))

(defn clear-host-temp-memory-size
  "int64 host_temp_memory_size = 10;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearHostTempMemorySize))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.CostGraphDef$Node`"
  (^org.tensorflow.framework.CostGraphDef$Node [^CostGraphDef$Node$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-output-info
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`
  value - `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Integer index ^org.tensorflow.framework.CostGraphDef$Node$OutputInfo value]
    (-> this (.setOutputInfo index value))))

(defn get-device-persistent-memory-size
  "int64 device_persistent_memory_size = 16;

  returns: `long`"
  (^Long [^CostGraphDef$Node$Builder this]
    (-> this (.getDevicePersistentMemorySize))))

(defn get-name-bytes
  "The name of the node. Names are globally unique.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^CostGraphDef$Node$Builder this]
    (-> this (.getNameBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "The name of the node. Names are globally unique.
  string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn set-device-bytes
  "The device of the node. Can be empty if the node is mapped to the
   default partition or partitioning hasn't been run yet.
  string device = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDeviceBytes value))))

(defn clear-device-persistent-memory-size
  "int64 device_persistent_memory_size = 16;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearDevicePersistentMemorySize))))

(defn clear-compute-cost
  "Estimate of the computational cost of this node, in microseconds.
  int64 compute_cost = 9;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearComputeCost))))

(defn set-host-persistent-memory-size
  "int64 host_persistent_memory_size = 12;

  value - `long`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Long value]
    (-> this (.setHostPersistentMemorySize value))))

(defn get-name
  "The name of the node. Names are globally unique.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^CostGraphDef$Node$Builder this]
    (-> this (.getName))))

(defn set-id
  "The id of the node. Node ids are only unique inside a partition.
  int32 id = 3;

  value - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Integer value]
    (-> this (.setId value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-host-temp-memory-size
  "int64 host_temp_memory_size = 10;

  value - `long`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Long value]
    (-> this (.setHostTempMemorySize value))))

(defn get-is-final?
  "If true, the output is permanent: it can't be discarded, because this
   node is part of the \"final output\". Nodes may depend on final nodes.
  bool is_final = 7;

  returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$Builder this]
    (-> this (.getIsFinal))))

(defn get-control-input-list
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^CostGraphDef$Node$Builder this]
    (-> this (.getControlInputList))))

(defn get-device-temp-memory-size
  "int64 device_temp_memory_size = 11;

  returns: `long`"
  (^Long [^CostGraphDef$Node$Builder this]
    (-> this (.getDeviceTempMemorySize))))

(defn set-name-bytes
  "The name of the node. Names are globally unique.
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn get-host-temp-memory-size
  "int64 host_temp_memory_size = 10;

  returns: `long`"
  (^Long [^CostGraphDef$Node$Builder this]
    (-> this (.getHostTempMemorySize))))

(defn add-all-input-info
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInputInfo values))))

(defn set-compute-cost
  "Estimate of the computational cost of this node, in microseconds.
  int64 compute_cost = 9;

  value - `long`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Long value]
    (-> this (.setComputeCost value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn add-all-control-input
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^java.lang.Iterable values]
    (-> this (.addAllControlInput values))))

(defn get-control-input
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  index - `int`

  returns: `int`"
  (^Integer [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.getControlInput index))))

(defn get-input-info-builder-list
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder>`"
  (^java.util.List [^CostGraphDef$Node$Builder this]
    (-> this (.getInputInfoBuilderList))))

(defn build
  "returns: `org.tensorflow.framework.CostGraphDef$Node`"
  (^org.tensorflow.framework.CostGraphDef$Node [^CostGraphDef$Node$Builder this]
    (-> this (.build))))

(defn clear-control-input
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearControlInput))))

(defn set-temporary-memory-size
  "Temporary memory used by this node.
  int64 temporary_memory_size = 6;

  value - `long`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Long value]
    (-> this (.setTemporaryMemorySize value))))

(defn get-device-bytes
  "The device of the node. Can be empty if the node is mapped to the
   default partition or partitioning hasn't been run yet.
  string device = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^CostGraphDef$Node$Builder this]
    (-> this (.getDeviceBytes))))

(defn get-device
  "The device of the node. Can be empty if the node is mapped to the
   default partition or partitioning hasn't been run yet.
  string device = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^CostGraphDef$Node$Builder this]
    (-> this (.getDevice))))

(defn clear-device-temp-memory-size
  "int64 device_temp_memory_size = 11;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearDeviceTempMemorySize))))

(defn get-input-info
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.getInputInfo index))))

(defn get-id
  "The id of the node. Node ids are only unique inside a partition.
  int32 id = 3;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$Builder this]
    (-> this (.getId))))

(defn set-device-temp-memory-size
  "int64 device_temp_memory_size = 11;

  value - `long`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Long value]
    (-> this (.setDeviceTempMemorySize value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-compute-time
  "Analytical estimate of the computational cost of this node, in
   microseconds.
  int64 compute_time = 14;

  returns: `long`"
  (^Long [^CostGraphDef$Node$Builder this]
    (-> this (.getComputeTime))))

(defn set-memory-time
  "Analytical estimate of the memory access cost of this node, in
   microseconds.
  int64 memory_time = 15;

  value - `long`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Long value]
    (-> this (.setMemoryTime value))))

(defn get-input-info-list
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node$InputInfo>`"
  (^java.util.List [^CostGraphDef$Node$Builder this]
    (-> this (.getInputInfoList))))

(defn get-output-info-or-builder-list
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `java.util.List<? extends org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder>`"
  ([^CostGraphDef$Node$Builder this]
    (-> this (.getOutputInfoOrBuilderList))))

(defn get-output-info-list
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node$OutputInfo>`"
  (^java.util.List [^CostGraphDef$Node$Builder this]
    (-> this (.getOutputInfoList))))

(defn get-output-info-builder
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.getOutputInfoBuilder index))))

(defn clear-device
  "The device of the node. Can be empty if the node is mapped to the
   default partition or partitioning hasn't been run yet.
  string device = 2;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearDevice))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn set-input-info
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`
  value - `org.tensorflow.framework.CostGraphDef$Node$InputInfo`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Integer index ^org.tensorflow.framework.CostGraphDef$Node$InputInfo value]
    (-> this (.setInputInfo index value))))

(defn remove-output-info
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.removeOutputInfo index))))

(defn clone
  "returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^CostGraphDef$Node$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-is-final
  "If true, the output is permanent: it can't be discarded, because this
   node is part of the \"final output\". Nodes may depend on final nodes.
  bool is_final = 7;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearIsFinal))))

(defn clear-input-info
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearInputInfo))))

(defn get-temporary-memory-size
  "Temporary memory used by this node.
  int64 temporary_memory_size = 6;

  returns: `long`"
  (^Long [^CostGraphDef$Node$Builder this]
    (-> this (.getTemporaryMemorySize))))

(defn set-compute-time
  "Analytical estimate of the computational cost of this node, in
   microseconds.
  int64 compute_time = 14;

  value - `long`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Long value]
    (-> this (.setComputeTime value))))

(defn add-output-info-builder
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.addOutputInfoBuilder index)))
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.addOutputInfoBuilder))))

(defn clear-memory-time
  "Analytical estimate of the memory access cost of this node, in
   microseconds.
  int64 memory_time = 15;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearMemoryTime))))

(defn get-output-info-or-builder
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.getOutputInfoOrBuilder index))))

(defn get-host-persistent-memory-size
  "int64 host_persistent_memory_size = 12;

  returns: `long`"
  (^Long [^CostGraphDef$Node$Builder this]
    (-> this (.getHostPersistentMemorySize))))

(defn get-output-info-count
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$Builder this]
    (-> this (.getOutputInfoCount))))

(defn get-input-info-count
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$Builder this]
    (-> this (.getInputInfoCount))))

(defn clear
  "returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clear))))

(defn add-input-info-builder
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.addInputInfoBuilder index)))
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.addInputInfoBuilder))))

(defn clear-temporary-memory-size
  "Temporary memory used by this node.
  int64 temporary_memory_size = 6;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearTemporaryMemorySize))))

(defn clear-output-info
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearOutputInfo))))

(defn get-input-info-builder
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$Builder this ^Integer index]
    (-> this (.getInputInfoBuilder index))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-device-persistent-memory-size
  "int64 device_persistent_memory_size = 16;

  value - `long`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Long value]
    (-> this (.setDevicePersistentMemorySize value))))

(defn add-control-input
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  value - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Integer value]
    (-> this (.addControlInput value))))

(defn get-control-input-count
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$Builder this]
    (-> this (.getControlInputCount))))

(defn get-output-info-builder-list
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node$OutputInfo$Builder>`"
  (^java.util.List [^CostGraphDef$Node$Builder this]
    (-> this (.getOutputInfoBuilderList))))

(defn get-memory-time
  "Analytical estimate of the memory access cost of this node, in
   microseconds.
  int64 memory_time = 15;

  returns: `long`"
  (^Long [^CostGraphDef$Node$Builder this]
    (-> this (.getMemoryTime))))

(defn add-input-info
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`
  value - `org.tensorflow.framework.CostGraphDef$Node$InputInfo`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^Integer index ^org.tensorflow.framework.CostGraphDef$Node$InputInfo value]
    (-> this (.addInputInfo index value)))
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this ^org.tensorflow.framework.CostGraphDef$Node$InputInfo value]
    (-> this (.addInputInfo value))))

(defn get-compute-cost
  "Estimate of the computational cost of this node, in microseconds.
  int64 compute_cost = 9;

  returns: `long`"
  (^Long [^CostGraphDef$Node$Builder this]
    (-> this (.getComputeCost))))

(defn clear-id
  "The id of the node. Node ids are only unique inside a partition.
  int32 id = 3;

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node$Builder this]
    (-> this (.clearId))))

