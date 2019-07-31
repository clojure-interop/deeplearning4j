(ns org.nd4j.linalg.learning.NadamUpdater
  "The Nadam updater.
 https://arxiv.org/pdf/1609.04747.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning NadamUpdater]))

(defn ->nadam-updater
  "Constructor.

  config - `org.nd4j.linalg.learning.config.Nadam`"
  (^NadamUpdater [^org.nd4j.linalg.learning.config.Nadam config]
    (new NadamUpdater config)))

(defn set-state-view-array
  "Description copied from interface: GradientUpdater

  view-array - Array (that is a view of a larger array) to use for the state. - `org.nd4j.linalg.api.ndarray.INDArray`
  gradient-shape - `long[]`
  gradient-order - `char`
  initialize - If true: the updater must initialize the view array. If false: no change to view array contents - `boolean`"
  ([^NadamUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array gradient-shape ^Character gradient-order ^Boolean initialize]
    (-> this (.setStateViewArray view-array gradient-shape gradient-order initialize))))

(defn apply-updater
  "Calculate the update based on the given gradient

  gradient - the gradient to get the update for - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - `int`
  epoch - `int`"
  ([^NadamUpdater this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^Integer iteration ^Integer epoch]
    (-> this (.applyUpdater gradient iteration epoch))))

