(ns org.tensorflow.framework.KernelDef
  "Protobuf type tensorflow.KernelDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework KernelDef]))

(def *-op-field-number
  "Static Constant.

  type: int"
  KernelDef/OP_FIELD_NUMBER)

(def *-device-type-field-number
  "Static Constant.

  type: int"
  KernelDef/DEVICE_TYPE_FIELD_NUMBER)

(def *-constraint-field-number
  "Static Constant.

  type: int"
  KernelDef/CONSTRAINT_FIELD_NUMBER)

(def *-host-memory-arg-field-number
  "Static Constant.

  type: int"
  KernelDef/HOST_MEMORY_ARG_FIELD_NUMBER)

(def *-label-field-number
  "Static Constant.

  type: int"
  KernelDef/LABEL_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (KernelDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.KernelDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.KernelDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (KernelDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.KernelDef [^java.nio.ByteBuffer data]
    (KernelDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.KernelDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.KernelDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (KernelDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.KernelDef [^java.io.InputStream input]
    (KernelDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.KernelDef`

  returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^org.tensorflow.framework.KernelDef prototype]
    (KernelDef/newBuilder prototype))
  (^org.tensorflow.framework.KernelDef$Builder []
    (KernelDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.KernelDef`"
  (^org.tensorflow.framework.KernelDef []
    (KernelDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.KernelDef>`"
  (^com.github.os72.protobuf351.Parser []
    (KernelDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^KernelDef this]
    (-> this (.getUnknownFields))))

(defn get-host-memory-arg-count
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  returns: `int`"
  (^Integer [^KernelDef this]
    (-> this (.getHostMemoryArgCount))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^KernelDef this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.KernelDef`"
  (^org.tensorflow.framework.KernelDef [^KernelDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-device-type
  "Type of device this kernel runs on.
  string device_type = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef this]
    (-> this (.getDeviceType))))

(defn get-constraint
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^KernelDef this ^Integer index]
    (-> this (.getConstraint index))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^KernelDef this]
    (-> this (.getSerializedSize))))

(defn get-host-memory-arg-list
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^KernelDef this]
    (-> this (.getHostMemoryArgList))))

(defn get-constraint-list
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `java.util.List<org.tensorflow.framework.KernelDef$AttrConstraint>`"
  (^java.util.List [^KernelDef this]
    (-> this (.getConstraintList))))

(defn get-constraint-or-builder
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  index - `int`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder [^KernelDef this ^Integer index]
    (-> this (.getConstraintOrBuilder index))))

(defn get-host-memory-arg-bytes
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef this ^Integer index]
    (-> this (.getHostMemoryArgBytes index))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^KernelDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-constraint-or-builder-list
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.KernelDef$AttrConstraintOrBuilder>`"
  ([^KernelDef this]
    (-> this (.getConstraintOrBuilderList))))

(defn get-constraint-count
  "repeated .tensorflow.KernelDef.AttrConstraint constraint = 3;

  returns: `int`"
  (^Integer [^KernelDef this]
    (-> this (.getConstraintCount))))

(defn get-label
  "This allows experimental kernels to be registered for an op that
   won't be used unless the user specifies a \"_kernel\" attr with
   value matching this.
  string label = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef this]
    (-> this (.getLabel))))

(defn get-device-type-bytes
  "Type of device this kernel runs on.
  string device_type = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef this]
    (-> this (.getDeviceTypeBytes))))

(defn get-op-bytes
  "Must match the name of an Op.
  string op = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef this]
    (-> this (.getOpBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^KernelDef this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.KernelDef>`"
  (^com.github.os72.protobuf351.Parser [^KernelDef this]
    (-> this (.getParserForType))))

(defn get-op
  "Must match the name of an Op.
  string op = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef this]
    (-> this (.getOp))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^KernelDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef this]
    (-> this (.newBuilderForType))))

(defn get-host-memory-arg
  "Names of the Op's input_/output_args that reside in host memory
   instead of device memory.
  repeated string host_memory_arg = 4;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef this ^Integer index]
    (-> this (.getHostMemoryArg index))))

(defn to-builder
  "returns: `org.tensorflow.framework.KernelDef$Builder`"
  (^org.tensorflow.framework.KernelDef$Builder [^KernelDef this]
    (-> this (.toBuilder))))

(defn get-label-bytes
  "This allows experimental kernels to be registered for an op that
   won't be used unless the user specifies a \"_kernel\" attr with
   value matching this.
  string label = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef this]
    (-> this (.getLabelBytes))))

