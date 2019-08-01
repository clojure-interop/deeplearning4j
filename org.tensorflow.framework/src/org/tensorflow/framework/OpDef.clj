(ns org.tensorflow.framework.OpDef
  " Defines an operation. A NodeDef in a GraphDef specifies an Op by
  using the \"op\" field which should match the name of a OpDef.
  LINT.IfChange
 Protobuf type tensorflow.OpDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDef]))

(def *-name-field-number
  "Static Constant.

  type: int"
  OpDef/NAME_FIELD_NUMBER)

(def *-input-arg-field-number
  "Static Constant.

  type: int"
  OpDef/INPUT_ARG_FIELD_NUMBER)

(def *-output-arg-field-number
  "Static Constant.

  type: int"
  OpDef/OUTPUT_ARG_FIELD_NUMBER)

(def *-attr-field-number
  "Static Constant.

  type: int"
  OpDef/ATTR_FIELD_NUMBER)

(def *-deprecation-field-number
  "Static Constant.

  type: int"
  OpDef/DEPRECATION_FIELD_NUMBER)

(def *-summary-field-number
  "Static Constant.

  type: int"
  OpDef/SUMMARY_FIELD_NUMBER)

(def *-description-field-number
  "Static Constant.

  type: int"
  OpDef/DESCRIPTION_FIELD_NUMBER)

(def *-is-commutative-field-number
  "Static Constant.

  type: int"
  OpDef/IS_COMMUTATIVE_FIELD_NUMBER)

(def *-is-aggregate-field-number
  "Static Constant.

  type: int"
  OpDef/IS_AGGREGATE_FIELD_NUMBER)

(def *-is-stateful-field-number
  "Static Constant.

  type: int"
  OpDef/IS_STATEFUL_FIELD_NUMBER)

(def *-allows-uninitialized-input-field-number
  "Static Constant.

  type: int"
  OpDef/ALLOWS_UNINITIALIZED_INPUT_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.OpDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.OpDef [^java.nio.ByteBuffer data]
    (OpDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.OpDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.OpDef [^java.io.InputStream input]
    (OpDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.OpDef`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^org.tensorflow.framework.OpDef prototype]
    (OpDef/newBuilder prototype))
  (^org.tensorflow.framework.OpDef$Builder []
    (OpDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef []
    (OpDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.OpDef>`"
  (^com.github.os72.protobuf351.Parser []
    (OpDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OpDef this]
    (-> this (.getUnknownFields))))

(defn get-attr-or-builder
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$AttrDefOrBuilder`"
  (^org.tensorflow.framework.OpDef$AttrDefOrBuilder [^OpDef this ^Integer index]
    (-> this (.getAttrOrBuilder index))))

(defn get-output-arg-or-builder
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDefOrBuilder`"
  (^org.tensorflow.framework.OpDef$ArgDefOrBuilder [^OpDef this ^Integer index]
    (-> this (.getOutputArgOrBuilder index))))

(defn get-description-bytes
  "Additional, longer human-readable description of what the Op does.
  string description = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef this]
    (-> this (.getDescriptionBytes))))

(defn get-input-arg-count
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `int`"
  (^Integer [^OpDef this]
    (-> this (.getInputArgCount))))

(defn has-deprecation?
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `boolean`"
  (^Boolean [^OpDef this]
    (-> this (.hasDeprecation))))

(defn get-attr-count
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `int`"
  (^Integer [^OpDef this]
    (-> this (.getAttrCount))))

(defn get-is-stateful?
  "By default Ops may be moved between devices.  Stateful ops should
   either not be moved, or should only be moved if that state can also
   be moved (e.g. via some sort of save / restore).
   Stateful ops are guaranteed to never be optimized away by Common
   Subexpression Elimination (CSE).
  bool is_stateful = 17;

  returns: `boolean`"
  (^Boolean [^OpDef this]
    (-> this (.getIsStateful))))

(defn get-output-arg-list
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `java.util.List<org.tensorflow.framework.OpDef$ArgDef>`"
  (^java.util.List [^OpDef this]
    (-> this (.getOutputArgList))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpDef this]
    (-> this (.isInitialized))))

(defn get-output-arg-count
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `int`"
  (^Integer [^OpDef this]
    (-> this (.getOutputArgCount))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^OpDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "Op names starting with an underscore are reserved for internal use.
   Names should be CamelCase and match the regexp \"[A-Z][a-zA-Z0-9_]*\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OpDef this]
    (-> this (.getSerializedSize))))

