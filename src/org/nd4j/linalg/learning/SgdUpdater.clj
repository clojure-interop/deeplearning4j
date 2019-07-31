(ns org.nd4j.linalg.learning.SgdUpdater
  "SGD updater applies a learning rate only"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning SgdUpdater]))

(defn ->sgd-updater
  "Constructor.

  config - `org.nd4j.linalg.learning.config.Sgd`"
  (^SgdUpdater [^org.nd4j.linalg.learning.config.Sgd config]
    (new SgdUpdater config)))

(defn set-state-view-array
  "Description copied from interface: GradientUpdater

  view-array - Array (that is a view of a larger array) to use for the state. - `org.nd4j.linalg.api.ndarray.INDArray`
  gradient-shape - `long[]`
  gradient-order - `char`
  initialize - If true: the updater must initialize the view array. If false: no change to view array contents - `boolean`"
  ([^SgdUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array gradient-shape ^Character gradient-order ^Boolean initialize]
    (-> this (.setStateViewArray view-array gradient-shape gradient-order initialize))))

(defn apply-updater
  "Description copied from interface: GradientUpdater

  gradient - the gradient to modify - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - `int`
  epoch - `int`"
  ([^SgdUpdater this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^Integer iteration ^Integer epoch]
    (-> this (.applyUpdater gradient iteration epoch))))

