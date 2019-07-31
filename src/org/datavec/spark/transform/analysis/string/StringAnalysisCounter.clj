(ns org.datavec.spark.transform.analysis.string.StringAnalysisCounter
  "A counter function for doing analysis on String columns, on Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.string StringAnalysisCounter]))

(defn ->string-analysis-counter
  "Constructor."
  (^StringAnalysisCounter []
    (new StringAnalysisCounter )))

(defn get-sum-length
  "returns: `long`"
  (^Long [^StringAnalysisCounter this]
    (-> this (.getSumLength))))

(defn get-mean
  "returns: `double`"
  (^Double [^StringAnalysisCounter this]
    (-> this (.getMean))))

(defn get-sample-stdev
  "returns: `double`"
  (^Double [^StringAnalysisCounter this]
    (-> this (.getSampleStdev))))

(defn get-max-length-seen
  "returns: `int`"
  (^Integer [^StringAnalysisCounter this]
    (-> this (.getMaxLengthSeen))))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.spark.transform.analysis.string.StringAnalysisCounter`"
  (^org.datavec.spark.transform.analysis.string.StringAnalysisCounter [^StringAnalysisCounter this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn get-min-length-seen
  "returns: `int`"
  (^Integer [^StringAnalysisCounter this]
    (-> this (.getMinLengthSeen))))

(defn merge
  "other - `org.datavec.spark.transform.analysis.string.StringAnalysisCounter`

  returns: `org.datavec.spark.transform.analysis.string.StringAnalysisCounter`"
  (^org.datavec.spark.transform.analysis.string.StringAnalysisCounter [^StringAnalysisCounter this ^org.datavec.spark.transform.analysis.string.StringAnalysisCounter other]
    (-> this (.merge other))))

(defn get-count-total
  "returns: `long`"
  (^Long [^StringAnalysisCounter this]
    (-> this (.getCountTotal))))

(defn get-sample-variance
  "returns: `double`"
  (^Double [^StringAnalysisCounter this]
    (-> this (.getSampleVariance))))

