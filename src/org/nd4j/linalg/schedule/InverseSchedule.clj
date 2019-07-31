(ns org.nd4j.linalg.schedule.InverseSchedule
  "Inverse schedule, with 3 parameters: initial value, gamma and power.
 value(i) = initialValue * (1  gamma * iter)^(-power)
 where i is the iteration or epoch (depending on the setting)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.schedule InverseSchedule]))

(defn ->inverse-schedule
  "Constructor.

  schedule-type - `org.nd4j.linalg.schedule.ScheduleType`
  initial-value - `double`
  gamma - `double`
  power - `double`"
  (^InverseSchedule [^org.nd4j.linalg.schedule.ScheduleType schedule-type ^Double initial-value ^Double gamma ^Double power]
    (new InverseSchedule schedule-type initial-value gamma power)))

(defn value-at
  "iteration - Current iteration number. Starts at 0 - `int`
  epoch - Current epoch number. Starts at 0 - `int`

  returns: Value at the current iteration/epoch for this schedule - `double`"
  (^Double [^InverseSchedule this ^Integer iteration ^Integer epoch]
    (-> this (.valueAt iteration epoch))))

(defn clone
  "returns: `org.nd4j.linalg.schedule.ISchedule`"
  (^org.nd4j.linalg.schedule.ISchedule [^InverseSchedule this]
    (-> this (.clone))))

