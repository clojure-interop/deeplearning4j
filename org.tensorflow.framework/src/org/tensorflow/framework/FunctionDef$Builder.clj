(ns org.tensorflow.framework.FunctionDef$Builder
  " A function can be instantiated when the runtime can bind every attr
  with a value. When a GraphDef has a call to a function, it must
  have binding for every attr defined in the signature.
  TODO(zhifengc):
    * device spec, etc.
 Protobuf type tensorflow.FunctionDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework FunctionDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (FunctionDef$Builder/getDescriptor )))

(defn put-all-ret
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  values - `java.util.Map`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^java.util.Map values]
    (-> this (.putAllRet values))))

(defn get-signature
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^FunctionDef$Builder this]
    (-> this (.getSignature))))

(defn get-attr-count
  "Description copied from interface: FunctionDefOrBuilder

  returns: `int`"
  (^Integer [^FunctionDef$Builder this]
    (-> this (.getAttrCount))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-ret-map
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^FunctionDef$Builder this]
    (-> this (.getRetMap))))

(defn build-partial
  "returns: `org.tensorflow.framework.FunctionDef`"
  (^org.tensorflow.framework.FunctionDef [^FunctionDef$Builder this]
    (-> this (.buildPartial))))

(defn has-signature?
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `boolean`"
  (^Boolean [^FunctionDef$Builder this]
    (-> this (.hasSignature))))

(defn put-attr
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`
  value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^java.lang.String key ^org.tensorflow.framework.AttrValue value]
    (-> this (.putAttr key value))))

(defn get-attr-or-default
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`
  default-value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^FunctionDef$Builder this ^java.lang.String key ^org.tensorflow.framework.AttrValue default-value]
    (-> this (.getAttrOrDefault key default-value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^FunctionDef$Builder this]
    (-> this (.isInitialized))))

(defn get-node-def-builder-list
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `java.util.List<org.tensorflow.framework.NodeDef$Builder>`"
  (^java.util.List [^FunctionDef$Builder this]
    (-> this (.getNodeDefBuilderList))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.FunctionDef`"
  (^org.tensorflow.framework.FunctionDef [^FunctionDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-attr-or-throw
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^FunctionDef$Builder this ^java.lang.String key]
    (-> this (.getAttrOrThrow key))))

(defn get-node-def-or-builder
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`

  returns: `org.tensorflow.framework.NodeDefOrBuilder`"
  (^org.tensorflow.framework.NodeDefOrBuilder [^FunctionDef$Builder this ^Integer index]
    (-> this (.getNodeDefOrBuilder index))))

(defn get-ret-or-default
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`
  default-value - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FunctionDef$Builder this ^java.lang.String key ^java.lang.String default-value]
    (-> this (.getRetOrDefault key default-value))))

(defn clear-signature
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this]
    (-> this (.clearSignature))))

(defn clear-node-def
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this]
    (-> this (.clearNodeDef))))

(defn get-signature-builder
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^FunctionDef$Builder this]
    (-> this (.getSignatureBuilder))))

(defn get-signature-or-builder
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `org.tensorflow.framework.OpDefOrBuilder`"
  (^org.tensorflow.framework.OpDefOrBuilder [^FunctionDef$Builder this]
    (-> this (.getSignatureOrBuilder))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn contains-ret
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FunctionDef$Builder this ^java.lang.String key]
    (-> this (.containsRet key))))

(defn merge-signature
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  value - `org.tensorflow.framework.OpDef`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^org.tensorflow.framework.OpDef value]
    (-> this (.mergeSignature value))))

(defn get-ret
  "Deprecated.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^FunctionDef$Builder this]
    (-> this (.getRet))))

(defn get-node-def-or-builder-list
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeDefOrBuilder>`"
  ([^FunctionDef$Builder this]
    (-> this (.getNodeDefOrBuilderList))))

(defn remove-node-def
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^Integer index]
    (-> this (.removeNodeDef index))))

(defn remove-attr
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^java.lang.String key]
    (-> this (.removeAttr key))))

(defn set-node-def
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`
  value - `org.tensorflow.framework.NodeDef`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^Integer index ^org.tensorflow.framework.NodeDef value]
    (-> this (.setNodeDef index value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn put-all-attr
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  values - `java.util.Map`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^java.util.Map values]
    (-> this (.putAllAttr values))))

(defn get-ret-or-throw
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FunctionDef$Builder this ^java.lang.String key]
    (-> this (.getRetOrThrow key))))

(defn get-mutable-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^FunctionDef$Builder this]
    (-> this (.getMutableAttr))))

(defn get-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^FunctionDef$Builder this]
    (-> this (.getAttr))))

(defn clear-attr
  "returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this]
    (-> this (.clearAttr))))

(defn get-node-def
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`

  returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^FunctionDef$Builder this ^Integer index]
    (-> this (.getNodeDef index))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn add-all-node-def
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllNodeDef values))))

(defn build
  "returns: `org.tensorflow.framework.FunctionDef`"
  (^org.tensorflow.framework.FunctionDef [^FunctionDef$Builder this]
    (-> this (.build))))

(defn put-ret
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`
  value - `java.lang.String`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^java.lang.String key ^java.lang.String value]
    (-> this (.putRet key value))))

(defn add-node-def-builder
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^FunctionDef$Builder this ^Integer index]
    (-> this (.addNodeDefBuilder index)))
  (^org.tensorflow.framework.NodeDef$Builder [^FunctionDef$Builder this]
    (-> this (.addNodeDefBuilder))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.FunctionDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn contains-attr
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FunctionDef$Builder this ^java.lang.String key]
    (-> this (.containsAttr key))))

(defn get-mutable-ret
  "Deprecated.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^FunctionDef$Builder this]
    (-> this (.getMutableRet))))

(defn remove-ret
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^java.lang.String key]
    (-> this (.removeRet key))))

(defn get-node-def-list
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `java.util.List<org.tensorflow.framework.NodeDef>`"
  (^java.util.List [^FunctionDef$Builder this]
    (-> this (.getNodeDefList))))

(defn get-attr-map
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^FunctionDef$Builder this]
    (-> this (.getAttrMap))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn add-node-def
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`
  value - `org.tensorflow.framework.NodeDef`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^Integer index ^org.tensorflow.framework.NodeDef value]
    (-> this (.addNodeDef index value)))
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^org.tensorflow.framework.NodeDef value]
    (-> this (.addNodeDef value))))

(defn clone
  "returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^FunctionDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-signature
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  value - `org.tensorflow.framework.OpDef`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^org.tensorflow.framework.OpDef value]
    (-> this (.setSignature value))))

(defn get-ret-count
  "Description copied from interface: FunctionDefOrBuilder

  returns: `int`"
  (^Integer [^FunctionDef$Builder this]
    (-> this (.getRetCount))))

(defn clear
  "returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this]
    (-> this (.clear))))

(defn get-node-def-builder
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^FunctionDef$Builder this ^Integer index]
    (-> this (.getNodeDefBuilder index))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-node-def-count
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `int`"
  (^Integer [^FunctionDef$Builder this]
    (-> this (.getNodeDefCount))))

(defn clear-ret
  "returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef$Builder this]
    (-> this (.clearRet))))

