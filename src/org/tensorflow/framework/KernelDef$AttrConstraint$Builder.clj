(ns org.tensorflow.framework.KernelDef$AttrConstraint$Builder
  "Protobuf type tensorflow.KernelDef.AttrConstraint"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework KernelDef$AttrConstraint$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (KernelDef$AttrConstraint$Builder/getDescriptor )))

(defn clear-name
  "Name of an attr from the Op.
  string name = 1;

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this]
    (-> this (.clearName))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn get-allowed-values
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^KernelDef$AttrConstraint$Builder this]
    (-> this (.getAllowedValues))))

(defn build-partial
  "returns: `org.tensorflow.framework.KernelDef$AttrConstraint`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^KernelDef$AttrConstraint$Builder this]
    (-> this (.buildPartial))))

(defn get-allowed-values-or-builder
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^KernelDef$AttrConstraint$Builder this]
    (-> this (.getAllowedValuesOrBuilder))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^KernelDef$AttrConstraint$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.KernelDef$AttrConstraint`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^KernelDef$AttrConstraint$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-name-bytes
  "Name of an attr from the Op.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^KernelDef$AttrConstraint$Builder this]
    (-> this (.getNameBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "Name of an attr from the Op.
  string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn merge-allowed-values
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^org.tensorflow.framework.AttrValue value]
    (-> this (.mergeAllowedValues value))))

(defn get-name
  "Name of an attr from the Op.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^KernelDef$AttrConstraint$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-name-bytes
  "Name of an attr from the Op.
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.KernelDef$AttrConstraint`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint [^KernelDef$AttrConstraint$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn get-allowed-values-builder
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^KernelDef$AttrConstraint$Builder this]
    (-> this (.getAllowedValuesBuilder))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this]
    (-> this (.clone))))

(defn has-allowed-values?
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `boolean`"
  (^Boolean [^KernelDef$AttrConstraint$Builder this]
    (-> this (.hasAllowedValues))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^KernelDef$AttrConstraint$Builder this]
    (-> this (.getDescriptorForType))))

(defn set-allowed-values
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^org.tensorflow.framework.AttrValue value]
    (-> this (.setAllowedValues value))))

(defn clear
  "returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-allowed-values
  "A list of values that this kernel supports for this attr.
   Like OpDef.AttrDef.allowed_values, except for kernels instead of Ops.
  .tensorflow.AttrValue allowed_values = 2;

  returns: `org.tensorflow.framework.KernelDef$AttrConstraint$Builder`"
  (^org.tensorflow.framework.KernelDef$AttrConstraint$Builder [^KernelDef$AttrConstraint$Builder this]
    (-> this (.clearAllowedValues))))

