(ns org.tensorflow.framework.ApiDefs
  "Protobuf type tensorflow.ApiDefs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDefs]))

(def *-op-field-number
  "Static Constant.

  type: int"
  ApiDefs/OP_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ApiDefs/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDefs`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.ApiDefs [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ApiDefs/parseFrom data extension-registry))
  (^org.tensorflow.framework.ApiDefs [^java.nio.ByteBuffer data]
    (ApiDefs/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDefs`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ApiDefs [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ApiDefs/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.ApiDefs [^java.io.InputStream input]
    (ApiDefs/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.ApiDefs`

  returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^org.tensorflow.framework.ApiDefs prototype]
    (ApiDefs/newBuilder prototype))
  (^org.tensorflow.framework.ApiDefs$Builder []
    (ApiDefs/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.ApiDefs`"
  (^org.tensorflow.framework.ApiDefs []
    (ApiDefs/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ApiDefs>`"
  (^com.github.os72.protobuf351.Parser []
    (ApiDefs/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^ApiDefs this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ApiDefs this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ApiDefs`"
  (^org.tensorflow.framework.ApiDefs [^ApiDefs this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^ApiDefs this]
    (-> this (.getSerializedSize))))

(defn get-op-list
  "repeated .tensorflow.ApiDef op = 1;

  returns: `java.util.List<org.tensorflow.framework.ApiDef>`"
  (^java.util.List [^ApiDefs this]
    (-> this (.getOpList))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^ApiDefs this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-op-count
  "repeated .tensorflow.ApiDef op = 1;

  returns: `int`"
  (^Integer [^ApiDefs this]
    (-> this (.getOpCount))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ApiDefs this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ApiDefs>`"
  (^com.github.os72.protobuf351.Parser [^ApiDefs this]
    (-> this (.getParserForType))))

(defn get-op
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.ApiDef`"
  (^org.tensorflow.framework.ApiDef [^ApiDefs this ^Integer index]
    (-> this (.getOp index))))

(defn get-op-or-builder-list
  "repeated .tensorflow.ApiDef op = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.ApiDefOrBuilder>`"
  ([^ApiDefs this]
    (-> this (.getOpOrBuilderList))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ApiDefs this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs this]
    (-> this (.newBuilderForType))))

(defn get-op-or-builder
  "repeated .tensorflow.ApiDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.ApiDefOrBuilder`"
  (^org.tensorflow.framework.ApiDefOrBuilder [^ApiDefs this ^Integer index]
    (-> this (.getOpOrBuilder index))))

(defn to-builder
  "returns: `org.tensorflow.framework.ApiDefs$Builder`"
  (^org.tensorflow.framework.ApiDefs$Builder [^ApiDefs this]
    (-> this (.toBuilder))))

