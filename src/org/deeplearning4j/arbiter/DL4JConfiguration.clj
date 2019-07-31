(ns org.deeplearning4j.arbiter.DL4JConfiguration
  "DL4JConfiguration: simple configuration method that contains the following:
 - MultiLayerConfiguration
 - Early stopping settings, OR number of epochs
 Note: if early stopping configuration is absent, a fixed number of epochs (default: 1) will be used.
 If both early stopping and number of epochs is present: early stopping will be used."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter DL4JConfiguration]))

(defn ->dl-4-j-configuration
  "Constructor."
  (^DL4JConfiguration []
    (new DL4JConfiguration )))

(defn to-yaml
  "Yaml mapping

  returns: `java.lang.String`"
  (^java.lang.String [^DL4JConfiguration this]
    (-> this (.toYaml))))

(defn to-json
  "Json mapping

  returns: `java.lang.String`"
  (^java.lang.String [^DL4JConfiguration this]
    (-> this (.toJson))))

