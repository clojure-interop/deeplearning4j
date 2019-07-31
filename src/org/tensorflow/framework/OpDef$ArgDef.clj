(ns org.tensorflow.framework.OpDef$ArgDef
  " For describing inputs and outputs.
 Protobuf type tensorflow.OpDef.ArgDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDef$ArgDef]))

(def *-name-field-number
  "Static Constant.

  type: int"
  OpDef$ArgDef/NAME_FIELD_NUMBER)

(def *-description-field-number
  "Static Constant.

  type: int"
  OpDef$ArgDef/DESCRIPTION_FIELD_NUMBER)

(def *-type-field-number
  "Static Constant.

  type: int"
  OpDef$ArgDef/TYPE_FIELD_NUMBER)

(def *-type-attr-field-number
  "Static Constant.

  type: int"
  OpDef$ArgDef/TYPE_ATTR_FIELD_NUMBER)

(def *-number-attr-field-number
  "Static Constant.

  type: int"
  OpDef$ArgDef/NUMBER_ATTR_FIELD_NUMBER)

(def *-type-list-attr-field-number
  "Static Constant.

  type: int"
  OpDef$ArgDef/TYPE_LIST_ATTR_FIELD_NUMBER)

(def *-is-ref-field-number
  "Static Constant.

  type: int"
  OpDef$ArgDef/IS_REF_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpDef$ArgDef/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDef$ArgDef`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.OpDef$ArgDef [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpDef$ArgDef/parseFrom data extension-registry))
  (^org.tensorflow.framework.OpDef$ArgDef [^java.nio.ByteBuffer data]
    (OpDef$ArgDef/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDef$ArgDef`

  throws: java.io.IOException"
  (^org.tensorflow.framework.OpDef$ArgDef [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpDef$ArgDef/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.OpDef$ArgDef [^java.io.InputStream input]
    (OpDef$ArgDef/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.OpDef$ArgDef`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^org.tensorflow.framework.OpDef$ArgDef prototype]
    (OpDef$ArgDef/newBuilder prototype))
  (^org.tensorflow.framework.OpDef$ArgDef$Builder []
    (OpDef$ArgDef/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef []
    (OpDef$ArgDef/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.OpDef$ArgDef>`"
  (^com.github.os72.protobuf351.Parser []
    (OpDef$ArgDef/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OpDef$ArgDef this]
    (-> this (.getUnknownFields))))

(defn get-description-bytes
  "Human readable description.
  string description = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDef this]
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
  (^Integer [^OpDef$ArgDef this]
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
  (^org.tensorflow.framework.DataType [^OpDef$ArgDef this]
    (-> this (.getType))))

(defn get-type-list-attr-bytes
  "If specified, attr must have type \"list(type)\", and none of
   type, type_attr, and number_attr may be specified.
  string type_list_attr = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDef this]
    (-> this (.getTypeListAttrBytes))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpDef$ArgDef this]
    (-> this (.isInitialized))))

(defn get-is-ref?
  "For inputs: if true, the inputs are required to be refs.
     By default, inputs can be either refs or non-refs.
   For outputs: if true, outputs are refs, otherwise they are not.
  bool is_ref = 16;

  returns: `boolean`"
  (^Boolean [^OpDef$ArgDef this]
    (-> this (.getIsRef))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef [^OpDef$ArgDef this]
    (-> this (.getDefaultInstanceForType))))

(defn get-number-attr
  "if specified, attr must have type \"int\"
  string number_attr = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDef this]
    (-> this (.getNumberAttr))))

(defn get-number-attr-bytes
  "if specified, attr must have type \"int\"
  string number_attr = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDef this]
    (-> this (.getNumberAttrBytes))))

(defn get-name-bytes
  "Name for the input/output.  Should match the regexp \"[a-z][a-z0-9_]*\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDef this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OpDef$ArgDef this]
    (-> this (.getSerializedSize))))

(defn get-type-attr
  "if specified, attr must have type \"type\"
  string type_attr = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDef this]
    (-> this (.getTypeAttr))))

(defn get-name
  "Name for the input/output.  Should match the regexp \"[a-z][a-z0-9_]*\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDef this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OpDef$ArgDef this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-description
  "Human readable description.
  string description = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDef this]
    (-> this (.getDescription))))

(defn get-type-list-attr
  "If specified, attr must have type \"list(type)\", and none of
   type, type_attr, and number_attr may be specified.
  string type_list_attr = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDef this]
    (-> this (.getTypeListAttr))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OpDef$ArgDef this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.OpDef$ArgDef>`"
  (^com.github.os72.protobuf351.Parser [^OpDef$ArgDef this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OpDef$ArgDef this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef this]
    (-> this (.newBuilderForType))))

(defn get-type-attr-bytes
  "if specified, attr must have type \"type\"
  string type_attr = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDef this]
    (-> this (.getTypeAttrBytes))))

(defn to-builder
  "returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef this]
    (-> this (.toBuilder))))

