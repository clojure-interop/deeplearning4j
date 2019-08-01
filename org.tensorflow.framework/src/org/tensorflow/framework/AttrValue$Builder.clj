(ns org.tensorflow.framework.AttrValue$Builder
  " Protocol buffer representing the value for an attr used to configure an Op.
  Comment indicates the corresponding attr type.  Only the field matching the
  attr type may be filled.
 Protobuf type tensorflow.AttrValue"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AttrValue$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (AttrValue$Builder/getDescriptor )))

(defn get-f
  "\"float\"
  float f = 4;

  returns: `float`"
  (^Float [^AttrValue$Builder this]
    (-> this (.getF))))

(defn get-tensor-builder
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^AttrValue$Builder this]
    (-> this (.getTensorBuilder))))

(defn set-placeholder-bytes
  "This is a placeholder only used in nodes defined inside a
   function.  It indicates the attr value will be supplied when
   the function is instantiated.  For example, let us suppose a
   node \"N\" in function \"FN\". \"N\" has an attr \"A\" with value
   placeholder = \"foo\". When FN is instantiated with attr \"foo\"
   set to \"bar\", the instantiated node N's attr A will have been
   given the value \"bar\".
  string placeholder = 9;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setPlaceholderBytes value))))

(defn clear-s
  "\"string\"
  bytes s = 2;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearS))))

(defn has-shape?
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `boolean`"
  (^Boolean [^AttrValue$Builder this]
    (-> this (.hasShape))))

(defn get-b?
  "\"bool\"
  bool b = 5;

  returns: `boolean`"
  (^Boolean [^AttrValue$Builder this]
    (-> this (.getB))))

(defn set-placeholder
  "This is a placeholder only used in nodes defined inside a
   function.  It indicates the attr value will be supplied when
   the function is instantiated.  For example, let us suppose a
   node \"N\" in function \"FN\". \"N\" has an attr \"A\" with value
   placeholder = \"foo\". When FN is instantiated with attr \"foo\"
   set to \"bar\", the instantiated node N's attr A will have been
   given the value \"bar\".
  string placeholder = 9;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^java.lang.String value]
    (-> this (.setPlaceholder value))))

(defn merge-func
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  value - `org.tensorflow.framework.NameAttrList`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^org.tensorflow.framework.NameAttrList value]
    (-> this (.mergeFunc value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-placeholder-bytes
  "This is a placeholder only used in nodes defined inside a
   function.  It indicates the attr value will be supplied when
   the function is instantiated.  For example, let us suppose a
   node \"N\" in function \"FN\". \"N\" has an attr \"A\" with value
   placeholder = \"foo\". When FN is instantiated with attr \"foo\"
   set to \"bar\", the instantiated node N's attr A will have been
   given the value \"bar\".
  string placeholder = 9;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AttrValue$Builder this]
    (-> this (.getPlaceholderBytes))))

(defn get-type-value
  "\"type\"
  .tensorflow.DataType type = 6;

  returns: `int`"
  (^Integer [^AttrValue$Builder this]
    (-> this (.getTypeValue))))

(defn clear-i
  "\"int\"
  int64 i = 3;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearI))))

(defn build-partial
  "returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^AttrValue$Builder this]
    (-> this (.buildPartial))))

(defn set-b
  "\"bool\"
  bool b = 5;

  value - `boolean`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^Boolean value]
    (-> this (.setB value))))

(defn get-shape-or-builder
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^AttrValue$Builder this]
    (-> this (.getShapeOrBuilder))))

(defn get-type
  "\"type\"
  .tensorflow.DataType type = 6;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^AttrValue$Builder this]
    (-> this (.getType))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^AttrValue$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^AttrValue$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-list-builder
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$Builder this]
    (-> this (.getListBuilder))))

(defn set-type
  "\"type\"
  .tensorflow.DataType type = 6;

  value - `org.tensorflow.framework.DataType`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^org.tensorflow.framework.DataType value]
    (-> this (.setType value))))

(defn set-shape
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.setShape value))))

(defn merge-tensor
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  value - `org.tensorflow.framework.TensorProto`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^org.tensorflow.framework.TensorProto value]
    (-> this (.mergeTensor value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-func
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList [^AttrValue$Builder this]
    (-> this (.getFunc))))

(defn merge-list
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  value - `org.tensorflow.framework.AttrValue$ListValue`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^org.tensorflow.framework.AttrValue$ListValue value]
    (-> this (.mergeList value))))

(defn clear-value
  "returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearValue))))

(defn set-s
  "\"string\"
  bytes s = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setS value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-list
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  value - `org.tensorflow.framework.AttrValue$ListValue`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^org.tensorflow.framework.AttrValue$ListValue value]
    (-> this (.setList value))))

