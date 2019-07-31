(ns org.datavec.api.transform.analysis.histogram.StringHistogramCounter
  "A counter for building histograms (of String length) on a String column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.histogram StringHistogramCounter]))

(defn ->string-histogram-counter
  "Constructor.

  min-length - `int`
  max-length - `int`
  n-bins - `int`"
  (^StringHistogramCounter [^Integer min-length ^Integer max-length ^Integer n-bins]
    (new StringHistogramCounter min-length max-length n-bins)))

(defn add
  "w - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.histogram.HistogramCounter`"
  (^org.datavec.api.transform.analysis.histogram.HistogramCounter [^StringHistogramCounter this ^org.datavec.api.writable.Writable w]
    (-> this (.add w))))

(defn merge
  "other - `org.datavec.api.transform.analysis.histogram.HistogramCounter`

  returns: `org.datavec.api.transform.analysis.histogram.StringHistogramCounter`"
  (^org.datavec.api.transform.analysis.histogram.StringHistogramCounter [^StringHistogramCounter this ^org.datavec.api.transform.analysis.histogram.HistogramCounter other]
    (-> this (.merge other))))

(defn get-bins
  "returns: `double[]`"
  ([^StringHistogramCounter this]
    (-> this (.getBins))))

(defn get-counts
  "returns: `long[]`"
  ([^StringHistogramCounter this]
    (-> this (.getCounts))))

