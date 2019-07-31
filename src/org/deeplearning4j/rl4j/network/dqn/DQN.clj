(ns org.deeplearning4j.rl4j.network.dqn.DQN
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.dqn DQN]))

(defn ->dqn
  "Constructor.

  mln - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`"
  (^DQN [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork mln]
    (new DQN mln)))

(defn *load
  "path - `java.lang.String`

  returns: `org.deeplearning4j.rl4j.network.dqn.DQN`

  throws: java.io.IOException"
  (^org.deeplearning4j.rl4j.network.dqn.DQN [^java.lang.String path]
    (DQN/load path)))

(defn save
  "Description copied from interface: NeuralNet

  stream - OutputStream to save in - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^DQN this ^java.io.OutputStream stream]
    (-> this (.save stream))))

(defn fit
  "Description copied from interface: NeuralNet

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^DQN this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.fit input labels))))

(defn output
  "batch - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DQN this ^org.nd4j.linalg.api.ndarray.INDArray batch]
    (-> this (.output batch))))

(defn gradient
  "Description copied from interface: NeuralNet

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: the gradients - `org.deeplearning4j.nn.gradient.Gradient[]`"
  ([^DQN this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.gradient input labels))))

(defn copy
  "Description copied from interface: NeuralNet

  from - where to copy parameters - `NN`"
  ([^DQN this from]
    (-> this (.copy from))))

(defn get-neural-networks
  "Description copied from interface: NeuralNet

  returns: `org.deeplearning4j.nn.api.NeuralNetwork[]`"
  ([^DQN this]
    (-> this (.getNeuralNetworks))))

(defn reset
  "Description copied from interface: NeuralNet"
  ([^DQN this]
    (-> this (.reset))))

(defn get-latest-score
  "Description copied from interface: NeuralNet

  returns: latest score - `double`"
  (^Double [^DQN this]
    (-> this (.getLatestScore))))

(defn output-all
  "batch - batch to evaluate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: evaluation by the model of the input by all outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^DQN this ^org.nd4j.linalg.api.ndarray.INDArray batch]
    (-> this (.outputAll batch))))

(defn clone
  "Description copied from interface: NeuralNet

  returns: the cloned neural net - `NN`"
  ([^DQN this]
    (-> this (.clone))))

(defn recurrent?
  "Description copied from interface: NeuralNet

  returns: `boolean`"
  (^Boolean [^DQN this]
    (-> this (.isRecurrent))))

(defn apply-gradient
  "Description copied from interface: NeuralNet

  gradient - gradients to apply the gradient from - `org.deeplearning4j.nn.gradient.Gradient[]`
  batch-size - batchSize from which the gradient was calculated on (similar to nstep) - `int`"
  ([^DQN this gradient ^Integer batch-size]
    (-> this (.applyGradient gradient batch-size))))

