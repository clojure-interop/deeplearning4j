(ns org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder
  "Protobuf type tensorflow.GraphTransferInfo.NodeOutputInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeOutputInfo$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$NodeOutputInfo$Builder/getDescriptor )))

(defn add-max-byte-size
  "repeated int32 max_byte_size = 2;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^Integer value]
    (-> this (.addMaxByteSize value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.isInitialized))))

(defn get-max-byte-size
  "repeated int32 max_byte_size = 2;

  index - `int`

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfo$Builder this ^Integer index]
    (-> this (.getMaxByteSize index))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-max-byte-size-list
  "repeated int32 max_byte_size = 2;

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.getMaxByteSizeList))))

(defn get-max-byte-size-count
  "repeated int32 max_byte_size = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.getMaxByteSizeCount))))

(defn add-all-max-byte-size
  "repeated int32 max_byte_size = 2;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllMaxByteSize values))))

(defn clear-max-byte-size
  "repeated int32 max_byte_size = 2;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.clearMaxByteSize))))

(defn set-max-byte-size
  "repeated int32 max_byte_size = 2;

  index - `int`
  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^Integer index ^Integer value]
    (-> this (.setMaxByteSize index value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-node-id
  "int32 node_id = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.getNodeId))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-node-id
  "int32 node_id = 1;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.clearNodeId))))

(defn clone
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-node-id
  "int32 node_id = 1;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeOutputInfo$Builder [^GraphTransferInfo$NodeOutputInfo$Builder this ^Integer value]
    (-> this (.setNodeId value))))

