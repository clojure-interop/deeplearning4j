(ns org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder
  "Protobuf type tensorflow.GraphTransferInfo.NodeInputInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework GraphTransferInfo$NodeInputInfo$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (GraphTransferInfo$NodeInputInfo$Builder/getDescriptor )))

(defn get-node-input-or-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder [^GraphTransferInfo$NodeInputInfo$Builder this ^Integer index]
    (-> this (.getNodeInputOrBuilder index))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.buildPartial))))

(defn get-node-input-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder>`"
  (^java.util.List [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.getNodeInputBuilderList))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn add-all-node-input
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^java.lang.Iterable values]
    (-> this (.addAllNodeInput values))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-node-input-or-builder-list
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `java.util.List<? extends org.tensorflow.framework.GraphTransferInfo$NodeInputOrBuilder>`"
  ([^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.getNodeInputOrBuilderList))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn clear-node-input
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.clearNodeInput))))

(defn add-node-input
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$NodeInput`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$NodeInput value]
    (-> this (.addNodeInput index value)))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^org.tensorflow.framework.GraphTransferInfo$NodeInput value]
    (-> this (.addNodeInput value))))

(defn set-node-input
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`
  value - `org.tensorflow.framework.GraphTransferInfo$NodeInput`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^Integer index ^org.tensorflow.framework.GraphTransferInfo$NodeInput value]
    (-> this (.setNodeInput index value))))

(defn add-node-input-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^Integer index]
    (-> this (.addNodeInputBuilder index)))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.addNodeInputBuilder))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-node-input-builder
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^Integer index]
    (-> this (.getNodeInputBuilder index))))

(defn get-node-id
  "int32 node_id = 1;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.getNodeId))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.build))))

(defn get-node-input-count
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `int`"
  (^Integer [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.getNodeInputCount))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn get-node-input-list
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  returns: `java.util.List<org.tensorflow.framework.GraphTransferInfo$NodeInput>`"
  (^java.util.List [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.getNodeInputList))))

(defn clear-node-id
  "int32 node_id = 1;

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.clearNodeId))))

(defn clone
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.getDescriptorForType))))

(defn remove-node-input
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^Integer index]
    (-> this (.removeNodeInput index))))

(defn clear
  "returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-node-id
  "int32 node_id = 1;

  value - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInputInfo$Builder [^GraphTransferInfo$NodeInputInfo$Builder this ^Integer value]
    (-> this (.setNodeId value))))

(defn get-node-input
  "repeated .tensorflow.GraphTransferInfo.NodeInput node_input = 2;

  index - `int`

  returns: `org.tensorflow.framework.GraphTransferInfo$NodeInput`"
  (^org.tensorflow.framework.GraphTransferInfo$NodeInput [^GraphTransferInfo$NodeInputInfo$Builder this ^Integer index]
    (-> this (.getNodeInput index))))

