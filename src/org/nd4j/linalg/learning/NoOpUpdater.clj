(ns org.nd4j.linalg.learning.NoOpUpdater
  "NoOp updater: gradient updater that makes no changes to the gradient"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning NoOpUpdater]))

(defn ->no-op-updater
  "Constructor.

  config - `org.nd4j.linalg.learning.config.NoOp`"
  (^NoOpUpdater [^org.nd4j.linalg.learning.config.NoOp config]
    (new NoOpUpdater config)))

(defn set-state-view-array
  "Description copied from interface: GradientUpdater

  view-array - Array (that is a view of a larger array) to use for the state. - `org.nd4j.linalg.api.ndarray.INDArray`
  shape - `long[]`
  order - `char`
  initialize - If true: the updater must initialize the view array. If false: no change to view array contents - `boolean`"
  ([^NoOpUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array shape ^Character order ^Boolean initialize]
    (-> this (.setStateViewArray view-array shape order initialize))))

(defn apply-updater
  "Description copied from interface: GradientUpdater

  gradient - the gradient to modify - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - `int`
  epoch - `int`"
  ([^NoOpUpdater this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^Integer iteration ^Integer epoch]
    (-> this (.applyUpdater gradient iteration epoch))))

