(ns org.tensorflow.framework.CostGraphDef$Node
  "Protobuf type tensorflow.CostGraphDef.Node"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef$Node]))

(def *-name-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/NAME_FIELD_NUMBER)

(def *-device-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/DEVICE_FIELD_NUMBER)

(def *-id-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/ID_FIELD_NUMBER)

(def *-input-info-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/INPUT_INFO_FIELD_NUMBER)

(def *-output-info-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/OUTPUT_INFO_FIELD_NUMBER)

(def *-temporary-memory-size-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/TEMPORARY_MEMORY_SIZE_FIELD_NUMBER)

(def *-host-temp-memory-size-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/HOST_TEMP_MEMORY_SIZE_FIELD_NUMBER)

(def *-device-temp-memory-size-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/DEVICE_TEMP_MEMORY_SIZE_FIELD_NUMBER)

(def *-host-persistent-memory-size-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/HOST_PERSISTENT_MEMORY_SIZE_FIELD_NUMBER)

(def *-device-persistent-memory-size-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/DEVICE_PERSISTENT_MEMORY_SIZE_FIELD_NUMBER)

(def *-compute-cost-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/COMPUTE_COST_FIELD_NUMBER)

(def *-compute-time-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/COMPUTE_TIME_FIELD_NUMBER)

(def *-memory-time-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/MEMORY_TIME_FIELD_NUMBER)

(def *-is-final-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/IS_FINAL_FIELD_NUMBER)

