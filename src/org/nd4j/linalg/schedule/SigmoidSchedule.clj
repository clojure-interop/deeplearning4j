(ns org.nd4j.linalg.schedule.SigmoidSchedule
  "Sigmoid decay schedule, with 3 parameters: initial value, gamma and stepSize.
 value(i) = initialValue * 1.0 / (1  exp(-gamma * (iter - stepSize)))
 where i is the iteration or epoch (depending on the setting)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.schedule SigmoidSchedule]))

(defn ->sigmoid-schedule
  "Constructor.

  schedule-type - `org.nd4j.linalg.schedule.ScheduleType`
  initial-value - `double`
  gamma - `double`
  step-size - `int`"
  (^SigmoidSchedule [^org.nd4j.linalg.schedule.ScheduleType schedule-type ^Double initial-value ^Double gamma ^Integer step-size]
    (new SigmoidSchedule schedule-type initial-value gamma step-size)))

(defn value-at
  "iteration - Current iteration number. Starts at 0 - `int`
  epoch - Current epoch number. Starts at 0 - `int`

  returns: Value at the current iteration/epoch for this schedule - `double`"
  (^Double [^SigmoidSchedule this ^Integer iteration ^Integer epoch]
    (-> this (.valueAt iteration epoch))))

(defn clone
  "returns: `org.nd4j.linalg.schedule.ISchedule`"
  (^org.nd4j.linalg.schedule.ISchedule [^SigmoidSchedule this]
    (-> this (.clone))))

