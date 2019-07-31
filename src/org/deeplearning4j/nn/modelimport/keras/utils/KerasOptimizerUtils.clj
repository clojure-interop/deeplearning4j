(ns org.deeplearning4j.nn.modelimport.keras.utils.KerasOptimizerUtils
  "Utility functionality for keras optimizers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.utils KerasOptimizerUtils]))

(defn ->keras-optimizer-utils
  "Constructor."
  (^KerasOptimizerUtils []
    (new KerasOptimizerUtils )))

(defn *map-optimizer
  "Map Keras optimizer to DL4J IUpdater.

  optimizer-config - Optimizer configuration map - `java.util.Map`

  returns: DL4J IUpdater instance - `org.nd4j.linalg.learning.config.IUpdater`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException"
  (^org.nd4j.linalg.learning.config.IUpdater [^java.util.Map optimizer-config]
    (KerasOptimizerUtils/mapOptimizer optimizer-config)))

