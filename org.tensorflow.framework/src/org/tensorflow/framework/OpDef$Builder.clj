(ns org.tensorflow.framework.OpDef$Builder
  " Defines an operation. A NodeDef in a GraphDef specifies an Op by
  using the \"op\" field which should match the name of a OpDef.
  LINT.IfChange
 Protobuf type tensorflow.OpDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpDef$Builder/getDescriptor )))

(defn clear-description
  "Additional, longer human-readable description of what the Op does.
  string description = 6;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearDescription))))

(defn clear-name
  "Op names starting with an underscore are reserved for internal use.
   Names should be CamelCase and match the regexp \"[A-Z][a-zA-Z0-9_]*\".
  string name = 1;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearName))))

(defn get-attr-or-builder
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$AttrDefOrBuilder`"
  (^org.tensorflow.framework.OpDef$AttrDefOrBuilder [^OpDef$Builder this ^Integer index]
    (-> this (.getAttrOrBuilder index))))

(defn get-output-arg-or-builder
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDefOrBuilder`"
  (^org.tensorflow.framework.OpDef$ArgDefOrBuilder [^OpDef$Builder this ^Integer index]
    (-> this (.getOutputArgOrBuilder index))))

(defn get-description-bytes
  "Additional, longer human-readable description of what the Op does.
  string description = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$Builder this]
    (-> this (.getDescriptionBytes))))

(defn get-input-arg-count
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `int`"
  (^Integer [^OpDef$Builder this]
    (-> this (.getInputArgCount))))

(defn set-description
  "Additional, longer human-readable description of what the Op does.
  string description = 6;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^java.lang.String value]
    (-> this (.setDescription value))))

(defn set-summary-bytes
  "One-line human-readable description of what the Op does.
  string summary = 5;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setSummaryBytes value))))

(defn has-deprecation?
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `boolean`"
  (^Boolean [^OpDef$Builder this]
    (-> this (.hasDeprecation))))

(defn get-attr-count
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `int`"
  (^Integer [^OpDef$Builder this]
    (-> this (.getAttrCount))))

(defn set-is-aggregate
  "If is_aggregate is true, then this operation accepts N >= 2
   inputs and produces 1 output all of the same type.  Should be
   associative and commutative, and produce output with the same
   shape as the input.  The optimizer may replace an aggregate op
   taking input from multiple devices with a tree of aggregate ops
   that aggregate locally within each device (and possibly within
   groups of nearby devices) before communicating.
   TODO(josh11b): Implement that optimization.
  bool is_aggregate = 16;

  value - `boolean`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Boolean value]
    (-> this (.setIsAggregate value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn remove-output-arg
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Integer index]
    (-> this (.removeOutputArg index))))

(defn set-is-commutative
  "True if the operation is commutative (\"op(a,b) == op(b,a)\" for all inputs)
  bool is_commutative = 18;

  value - `boolean`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Boolean value]
    (-> this (.setIsCommutative value))))

(defn set-allows-uninitialized-input
  "By default, all inputs to an Op must be initialized Tensors.  Ops
   that may initialize tensors for the first time should set this
   field to true, to allow the Op to take an uninitialized Tensor as
   input.
  bool allows_uninitialized_input = 19;

  value - `boolean`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Boolean value]
    (-> this (.setAllowsUninitializedInput value))))

(defn build-partial
  "returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^OpDef$Builder this]
    (-> this (.buildPartial))))

(defn get-is-stateful?
  "By default Ops may be moved between devices.  Stateful ops should
   either not be moved, or should only be moved if that state can also
   be moved (e.g. via some sort of save / restore).
   Stateful ops are guaranteed to never be optimized away by Common
   Subexpression Elimination (CSE).
  bool is_stateful = 17;

  returns: `boolean`"
  (^Boolean [^OpDef$Builder this]
    (-> this (.getIsStateful))))

(defn get-input-arg-builder-list
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `java.util.List<org.tensorflow.framework.OpDef$ArgDef$Builder>`"
  (^java.util.List [^OpDef$Builder this]
    (-> this (.getInputArgBuilderList))))

(defn get-output-arg-list
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `java.util.List<org.tensorflow.framework.OpDef$ArgDef>`"
  (^java.util.List [^OpDef$Builder this]
    (-> this (.getOutputArgList))))

