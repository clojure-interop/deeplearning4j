(ns org.tensorflow.framework.NodeDef
  "Protobuf type tensorflow.NodeDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NodeDef]))

(def *-name-field-number
  "Static Constant.

  type: int"
  NodeDef/NAME_FIELD_NUMBER)

(def *-op-field-number
  "Static Constant.

  type: int"
  NodeDef/OP_FIELD_NUMBER)

(def *-input-field-number
  "Static Constant.

  type: int"
  NodeDef/INPUT_FIELD_NUMBER)

(def *-device-field-number
  "Static Constant.

  type: int"
  NodeDef/DEVICE_FIELD_NUMBER)

(def *-attr-field-number
  "Static Constant.

  type: int"
  NodeDef/ATTR_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (NodeDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NodeDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.NodeDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (NodeDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.NodeDef [^java.nio.ByteBuffer data]
    (NodeDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NodeDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.NodeDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (NodeDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.NodeDef [^java.io.InputStream input]
    (NodeDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.NodeDef`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^org.tensorflow.framework.NodeDef prototype]
    (NodeDef/newBuilder prototype))
  (^org.tensorflow.framework.NodeDef$Builder []
    (NodeDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef []
    (NodeDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.NodeDef>`"
  (^com.github.os72.protobuf351.Parser []
    (NodeDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^NodeDef this]
    (-> this (.getUnknownFields))))

(defn get-attr-count
  "Description copied from interface: NodeDefOrBuilder

  returns: `int`"
  (^Integer [^NodeDef this]
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
  (^org.tensorflow.framework.AttrValue [^NodeDef this ^java.lang.String key ^org.tensorflow.framework.AttrValue default-value]
    (-> this (.getAttrOrDefault key default-value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^NodeDef this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^NodeDef this]
    (-> this (.getDefaultInstanceForType))))

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
  (^org.tensorflow.framework.AttrValue [^NodeDef this ^java.lang.String key]
    (-> this (.getAttrOrThrow key))))

(defn get-name-bytes
  "The name given to this operator. Used for naming inputs,
   logging, visualization, etc.  Unique within a single GraphDef.
   Must match the regexp \"[A-Za-z0-9.][A-Za-z0-9_./]*\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeDef this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  returns: `int`"
  (^Integer [^NodeDef this]
    (-> this (.getInputCount))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^NodeDef this]
    (-> this (.getSerializedSize))))

(defn get-input-bytes
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeDef this ^Integer index]
    (-> this (.getInputBytes index))))

(defn get-input-list
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^NodeDef this]
    (-> this (.getInputList))))

(defn get-name
  "The name given to this operator. Used for naming inputs,
   logging, visualization, etc.  Unique within a single GraphDef.
   Must match the regexp \"[A-Za-z0-9.][A-Za-z0-9_./]*\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeDef this]
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
  (^java.lang.String [^NodeDef this ^Integer index]
    (-> this (.getInput index))))

(defn get-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NodeDef this]
    (-> this (.getAttr))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^NodeDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

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
  (^com.github.os72.protobuf351.ByteString [^NodeDef this]
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
  (^java.lang.String [^NodeDef this]
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
  (^Boolean [^NodeDef this ^java.lang.String key]
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
  (^java.util.Map [^NodeDef this]
    (-> this (.getAttrMap))))

(defn get-op-bytes
  "The operation name.  There may be custom parameters in attrs.
   Op names starting with an underscore are reserved for internal use.
  string op = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeDef this]
    (-> this (.getOpBytes))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NodeDef this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.NodeDef>`"
  (^com.github.os72.protobuf351.Parser [^NodeDef this]
    (-> this (.getParserForType))))

(defn get-op
  "The operation name.  There may be custom parameters in attrs.
   Op names starting with an underscore are reserved for internal use.
  string op = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeDef this]
    (-> this (.getOp))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NodeDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef this]
    (-> this (.toBuilder))))

