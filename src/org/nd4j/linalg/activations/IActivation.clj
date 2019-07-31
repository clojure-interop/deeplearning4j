(ns org.nd4j.linalg.activations.IActivation
  "Interface for implementing custom activation functions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.activations IActivation]))

(defn get-activation
  "Carry out activation function on the input array (usually known as 'preOut' or 'z')
  Implementations must overwrite \"in\", transform in place and return \"in\"
  Can support separate behaviour during test

  in - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`

  returns: transformed activation - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^IActivation this ^org.nd4j.linalg.api.ndarray.INDArray in ^Boolean training]
    (-> this (.getActivation in training))))

(defn backprop
  "Backpropagate the errors through the activation function, given input z and epsilon dL/da.
  Returns 2 INDArrays:
  (a) The gradient dL/dz, calculated from dL/da, and
  (b) The parameter gradients dL/dW, where w is the weights in the activation function. For activation functions
  with no gradients, this will be null.

  in - Input, before applying the activation function (z, or 'preOut') - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - Gradient to be backpropagated: dL/da, where L is the loss function - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: dL/dz and dL/dW, for weights w (null if activation function has no weights) - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^IActivation this ^org.nd4j.linalg.api.ndarray.INDArray in ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.backprop in epsilon))))

(defn num-params
  "input-size - `int`

  returns: `int`"
  (^Integer [^IActivation this ^Integer input-size]
    (-> this (.numParams input-size))))

(defn set-parameters-view-array
  "view-array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize - `boolean`"
  ([^IActivation this ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize]
    (-> this (.setParametersViewArray view-array initialize))))

(defn get-parameters-view-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^IActivation this]
    (-> this (.getParametersViewArray))))

(defn set-gradient-view-array
  "view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^IActivation this ^org.nd4j.linalg.api.ndarray.INDArray view-array]
    (-> this (.setGradientViewArray view-array))))

(defn get-gradient-view-array
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^IActivation this]
    (-> this (.getGradientViewArray))))