(defn clear-list
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearList))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn has-tensor?
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `boolean`"
  (^Boolean [^AttrValue$Builder this]
    (-> this (.hasTensor))))

(defn build
  "returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^AttrValue$Builder this]
    (-> this (.build))))

(defn clear-func
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearFunc))))

(defn get-func-or-builder
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `org.tensorflow.framework.NameAttrListOrBuilder`"
  (^org.tensorflow.framework.NameAttrListOrBuilder [^AttrValue$Builder this]
    (-> this (.getFuncOrBuilder))))

(defn merge-shape
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.mergeShape value))))

(defn get-list-or-builder
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `org.tensorflow.framework.AttrValue$ListValueOrBuilder`"
  (^org.tensorflow.framework.AttrValue$ListValueOrBuilder [^AttrValue$Builder this]
    (-> this (.getListOrBuilder))))

(defn get-tensor-or-builder
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^AttrValue$Builder this]
    (-> this (.getTensorOrBuilder))))

(defn get-i
  "\"int\"
  int64 i = 3;

  returns: `long`"
  (^Long [^AttrValue$Builder this]
    (-> this (.getI))))

(defn get-shape-builder
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^AttrValue$Builder this]
    (-> this (.getShapeBuilder))))

(defn get-value-case
  "returns: `org.tensorflow.framework.AttrValue$ValueCase`"
  (^org.tensorflow.framework.AttrValue$ValueCase [^AttrValue$Builder this]
    (-> this (.getValueCase))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AttrValue$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-type
  "\"type\"
  .tensorflow.DataType type = 6;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearType))))

(defn get-list
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `org.tensorflow.framework.AttrValue$ListValue`"
  (^org.tensorflow.framework.AttrValue$ListValue [^AttrValue$Builder this]
    (-> this (.getList))))

(defn set-tensor
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  value - `org.tensorflow.framework.TensorProto`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^org.tensorflow.framework.TensorProto value]
    (-> this (.setTensor value))))

(defn get-placeholder
  "This is a placeholder only used in nodes defined inside a
   function.  It indicates the attr value will be supplied when
   the function is instantiated.  For example, let us suppose a
   node \"N\" in function \"FN\". \"N\" has an attr \"A\" with value
   placeholder = \"foo\". When FN is instantiated with attr \"foo\"
   set to \"bar\", the instantiated node N's attr A will have been
   given the value \"bar\".
  string placeholder = 9;

  returns: `java.lang.String`"
  (^java.lang.String [^AttrValue$Builder this]
    (-> this (.getPlaceholder))))

(defn get-shape
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^AttrValue$Builder this]
    (-> this (.getShape))))

(defn clear-f
  "\"float\"
  float f = 4;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearF))))

(defn set-type-value
  "\"type\"
  .tensorflow.DataType type = 6;

  value - `int`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^Integer value]
    (-> this (.setTypeValue value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-placeholder
  "This is a placeholder only used in nodes defined inside a
   function.  It indicates the attr value will be supplied when
   the function is instantiated.  For example, let us suppose a
   node \"N\" in function \"FN\". \"N\" has an attr \"A\" with value
   placeholder = \"foo\". When FN is instantiated with attr \"foo\"
   set to \"bar\", the instantiated node N's attr A will have been
   given the value \"bar\".
  string placeholder = 9;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearPlaceholder))))

(defn set-f
  "\"float\"
  float f = 4;

  value - `float`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^Float value]
    (-> this (.setF value))))

(defn clone
  "returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^AttrValue$Builder this]
    (-> this (.getDescriptorForType))))

(defn has-func?
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `boolean`"
  (^Boolean [^AttrValue$Builder this]
    (-> this (.hasFunc))))

(defn clear-shape
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearShape))))

(defn clear
  "returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-i
  "\"int\"
  int64 i = 3;

  value - `long`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^Long value]
    (-> this (.setI value))))

(defn get-tensor
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^AttrValue$Builder this]
    (-> this (.getTensor))))

(defn set-func
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  value - `org.tensorflow.framework.NameAttrList`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this ^org.tensorflow.framework.NameAttrList value]
    (-> this (.setFunc value))))

(defn clear-tensor
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearTensor))))

(defn clear-b
  "\"bool\"
  bool b = 5;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue$Builder this]
    (-> this (.clearB))))

(defn has-list?
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `boolean`"
  (^Boolean [^AttrValue$Builder this]
    (-> this (.hasList))))

(defn get-func-builder
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^AttrValue$Builder this]
    (-> this (.getFuncBuilder))))

(defn get-s
  "\"string\"
  bytes s = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AttrValue$Builder this]
    (-> this (.getS))))

