(ns org.nd4j.linalg.learning.config.RmsProp
  "RMS Prop updates:

 http://www.cs.toronto.edu/~tijmen/csc321/slides/lecture_slides_lec6.pdf
 http://cs231n.github.io/neural-networks-3/#ada"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning.config RmsProp]))

(defn ->rms-prop
  "Constructor.

  learning-rate - `double`
  rms-decay - `double`
  epsilon - `double`"
  (^RmsProp [^Double learning-rate ^Double rms-decay ^Double epsilon]
    (new RmsProp learning-rate rms-decay epsilon))
  (^RmsProp [^Double learning-rate]
    (new RmsProp learning-rate))
  (^RmsProp []
    (new RmsProp )))

(def *-default-rmsprop-learning-rate
  "Static Constant.

  type: double"
  RmsProp/DEFAULT_RMSPROP_LEARNING_RATE)

(def *-default-rmsprop-epsilon
  "Static Constant.

  type: double"
  RmsProp/DEFAULT_RMSPROP_EPSILON)

(def *-default-rmsprop-rmsdecay
  "Static Constant.

  type: double"
  RmsProp/DEFAULT_RMSPROP_RMSDECAY)

(defn state-size
  "Description copied from interface: IUpdater

  num-params - Number of parameters - `long`

  returns: Updater state size for the given number of parameters - `long`"
  (^Long [^RmsProp this ^Long num-params]
    (-> this (.stateSize num-params))))

(defn instantiate
  "Description copied from interface: IUpdater

  view-array - The updater state size view away - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-view-array - If true: initialise the updater state - `boolean`

  returns: `org.nd4j.linalg.learning.GradientUpdater`"
  (^org.nd4j.linalg.learning.GradientUpdater [^RmsProp this ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize-view-array]
    (-> this (.instantiate view-array initialize-view-array))))

(defn clone
  "Description copied from interface: IUpdater

  returns: `org.nd4j.linalg.learning.config.RmsProp`"
  (^org.nd4j.linalg.learning.config.RmsProp [^RmsProp this]
    (-> this (.clone))))

(defn get-learning-rate
  "Description copied from interface: IUpdater

  iteration - Iteration at which to get the learning rate - `int`
  epoch - Epoch at which to get the learning rate - `int`

  returns: Learning rate, or Double.NaN if no learning rate is applicable for this updater - `double`"
  (^Double [^RmsProp this ^Integer iteration ^Integer epoch]
    (-> this (.getLearningRate iteration epoch))))

(defn has-learning-rate?
  "returns: True if the updater has a learning rate hyperparameter, false otherwise - `boolean`"
  (^Boolean [^RmsProp this]
    (-> this (.hasLearningRate))))

(defn set-lr-and-schedule
  "Description copied from interface: IUpdater

  lr - Learning rate to set (typically not used if LR schedule is non-null) - `double`
  lr-schedule - Learning rate schedule to set (may be null) - `org.nd4j.linalg.schedule.ISchedule`"
  ([^RmsProp this ^Double lr ^org.nd4j.linalg.schedule.ISchedule lr-schedule]
    (-> this (.setLrAndSchedule lr lr-schedule))))