(def *-control-input-field-number
  "Static Constant.

  type: int"
  CostGraphDef$Node/CONTROL_INPUT_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (CostGraphDef$Node/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef$Node`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.CostGraphDef$Node [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (CostGraphDef$Node/parseFrom data extension-registry))
  (^org.tensorflow.framework.CostGraphDef$Node [^java.nio.ByteBuffer data]
    (CostGraphDef$Node/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef$Node`

  throws: java.io.IOException"
  (^org.tensorflow.framework.CostGraphDef$Node [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (CostGraphDef$Node/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.CostGraphDef$Node [^java.io.InputStream input]
    (CostGraphDef$Node/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.CostGraphDef$Node`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^org.tensorflow.framework.CostGraphDef$Node prototype]
    (CostGraphDef$Node/newBuilder prototype))
  (^org.tensorflow.framework.CostGraphDef$Node$Builder []
    (CostGraphDef$Node/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.CostGraphDef$Node`"
  (^org.tensorflow.framework.CostGraphDef$Node []
    (CostGraphDef$Node/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.CostGraphDef$Node>`"
  (^com.github.os72.protobuf351.Parser []
    (CostGraphDef$Node/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^CostGraphDef$Node this]
    (-> this (.getUnknownFields))))

(defn get-input-info-or-builder
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder [^CostGraphDef$Node this ^Integer index]
    (-> this (.getInputInfoOrBuilder index))))

(defn get-input-info-or-builder-list
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.CostGraphDef$Node$InputInfoOrBuilder>`"
  ([^CostGraphDef$Node this]
    (-> this (.getInputInfoOrBuilderList))))

(defn get-output-info
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfo [^CostGraphDef$Node this ^Integer index]
    (-> this (.getOutputInfo index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^CostGraphDef$Node this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.CostGraphDef$Node`"
  (^org.tensorflow.framework.CostGraphDef$Node [^CostGraphDef$Node this]
    (-> this (.getDefaultInstanceForType))))

(defn get-device-persistent-memory-size
  "int64 device_persistent_memory_size = 16;

  returns: `long`"
  (^Long [^CostGraphDef$Node this]
    (-> this (.getDevicePersistentMemorySize))))

(defn get-name-bytes
  "The name of the node. Names are globally unique.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^CostGraphDef$Node this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^CostGraphDef$Node this]
    (-> this (.getSerializedSize))))

(defn get-name
  "The name of the node. Names are globally unique.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^CostGraphDef$Node this]
    (-> this (.getName))))

(defn get-is-final?
  "If true, the output is permanent: it can't be discarded, because this
   node is part of the \"final output\". Nodes may depend on final nodes.
  bool is_final = 7;

  returns: `boolean`"
  (^Boolean [^CostGraphDef$Node this]
    (-> this (.getIsFinal))))

(defn get-control-input-list
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^CostGraphDef$Node this]
    (-> this (.getControlInputList))))

(defn get-device-temp-memory-size
  "int64 device_temp_memory_size = 11;

  returns: `long`"
  (^Long [^CostGraphDef$Node this]
    (-> this (.getDeviceTempMemorySize))))

(defn get-host-temp-memory-size
  "int64 host_temp_memory_size = 10;

  returns: `long`"
  (^Long [^CostGraphDef$Node this]
    (-> this (.getHostTempMemorySize))))

(defn get-control-input
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  index - `int`

  returns: `int`"
  (^Integer [^CostGraphDef$Node this ^Integer index]
    (-> this (.getControlInput index))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^CostGraphDef$Node this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-device-bytes
  "The device of the node. Can be empty if the node is mapped to the
   default partition or partitioning hasn't been run yet.
  string device = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^CostGraphDef$Node this]
    (-> this (.getDeviceBytes))))

(defn get-device
  "The device of the node. Can be empty if the node is mapped to the
   default partition or partitioning hasn't been run yet.
  string device = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^CostGraphDef$Node this]
    (-> this (.getDevice))))

(defn get-input-info
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^CostGraphDef$Node this ^Integer index]
    (-> this (.getInputInfo index))))

(defn get-id
  "The id of the node. Node ids are only unique inside a partition.
  int32 id = 3;

  returns: `int`"
  (^Integer [^CostGraphDef$Node this]
    (-> this (.getId))))

(defn get-compute-time
  "Analytical estimate of the computational cost of this node, in
   microseconds.
  int64 compute_time = 14;

  returns: `long`"
  (^Long [^CostGraphDef$Node this]
    (-> this (.getComputeTime))))

(defn get-input-info-list
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node$InputInfo>`"
  (^java.util.List [^CostGraphDef$Node this]
    (-> this (.getInputInfoList))))

(defn get-output-info-or-builder-list
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `java.util.List<? extends org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder>`"
  ([^CostGraphDef$Node this]
    (-> this (.getOutputInfoOrBuilderList))))

(defn get-output-info-list
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node$OutputInfo>`"
  (^java.util.List [^CostGraphDef$Node this]
    (-> this (.getOutputInfoList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^CostGraphDef$Node this]
    (-> this (.hashCode))))

(defn get-temporary-memory-size
  "Temporary memory used by this node.
  int64 temporary_memory_size = 6;

  returns: `long`"
  (^Long [^CostGraphDef$Node this]
    (-> this (.getTemporaryMemorySize))))

(defn get-output-info-or-builder
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder`"
  (^org.tensorflow.framework.CostGraphDef$Node$OutputInfoOrBuilder [^CostGraphDef$Node this ^Integer index]
    (-> this (.getOutputInfoOrBuilder index))))

(defn get-host-persistent-memory-size
  "int64 host_persistent_memory_size = 12;

  returns: `long`"
  (^Long [^CostGraphDef$Node this]
    (-> this (.getHostPersistentMemorySize))))

(defn get-output-info-count
  "repeated .tensorflow.CostGraphDef.Node.OutputInfo output_info = 5;

  returns: `int`"
  (^Integer [^CostGraphDef$Node this]
    (-> this (.getOutputInfoCount))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.CostGraphDef$Node>`"
  (^com.github.os72.protobuf351.Parser [^CostGraphDef$Node this]
    (-> this (.getParserForType))))

(defn get-input-info-count
  "repeated .tensorflow.CostGraphDef.Node.InputInfo input_info = 4;

  returns: `int`"
  (^Integer [^CostGraphDef$Node this]
    (-> this (.getInputInfoCount))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^CostGraphDef$Node this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node this]
    (-> this (.newBuilderForType))))

(defn get-control-input-count
  "Ids of the control inputs for this node.
  repeated int32 control_input = 8;

  returns: `int`"
  (^Integer [^CostGraphDef$Node this]
    (-> this (.getControlInputCount))))

(defn get-memory-time
  "Analytical estimate of the memory access cost of this node, in
   microseconds.
  int64 memory_time = 15;

  returns: `long`"
  (^Long [^CostGraphDef$Node this]
    (-> this (.getMemoryTime))))

(defn get-compute-cost
  "Estimate of the computational cost of this node, in microseconds.
  int64 compute_cost = 9;

  returns: `long`"
  (^Long [^CostGraphDef$Node this]
    (-> this (.getComputeCost))))

(defn to-builder
  "returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Node this]
    (-> this (.toBuilder))))

