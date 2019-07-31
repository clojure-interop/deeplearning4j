(ns org.deeplearning4j.rl4j.network.ac.IActorCritic
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.ac IActorCritic]))

(defn save
  "stream-value - `java.io.OutputStream`
  stream-policy - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^IActorCritic this ^java.io.OutputStream stream-value ^java.io.OutputStream stream-policy]
    (-> this (.save stream-value stream-policy))))

(defn fit
  "Description copied from interface: NeuralNet

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^IActorCritic this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.fit input labels))))

(defn gradient
  "Description copied from interface: NeuralNet

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: the gradients - `org.deeplearning4j.nn.gradient.Gradient[]`"
  ([^IActorCritic this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.gradient input labels))))

(defn copy
  "Description copied from interface: NeuralNet

  from - where to copy parameters - `NN`"
  ([^IActorCritic this from]
    (-> this (.copy from))))

(defn reset
  "Description copied from interface: NeuralNet"
  ([^IActorCritic this]
    (-> this (.reset))))

(defn get-latest-score
  "Description copied from interface: NeuralNet

  returns: latest score - `double`"
  (^Double [^IActorCritic this]
    (-> this (.getLatestScore))))

(defn output-all
  "batch - batch to evaluate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: evaluation by the model of the input by all outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^IActorCritic this ^org.nd4j.linalg.api.ndarray.INDArray batch]
    (-> this (.outputAll batch))))

(defn clone
  "Description copied from interface: NeuralNet

  returns: the cloned neural net - `NN`"
  ([^IActorCritic this]
    (-> this (.clone))))

(defn recurrent?
  "Description copied from interface: NeuralNet

  returns: `boolean`"
  (^Boolean [^IActorCritic this]
    (-> this (.isRecurrent))))

(defn apply-gradient
  "Description copied from interface: NeuralNet

  gradient - gradients to apply the gradient from - `org.deeplearning4j.nn.gradient.Gradient[]`
  batch-size - batchSize from which the gradient was calculated on (similar to nstep) - `int`"
  ([^IActorCritic this gradient ^Integer batch-size]
    (-> this (.applyGradient gradient batch-size))))

