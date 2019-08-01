(ns org.tensorflow.framework.ApiDef$Endpoint$Builder
  " If you specify any endpoint, this will replace all of the
  inherited endpoints.  The first endpoint should be the
  \"canonical\" endpoint, and should not be deprecated (unless all
  endpoints are deprecated).
 Protobuf type tensorflow.ApiDef.Endpoint"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDef$Endpoint$Builder]))

(defn *get-descriptor
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor []
    (ApiDef$Endpoint$Builder/getDescriptor )))

(defn clear-name
  "Name should be either like \"CamelCaseName\" or
   \"Package.CamelCaseName\". Client-language-specific ApiDefs may
   use a snake_case convention instead of CamelCase.
  string name = 1;

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this]
    (-> this (.clearName))))

(defn set-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  index - `int`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^Integer index ^java.lang.Object value]
    (-> this (.setRepeatedField field index value))))

(defn build-partial
  "returns: `org.tensorflow.framework.ApiDef$Endpoint`"
  (^org.tensorflow.framework.ApiDef$Endpoint [^ApiDef$Endpoint$Builder this]
    (-> this (.buildPartial))))

(defn initialized?
  "returns: `boolean`"
  (^Boolean [^ApiDef$Endpoint$Builder this]
    (-> this (.isInitialized))))

(defn get-default-instance-for-type
  "returns: `org.tensorflow.framework.ApiDef$Endpoint`"
  (^org.tensorflow.framework.ApiDef$Endpoint [^ApiDef$Endpoint$Builder this]
    (-> this (.getDefaultInstanceForType))))

(defn merge-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.mergeUnknownFields unknown-fields))))

(defn get-name-bytes
  "Name should be either like \"CamelCaseName\" or
   \"Package.CamelCaseName\". Client-language-specific ApiDefs may
   use a snake_case convention instead of CamelCase.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$Endpoint$Builder this]
    (-> this (.getNameBytes))))

(defn clear-oneof
  "oneof - `com.github.os72.protobuf351.Descriptors.OneofDescriptor`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^com.github.os72.protobuf351.Descriptors.OneofDescriptor oneof]
    (-> this (.clearOneof oneof))))

(defn set-name
  "Name should be either like \"CamelCaseName\" or
   \"Package.CamelCaseName\". Client-language-specific ApiDefs may
   use a snake_case convention instead of CamelCase.
  string name = 1;

  value - `java.lang.String`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^java.lang.String value]
    (-> this (.setName value))))

(defn get-name
  "Name should be either like \"CamelCaseName\" or
   \"Package.CamelCaseName\". Client-language-specific ApiDefs may
   use a snake_case convention instead of CamelCase.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$Endpoint$Builder this]
    (-> this (.getName))))

(defn set-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.setField field value))))

(defn set-name-bytes
  "Name should be either like \"CamelCaseName\" or
   \"Package.CamelCaseName\". Client-language-specific ApiDefs may
   use a snake_case convention instead of CamelCase.
  string name = 1;

  value - `com.github.os72.protobuf351.ByteString`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^com.github.os72.protobuf351.ByteString value]
    (-> this (.setNameBytes value))))

(defn add-repeated-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`
  value - `java.lang.Object`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field ^java.lang.Object value]
    (-> this (.addRepeatedField field value))))

(defn build
  "returns: `org.tensorflow.framework.ApiDef$Endpoint`"
  (^org.tensorflow.framework.ApiDef$Endpoint [^ApiDef$Endpoint$Builder this]
    (-> this (.build))))

(defn merge-from
  "input - `com.github.os72.protobuf351.CodedInputStream`
  extension-registry - `com.github.os72.protobuf351.ExtensionRegistryLite`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`

  throws: java.io.IOException"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^com.github.os72.protobuf351.CodedInputStream input ^com.github.os72.protobuf351.ExtensionRegistryLite extension-registry]
    (-> this (.mergeFrom input extension-registry)))
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^com.github.os72.protobuf351.Message other]
    (-> this (.mergeFrom other))))

(defn set-deprecation-version
  "First GraphDef version at which the op is disallowed.
  int32 deprecation_version = 2;

  value - `int`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^Integer value]
    (-> this (.setDeprecationVersion value))))

(defn get-deprecation-version
  "First GraphDef version at which the op is disallowed.
  int32 deprecation_version = 2;

  returns: `int`"
  (^Integer [^ApiDef$Endpoint$Builder this]
    (-> this (.getDeprecationVersion))))

(defn clear-field
  "field - `com.github.os72.protobuf351.Descriptors.FieldDescriptor`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^com.github.os72.protobuf351.Descriptors.FieldDescriptor field]
    (-> this (.clearField field))))

(defn clone
  "returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this]
    (-> this (.clone))))

(defn get-descriptor-for-type
  "returns: `com.github.os72.protobuf351.Descriptors.Descriptor`"
  (^com.github.os72.protobuf351.Descriptors.Descriptor [^ApiDef$Endpoint$Builder this]
    (-> this (.getDescriptorForType))))

(defn clear
  "returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this]
    (-> this (.clear))))

(defn set-unknown-fields
  "unknown-fields - `com.github.os72.protobuf351.UnknownFieldSet`

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this ^com.github.os72.protobuf351.UnknownFieldSet unknown-fields]
    (-> this (.setUnknownFields unknown-fields))))

(defn clear-deprecation-version
  "First GraphDef version at which the op is disallowed.
  int32 deprecation_version = 2;

  returns: `org.tensorflow.framework.ApiDef$Endpoint$Builder`"
  (^org.tensorflow.framework.ApiDef$Endpoint$Builder [^ApiDef$Endpoint$Builder this]
    (-> this (.clearDeprecationVersion))))

