(ns org.tensorflow.framework.Summary$Builder
  " A Summary is a set of named values to be displayed by the
  visualizer.
  Summaries are produced regularly during training, as controlled by
  the \"summary_interval_secs\" attribute of the training operation.
  Summaries are also produced at the end of an evaluation.
 Protobuf type tensorflow.Summary"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (Summary$Builder/getDescriptor )))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.Summary`"
  (^org.tensorflow.framework.Summary [^Summary$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^Summary$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.Summary`"
  (^org.tensorflow.framework.Summary [^Summary$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn remove-value
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^Integer index]
    (-> this (.removeValue index))))

(defn clear-value
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this]
    (-> this (.clearValue))))

(defn get-value
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`

  returns: `org.tensorflow.framework.Summary$Value`"
  (^org.tensorflow.framework.Summary$Value [^Summary$Builder this ^Integer index]
    (-> this (.getValue index))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.Summary`"
  (^org.tensorflow.framework.Summary [^Summary$Builder this]
    (-> this (.build))))

(defn get-value-builder
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Builder this ^Integer index]
    (-> this (.getValueBuilder index))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-value
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`
  value - `org.tensorflow.framework.Summary$Value`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^Integer index ^org.tensorflow.framework.Summary$Value value]
    (-> this (.setValue index value))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn add-value-builder
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`

  returns: `org.tensorflow.framework.Summary$Value$Builder`"
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Builder this ^Integer index]
    (-> this (.addValueBuilder index)))
  (^org.tensorflow.framework.Summary$Value$Builder [^Summary$Builder this]
    (-> this (.addValueBuilder))))

(defn clone
  "returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this]
    (-> this (.clone))))

(defn get-value-or-builder
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`

  returns: `org.tensorflow.framework.Summary$ValueOrBuilder`"
  (^org.tensorflow.framework.Summary$ValueOrBuilder [^Summary$Builder this ^Integer index]
    (-> this (.getValueOrBuilder index))))

(defn add-all-value
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  values - `java.lang.Iterable`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^java.lang.Iterable values]
    (-> this (.addAllValue values))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^Summary$Builder this]
    (-> this (.getDescriptorForType))))

(defn get-value-list
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `java.util.List<org.tensorflow.framework.Summary$Value>`"
  (^java.util.List [^Summary$Builder this]
    (-> this (.getValueList))))

(defn clear
  "returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this]
    (-> this (.clear))))

(defn add-value
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`
  value - `org.tensorflow.framework.Summary$Value`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^Integer index ^org.tensorflow.framework.Summary$Value value]
    (-> this (.addValue index value)))
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^org.tensorflow.framework.Summary$Value value]
    (-> this (.addValue value))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn get-value-or-builder-list
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.Summary$ValueOrBuilder>`"
  ([^Summary$Builder this]
    (-> this (.getValueOrBuilderList))))

(defn get-value-builder-list
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `java.util.List<org.tensorflow.framework.Summary$Value$Builder>`"
  (^java.util.List [^Summary$Builder this]
    (-> this (.getValueBuilderList))))

(defn get-value-count
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `int`"
  (^Integer [^Summary$Builder this]
    (-> this (.getValueCount))))

