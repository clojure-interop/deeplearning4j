(ns org.nd4j.linalg.learning.legacy.AdaGrad
  "Legacy AdaGrad implementation for use in NLP etc applications"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning.legacy AdaGrad]))

(defn ->ada-grad
  "Constructor.

  rows - `int`
  cols - `int`
  learning-rate - `double`"
  (^AdaGrad [^Integer rows ^Integer cols ^Double learning-rate]
    (new AdaGrad rows cols learning-rate))
  (^AdaGrad [^Integer rows ^Integer cols]
    (new AdaGrad rows cols))
  (^AdaGrad [^Double learning-rate]
    (new AdaGrad learning-rate)))

(def *-default-adagrad-epsilon
  "Static Constant.

  type: double"
  AdaGrad/DEFAULT_ADAGRAD_EPSILON)

(defn historical-gradient
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AdaGrad this]
    (-> this .-historicalGradient)))

(defn shape
  "Instance Field.

  type: int[]"
  ([^AdaGrad this]
    (-> this .-shape)))

(defn state-size-for-input-size
  "input-size - `int`

  returns: `int`"
  (^Integer [^AdaGrad this ^Integer input-size]
    (-> this (.stateSizeForInputSize input-size))))

(defn set-state-view-array
  "view-array - `org.nd4j.linalg.api.ndarray.INDArray`
  gradient-shape - `int[]`
  gradient-order - `char`
  initialize - `boolean`"
  ([^AdaGrad this ^org.nd4j.linalg.api.ndarray.INDArray view-array gradient-shape ^Character gradient-order ^Boolean initialize]
    (-> this (.setStateViewArray view-array gradient-shape gradient-order initialize))))

(defn update
  "args - `java.lang.Object`"
  ([^AdaGrad this ^java.lang.Object args]
    (-> this (.update args))))

(defn get-gradient
  "Gets feature specific learning rates
  Adagrad keeps a history of gradients being passed in.
  Note that each gradient passed in becomes adapted over time, hence
  the opName adagrad

  gradient - the gradient to get learning rates for - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - `int`

  returns: the feature specific learning rates - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AdaGrad this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^Integer iteration]
    (-> this (.getGradient gradient iteration)))
  (^Double [^AdaGrad this ^Double gradient ^Integer column shape]
    (-> this (.getGradient gradient column shape))))

(defn create-subset
  "index - `int`

  returns: `org.nd4j.linalg.learning.legacy.AdaGrad`"
  (^org.nd4j.linalg.learning.legacy.AdaGrad [^AdaGrad this ^Integer index]
    (-> this (.createSubset index))))

