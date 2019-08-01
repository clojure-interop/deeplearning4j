(ns org.tensorflow.framework.AttrValueOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AttrValueOrBuilder]))

(defn get-f
  "\"float\"
  float f = 4;

  returns: `float`"
  (^Float [^AttrValueOrBuilder this]
    (-> this (.getF))))

(defn has-shape?
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `boolean`"
  (^Boolean [^AttrValueOrBuilder this]
    (-> this (.hasShape))))

(defn get-b?
  "\"bool\"
  bool b = 5;

  returns: `boolean`"
  (^Boolean [^AttrValueOrBuilder this]
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
  (^com.github.os72.protobuf351.ByteString [^AttrValueOrBuilder this]
    (-> this (.getPlaceholderBytes))))

(defn get-type-value
  "\"type\"
  .tensorflow.DataType type = 6;

  returns: `int`"
  (^Integer [^AttrValueOrBuilder this]
    (-> this (.getTypeValue))))

(defn get-shape-or-builder
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^AttrValueOrBuilder this]
    (-> this (.getShapeOrBuilder))))

(defn get-type
  "\"type\"
  .tensorflow.DataType type = 6;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^AttrValueOrBuilder this]
    (-> this (.getType))))

(defn get-func
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList [^AttrValueOrBuilder this]
    (-> this (.getFunc))))

(defn has-tensor?
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `boolean`"
  (^Boolean [^AttrValueOrBuilder this]
    (-> this (.hasTensor))))

(defn get-func-or-builder
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `org.tensorflow.framework.NameAttrListOrBuilder`"
  (^org.tensorflow.framework.NameAttrListOrBuilder [^AttrValueOrBuilder this]
    (-> this (.getFuncOrBuilder))))

(defn get-list-or-builder
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `org.tensorflow.framework.AttrValue$ListValueOrBuilder`"
  (^org.tensorflow.framework.AttrValue$ListValueOrBuilder [^AttrValueOrBuilder this]
    (-> this (.getListOrBuilder))))

(defn get-tensor-or-builder
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^AttrValueOrBuilder this]
    (-> this (.getTensorOrBuilder))))

(defn get-i
  "\"int\"
  int64 i = 3;

  returns: `long`"
  (^Long [^AttrValueOrBuilder this]
    (-> this (.getI))))

(defn get-value-case
  "returns: `org.tensorflow.framework.AttrValue$ValueCase`"
  (^org.tensorflow.framework.AttrValue$ValueCase [^AttrValueOrBuilder this]
    (-> this (.getValueCase))))

(defn get-list
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `org.tensorflow.framework.AttrValue$ListValue`"
  (^org.tensorflow.framework.AttrValue$ListValue [^AttrValueOrBuilder this]
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
  (^java.lang.String [^AttrValueOrBuilder this]
    (-> this (.getPlaceholder))))

(defn get-shape
  "\"shape\"
  .tensorflow.TensorShapeProto shape = 7;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^AttrValueOrBuilder this]
    (-> this (.getShape))))

(defn has-func?
  "\"func\" represents a function. func.name is a function's name or
   a primitive op's name. func.attr.first is the name of an attr
   defined for that function. func.attr.second is the value for
   that attr in the instantiation.
  .tensorflow.NameAttrList func = 10;

  returns: `boolean`"
  (^Boolean [^AttrValueOrBuilder this]
    (-> this (.hasFunc))))

(defn get-tensor
  "\"tensor\"
  .tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^AttrValueOrBuilder this]
    (-> this (.getTensor))))

(defn has-list?
  "any \"list(...)\"
  .tensorflow.AttrValue.ListValue list = 1;

  returns: `boolean`"
  (^Boolean [^AttrValueOrBuilder this]
    (-> this (.hasList))))

(defn get-s
  "\"string\"
  bytes s = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AttrValueOrBuilder this]
    (-> this (.getS))))

