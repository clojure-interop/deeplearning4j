(ns org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder
  "Protobuf type tensorflow.RemoteFusedGraphExecuteInfo.TensorShapeTypeProto"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder/getDescriptor )))

(defn has-shape?
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.hasShape))))

(defn get-dtype
  ".tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.getDtype))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.buildPartial))))

(defn clear-dtype
  ".tensorflow.DataType dtype = 1;

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.clearDtype))))

(defn get-shape-or-builder
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProtoOrBuilder`"
  (^org.tensorflow.framework.TensorShapeProtoOrBuilder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.getShapeOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-shape
  ".tensorflow.TensorShapeProto shape = 2;

  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.setShape value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-dtype
  ".tensorflow.DataType dtype = 1;

  value - `org.tensorflow.framework.DataType`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^org.tensorflow.framework.DataType value]
    (-> this (.setDtype value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.build))))

(defn merge-shape
  ".tensorflow.TensorShapeProto shape = 2;

  value - `org.tensorflow.framework.TensorShapeProto`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^org.tensorflow.framework.TensorShapeProto value]
    (-> this (.mergeShape value))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 1;

  returns: `int`"
  (^Integer [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.getDtypeValue))))

(defn get-shape-builder
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto$Builder`"
  (^org.tensorflow.framework.TensorShapeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.getShapeBuilder))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-shape
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.TensorShapeProto`"
  (^org.tensorflow.framework.TensorShapeProto [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.getShape))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-shape
  ".tensorflow.TensorShapeProto shape = 2;

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.clearShape))))

(defn clear
  "returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-dtype-value
  ".tensorflow.DataType dtype = 1;

  value - `int`

  returns: `org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder`"
  (^org.tensorflow.framework.RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder [^RemoteFusedGraphExecuteInfo$TensorShapeTypeProto$Builder this ^Integer value]
    (-> this (.setDtypeValue value))))

