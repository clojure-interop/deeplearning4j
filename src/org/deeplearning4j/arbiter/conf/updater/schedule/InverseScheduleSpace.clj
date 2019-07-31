(ns org.deeplearning4j.arbiter.conf.updater.schedule.InverseScheduleSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.conf.updater.schedule InverseScheduleSpace]))

(defn ->inverse-schedule-space
  "Constructor.

  schedule-type - `org.nd4j.linalg.schedule.ScheduleType`
  initial-value - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  gamma - `double`
  power - `double`"
  (^InverseScheduleSpace [^org.nd4j.linalg.schedule.ScheduleType schedule-type ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace initial-value ^Double gamma ^Double power]
    (new InverseScheduleSpace schedule-type initial-value gamma power)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.nd4j.linalg.schedule.ISchedule`"
  (^org.nd4j.linalg.schedule.ISchedule [^InverseScheduleSpace this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^InverseScheduleSpace this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^InverseScheduleSpace this]
    (-> this (.collectLeaves))))

(defn get-nested-spaces
  "Description copied from interface: ParameterSpace

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^InverseScheduleSpace this]
    (-> this (.getNestedSpaces))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^InverseScheduleSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^InverseScheduleSpace this ^Integer indices]
    (-> this (.setIndices indices))))

