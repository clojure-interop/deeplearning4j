(ns tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder
  "Protobuf type tensorflow.OpGenOverrides"
  (:refer-clojure :only [require comment defn ->])
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverrides$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpGenOverridesOuterClass$OpGenOverrides$Builder/getDescriptor )))

(defn remove-op
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^Integer index]
    (-> this (.removeOp index))))

(defn add-op
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`
  value - `tensorflow.OpGenOverridesOuterClass$OpGenOverride`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^Integer index ^tensorflow.OpGenOverridesOuterClass$OpGenOverride value]
    (-> this (.addOp index value)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^tensorflow.OpGenOverridesOuterClass$OpGenOverride value]
    (-> this (.addOp value))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn set-op
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`
  value - `tensorflow.OpGenOverridesOuterClass$OpGenOverride`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^Integer index ^tensorflow.OpGenOverridesOuterClass$OpGenOverride value]
    (-> this (.setOp index value))))

(defn build-partial
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn add-op-builder
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^Integer index]
    (-> this (.addOpBuilder index)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.addOpBuilder))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn get-op-list
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.getOpList))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn clear-op
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.clearOp))))

(defn add-all-op
  "repeated .tensorflow.OpGenOverride op = 1;

  values - `java.lang.Iterable`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^java.lang.Iterable values]
    (-> this (.addAllOp values))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.build))))

(defn get-op-count
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.getOpCount))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`

  throws: java.io.IOException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.clear))))

(defn get-op
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^Integer index]
    (-> this (.getOp index))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-op-builder
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^Integer index]
    (-> this (.getOpBuilder index))))

(defn get-op-or-builder-list
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.getOpOrBuilderList))))

(defn get-op-or-builder
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder [^OpGenOverridesOuterClass$OpGenOverrides$Builder this ^Integer index]
    (-> this (.getOpOrBuilder index))))

(defn get-op-builder-list
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Builder>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverrides$Builder this]
    (-> this (.getOpBuilderList))))

