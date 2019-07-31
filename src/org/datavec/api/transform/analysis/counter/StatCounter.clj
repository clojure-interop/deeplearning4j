(ns org.datavec.api.transform.analysis.counter.StatCounter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.counter StatCounter]))

(defn ->stat-counter
  "Constructor."
  (^StatCounter []
    (new StatCounter )))

(defn get-count
  "returns: `long`"
  (^Long [^StatCounter this]
    (-> this (.getCount))))

(defn get-variance
  "population - `boolean`

  returns: `double`"
  (^Double [^StatCounter this ^Boolean population]
    (-> this (.getVariance population))))

(defn get-sum
  "returns: `double`"
  (^Double [^StatCounter this]
    (-> this (.getSum))))

(defn get-min
  "returns: `double`"
  (^Double [^StatCounter this]
    (-> this (.getMin))))

(defn get-max
  "returns: `double`"
  (^Double [^StatCounter this]
    (-> this (.getMax))))

(defn get-mean
  "returns: `double`"
  (^Double [^StatCounter this]
    (-> this (.getMean))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StatCounter this]
    (-> this (.toString))))

(defn clone
  "returns: `org.datavec.api.transform.analysis.counter.StatCounter`"
  (^org.datavec.api.transform.analysis.counter.StatCounter [^StatCounter this]
    (-> this (.clone))))

(defn add
  "x - `double`"
  ([^StatCounter this ^Double x]
    (-> this (.add x))))

(defn merge
  "o - `org.datavec.api.transform.analysis.counter.StatCounter`

  returns: `org.datavec.api.transform.analysis.counter.StatCounter`"
  (^org.datavec.api.transform.analysis.counter.StatCounter [^StatCounter this ^org.datavec.api.transform.analysis.counter.StatCounter o]
    (-> this (.merge o))))

(defn get-stddev
  "population - `boolean`

  returns: `double`"
  (^Double [^StatCounter this ^Boolean population]
    (-> this (.getStddev population))))

