(ns org.tensorflow.framework.ApiDef$Endpoint
  " If you specify any endpoint, this will replace all of the
  inherited endpoints.  The first endpoint should be the
  \"canonical\" endpoint, and should not be deprecated (unless all
  endpoints are deprecated).
 Protobuf type tensorflow.ApiDef.Endpoint"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDef$Endpoint]))

(def *-name-field-number
  "Static Constant.

  type: int"
  ApiDef$Endpoint/NAME_FIELD_NUMBER)

(def *-deprecation-version-field-number
  "Static Constant.

  type: int"
  ApiDef$Endpoint/DEPRECATION_VERSION_FIELD_NUMBER)

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ApiDef$Endpoint/getDescriptor )))

(defn *parse-from
  "data - `java.nio.ByteBuffer`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef$Endpoint`

  throws: com.github.os72.protobuf351.InvalidProtocolBufferException"
  (^org.tensorflow.framework.ApiDef$Endpoint [^java.nio.ByteBuffer data ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ApiDef$Endpoint/parseFrom data extension-registry))
  (^org.tensorflow.framework.ApiDef$Endpoint [^java.nio.ByteBuffer data]
    (ApiDef$Endpoint/parseFrom data)))

(defn *parse-delimited-from
  "input - `java.io.InputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef$Endpoint`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ApiDef$Endpoint [^java.io.InputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (ApiDef$Endpoint/parseDelimitedFrom input extension-registry))
  (^org.tensorflow.framework.ApiDef$Endpoint [^java.io.InputStream input]
    (ApiDef$Endpoint/parseDelimitedFrom input)))

(defn *new-builder
  "prototype - `org.tensorflow.framework.ApiDef$Endpoint`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^org.tensorflow.framework.ApiDef$Endpoint prototype]
    (ApiDef$Endpoint/newBuilder prototype))
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder []
    (ApiDef$Endpoint/newBuilder )))

(defn *get-default-instance
  "returns: `org.tensorflow.framework.ApiDef$Endpoint`"
  (^org.tensorflow.framework.ApiDef$Endpoint []
    (ApiDef$Endpoint/getDefaultInstance )))

(defn *parser
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ApiDef$Endpoint>`"
  (^com.github.os72.protobuf351.Parser []
    (ApiDef$Endpoint/parser )))

(defn get-unknown-fields
  "returns: `com.github.os72.protobuf351.UnknownFieldSet`"
  (^com.github.os72.protobuf351.UnknownFieldSet [^ApiDef$Endpoint this]
    (-> this (.getUnknownFields))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ApiDef$Endpoint this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ApiDef$Endpoint`"
  (^org.tensorflow.framework.ApiDef$Endpoint [^ApiDef$Endpoint this]
    (-> this (.getDefaultInstanceForType))))

(defn get-name-bytes
  "Name should be either like \"CamelCaseName\" or
   \"Package.CamelCaseName\". Client-language-specific ApiDefs may
   use a snake_case convention instead of CamelCase.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Endpoint this]
    (-> this (.getNameBytes))))

(defn get-serialized-size
  "returns: `int`"
  (^Integer [^ApiDef$Endpoint this]
    (-> this (.getSerializedSize))))

(defn get-name
  "Name should be either like \"CamelCaseName\" or
   \"Package.CamelCaseName\". Client-language-specific ApiDefs may
   use a snake_case convention instead of CamelCase.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Endpoint this]
    (-> this (.getName))))

(defn write-to
  "output - `com.github.os72.protobuf351.CodedOutputStream`

  throws: java.io.IOException"
  ([^ApiDef$Endpoint this ^com.github.os72.protobuf351.CodedOutputStream output]
    (-> this (.writeTo output))))

(defn get-deprecation-version
  "First GraphDef version at which the op is disallowed.
  int32 deprecation_version = 2;

  returns: `int`"
  (^Integer [^ApiDef$Endpoint this]
    (-> this (.getDeprecationVersion))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ApiDef$Endpoint this]
    (-> this (.hashCode))))

(defn get-parser-for-type
  "returns: `com.github.os72.protobuf351.Parser<org.tensorflow.framework.ApiDef$Endpoint>`"
  (^com.github.os72.protobuf351.Parser [^ApiDef$Endpoint this]
    (-> this (.getParserForType))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ApiDef$Endpoint this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn new-builder-for-type
  "returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint this]
    (-> this (.newBuilderForType))))

(defn to-builder
  "returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint this]
    (-> this (.toBuilder))))

