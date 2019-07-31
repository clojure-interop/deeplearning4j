(ns org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer
  "An implementation of one class neural networks from:
 https://arxiv.org/pdf/1802.06360.pdf
 The one class neural network approach is an extension of the standard output layer
 with a single set of weights, an activation function, and a bias to:
 2 sets of weights, a learnable \"r\" parameter that is held static
 1 traditional set of weights.
 1 additional weight matrix"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.ocnn OCNNOutputLayer]))

(defn ->ocnn-output-layer
  "Constructor.

  hidden-size - `int`
  nu - `double`
  activation - `org.nd4j.linalg.activations.IActivation`
  window-size - `int`
  initial-r-value - `double`
  configure-r - `boolean`"
  (^OCNNOutputLayer [^Integer hidden-size ^Double nu ^org.nd4j.linalg.activations.IActivation activation ^Integer window-size ^Double initial-r-value ^Boolean configure-r]
    (new OCNNOutputLayer hidden-size nu activation window-size initial-r-value configure-r))
  (^OCNNOutputLayer [^org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer$Builder builder]
    (new OCNNOutputLayer builder)))

(defn get-loss-fn
  "returns: `org.nd4j.linalg.lossfunctions.ILossFunction`"
  (^org.nd4j.linalg.lossfunctions.ILossFunction [^OCNNOutputLayer this]
    (-> this (.getLossFn))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^OCNNOutputLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn get-n-out
  "returns: `long`"
  (^Long [^OCNNOutputLayer this]
    (-> this (.getNOut))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^OCNNOutputLayer this]
    (-> this (.initializer))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^OCNNOutputLayer this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^OCNNOutputLayer this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

