(ns org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfigurationFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.config KerasLayerConfigurationFactory]))

(defn ->keras-layer-configuration-factory
  "Constructor."
  (^KerasLayerConfigurationFactory []
    (new KerasLayerConfigurationFactory )))

(defn *get
  "keras-major-version - `java.lang.Integer`

  returns: `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException"
  (^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration [^java.lang.Integer keras-major-version]
    (KerasLayerConfigurationFactory/get keras-major-version)))

