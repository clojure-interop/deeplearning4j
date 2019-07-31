(ns org.deeplearning4j.spark.time.TimeSource
  "A time source is an abstraction of system time away from the local system clock.
 Typically it is used in distributed computing settings, to allow for different time implementations, such as NTP
 over the internet (via NTPTimeSource, local synchronization (LAN only - not implemented), or simply using the
 standard clock on each machine (System.currentTimeMillis() via SystemClockTimeSource."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.time TimeSource]))

(defn current-time-millis
  "Get the current time in milliseconds, according to this TimeSource

  returns: Current time, since epoch - `long`"
  (^Long [^TimeSource this]
    (-> this (.currentTimeMillis))))

