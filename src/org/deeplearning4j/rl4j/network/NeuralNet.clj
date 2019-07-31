(ns org.deeplearning4j.rl4j.network.NeuralNet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network NeuralNet]))

(defn save
  "save the neural net into an OutputStream

  os - OutputStream to save in - `java.io.OutputStream`

  throws: java.io.IOException"
  ([^NeuralNet this ^java.io.OutputStream os]
    (-> this (.save os))))

(defn fit
  "fit from input and labels

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^NeuralNet this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.fit input labels))))

(defn gradient
  "Calculate the gradients from input and label (target) of all outputs

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: the gradients - `org.deeplearning4j.nn.gradient.Gradient[]`"
  ([^NeuralNet this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.gradient input labels))))

(defn copy
  "copy the parameters from a neural net

  from - where to copy parameters - `NN`"
  ([^NeuralNet this from]
    (-> this (.copy from))))

(defn get-neural-networks
  "Returns the underlying MultiLayerNetwork or ComputationGraph objects.

  returns: `org.deeplearning4j.nn.api.NeuralNetwork[]`"
  ([^NeuralNet this]
    (-> this (.getNeuralNetworks))))

(defn reset
  "required for recurrent networks during init"
  ([^NeuralNet this]
    (-> this (.reset))))

(defn get-latest-score
  "latest score from lastest fit

  returns: latest score - `double`"
  (^Double [^NeuralNet this]
    (-> this (.getLatestScore))))

(defn output-all
  "batch - batch to evaluate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: evaluation by the model of the input by all outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^NeuralNet this ^org.nd4j.linalg.api.ndarray.INDArray batch]
    (-> this (.outputAll batch))))

(defn clone
  "clone the Neural Net with the same paramaeters

  returns: the cloned neural net - `NN`"
  ([^NeuralNet this]
    (-> this (.clone))))

(defn recurrent?
  "returns true if this is a recurrent network

  returns: `boolean`"
  (^Boolean [^NeuralNet this]
    (-> this (.isRecurrent))))

(defn apply-gradient
  "update the params from the gradients and the batchSize

  gradients - gradients to apply the gradient from - `org.deeplearning4j.nn.gradient.Gradient[]`
  batch-size - batchSize from which the gradient was calculated on (similar to nstep) - `int`"
  ([^NeuralNet this gradients ^Integer batch-size]
    (-> this (.applyGradient gradients batch-size))))

