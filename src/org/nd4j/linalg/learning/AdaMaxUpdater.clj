(ns org.nd4j.linalg.learning.AdaMaxUpdater
  "The AdaMax updater, a variant of Adam.
 http://arxiv.org/abs/1412.6980"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning AdaMaxUpdater]))

(defn ->ada-max-updater
  "Constructor.

  config - `org.nd4j.linalg.learning.config.AdaMax`"
  (^AdaMaxUpdater [^org.nd4j.linalg.learning.config.AdaMax config]
    (new AdaMaxUpdater config)))

(defn set-state-view-array
  "Description copied from interface: GradientUpdater

  view-array - Array (that is a view of a larger array) to use for the state. - `org.nd4j.linalg.api.ndarray.INDArray`
  gradient-shape - `long[]`
  gradient-order - `char`
  initialize - If true: the updater must initialize the view array. If false: no change to view array contents - `boolean`"
  ([^AdaMaxUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array gradient-shape ^Character gradient-order ^Boolean initialize]
    (-> this (.setStateViewArray view-array gradient-shape gradient-order initialize))))

(defn apply-updater
  "Calculate the update based on the given gradient

  gradient - the gradient to get the update for - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - `int`
  epoch - `int`"
  ([^AdaMaxUpdater this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^Integer iteration ^Integer epoch]
    (-> this (.applyUpdater gradient iteration epoch))))

