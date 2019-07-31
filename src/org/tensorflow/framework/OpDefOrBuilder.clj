(ns org.tensorflow.framework.OpDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDefOrBuilder]))

(defn get-attr-or-builder
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$AttrDefOrBuilder`"
  (^org.tensorflow.framework.OpDef$AttrDefOrBuilder [^OpDefOrBuilder this ^Integer index]
    (-> this (.getAttrOrBuilder index))))

(defn get-output-arg-or-builder
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDefOrBuilder`"
  (^org.tensorflow.framework.OpDef$ArgDefOrBuilder [^OpDefOrBuilder this ^Integer index]
    (-> this (.getOutputArgOrBuilder index))))

(defn get-description-bytes
  "Additional, longer human-readable description of what the Op does.
  string description = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDefOrBuilder this]
    (-> this (.getDescriptionBytes))))

(defn get-input-arg-count
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `int`"
  (^Integer [^OpDefOrBuilder this]
    (-> this (.getInputArgCount))))

(defn has-deprecation?
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `boolean`"
  (^Boolean [^OpDefOrBuilder this]
    (-> this (.hasDeprecation))))

(defn get-attr-count
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `int`"
  (^Integer [^OpDefOrBuilder this]
    (-> this (.getAttrCount))))

(defn get-is-stateful?
  "By default Ops may be moved between devices.  Stateful ops should
   either not be moved, or should only be moved if that state can also
   be moved (e.g. via some sort of save / restore).
   Stateful ops are guaranteed to never be optimized away by Common
   Subexpression Elimination (CSE).
  bool is_stateful = 17;

  returns: `boolean`"
  (^Boolean [^OpDefOrBuilder this]
    (-> this (.getIsStateful))))

(defn get-output-arg-list
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `java.util.List<org.tensorflow.framework.OpDef$ArgDef>`"
  (^java.util.List [^OpDefOrBuilder this]
    (-> this (.getOutputArgList))))

(defn get-output-arg-count
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `int`"
  (^Integer [^OpDefOrBuilder this]
    (-> this (.getOutputArgCount))))

(defn get-name-bytes
  "Op names starting with an underscore are reserved for internal use.
   Names should be CamelCase and match the regexp \"[A-Z][a-zA-Z0-9_]*\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDefOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-attr-list
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `java.util.List<org.tensorflow.framework.OpDef$AttrDef>`"
  (^java.util.List [^OpDefOrBuilder this]
    (-> this (.getAttrList))))

(defn get-name
  "Op names starting with an underscore are reserved for internal use.
   Names should be CamelCase and match the regexp \"[A-Z][a-zA-Z0-9_]*\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDefOrBuilder this]
    (-> this (.getName))))

(defn get-deprecation-or-builder
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `org.tensorflow.framework.OpDeprecationOrBuilder`"
  (^org.tensorflow.framework.OpDeprecationOrBuilder [^OpDefOrBuilder this]
    (-> this (.getDeprecationOrBuilder))))

(defn get-attr
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$AttrDef`"
  (^org.tensorflow.framework.OpDef$AttrDef [^OpDefOrBuilder this ^Integer index]
    (-> this (.getAttr index))))

(defn get-description
  "Additional, longer human-readable description of what the Op does.
  string description = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDefOrBuilder this]
    (-> this (.getDescription))))

(defn get-summary
  "One-line human-readable description of what the Op does.
  string summary = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDefOrBuilder this]
    (-> this (.getSummary))))

(defn get-input-arg-or-builder-list
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDef$ArgDefOrBuilder>`"
  ([^OpDefOrBuilder this]
    (-> this (.getInputArgOrBuilderList))))

(defn get-input-arg-list
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `java.util.List<org.tensorflow.framework.OpDef$ArgDef>`"
  (^java.util.List [^OpDefOrBuilder this]
    (-> this (.getInputArgList))))

(defn get-output-arg-or-builder-list
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDef$ArgDefOrBuilder>`"
  ([^OpDefOrBuilder this]
    (-> this (.getOutputArgOrBuilderList))))

(defn get-summary-bytes
  "One-line human-readable description of what the Op does.
  string summary = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDefOrBuilder this]
    (-> this (.getSummaryBytes))))

(defn get-is-commutative?
  "True if the operation is commutative (\"op(a,b) == op(b,a)\" for all inputs)
  bool is_commutative = 18;

  returns: `boolean`"
  (^Boolean [^OpDefOrBuilder this]
    (-> this (.getIsCommutative))))

(defn get-allows-uninitialized-input?
  "By default, all inputs to an Op must be initialized Tensors.  Ops
   that may initialize tensors for the first time should set this
   field to true, to allow the Op to take an uninitialized Tensor as
   input.
  bool allows_uninitialized_input = 19;

  returns: `boolean`"
  (^Boolean [^OpDefOrBuilder this]
    (-> this (.getAllowsUninitializedInput))))

(defn get-input-arg
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef [^OpDefOrBuilder this ^Integer index]
    (-> this (.getInputArg index))))

(defn get-deprecation
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `org.tensorflow.framework.OpDeprecation`"
  (^org.tensorflow.framework.OpDeprecation [^OpDefOrBuilder this]
    (-> this (.getDeprecation))))

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
  (^Boolean [^OpDefOrBuilder this]
    (-> this (.getIsAggregate))))

(defn get-output-arg
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef [^OpDefOrBuilder this ^Integer index]
    (-> this (.getOutputArg index))))

(defn get-input-arg-or-builder
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDefOrBuilder`"
  (^org.tensorflow.framework.OpDef$ArgDefOrBuilder [^OpDefOrBuilder this ^Integer index]
    (-> this (.getInputArgOrBuilder index))))

(defn get-attr-or-builder-list
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDef$AttrDefOrBuilder>`"
  ([^OpDefOrBuilder this]
    (-> this (.getAttrOrBuilderList))))

