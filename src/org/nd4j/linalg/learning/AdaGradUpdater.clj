(ns org.nd4j.linalg.learning.AdaGradUpdater
  "Vectorized Learning Rate used per Connection Weight

 Adapted from: http://xcorr.net/2014/01/23/adagrad-eliminating-learning-rates-in-stochastic-gradient-descent/
 See also http://cs231n.github.io/neural-networks-3/#ada"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning AdaGradUpdater]))

(defn ->ada-grad-updater
  "Constructor.

  config - `org.nd4j.linalg.learning.config.AdaGrad`"
  (^AdaGradUpdater [^org.nd4j.linalg.learning.config.AdaGrad config]
    (new AdaGradUpdater config)))

(defn historical-gradient
  "Instance Field.

  type: org.nd4j.linalg.api.ndarray.INDArray"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AdaGradUpdater this]
    (-> this .-historicalGradient)))

(defn shape
  "Instance Field.

  type: int[]"
  ([^AdaGradUpdater this]
    (-> this .-shape)))

(defn set-state-view-array
  "Description copied from interface: GradientUpdater

  view-array - Array (that is a view of a larger array) to use for the state. - `org.nd4j.linalg.api.ndarray.INDArray`
  gradient-shape - `long[]`
  gradient-order - `char`
  initialize - If true: the updater must initialize the view array. If false: no change to view array contents - `boolean`"
  ([^AdaGradUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array gradient-shape ^Character gradient-order ^Boolean initialize]
    (-> this (.setStateViewArray view-array gradient-shape gradient-order initialize))))

(defn apply-updater
  "Gets feature specific learning rates
  Adagrad keeps a history of gradients being passed in.
  Note that each gradient passed in becomes adapted over time, hence the opName adagrad

  gradient - the gradient to get learning rates for - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - `int`
  epoch - `int`"
  ([^AdaGradUpdater this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^Integer iteration ^Integer epoch]
    (-> this (.applyUpdater gradient iteration epoch))))

