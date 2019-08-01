(ns tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename
  " Change the name used to access attrs/inputs/outputs in the API
  from what is used in the GraphDef.  Note that these names in
  `backticks` will also be replaced in the docs.
 Protobuf type tensorflow.OpGenOverride.Rename"
  (:refer-clojure :only [require comment defn ->])
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverride$Rename]))

(def *-from-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride$Rename/FROM_FIELD_NUMBER)

(def *-to-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride$Rename/TO_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpGenOverridesOuterClass$OpGenOverride$Rename/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpGenOverridesOuterClass$OpGenOverride$Rename/parseFrom data extension-registry))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^java.nio.ByteBuffer data]
    (OpGenOverridesOuterClass$OpGenOverride$Rename/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`

  throws: java.io.IOException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpGenOverridesOuterClass$OpGenOverride$Rename/parseDelimitedFrom input extension-registry))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^java.io.InputStream input]
    (OpGenOverridesOuterClass$OpGenOverride$Rename/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename prototype]
    (OpGenOverridesOuterClass$OpGenOverride$Rename/newBuilder prototype))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder []
    (OpGenOverridesOuterClass$OpGenOverride$Rename/newBuilder )))

(defn *get-default-instance
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename []
    (OpGenOverridesOuterClass$OpGenOverride$Rename/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^com.github.os72.protobuf351.Parser []
    (OpGenOverridesOuterClass$OpGenOverride$Rename/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.getUnknownFields))))

(defn get-from-bytes
  "string from = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.getFromBytes))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.getDefaultInstanceForType))))

(defn get-to-bytes
  "string to = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.getToBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.getSerializedSize))))

(defn get-to
  "string to = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.getTo))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OpGenOverridesOuterClass$OpGenOverride$Rename this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.hashCode))))

(defn get-from
  "string from = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.getFrom))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename>`"
  (^com.github.os72.protobuf351.Parser [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$Rename this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$Rename$Builder [^OpGenOverridesOuterClass$OpGenOverride$Rename this]
    (-> this (.toBuilder))))

