(ns org.tensorflow.framework.NodeDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NodeDefOrBuilder]))

(defn get-attr-count
  "Operation-specific graph-construction-time configuration.
   Note that this should include all attrs defined in the
   corresponding OpDef, including those with a value matching
   the default -- this allows the default to change and makes
   NodeDefs easier to interpret on their own.  However, if
   an attr with a default is not specified in this list, the
   default will be used.
   The \"names\" (keys) must match the regexp \"[a-z][a-z0-9_]+\" (and
   one of the names from the corresponding OpDef's attr field).
   The values must have a type matching the corresponding OpDef
   attr's type field.
   TODO(josh11b): Add some examples here showing best practices.
  map<string, .tensorflow.AttrValue> attr = 5;

  returns: `int`"
  (^Integer [^NodeDefOrBuilder this]
    (-> this (.getAttrCount))))

(defn get-attr-or-default
  "Operation-specific graph-construction-time configuration.
   Note that this should include all attrs defined in the
   corresponding OpDef, including those with a value matching
   the default -- this allows the default to change and makes
   NodeDefs easier to interpret on their own.  However, if
   an attr with a default is not specified in this list, the
   default will be used.
   The \"names\" (keys) must match the regexp \"[a-z][a-z0-9_]+\" (and
   one of the names from the corresponding OpDef's attr field).
   The values must have a type matching the corresponding OpDef
   attr's type field.
   TODO(josh11b): Add some examples here showing best practices.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`
  default-value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^NodeDefOrBuilder this ^java.lang.String key ^org.tensorflow.framework.AttrValue default-value]
    (-> this (.getAttrOrDefault key default-value))))

(defn get-attr-or-throw
  "Operation-specific graph-construction-time configuration.
   Note that this should include all attrs defined in the
   corresponding OpDef, including those with a value matching
   the default -- this allows the default to change and makes
   NodeDefs easier to interpret on their own.  However, if
   an attr with a default is not specified in this list, the
   default will be used.
   The \"names\" (keys) must match the regexp \"[a-z][a-z0-9_]+\" (and
   one of the names from the corresponding OpDef's attr field).
   The values must have a type matching the corresponding OpDef
   attr's type field.
   TODO(josh11b): Add some examples here showing best practices.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^NodeDefOrBuilder this ^java.lang.String key]
    (-> this (.getAttrOrThrow key))))

(defn get-name-bytes
  "The name given to this operator. Used for naming inputs,
   logging, visualization, etc.  Unique within a single GraphDef.
   Must match the regexp \"[A-Za-z0-9.][A-Za-z0-9_./]*\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeDefOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  returns: `int`"
  (^Integer [^NodeDefOrBuilder this]
    (-> this (.getInputCount))))

(defn get-input-bytes
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeDefOrBuilder this ^Integer index]
    (-> this (.getInputBytes index))))

(defn get-input-list
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NodeDefOrBuilder this]
    (-> this (.getInputList))))

(defn get-name
  "The name given to this operator. Used for naming inputs,
   logging, visualization, etc.  Unique within a single GraphDef.
   Must match the regexp \"[A-Za-z0-9.][A-Za-z0-9_./]*\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeDefOrBuilder this]
    (-> this (.getName))))

(defn get-input
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^NodeDefOrBuilder this ^Integer index]
    (-> this (.getInput index))))

(defn get-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NodeDefOrBuilder this]
    (-> this (.getAttr))))

(defn get-device-bytes
  "A (possibly partial) specification for the device on which this
   node should be placed.
   The expected syntax for this string is as follows:
   DEVICE_SPEC ::= PARTIAL_SPEC
   PARTIAL_SPEC ::= (\"/\" CONSTRAINT) *
   CONSTRAINT ::= (\"job:\" JOB_NAME)
                | (\"replica:\" [1-9][0-9]*)
                | (\"task:\" [1-9][0-9]*)
                | (\"device:\" [A-Za-z]* \":\" ([1-9][0-9]* | \"*\") )
   Valid values for this string include:
   * \"/job:worker/replica:0/task:1/device:GPU:3\"  (full specification)
   * \"/job:worker/device:GPU:3\"                   (partial specification)
   * \"\"                                    (no specification)
   If the constraints do not resolve to a single device (or if this
   field is empty or not present), the runtime will attempt to
   choose a device automatically.
  string device = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeDefOrBuilder this]
    (-> this (.getDeviceBytes))))

(defn get-device
  "A (possibly partial) specification for the device on which this
   node should be placed.
   The expected syntax for this string is as follows:
   DEVICE_SPEC ::= PARTIAL_SPEC
   PARTIAL_SPEC ::= (\"/\" CONSTRAINT) *
   CONSTRAINT ::= (\"job:\" JOB_NAME)
                | (\"replica:\" [1-9][0-9]*)
                | (\"task:\" [1-9][0-9]*)
                | (\"device:\" [A-Za-z]* \":\" ([1-9][0-9]* | \"*\") )
   Valid values for this string include:
   * \"/job:worker/replica:0/task:1/device:GPU:3\"  (full specification)
   * \"/job:worker/device:GPU:3\"                   (partial specification)
   * \"\"                                    (no specification)
   If the constraints do not resolve to a single device (or if this
   field is empty or not present), the runtime will attempt to
   choose a device automatically.
  string device = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeDefOrBuilder this]
    (-> this (.getDevice))))

(defn contains-attr
  "Operation-specific graph-construction-time configuration.
   Note that this should include all attrs defined in the
   corresponding OpDef, including those with a value matching
   the default -- this allows the default to change and makes
   NodeDefs easier to interpret on their own.  However, if
   an attr with a default is not specified in this list, the
   default will be used.
   The \"names\" (keys) must match the regexp \"[a-z][a-z0-9_]+\" (and
   one of the names from the corresponding OpDef's attr field).
   The values must have a type matching the corresponding OpDef
   attr's type field.
   TODO(josh11b): Add some examples here showing best practices.
  map<string, .tensorflow.AttrValue> attr = 5;

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^NodeDefOrBuilder this ^java.lang.String key]
    (-> this (.containsAttr key))))

(defn get-attr-map
  "Operation-specific graph-construction-time configuration.
   Note that this should include all attrs defined in the
   corresponding OpDef, including those with a value matching
   the default -- this allows the default to change and makes
   NodeDefs easier to interpret on their own.  However, if
   an attr with a default is not specified in this list, the
   default will be used.
   The \"names\" (keys) must match the regexp \"[a-z][a-z0-9_]+\" (and
   one of the names from the corresponding OpDef's attr field).
   The values must have a type matching the corresponding OpDef
   attr's type field.
   TODO(josh11b): Add some examples here showing best practices.
  map<string, .tensorflow.AttrValue> attr = 5;

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NodeDefOrBuilder this]
    (-> this (.getAttrMap))))

(defn get-op-bytes
  "The operation name.  There may be custom parameters in attrs.
   Op names starting with an underscore are reserved for internal use.
  string op = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeDefOrBuilder this]
    (-> this (.getOpBytes))))

(defn get-op
  "The operation name.  There may be custom parameters in attrs.
   Op names starting with an underscore are reserved for internal use.
  string op = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeDefOrBuilder this]
    (-> this (.getOp))))

