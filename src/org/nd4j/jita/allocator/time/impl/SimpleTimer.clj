(ns org.nd4j.jita.allocator.time.impl.SimpleTimer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.time.impl SimpleTimer]))

(defn ->simple-timer
  "Constructor.

  timeframe - `long`
  time-unit - `java.util.concurrent.TimeUnit`"
  (^SimpleTimer [^Long timeframe ^java.util.concurrent.TimeUnit time-unit]
    (new SimpleTimer timeframe time-unit)))

(defn trigger-event
  "This method notifies timer about event"
  ([^SimpleTimer this]
    (-> this (.triggerEvent))))

(defn get-frequency-of-events
  "This method returns average frequency of events happened within predefined timeframe

  returns: `double`"
  (^Double [^SimpleTimer this]
    (-> this (.getFrequencyOfEvents))))

(defn get-number-of-events
  "This method returns total number of events happened withing predefined timeframe

  returns: `long`"
  (^Long [^SimpleTimer this]
    (-> this (.getNumberOfEvents))))

