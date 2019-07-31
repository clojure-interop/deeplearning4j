(ns org.nd4j.linalg.learning.config.AdaMax
  "The AdaMax updater, a variant of Adam.
 http://arxiv.org/abs/1412.6980"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning.config AdaMax]))

(defn ->ada-max
  "Constructor.

  learning-rate - `double`
  beta-1 - `double`
  beta-2 - `double`
  epsilon - `double`"
  (^AdaMax [^Double learning-rate ^Double beta-1 ^Double beta-2 ^Double epsilon]
    (new AdaMax learning-rate beta-1 beta-2 epsilon))
  (^AdaMax [^Double learning-rate]
    (new AdaMax learning-rate))
  (^AdaMax []
    (new AdaMax )))

(def *-default-adamax-learning-rate
  "Static Constant.

  type: double"
  AdaMax/DEFAULT_ADAMAX_LEARNING_RATE)

(def *-default-adamax-epsilon
  "Static Constant.

  type: double"
  AdaMax/DEFAULT_ADAMAX_EPSILON)

(def *-default-adamax-beta-1-mean-decay
  "Static Constant.

  type: double"
  AdaMax/DEFAULT_ADAMAX_BETA1_MEAN_DECAY)

(def *-default-adamax-beta-2-var-decay
  "Static Constant.

  type: double"
  AdaMax/DEFAULT_ADAMAX_BETA2_VAR_DECAY)

(defn state-size
  "Description copied from interface: IUpdater

  num-params - Number of parameters - `long`

  returns: Updater state size for the given number of parameters - `long`"
  (^Long [^AdaMax this ^Long num-params]
    (-> this (.stateSize num-params))))

(defn instantiate
  "Description copied from interface: IUpdater

  view-array - The updater state size view away - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-view-array - If true: initialise the updater state - `boolean`

  returns: `org.nd4j.linalg.learning.GradientUpdater`"
  (^org.nd4j.linalg.learning.GradientUpdater [^AdaMax this ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize-view-array]
    (-> this (.instantiate view-array initialize-view-array))))

(defn clone
  "Description copied from interface: IUpdater

  returns: `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^AdaMax this]
    (-> this (.clone))))

(defn get-learning-rate
  "Description copied from interface: IUpdater

  iteration - Iteration at which to get the learning rate - `int`
  epoch - Epoch at which to get the learning rate - `int`

  returns: Learning rate, or Double.NaN if no learning rate is applicable for this updater - `double`"
  (^Double [^AdaMax this ^Integer iteration ^Integer epoch]
    (-> this (.getLearningRate iteration epoch))))

(defn has-learning-rate?
  "returns: True if the updater has a learning rate hyperparameter, false otherwise - `boolean`"
  (^Boolean [^AdaMax this]
    (-> this (.hasLearningRate))))

(defn set-lr-and-schedule
  "Description copied from interface: IUpdater

  lr - Learning rate to set (typically not used if LR schedule is non-null) - `double`
  lr-schedule - Learning rate schedule to set (may be null) - `org.nd4j.linalg.schedule.ISchedule`"
  ([^AdaMax this ^Double lr ^org.nd4j.linalg.schedule.ISchedule lr-schedule]
    (-> this (.setLrAndSchedule lr lr-schedule))))

