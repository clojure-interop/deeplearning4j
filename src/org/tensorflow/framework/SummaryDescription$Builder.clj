(ns org.tensorflow.framework.SummaryDescription$Builder
  " Metadata associated with a series of Summary data
 Protobuf type tensorflow.SummaryDescription"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryDescription$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (SummaryDescription$Builder/getDescriptor )))

(defn get-type-hint-bytes
  "Hint on how plugins should process the data in this series.
   Supported values include \"scalar\", \"histogram\", \"image\", \"audio\"
  string type_hint = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryDescription$Builder this]
    (-> this (.getTypeHintBytes))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.SummaryDescription`"
  (^org.tensorflow.framework.SummaryDescription [^SummaryDescription$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^SummaryDescription$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.SummaryDescription`"
  (^org.tensorflow.framework.SummaryDescription [^SummaryDescription$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-type-hint-bytes
  "Hint on how plugins should process the data in this series.
   Supported values include \"scalar\", \"histogram\", \"image\", \"audio\"
  string type_hint = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setTypeHintBytes value))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn get-type-hint
  "Hint on how plugins should process the data in this series.
   Supported values include \"scalar\", \"histogram\", \"image\", \"audio\"
  string type_hint = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryDescription$Builder this]
    (-> this (.getTypeHint))))

(defn build
  "returns: `org.tensorflow.framework.SummaryDescription`"
  (^org.tensorflow.framework.SummaryDescription [^SummaryDescription$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^SummaryDescription$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear-type-hint
  "Hint on how plugins should process the data in this series.
   Supported values include \"scalar\", \"histogram\", \"image\", \"audio\"
  string type_hint = 1;

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this]
    (-> this (.clearTypeHint))))

(defn clear
  "returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn set-type-hint
  "Hint on how plugins should process the data in this series.
   Supported values include \"scalar\", \"histogram\", \"image\", \"audio\"
  string type_hint = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription$Builder this ^java.lang.String value]
    (-> this (.setTypeHint value))))

