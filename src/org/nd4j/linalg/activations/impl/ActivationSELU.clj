(ns org.nd4j.linalg.activations.impl.ActivationSELU
  "https://arxiv.org/pdf/1706.02515.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.activations.impl ActivationSELU]))

(defn ->activation-selu
  "Constructor."
  (^ActivationSELU []
    (new ActivationSELU )))

(defn get-activation
  "Description copied from interface: IActivation

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`

  returns: transformed activation - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ActivationSELU this ^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean training]
    (-> this (.getActivation in training))))

(defn backprop
  "Description copied from interface: IActivation

  in - Input, before applying the activation function (z, or 'preOut') - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - Gradient to be backpropagated: dL/da, where L is the loss function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: dL/dz and dL/dW, for weights w (null if activation function has no weights) - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^ActivationSELU this ^org.nd4j.linalg.api.ndarray.INDArray in ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.backprop in epsilon))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ActivationSELU this]
    (-> this (.toString))))
