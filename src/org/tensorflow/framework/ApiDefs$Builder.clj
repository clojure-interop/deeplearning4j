(ns org.tensorflow.framework.ApiDefs$Builder
  "Protobuf type tensorflow.ApiDefs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDefs$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ApiDefs$Builder/getDescriptor )))

(defn remove-op
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^Integer index]
    (-> this (.removeOp index))))

(defn add-op
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`
  value - `org.tensorflow.framework.ApiDef`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^Integer index ^org.tensorflow.framework.ApiDef value]
    (-> this (.addOp index value)))
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^org.tensorflow.framework.ApiDef value]
    (-> this (.addOp value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-op
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`
  value - `org.tensorflow.framework.ApiDef`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^Integer index ^org.tensorflow.framework.ApiDef value]
    (-> this (.setOp index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.ApiDefs`"
  (^org.tensorflow.framework.ApiDefs [^ApiDefs$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ApiDefs$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ApiDefs`"
  (^org.tensorflow.framework.ApiDefs [^ApiDefs$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn add-op-builder
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDefs$Builder this ^Integer index]
    (-> this (.addOpBuilder index)))
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDefs$Builder this]
    (-> this (.addOpBuilder))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-op-list
  "repeated .tensorflow.ApiDef op = 1;

  returns: `java.util.List<org.tensorflow.framework.ApiDef>`"
  (^java.util.List [^ApiDefs$Builder this]
    (-> this (.getOpList))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-op
  "repeated .tensorflow.ApiDef op = 1;

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this]
    (-> this (.clearOp))))

(defn add-all-op
  "repeated .tensorflow.ApiDef op = 1;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOp values))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.ApiDefs`"
  (^org.tensorflow.framework.ApiDefs [^ApiDefs$Builder this]
    (-> this (.build))))

(defn get-op-count
  "repeated .tensorflow.ApiDef op = 1;

  returns: `int`"
  (^Integer [^ApiDefs$Builder this]
    (-> this (.getOpCount))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDefs$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^ApiDefs$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this]
    (-> this (.clear))))

(defn get-op
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef`"
  (^org.tensorflow.framework.ApiDef [^ApiDefs$Builder this ^Integer index]
    (-> this (.getOp index))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-op-builder
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef$Builder`"
  (^org.tensorflow.framework.ApiDef$Builder [^ApiDefs$Builder this ^Integer index]
    (-> this (.getOpBuilder index))))

(defn get-op-or-builder-list
  "repeated .tensorflow.ApiDef op = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDefOrBuilder>`"
  ([^ApiDefs$Builder this]
    (-> this (.getOpOrBuilderList))))

(defn get-op-or-builder
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.ApiDefOrBuilder`"
  (^org.tensorflow.framework.ApiDefOrBuilder [^ApiDefs$Builder this ^Integer index]
    (-> this (.getOpOrBuilder index))))

(defn get-op-builder-list
  "repeated .tensorflow.ApiDef op = 1;

  returns: `java.util.List<org.tensorflow.framework.ApiDef$Builder>`"
  (^java.util.List [^ApiDefs$Builder this]
    (-> this (.getOpBuilderList))))

