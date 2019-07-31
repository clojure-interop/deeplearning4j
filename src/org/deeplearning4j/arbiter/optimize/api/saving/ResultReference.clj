(ns org.deeplearning4j.arbiter.optimize.api.saving.ResultReference
  "Idea: We can't store all results in memory in general (might have thousands of candidates with millions of
 parameters each)
 So instead: return a reference to the saved result. Idea is that the result may be saved to disk or a database,
 and we can easily load it back into memory (if/when required) using the getResult() method"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.saving ResultReference]))

(defn get-result
  "returns: `org.deeplearning4j.arbiter.optimize.api.OptimizationResult`

  throws: java.io.IOException"
  (^org.deeplearning4j.arbiter.optimize.api.OptimizationResult [^ResultReference this]
    (-> this (.getResult))))

(defn get-result-model
  "returns: `java.lang.Object`

  throws: java.io.IOException"
  (^java.lang.Object [^ResultReference this]
    (-> this (.getResultModel))))

