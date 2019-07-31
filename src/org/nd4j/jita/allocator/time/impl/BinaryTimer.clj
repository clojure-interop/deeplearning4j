(ns org.nd4j.jita.allocator.time.impl.BinaryTimer
  "This is simple implementation of DecayingTimer, it doesn't store any actual information for number of events happened.
 Just a fact: there were events, or there were no events"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.time.impl BinaryTimer]))

(defn ->binary-timer
  "Constructor.

  timeframe - `long`
  time-unit - `java.util.concurrent.TimeUnit`"
  (^BinaryTimer [^Long timeframe ^java.util.concurrent.TimeUnit time-unit]
    (new BinaryTimer timeframe time-unit)))

(defn trigger-event
  "This method notifies timer about event"
  ([^BinaryTimer this]
    (-> this (.triggerEvent))))

(defn get-frequency-of-events
  "This method returns average frequency of events happened within predefined timeframe

  returns: `double`"
  (^Double [^BinaryTimer this]
    (-> this (.getFrequencyOfEvents))))

(defn get-number-of-events
  "This method returns total number of events happened withing predefined timeframe

  returns: `long`"
  (^Long [^BinaryTimer this]
    (-> this (.getNumberOfEvents))))

