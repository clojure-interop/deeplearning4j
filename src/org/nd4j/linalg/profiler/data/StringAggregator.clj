(ns org.nd4j.linalg.profiler.data.StringAggregator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler.data StringAggregator]))

(defn ->string-aggregator
  "Constructor."
  (^StringAggregator []
    (new StringAggregator )))

(defn reset
  ""
  ([^StringAggregator this]
    (-> this (.reset))))

(defn put-time
  "key - `java.lang.String`
  op - `org.nd4j.linalg.api.ops.Op`
  time-spent - `long`"
  ([^StringAggregator this ^java.lang.String key ^org.nd4j.linalg.api.ops.Op op ^Long time-spent]
    (-> this (.putTime key op time-spent)))
  ([^StringAggregator this ^java.lang.String key ^Long time-spent]
    (-> this (.putTime key time-spent))))

(defn as-percentage-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringAggregator this]
    (-> this (.asPercentageString))))

(defn as-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StringAggregator this]
    (-> this (.asString))))

