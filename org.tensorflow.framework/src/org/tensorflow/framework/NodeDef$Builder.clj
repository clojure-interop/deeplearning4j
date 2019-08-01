(ns org.tensorflow.framework.NodeDef$Builder
  "Protobuf type tensorflow.NodeDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NodeDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (NodeDef$Builder/getDescriptor )))

(defn clear-name
  "The name given to this operator. Used for naming inputs,
   logging, visualization, etc.  Unique within a single GraphDef.
   Must match the regexp \"[A-Za-z0-9.][A-Za-z0-9_./]*\".
  string name = 1;

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this]
    (-> this (.clearName))))

(defn set-input
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  index - `int`
  value - `java.lang.String`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^Integer index ^java.lang.String value]
    (-> this (.setInput index value))))

(defn get-attr-count
  "Description copied from interface: NodeDefOrBuilder

  returns: `int`"
  (^Integer [^NodeDef$Builder this]
    (-> this (.getAttrCount))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-op-bytes
  "The operation name.  There may be custom parameters in attrs.
   Op names starting with an underscore are reserved for internal use.
  string op = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setOpBytes value))))

(defn set-op
  "The operation name.  There may be custom parameters in attrs.
   Op names starting with an underscore are reserved for internal use.
  string op = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^java.lang.String value]
    (-> this (.setOp value))))

(defn set-device
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

  value - `java.lang.String`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^java.lang.String value]
    (-> this (.setDevice value))))

(defn build-partial
  "returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^NodeDef$Builder this]
    (-> this (.buildPartial))))

(defn put-attr
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
  value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^java.lang.String key ^org.tensorflow.framework.AttrValue value]
    (-> this (.putAttr key value))))

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
  (^org.tensorflow.framework.AttrValue [^NodeDef$Builder this ^java.lang.String key ^org.tensorflow.framework.AttrValue default-value]
    (-> this (.getAttrOrDefault key default-value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^NodeDef$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^NodeDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

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
  (^org.tensorflow.framework.AttrValue [^NodeDef$Builder this ^java.lang.String key]
    (-> this (.getAttrOrThrow key))))

(defn get-name-bytes
  "The name given to this operator. Used for naming inputs,
   logging, visualization, etc.  Unique within a single GraphDef.
   Must match the regexp \"[A-Za-z0-9.][A-Za-z0-9_./]*\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeDef$Builder this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  returns: `int`"
  (^Integer [^NodeDef$Builder this]
    (-> this (.getInputCount))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "The name given to this operator. Used for naming inputs,
   logging, visualization, etc.  Unique within a single GraphDef.
   Must match the regexp \"[A-Za-z0-9.][A-Za-z0-9_./]*\".
  string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn get-input-bytes
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeDef$Builder this ^Integer index]
    (-> this (.getInputBytes index))))

(defn set-device-bytes
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

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDeviceBytes value))))

(defn remove-attr
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

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^java.lang.String key]
    (-> this (.removeAttr key))))

(defn add-all-input
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllInput values))))

(defn get-input-list
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  returns: `com.github.os72.protobuf351.ProtocolStringList`"
  (^com.github.os72.protobuf351.ProtocolStringList [^NodeDef$Builder this]
    (-> this (.getInputList))))

(defn get-name
  "The name given to this operator. Used for naming inputs,
   logging, visualization, etc.  Unique within a single GraphDef.
   Must match the regexp \"[A-Za-z0-9.][A-Za-z0-9_./]*\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeDef$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-op
  "The operation name.  There may be custom parameters in attrs.
   Op names starting with an underscore are reserved for internal use.
  string op = 2;

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this]
    (-> this (.clearOp))))

(defn set-name-bytes
  "The name given to this operator. Used for naming inputs,
   logging, visualization, etc.  Unique within a single GraphDef.
   Must match the regexp \"[A-Za-z0-9.][A-Za-z0-9_./]*\".
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn put-all-attr
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

  values - `java.util.Map`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^java.util.Map values]
    (-> this (.putAllAttr values))))

(defn get-mutable-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NodeDef$Builder this]
    (-> this (.getMutableAttr))))

(defn get-input
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  index - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^NodeDef$Builder this ^Integer index]
    (-> this (.getInput index))))

(defn get-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NodeDef$Builder this]
    (-> this (.getAttr))))

(defn clear-attr
  "returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this]
    (-> this (.clearAttr))))

(defn clear-input
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this]
    (-> this (.clearInput))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.NodeDef`"
  (^org.tensorflow.framework.NodeDef [^NodeDef$Builder this]
    (-> this (.build))))

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
  (^com.github.os72.protobuf351.ByteString [^NodeDef$Builder this]
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
  (^java.lang.String [^NodeDef$Builder this]
    (-> this (.getDevice))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NodeDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

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
  (^Boolean [^NodeDef$Builder this ^java.lang.String key]
    (-> this (.containsAttr key))))

(defn clear-device
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

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this]
    (-> this (.clearDevice))))

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
  (^java.util.Map [^NodeDef$Builder this]
    (-> this (.getAttrMap))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn add-input
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^java.lang.String value]
    (-> this (.addInput value))))

(defn clone
  "returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^NodeDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-op-bytes
  "The operation name.  There may be custom parameters in attrs.
   Op names starting with an underscore are reserved for internal use.
  string op = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NodeDef$Builder this]
    (-> this (.getOpBytes))))

(defn add-input-bytes
  "Each input is \"node:src_output\" with \"node\" being a string name and
   \"src_output\" indicating which output tensor to use from \"node\". If
   \"src_output\" is 0 the \":0\" suffix can be omitted.  Regular inputs
   may optionally be followed by control inputs that have the format
   \"^node\".
  repeated string input = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addInputBytes value))))

(defn clear
  "returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this]
    (-> this (.clear))))

(defn get-op
  "The operation name.  There may be custom parameters in attrs.
   Op names starting with an underscore are reserved for internal use.
  string op = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^NodeDef$Builder this]
    (-> this (.getOp))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.NodeDef$Builder`"
  (^org.tensorflow.framework.NodeDef$Builder [^NodeDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

