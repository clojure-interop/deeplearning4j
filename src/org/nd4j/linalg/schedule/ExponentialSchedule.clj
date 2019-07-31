(ns org.nd4j.linalg.schedule.ExponentialSchedule
  "An exponential schedule, with 2 parameters: initial value, and gamma.
 value(i) = initialValue * gamma^i
 where i is the iteration or epoch (depending on the setting)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.schedule ExponentialSchedule]))

(defn ->exponential-schedule
  "Constructor.

  schedule-type - `org.nd4j.linalg.schedule.ScheduleType`
  initial-value - `double`
  gamma - `double`"
  (^ExponentialSchedule [^org.nd4j.linalg.schedule.ScheduleType schedule-type ^Double initial-value ^Double gamma]
    (new ExponentialSchedule schedule-type initial-value gamma)))

(defn value-at
  "iteration - Current iteration number. Starts at 0 - `int`
  epoch - Current epoch number. Starts at 0 - `int`

  returns: Value at the current iteration/epoch for this schedule - `double`"
  (^Double [^ExponentialSchedule this ^Integer iteration ^Integer epoch]
    (-> this (.valueAt iteration epoch))))

(defn clone
  "returns: `org.nd4j.linalg.schedule.ISchedule`"
  (^org.nd4j.linalg.schedule.ISchedule [^ExponentialSchedule this]
    (-> this (.clone))))

