(ns org.deeplearning4j.arbiter.optimize.api.saving.InMemoryResultSaver
  "A simple class to store optimization results in-memory.
 Not recommended for large (or a large number of) models."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.saving InMemoryResultSaver]))

(defn ->in-memory-result-saver
  "Constructor."
  (^InMemoryResultSaver []
    (new InMemoryResultSaver )))

(defn save-model
  "Description copied from interface: ResultSaver

  result - Optimization result for the model to save - `org.deeplearning4j.arbiter.optimize.api.OptimizationResult`
  model-result - Model result to save - `java.lang.Object`

  returns: ResultReference, such that the result can be loaded back into memory - `org.deeplearning4j.arbiter.optimize.api.saving.ResultReference`

  throws: java.io.IOException - If IO error occurs during model saving"
  (^org.deeplearning4j.arbiter.optimize.api.saving.ResultReference [^InMemoryResultSaver this ^org.deeplearning4j.arbiter.optimize.api.OptimizationResult result ^java.lang.Object model-result]
    (-> this (.saveModel result model-result))))

(defn get-supported-candidate-types
  "returns: The candidate types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^InMemoryResultSaver this]
    (-> this (.getSupportedCandidateTypes))))

(defn get-supported-model-types
  "returns: The model types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^InMemoryResultSaver this]
    (-> this (.getSupportedModelTypes))))

