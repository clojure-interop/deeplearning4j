(ns org.tensorflow.framework.KernelDef$Builder
  "Protobuf type tensorflow.KernelDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework KernelDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (KernelDef$Builder/getDescriptor )))

(defn add-host-memory-arg-bytes
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addHostMemoryArgBytes value))))

(defn get-host-memory-arg-count
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  returns: `int`"
  (^Integer [^KernelDef$Builder this]
    (-> this (.getHostMemoryArgCount))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-op-bytes
  "Must match the name of an Op.
  string op = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setOpBytes value))))

(defn set-op
  "Must match the name of an Op.
  string op = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^java.lang.String value]
    (-> this (.setOp value))))

(defn set-device-type
  "Type of device this kernel runs on.
  string device_type = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^java.lang.String value]
    (-> this (.setDeviceType value))))

(defn build-partial
  "returns: `org.tensorflow.framework.KernelDef`"
  (^org.tensorflow.framework.KernelDef [^KernelDef$Builder this]
    (-> this (.buildPartial))))

(defn get-constraint-builder
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$Builder this ^Integer index]
    (-> this (.getConstraintBuilder index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^KernelDef$Builder this]
    (-> this (.isInitialized))))

(defn add-all-host-memory-arg
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllHostMemoryArg values))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.KernelDef`"
  (^org.tensorflow.framework.KernelDef [^KernelDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-label-bytes
  "This allows experimental kernels to be registered for an op that
   won't be used unless the user specifies a \"_kernel\" attr with
   value matching this.
  string label = 5;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setLabelBytes value))))

(defn get-device-type
  "Type of device this kernel runs on.
  string device_type = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef$Builder this]
    (-> this (.getDeviceType))))

(defn clear-label
  "This allows experimental kernels to be registered for an op that
   won't be used unless the user specifies a \"_kernel\" attr with
   value matching this.
  string label = 5;

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this]
    (-> this (.clearLabel))))

(defn get-constraint
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^KernelDef$Builder this ^Integer index]
    (-> this (.getConstraint index))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-host-memory-arg-list
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^KernelDef$Builder this]
    (-> this (.getHostMemoryArgList))))

(defn get-constraint-list
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `java.util.List<org.tensorflow.framework.KernelDef$AttrConstraint>`"
  (^java.util.List [^KernelDef$Builder this]
    (-> this (.getConstraintList))))

(defn clear-device-type
  "Type of device this kernel runs on.
  string device_type = 2;

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this]
    (-> this (.clearDeviceType))))

(defn get-constraint-or-builder
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder [^KernelDef$Builder this ^Integer index]
    (-> this (.getConstraintOrBuilder index))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-op
  "Must match the name of an Op.
  string op = 1;

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this]
    (-> this (.clearOp))))

(defn get-host-memory-arg-bytes
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef$Builder this ^Integer index]
    (-> this (.getHostMemoryArgBytes index))))

(defn get-constraint-builder-list
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `java.util.List<org.tensorflow.framework.KernelDef$AttrConstraint$Builder>`"
  (^java.util.List [^KernelDef$Builder this]
    (-> this (.getConstraintBuilderList))))

(defn add-constraint
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`
  value - `org.tensorflow.framework.KernelDef$AttrConstraint`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^Integer index ^org.tensorflow.framework.KernelDef$AttrConstraint value]
    (-> this (.addConstraint index value)))
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^org.tensorflow.framework.KernelDef$AttrConstraint value]
    (-> this (.addConstraint value))))

(defn add-host-memory-arg
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^java.lang.String value]
    (-> this (.addHostMemoryArg value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.KernelDef`"
  (^org.tensorflow.framework.KernelDef [^KernelDef$Builder this]
    (-> this (.build))))

(defn get-constraint-or-builder-list
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder>`"
  ([^KernelDef$Builder this]
    (-> this (.getConstraintOrBuilderList))))

(defn get-constraint-count
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `int`"
  (^Integer [^KernelDef$Builder this]
    (-> this (.getConstraintCount))))

(defn get-label
  "This allows experimental kernels to be registered for an op that
   won't be used unless the user specifies a \"_kernel\" attr with
   value matching this.
  string label = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef$Builder this]
    (-> this (.getLabel))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.KernelDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-constraint
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this]
    (-> this (.clearConstraint))))

(defn remove-constraint
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^Integer index]
    (-> this (.removeConstraint index))))

(defn get-device-type-bytes
  "Type of device this kernel runs on.
  string device_type = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef$Builder this]
    (-> this (.getDeviceTypeBytes))))

(defn add-all-constraint
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllConstraint values))))

(defn set-constraint
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`
  value - `org.tensorflow.framework.KernelDef$AttrConstraint`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^Integer index ^org.tensorflow.framework.KernelDef$AttrConstraint value]
    (-> this (.setConstraint index value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^KernelDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-op-bytes
  "Must match the name of an Op.
  string op = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef$Builder this]
    (-> this (.getOpBytes))))

(defn clear
  "returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this]
    (-> this (.clear))))

(defn get-op
  "Must match the name of an Op.
  string op = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef$Builder this]
    (-> this (.getOp))))

(defn clear-host-memory-arg
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this]
    (-> this (.clearHostMemoryArg))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn add-constraint-builder
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$Builder this ^Integer index]
    (-> this (.addConstraintBuilder index)))
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$Builder this]
    (-> this (.addConstraintBuilder))))

(defn set-host-memory-arg
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  index - `int`
  value - `java.lang.String`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^Integer index ^java.lang.String value]
    (-> this (.setHostMemoryArg index value))))

(defn get-host-memory-arg
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef$Builder this ^Integer index]
    (-> this (.getHostMemoryArg index))))

(defn set-label
  "This allows experimental kernels to be registered for an op that
   won't be used unless the user specifies a \"_kernel\" attr with
   value matching this.
  string label = 5;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^java.lang.String value]
    (-> this (.setLabel value))))

(defn get-label-bytes
  "This allows experimental kernels to be registered for an op that
   won't be used unless the user specifies a \"_kernel\" attr with
   value matching this.
  string label = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef$Builder this]
    (-> this (.getLabelBytes))))

(defn set-device-type-bytes
  "Type of device this kernel runs on.
  string device_type = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDeviceTypeBytes value))))

