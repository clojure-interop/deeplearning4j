(ns org.nd4j.linalg.activations.impl.ActivationPReLU
  "/** Parametrized Rectified Linear Unit (PReLU)
 f(x) = alpha * x for x < 0, f(x) = x for x >= 0
 alpha has the same shape as x and is a learned parameter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.activations.impl ActivationPReLU]))

(defn ->activation-p-re-lu
  "Constructor.

  alpha - `org.nd4j.linalg.api.ndarray.INDArray`
  shared-axes - `long[]`"
  (^ActivationPReLU [^org.nd4j.linalg.api.ndarray.INDArray alpha shared-axes]
    (new ActivationPReLU alpha shared-axes))
  (^ActivationPReLU [^org.nd4j.linalg.api.ndarray.INDArray alpha]
    (new ActivationPReLU alpha)))

(defn get-activation
  "Description copied from interface: IActivation

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`

  returns: transformed activation - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ActivationPReLU this ^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean training]
    (-> this (.getActivation in training))))

(defn backprop
  "Description copied from interface: IActivation

  in - Input, before applying the activation function (z, or 'preOut') - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - Gradient to be backpropagated: dL/da, where L is the loss function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: dL/dz and dL/dW, for weights w (null if activation function has no weights) - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^ActivationPReLU this ^org.nd4j.linalg.api.ndarray.INDArray in ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.backprop in epsilon))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ActivationPReLU this]
    (-> this (.toString))))

