(ns org.deeplearning4j.parallelism.inference.observers.BasicInferenceObservable
  "This class holds reference input, and implements basic use case: SEQUENTIAL inference"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.inference.observers BasicInferenceObservable]))

(defn ->basic-inference-observable
  "Constructor.

  inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  input-masks - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  (^BasicInferenceObservable [inputs input-masks]
    (new BasicInferenceObservable inputs input-masks))
  (^BasicInferenceObservable [^org.nd4j.linalg.api.ndarray.INDArray inputs]
    (new BasicInferenceObservable inputs)))

(defn add-input
  "input - `org.nd4j.linalg.api.ndarray.INDArray[]`
  input-masks - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^BasicInferenceObservable this input input-masks]
    (-> this (.addInput input input-masks)))
  ([^BasicInferenceObservable this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.addInput input))))

(defn set-output-batches
  "output - `java.util.List`"
  ([^BasicInferenceObservable this ^java.util.List output]
    (-> this (.setOutputBatches output))))

(defn get-input-batches
  "Description copied from interface: InferenceObservable

  returns: List of pairs of input arrays and input mask arrays. Input mask arrays may be null. - `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray[],org.nd4j.linalg.api.ndarray.INDArray[]>>`"
  ([^BasicInferenceObservable this]
    (-> this (.getInputBatches))))

(defn set-output-exception
  "exception - `java.lang.Exception`"
  ([^BasicInferenceObservable this ^java.lang.Exception exception]
    (-> this (.setOutputException exception))))

(defn get-output
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^BasicInferenceObservable this]
    (-> this (.getOutput))))