(defn get-attr-list
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `java.util.List<org.tensorflow.framework.OpDef$AttrDef>`"
  (^java.util.List [^OpDef this]
    (-> this (.getAttrList))))

(defn get-name
  "Op names starting with an underscore are reserved for internal use.
   Names should be CamelCase and match the regexp \"[A-Z][a-zA-Z0-9_]*\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef this]
    (-> this (.getName))))

(defn get-deprecation-or-builder
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `org.tensorflow.framework.OpDeprecationOrBuilder`"
  (^org.tensorflow.framework.OpDeprecationOrBuilder [^OpDef this]
    (-> this (.getDeprecationOrBuilder))))

(defn get-attr
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$AttrDef`"
  (^org.tensorflow.framework.OpDef$AttrDef [^OpDef this ^Integer index]
    (-> this (.getAttr index))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OpDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-description
  "Additional, longer human-readable description of what the Op does.
  string description = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef this]
    (-> this (.getDescription))))

(defn get-summary
  "One-line human-readable description of what the Op does.
  string summary = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef this]
    (-> this (.getSummary))))

(defn get-input-arg-or-builder-list
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDef$ArgDefOrBuilder>`"
  ([^OpDef this]
    (-> this (.getInputArgOrBuilderList))))

(defn get-input-arg-list
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `java.util.List<org.tensorflow.framework.OpDef$ArgDef>`"
  (^java.util.List [^OpDef this]
    (-> this (.getInputArgList))))

(defn get-output-arg-or-builder-list
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDef$ArgDefOrBuilder>`"
  ([^OpDef this]
    (-> this (.getOutputArgOrBuilderList))))

(defn get-summary-bytes
  "One-line human-readable description of what the Op does.
  string summary = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef this]
    (-> this (.getSummaryBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OpDef this]
    (-> this (.hashCode))))

(defn get-is-commutative?
  "True if the operation is commutative (\"op(a,b) == op(b,a)\" for all inputs)
  bool is_commutative = 18;

  returns: `boolean`"
  (^Boolean [^OpDef this]
    (-> this (.getIsCommutative))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.OpDef>`"
  (^com.github.os72.protobuf351.Parser [^OpDef this]
    (-> this (.getParserForType))))

(defn get-allows-uninitialized-input?
  "By default, all inputs to an Op must be initialized Tensors.  Ops
   that may initialize tensors for the first time should set this
   field to true, to allow the Op to take an uninitialized Tensor as
   input.
  bool allows_uninitialized_input = 19;

  returns: `boolean`"
  (^Boolean [^OpDef this]
    (-> this (.getAllowsUninitializedInput))))

(defn get-input-arg
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef [^OpDef this ^Integer index]
    (-> this (.getInputArg index))))

(defn get-deprecation
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `org.tensorflow.framework.OpDeprecation`"
  (^org.tensorflow.framework.OpDeprecation [^OpDef this]
    (-> this (.getDeprecation))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OpDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-is-aggregate?
  "If is_aggregate is true, then this operation accepts N >= 2
   inputs and produces 1 output all of the same type.  Should be
   associative and commutative, and produce output with the same
   shape as the input.  The optimizer may replace an aggregate op
   taking input from multiple devices with a tree of aggregate ops
   that aggregate locally within each device (and possibly within
   groups of nearby devices) before communicating.
   TODO(josh11b): Implement that optimization.
  bool is_aggregate = 16;

  returns: `boolean`"
  (^Boolean [^OpDef this]
    (-> this (.getIsAggregate))))

(defn get-output-arg
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef [^OpDef this ^Integer index]
    (-> this (.getOutputArg index))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef this]
    (-> this (.newBuilderForType))))

(defn get-input-arg-or-builder
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDefOrBuilder`"
  (^org.tensorflow.framework.OpDef$ArgDefOrBuilder [^OpDef this ^Integer index]
    (-> this (.getInputArgOrBuilder index))))

(defn to-builder
  "returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef this]
    (-> this (.toBuilder))))

(defn get-attr-or-builder-list
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDef$AttrDefOrBuilder>`"
  ([^OpDef this]
    (-> this (.getAttrOrBuilderList))))

