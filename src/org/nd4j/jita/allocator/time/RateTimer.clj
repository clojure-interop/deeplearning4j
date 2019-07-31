(ns org.nd4j.jita.allocator.time.RateTimer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.time RateTimer]))

(defn trigger-event
  "This method notifies timer about event"
  ([^RateTimer this]
    (-> this (.triggerEvent))))

(defn get-frequency-of-events
  "This method returns average frequency of events happened within predefined timeframe

  returns: `double`"
  (^Double [^RateTimer this]
    (-> this (.getFrequencyOfEvents))))

(defn get-number-of-events
  "This method returns total number of events happened withing predefined timeframe

  returns: `long`"
  (^Long [^RateTimer this]
    (-> this (.getNumberOfEvents))))

