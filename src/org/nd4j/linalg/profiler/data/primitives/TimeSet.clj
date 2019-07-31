(ns org.nd4j.linalg.profiler.data.primitives.TimeSet
  "Utility holder class, used to store timing sets retrieved with profiler."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler.data.primitives TimeSet]))

(defn ->time-set
  "Constructor."
  (^TimeSet []
    (new TimeSet )))

(defn add-time
  "time - `long`"
  ([^TimeSet this ^Long time]
    (-> this (.addTime time))))

(defn get-sum
  "returns: `long`"
  (^Long [^TimeSet this]
    (-> this (.getSum))))

(defn get-average
  "returns: `long`"
  (^Long [^TimeSet this]
    (-> this (.getAverage))))

(defn get-median
  "returns: `long`"
  (^Long [^TimeSet this]
    (-> this (.getMedian))))

(defn get-minimum
  "returns: `long`"
  (^Long [^TimeSet this]
    (-> this (.getMinimum))))

(defn get-maximum
  "returns: `long`"
  (^Long [^TimeSet this]
    (-> this (.getMaximum))))

(defn size
  "returns: `int`"
  (^Integer [^TimeSet this]
    (-> this (.size))))

(defn compare-to
  "o - `org.nd4j.linalg.profiler.data.primitives.TimeSet`

  returns: `int`"
  (^Integer [^TimeSet this ^org.nd4j.linalg.profiler.data.primitives.TimeSet o]
    (-> this (.compareTo o))))

