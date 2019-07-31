(ns org.nd4j.serde.json.LegacyILossFunctionDeserializer
  "Deserializer for ILossFunction JSON in legacy format - see BaseLegacyDeserializer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.serde.json LegacyILossFunctionDeserializer]))

(defn ->legacy-i-loss-function-deserializer
  "Constructor."
  (^LegacyILossFunctionDeserializer []
    (new LegacyILossFunctionDeserializer )))

(defn *set-legacy-json-mapper
  "mapper - `org.nd4j.shade.jackson.databind.ObjectMapper`"
  ([^org.nd4j.shade.jackson.databind.ObjectMapper mapper]
    (LegacyILossFunctionDeserializer/setLegacyJsonMapper mapper)))

(defn *register-legacy-class-default-name
  "clazz - `java.lang.Class`"
  ([^java.lang.Class clazz]
    (LegacyILossFunctionDeserializer/registerLegacyClassDefaultName clazz)))

(defn *register-legacy-class-specified-name
  "name - `java.lang.String`
  clazz - `java.lang.Class`"
  ([^java.lang.String name ^java.lang.Class clazz]
    (LegacyILossFunctionDeserializer/registerLegacyClassSpecifiedName name clazz)))

(defn get-legacy-names-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^LegacyILossFunctionDeserializer this]
    (-> this (.getLegacyNamesMap))))

(defn get-legacy-json-mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper [^LegacyILossFunctionDeserializer this]
    (-> this (.getLegacyJsonMapper))))

(defn get-deserialized-type
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^LegacyILossFunctionDeserializer this]
    (-> this (.getDeserializedType))))

