(ns org.nd4j.linalg.learning.GradientUpdater
  "Gradient modifications: Calculates an update and tracks related information for gradient changes over time
 for handling updates."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning GradientUpdater]))

(defn get-config
  "returns: `T`"
  ([^GradientUpdater this]
    (-> this (.getConfig))))

(defn set-state-view-array
  "For the internal updater state (if any): set this to use the provided array.
  Used during initialization, and when restoring the updater state (after serialization, for example)

  view-array - Array (that is a view of a larger array) to use for the state. - `org.nd4j.linalg.api.ndarray.INDArray`
  gradient-shape - `long[]`
  gradient-order - `char`
  initialize - If true: the updater must initialize the view array. If false: no change to view array contents - `boolean`"
  ([^GradientUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array gradient-shape ^Character gradient-order ^Boolean initialize]
    (-> this (.setStateViewArray view-array gradient-shape gradient-order initialize))))

(defn apply-updater
  "Modify the gradient to be an update. Note that this is be done in-place

  gradient - the gradient to modify - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - `int`
  epoch - `int`"
  ([^GradientUpdater this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^Integer iteration ^Integer epoch]
    (-> this (.applyUpdater gradient iteration epoch))))

