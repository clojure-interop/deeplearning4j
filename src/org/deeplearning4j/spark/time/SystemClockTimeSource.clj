(ns org.deeplearning4j.spark.time.SystemClockTimeSource
  "A TimeSource implementation that is identical to calling System.currentTimeMillis()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.time SystemClockTimeSource]))

(defn ->system-clock-time-source
  "Constructor."
  (^SystemClockTimeSource []
    (new SystemClockTimeSource )))

(defn *get-instance
  "returns: `org.deeplearning4j.spark.time.TimeSource`"
  (^org.deeplearning4j.spark.time.TimeSource []
    (SystemClockTimeSource/getInstance )))

(defn current-time-millis
  "Description copied from interface: TimeSource

  returns: Current time, since epoch - `long`"
  (^Long [^SystemClockTimeSource this]
    (-> this (.currentTimeMillis))))

