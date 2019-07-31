(ns org.datavec.api.transform.serde.YamlSerializer
  "Serializer used for converting objects (Transforms, Conditions, etc) to YAML format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.serde YamlSerializer]))

(defn ->yaml-serializer
  "Constructor."
  (^YamlSerializer []
    (new YamlSerializer )))

(defn get-object-mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper [^YamlSerializer this]
    (-> this (.getObjectMapper))))

