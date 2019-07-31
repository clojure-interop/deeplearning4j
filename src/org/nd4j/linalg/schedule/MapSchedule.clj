(ns org.nd4j.linalg.schedule.MapSchedule
  "MapSchedule is a schedule based on specific values in a Map<Integer,Double>.
 For example, if the map contains the following: (0,1.0), (10,0.5), (20, 0.2) then iteration/epoch 0 to 9 inclusive
 will have value 1.0, 10 to 19 will have 0.5, and 20+ will have value 0.2.
 Note that the map MUST have a key for position 0 - this is the initial value."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.schedule MapSchedule]))

(defn ->map-schedule
  "Constructor.

  schedule-type - `org.nd4j.linalg.schedule.ScheduleType`
  values - `java.util.Map`"
  (^MapSchedule [^org.nd4j.linalg.schedule.ScheduleType schedule-type ^java.util.Map values]
    (new MapSchedule schedule-type values)))

(defn value-at
  "iteration - Current iteration number. Starts at 0 - `int`
  epoch - Current epoch number. Starts at 0 - `int`

  returns: Value at the current iteration/epoch for this schedule - `double`"
  (^Double [^MapSchedule this ^Integer iteration ^Integer epoch]
    (-> this (.valueAt iteration epoch))))

(defn clone
  "returns: `org.nd4j.linalg.schedule.ISchedule`"
  (^org.nd4j.linalg.schedule.ISchedule [^MapSchedule this]
    (-> this (.clone))))