(defn add-output-arg
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`
  value - `org.tensorflow.framework.OpDef$ArgDef`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Integer index ^org.tensorflow.framework.OpDef$ArgDef value]
    (-> this (.addOutputArg index value)))
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^org.tensorflow.framework.OpDef$ArgDef value]
    (-> this (.addOutputArg value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpDef$Builder this]
    (-> this (.isInitialized))))

(defn get-output-arg-count
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `int`"
  (^Integer [^OpDef$Builder this]
    (-> this (.getOutputArgCount))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^OpDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-deprecation
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  value - `org.tensorflow.framework.OpDeprecation`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^org.tensorflow.framework.OpDeprecation value]
    (-> this (.mergeDeprecation value))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-is-stateful
  "By default Ops may be moved between devices.  Stateful ops should
   either not be moved, or should only be moved if that state can also
   be moved (e.g. via some sort of save / restore).
   Stateful ops are guaranteed to never be optimized away by Common
   Subexpression Elimination (CSE).
  bool is_stateful = 17;

  value - `boolean`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Boolean value]
    (-> this (.setIsStateful value))))

(defn get-name-bytes
  "Op names starting with an underscore are reserved for internal use.
   Names should be CamelCase and match the regexp \"[A-Z][a-zA-Z0-9_]*\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$Builder this]
    (-> this (.getNameBytes))))

(defn add-all-output-arg
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOutputArg values))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-output-arg
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearOutputArg))))

(defn set-name
  "Op names starting with an underscore are reserved for internal use.
   Names should be CamelCase and match the regexp \"[A-Z][a-zA-Z0-9_]*\".
  string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn get-deprecation-builder
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDef$Builder this]
    (-> this (.getDeprecationBuilder))))

(defn clear-is-commutative
  "True if the operation is commutative (\"op(a,b) == op(b,a)\" for all inputs)
  bool is_commutative = 18;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearIsCommutative))))

(defn add-input-arg
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`
  value - `org.tensorflow.framework.OpDef$ArgDef`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Integer index ^org.tensorflow.framework.OpDef$ArgDef value]
    (-> this (.addInputArg index value)))
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^org.tensorflow.framework.OpDef$ArgDef value]
    (-> this (.addInputArg value))))

(defn set-description-bytes
  "Additional, longer human-readable description of what the Op does.
  string description = 6;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDescriptionBytes value))))

(defn remove-attr
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Integer index]
    (-> this (.removeAttr index))))

(defn get-attr-list
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `java.util.List<org.tensorflow.framework.OpDef$AttrDef>`"
  (^java.util.List [^OpDef$Builder this]
    (-> this (.getAttrList))))

(defn clear-allows-uninitialized-input
  "By default, all inputs to an Op must be initialized Tensors.  Ops
   that may initialize tensors for the first time should set this
   field to true, to allow the Op to take an uninitialized Tensor as
   input.
  bool allows_uninitialized_input = 19;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearAllowsUninitializedInput))))

(defn add-attr
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`
  value - `org.tensorflow.framework.OpDef$AttrDef`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Integer index ^org.tensorflow.framework.OpDef$AttrDef value]
    (-> this (.addAttr index value)))
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^org.tensorflow.framework.OpDef$AttrDef value]
    (-> this (.addAttr value))))

(defn add-all-attr
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllAttr values))))

(defn get-name
  "Op names starting with an underscore are reserved for internal use.
   Names should be CamelCase and match the regexp \"[A-Z][a-zA-Z0-9_]*\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-output-arg-builder-list
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `java.util.List<org.tensorflow.framework.OpDef$ArgDef$Builder>`"
  (^java.util.List [^OpDef$Builder this]
    (-> this (.getOutputArgBuilderList))))

(defn set-name-bytes
  "Op names starting with an underscore are reserved for internal use.
   Names should be CamelCase and match the regexp \"[A-Z][a-zA-Z0-9_]*\".
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn get-deprecation-or-builder
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `org.tensorflow.framework.OpDeprecationOrBuilder`"
  (^org.tensorflow.framework.OpDeprecationOrBuilder [^OpDef$Builder this]
    (-> this (.getDeprecationOrBuilder))))

(defn get-attr
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$AttrDef`"
  (^org.tensorflow.framework.OpDef$AttrDef [^OpDef$Builder this ^Integer index]
    (-> this (.getAttr index))))

(defn clear-attr
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearAttr))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn clear-summary
  "One-line human-readable description of what the Op does.
  string summary = 5;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearSummary))))

(defn build
  "returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^OpDef$Builder this]
    (-> this (.build))))

(defn get-description
  "Additional, longer human-readable description of what the Op does.
  string description = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$Builder this]
    (-> this (.getDescription))))

(defn get-output-arg-builder
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$Builder this ^Integer index]
    (-> this (.getOutputArgBuilder index))))

(defn add-input-arg-builder
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$Builder this ^Integer index]
    (-> this (.addInputArgBuilder index)))
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$Builder this]
    (-> this (.addInputArgBuilder))))

(defn get-summary
  "One-line human-readable description of what the Op does.
  string summary = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$Builder this]
    (-> this (.getSummary))))

(defn get-attr-builder-list
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `java.util.List<org.tensorflow.framework.OpDef$AttrDef$Builder>`"
  (^java.util.List [^OpDef$Builder this]
    (-> this (.getAttrBuilderList))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-is-stateful
  "By default Ops may be moved between devices.  Stateful ops should
   either not be moved, or should only be moved if that state can also
   be moved (e.g. via some sort of save / restore).
   Stateful ops are guaranteed to never be optimized away by Common
   Subexpression Elimination (CSE).
  bool is_stateful = 17;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearIsStateful))))

