(ns org.deeplearning4j.ui.module.train.TrainModuleUtils
  "Utility methods for TrainModule"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.module.train TrainModuleUtils]))

(defn ->train-module-utils
  "Constructor."
  (^TrainModuleUtils []
    (new TrainModuleUtils )))

(defn *build-graph-info
  "config - `org.deeplearning4j.nn.conf.MultiLayerConfiguration`

  returns: `org.deeplearning4j.ui.module.train.TrainModuleUtils$GraphInfo`"
  (^org.deeplearning4j.ui.module.train.TrainModuleUtils$GraphInfo [^org.deeplearning4j.nn.conf.MultiLayerConfiguration config]
    (TrainModuleUtils/buildGraphInfo config)))

