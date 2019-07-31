(ns org.nd4j.serde.json.LegacyIActivationDeserializer
  "Deserializer for IActivation JSON in legacy format - see BaseLegacyDeserializer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.serde.json LegacyIActivationDeserializer]))

(defn ->legacy-i-activation-deserializer
  "Constructor."
  (^LegacyIActivationDeserializer []
    (new LegacyIActivationDeserializer )))

(defn *set-legacy-json-mapper
  "mapper - `org.nd4j.shade.jackson.databind.ObjectMapper`"
  ([^org.nd4j.shade.jackson.databind.ObjectMapper mapper]
    (LegacyIActivationDeserializer/setLegacyJsonMapper mapper)))

(defn *register-legacy-class-default-name
  "clazz - `java.lang.Class`"
  ([^java.lang.Class clazz]
    (LegacyIActivationDeserializer/registerLegacyClassDefaultName clazz)))

(defn *register-legacy-class-specified-name
  "name - `java.lang.String`
  clazz - `java.lang.Class`"
  ([^java.lang.String name ^java.lang.Class clazz]
    (LegacyIActivationDeserializer/registerLegacyClassSpecifiedName name clazz)))

(defn get-legacy-names-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^LegacyIActivationDeserializer this]
    (-> this (.getLegacyNamesMap))))

(defn get-legacy-json-mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper [^LegacyIActivationDeserializer this]
    (-> this (.getLegacyJsonMapper))))

(defn get-deserialized-type
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^LegacyIActivationDeserializer this]
    (-> this (.getDeserializedType))))

