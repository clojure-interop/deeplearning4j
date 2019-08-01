(ns org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder
  "Protobuf type tensorflow.GraphTransferInfo.ConstNodeInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$ConstNodeInfo$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$ConstNodeInfo$Builder/getDescriptor )))

(defn clear-name
  "string name = 1;

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.clearName))))

(defn get-shape-list
  "repeated int64 shape = 3;

  returns: `java.util.List<java.lang.Long>`"
  (^java.util.List [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.getShapeList))))

(defn get-dtype
  ".tensorflow.DataType dtype = 5;

  returns: `org.tensorflow.framework.DataType`"
  (^org.tensorflow.framework.DataType [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.getDtype))))

(defn set-data
  "bytes data = 4;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setData value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-shape-count
  "repeated int64 shape = 3;

  returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.getShapeCount))))

(defn get-data
  "bytes data = 4;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.getData))))

(defn add-all-shape
  "repeated int64 shape = 3;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllShape values))))

(defn build-partial
  "returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.buildPartial))))

(defn clear-dtype
  ".tensorflow.DataType dtype = 5;

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.clearDtype))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn clear-data
  "bytes data = 4;

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.clearData))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn set-shape
  "repeated int64 shape = 3;

  index - `int`
  value - `long`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^Integer index ^Long value]
    (-> this (.setShape index value))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.getNameBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn set-dtype
  ".tensorflow.DataType dtype = 5;

  value - `org.tensorflow.framework.DataType`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^org.tensorflow.framework.DataType value]
    (-> this (.setDtype value))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-name-bytes
  "string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn get-node-id
  "int32 node_id = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.getNodeId))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.build))))

(defn get-dtype-value
  ".tensorflow.DataType dtype = 5;

  returns: `int`"
  (^Integer [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.getDtypeValue))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-shape
  "repeated int64 shape = 3;

  index - `int`

  returns: `long`"
  (^Long [^GraphTransferInfo$ConstNodeInfo$Builder this ^Integer index]
    (-> this (.getShape index))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-node-id
  "int32 node_id = 2;

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.clearNodeId))))

(defn clone
  "returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.clone))))

(defn add-shape
  "repeated int64 shape = 3;

  value - `long`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^Long value]
    (-> this (.addShape value))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-shape
  "repeated int64 shape = 3;

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.clearShape))))

(defn clear
  "returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-node-id
  "int32 node_id = 2;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^Integer value]
    (-> this (.setNodeId value))))

(defn set-dtype-value
  ".tensorflow.DataType dtype = 5;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$ConstNodeInfo$Builder [^GraphTransferInfo$ConstNodeInfo$Builder this ^Integer value]
    (-> this (.setDtypeValue value))))

