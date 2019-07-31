(ns org.tensorflow.framework.AttrValue
  " Protocol buffer representing the value for an attr used to configure an Op.
  Comment indicates the corresponding attr type.  Only the field matching the
  attr type may be filled.
 Protobuf type tensorflow.AttrValue"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AttrValue]))

(def *-s-field-number
  "Static Constant.

  type: int"
  AttrValue/S_FIELD_NUMBER)

(def *-i-field-number
  "Static Constant.

  type: int"
  AttrValue/I_FIELD_NUMBER)

(def *-f-field-number
  "Static Constant.

  type: int"
  AttrValue/F_FIELD_NUMBER)

(def *-b-field-number
  "Static Constant.

  type: int"
  AttrValue/B_FIELD_NUMBER)

(def *-type-field-number
  "Static Constant.

  type: int"
  AttrValue/TYPE_FIELD_NUMBER)

(def *-shape-field-number
  "Static Constant.

  type: int"
  AttrValue/SHAPE_FIELD_NUMBER)

(def *-tensor-field-number
  "Static Constant.

  type: int"
  AttrValue/TENSOR_FIELD_NUMBER)

(def *-list-field-number
  "Static Constant.

  type: int"
  AttrValue/LIST_FIELD_NUMBER)

(def *-func-field-number
  "Static Constant.

  type: int"
  AttrValue/FUNC_FIELD_NUMBER)

(def *-placeholder-field-number
  "Static Constant.

  type: int"
  AttrValue/PLACEHOLDER_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (AttrValue/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AttrValue`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.AttrValue [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (AttrValue/parseFrom data extension-registry))
  (^org.tensorflow.framework.AttrValue [^java.nio.ByteBuffer data]
    (AttrValue/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AttrValue`

  throws: java.io.IOException"
  (^org.tensorflow.framework.AttrValue [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (AttrValue/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.AttrValue [^java.io.InputStream input]
    (AttrValue/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^org.tensorflow.framework.AttrValue prototype]
    (AttrValue/newBuilder prototype))
  (^org.tensorflow.framework.AttrValue$Builder []
    (AttrValue/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue []
    (AttrValue/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.AttrValue>`"
  (^com.github.os72.protobuf351.Parser []
    (AttrValue/parser )))

(defn get-f
  "\"float\"
  float f = 4;

  returns: `float`"
  (^Float [^AttrValue this]
    (-> this (.getF))))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^AttrValue this]
    (-> this (.getUnknownFields))))

(defn has-shape?
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `boolean`"
  (^Boolean [^AttrValue this]
    (-> this (.hasShape))))

(defn get-b?
  "\"bool\"
  bool b = 5;

  returns: `boolean`"
  (^Boolean [^AttrValue this]
    (-> this (.getB))))

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
  (^com.github.os72.protobuf351.ByteString [^AttrValue this]
    (-> this (.getPlaceholderBytes))))

(defn get-type-value
  "\"type\"
  .tensorflow.DataType type = 6;

  returns: `int`"
  (^Integer [^AttrValue this]
    (-> this (.getTypeValue))))

(defn get-shape-or-builder
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^AttrValue this]
    (-> this (.getShapeOrBuilder))))

(defn get-type
  "\"type\"
  .tensorflow.DataType type = 6;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^AttrValue this]
    (-> this (.getType))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^AttrValue this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^AttrValue this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^AttrValue this]
    (-> this (.getSerializedSize))))

(defn get-func
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList [^AttrValue this]
    (-> this (.getFunc))))

(defn has-tensor?
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `boolean`"
  (^Boolean [^AttrValue this]
    (-> this (.hasTensor))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^AttrValue this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-func-or-builder
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `org.tensorflow.framework.NameAttrListOrBuilder`"
  (^org.tensorflow.framework.NameAttrListOrBuilder [^AttrValue this]
    (-> this (.getFuncOrBuilder))))

(defn get-list-or-builder
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `org.tensorflow.framework.AttrValue$ListValueOrBuilder`"
  (^org.tensorflow.framework.AttrValue$ListValueOrBuilder [^AttrValue this]
    (-> this (.getListOrBuilder))))

(defn get-tensor-or-builder
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^AttrValue this]
    (-> this (.getTensorOrBuilder))))

(defn get-i
  "\"int\"
  int64 i = 3;

  returns: `long`"
  (^Long [^AttrValue this]
    (-> this (.getI))))

(defn get-value-case
  "returns: `org.tensorflow.framework.AttrValue$ValueCase`"
  (^org.tensorflow.framework.AttrValue$ValueCase [^AttrValue this]
    (-> this (.getValueCase))))

(defn get-list
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `org.tensorflow.framework.AttrValue$ListValue`"
  (^org.tensorflow.framework.AttrValue$ListValue [^AttrValue this]
    (-> this (.getList))))

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
  (^java.lang.String [^AttrValue this]
    (-> this (.getPlaceholder))))

(defn get-shape
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^AttrValue this]
    (-> this (.getShape))))

(defn has-func?
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `boolean`"
  (^Boolean [^AttrValue this]
    (-> this (.hasFunc))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AttrValue this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.AttrValue>`"
  (^com.github.os72.protobuf351.Parser [^AttrValue this]
    (-> this (.getParserForType))))

(defn get-tensor
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^AttrValue this]
    (-> this (.getTensor))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AttrValue this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue this]
    (-> this (.newBuilderForType))))

(defn has-list?
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `boolean`"
  (^Boolean [^AttrValue this]
    (-> this (.hasList))))

(defn to-builder
  "returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^AttrValue this]
    (-> this (.toBuilder))))

(defn get-s
  "\"string\"
  bytes s = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AttrValue this]
    (-> this (.getS))))

