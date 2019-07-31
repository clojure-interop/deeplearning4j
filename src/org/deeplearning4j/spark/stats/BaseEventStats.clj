(ns org.deeplearning4j.spark.stats.BaseEventStats
  "Created by Alex on 26/06/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.stats BaseEventStats]))

(defn ->base-event-stats
  "Constructor.

  machine-id - `java.lang.String`
  jvm-id - `java.lang.String`
  thread-id - `long`
  start-time - `long`
  duration-ms - `long`"
  (^BaseEventStats [^java.lang.String machine-id ^java.lang.String jvm-id ^Long thread-id ^Long start-time ^Long duration-ms]
    (new BaseEventStats machine-id jvm-id thread-id start-time duration-ms))
  (^BaseEventStats [^Long start-time ^Long duration-ms]
    (new BaseEventStats start-time duration-ms)))

(defn get-machine-id
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseEventStats this]
    (-> this (.getMachineID))))

(defn get-jvm-id
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseEventStats this]
    (-> this (.getJvmID))))

(defn get-thread-id
  "returns: `long`"
  (^Long [^BaseEventStats this]
    (-> this (.getThreadID))))

(defn get-start-time
  "returns: `long`"
  (^Long [^BaseEventStats this]
    (-> this (.getStartTime))))

(defn get-duration-ms
  "returns: `long`"
  (^Long [^BaseEventStats this]
    (-> this (.getDurationMs))))

(defn as-string
  "Description copied from interface: EventStats

  delimiter - Delimiter to use for the data - `java.lang.String`

  returns: String representation of the EventStats object - `java.lang.String`"
  (^java.lang.String [^BaseEventStats this ^java.lang.String delimiter]
    (-> this (.asString delimiter))))

(defn get-string-header
  "Description copied from interface: EventStats

  delimiter - Delimiter to use for the header - `java.lang.String`

  returns: Header line - `java.lang.String`"
  (^java.lang.String [^BaseEventStats this ^java.lang.String delimiter]
    (-> this (.getStringHeader delimiter))))

