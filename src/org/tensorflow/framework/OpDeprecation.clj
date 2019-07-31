(ns org.tensorflow.framework.OpDeprecation
  " Information about version-dependent deprecation of an op
 Protobuf type tensorflow.OpDeprecation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpDeprecation]))

(def *-version-field-number
  "Static Constant.

  type: int"
  OpDeprecation/VERSION_FIELD_NUMBER)

(def *-explanation-field-number
  "Static Constant.

  type: int"
  OpDeprecation/EXPLANATION_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpDeprecation/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDeprecation`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.OpDeprecation [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpDeprecation/parseFrom data extension-registry))
  (^org.tensorflow.framework.OpDeprecation [^java.nio.ByteBuffer data]
    (OpDeprecation/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpDeprecation`

  throws: java.io.IOException"
  (^org.tensorflow.framework.OpDeprecation [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpDeprecation/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.OpDeprecation [^java.io.InputStream input]
    (OpDeprecation/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.OpDeprecation`

  returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^org.tensorflow.framework.OpDeprecation prototype]
    (OpDeprecation/newBuilder prototype))
  (^org.tensorflow.framework.OpDeprecation$Builder []
    (OpDeprecation/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.OpDeprecation`"
  (^org.tensorflow.framework.OpDeprecation []
    (OpDeprecation/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.OpDeprecation>`"
  (^com.github.os72.protobuf351.Parser []
    (OpDeprecation/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OpDeprecation this]
    (-> this (.getUnknownFields))))

(defn get-explanation
  "Explanation of why it was deprecated and what to use instead.
  string explanation = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpDeprecation this]
    (-> this (.getExplanation))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpDeprecation this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.OpDeprecation`"
  (^org.tensorflow.framework.OpDeprecation [^OpDeprecation this]
    (-> this (.getDefaultInstanceForType))))

(defn get-explanation-bytes
  "Explanation of why it was deprecated and what to use instead.
  string explanation = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpDeprecation this]
    (-> this (.getExplanationBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OpDeprecation this]
    (-> this (.getSerializedSize))))

(defn get-version
  "First GraphDef version at which the op is disallowed.
  int32 version = 1;

  returns: `int`"
  (^Integer [^OpDeprecation this]
    (-> this (.getVersion))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OpDeprecation this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OpDeprecation this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.OpDeprecation>`"
  (^com.github.os72.protobuf351.Parser [^OpDeprecation this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OpDeprecation this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.OpDeprecation$Builder`"
  (^org.tensorflow.framework.OpDeprecation$Builder [^OpDeprecation this]
    (-> this (.toBuilder))))

