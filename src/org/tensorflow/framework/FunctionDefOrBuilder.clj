(ns org.tensorflow.framework.FunctionDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework FunctionDefOrBuilder]))

(defn get-signature
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^FunctionDefOrBuilder this]
    (-> this (.getSignature))))

(defn get-attr-count
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  returns: `int`"
  (^Integer [^FunctionDefOrBuilder this]
    (-> this (.getAttrCount))))

(defn get-ret-map
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^FunctionDefOrBuilder this]
    (-> this (.getRetMap))))

(defn has-signature?
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `boolean`"
  (^Boolean [^FunctionDefOrBuilder this]
    (-> this (.hasSignature))))

(defn get-attr-or-default
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`
  default-value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^FunctionDefOrBuilder this ^java.lang.String key ^org.tensorflow.framework.AttrValue default-value]
    (-> this (.getAttrOrDefault key default-value))))

(defn get-attr-or-throw
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^FunctionDefOrBuilder this ^java.lang.String key]
    (-> this (.getAttrOrThrow key))))

(defn get-node-def-or-builder
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`

  returns: `org.tensorflow.framework.NodeDefOrBuilder`"
  (^org.tensorflow.framework.NodeDefOrBuilder [^FunctionDefOrBuilder this ^Integer index]
    (-> this (.getNodeDefOrBuilder index))))

(defn get-ret-or-default
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`
  default-value - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FunctionDefOrBuilder this ^java.lang.String key ^java.lang.String default-value]
    (-> this (.getRetOrDefault key default-value))))

(defn get-signature-or-builder
  "The definition of the function's name, arguments, return values,
   attrs etc.
  .tensorflow.OpDef signature = 1;

  returns: `org.tensorflow.framework.OpDefOrBuilder`"
  (^org.tensorflow.framework.OpDefOrBuilder [^FunctionDefOrBuilder this]
    (-> this (.getSignatureOrBuilder))))

(defn contains-ret
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FunctionDefOrBuilder this ^java.lang.String key]
    (-> this (.containsRet key))))

(defn get-ret
  "Deprecated.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^FunctionDefOrBuilder this]
    (-> this (.getRet))))

(defn get-node-def-or-builder-list
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `java.util.List<? extends org.tensorflow.framework.NodeDefOrBuilder>`"
  ([^FunctionDefOrBuilder this]
    (-> this (.getNodeDefOrBuilderList))))

(defn get-ret-or-throw
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  key - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^FunctionDefOrBuilder this ^java.lang.String key]
    (-> this (.getRetOrThrow key))))

(defn get-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^FunctionDefOrBuilder this]
    (-> this (.getAttr))))

(defn get-node-def
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  index - `int`

  returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^FunctionDefOrBuilder this ^Integer index]
    (-> this (.getNodeDef index))))

(defn contains-attr
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FunctionDefOrBuilder this ^java.lang.String key]
    (-> this (.containsAttr key))))

(defn get-node-def-list
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `java.util.List<org.tensorflow.framework.NodeDef>`"
  (^java.util.List [^FunctionDefOrBuilder this]
    (-> this (.getNodeDefList))))

(defn get-attr-map
  "Attributes specific to this function definition.
  map<string, .tensorflow.AttrValue> attr = 5;

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^FunctionDefOrBuilder this]
    (-> this (.getAttrMap))))

(defn get-ret-count
  "A mapping from the output arg names from `signature` to the
   outputs from `node_def` that should be returned by the function.
  map<string, string> ret = 4;

  returns: `int`"
  (^Integer [^FunctionDefOrBuilder this]
    (-> this (.getRetCount))))

(defn get-node-def-count
  "By convention, \"op\" in node_def is resolved by consulting with a
   user-defined library first. If not resolved, \"func\" is assumed to
   be a builtin op.
  repeated .tensorflow.NodeDef node_def = 3;

  returns: `int`"
  (^Integer [^FunctionDefOrBuilder this]
    (-> this (.getNodeDefCount))))

