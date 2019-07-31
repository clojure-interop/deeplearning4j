(ns org.deeplearning4j.rl4j.network.ac.ActorCriticCompGraph
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.ac ActorCriticCompGraph]))

(defn ->actor-critic-comp-graph
  "Constructor.

  cg - `org.deeplearning4j.nn.graph.ComputationGraph`"
  (^ActorCriticCompGraph [^org.deeplearning4j.nn.graph.ComputationGraph cg]
    (new ActorCriticCompGraph cg)))

(defn *load
  "path - `java.lang.String`

  returns: `org.deeplearning4j.rl4j.network.ac.ActorCriticCompGraph`

  throws: java.io.IOException"
  (^org.deeplearning4j.rl4j.network.ac.ActorCriticCompGraph [^java.lang.String path]
    (ActorCriticCompGraph/load path)))

(defn save
  "Description copied from interface: NeuralNet

  stream - OutputStream to save in - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^ActorCriticCompGraph this ^java.io.OutputStream stream]
    (-> this (.save stream)))
  ([^ActorCriticCompGraph this ^java.io.OutputStream stream-value ^java.io.OutputStream stream-policy]
    (-> this (.save stream-value stream-policy))))

(defn fit
  "Description copied from interface: NeuralNet

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ActorCriticCompGraph this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.fit input labels))))

(defn gradient
  "Description copied from interface: NeuralNet

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: the gradients - `org.deeplearning4j.nn.gradient.Gradient[]`"
  ([^ActorCriticCompGraph this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.gradient input labels))))

(defn copy
  "Description copied from interface: NeuralNet

  from - where to copy parameters - `NN`"
  ([^ActorCriticCompGraph this from]
    (-> this (.copy from))))

(defn get-neural-networks
  "Description copied from interface: NeuralNet

  returns: `org.deeplearning4j.nn.api.NeuralNetwork[]`"
  ([^ActorCriticCompGraph this]
    (-> this (.getNeuralNetworks))))

(defn reset
  "Description copied from interface: NeuralNet"
  ([^ActorCriticCompGraph this]
    (-> this (.reset))))

(defn get-latest-score
  "Description copied from interface: NeuralNet

  returns: latest score - `double`"
  (^Double [^ActorCriticCompGraph this]
    (-> this (.getLatestScore))))

(defn output-all
  "batch - batch to evaluate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: evaluation by the model of the input by all outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ActorCriticCompGraph this ^org.nd4j.linalg.api.ndarray.INDArray batch]
    (-> this (.outputAll batch))))

(defn clone
  "Description copied from interface: NeuralNet

  returns: the cloned neural net - `NN`"
  ([^ActorCriticCompGraph this]
    (-> this (.clone))))

(defn apply-gradient
  "Description copied from interface: NeuralNet

  gradient - gradients to apply the gradient from - `org.deeplearning4j.nn.gradient.Gradient[]`
  batch-size - batchSize from which the gradient was calculated on (similar to nstep) - `int`"
  ([^ActorCriticCompGraph this gradient ^Integer batch-size]
    (-> this (.applyGradient gradient batch-size))))

