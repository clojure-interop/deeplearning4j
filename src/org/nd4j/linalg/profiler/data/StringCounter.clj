(ns org.nd4j.linalg.profiler.data.StringCounter
  "Simple key-value counter"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler.data StringCounter]))

(defn ->string-counter
  "Constructor."
  (^StringCounter []
    (new StringCounter )))

(defn reset
  ""
  ([^StringCounter this]
    (-> this (.reset))))

(defn increment-count
  "key - `java.lang.String`

  returns: `long`"
  (^Long [^StringCounter this ^java.lang.String key]
    (-> this (.incrementCount key))))

(defn get-count
  "key - `java.lang.String`

  returns: `long`"
  (^Long [^StringCounter this ^java.lang.String key]
    (-> this (.getCount key))))

(defn totals-increment
  ""
  ([^StringCounter this]
    (-> this (.totalsIncrement))))

(defn as-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringCounter this]
    (-> this (.asString))))

