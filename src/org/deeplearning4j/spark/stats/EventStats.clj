(ns org.deeplearning4j.spark.stats.EventStats
  "Created by Alex on 26/06/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.stats EventStats]))

(defn get-machine-id
  "returns: `java.lang.String`"
  (^java.lang.String [^EventStats this]
    (-> this (.getMachineID))))

(defn get-jvm-id
  "returns: `java.lang.String`"
  (^java.lang.String [^EventStats this]
    (-> this (.getJvmID))))

(defn get-thread-id
  "returns: `long`"
  (^Long [^EventStats this]
    (-> this (.getThreadID))))

(defn get-start-time
  "returns: `long`"
  (^Long [^EventStats this]
    (-> this (.getStartTime))))

(defn get-duration-ms
  "returns: `long`"
  (^Long [^EventStats this]
    (-> this (.getDurationMs))))

(defn as-string
  "Get a String representation of the EventStats. This should be a single line delimited representation, suitable
  for exporting (such as CSV). Should not contain a new-line character at the end of each line

  delimiter - Delimiter to use for the data - `java.lang.String`

  returns: String representation of the EventStats object - `java.lang.String`"
  (^java.lang.String [^EventStats this ^java.lang.String delimiter]
    (-> this (.asString delimiter))))

(defn get-string-header
  "Get a header line for exporting the EventStats object, for use with asString(String)

  delimiter - Delimiter to use for the header - `java.lang.String`

  returns: Header line - `java.lang.String`"
  (^java.lang.String [^EventStats this ^java.lang.String delimiter]
    (-> this (.getStringHeader delimiter))))

