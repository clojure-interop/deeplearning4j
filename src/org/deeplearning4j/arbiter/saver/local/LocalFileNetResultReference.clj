(ns org.deeplearning4j.arbiter.saver.local.LocalFileNetResultReference
  "Result reference for MultiLayerNetworks and ComputationGraphs saved to local file system"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.saver.local LocalFileNetResultReference]))

(defn ->local-file-net-result-reference
  "Constructor."
  (^LocalFileNetResultReference []
    (new LocalFileNetResultReference )))

(defn get-result
  "returns: `org.deeplearning4j.arbiter.optimize.api.OptimizationResult`

  throws: java.io.IOException"
  (^org.deeplearning4j.arbiter.optimize.api.OptimizationResult [^LocalFileNetResultReference this]
    (-> this (.getResult))))

(defn get-result-model
  "returns: `java.lang.Object`

  throws: java.io.IOException"
  (^java.lang.Object [^LocalFileNetResultReference this]
    (-> this (.getResultModel))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LocalFileNetResultReference this]
    (-> this (.toString))))

