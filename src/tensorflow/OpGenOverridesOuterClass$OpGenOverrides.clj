(ns tensorflow.OpGenOverridesOuterClass$OpGenOverrides
  "Protobuf type tensorflow.OpGenOverrides"
  (:refer-clojure :only [require comment defn ->])
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverrides]))

(def *-op-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverrides/OP_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpGenOverridesOuterClass$OpGenOverrides/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpGenOverridesOuterClass$OpGenOverrides/parseFrom data extension-registry))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides [^java.nio.ByteBuffer data]
    (OpGenOverridesOuterClass$OpGenOverrides/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides`

  throws: java.io.IOException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpGenOverridesOuterClass$OpGenOverrides/parseDelimitedFrom input extension-registry))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides [^java.io.InputStream input]
    (OpGenOverridesOuterClass$OpGenOverrides/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `tensorflow.OpGenOverridesOuterClass$OpGenOverrides`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^tensorflow.OpGenOverridesOuterClass$OpGenOverrides prototype]
    (OpGenOverridesOuterClass$OpGenOverrides/newBuilder prototype))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder []
    (OpGenOverridesOuterClass$OpGenOverrides/newBuilder )))

(defn *get-default-instance
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides []
    (OpGenOverridesOuterClass$OpGenOverrides/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<tensorflow.OpGenOverridesOuterClass$OpGenOverrides>`"
  (^com.github.os72.protobuf351.Parser []
    (OpGenOverridesOuterClass$OpGenOverrides/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides [^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.getSerializedSize))))

(defn get-op-list
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `java.util.List<tensorflow.OpGenOverridesOuterClass$OpGenOverride>`"
  (^java.util.List [^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.getOpList))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OpGenOverridesOuterClass$OpGenOverrides this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-op-count
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.getOpCount))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<tensorflow.OpGenOverridesOuterClass$OpGenOverrides>`"
  (^com.github.os72.protobuf351.Parser [^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.getParserForType))))

(defn get-op
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride [^OpGenOverridesOuterClass$OpGenOverrides this ^Integer index]
    (-> this (.getOp index))))

(defn get-op-or-builder-list
  "repeated .tensorflow.OpGenOverride op = 1;

  returns: `java.util.List<? extends tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder>`"
  ([^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.getOpOrBuilderList))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverrides this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.newBuilderForType))))

(defn get-op-or-builder
  "repeated .tensorflow.OpGenOverride op = 1;

  index - `int`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrideOrBuilder [^OpGenOverridesOuterClass$OpGenOverrides this ^Integer index]
    (-> this (.getOpOrBuilder index))))

(defn to-builder
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverrides$Builder [^OpGenOverridesOuterClass$OpGenOverrides this]
    (-> this (.toBuilder))))

