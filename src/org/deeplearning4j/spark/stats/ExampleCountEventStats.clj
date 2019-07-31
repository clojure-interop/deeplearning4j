(ns org.deeplearning4j.spark.stats.ExampleCountEventStats
  "Event stats implementation with number of examples"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.stats ExampleCountEventStats]))

(defn ->example-count-event-stats
  "Constructor.

  machine-id - `java.lang.String`
  jvm-id - `java.lang.String`
  thread-id - `long`
  start-time - `long`
  duration-ms - `long`
  total-example-count - `int`"
  (^ExampleCountEventStats [^java.lang.String machine-id ^java.lang.String jvm-id ^Long thread-id ^Long start-time ^Long duration-ms ^Integer total-example-count]
    (new ExampleCountEventStats machine-id jvm-id thread-id start-time duration-ms total-example-count))
  (^ExampleCountEventStats [^Long start-time ^Long duration-ms ^Integer total-example-count]
    (new ExampleCountEventStats start-time duration-ms total-example-count)))

(defn as-string
  "Description copied from interface: EventStats

  delimiter - Delimiter to use for the data - `java.lang.String`

  returns: String representation of the EventStats object - `java.lang.String`"
  (^java.lang.String [^ExampleCountEventStats this ^java.lang.String delimiter]
    (-> this (.asString delimiter))))

(defn get-string-header
  "Description copied from interface: EventStats

  delimiter - Delimiter to use for the header - `java.lang.String`

  returns: Header line - `java.lang.String`"
  (^java.lang.String [^ExampleCountEventStats this ^java.lang.String delimiter]
    (-> this (.getStringHeader delimiter))))

