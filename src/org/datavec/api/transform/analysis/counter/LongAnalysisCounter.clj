(ns org.datavec.api.transform.analysis.counter.LongAnalysisCounter
  "A counter function for doing analysis on Long columns, on Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.counter LongAnalysisCounter]))

(defn ->long-analysis-counter
  "Constructor."
  (^LongAnalysisCounter []
    (new LongAnalysisCounter )))

(defn get-sum
  "returns: `long`"
  (^Long [^LongAnalysisCounter this]
    (-> this (.getSum))))

(defn get-mean
  "returns: `double`"
  (^Double [^LongAnalysisCounter this]
    (-> this (.getMean))))

(defn get-sample-stdev
  "returns: `double`"
  (^Double [^LongAnalysisCounter this]
    (-> this (.getSampleStdev))))

(defn get-max-value-seen
  "returns: `long`"
  (^Long [^LongAnalysisCounter this]
    (-> this (.getMaxValueSeen))))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.counter.LongAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.LongAnalysisCounter [^LongAnalysisCounter this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn get-min-value-seen
  "returns: `long`"
  (^Long [^LongAnalysisCounter this]
    (-> this (.getMinValueSeen))))

(defn merge
  "other - `org.datavec.api.transform.analysis.counter.LongAnalysisCounter`

  returns: `org.datavec.api.transform.analysis.counter.LongAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.LongAnalysisCounter [^LongAnalysisCounter this ^org.datavec.api.transform.analysis.counter.LongAnalysisCounter other]
    (-> this (.merge other))))

(defn get-count-total
  "returns: `long`"
  (^Long [^LongAnalysisCounter this]
    (-> this (.getCountTotal))))

(defn get-sample-variance
  "returns: `double`"
  (^Double [^LongAnalysisCounter this]
    (-> this (.getSampleVariance))))

