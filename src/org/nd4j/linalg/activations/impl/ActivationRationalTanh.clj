(ns org.nd4j.linalg.activations.impl.ActivationRationalTanh
  "Rational tanh approximation
 From https://arxiv.org/pdf/1508.01292v3
 f(x) = 1.7159 * tanh(2x/3)
 where tanh is approximated as follows,
 tanh(y) ~ sgn(y) * { 1 - 1/(1+|y|+y^2+1.41645*y^4)}
 Underlying implementation is in native code"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.activations.impl ActivationRationalTanh]))

(defn ->activation-rational-tanh
  "Constructor."
  (^ActivationRationalTanh []
    (new ActivationRationalTanh )))

(defn get-activation
  "Description copied from interface: IActivation

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`

  returns: transformed activation - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ActivationRationalTanh this ^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean training]
    (-> this (.getActivation in training))))

(defn backprop
  "Description copied from interface: IActivation

  in - Input, before applying the activation function (z, or 'preOut') - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - Gradient to be backpropagated: dL/da, where L is the loss function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: dL/dz and dL/dW, for weights w (null if activation function has no weights) - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^ActivationRationalTanh this ^org.nd4j.linalg.api.ndarray.INDArray in ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.backprop in epsilon))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ActivationRationalTanh this]
    (-> this (.toString))))

