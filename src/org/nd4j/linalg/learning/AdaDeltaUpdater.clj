(ns org.nd4j.linalg.learning.AdaDeltaUpdater
  "http://www.matthewzeiler.com/pubs/googleTR2012/googleTR2012.pdf
 https://arxiv.org/pdf/1212.5701v1.pdf

 Ada delta updater. More robust adagrad that keeps track of a moving window
 average of the gradient rather than the every decaying learning rates of adagrad"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning AdaDeltaUpdater]))

(defn ->ada-delta-updater
  "Constructor.

  config - `org.nd4j.linalg.learning.config.AdaDelta`"
  (^AdaDeltaUpdater [^org.nd4j.linalg.learning.config.AdaDelta config]
    (new AdaDeltaUpdater config)))

(defn set-state-view-array
  "Description copied from interface: GradientUpdater

  view-array - Array (that is a view of a larger array) to use for the state. - `org.nd4j.linalg.api.ndarray.INDArray`
  gradient-shape - `long[]`
  gradient-order - `char`
  initialize - If true: the updater must initialize the view array. If false: no change to view array contents - `boolean`"
  ([^AdaDeltaUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array gradient-shape ^Character gradient-order ^Boolean initialize]
    (-> this (.setStateViewArray view-array gradient-shape gradient-order initialize))))

(defn apply-updater
  "Get the updated gradient for the given gradient
  and also update the state of ada delta.

  gradient - the gradient to get theupdated gradient for - `org.nd4j.linalg.api.ndarray.INDArray`
  iteration - `int`
  epoch - `int`"
  ([^AdaDeltaUpdater this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^Integer iteration ^Integer epoch]
    (-> this (.applyUpdater gradient iteration epoch))))

