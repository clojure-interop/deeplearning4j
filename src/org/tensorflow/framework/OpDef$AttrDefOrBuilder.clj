(ns org.tensorflow.framework.OpDef$AttrDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDef$AttrDefOrBuilder]))

(defn get-description-bytes
  "Human-readable description.
  string description = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$AttrDefOrBuilder this]
    (-> this (.getDescriptionBytes))))

(defn get-minimum
  "int64 minimum = 6;

  returns: `long`"
  (^Long [^OpDef$AttrDefOrBuilder this]
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
  (^org.tensorflow.framework.AttrValue [^OpDef$AttrDefOrBuilder this]
    (-> this (.getAllowedValues))))

(defn get-type
  "One of the type names from attr_value.proto (\"string\", \"list(string)\",
   \"int\", etc.).
  string type = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$AttrDefOrBuilder this]
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
  (^org.tensorflow.framework.AttrValueOrBuilder [^OpDef$AttrDefOrBuilder this]
    (-> this (.getAllowedValuesOrBuilder))))

(defn get-name-bytes
  "A descriptive name for the argument.  May be used, e.g. by the
   Python client, as a keyword argument name, and so should match
   the regexp \"[a-z][a-z0-9_]+\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$AttrDefOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-default-value-or-builder
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^OpDef$AttrDefOrBuilder this]
    (-> this (.getDefaultValueOrBuilder))))

(defn get-default-value
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^OpDef$AttrDefOrBuilder this]
    (-> this (.getDefaultValue))))

(defn get-name
  "A descriptive name for the argument.  May be used, e.g. by the
   Python client, as a keyword argument name, and so should match
   the regexp \"[a-z][a-z0-9_]+\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$AttrDefOrBuilder this]
    (-> this (.getName))))

(defn get-description
  "Human-readable description.
  string description = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$AttrDefOrBuilder this]
    (-> this (.getDescription))))

(defn has-default-value?
  "A reasonable default for this attribute if the user does not supply
   a value.  If not specified, the user must supply a value.
  .tensorflow.AttrValue default_value = 3;

  returns: `boolean`"
  (^Boolean [^OpDef$AttrDefOrBuilder this]
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
  (^Boolean [^OpDef$AttrDefOrBuilder this]
    (-> this (.hasAllowedValues))))

(defn get-has-minimum?
  "For type == \"int\", this is a minimum value.  For \"list(___)\"
   types, this is the minimum length.
  bool has_minimum = 5;

  returns: `boolean`"
  (^Boolean [^OpDef$AttrDefOrBuilder this]
    (-> this (.getHasMinimum))))

(defn get-type-bytes
  "One of the type names from attr_value.proto (\"string\", \"list(string)\",
   \"int\", etc.).
  string type = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$AttrDefOrBuilder this]
    (-> this (.getTypeBytes))))

