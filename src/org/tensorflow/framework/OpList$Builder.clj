(ns org.tensorflow.framework.OpList$Builder
  " A collection of OpDefs
 Protobuf type tensorflow.OpList"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpList$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpList$Builder/getDescriptor )))

(defn remove-op
  "repeated .tensorflow.OpDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^Integer index]
    (-> this (.removeOp index))))

(defn add-op
  "repeated .tensorflow.OpDef op = 1;

  index - `int`
  value - `org.tensorflow.framework.OpDef`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^Integer index ^org.tensorflow.framework.OpDef value]
    (-> this (.addOp index value)))
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^org.tensorflow.framework.OpDef value]
    (-> this (.addOp value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-op
  "repeated .tensorflow.OpDef op = 1;

  index - `int`
  value - `org.tensorflow.framework.OpDef`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^Integer index ^org.tensorflow.framework.OpDef value]
    (-> this (.setOp index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.OpList`"
  (^org.tensorflow.framework.OpList [^OpList$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpList$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.OpList`"
  (^org.tensorflow.framework.OpList [^OpList$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn add-op-builder
  "repeated .tensorflow.OpDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpList$Builder this ^Integer index]
    (-> this (.addOpBuilder index)))
  (^org.tensorflow.framework.OpDef$Builder [^OpList$Builder this]
    (-> this (.addOpBuilder))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-op-list
  "repeated .tensorflow.OpDef op = 1;

  returns: `java.util.List<org.tensorflow.framework.OpDef>`"
  (^java.util.List [^OpList$Builder this]
    (-> this (.getOpList))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-op
  "repeated .tensorflow.OpDef op = 1;

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this]
    (-> this (.clearOp))))

(defn add-all-op
  "repeated .tensorflow.OpDef op = 1;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOp values))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.OpList`"
  (^org.tensorflow.framework.OpList [^OpList$Builder this]
    (-> this (.build))))

(defn get-op-count
  "repeated .tensorflow.OpDef op = 1;

  returns: `int`"
  (^Integer [^OpList$Builder this]
    (-> this (.getOpCount))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpList$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OpList$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this]
    (-> this (.clear))))

(defn get-op
  "repeated .tensorflow.OpDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^OpList$Builder this ^Integer index]
    (-> this (.getOp index))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-op-builder
  "repeated .tensorflow.OpDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.OpDef$Builder`"
  (^org.tensorflow.framework.OpDef$Builder [^OpList$Builder this ^Integer index]
    (-> this (.getOpBuilder index))))

(defn get-op-or-builder-list
  "repeated .tensorflow.OpDef op = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDefOrBuilder>`"
  ([^OpList$Builder this]
    (-> this (.getOpOrBuilderList))))

(defn get-op-or-builder
  "repeated .tensorflow.OpDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.OpDefOrBuilder`"
  (^org.tensorflow.framework.OpDefOrBuilder [^OpList$Builder this ^Integer index]
    (-> this (.getOpOrBuilder index))))

(defn get-op-builder-list
  "repeated .tensorflow.OpDef op = 1;

  returns: `java.util.List<org.tensorflow.framework.OpDef$Builder>`"
  (^java.util.List [^OpList$Builder this]
    (-> this (.getOpBuilderList))))

