(ns org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder
  "Protobuf type tensorflow.GraphTransferInfo.NodeInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeInfo$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$NodeInfo$Builder/getDescriptor )))

(defn set-soc-op-id
  "int32 soc_op_id = 4;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^Integer value]
    (-> this (.setSocOpId value))))

(defn clear-name
  "string name = 1;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.clearName))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.buildPartial))))

(defn get-padding-id
  "int32 padding_id = 5;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getPaddingId))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getNameBytes))))

(defn get-input-count
  "int32 input_count = 6;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getInputCount))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-padding-id
  "int32 padding_id = 5;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.clearPaddingId))))

(defn set-name
  "string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn get-type-name-bytes
  "string type_name = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getTypeNameBytes))))

(defn set-input-count
  "int32 input_count = 6;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^Integer value]
    (-> this (.setInputCount value))))

(defn set-padding-id
  "int32 padding_id = 5;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^Integer value]
    (-> this (.setPaddingId value))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-output-count
  "int32 output_count = 7;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^Integer value]
    (-> this (.setOutputCount value))))

(defn set-name-bytes
  "string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn get-node-id
  "int32 node_id = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getNodeId))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.build))))

(defn get-output-count
  "int32 output_count = 7;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getOutputCount))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-soc-op-id
  "int32 soc_op_id = 4;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.clearSocOpId))))

(defn set-type-name
  "string type_name = 3;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^java.lang.String value]
    (-> this (.setTypeName value))))

(defn clear-type-name
  "string type_name = 3;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.clearTypeName))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-node-id
  "int32 node_id = 2;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.clearNodeId))))

(defn clone
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.clone))))

(defn get-soc-op-id
  "int32 soc_op_id = 4;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getSocOpId))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-node-id
  "int32 node_id = 2;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^Integer value]
    (-> this (.setNodeId value))))

(defn get-type-name
  "string type_name = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.getTypeName))))

(defn set-type-name-bytes
  "string type_name = 3;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setTypeNameBytes value))))

(defn clear-input-count
  "int32 input_count = 6;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.clearInputCount))))

(defn clear-output-count
  "int32 output_count = 7;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInfo$Builder [^GraphTransferInfo$NodeInfo$Builder this]
    (-> this (.clearOutputCount))))

