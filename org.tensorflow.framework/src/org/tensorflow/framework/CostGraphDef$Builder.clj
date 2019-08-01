(ns org.tensorflow.framework.CostGraphDef$Builder
  "Protobuf type tensorflow.CostGraphDef"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework CostGraphDef$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (CostGraphDef$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn add-all-node
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^java.lang.Iterable values]
    (-> this (.addAllNode values))))

(defn build-partial
  "returns: `org.tensorflow.framework.CostGraphDef`"
  (^org.tensorflow.framework.CostGraphDef [^CostGraphDef$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^CostGraphDef$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.CostGraphDef`"
  (^org.tensorflow.framework.CostGraphDef [^CostGraphDef$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-node-count
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `int`"
  (^Integer [^CostGraphDef$Builder this]
    (-> this (.getNodeCount))))

(defn add-node
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`
  value - `org.tensorflow.framework.CostGraphDef$Node`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^Integer index ^org.tensorflow.framework.CostGraphDef$Node value]
    (-> this (.addNode index value)))
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^org.tensorflow.framework.CostGraphDef$Node value]
    (-> this (.addNode value))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-node-builder
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Builder this ^Integer index]
    (-> this (.getNodeBuilder index))))

(defn set-node
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`
  value - `org.tensorflow.framework.CostGraphDef$Node`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^Integer index ^org.tensorflow.framework.CostGraphDef$Node value]
    (-> this (.setNode index value))))

(defn get-node
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node`"
  (^org.tensorflow.framework.CostGraphDef$Node [^CostGraphDef$Builder this ^Integer index]
    (-> this (.getNode index))))

(defn get-node-or-builder
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$NodeOrBuilder`"
  (^org.tensorflow.framework.CostGraphDef$NodeOrBuilder [^CostGraphDef$Builder this ^Integer index]
    (-> this (.getNodeOrBuilder index))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn remove-node
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^Integer index]
    (-> this (.removeNode index))))

(defn build
  "returns: `org.tensorflow.framework.CostGraphDef`"
  (^org.tensorflow.framework.CostGraphDef [^CostGraphDef$Builder this]
    (-> this (.build))))

(defn clear-node
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this]
    (-> this (.clearNode))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-node-or-builder-list
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.CostGraphDef$NodeOrBuilder>`"
  ([^CostGraphDef$Builder this]
    (-> this (.getNodeOrBuilderList))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^CostGraphDef$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.CostGraphDef$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Builder [^CostGraphDef$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-node-builder-list
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node$Builder>`"
  (^java.util.List [^CostGraphDef$Builder this]
    (-> this (.getNodeBuilderList))))

(defn add-node-builder
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  index - `int`

  returns: `org.tensorflow.framework.CostGraphDef$Node$Builder`"
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Builder this ^Integer index]
    (-> this (.addNodeBuilder index)))
  (^org.tensorflow.framework.CostGraphDef$Node$Builder [^CostGraphDef$Builder this]
    (-> this (.addNodeBuilder))))

(defn get-node-list
  "repeated .tensorflow.CostGraphDef.Node node = 1;

  returns: `java.util.List<org.tensorflow.framework.CostGraphDef$Node>`"
  (^java.util.List [^CostGraphDef$Builder this]
    (-> this (.getNodeList))))

