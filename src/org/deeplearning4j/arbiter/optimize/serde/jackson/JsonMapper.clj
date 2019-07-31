(ns org.deeplearning4j.arbiter.optimize.serde.jackson.JsonMapper
  "Created by Alex on 16/11/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.serde.jackson JsonMapper]))

(defn *get-yaml-mapper
  "Return the yaml mapper

  returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (JsonMapper/getYamlMapper )))

(defn *get-mapper
  "Return a json mapper

  returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (JsonMapper/getMapper )))

