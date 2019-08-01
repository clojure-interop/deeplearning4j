(ns tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder
  " Map the name of an attr to a new default value to use.  This
  default will be used when creating new graphs, as opposed to the
  default in the OpDef, which will be used when interpreting old
  GraphDefs.  If this attr is also renamed (using attr_rename
  below), use the original name of the attr.
 Protobuf type tensorflow.OpGenOverride.AttrDefault"
  (:refer-clojure :only [require comment defn ->])
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder/getDescriptor )))

(defn clear-name
  "string name = 1;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.clearName))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn has-value?
  ".tensorflow.AttrValue value = 2;

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.hasValue))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.getNameBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "string name = 1;

  value - `java.lang.String`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn clear-value
  ".tensorflow.AttrValue value = 2;

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.clearValue))))

(defn get-value
  ".tensorflow.AttrValue value = 2;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.getValue))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-name-bytes
  "string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.build))))

(defn get-value-builder
  ".tensorflow.AttrValue value = 2;

  returns: `org.tensorflow.framework.AttrValue$Builder`"
  (^org.tensorflow.framework.AttrValue$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.getValueBuilder))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`

  throws: java.io.IOException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-value
  ".tensorflow.AttrValue value = 2;

  value - `org.tensorflow.framework.AttrValue`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^org.tensorflow.framework.AttrValue value]
    (-> this (.setValue value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.clone))))

(defn get-value-or-builder
  ".tensorflow.AttrValue value = 2;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.getValueOrBuilder))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this]
    (-> this (.clear))))

(defn merge-value
  ".tensorflow.AttrValue value = 2;

  value - `org.tensorflow.framework.AttrValue`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^org.tensorflow.framework.AttrValue value]
    (-> this (.mergeValue value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

