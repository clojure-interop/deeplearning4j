(ns org.deeplearning4j.rl4j.network.ac.ActorCriticSeparate
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.ac ActorCriticSeparate]))

(defn ->actor-critic-separate
  "Constructor.

  value-net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  policy-net - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^ActorCriticSeparate [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork value-net ^org.deeplearning4j.nn.multilayer.MultiLayerNetwork policy-net]
    (new ActorCriticSeparate value-net policy-net)))

(defn *load
  "path-value - `java.lang.String`
  path-policy - `java.lang.String`

  returns: `org.deeplearning4j.rl4j.network.ac.ActorCriticSeparate`

  throws: java.io.IOException"
  (^org.deeplearning4j.rl4j.network.ac.ActorCriticSeparate [^java.lang.String path-value ^java.lang.String path-policy]
    (ActorCriticSeparate/load path-value path-policy)))

(defn save
  "Description copied from interface: NeuralNet

  stream - OutputStream to save in - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^ActorCriticSeparate this ^java.io.OutputStream stream]
    (-> this (.save stream)))
  ([^ActorCriticSeparate this ^java.io.OutputStream stream-value ^java.io.OutputStream stream-policy]
    (-> this (.save stream-value stream-policy))))

(defn fit
  "Description copied from interface: NeuralNet

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ActorCriticSeparate this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.fit input labels))))

(defn gradient
  "Description copied from interface: NeuralNet

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: the gradients - `org.deeplearning4j.nn.gradient.Gradient[]`"
  ([^ActorCriticSeparate this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.gradient input labels))))

(defn copy
  "Description copied from interface: NeuralNet

  from - where to copy parameters - `NN`"
  ([^ActorCriticSeparate this from]
    (-> this (.copy from))))

(defn get-neural-networks
  "Description copied from interface: NeuralNet

  returns: `org.deeplearning4j.nn.api.NeuralNetwork[]`"
  ([^ActorCriticSeparate this]
    (-> this (.getNeuralNetworks))))

(defn reset
  "Description copied from interface: NeuralNet"
  ([^ActorCriticSeparate this]
    (-> this (.reset))))

(defn get-latest-score
  "Description copied from interface: NeuralNet

  returns: latest score - `double`"
  (^Double [^ActorCriticSeparate this]
    (-> this (.getLatestScore))))

(defn output-all
  "batch - batch to evaluate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: evaluation by the model of the input by all outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ActorCriticSeparate this ^org.nd4j.linalg.api.ndarray.INDArray batch]
    (-> this (.outputAll batch))))

(defn clone
  "Description copied from interface: NeuralNet

  returns: the cloned neural net - `NN`"
  ([^ActorCriticSeparate this]
    (-> this (.clone))))

(defn apply-gradient
  "Description copied from interface: NeuralNet

  gradient - gradients to apply the gradient from - `org.deeplearning4j.nn.gradient.Gradient[]`
  batch-size - batchSize from which the gradient was calculated on (similar to nstep) - `int`"
  ([^ActorCriticSeparate this gradient ^Integer batch-size]
    (-> this (.applyGradient gradient batch-size))))

