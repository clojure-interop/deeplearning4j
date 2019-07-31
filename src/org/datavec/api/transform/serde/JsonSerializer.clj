(ns org.datavec.api.transform.serde.JsonSerializer
  "Serializer used for converting objects (Transforms, Conditions, etc) to JSON format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.serde JsonSerializer]))

(defn ->json-serializer
  "Constructor."
  (^JsonSerializer []
    (new JsonSerializer )))

(defn get-object-mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper [^JsonSerializer this]
    (-> this (.getObjectMapper))))

