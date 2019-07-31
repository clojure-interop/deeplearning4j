(ns org.nd4j.linalg.learning.NesterovsUpdater
  "Nesterov's momentum.
 Keep track of the previous layer's gradient
 and use it as a way of updating the gradient."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning NesterovsUpdater]))

(defn ->nesterovs-updater
  "Constructor.

  config - `org.nd4j.linalg.learning.config.Nesterovs`"
  (^NesterovsUpdater [^org.nd4j.linalg.learning.config.Nesterovs config]
    (new NesterovsUpdater config)))

(defn set-state-view-array
  "Description copied from interface: GradientUpdater

  view-array - Array (that is a view of a larger array) to use for the state. - `org.nd4j.linalg.api.ndarray.INDArray`
  gradient-shape - `long[]`
  gradient-order - `char`
  initialize - If true: the updater must initialize the view array. If false: no change to view array contents - `boolean`"
  ([^NesterovsUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array gradient-shape ^Character gradient-order ^Boolean initialize]
    (-> this (.setStateViewArray view-array gradient-shape gradient-order initialize))))

(defn apply-updater
  "Get the nesterov update

  gradient - the gradient to get the update for - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - `int`
  epoch - `int`"
  ([^NesterovsUpdater this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^Integer iteration ^Integer epoch]
    (-> this (.applyUpdater gradient iteration epoch))))

