(ns org.tensorflow.framework.OpDef$AttrDef
  " Description of the graph-construction-time configuration of this
  Op.  That is to say, this describes the attr fields that will
  be specified in the NodeDef.
 Protobuf type tensorflow.OpDef.AttrDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDef$AttrDef]))

(def *-name-field-number
  "Static Constant.

  type: int"
  OpDef$AttrDef/NAME_FIELD_NUMBER)

(def *-type-field-number
  "Static Constant.

  type: int"
  OpDef$AttrDef/TYPE_FIELD_NUMBER)

(def *-default-value-field-number
  "Static Constant.

  type: int"
  OpDef$AttrDef/DEFAULT_VALUE_FIELD_NUMBER)

(def *-description-field-number
  "Static Constant.

  type: int"
  OpDef$AttrDef/DESCRIPTION_FIELD_NUMBER)

(def *-has-minimum-field-number
  "Static Constant.

  type: int"
  OpDef$AttrDef/HAS_MINIMUM_FIELD_NUMBER)

(def *-minimum-field-number
  "Static Constant.

  type: int"
  OpDef$AttrDef/MINIMUM_FIELD_NUMBER)

(def *-allowed-values-field-number
  "Static Constant.

  type: int"
  OpDef$AttrDef/ALLOWED_VALUES_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpDef$AttrDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDef$AttrDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.OpDef$AttrDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpDef$AttrDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.OpDef$AttrDef [^java.nio.ByteBuffer data]
    (OpDef$AttrDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDef$AttrDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.OpDef$AttrDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpDef$AttrDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.OpDef$AttrDef [^java.io.InputStream input]
    (OpDef$AttrDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.OpDef$AttrDef`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^org.tensorflow.framework.OpDef$AttrDef prototype]
    (OpDef$AttrDef/newBuilder prototype))
  (^org.tensorflow.framework.OpDef$AttrDef$Builder []
    (OpDef$AttrDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.OpDef$AttrDef`"
  (^org.tensorflow.framework.OpDef$AttrDef []
    (OpDef$AttrDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.OpDef$AttrDef>`"
  (^com.github.os72.protobuf351.Parser []
    (OpDef$AttrDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OpDef$AttrDef this]
    (-> this (.getUnknownFields))))

(defn get-description-bytes
  "Human-readable description.
  string description = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$AttrDef this]
    (-> this (.getDescriptionBytes))))

(defn get-minimum
  "int64 minimum = 6;

  returns: `long`"
  (^Long [^OpDef$AttrDef this]
    (-> this (.getMinimum))))

(defn get-allowed-values
  "The set of allowed values.  Has type that is the \"list\" version
   of the \"type\" field above (uses the \"list\" field of AttrValue).
   If type == \"type\" or \"list(type)\" above, then the \"type\" field
   of \"allowed_values.list\" has the set of allowed DataTypes.
   If type == \"string\" or \"list(string)\", then the \"s\" field of
   \"allowed_values.list\" has the set of allowed strings.
  .tensorflow.AttrValue allowed_values = 7;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^OpDef$AttrDef this]
    (-> this (.getAllowedValues))))

(defn get-type
  "One of the type names from attr_value.proto (\"string\", \"list(string)\",
   \"int\", etc.).
  string type = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$AttrDef this]
    (-> this (.getType))))

(defn get-allowed-values-or-builder
  "The set of allowed values.  Has type that is the \"list\" version
   of the \"type\" field above (uses the \"list\" field of AttrValue).
   If type == \"type\" or \"list(type)\" above, then the \"type\" field
   of \"allowed_values.list\" has the set of allowed DataTypes.
   If type == \"string\" or \"list(string)\", then the \"s\" field of
   \"allowed_values.list\" has the set of allowed strings.
  .tensorflow.AttrValue allowed_values = 7;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^OpDef$AttrDef this]
    (-> this (.getAllowedValuesOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpDef$AttrDef this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.OpDef$AttrDef`"
  (^org.tensorflow.framework.OpDef$AttrDef [^OpDef$AttrDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "A descriptive name for the argument.  May be used, e.g. by the
   Python client, as a keyword argument name, and so should match
   the regexp \"[a-z][a-z0-9_]+\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$AttrDef this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OpDef$AttrDef this]
    (-> this (.getSerializedSize))))

(defn get-default-value-or-builder
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^OpDef$AttrDef this]
    (-> this (.getDefaultValueOrBuilder))))

(defn get-default-value
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^OpDef$AttrDef this]
    (-> this (.getDefaultValue))))

(defn get-name
  "A descriptive name for the argument.  May be used, e.g. by the
   Python client, as a keyword argument name, and so should match
   the regexp \"[a-z][a-z0-9_]+\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$AttrDef this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OpDef$AttrDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-description
  "Human-readable description.
  string description = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$AttrDef this]
    (-> this (.getDescription))))

(defn has-default-value?
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `boolean`"
  (^Boolean [^OpDef$AttrDef this]
    (-> this (.hasDefaultValue))))

(defn has-allowed-values?
  "The set of allowed values.  Has type that is the \"list\" version
   of the \"type\" field above (uses the \"list\" field of AttrValue).
   If type == \"type\" or \"list(type)\" above, then the \"type\" field
   of \"allowed_values.list\" has the set of allowed DataTypes.
   If type == \"string\" or \"list(string)\", then the \"s\" field of
   \"allowed_values.list\" has the set of allowed strings.
  .tensorflow.AttrValue allowed_values = 7;

  returns: `boolean`"
  (^Boolean [^OpDef$AttrDef this]
    (-> this (.hasAllowedValues))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OpDef$AttrDef this]
    (-> this (.hashCode))))

(defn get-has-minimum?
  "For type == \"int\", this is a minimum value.  For \"list(___)\"
   types, this is the minimum length.
  bool has_minimum = 5;

  returns: `boolean`"
  (^Boolean [^OpDef$AttrDef this]
    (-> this (.getHasMinimum))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.OpDef$AttrDef>`"
  (^com.github.os72.protobuf351.Parser [^OpDef$AttrDef this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OpDef$AttrDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef this]
    (-> this (.newBuilderForType))))

(defn get-type-bytes
  "One of the type names from attr_value.proto (\"string\", \"list(string)\",
   \"int\", etc.).
  string type = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$AttrDef this]
    (-> this (.getTypeBytes))))

(defn to-builder
  "returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef this]
    (-> this (.toBuilder))))

