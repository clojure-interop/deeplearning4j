(ns org.nd4j.linalg.learning.config.Sgd
  "SGD updater applies a learning rate only"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning.config Sgd]))

(defn ->sgd
  "Constructor.

  learning-rate - `double`"
  (^Sgd [^Double learning-rate]
    (new Sgd learning-rate))
  (^Sgd []
    (new Sgd )))

(def *-default-sgd-lr
  "Static Constant.

  type: double"
  Sgd/DEFAULT_SGD_LR)

(defn state-size
  "Description copied from interface: IUpdater

  num-params - Number of parameters - `long`

  returns: Updater state size for the given number of parameters - `long`"
  (^Long [^Sgd this ^Long num-params]
    (-> this (.stateSize num-params))))

(defn instantiate
  "Description copied from interface: IUpdater

  view-array - The updater state size view away - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-view-array - If true: initialise the updater state - `boolean`

  returns: `org.nd4j.linalg.learning.GradientUpdater`"
  (^org.nd4j.linalg.learning.GradientUpdater [^Sgd this ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize-view-array]
    (-> this (.instantiate view-array initialize-view-array))))

(defn clone
  "Description copied from interface: IUpdater

  returns: `org.nd4j.linalg.learning.config.Sgd`"
  (^org.nd4j.linalg.learning.config.Sgd [^Sgd this]
    (-> this (.clone))))

(defn get-learning-rate
  "Description copied from interface: IUpdater

  iteration - Iteration at which to get the learning rate - `int`
  epoch - Epoch at which to get the learning rate - `int`

  returns: Learning rate, or Double.NaN if no learning rate is applicable for this updater - `double`"
  (^Double [^Sgd this ^Integer iteration ^Integer epoch]
    (-> this (.getLearningRate iteration epoch))))

(defn has-learning-rate?
  "returns: True if the updater has a learning rate hyperparameter, false otherwise - `boolean`"
  (^Boolean [^Sgd this]
    (-> this (.hasLearningRate))))

(defn set-lr-and-schedule
  "Description copied from interface: IUpdater

  lr - Learning rate to set (typically not used if LR schedule is non-null) - `double`
  lr-schedule - Learning rate schedule to set (may be null) - `org.nd4j.linalg.schedule.ISchedule`"
  ([^Sgd this ^Double lr ^org.nd4j.linalg.schedule.ISchedule lr-schedule]
    (-> this (.setLrAndSchedule lr lr-schedule))))

