(ns org.nd4j.linalg.learning.config.AdaDelta
  "http://www.matthewzeiler.com/pubs/googleTR2012/googleTR2012.pdf
 https://arxiv.org/pdf/1212.5701v1.pdf

 Ada delta updater. More robust adagrad that keeps track of a moving window
 average of the gradient rather than the every decaying learning rates of adagrad

 Note: AdaDelta is unique in that it doesn't require manual setting of a learning rate"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning.config AdaDelta]))

(defn ->ada-delta
  "Constructor."
  (^AdaDelta []
    (new AdaDelta )))

(def *-default-adadelta-rho
  "Static Constant.

  type: double"
  AdaDelta/DEFAULT_ADADELTA_RHO)

(def *-default-adadelta-epsilon
  "Static Constant.

  type: double"
  AdaDelta/DEFAULT_ADADELTA_EPSILON)

(defn state-size
  "Description copied from interface: IUpdater

  num-params - Number of parameters - `long`

  returns: Updater state size for the given number of parameters - `long`"
  (^Long [^AdaDelta this ^Long num-params]
    (-> this (.stateSize num-params))))

(defn instantiate
  "Description copied from interface: IUpdater

  view-array - The updater state size view away - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-view-array - If true: initialise the updater state - `boolean`

  returns: `org.nd4j.linalg.learning.GradientUpdater`"
  (^org.nd4j.linalg.learning.GradientUpdater [^AdaDelta this ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize-view-array]
    (-> this (.instantiate view-array initialize-view-array))))

(defn clone
  "Description copied from interface: IUpdater

  returns: `org.nd4j.linalg.learning.config.AdaDelta`"
  (^org.nd4j.linalg.learning.config.AdaDelta [^AdaDelta this]
    (-> this (.clone))))

(defn get-learning-rate
  "Description copied from interface: IUpdater

  iteration - Iteration at which to get the learning rate - `int`
  epoch - Epoch at which to get the learning rate - `int`

  returns: Learning rate, or Double.NaN if no learning rate is applicable for this updater - `double`"
  (^Double [^AdaDelta this ^Integer iteration ^Integer epoch]
    (-> this (.getLearningRate iteration epoch))))

(defn has-learning-rate?
  "returns: True if the updater has a learning rate hyperparameter, false otherwise - `boolean`"
  (^Boolean [^AdaDelta this]
    (-> this (.hasLearningRate))))

(defn set-lr-and-schedule
  "Description copied from interface: IUpdater

  lr - Learning rate to set (typically not used if LR schedule is non-null) - `double`
  lr-schedule - Learning rate schedule to set (may be null) - `org.nd4j.linalg.schedule.ISchedule`"
  ([^AdaDelta this ^Double lr ^org.nd4j.linalg.schedule.ISchedule lr-schedule]
    (-> this (.setLrAndSchedule lr lr-schedule))))

