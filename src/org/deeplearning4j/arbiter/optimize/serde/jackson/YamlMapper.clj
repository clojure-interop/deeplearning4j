(ns org.deeplearning4j.arbiter.optimize.serde.jackson.YamlMapper
  "Created by Alex on 16/11/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.serde.jackson YamlMapper]))

(defn *get-mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (YamlMapper/getMapper )))

