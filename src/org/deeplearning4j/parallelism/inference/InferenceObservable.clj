(ns org.deeplearning4j.parallelism.inference.InferenceObservable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.inference InferenceObservable]))

(defn get-input-batches
  "Get input batches - and their associated input mask arrays, if any
  Note that usually the returned list will be of size 1 - however, in the batched case, not all inputs
  can actually be batched (variable size inputs to fully convolutional net, for example). In these \"can't batch\"
  cases, multiple input batches will be returned, to be processed

  returns: List of pairs of input arrays and input mask arrays. Input mask arrays may be null. - `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray[],org.nd4j.linalg.api.ndarray.INDArray[]>>`"
  ([^InferenceObservable this]
    (-> this (.getInputBatches))))

(defn add-input
  "input - `org.nd4j.linalg.api.ndarray.INDArray[]`
  input-masks - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^InferenceObservable this input input-masks]
    (-> this (.addInput input input-masks)))
  ([^InferenceObservable this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.addInput input))))

(defn set-output-batches
  "output - `java.util.List`"
  ([^InferenceObservable this ^java.util.List output]
    (-> this (.setOutputBatches output))))

(defn set-output-exception
  "e - `java.lang.Exception`"
  ([^InferenceObservable this ^java.lang.Exception e]
    (-> this (.setOutputException e))))

(defn add-observer
  "observer - `java.util.Observer`"
  ([^InferenceObservable this ^java.util.Observer observer]
    (-> this (.addObserver observer))))

(defn get-output
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^InferenceObservable this]
    (-> this (.getOutput))))

