(ns org.deeplearning4j.arbiter.optimize.api.saving.ResultSaver
  "The ResultSaver interface provides a means of saving models in such a way that they can be loaded back into memory later,
 regardless of where/how they are saved."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.saving ResultSaver]))

(defn save-model
  "Save the model (including configuration and any additional evaluation/results)

  result - Optimization result for the model to save - `org.deeplearning4j.arbiter.optimize.api.OptimizationResult`
  model-result - Model result to save - `java.lang.Object`

  returns: ResultReference, such that the result can be loaded back into memory - `org.deeplearning4j.arbiter.optimize.api.saving.ResultReference`

  throws: java.io.IOException - If IO error occurs during model saving"
  (^org.deeplearning4j.arbiter.optimize.api.saving.ResultReference [^ResultSaver this ^org.deeplearning4j.arbiter.optimize.api.OptimizationResult result ^java.lang.Object model-result]
    (-> this (.saveModel result model-result))))

(defn get-supported-candidate-types
  "returns: The candidate types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^ResultSaver this]
    (-> this (.getSupportedCandidateTypes))))

(defn get-supported-model-types
  "returns: The model types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^ResultSaver this]
    (-> this (.getSupportedModelTypes))))

