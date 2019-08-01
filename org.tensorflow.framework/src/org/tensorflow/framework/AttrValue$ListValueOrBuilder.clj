(ns org.tensorflow.framework.AttrValue$ListValueOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AttrValue$ListValueOrBuilder]))

(defn get-f
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  index - `int`

  returns: `float`"
  (^Float [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getF index))))

(defn get-s-list
  "\"list(string)\"
  repeated bytes s = 2;

  returns: `java.util.List<com.github.os72.protobuf351.ByteString>`"
  (^java.util.List [^AttrValue$ListValueOrBuilder this]
    (-> this (.getSList))))

(defn get-shape-list
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `java.util.List<org.tensorflow.framework.TensorShapeProto>`"
  (^java.util.List [^AttrValue$ListValueOrBuilder this]
    (-> this (.getShapeList))))

(defn get-b?
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  index - `int`

  returns: `boolean`"
  (^Boolean [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getB index))))

(defn get-type-count
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValueOrBuilder this]
    (-> this (.getTypeCount))))

(defn get-type-list
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  returns: `java.util.List<org.tensorflow.framework.DataType>`"
  (^java.util.List [^AttrValue$ListValueOrBuilder this]
    (-> this (.getTypeList))))

(defn get-shape-count
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `int`"
  (^Integer [^AttrValue$ListValueOrBuilder this]
    (-> this (.getShapeCount))))

(defn get-type-value
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getTypeValue index))))

(defn get-shape-or-builder
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getShapeOrBuilder index))))

(defn get-type
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  index - `int`

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getType index))))

(defn get-s-count
  "\"list(string)\"
  repeated bytes s = 2;

  returns: `int`"
  (^Integer [^AttrValue$ListValueOrBuilder this]
    (-> this (.getSCount))))

(defn get-func
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`

  returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getFunc index))))

(defn get-i-list
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^AttrValue$ListValueOrBuilder this]
    (-> this (.getIList))))

(defn get-type-value-list
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^AttrValue$ListValueOrBuilder this]
    (-> this (.getTypeValueList))))

(defn get-func-or-builder
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`

  returns: `org.tensorflow.framework.NameAttrListOrBuilder`"
  (^org.tensorflow.framework.NameAttrListOrBuilder [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getFuncOrBuilder index))))

(defn get-func-count
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `int`"
  (^Integer [^AttrValue$ListValueOrBuilder this]
    (-> this (.getFuncCount))))

(defn get-tensor-or-builder-list
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder>`"
  ([^AttrValue$ListValueOrBuilder this]
    (-> this (.getTensorOrBuilderList))))

(defn get-tensor-or-builder
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getTensorOrBuilder index))))

(defn get-i
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getI index))))

(defn get-f-count
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValueOrBuilder this]
    (-> this (.getFCount))))

(defn get-func-list
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `java.util.List<org.tensorflow.framework.NameAttrList>`"
  (^java.util.List [^AttrValue$ListValueOrBuilder this]
    (-> this (.getFuncList))))

(defn get-i-count
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValueOrBuilder this]
    (-> this (.getICount))))

(defn get-shape
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getShape index))))

(defn get-b-count
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValueOrBuilder this]
    (-> this (.getBCount))))

(defn get-f-list
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^AttrValue$ListValueOrBuilder this]
    (-> this (.getFList))))

(defn get-b-list
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  returns: `java.util.List<java.lang.Boolean>`"
  (^java.util.List [^AttrValue$ListValueOrBuilder this]
    (-> this (.getBList))))

(defn get-func-or-builder-list
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `java.util.List<? extends org.tensorflow.framework.NameAttrListOrBuilder>`"
  ([^AttrValue$ListValueOrBuilder this]
    (-> this (.getFuncOrBuilderList))))

(defn get-tensor-count
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `int`"
  (^Integer [^AttrValue$ListValueOrBuilder this]
    (-> this (.getTensorCount))))

(defn get-tensor-list
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `java.util.List<org.tensorflow.framework.TensorProto>`"
  (^java.util.List [^AttrValue$ListValueOrBuilder this]
    (-> this (.getTensorList))))

(defn get-shape-or-builder-list
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorShapeProtoOrBuilder>`"
  ([^AttrValue$ListValueOrBuilder this]
    (-> this (.getShapeOrBuilderList))))

(defn get-tensor
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getTensor index))))

(defn get-s
  "\"list(string)\"
  repeated bytes s = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AttrValue$ListValueOrBuilder this ^Integer index]
    (-> this (.getS index))))

