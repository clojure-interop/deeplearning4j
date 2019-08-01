(ns org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder
  " Inputs of this node. They must be executed before this node can be
  executed. An input is a particular output of another node, specified
  by the node id and the output index.
 Protobuf type tensorflow.CostGraphDef.Node.InputInfo"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef$Node$InputInfo$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (CostGraphDef$Node$InputInfo$Builder/getDescriptor )))

(defn clear-preceding-port
  "int32 preceding_port = 2;

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.clearPrecedingPort))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn get-preceding-port
  "int32 preceding_port = 2;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.getPrecedingPort))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.build))))

(defn set-preceding-node
  "int32 preceding_node = 1;

  value - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^Integer value]
    (-> this (.setPrecedingNode value))))

(defn clear-preceding-node
  "int32 preceding_node = 1;

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.clearPrecedingNode))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn set-preceding-port
  "int32 preceding_port = 2;

  value - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^Integer value]
    (-> this (.setPrecedingPort value))))

(defn clone
  "returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$InputInfo$Builder [^CostGraphDef$Node$InputInfo$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-preceding-node
  "int32 preceding_node = 1;

  returns: `int`"
  (^Integer [^CostGraphDef$Node$InputInfo$Builder this]
    (-> this (.getPrecedingNode))))

