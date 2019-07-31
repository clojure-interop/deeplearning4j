(ns org.deeplearning4j.arbiter.saver.local.FileModelSaver
  "Basic MultiLayerNetwork saver. Saves config, parameters and score to: baseDir/0/, baseDir/1/, etc
 where index is given by OptimizationResult.getIndex()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.saver.local FileModelSaver]))

(defn ->file-model-saver
  "Constructor.

  path - `java.lang.String`"
  (^FileModelSaver [^java.lang.String path]
    (new FileModelSaver path)))

(defn save-model
  "Description copied from interface: ResultSaver

  result - Optimization result for the model to save - `org.deeplearning4j.arbiter.optimize.api.OptimizationResult`
  model-result - Model result to save - `java.lang.Object`

  returns: ResultReference, such that the result can be loaded back into memory - `org.deeplearning4j.arbiter.optimize.api.saving.ResultReference`

  throws: java.io.IOException - If IO error occurs during model saving"
  (^org.deeplearning4j.arbiter.optimize.api.saving.ResultReference [^FileModelSaver this ^org.deeplearning4j.arbiter.optimize.api.OptimizationResult result ^java.lang.Object model-result]
    (-> this (.saveModel result model-result))))

(defn get-supported-candidate-types
  "returns: The candidate types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^FileModelSaver this]
    (-> this (.getSupportedCandidateTypes))))

(defn get-supported-model-types
  "returns: The model types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^FileModelSaver this]
    (-> this (.getSupportedModelTypes))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FileModelSaver this]
    (-> this (.toString))))

