(ns org.deeplearning4j.parallelism.inference.observers.BatchedInferenceObservable
  "This class holds reference input, and implements second use case: BATCHED inference"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.inference.observers BatchedInferenceObservable]))

(defn ->batched-inference-observable
  "Constructor."
  (^BatchedInferenceObservable []
    (new BatchedInferenceObservable )))

(defn add-input
  "input - `org.nd4j.linalg.api.ndarray.INDArray[]`
  input-masks - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^BatchedInferenceObservable this input input-masks]
    (-> this (.addInput input input-masks))))

(defn get-input-batches
  "Description copied from interface: InferenceObservable

  returns: List of pairs of input arrays and input mask arrays. Input mask arrays may be null. - `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray[],org.nd4j.linalg.api.ndarray.INDArray[]>>`"
  ([^BatchedInferenceObservable this]
    (-> this (.getInputBatches))))

(defn set-output-batches
  "output - `java.util.List`"
  ([^BatchedInferenceObservable this ^java.util.List output]
    (-> this (.setOutputBatches output))))

(defn set-position
  "pos - `int`"
  ([^BatchedInferenceObservable this ^Integer pos]
    (-> this (.setPosition pos))))

(defn get-counter
  "returns: `int`"
  (^Integer [^BatchedInferenceObservable this]
    (-> this (.getCounter))))

(defn locked?
  "returns: `boolean`"
  (^Boolean [^BatchedInferenceObservable this]
    (-> this (.isLocked))))

(defn get-output
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^BatchedInferenceObservable this]
    (-> this (.getOutput))))

