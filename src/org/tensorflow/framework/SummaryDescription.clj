(ns org.tensorflow.framework.SummaryDescription
  " Metadata associated with a series of Summary data
 Protobuf type tensorflow.SummaryDescription"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework SummaryDescription]))

(def *-type-hint-field-number
  "Static Constant.

  type: int"
  SummaryDescription/TYPE_HINT_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (SummaryDescription/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SummaryDescription`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.SummaryDescription [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (SummaryDescription/parseFrom data extension-registry))
  (^org.tensorflow.framework.SummaryDescription [^java.nio.ByteBuffer data]
    (SummaryDescription/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.SummaryDescription`

  throws: java.io.IOException"
  (^org.tensorflow.framework.SummaryDescription [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (SummaryDescription/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.SummaryDescription [^java.io.InputStream input]
    (SummaryDescription/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.SummaryDescription`

  returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^org.tensorflow.framework.SummaryDescription prototype]
    (SummaryDescription/newBuilder prototype))
  (^org.tensorflow.framework.SummaryDescription$Builder []
    (SummaryDescription/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.SummaryDescription`"
  (^org.tensorflow.framework.SummaryDescription []
    (SummaryDescription/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.SummaryDescription>`"
  (^com.github.os72.protobuf351.Parser []
    (SummaryDescription/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^SummaryDescription this]
    (-> this (.getUnknownFields))))

(defn get-type-hint-bytes
  "Hint on how plugins should process the data in this series.
   Supported values include \"scalar\", \"histogram\", \"image\", \"audio\"
  string type_hint = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^SummaryDescription this]
    (-> this (.getTypeHintBytes))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^SummaryDescription this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.SummaryDescription`"
  (^org.tensorflow.framework.SummaryDescription [^SummaryDescription this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^SummaryDescription this]
    (-> this (.getSerializedSize))))

(defn get-type-hint
  "Hint on how plugins should process the data in this series.
   Supported values include \"scalar\", \"histogram\", \"image\", \"audio\"
  string type_hint = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^SummaryDescription this]
    (-> this (.getTypeHint))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^SummaryDescription this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SummaryDescription this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.SummaryDescription>`"
  (^com.github.os72.protobuf351.Parser [^SummaryDescription this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SummaryDescription this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.SummaryDescription$Builder`"
  (^org.tensorflow.framework.SummaryDescription$Builder [^SummaryDescription this]
    (-> this (.toBuilder))))

