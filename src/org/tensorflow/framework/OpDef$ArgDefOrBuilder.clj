(ns org.tensorflow.framework.OpDef$ArgDefOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDef$ArgDefOrBuilder]))

(defn get-description-bytes
  "Human readable description.
  string description = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDefOrBuilder this]
    (-> this (.getDescriptionBytes))))

(defn get-type-value
  "Describes the type of one or more tensors that are accepted/produced
   by this input/output arg.  The only legal combinations are:
   * For a single tensor: either the \"type\" field is set or the
     \"type_attr\" field is set to the name of an attr with type \"type\".
   * For a sequence of tensors with the same type: the \"number_attr\"
     field will be set to the name of an attr with type \"int\", and
     either the \"type\" or \"type_attr\" field will be set as for
     single tensors.
   * For a sequence of tensors, the \"type_list_attr\" field will be set
     to the name of an attr with type \"list(type)\".
  .tensorflow.DataType type = 3;

  returns: `int`"
  (^Integer [^OpDef$ArgDefOrBuilder this]
    (-> this (.getTypeValue))))

(defn get-type
  "Describes the type of one or more tensors that are accepted/produced
   by this input/output arg.  The only legal combinations are:
   * For a single tensor: either the \"type\" field is set or the
     \"type_attr\" field is set to the name of an attr with type \"type\".
   * For a sequence of tensors with the same type: the \"number_attr\"
     field will be set to the name of an attr with type \"int\", and
     either the \"type\" or \"type_attr\" field will be set as for
     single tensors.
   * For a sequence of tensors, the \"type_list_attr\" field will be set
     to the name of an attr with type \"list(type)\".
  .tensorflow.DataType type = 3;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^OpDef$ArgDefOrBuilder this]
    (-> this (.getType))))

(defn get-type-list-attr-bytes
  "If specified, attr must have type \"list(type)\", and none of
   type, type_attr, and number_attr may be specified.
  string type_list_attr = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDefOrBuilder this]
    (-> this (.getTypeListAttrBytes))))

(defn get-is-ref?
  "For inputs: if true, the inputs are required to be refs.
     By default, inputs can be either refs or non-refs.
   For outputs: if true, outputs are refs, otherwise they are not.
  bool is_ref = 16;

  returns: `boolean`"
  (^Boolean [^OpDef$ArgDefOrBuilder this]
    (-> this (.getIsRef))))

(defn get-number-attr
  "if specified, attr must have type \"int\"
  string number_attr = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDefOrBuilder this]
    (-> this (.getNumberAttr))))

(defn get-number-attr-bytes
  "if specified, attr must have type \"int\"
  string number_attr = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDefOrBuilder this]
    (-> this (.getNumberAttrBytes))))

(defn get-name-bytes
  "Name for the input/output.  Should match the regexp \"[a-z][a-z0-9_]*\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDefOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-type-attr
  "if specified, attr must have type \"type\"
  string type_attr = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDefOrBuilder this]
    (-> this (.getTypeAttr))))

(defn get-name
  "Name for the input/output.  Should match the regexp \"[a-z][a-z0-9_]*\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDefOrBuilder this]
    (-> this (.getName))))

(defn get-description
  "Human readable description.
  string description = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDefOrBuilder this]
    (-> this (.getDescription))))

(defn get-type-list-attr
  "If specified, attr must have type \"list(type)\", and none of
   type, type_attr, and number_attr may be specified.
  string type_list_attr = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDefOrBuilder this]
    (-> this (.getTypeListAttr))))

(defn get-type-attr-bytes
  "if specified, attr must have type \"type\"
  string type_attr = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDefOrBuilder this]
    (-> this (.getTypeAttrBytes))))

