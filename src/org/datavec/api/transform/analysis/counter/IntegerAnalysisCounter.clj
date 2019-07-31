(ns org.datavec.api.transform.analysis.counter.IntegerAnalysisCounter
  "A counter function for doing analysis on integer columns, on Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.counter IntegerAnalysisCounter]))

(defn ->integer-analysis-counter
  "Constructor."
  (^IntegerAnalysisCounter []
    (new IntegerAnalysisCounter )))

(defn get-sum
  "returns: `long`"
  (^Long [^IntegerAnalysisCounter this]
    (-> this (.getSum))))

(defn get-mean
  "returns: `double`"
  (^Double [^IntegerAnalysisCounter this]
    (-> this (.getMean))))

(defn get-sample-stdev
  "returns: `double`"
  (^Double [^IntegerAnalysisCounter this]
    (-> this (.getSampleStdev))))

(defn get-max-value-seen
  "returns: `int`"
  (^Integer [^IntegerAnalysisCounter this]
    (-> this (.getMaxValueSeen))))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.counter.IntegerAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.IntegerAnalysisCounter [^IntegerAnalysisCounter this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn get-min-value-seen
  "returns: `int`"
  (^Integer [^IntegerAnalysisCounter this]
    (-> this (.getMinValueSeen))))

(defn merge
  "other - `org.datavec.api.transform.analysis.counter.IntegerAnalysisCounter`

  returns: `org.datavec.api.transform.analysis.counter.IntegerAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.IntegerAnalysisCounter [^IntegerAnalysisCounter this ^org.datavec.api.transform.analysis.counter.IntegerAnalysisCounter other]
    (-> this (.merge other))))

(defn get-count-total
  "returns: `long`"
  (^Long [^IntegerAnalysisCounter this]
    (-> this (.getCountTotal))))

(defn get-sample-variance
  "returns: `double`"
  (^Double [^IntegerAnalysisCounter this]
    (-> this (.getSampleVariance))))

