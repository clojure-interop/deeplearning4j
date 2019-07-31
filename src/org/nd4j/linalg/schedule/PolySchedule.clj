(ns org.nd4j.linalg.schedule.PolySchedule
  "Polynomial decay schedule, with 3 parameters: initial value, maxIter, power.
 Note that the the value will be 0 after maxIter, otherwise is given by:
 value(i) = initialValue * (1  i/maxIter)^(-power)
 where i is the iteration or epoch (depending on the setting)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.schedule PolySchedule]))

(defn ->poly-schedule
  "Constructor.

  schedule-type - `org.nd4j.linalg.schedule.ScheduleType`
  initial-value - `double`
  power - `double`
  max-iter - `int`"
  (^PolySchedule [^org.nd4j.linalg.schedule.ScheduleType schedule-type ^Double initial-value ^Double power ^Integer max-iter]
    (new PolySchedule schedule-type initial-value power max-iter)))

(defn value-at
  "iteration - Current iteration number. Starts at 0 - `int`
  epoch - Current epoch number. Starts at 0 - `int`

  returns: Value at the current iteration/epoch for this schedule - `double`"
  (^Double [^PolySchedule this ^Integer iteration ^Integer epoch]
    (-> this (.valueAt iteration epoch))))

(defn clone
  "returns: `org.nd4j.linalg.schedule.PolySchedule`"
  (^org.nd4j.linalg.schedule.PolySchedule [^PolySchedule this]
    (-> this (.clone))))

