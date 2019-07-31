(ns org.deeplearning4j.arbiter.conf.updater.schedule.ExponentialScheduleSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.conf.updater.schedule ExponentialScheduleSpace]))

(defn ->exponential-schedule-space
  "Constructor.

  schedule-type - `org.nd4j.linalg.schedule.ScheduleType`
  initial-value - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  gamma - `double`"
  (^ExponentialScheduleSpace [^org.nd4j.linalg.schedule.ScheduleType schedule-type ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace initial-value ^Double gamma]
    (new ExponentialScheduleSpace schedule-type initial-value gamma)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.nd4j.linalg.schedule.ISchedule`"
  (^org.nd4j.linalg.schedule.ISchedule [^ExponentialScheduleSpace this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^ExponentialScheduleSpace this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^ExponentialScheduleSpace this]
    (-> this (.collectLeaves))))

(defn get-nested-spaces
  "Description copied from interface: ParameterSpace

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^ExponentialScheduleSpace this]
    (-> this (.getNestedSpaces))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^ExponentialScheduleSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^ExponentialScheduleSpace this ^Integer indices]
    (-> this (.setIndices indices))))

