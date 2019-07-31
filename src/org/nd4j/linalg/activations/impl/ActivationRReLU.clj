(ns org.nd4j.linalg.activations.impl.ActivationRReLU
  "f(x) = max(0,x)  alpha * min(0, x)
 alpha is drawn from uniform(l,u) during training and is set to l+u/2 during test
 l and u default to 1/8 and 1/3 respectively

 Empirical Evaluation of Rectified Activations in Convolutional Network"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.activations.impl ActivationRReLU]))

(defn ->activation-r-re-lu
  "Constructor.

  l - `double`
  u - `double`"
  (^ActivationRReLU [^Double l ^Double u]
    (new ActivationRReLU l u))
  (^ActivationRReLU []
    (new ActivationRReLU )))

(def *-default-l
  "Static Constant.

  type: double"
  ActivationRReLU/DEFAULT_L)

(def *-default-u
  "Static Constant.

  type: double"
  ActivationRReLU/DEFAULT_U)

(defn get-activation
  "Description copied from interface: IActivation

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`

  returns: transformed activation - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ActivationRReLU this ^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean training]
    (-> this (.getActivation in training))))

(defn backprop
  "Description copied from interface: IActivation

  in - Input, before applying the activation function (z, or 'preOut') - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - Gradient to be backpropagated: dL/da, where L is the loss function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: dL/dz and dL/dW, for weights w (null if activation function has no weights) - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^ActivationRReLU this ^org.nd4j.linalg.api.ndarray.INDArray in ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.backprop in epsilon))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ActivationRReLU this]
    (-> this (.toString))))

