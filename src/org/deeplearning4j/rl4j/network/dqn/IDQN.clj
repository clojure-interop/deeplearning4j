(ns org.deeplearning4j.rl4j.network.dqn.IDQN
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.network.dqn IDQN]))

(defn fit
  "Description copied from interface: NeuralNet

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^IDQN this ^org.nd4j.linalg.api.ndarray.INDArray input labels]
    (-> this (.fit input labels))))

(defn output
  "batch - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^IDQN this ^org.nd4j.linalg.api.ndarray.INDArray batch]
    (-> this (.output batch))))

(defn gradient
  "Description copied from interface: NeuralNet

  input - input batch - `org.nd4j.linalg.api.ndarray.INDArray`
  label - target batch - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: the gradients - `org.deeplearning4j.nn.gradient.Gradient[]`"
  ([^IDQN this ^org.nd4j.linalg.api.ndarray.INDArray input label]
    (-> this (.gradient input label))))

(defn copy
  "Description copied from interface: NeuralNet

  from - where to copy parameters - `NN`"
  ([^IDQN this from]
    (-> this (.copy from))))

(defn reset
  "Description copied from interface: NeuralNet"
  ([^IDQN this]
    (-> this (.reset))))

(defn get-latest-score
  "Description copied from interface: NeuralNet

  returns: latest score - `double`"
  (^Double [^IDQN this]
    (-> this (.getLatestScore))))

(defn output-all
  "batch - batch to evaluate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: evaluation by the model of the input by all outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^IDQN this ^org.nd4j.linalg.api.ndarray.INDArray batch]
    (-> this (.outputAll batch))))

(defn clone
  "Description copied from interface: NeuralNet

  returns: the cloned neural net - `NN`"
  ([^IDQN this]
    (-> this (.clone))))

(defn recurrent?
  "Description copied from interface: NeuralNet

  returns: `boolean`"
  (^Boolean [^IDQN this]
    (-> this (.isRecurrent))))

(defn apply-gradient
  "Description copied from interface: NeuralNet

  gradient - gradients to apply the gradient from - `org.deeplearning4j.nn.gradient.Gradient[]`
  batch-size - batchSize from which the gradient was calculated on (similar to nstep) - `int`"
  ([^IDQN this gradient ^Integer batch-size]
    (-> this (.applyGradient gradient batch-size))))

