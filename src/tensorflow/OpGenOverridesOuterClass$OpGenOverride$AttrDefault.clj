(ns tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault
  " Map the name of an attr to a new default value to use.  This
  default will be used when creating new graphs, as opposed to the
  default in the OpDef, which will be used when interpreting old
  GraphDefs.  If this attr is also renamed (using attr_rename
  below), use the original name of the attr.
 Protobuf type tensorflow.OpGenOverride.AttrDefault"
  (:refer-clojure :only [require comment defn ->])
  (:import [tensorflow OpGenOverridesOuterClass$OpGenOverride$AttrDefault]))

(def *-name-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride$AttrDefault/NAME_FIELD_NUMBER)

(def *-value-field-number
  "Static Constant.

  type: int"
  OpGenOverridesOuterClass$OpGenOverride$AttrDefault/VALUE_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpGenOverridesOuterClass$OpGenOverride$AttrDefault/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpGenOverridesOuterClass$OpGenOverride$AttrDefault/parseFrom data extension-registry))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^java.nio.ByteBuffer data]
    (OpGenOverridesOuterClass$OpGenOverride$AttrDefault/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`

  throws: java.io.IOException"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpGenOverridesOuterClass$OpGenOverride$AttrDefault/parseDelimitedFrom input extension-registry))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^java.io.InputStream input]
    (OpGenOverridesOuterClass$OpGenOverride$AttrDefault/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`

  returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault prototype]
    (OpGenOverridesOuterClass$OpGenOverride$AttrDefault/newBuilder prototype))
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder []
    (OpGenOverridesOuterClass$OpGenOverride$AttrDefault/newBuilder )))

(defn *get-default-instance
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault []
    (OpGenOverridesOuterClass$OpGenOverride$AttrDefault/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault>`"
  (^com.github.os72.protobuf351.Parser []
    (OpGenOverridesOuterClass$OpGenOverride$AttrDefault/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.getDefaultInstanceForType))))

(defn has-value?
  ".tensorflow.AttrValue value = 2;

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.hasValue))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.getSerializedSize))))

(defn get-value
  ".tensorflow.AttrValue value = 2;

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.getValue))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-value-or-builder
  ".tensorflow.AttrValue value = 2;

  returns: `org.tensorflow.framework.AttrValueOrBuilder`"
  (^org.tensorflow.framework.AttrValueOrBuilder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.getValueOrBuilder))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault>`"
  (^com.github.os72.protobuf351.Parser [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder`"
  (^tensorflow.OpGenOverridesOuterClass$OpGenOverride$AttrDefault$Builder [^OpGenOverridesOuterClass$OpGenOverride$AttrDefault this]
    (-> this (.toBuilder))))

