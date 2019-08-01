(ns org.deeplearning4j.arbiter.GraphConfiguration
  "Analogous to DL4JConfiguration, GraphConfiguration includes a configuration for ComputationGraphs, as well
 as early stopping (or, optionally numEpochs) fields."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter GraphConfiguration]))

(defn ->graph-configuration
  "Constructor."
  (^GraphConfiguration []
    (new GraphConfiguration )))

(defn to-yaml
  "Yaml mapping

  returns: `java.lang.String`"
  (^java.lang.String [^GraphConfiguration this]
    (-> this (.toYaml))))

(defn to-json
  "Json mapping

  returns: `java.lang.String`"
  (^java.lang.String [^GraphConfiguration this]
    (-> this (.toJson))))

