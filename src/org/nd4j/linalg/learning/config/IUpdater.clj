(ns org.nd4j.linalg.learning.config.IUpdater
  "IUpdater interface: used for configuration and instantiation of updaters - both built-in and custom.
 Note that the actual implementations for updaters are in GradientUpdater"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.learning.config IUpdater]))

(defn state-size
  "Determine the updater state size for the given number of parameters. Usually a integer multiple (0,1 or 2)
  times the number of parameters in a layer.

  num-params - Number of parameters - `long`

  returns: Updater state size for the given number of parameters - `long`"
  (^Long [^IUpdater this ^Long num-params]
    (-> this (.stateSize num-params))))

(defn instantiate
  "Create a new gradient updater

  view-array - The updater state size view away - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-view-array - If true: initialise the updater state - `boolean`

  returns: `org.nd4j.linalg.learning.GradientUpdater`"
  (^org.nd4j.linalg.learning.GradientUpdater [^IUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize-view-array]
    (-> this (.instantiate view-array initialize-view-array))))

(defn equals
  "updater - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IUpdater this ^java.lang.Object updater]
    (-> this (.equals updater))))

(defn clone
  "Clone the updater

  returns: `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^IUpdater this]
    (-> this (.clone))))

(defn get-learning-rate
  "Get the learning rate - if any - for the updater, at the specified iteration and epoch.
  Note that if no learning rate is applicable (AdaDelta, NoOp updaters etc) then Double.NaN should
  be return

  iteration - Iteration at which to get the learning rate - `int`
  epoch - Epoch at which to get the learning rate - `int`

  returns: Learning rate, or Double.NaN if no learning rate is applicable for this updater - `double`"
  (^Double [^IUpdater this ^Integer iteration ^Integer epoch]
    (-> this (.getLearningRate iteration epoch))))

(defn has-learning-rate?
  "returns: True if the updater has a learning rate hyperparameter, false otherwise - `boolean`"
  (^Boolean [^IUpdater this]
    (-> this (.hasLearningRate))))

(defn set-lr-and-schedule
  "Set the learning rate and schedule. Note: may throw an exception if hasLearningRate() returns false.

  lr - Learning rate to set (typically not used if LR schedule is non-null) - `double`
  lr-schedule - Learning rate schedule to set (may be null) - `org.nd4j.linalg.schedule.ISchedule`"
  ([^IUpdater this ^Double lr ^org.nd4j.linalg.schedule.ISchedule lr-schedule]
    (-> this (.setLrAndSchedule lr lr-schedule))))

