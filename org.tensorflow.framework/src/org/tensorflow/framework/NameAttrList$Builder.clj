(ns org.tensorflow.framework.NameAttrList$Builder
  " A list of attr names and their values. The whole list is attached
  with a string name.  E.g., MatMul[T=float].
 Protobuf type tensorflow.NameAttrList"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NameAttrList$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (NameAttrList$Builder/getDescriptor )))

(defn clear-name
  "string name = 1;

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this]
    (-> this (.clearName))))

(defn get-attr-count
  "Description copied from interface: NameAttrListOrBuilder

  returns: `int`"
  (^Integer [^NameAttrList$Builder this]
    (-> this (.getAttrCount))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList [^NameAttrList$Builder this]
    (-> this (.buildPartial))))

(defn put-attr
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`
  value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^java.lang.String key ^org.tensorflow.framework.AttrValue value]
    (-> this (.putAttr key value))))

(defn get-attr-or-default
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`
  default-value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^NameAttrList$Builder this ^java.lang.String key ^org.tensorflow.framework.AttrValue default-value]
    (-> this (.getAttrOrDefault key default-value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^NameAttrList$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList [^NameAttrList$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-attr-or-throw
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^NameAttrList$Builder this ^java.lang.String key]
    (-> this (.getAttrOrThrow key))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NameAttrList$Builder this]
    (-> this (.getNameBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn remove-attr
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^java.lang.String key]
    (-> this (.removeAttr key))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^NameAttrList$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-name-bytes
  "string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn put-all-attr
  "map<string, .tensorflow.AttrValue> attr = 2;

  values - `java.util.Map`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^java.util.Map values]
    (-> this (.putAllAttr values))))

(defn get-mutable-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NameAttrList$Builder this]
    (-> this (.getMutableAttr))))

(defn get-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NameAttrList$Builder this]
    (-> this (.getAttr))))

(defn clear-attr
  "returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this]
    (-> this (.clearAttr))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList [^NameAttrList$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NameAttrList$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn contains-attr
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^NameAttrList$Builder this ^java.lang.String key]
    (-> this (.containsAttr key))))

(defn get-attr-map
  "map<string, .tensorflow.AttrValue> attr = 2;

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NameAttrList$Builder this]
    (-> this (.getAttrMap))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^NameAttrList$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

