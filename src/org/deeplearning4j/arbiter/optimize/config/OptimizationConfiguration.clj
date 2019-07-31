(ns org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration
  "OptimizationConfiguration ties together all of the various
 components (such as data, score functions, result saving etc)
 required to execute hyperparameter optimization."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.config OptimizationConfiguration]))

(defn *from-yaml
  "Create an optimization configuration from the json

  json - the json to create the config fromFor type definitions - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration [^java.lang.String json]
    (OptimizationConfiguration/fromYaml json)))

(defn *from-json
  "Create an optimization configuration from the json

  json - the json to create the config from - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration [^java.lang.String json]
    (OptimizationConfiguration/fromJson json)))

(defn to-json
  "Return a json configuration of this optimization configuration

  returns: `java.lang.String`"
  (^java.lang.String [^OptimizationConfiguration this]
    (-> this (.toJson))))

(defn to-yaml
  "Return a yaml configuration of this optimization configuration

  returns: `java.lang.String`"
  (^java.lang.String [^OptimizationConfiguration this]
    (-> this (.toYaml))))

