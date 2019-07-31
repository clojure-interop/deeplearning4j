(ns org.nd4j.linalg.activations.impl.ActivationThresholdedReLU
  "Thresholded RELU
 f(x) = x for x > theta, f(x) = 0 otherwise. theta defaults to 1.0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.activations.impl ActivationThresholdedReLU]))

(defn ->activation-thresholded-re-lu
  "Constructor.

  theta - `double`"
  (^ActivationThresholdedReLU [^Double theta]
    (new ActivationThresholdedReLU theta))
  (^ActivationThresholdedReLU []
    (new ActivationThresholdedReLU )))

(def *-default-theta
  "Static Constant.

  type: double"
  ActivationThresholdedReLU/DEFAULT_THETA)

(defn get-activation
  "Description copied from interface: IActivation

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`

  returns: transformed activation - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ActivationThresholdedReLU this ^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean training]
    (-> this (.getActivation in training))))

(defn backprop
  "Description copied from interface: IActivation

  in - Input, before applying the activation function (z, or 'preOut') - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - Gradient to be backpropagated: dL/da, where L is the loss function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: dL/dz and dL/dW, for weights w (null if activation function has no weights) - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^ActivationThresholdedReLU this ^org.nd4j.linalg.api.ndarray.INDArray in ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.backprop in epsilon))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ActivationThresholdedReLU this]
    (-> this (.toString))))

