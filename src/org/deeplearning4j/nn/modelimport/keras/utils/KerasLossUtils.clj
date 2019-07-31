(ns org.deeplearning4j.nn.modelimport.keras.utils.KerasLossUtils
  "Utility functionality for keras loss functions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.utils KerasLossUtils]))

(defn ->keras-loss-utils
  "Constructor."
  (^KerasLossUtils []
    (new KerasLossUtils )))

(defn *map-loss-function
  "Map Keras to DL4J loss functions.

  keras-loss - String containing Keras loss function name - `java.lang.String`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: String containing DL4J loss function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException"
  (^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction [^java.lang.String keras-loss ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasLossUtils/mapLossFunction keras-loss conf)))

