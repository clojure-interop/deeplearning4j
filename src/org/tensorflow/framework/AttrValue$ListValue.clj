(ns org.tensorflow.framework.AttrValue$ListValue
  " LINT.IfChange
 Protobuf type tensorflow.AttrValue.ListValue"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AttrValue$ListValue]))

(def *-s-field-number
  "Static Constant.

  type: int"
  AttrValue$ListValue/S_FIELD_NUMBER)

(def *-i-field-number
  "Static Constant.

  type: int"
  AttrValue$ListValue/I_FIELD_NUMBER)

(def *-f-field-number
  "Static Constant.

  type: int"
  AttrValue$ListValue/F_FIELD_NUMBER)

(def *-b-field-number
  "Static Constant.

  type: int"
  AttrValue$ListValue/B_FIELD_NUMBER)

(def *-type-field-number
  "Static Constant.

  type: int"
  AttrValue$ListValue/TYPE_FIELD_NUMBER)

(def *-shape-field-number
  "Static Constant.

  type: int"
  AttrValue$ListValue/SHAPE_FIELD_NUMBER)

(def *-tensor-field-number
  "Static Constant.

  type: int"
  AttrValue$ListValue/TENSOR_FIELD_NUMBER)

(def *-func-field-number
  "Static Constant.

  type: int"
  AttrValue$ListValue/FUNC_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (AttrValue$ListValue/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AttrValue$ListValue`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.AttrValue$ListValue [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (AttrValue$ListValue/parseFrom data extension-registry))
  (^org.tensorflow.framework.AttrValue$ListValue [^java.nio.ByteBuffer data]
    (AttrValue$ListValue/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AttrValue$ListValue`

  throws: java.io.IOException"
  (^org.tensorflow.framework.AttrValue$ListValue [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (AttrValue$ListValue/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.AttrValue$ListValue [^java.io.InputStream input]
    (AttrValue$ListValue/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.AttrValue$ListValue`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^org.tensorflow.framework.AttrValue$ListValue prototype]
    (AttrValue$ListValue/newBuilder prototype))
  (^org.tensorflow.framework.AttrValue$ListValue$Builder []
    (AttrValue$ListValue/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.AttrValue$ListValue`"
  (^org.tensorflow.framework.AttrValue$ListValue []
    (AttrValue$ListValue/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.AttrValue$ListValue>`"
  (^com.github.os72.protobuf351.Parser []
    (AttrValue$ListValue/parser )))

(defn get-f
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  index - `int`

  returns: `float`"
  (^Float [^AttrValue$ListValue this ^Integer index]
    (-> this (.getF index))))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^AttrValue$ListValue this]
    (-> this (.getUnknownFields))))

(defn get-s-list
  "\"list(string)\"
  repeated bytes s = 2;

  returns: `java.util.List<com.github.os72.protobuf351.ByteString>`"
  (^java.util.List [^AttrValue$ListValue this]
    (-> this (.getSList))))

(defn get-shape-list
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `java.util.List<org.tensorflow.framework.TensorShapeProto>`"
  (^java.util.List [^AttrValue$ListValue this]
    (-> this (.getShapeList))))

(defn get-b?
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  index - `int`

  returns: `boolean`"
  (^Boolean [^AttrValue$ListValue this ^Integer index]
    (-> this (.getB index))))

(defn get-type-count
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValue this]
    (-> this (.getTypeCount))))

(defn get-type-list
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  returns: `java.util.List<org.tensorflow.framework.DataType>`"
  (^java.util.List [^AttrValue$ListValue this]
    (-> this (.getTypeList))))

(defn get-shape-count
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `int`"
  (^Integer [^AttrValue$ListValue this]
    (-> this (.getShapeCount))))

(defn get-type-value
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^AttrValue$ListValue this ^Integer index]
    (-> this (.getTypeValue index))))

(defn get-shape-or-builder
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^AttrValue$ListValue this ^Integer index]
    (-> this (.getShapeOrBuilder index))))

(defn get-type
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  index - `int`

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^AttrValue$ListValue this ^Integer index]
    (-> this (.getType index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^AttrValue$ListValue this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.AttrValue$ListValue`"
  (^org.tensorflow.framework.AttrValue$ListValue [^AttrValue$ListValue this]
    (-> this (.getDefaultInstanceForType))))

(defn get-s-count
  "\"list(string)\"
  repeated bytes s = 2;

  returns: `int`"
  (^Integer [^AttrValue$ListValue this]
    (-> this (.getSCount))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^AttrValue$ListValue this]
    (-> this (.getSerializedSize))))

(defn get-func
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`

  returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList [^AttrValue$ListValue this ^Integer index]
    (-> this (.getFunc index))))

(defn get-i-list
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^AttrValue$ListValue this]
    (-> this (.getIList))))

(defn get-type-value-list
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^AttrValue$ListValue this]
    (-> this (.getTypeValueList))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^AttrValue$ListValue this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-func-or-builder
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`

  returns: `org.tensorflow.framework.NameAttrListOrBuilder`"
  (^org.tensorflow.framework.NameAttrListOrBuilder [^AttrValue$ListValue this ^Integer index]
    (-> this (.getFuncOrBuilder index))))

(defn get-func-count
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `int`"
  (^Integer [^AttrValue$ListValue this]
    (-> this (.getFuncCount))))

(defn get-tensor-or-builder-list
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder>`"
  ([^AttrValue$ListValue this]
    (-> this (.getTensorOrBuilderList))))

(defn get-tensor-or-builder
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^AttrValue$ListValue this ^Integer index]
    (-> this (.getTensorOrBuilder index))))

(defn get-i
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^AttrValue$ListValue this ^Integer index]
    (-> this (.getI index))))

(defn get-f-count
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValue this]
    (-> this (.getFCount))))

(defn get-func-list
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `java.util.List<org.tensorflow.framework.NameAttrList>`"
  (^java.util.List [^AttrValue$ListValue this]
    (-> this (.getFuncList))))

(defn get-i-count
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValue this]
    (-> this (.getICount))))

(defn get-shape
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^AttrValue$ListValue this ^Integer index]
    (-> this (.getShape index))))

(defn get-b-count
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValue this]
    (-> this (.getBCount))))

(defn get-f-list
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^AttrValue$ListValue this]
    (-> this (.getFList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AttrValue$ListValue this]
    (-> this (.hashCode))))

(defn get-b-list
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  returns: `java.util.List<java.lang.Boolean>`"
  (^java.util.List [^AttrValue$ListValue this]
    (-> this (.getBList))))

(defn get-func-or-builder-list
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `java.util.List<? extends org.tensorflow.framework.NameAttrListOrBuilder>`"
  ([^AttrValue$ListValue this]
    (-> this (.getFuncOrBuilderList))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.AttrValue$ListValue>`"
  (^com.github.os72.protobuf351.Parser [^AttrValue$ListValue this]
    (-> this (.getParserForType))))

(defn get-tensor-count
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `int`"
  (^Integer [^AttrValue$ListValue this]
    (-> this (.getTensorCount))))

(defn get-tensor-list
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `java.util.List<org.tensorflow.framework.TensorProto>`"
  (^java.util.List [^AttrValue$ListValue this]
    (-> this (.getTensorList))))

(defn get-shape-or-builder-list
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorShapeProtoOrBuilder>`"
  ([^AttrValue$ListValue this]
    (-> this (.getShapeOrBuilderList))))

(defn get-tensor
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^AttrValue$ListValue this ^Integer index]
    (-> this (.getTensor index))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AttrValue$ListValue this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue this]
    (-> this (.toBuilder))))

(defn get-s
  "\"list(string)\"
  repeated bytes s = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AttrValue$ListValue this ^Integer index]
    (-> this (.getS index))))

