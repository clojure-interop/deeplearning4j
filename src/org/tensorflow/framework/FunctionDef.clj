(ns org.tensorflow.framework.FunctionDef
  " A function can be instantiated when the runtime can bind every attr
  with a value. When a GraphDef has a call to a function, it must
  have binding for every attr defined in the signature.
  TODO(zhifengc):
    * device spec, etc.
 Protobuf type tensorflow.FunctionDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework FunctionDef]))

(def *-signature-field-number
  "Static Constant.

  type: int"
  FunctionDef/SIGNATURE_FIELD_NUMBER)

(def *-attr-field-number
  "Static Constant.

  type: int"
  FunctionDef/ATTR_FIELD_NUMBER)

(def *-node-def-field-number
  "Static Constant.

  type: int"
  FunctionDef/NODE_DEF_FIELD_NUMBER)

(def *-ret-field-number
  "Static Constant.

  type: int"
  FunctionDef/RET_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (FunctionDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.FunctionDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.FunctionDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (FunctionDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.FunctionDef [^java.nio.ByteBuffer data]
    (FunctionDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.FunctionDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.FunctionDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (FunctionDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.FunctionDef [^java.io.InputStream input]
    (FunctionDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.FunctionDef`

  returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^org.tensorflow.framework.FunctionDef prototype]
    (FunctionDef/newBuilder prototype))
  (^org.tensorflow.framework.FunctionDef$Builder []
    (FunctionDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.FunctionDef`"
  (^org.tensorflow.framework.FunctionDef []
    (FunctionDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.FunctionDef>`"
  (^com.github.os72.protobuf351.Parser []
    (FunctionDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^FunctionDef this]
    (-> this (.getUnknownFields))))

(defn get-signature
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^FunctionDef this]
    (-> this (.getSignature))))

(defn get-attr-count
  "Description copied from interface: FunctionDefOrBuilder

  returns: `int`"
  (^Integer [^FunctionDef this]
    (-> this (.getAttrCount))))

(defn get-ret-map
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^FunctionDef this]
    (-> this (.getRetMap))))

(defn has-signature?
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `boolean`"
  (^Boolean [^FunctionDef this]
    (-> this (.hasSignature))))

(defn get-attr-or-default
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`
  default-value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^FunctionDef this ^java.lang.String key ^org.tensorflow.framework.AttrValue default-value]
    (-> this (.getAttrOrDefault key default-value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^FunctionDef this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.FunctionDef`"
  (^org.tensorflow.framework.FunctionDef [^FunctionDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-attr-or-throw
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^FunctionDef this ^java.lang.String key]
    (-> this (.getAttrOrThrow key))))

(defn get-node-def-or-builder
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`

  returns: `org.tensorflow.framework.NodeDefOrBuilder`"
  (^org.tensorflow.framework.NodeDefOrBuilder [^FunctionDef this ^Integer index]
    (-> this (.getNodeDefOrBuilder index))))

(defn get-ret-or-default
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`
  default-value - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FunctionDef this ^java.lang.String key ^java.lang.String default-value]
    (-> this (.getRetOrDefault key default-value))))

(defn get-signature-or-builder
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `org.tensorflow.framework.OpDefOrBuilder`"
  (^org.tensorflow.framework.OpDefOrBuilder [^FunctionDef this]
    (-> this (.getSignatureOrBuilder))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^FunctionDef this]
    (-> this (.getSerializedSize))))

(defn contains-ret
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FunctionDef this ^java.lang.String key]
    (-> this (.containsRet key))))

(defn get-ret
  "Deprecated.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^FunctionDef this]
    (-> this (.getRet))))

(defn get-node-def-or-builder-list
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeDefOrBuilder>`"
  ([^FunctionDef this]
    (-> this (.getNodeDefOrBuilderList))))

(defn get-ret-or-throw
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FunctionDef this ^java.lang.String key]
    (-> this (.getRetOrThrow key))))

(defn get-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^FunctionDef this]
    (-> this (.getAttr))))

(defn get-node-def
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`

  returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^FunctionDef this ^Integer index]
    (-> this (.getNodeDef index))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^FunctionDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn contains-attr
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FunctionDef this ^java.lang.String key]
    (-> this (.containsAttr key))))

(defn get-node-def-list
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `java.util.List<org.tensorflow.framework.NodeDef>`"
  (^java.util.List [^FunctionDef this]
    (-> this (.getNodeDefList))))

(defn get-attr-map
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^FunctionDef this]
    (-> this (.getAttrMap))))

(defn hash-code
  "returns: `int`"
  (^Integer [^FunctionDef this]
    (-> this (.hashCode))))

(defn get-ret-count
  "Description copied from interface: FunctionDefOrBuilder

  returns: `int`"
  (^Integer [^FunctionDef this]
    (-> this (.getRetCount))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.FunctionDef>`"
  (^com.github.os72.protobuf351.Parser [^FunctionDef this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^FunctionDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.FunctionDef$Builder`"
  (^org.tensorflow.framework.FunctionDef$Builder [^FunctionDef this]
    (-> this (.toBuilder))))

(defn get-node-def-count
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `int`"
  (^Integer [^FunctionDef this]
    (-> this (.getNodeDefCount))))

