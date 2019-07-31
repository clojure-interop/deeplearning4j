(ns org.tensorflow.framework.OpList
  " A collection of OpDefs
 Protobuf type tensorflow.OpList"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework OpList]))

(def *-op-field-number
  "Static Constant.

  type: int"
  OpList/OP_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (OpList/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpList`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.OpList [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpList/parseFrom data extension-registry))
  (^org.tensorflow.framework.OpList [^java.nio.ByteBuffer data]
    (OpList/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.OpList`

  throws: java.io.IOException"
  (^org.tensorflow.framework.OpList [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (OpList/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.OpList [^java.io.InputStream input]
    (OpList/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.OpList`

  returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^org.tensorflow.framework.OpList prototype]
    (OpList/newBuilder prototype))
  (^org.tensorflow.framework.OpList$Builder []
    (OpList/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.OpList`"
  (^org.tensorflow.framework.OpList []
    (OpList/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.OpList>`"
  (^com.github.os72.protobuf351.Parser []
    (OpList/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^OpList this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^OpList this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.OpList`"
  (^org.tensorflow.framework.OpList [^OpList this]
    (-> this (.getDefaultInstanceForType))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^OpList this]
    (-> this (.getSerializedSize))))

(defn get-op-list
  "repeated .tensorflow.OpDef op = 1;

  returns: `java.util.List<org.tensorflow.framework.OpDef>`"
  (^java.util.List [^OpList this]
    (-> this (.getOpList))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^OpList this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-op-count
  "repeated .tensorflow.OpDef op = 1;

  returns: `int`"
  (^Integer [^OpList this]
    (-> this (.getOpCount))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OpList this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.OpList>`"
  (^com.github.os72.protobuf351.Parser [^OpList this]
    (-> this (.getParserForType))))

(defn get-op
  "repeated .tensorflow.OpDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.OpDef`"
  (^org.tensorflow.framework.OpDef [^OpList this ^Integer index]
    (-> this (.getOp index))))

(defn get-op-or-builder-list
  "repeated .tensorflow.OpDef op = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.OpDefOrBuilder>`"
  ([^OpList this]
    (-> this (.getOpOrBuilderList))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OpList this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList this]
    (-> this (.newBuilderForType))))

(defn get-op-or-builder
  "repeated .tensorflow.OpDef op = 1;

  index - `int`

  returns: `org.tensorflow.framework.OpDefOrBuilder`"
  (^org.tensorflow.framework.OpDefOrBuilder [^OpList this ^Integer index]
    (-> this (.getOpOrBuilder index))))

(defn to-builder
  "returns: `org.tensorflow.framework.OpList$Builder`"
  (^org.tensorflow.framework.OpList$Builder [^OpList this]
    (-> this (.toBuilder))))

