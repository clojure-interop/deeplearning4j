(ns org.tensorflow.framework.Summary
  " A Summary is a set of named values to be displayed by the
  visualizer.
  Summaries are produced regularly during training, as controlled by
  the \"summary_interval_secs\" attribute of the training operation.
  Summaries are also produced at the end of an evaluation.
 Protobuf type tensorflow.Summary"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework Summary]))

(def *-value-field-number
  "Static Constant.

  type: int"
  Summary/VALUE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (Summary/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.Summary [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (Summary/parseFrom data extension-registry))
  (^org.tensorflow.framework.Summary [^java.nio.ByteBuffer data]
    (Summary/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.Summary`

  throws: java.io.IOException"
  (^org.tensorflow.framework.Summary [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (Summary/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.Summary [^java.io.InputStream input]
    (Summary/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.Summary`

  returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^org.tensorflow.framework.Summary prototype]
    (Summary/newBuilder prototype))
  (^org.tensorflow.framework.Summary$Builder []
    (Summary/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.Summary`"
  (^org.tensorflow.framework.Summary []
    (Summary/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.Summary>`"
  (^com.github.os72.protobuf351.Parser []
    (Summary/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^Summary this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^Summary this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.Summary`"
  (^org.tensorflow.framework.Summary [^Summary this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^Summary this]
    (-> this (.getSerializedSize))))

(defn get-value
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`

  returns: `org.tensorflow.framework.Summary$Value`"
  (^org.tensorflow.framework.Summary$Value [^Summary this ^Integer index]
    (-> this (.getValue index))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^Summary this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-value-or-builder
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  index - `int`

  returns: `org.tensorflow.framework.Summary$ValueOrBuilder`"
  (^org.tensorflow.framework.Summary$ValueOrBuilder [^Summary this ^Integer index]
    (-> this (.getValueOrBuilder index))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Summary this]
    (-> this (.hashCode))))

(defn get-value-list
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `java.util.List<org.tensorflow.framework.Summary$Value>`"
  (^java.util.List [^Summary this]
    (-> this (.getValueList))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.Summary>`"
  (^com.github.os72.protobuf351.Parser [^Summary this]
    (-> this (.getParserForType))))

(defn get-value-or-builder-list
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.Summary$ValueOrBuilder>`"
  ([^Summary this]
    (-> this (.getValueOrBuilderList))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Summary this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.Summary$Builder`"
  (^org.tensorflow.framework.Summary$Builder [^Summary this]
    (-> this (.toBuilder))))

(defn get-value-count
  "Set of values for the summary.
  repeated .tensorflow.Summary.Value value = 1;

  returns: `int`"
  (^Integer [^Summary this]
    (-> this (.getValueCount))))

