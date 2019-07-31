(ns org.nd4j.linalg.learning.AdamUpdater
  "The Adam updater.
 http://arxiv.org/abs/1412.6980"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning AdamUpdater]))

(defn ->adam-updater
  "Constructor.

  config - `org.nd4j.linalg.learning.config.Adam`"
  (^AdamUpdater [^org.nd4j.linalg.learning.config.Adam config]
    (new AdamUpdater config)))

(defn set-state-view-array
  "Description copied from interface: GradientUpdater

  view-array - Array (that is a view of a larger array) to use for the state. - `org.nd4j.linalg.api.ndarray.INDArray`
  gradient-shape - `long[]`
  gradient-order - `char`
  initialize - If true: the updater must initialize the view array. If false: no change to view array contents - `boolean`"
  ([^AdamUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array gradient-shape ^Character gradient-order ^Boolean initialize]
    (-> this (.setStateViewArray view-array gradient-shape gradient-order initialize))))

(defn apply-updater
  "Calculate the update based on the given gradient

  gradient - the gradient to get the update for - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - `int`
  epoch - `int`"
  ([^AdamUpdater this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^Integer iteration ^Integer epoch]
    (-> this (.applyUpdater gradient iteration epoch))))

