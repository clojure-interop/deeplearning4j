(ns org.nd4j.linalg.learning.config.Nesterovs
  "Nesterov's momentum.
 Keep track of the previous layer's gradient
 and use it as a way of updating the gradient."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning.config Nesterovs]))

(defn ->nesterovs
  "Constructor.

  learning-rate - `double`
  momentum - `double`"
  (^Nesterovs [^Double learning-rate ^Double momentum]
    (new Nesterovs learning-rate momentum))
  (^Nesterovs [^Double momentum]
    (new Nesterovs momentum))
  (^Nesterovs []
    (new Nesterovs )))

(def *-default-nesterov-momentum
  "Static Constant.

  type: double"
  Nesterovs/DEFAULT_NESTEROV_MOMENTUM)

(def *-default-nesterov-learning-rate
  "Static Constant.

  type: double"
  Nesterovs/DEFAULT_NESTEROV_LEARNING_RATE)

(defn state-size
  "Description copied from interface: IUpdater

  num-params - Number of parameters - `long`

  returns: Updater state size for the given number of parameters - `long`"
  (^Long [^Nesterovs this ^Long num-params]
    (-> this (.stateSize num-params))))

(defn instantiate
  "Description copied from interface: IUpdater

  view-array - The updater state size view away - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-view-array - If true: initialise the updater state - `boolean`

  returns: `org.nd4j.linalg.learning.GradientUpdater`"
  (^org.nd4j.linalg.learning.GradientUpdater [^Nesterovs this ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize-view-array]
    (-> this (.instantiate view-array initialize-view-array))))

(defn clone
  "Description copied from interface: IUpdater

  returns: `org.nd4j.linalg.learning.config.Nesterovs`"
  (^org.nd4j.linalg.learning.config.Nesterovs [^Nesterovs this]
    (-> this (.clone))))

(defn get-learning-rate
  "Description copied from interface: IUpdater

  iteration - Iteration at which to get the learning rate - `int`
  epoch - Epoch at which to get the learning rate - `int`

  returns: Learning rate, or Double.NaN if no learning rate is applicable for this updater - `double`"
  (^Double [^Nesterovs this ^Integer iteration ^Integer epoch]
    (-> this (.getLearningRate iteration epoch))))

(defn has-learning-rate?
  "returns: True if the updater has a learning rate hyperparameter, false otherwise - `boolean`"
  (^Boolean [^Nesterovs this]
    (-> this (.hasLearningRate))))

(defn set-lr-and-schedule
  "Description copied from interface: IUpdater

  lr - Learning rate to set (typically not used if LR schedule is non-null) - `double`
  lr-schedule - Learning rate schedule to set (may be null) - `org.nd4j.linalg.schedule.ISchedule`"
  ([^Nesterovs this ^Double lr ^org.nd4j.linalg.schedule.ISchedule lr-schedule]
    (-> this (.setLrAndSchedule lr lr-schedule))))

(defn current-momentum
  "iteration - `int`
  epoch - `int`

  returns: `double`"
  (^Double [^Nesterovs this ^Integer iteration ^Integer epoch]
    (-> this (.currentMomentum iteration epoch))))

