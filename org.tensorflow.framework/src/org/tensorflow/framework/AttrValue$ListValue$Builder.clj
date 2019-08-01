(ns org.tensorflow.framework.AttrValue$ListValue$Builder
  " LINT.IfChange
 Protobuf type tensorflow.AttrValue.ListValue"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework AttrValue$ListValue$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (AttrValue$ListValue$Builder/getDescriptor )))

(defn get-f
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  index - `int`

  returns: `float`"
  (^Float [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getF index))))

(defn get-tensor-builder
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getTensorBuilder index))))

(defn get-s-list
  "\"list(string)\"
  repeated bytes s = 2;

  returns: `java.util.List<com.github.os72.protobuf351.ByteString>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getSList))))

(defn clear-s
  "\"list(string)\"
  repeated bytes s = 2;

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.clearS))))

(defn get-shape-list
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `java.util.List<org.tensorflow.framework.TensorShapeProto>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getShapeList))))

(defn get-b?
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  index - `int`

  returns: `boolean`"
  (^Boolean [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getB index))))

(defn get-type-count
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValue$Builder this]
    (-> this (.getTypeCount))))

(defn get-type-list
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  returns: `java.util.List<org.tensorflow.framework.DataType>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getTypeList))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn add-all-tensor
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^java.lang.Iterable values]
    (-> this (.addAllTensor values))))

(defn get-shape-count
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `int`"
  (^Integer [^AttrValue$ListValue$Builder this]
    (-> this (.getShapeCount))))

(defn get-type-value
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  index - `int`

  returns: `int`"
  (^Integer [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getTypeValue index))))

(defn add-all-shape
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^java.lang.Iterable values]
    (-> this (.addAllShape values))))

(defn clear-i
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.clearI))))

(defn build-partial
  "returns: `org.tensorflow.framework.AttrValue$ListValue`"
  (^org.tensorflow.framework.AttrValue$ListValue [^AttrValue$ListValue$Builder this]
    (-> this (.buildPartial))))

(defn set-b
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  index - `int`
  value - `boolean`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^Boolean value]
    (-> this (.setB index value))))

(defn add-all-func
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^java.lang.Iterable values]
    (-> this (.addAllFunc values))))

(defn get-shape-or-builder
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getShapeOrBuilder index))))

(defn get-type
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  index - `int`

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getType index))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^AttrValue$ListValue$Builder this]
    (-> this (.isInitialized))))

(defn add-shape-builder
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.addShapeBuilder index)))
  (^org.tensorflow.framework.TensorShapeProto$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.addShapeBuilder))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.AttrValue$ListValue`"
  (^org.tensorflow.framework.AttrValue$ListValue [^AttrValue$ListValue$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn add-i
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  value - `long`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Long value]
    (-> this (.addI value))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-type
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  index - `int`
  value - `org.tensorflow.framework.DataType`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^org.tensorflow.framework.DataType value]
    (-> this (.setType index value))))

(defn get-s-count
  "\"list(string)\"
  repeated bytes s = 2;

  returns: `int`"
  (^Integer [^AttrValue$ListValue$Builder this]
    (-> this (.getSCount))))

(defn set-shape
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`
  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.setShape index value))))

(defn add-tensor-builder
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto$Builder`"
  (^org.tensorflow.framework.TensorProto$Builder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.addTensorBuilder index)))
  (^org.tensorflow.framework.TensorProto$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.addTensorBuilder))))

(defn add-all-i
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^java.lang.Iterable values]
    (-> this (.addAllI values))))

(defn get-shape-builder-list
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `java.util.List<org.tensorflow.framework.TensorShapeProto$Builder>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getShapeBuilderList))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn add-f
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  value - `float`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Float value]
    (-> this (.addF value))))

(defn get-tensor-builder-list
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `java.util.List<org.tensorflow.framework.TensorProto$Builder>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getTensorBuilderList))))

(defn add-all-b
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^java.lang.Iterable values]
    (-> this (.addAllB values))))

(defn add-func
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`
  value - `org.tensorflow.framework.NameAttrList`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^org.tensorflow.framework.NameAttrList value]
    (-> this (.addFunc index value)))
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^org.tensorflow.framework.NameAttrList value]
    (-> this (.addFunc value))))

(defn get-func
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`

  returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getFunc index))))

(defn add-s
  "\"list(string)\"
  repeated bytes s = 2;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.addS value))))

(defn remove-tensor
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.removeTensor index))))

(defn get-func-builder-list
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `java.util.List<org.tensorflow.framework.NameAttrList$Builder>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getFuncBuilderList))))

(defn set-s
  "\"list(string)\"
  repeated bytes s = 2;

  index - `int`
  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setS index value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-i-list
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getIList))))

(defn add-all-type
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^java.lang.Iterable values]
    (-> this (.addAllType values))))

(defn add-type-value
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  value - `int`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer value]
    (-> this (.addTypeValue value))))

(defn get-type-value-list
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getTypeValueList))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn add-tensor
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`
  value - `org.tensorflow.framework.TensorProto`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^org.tensorflow.framework.TensorProto value]
    (-> this (.addTensor index value)))
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^org.tensorflow.framework.TensorProto value]
    (-> this (.addTensor value))))

(defn build
  "returns: `org.tensorflow.framework.AttrValue$ListValue`"
  (^org.tensorflow.framework.AttrValue$ListValue [^AttrValue$ListValue$Builder this]
    (-> this (.build))))

(defn clear-func
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.clearFunc))))

