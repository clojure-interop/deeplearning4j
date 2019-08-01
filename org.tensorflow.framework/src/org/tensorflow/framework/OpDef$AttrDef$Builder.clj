(ns org.tensorflow.framework.OpDef$AttrDef$Builder
  " Description of the graph-construction-time configuration of this
  Op.  That is to say, this describes the attr fields that will
  be specified in the NodeDef.
 Protobuf type tensorflow.OpDef.AttrDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDef$AttrDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpDef$AttrDef$Builder/getDescriptor )))

(defn clear-description
  "Human-readable description.
  string description = 4;

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.clearDescription))))

(defn clear-name
  "A descriptive name for the argument.  May be used, e.g. by the
   Python client, as a keyword argument name, and so should match
   the regexp \"[a-z][a-z0-9_]+\".
  string name = 1;

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.clearName))))

(defn get-description-bytes
  "Human-readable description.
  string description = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$AttrDef$Builder this]
    (-> this (.getDescriptionBytes))))

(defn set-description
  "Human-readable description.
  string description = 4;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^java.lang.String value]
    (-> this (.setDescription value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-minimum
  "int64 minimum = 6;

  returns: `long`"
  (^Long [^OpDef$AttrDef$Builder this]
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
  (^org.tensorflow.framework.AttrValue [^OpDef$AttrDef$Builder this]
    (-> this (.getAllowedValues))))

(defn build-partial
  "returns: `org.tensorflow.framework.OpDef$AttrDef`"
  (^org.tensorflow.framework.OpDef$AttrDef [^OpDef$AttrDef$Builder this]
    (-> this (.buildPartial))))

(defn get-type
  "One of the type names from attr_value.proto (\"string\", \"list(string)\",
   \"int\", etc.).
  string type = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$AttrDef$Builder this]
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
  (^org.tensorflow.framework.AttrValueOrBuilder [^OpDef$AttrDef$Builder this]
    (-> this (.getAllowedValuesOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpDef$AttrDef$Builder this]
    (-> this (.isInitialized))))

(defn get-default-value-builder
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.getDefaultValueBuilder))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.OpDef$AttrDef`"
  (^org.tensorflow.framework.OpDef$AttrDef [^OpDef$AttrDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-type
  "One of the type names from attr_value.proto (\"string\", \"list(string)\",
   \"int\", etc.).
  string type = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^java.lang.String value]
    (-> this (.setType value))))

(defn get-name-bytes
  "A descriptive name for the argument.  May be used, e.g. by the
   Python client, as a keyword argument name, and so should match
   the regexp \"[a-z][a-z0-9_]+\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$AttrDef$Builder this]
    (-> this (.getNameBytes))))

(defn get-default-value-or-builder
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^OpDef$AttrDef$Builder this]
    (-> this (.getDefaultValueOrBuilder))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "A descriptive name for the argument.  May be used, e.g. by the
   Python client, as a keyword argument name, and so should match
   the regexp \"[a-z][a-z0-9_]+\".
  string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn merge-allowed-values
  "The set of allowed values.  Has type that is the \"list\" version
   of the \"type\" field above (uses the \"list\" field of AttrValue).
   If type == \"type\" or \"list(type)\" above, then the \"type\" field
   of \"allowed_values.list\" has the set of allowed DataTypes.
   If type == \"string\" or \"list(string)\", then the \"s\" field of
   \"allowed_values.list\" has the set of allowed strings.
  .tensorflow.AttrValue allowed_values = 7;

  value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^org.tensorflow.framework.AttrValue value]
    (-> this (.mergeAllowedValues value))))

(defn set-has-minimum
  "For type == \"int\", this is a minimum value.  For \"list(___)\"
   types, this is the minimum length.
  bool has_minimum = 5;

  value - `boolean`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^Boolean value]
    (-> this (.setHasMinimum value))))

(defn set-description-bytes
  "Human-readable description.
  string description = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDescriptionBytes value))))

(defn get-default-value
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^OpDef$AttrDef$Builder this]
    (-> this (.getDefaultValue))))

(defn get-name
  "A descriptive name for the argument.  May be used, e.g. by the
   Python client, as a keyword argument name, and so should match
   the regexp \"[a-z][a-z0-9_]+\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$AttrDef$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-name-bytes
  "A descriptive name for the argument.  May be used, e.g. by the
   Python client, as a keyword argument name, and so should match
   the regexp \"[a-z][a-z0-9_]+\".
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn set-type-bytes
  "One of the type names from attr_value.proto (\"string\", \"list(string)\",
   \"int\", etc.).
  string type = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setTypeBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.OpDef$AttrDef`"
  (^org.tensorflow.framework.OpDef$AttrDef [^OpDef$AttrDef$Builder this]
    (-> this (.build))))

