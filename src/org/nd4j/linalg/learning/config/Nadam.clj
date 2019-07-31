(ns org.nd4j.linalg.learning.config.Nadam
  "Setup and DynamicCustomOpsBuilder for Nadam updater.
 https://arxiv.org/pdf/1609.04747.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning.config Nadam]))

(defn ->nadam
  "Constructor.

  learning-rate - `double`
  beta-1 - `double`
  beta-2 - `double`
  epsilon - `double`"
  (^Nadam [^Double learning-rate ^Double beta-1 ^Double beta-2 ^Double epsilon]
    (new Nadam learning-rate beta-1 beta-2 epsilon))
  (^Nadam [^Double learning-rate]
    (new Nadam learning-rate))
  (^Nadam []
    (new Nadam )))

(def *-default-nadam-learning-rate
  "Static Constant.

  type: double"
  Nadam/DEFAULT_NADAM_LEARNING_RATE)

(def *-default-nadam-epsilon
  "Static Constant.

  type: double"
  Nadam/DEFAULT_NADAM_EPSILON)

(def *-default-nadam-beta-1-mean-decay
  "Static Constant.

  type: double"
  Nadam/DEFAULT_NADAM_BETA1_MEAN_DECAY)

(def *-default-nadam-beta-2-var-decay
  "Static Constant.

  type: double"
  Nadam/DEFAULT_NADAM_BETA2_VAR_DECAY)

(defn state-size
  "Description copied from interface: IUpdater

  num-params - Number of parameters - `long`

  returns: Updater state size for the given number of parameters - `long`"
  (^Long [^Nadam this ^Long num-params]
    (-> this (.stateSize num-params))))

(defn instantiate
  "Description copied from interface: IUpdater

  view-array - The updater state size view away - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-view-array - If true: initialise the updater state - `boolean`

  returns: `org.nd4j.linalg.learning.GradientUpdater`"
  (^org.nd4j.linalg.learning.GradientUpdater [^Nadam this ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize-view-array]
    (-> this (.instantiate view-array initialize-view-array))))

(defn clone
  "Description copied from interface: IUpdater

  returns: `org.nd4j.linalg.learning.config.Nadam`"
  (^org.nd4j.linalg.learning.config.Nadam [^Nadam this]
    (-> this (.clone))))

(defn get-learning-rate
  "Description copied from interface: IUpdater

  iteration - Iteration at which to get the learning rate - `int`
  epoch - Epoch at which to get the learning rate - `int`

  returns: Learning rate, or Double.NaN if no learning rate is applicable for this updater - `double`"
  (^Double [^Nadam this ^Integer iteration ^Integer epoch]
    (-> this (.getLearningRate iteration epoch))))

(defn has-learning-rate?
  "returns: True if the updater has a learning rate hyperparameter, false otherwise - `boolean`"
  (^Boolean [^Nadam this]
    (-> this (.hasLearningRate))))

(defn set-lr-and-schedule
  "Description copied from interface: IUpdater

  lr - Learning rate to set (typically not used if LR schedule is non-null) - `double`
  lr-schedule - Learning rate schedule to set (may be null) - `org.nd4j.linalg.schedule.ISchedule`"
  ([^Nadam this ^Double lr ^org.nd4j.linalg.schedule.ISchedule lr-schedule]
    (-> this (.setLrAndSchedule lr lr-schedule))))