(defn get-func-or-builder
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`

  returns: `org.tensorflow.framework.NameAttrListOrBuilder`"
  (^org.tensorflow.framework.NameAttrListOrBuilder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getFuncOrBuilder index))))

(defn get-func-count
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `int`"
  (^Integer [^AttrValue$ListValue$Builder this]
    (-> this (.getFuncCount))))

(defn add-func-builder
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.addFuncBuilder index)))
  (^org.tensorflow.framework.NameAttrList$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.addFuncBuilder))))

(defn get-tensor-or-builder-list
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorProtoOrBuilder>`"
  ([^AttrValue$ListValue$Builder this]
    (-> this (.getTensorOrBuilderList))))

(defn get-tensor-or-builder
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`

  returns: `org.tensorflow.framework.TensorProtoOrBuilder`"
  (^org.tensorflow.framework.TensorProtoOrBuilder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getTensorOrBuilder index))))

(defn get-i
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  index - `int`

  returns: `long`"
  (^Long [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getI index))))

(defn get-shape-builder
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getShapeBuilder index))))

(defn remove-func
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.removeFunc index))))

(defn get-f-count
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValue$Builder this]
    (-> this (.getFCount))))

(defn get-func-list
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `java.util.List<org.tensorflow.framework.NameAttrList>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getFuncList))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-type
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.clearType))))

(defn remove-shape
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.removeShape index))))

(defn set-tensor
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`
  value - `org.tensorflow.framework.TensorProto`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^org.tensorflow.framework.TensorProto value]
    (-> this (.setTensor index value))))

(defn get-i-count
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValue$Builder this]
    (-> this (.getICount))))

(defn add-b
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  value - `boolean`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Boolean value]
    (-> this (.addB value))))

(defn get-shape
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getShape index))))

(defn clear-f
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.clearF))))

(defn set-type-value
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  index - `int`
  value - `int`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^Integer value]
    (-> this (.setTypeValue index value))))

(defn add-all-type-value
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^java.lang.Iterable values]
    (-> this (.addAllTypeValue values))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn set-f
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  index - `int`
  value - `float`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^Float value]
    (-> this (.setF index value))))

(defn add-all-f
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^java.lang.Iterable values]
    (-> this (.addAllF values))))

(defn get-b-count
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  returns: `int`"
  (^Integer [^AttrValue$ListValue$Builder this]
    (-> this (.getBCount))))

(defn clone
  "returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.clone))))

(defn add-shape
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  index - `int`
  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.addShape index value)))
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.addShape value))))

(defn get-f-list
  "\"list(float)\"
  repeated float f = 4 [packed = true];

  returns: `java.util.List<java.lang.Float>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getFList))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^AttrValue$ListValue$Builder this]
    (-> this (.getDescriptorForType))))

(defn add-all-s
  "\"list(string)\"
  repeated bytes s = 2;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^java.lang.Iterable values]
    (-> this (.addAllS values))))

(defn clear-shape
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.clearShape))))

(defn get-b-list
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  returns: `java.util.List<java.lang.Boolean>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getBList))))

(defn get-func-or-builder-list
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  returns: `java.util.List<? extends org.tensorflow.framework.NameAttrListOrBuilder>`"
  ([^AttrValue$ListValue$Builder this]
    (-> this (.getFuncOrBuilderList))))

(defn clear
  "returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.clear))))

(defn get-tensor-count
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `int`"
  (^Integer [^AttrValue$ListValue$Builder this]
    (-> this (.getTensorCount))))

(defn get-tensor-list
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `java.util.List<org.tensorflow.framework.TensorProto>`"
  (^java.util.List [^AttrValue$ListValue$Builder this]
    (-> this (.getTensorList))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-shape-or-builder-list
  "\"list(shape)\"
  repeated .tensorflow.TensorShapeProto shape = 7;

  returns: `java.util.List<? extends org.tensorflow.framework.TensorShapeProtoOrBuilder>`"
  ([^AttrValue$ListValue$Builder this]
    (-> this (.getShapeOrBuilderList))))

(defn set-i
  "\"list(int)\"
  repeated int64 i = 3 [packed = true];

  index - `int`
  value - `long`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^Long value]
    (-> this (.setI index value))))

(defn get-tensor
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  index - `int`

  returns: `org.tensorflow.framework.TensorProto`"
  (^org.tensorflow.framework.TensorProto [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getTensor index))))

(defn set-func
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`
  value - `org.tensorflow.framework.NameAttrList`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^Integer index ^org.tensorflow.framework.NameAttrList value]
    (-> this (.setFunc index value))))

(defn clear-tensor
  "\"list(tensor)\"
  repeated .tensorflow.TensorProto tensor = 8;

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.clearTensor))))

(defn clear-b
  "\"list(bool)\"
  repeated bool b = 5 [packed = true];

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this]
    (-> this (.clearB))))

(defn add-type
  "\"list(type)\"
  repeated .tensorflow.DataType type = 6 [packed = true];

  value - `org.tensorflow.framework.DataType`

  returns: `org.tensorflow.framework.AttrValue$ListValue$Builder`"
  (^org.tensorflow.framework.AttrValue$ListValue$Builder [^AttrValue$ListValue$Builder this ^org.tensorflow.framework.DataType value]
    (-> this (.addType value))))

(defn get-func-builder
  "\"list(attr)\"
  repeated .tensorflow.NameAttrList func = 9;

  index - `int`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getFuncBuilder index))))

(defn get-s
  "\"list(string)\"
  repeated bytes s = 2;

  index - `int`

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^AttrValue$ListValue$Builder this ^Integer index]
    (-> this (.getS index))))

