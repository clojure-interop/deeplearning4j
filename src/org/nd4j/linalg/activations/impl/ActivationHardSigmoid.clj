(ns org.nd4j.linalg.activations.impl.ActivationHardSigmoid
  "f(x) = min(1, max(0, 0.2*x  0.5))"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.activations.impl ActivationHardSigmoid]))

(defn ->activation-hard-sigmoid
  "Constructor."
  (^ActivationHardSigmoid []
    (new ActivationHardSigmoid )))

(defn get-activation
  "Description copied from interface: IActivation

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`

  returns: transformed activation - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ActivationHardSigmoid this ^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean training]
    (-> this (.getActivation in training))))

(defn backprop
  "Description copied from interface: IActivation

  in - Input, before applying the activation function (z, or 'preOut') - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - Gradient to be backpropagated: dL/da, where L is the loss function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: dL/dz and dL/dW, for weights w (null if activation function has no weights) - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^ActivationHardSigmoid this ^org.nd4j.linalg.api.ndarray.INDArray in ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.backprop in epsilon))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ActivationHardSigmoid this]
    (-> this (.toString))))

