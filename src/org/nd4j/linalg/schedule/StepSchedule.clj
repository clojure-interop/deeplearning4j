(ns org.nd4j.linalg.schedule.StepSchedule
  "Step decay schedule, with 3 parameters: initial value, gamma and step.
 value(i) = initialValue * gamma^( floor(iter/step) )
 where i is the iteration or epoch (depending on the setting)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.schedule StepSchedule]))

(defn ->step-schedule
  "Constructor.

  schedule-type - `org.nd4j.linalg.schedule.ScheduleType`
  initial-value - `double`
  decay-rate - `double`
  step - `double`"
  (^StepSchedule [^org.nd4j.linalg.schedule.ScheduleType schedule-type ^Double initial-value ^Double decay-rate ^Double step]
    (new StepSchedule schedule-type initial-value decay-rate step)))

(defn value-at
  "iteration - Current iteration number. Starts at 0 - `int`
  epoch - Current epoch number. Starts at 0 - `int`

  returns: Value at the current iteration/epoch for this schedule - `double`"
  (^Double [^StepSchedule this ^Integer iteration ^Integer epoch]
    (-> this (.valueAt iteration epoch))))

(defn clone
  "returns: `org.nd4j.linalg.schedule.ISchedule`"
  (^org.nd4j.linalg.schedule.ISchedule [^StepSchedule this]
    (-> this (.clone))))

