(ns org.tensorflow.framework.StepStatsOrBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.tensorflow.framework StepStatsOrBuilder]))

(defn get-dev-stats-list
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `java.util.List<org.tensorflow.framework.DeviceStepStats>`"
  (^java.util.List [^StepStatsOrBuilder this]
    (-> this (.getDevStatsList))))

(defn get-dev-stats
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`

  returns: `org.tensorflow.framework.DeviceStepStats`"
  (^org.tensorflow.framework.DeviceStepStats [^StepStatsOrBuilder this ^Integer index]
    (-> this (.getDevStats index))))

(defn get-dev-stats-count
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `int`"
  (^Integer [^StepStatsOrBuilder this]
    (-> this (.getDevStatsCount))))

(defn get-dev-stats-or-builder-list
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  returns: `java.util.List<? extends org.tensorflow.framework.DeviceStepStatsOrBuilder>`"
  ([^StepStatsOrBuilder this]
    (-> this (.getDevStatsOrBuilderList))))

(defn get-dev-stats-or-builder
  "repeated .tensorflow.DeviceStepStats dev_stats = 1;

  index - `int`

  returns: `org.tensorflow.framework.DeviceStepStatsOrBuilder`"
  (^org.tensorflow.framework.DeviceStepStatsOrBuilder [^StepStatsOrBuilder this ^Integer index]
    (-> this (.getDevStatsOrBuilder index))))

