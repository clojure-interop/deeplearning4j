(ns org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder
  "Protobuf type tensorflow.GraphTransferInfo.NodeInput"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeInput$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$NodeInput$Builder/getDescriptor )))

(defn set-output-port
  "int32 output_port = 2;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^Integer value]
    (-> this (.setOutputPort value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-output-port
  "int32 output_port = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.getOutputPort))))

(defn build-partial
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.isInitialized))))

(defn clear-output-port
  "int32 output_port = 2;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.clearOutputPort))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-node-id
  "int32 node_id = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.getNodeId))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clear-node-id
  "int32 node_id = 1;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.clearNodeId))))

(defn clone
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-node-id
  "int32 node_id = 1;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInput$Builder this ^Integer value]
    (-> this (.setNodeId value))))