(defn get-input-arg-or-builder-list
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDef$ArgDefOrBuilder>`"
  ([^OpDef$Builder this]
    (-> this (.getInputArgOrBuilderList))))

(defn get-input-arg-builder
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$Builder this ^Integer index]
    (-> this (.getInputArgBuilder index))))

(defn set-deprecation
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  value - `org.tensorflow.framework.OpDeprecation`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^org.tensorflow.framework.OpDeprecation value]
    (-> this (.setDeprecation value))))

(defn get-input-arg-list
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `java.util.List<org.tensorflow.framework.OpDef$ArgDef>`"
  (^java.util.List [^OpDef$Builder this]
    (-> this (.getInputArgList))))

(defn add-all-input-arg
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInputArg values))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-output-arg-or-builder-list
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDef$ArgDefOrBuilder>`"
  ([^OpDef$Builder this]
    (-> this (.getOutputArgOrBuilderList))))

(defn clone
  "returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OpDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-summary-bytes
  "One-line human-readable description of what the Op does.
  string summary = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$Builder this]
    (-> this (.getSummaryBytes))))

(defn set-summary
  "One-line human-readable description of what the Op does.
  string summary = 5;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^java.lang.String value]
    (-> this (.setSummary value))))

(defn get-is-commutative?
  "True if the operation is commutative (\"op(a,b) == op(b,a)\" for all inputs)
  bool is_commutative = 18;

  returns: `boolean`"
  (^Boolean [^OpDef$Builder this]
    (-> this (.getIsCommutative))))

(defn get-allows-uninitialized-input?
  "By default, all inputs to an Op must be initialized Tensors.  Ops
   that may initialize tensors for the first time should set this
   field to true, to allow the Op to take an uninitialized Tensor as
   input.
  bool allows_uninitialized_input = 19;

  returns: `boolean`"
  (^Boolean [^OpDef$Builder this]
    (-> this (.getAllowsUninitializedInput))))

(defn get-input-arg
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef [^OpDef$Builder this ^Integer index]
    (-> this (.getInputArg index))))

(defn clear
  "returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clear))))

(defn clear-is-aggregate
  "If is_aggregate is true, then this operation accepts N >= 2
   inputs and produces 1 output all of the same type.  Should be
   associative and commutative, and produce output with the same
   shape as the input.  The optimizer may replace an aggregate op
   taking input from multiple devices with a tree of aggregate ops
   that aggregate locally within each device (and possibly within
   groups of nearby devices) before communicating.
   TODO(josh11b): Implement that optimization.
  bool is_aggregate = 16;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearIsAggregate))))

(defn get-attr-builder
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$Builder this ^Integer index]
    (-> this (.getAttrBuilder index))))

(defn set-attr
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`
  value - `org.tensorflow.framework.OpDef$AttrDef`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Integer index ^org.tensorflow.framework.OpDef$AttrDef value]
    (-> this (.setAttr index value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn add-output-arg-builder
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$Builder this ^Integer index]
    (-> this (.addOutputArgBuilder index)))
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$Builder this]
    (-> this (.addOutputArgBuilder))))

(defn clear-input-arg
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearInputArg))))

(defn get-deprecation
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `org.tensorflow.framework.OpDeprecation`"
  (^org.tensorflow.framework.OpDeprecation [^OpDef$Builder this]
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
  (^Boolean [^OpDef$Builder this]
    (-> this (.getIsAggregate))))

(defn get-output-arg
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef [^OpDef$Builder this ^Integer index]
    (-> this (.getOutputArg index))))

(defn clear-deprecation
  "Optional deprecation based on GraphDef versions.
  .tensorflow.OpDeprecation deprecation = 8;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this]
    (-> this (.clearDeprecation))))

(defn set-output-arg
  "Description of the output(s).
  repeated .tensorflow.OpDef.ArgDef output_arg = 3;

  index - `int`
  value - `org.tensorflow.framework.OpDef$ArgDef`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Integer index ^org.tensorflow.framework.OpDef$ArgDef value]
    (-> this (.setOutputArg index value))))

(defn set-input-arg
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`
  value - `org.tensorflow.framework.OpDef$ArgDef`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Integer index ^org.tensorflow.framework.OpDef$ArgDef value]
    (-> this (.setInputArg index value))))

(defn add-attr-builder
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$Builder this ^Integer index]
    (-> this (.addAttrBuilder index)))
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$Builder this]
    (-> this (.addAttrBuilder))))

(defn get-input-arg-or-builder
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDefOrBuilder`"
  (^org.tensorflow.framework.OpDef$ArgDefOrBuilder [^OpDef$Builder this ^Integer index]
    (-> this (.getInputArgOrBuilder index))))

(defn remove-input-arg
  "Description of the input(s).
  repeated .tensorflow.OpDef.ArgDef input_arg = 2;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpDef$Builder this ^Integer index]
    (-> this (.removeInputArg index))))

(defn get-attr-or-builder-list
  "repeated .tensorflow.OpDef.AttrDef attr = 4;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDef$AttrDefOrBuilder>`"
  ([^OpDef$Builder this]
    (-> this (.getAttrOrBuilderList))))

