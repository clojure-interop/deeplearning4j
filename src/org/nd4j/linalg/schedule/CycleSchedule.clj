(ns org.nd4j.linalg.schedule.CycleSchedule
  "Cycle schedule
 Based on 1cycle schedule as proposed in https://arxiv.org/abs/1803.09820
 Starts at initial learning rate, then linearly increases learning rate until max learning rate is reached,
 at that point the learning rate is decreased back to initial learning rate.
 When cycleLength - annealingLength is reached, the annealing period starts, and the learning rate starts decaying
 below the initial learning rate.
 The Learning rate curve Looks something like this:
 +-----------------------------------------+
 | XX |
 | XX XX |
 | XX XX |
 | XX XX |
 | XX XX |
 | XX XX |
 | XX XX |
 | XX XX |
 | XX XX |
 | XX XX |
 | XX XX |
 | XX XX |
 | XX XX |
 | XX XXX |
 | XXX |
 | XXX |
 | |
 +-----------------------------------------+"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.schedule CycleSchedule]))

(defn ->cycle-schedule
  "Constructor.

  schedule-type - `org.nd4j.linalg.schedule.ScheduleType`
  initial-learning-rate - `double`
  max-learning-rate - `double`
  cycle-length - `int`
  annealing-length - `int`
  annealing-decay - `double`"
  (^CycleSchedule [^org.nd4j.linalg.schedule.ScheduleType schedule-type ^Double initial-learning-rate ^Double max-learning-rate ^Integer cycle-length ^Integer annealing-length ^Double annealing-decay]
    (new CycleSchedule schedule-type initial-learning-rate max-learning-rate cycle-length annealing-length annealing-decay))
  (^CycleSchedule [^org.nd4j.linalg.schedule.ScheduleType schedule-type ^Double max-learning-rate ^Integer cycle-length]
    (new CycleSchedule schedule-type max-learning-rate cycle-length)))

(defn value-at
  "iteration - Current iteration number. Starts at 0 - `int`
  epoch - Current epoch number. Starts at 0 - `int`

  returns: Value at the current iteration/epoch for this schedule - `double`"
  (^Double [^CycleSchedule this ^Integer iteration ^Integer epoch]
    (-> this (.valueAt iteration epoch))))

(defn clone
  "returns: `org.nd4j.linalg.schedule.ISchedule`"
  (^org.nd4j.linalg.schedule.ISchedule [^CycleSchedule this]
    (-> this (.clone))))

