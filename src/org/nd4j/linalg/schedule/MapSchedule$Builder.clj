(ns org.nd4j.linalg.schedule.MapSchedule$Builder
  "DynamicCustomOpsBuilder for conveniently constructing map schedules"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.schedule MapSchedule$Builder]))

(defn ->builder
  "Constructor.

  schedule-type - Schedule opType to use - `org.nd4j.linalg.schedule.ScheduleType`"
  (^MapSchedule$Builder [^org.nd4j.linalg.schedule.ScheduleType schedule-type]
    (new MapSchedule$Builder schedule-type)))

(defn add
  "Add a single point to the map schedule. Indexes start at 0

  position - Position to add (iteration or epoch index, depending on setting) - `int`
  value - Value for that iteraiton/epoch - `double`

  returns: `org.nd4j.linalg.schedule.MapSchedule$Builder`"
  (^org.nd4j.linalg.schedule.MapSchedule$Builder [^MapSchedule$Builder this ^Integer position ^Double value]
    (-> this (.add position value))))

(defn build
  "returns: `org.nd4j.linalg.schedule.MapSchedule`"
  (^org.nd4j.linalg.schedule.MapSchedule [^MapSchedule$Builder this]
    (-> this (.build))))

