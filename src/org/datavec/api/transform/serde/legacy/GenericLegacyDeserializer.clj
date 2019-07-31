(ns org.datavec.api.transform.serde.legacy.GenericLegacyDeserializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.serde.legacy GenericLegacyDeserializer]))

(defn ->generic-legacy-deserializer
  "Constructor."
  (^GenericLegacyDeserializer []
    (new GenericLegacyDeserializer )))

(defn get-legacy-json-mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper [^GenericLegacyDeserializer this]
    (-> this (.getLegacyJsonMapper))))