(defn get-description
  "Human-readable description.
  string description = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$AttrDef$Builder this]
    (-> this (.getDescription))))

(defn set-default-value
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^org.tensorflow.framework.AttrValue value]
    (-> this (.setDefaultValue value))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-type
  "One of the type names from attr_value.proto (\"string\", \"list(string)\",
   \"int\", etc.).
  string type = 2;

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.clearType))))

(defn has-default-value?
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `boolean`"
  (^Boolean [^OpDef$AttrDef$Builder this]
    (-> this (.hasDefaultValue))))

(defn get-allowed-values-builder
  "The set of allowed values.  Has type that is the \"list\" version
   of the \"type\" field above (uses the \"list\" field of AttrValue).
   If type == \"type\" or \"list(type)\" above, then the \"type\" field
   of \"allowed_values.list\" has the set of allowed DataTypes.
   If type == \"string\" or \"list(string)\", then the \"s\" field of
   \"allowed_values.list\" has the set of allowed strings.
  .tensorflow.AttrValue allowed_values = 7;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.getAllowedValuesBuilder))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.clone))))

(defn has-allowed-values?
  "The set of allowed values.  Has type that is the \"list\" version
   of the \"type\" field above (uses the \"list\" field of AttrValue).
   If type == \"type\" or \"list(type)\" above, then the \"type\" field
   of \"allowed_values.list\" has the set of allowed DataTypes.
   If type == \"string\" or \"list(string)\", then the \"s\" field of
   \"allowed_values.list\" has the set of allowed strings.
  .tensorflow.AttrValue allowed_values = 7;

  returns: `boolean`"
  (^Boolean [^OpDef$AttrDef$Builder this]
    (-> this (.hasAllowedValues))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OpDef$AttrDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-minimum
  "int64 minimum = 6;

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.clearMinimum))))

(defn get-has-minimum?
  "For type == \"int\", this is a minimum value.  For \"list(___)\"
   types, this is the minimum length.
  bool has_minimum = 5;

  returns: `boolean`"
  (^Boolean [^OpDef$AttrDef$Builder this]
    (-> this (.getHasMinimum))))

(defn set-allowed-values
  "The set of allowed values.  Has type that is the \"list\" version
   of the \"type\" field above (uses the \"list\" field of AttrValue).
   If type == \"type\" or \"list(type)\" above, then the \"type\" field
   of \"allowed_values.list\" has the set of allowed DataTypes.
   If type == \"string\" or \"list(string)\", then the \"s\" field of
   \"allowed_values.list\" has the set of allowed strings.
  .tensorflow.AttrValue allowed_values = 7;

  value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^org.tensorflow.framework.AttrValue value]
    (-> this (.setAllowedValues value))))

(defn clear
  "returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.clear))))

(defn set-minimum
  "int64 minimum = 6;

  value - `long`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^Long value]
    (-> this (.setMinimum value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-default-value
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.clearDefaultValue))))

(defn clear-has-minimum
  "For type == \"int\", this is a minimum value.  For \"list(___)\"
   types, this is the minimum length.
  bool has_minimum = 5;

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.clearHasMinimum))))

(defn get-type-bytes
  "One of the type names from attr_value.proto (\"string\", \"list(string)\",
   \"int\", etc.).
  string type = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$AttrDef$Builder this]
    (-> this (.getTypeBytes))))

(defn merge-default-value
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this ^org.tensorflow.framework.AttrValue value]
    (-> this (.mergeDefaultValue value))))

(defn clear-allowed-values
  "The set of allowed values.  Has type that is the \"list\" version
   of the \"type\" field above (uses the \"list\" field of AttrValue).
   If type == \"type\" or \"list(type)\" above, then the \"type\" field
   of \"allowed_values.list\" has the set of allowed DataTypes.
   If type == \"string\" or \"list(string)\", then the \"s\" field of
   \"allowed_values.list\" has the set of allowed strings.
  .tensorflow.AttrValue allowed_values = 7;

  returns: `org.tensorflow.framework.OpDef$AttrDef$Builder`"
  (^org.tensorflow.framework.OpDef$AttrDef$Builder [^OpDef$AttrDef$Builder this]
    (-> this (.clearAllowedValues))))

