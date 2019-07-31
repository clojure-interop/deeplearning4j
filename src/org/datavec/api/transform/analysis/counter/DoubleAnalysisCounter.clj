(ns org.datavec.api.transform.analysis.counter.DoubleAnalysisCounter
  "A counter function for doing analysis on Double columns, on Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.counter DoubleAnalysisCounter]))

(defn ->double-analysis-counter
  "Constructor."
  (^DoubleAnalysisCounter []
    (new DoubleAnalysisCounter )))

(defn get-sum
  "returns: `double`"
  (^Double [^DoubleAnalysisCounter this]
    (-> this (.getSum))))

(defn get-mean
  "returns: `double`"
  (^Double [^DoubleAnalysisCounter this]
    (-> this (.getMean))))

(defn get-sample-stdev
  "returns: `double`"
  (^Double [^DoubleAnalysisCounter this]
    (-> this (.getSampleStdev))))

(defn get-max-value-seen
  "returns: `double`"
  (^Double [^DoubleAnalysisCounter this]
    (-> this (.getMaxValueSeen))))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.counter.DoubleAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.DoubleAnalysisCounter [^DoubleAnalysisCounter this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn get-min-value-seen
  "returns: `double`"
  (^Double [^DoubleAnalysisCounter this]
    (-> this (.getMinValueSeen))))

(defn merge
  "other - `org.datavec.api.transform.analysis.counter.DoubleAnalysisCounter`

  returns: `org.datavec.api.transform.analysis.counter.DoubleAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.DoubleAnalysisCounter [^DoubleAnalysisCounter this ^org.datavec.api.transform.analysis.counter.DoubleAnalysisCounter other]
    (-> this (.merge other))))

(defn get-count-total
  "returns: `long`"
  (^Long [^DoubleAnalysisCounter this]
    (-> this (.getCountTotal))))

(defn get-sample-variance
  "returns: `double`"
  (^Double [^DoubleAnalysisCounter this]
    (-> this (.getSampleVariance))))

