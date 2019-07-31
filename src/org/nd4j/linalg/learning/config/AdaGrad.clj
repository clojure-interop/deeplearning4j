(ns org.nd4j.linalg.learning.config.AdaGrad
  "Vectorized Learning Rate used per Connection Weight

 Adapted from: http://xcorr.net/2014/01/23/adagrad-eliminating-learning-rates-in-stochastic-gradient-descent/
 See also http://cs231n.github.io/neural-networks-3/#ada"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning.config AdaGrad]))

(defn ->ada-grad
  "Constructor.

  learning-rate - `double`
  epsilon - `double`"
  (^AdaGrad [^Double learning-rate ^Double epsilon]
    (new AdaGrad learning-rate epsilon))
  (^AdaGrad [^Double learning-rate]
    (new AdaGrad learning-rate))
  (^AdaGrad []
    (new AdaGrad )))

(def *-default-adagrad-learning-rate
  "Static Constant.

  type: double"
  AdaGrad/DEFAULT_ADAGRAD_LEARNING_RATE)

(def *-default-adagrad-epsilon
  "Static Constant.

  type: double"
  AdaGrad/DEFAULT_ADAGRAD_EPSILON)

(defn state-size
  "Description copied from interface: IUpdater

  num-params - Number of parameters - `long`

  returns: Updater state size for the given number of parameters - `long`"
  (^Long [^AdaGrad this ^Long num-params]
    (-> this (.stateSize num-params))))

(defn instantiate
  "Description copied from interface: IUpdater

  view-array - The updater state size view away - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-view-array - If true: initialise the updater state - `boolean`

  returns: `org.nd4j.linalg.learning.GradientUpdater`"
  (^org.nd4j.linalg.learning.GradientUpdater [^AdaGrad this ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize-view-array]
    (-> this (.instantiate view-array initialize-view-array))))

(defn clone
  "Description copied from interface: IUpdater

  returns: `org.nd4j.linalg.learning.config.AdaGrad`"
  (^org.nd4j.linalg.learning.config.AdaGrad [^AdaGrad this]
    (-> this (.clone))))

(defn get-learning-rate
  "Description copied from interface: IUpdater

  iteration - Iteration at which to get the learning rate - `int`
  epoch - Epoch at which to get the learning rate - `int`

  returns: Learning rate, or Double.NaN if no learning rate is applicable for this updater - `double`"
  (^Double [^AdaGrad this ^Integer iteration ^Integer epoch]
    (-> this (.getLearningRate iteration epoch))))

(defn has-learning-rate?
  "returns: True if the updater has a learning rate hyperparameter, false otherwise - `boolean`"
  (^Boolean [^AdaGrad this]
    (-> this (.hasLearningRate))))

(defn set-lr-and-schedule
  "Description copied from interface: IUpdater

  lr - Learning rate to set (typically not used if LR schedule is non-null) - `double`
  lr-schedule - Learning rate schedule to set (may be null) - `org.nd4j.linalg.schedule.ISchedule`"
  ([^AdaGrad this ^Double lr ^org.nd4j.linalg.schedule.ISchedule lr-schedule]
    (-> this (.setLrAndSchedule lr lr-schedule))))

