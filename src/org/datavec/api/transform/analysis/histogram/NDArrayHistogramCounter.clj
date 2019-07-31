(ns org.datavec.api.transform.analysis.histogram.NDArrayHistogramCounter
  "A counter for building histograms on a NDArray columns.
 This is a bit of a hack, using DoubleHistogramCounter internally. This should (one day) be optimized to use
 native ND4J operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.histogram NDArrayHistogramCounter]))

(defn ->nd-array-histogram-counter
  "Constructor.

  min-value - `double`
  max-value - `double`
  n-bins - `int`"
  (^NDArrayHistogramCounter [^Double min-value ^Double max-value ^Integer n-bins]
    (new NDArrayHistogramCounter min-value max-value n-bins)))

(defn add
  "w - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.histogram.HistogramCounter`"
  (^org.datavec.api.transform.analysis.histogram.HistogramCounter [^NDArrayHistogramCounter this ^org.datavec.api.writable.Writable w]
    (-> this (.add w))))

(defn merge
  "other - `org.datavec.api.transform.analysis.histogram.HistogramCounter`

  returns: `org.datavec.api.transform.analysis.histogram.NDArrayHistogramCounter`"
  (^org.datavec.api.transform.analysis.histogram.NDArrayHistogramCounter [^NDArrayHistogramCounter this ^org.datavec.api.transform.analysis.histogram.HistogramCounter other]
    (-> this (.merge other))))

(defn get-bins
  "returns: `double[]`"
  ([^NDArrayHistogramCounter this]
    (-> this (.getBins))))

(defn get-counts
  "returns: `long[]`"
  ([^NDArrayHistogramCounter this]
    (-> this (.getCounts))))

