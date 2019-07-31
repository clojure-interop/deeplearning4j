(ns org.nd4j.linalg.activations.impl.ActivationELU
  "f(x) = alpha * (exp(x) - 1.0); x < 0
 = x ; x>= 0
 alpha defaults to 1, if not specified"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.activations.impl ActivationELU]))

(defn ->activation-elu
  "Constructor.

  alpha - `double`"
  (^ActivationELU [^Double alpha]
    (new ActivationELU alpha))
  (^ActivationELU []
    (new ActivationELU )))

(def *-default-alpha
  "Static Constant.

  type: double"
  ActivationELU/DEFAULT_ALPHA)

(defn get-activation
  "Description copied from interface: IActivation

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`

  returns: transformed activation - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ActivationELU this ^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean training]
    (-> this (.getActivation in training))))

(defn backprop
  "Description copied from interface: IActivation

  in - Input, before applying the activation function (z, or 'preOut') - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - Gradient to be backpropagated: dL/da, where L is the loss function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: dL/dz and dL/dW, for weights w (null if activation function has no weights) - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^ActivationELU this ^org.nd4j.linalg.api.ndarray.INDArray in ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.backprop in epsilon))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ActivationELU this]
    (-> this (.toString))))

