(ns org.tensorflow.framework.ApiDef$Arg
  "Protobuf type tensorflow.ApiDef.Arg"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDef$Arg]))

(def *-name-field-number
  "Static Constant.

  type: int"
  ApiDef$Arg/NAME_FIELD_NUMBER)

(def *-rename-to-field-number
  "Static Constant.

  type: int"
  ApiDef$Arg/RENAME_TO_FIELD_NUMBER)

(def *-description-field-number
  "Static Constant.

  type: int"
  ApiDef$Arg/DESCRIPTION_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ApiDef$Arg/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef$Arg`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.ApiDef$Arg [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ApiDef$Arg/parseFrom data extension-registry))
  (^org.tensorflow.framework.ApiDef$Arg [^java.nio.ByteBuffer data]
    (ApiDef$Arg/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef$Arg`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ApiDef$Arg [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ApiDef$Arg/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.ApiDef$Arg [^java.io.InputStream input]
    (ApiDef$Arg/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.ApiDef$Arg`

  returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^org.tensorflow.framework.ApiDef$Arg prototype]
    (ApiDef$Arg/newBuilder prototype))
  (^org.tensorflow.framework.ApiDef$Arg$Builder []
    (ApiDef$Arg/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg []
    (ApiDef$Arg/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ApiDef$Arg>`"
  (^com.github.os72.protobuf351.Parser []
    (ApiDef$Arg/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^ApiDef$Arg this]
    (-> this (.getUnknownFields))))

(defn get-description-bytes
  "Note: this will replace any inherited arg doc. There is no
   current way of modifying arg descriptions (other than replacing
   them entirely) as can be done with op descriptions.
  string description = 3;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Arg this]
    (-> this (.getDescriptionBytes))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ApiDef$Arg this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ApiDef$Arg`"
  (^org.tensorflow.framework.ApiDef$Arg [^ApiDef$Arg this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Arg this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^ApiDef$Arg this]
    (-> this (.getSerializedSize))))

(defn get-rename-to-bytes
  "Change the name used to access this arg in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Arg this]
    (-> this (.getRenameToBytes))))

(defn get-name
  "string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Arg this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^ApiDef$Arg this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-description
  "Note: this will replace any inherited arg doc. There is no
   current way of modifying arg descriptions (other than replacing
   them entirely) as can be done with op descriptions.
  string description = 3;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Arg this]
    (-> this (.getDescription))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ApiDef$Arg this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ApiDef$Arg>`"
  (^com.github.os72.protobuf351.Parser [^ApiDef$Arg this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ApiDef$Arg this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.ApiDef$Arg$Builder`"
  (^org.tensorflow.framework.ApiDef$Arg$Builder [^ApiDef$Arg this]
    (-> this (.toBuilder))))

(defn get-rename-to
  "Change the name used to access this arg in the API from what
   is used in the GraphDef.  Note that these names in `backticks`
   will also be replaced in the summary & description fields.
  string rename_to = 2;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Arg this]
    (-> this (.getRenameTo))))

