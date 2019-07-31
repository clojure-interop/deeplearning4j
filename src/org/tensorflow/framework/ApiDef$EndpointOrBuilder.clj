(ns org.tensorflow.framework.ApiDef$EndpointOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework ApiDef$EndpointOrBuilder]))

(defn get-name
  "Name should be either like \"CamelCaseName\" or
   \"Package.CamelCaseName\". Client-language-specific ApiDefs may
   use a snake_case convention instead of CamelCase.
  string name = 1;

  returns: `java.lang.String`"
  (^java.lang.String [^ApiDef$EndpointOrBuilder this]
    (-> this (.getName))))

(defn get-name-bytes
  "Name should be either like \"CamelCaseName\" or
   \"Package.CamelCaseName\". Client-language-specific ApiDefs may
   use a snake_case convention instead of CamelCase.
  string name = 1;

  returns: `com.github.os72.protobuf351.ByteString`"
  (^com.github.os72.protobuf351.ByteString [^ApiDef$EndpointOrBuilder this]
    (-> this (.getNameBytes))))

(defn get-deprecation-version
  "First GraphDef version at which the op is disallowed.
  int32 deprecation_version = 2;

  returns: `int`"
  (^Integer [^ApiDef$EndpointOrBuilder this]
    (-> this (.getDeprecationVersion))))

