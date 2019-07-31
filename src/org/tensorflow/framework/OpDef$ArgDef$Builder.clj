(ns org.tensorflow.framework.OpDef$ArgDef$Builder
  " For describing inputs and outputs.
 Protobuf type tensorflow.OpDef.ArgDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDef$ArgDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpDef$ArgDef$Builder/getDescriptor )))

(defn clear-description
  "Human readable description.
  string description = 2;

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this]
    (-> this (.clearDescription))))

(defn set-type-list-attr
  "If specified, attr must have type \"list(type)\", and none of
   type, type_attr, and number_attr may be specified.
  string type_list_attr = 6;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^java.lang.String value]
    (-> this (.setTypeListAttr value))))

(defn clear-name
  "Name for the input/output.  Should match the regexp \"[a-z][a-z0-9_]*\".
  string name = 1;

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this]
    (-> this (.clearName))))

(defn clear-type-list-attr
  "If specified, attr must have type \"list(type)\", and none of
   type, type_attr, and number_attr may be specified.
  string type_list_attr = 6;

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this]
    (-> this (.clearTypeListAttr))))

(defn get-description-bytes
  "Human readable description.
  string description = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDef$Builder this]
    (-> this (.getDescriptionBytes))))

(defn set-description
  "Human readable description.
  string description = 2;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^java.lang.String value]
    (-> this (.setDescription value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

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
  (^Integer [^OpDef$ArgDef$Builder this]
    (-> this (.getTypeValue))))

(defn build-partial
  "returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef [^OpDef$ArgDef$Builder this]
    (-> this (.buildPartial))))

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
  (^org.tensorflow.framework.DataType [^OpDef$ArgDef$Builder this]
    (-> this (.getType))))

(defn get-type-list-attr-bytes
  "If specified, attr must have type \"list(type)\", and none of
   type, type_attr, and number_attr may be specified.
  string type_list_attr = 6;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDef$Builder this]
    (-> this (.getTypeListAttrBytes))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpDef$ArgDef$Builder this]
    (-> this (.isInitialized))))

(defn get-is-ref?
  "For inputs: if true, the inputs are required to be refs.
     By default, inputs can be either refs or non-refs.
   For outputs: if true, outputs are refs, otherwise they are not.
  bool is_ref = 16;

  returns: `boolean`"
  (^Boolean [^OpDef$ArgDef$Builder this]
    (-> this (.getIsRef))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef [^OpDef$ArgDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-number-attr
  "if specified, attr must have type \"int\"
  string number_attr = 5;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDef$Builder this]
    (-> this (.getNumberAttr))))

(defn set-type
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

  value - `org.tensorflow.framework.DataType`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^org.tensorflow.framework.DataType value]
    (-> this (.setType value))))

(defn get-number-attr-bytes
  "if specified, attr must have type \"int\"
  string number_attr = 5;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDef$Builder this]
    (-> this (.getNumberAttrBytes))))

(defn get-name-bytes
  "Name for the input/output.  Should match the regexp \"[a-z][a-z0-9_]*\".
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDef$Builder this]
    (-> this (.getNameBytes))))

(defn clear-type-attr
  "if specified, attr must have type \"type\"
  string type_attr = 4;

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this]
    (-> this (.clearTypeAttr))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "Name for the input/output.  Should match the regexp \"[a-z][a-z0-9_]*\".
  string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn clear-is-ref
  "For inputs: if true, the inputs are required to be refs.
     By default, inputs can be either refs or non-refs.
   For outputs: if true, outputs are refs, otherwise they are not.
  bool is_ref = 16;

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this]
    (-> this (.clearIsRef))))

(defn set-number-attr
  "if specified, attr must have type \"int\"
  string number_attr = 5;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^java.lang.String value]
    (-> this (.setNumberAttr value))))

(defn set-description-bytes
  "Human readable description.
  string description = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setDescriptionBytes value))))

(defn set-number-attr-bytes
  "if specified, attr must have type \"int\"
  string number_attr = 5;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNumberAttrBytes value))))

(defn get-type-attr
  "if specified, attr must have type \"type\"
  string type_attr = 4;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDef$Builder this]
    (-> this (.getTypeAttr))))

(defn get-name
  "Name for the input/output.  Should match the regexp \"[a-z][a-z0-9_]*\".
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDef$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-name-bytes
  "Name for the input/output.  Should match the regexp \"[a-z][a-z0-9_]*\".
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn set-type-attr
  "if specified, attr must have type \"type\"
  string type_attr = 4;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^java.lang.String value]
    (-> this (.setTypeAttr value))))

(defn clear-number-attr
  "if specified, attr must have type \"int\"
  string number_attr = 5;

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this]
    (-> this (.clearNumberAttr))))

(defn build
  "returns: `org.tensorflow.framework.OpDef$ArgDef`"
  (^org.tensorflow.framework.OpDef$ArgDef [^OpDef$ArgDef$Builder this]
    (-> this (.build))))

(defn get-description
  "Human readable description.
  string description = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDef$Builder this]
    (-> this (.getDescription))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-type
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

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this]
    (-> this (.clearType))))

(defn get-type-list-attr
  "If specified, attr must have type \"list(type)\", and none of
   type, type_attr, and number_attr may be specified.
  string type_list_attr = 6;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDef$ArgDef$Builder this]
    (-> this (.getTypeListAttr))))

(defn set-type-list-attr-bytes
  "If specified, attr must have type \"list(type)\", and none of
   type, type_attr, and number_attr may be specified.
  string type_list_attr = 6;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setTypeListAttrBytes value))))

(defn set-type-value
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

  value - `int`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^Integer value]
    (-> this (.setTypeValue value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OpDef$ArgDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-type-attr-bytes
  "if specified, attr must have type \"type\"
  string type_attr = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setTypeAttrBytes value))))

(defn set-is-ref
  "For inputs: if true, the inputs are required to be refs.
     By default, inputs can be either refs or non-refs.
   For outputs: if true, outputs are refs, otherwise they are not.
  bool is_ref = 16;

  value - `boolean`

  returns: `org.tensorflow.framework.OpDef$ArgDef$Builder`"
  (^org.tensorflow.framework.OpDef$ArgDef$Builder [^OpDef$ArgDef$Builder this ^Boolean value]
    (-> this (.setIsRef value))))

(defn get-type-attr-bytes
  "if specified, attr must have type \"type\"
  string type_attr = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDef$ArgDef$Builder this]
    (-> this (.getTypeAttrBytes))))

