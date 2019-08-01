(ns org.tensorflow.framework.NameAttrList
  " A list of attr names and their values. The whole list is attached
  with a string name.  E.g., MatMul[T=float].
 Protobuf type tensorflow.NameAttrList"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework NameAttrList]))

(def *-name-field-number
  "Static Constant.

  type: int"
  NameAttrList/NAME_FIELD_NUMBER)

(def *-attr-field-number
  "Static Constant.

  type: int"
  NameAttrList/ATTR_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (NameAttrList/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NameAttrList`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.NameAttrList [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (NameAttrList/parseFrom data extension-registry))
  (^org.tensorflow.framework.NameAttrList [^java.nio.ByteBuffer data]
    (NameAttrList/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.NameAttrList`

  throws: java.io.IOException"
  (^org.tensorflow.framework.NameAttrList [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (NameAttrList/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.NameAttrList [^java.io.InputStream input]
    (NameAttrList/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.NameAttrList`

  returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^org.tensorflow.framework.NameAttrList prototype]
    (NameAttrList/newBuilder prototype))
  (^org.tensorflow.framework.NameAttrList$Builder []
    (NameAttrList/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList []
    (NameAttrList/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.NameAttrList>`"
  (^com.github.os72.protobuf351.Parser []
    (NameAttrList/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^NameAttrList this]
    (-> this (.getUnknownFields))))

(defn get-attr-count
  "Description copied from interface: NameAttrListOrBuilder

  returns: `int`"
  (^Integer [^NameAttrList this]
    (-> this (.getAttrCount))))

(defn get-attr-or-default
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`
  default-value - `org.tensorflow.framework.AttrValue`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^NameAttrList this ^java.lang.String key ^org.tensorflow.framework.AttrValue default-value]
    (-> this (.getAttrOrDefault key default-value))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^NameAttrList this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.NameAttrList`"
  (^org.tensorflow.framework.NameAttrList [^NameAttrList this]
    (-> this (.getDefaultInstanceForType))))

(defn get-attr-or-throw
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`

  returns: `org.tensorflow.framework.AttrValue`"
  (^org.tensorflow.framework.AttrValue [^NameAttrList this ^java.lang.String key]
    (-> this (.getAttrOrThrow key))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^NameAttrList this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^NameAttrList this]
    (-> this (.getSerializedSize))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^NameAttrList this]
    (-> this (.getName))))

(defn get-attr
  "Deprecated.

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NameAttrList this]
    (-> this (.getAttr))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^NameAttrList this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn contains-attr
  "map<string, .tensorflow.AttrValue> attr = 2;

  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^NameAttrList this ^java.lang.String key]
    (-> this (.containsAttr key))))

(defn get-attr-map
  "map<string, .tensorflow.AttrValue> attr = 2;

  returns: `java.util.Map<java.lang.String,org.tensorflow.framework.AttrValue>`"
  (^java.util.Map [^NameAttrList this]
    (-> this (.getAttrMap))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NameAttrList this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.NameAttrList>`"
  (^com.github.os72.protobuf351.Parser [^NameAttrList this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NameAttrList this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.NameAttrList$Builder`"
  (^org.tensorflow.framework.NameAttrList$Builder [^NameAttrList this]
    (-> this (.toBuilder))))

