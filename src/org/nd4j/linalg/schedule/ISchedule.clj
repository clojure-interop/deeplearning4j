(ns org.nd4j.linalg.schedule.ISchedule
  "ISchedule: a general purpose interface for getting values according to some schedule.
 Used for implementing learning rate, dropout and momentum schedules - and in principle, any univariate (double)
 value that deponds on the current iteration and epochs numbers.

 Note: ISchedule objects should not have mutable state - i.e., they should be safe to share between multiple
 locations/layers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.schedule ISchedule]))

(defn value-at
  "iteration - Current iteration number. Starts at 0 - `int`
  epoch - Current epoch number. Starts at 0 - `int`

  returns: Value at the current iteration/epoch for this schedule - `double`"
  (^Double [^ISchedule this ^Integer iteration ^Integer epoch]
    (-> this (.valueAt iteration epoch))))

(defn clone
  "returns: `org.nd4j.linalg.schedule.ISchedule`"
  (^org.nd4j.linalg.schedule.ISchedule [^ISchedule this]
    (-> this (.clone))))

