(ns org.datavec.api.transform.analysis.histogram.DoubleHistogramCounter
  "A counter for building histograms on a Double column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.histogram DoubleHistogramCounter]))

(defn ->double-histogram-counter
  "Constructor.

  min-value - `double`
  max-value - `double`
  n-bins - `int`"
  (^DoubleHistogramCounter [^Double min-value ^Double max-value ^Integer n-bins]
    (new DoubleHistogramCounter min-value max-value n-bins)))

(defn add
  "w - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.histogram.HistogramCounter`"
  (^org.datavec.api.transform.analysis.histogram.HistogramCounter [^DoubleHistogramCounter this ^org.datavec.api.writable.Writable w]
    (-> this (.add w))))

(defn merge
  "other - `org.datavec.api.transform.analysis.histogram.HistogramCounter`

  returns: `org.datavec.api.transform.analysis.histogram.DoubleHistogramCounter`"
  (^org.datavec.api.transform.analysis.histogram.DoubleHistogramCounter [^DoubleHistogramCounter this ^org.datavec.api.transform.analysis.histogram.HistogramCounter other]
    (-> this (.merge other))))

(defn get-bins
  "returns: `double[]`"
  ([^DoubleHistogramCounter this]
    (-> this (.getBins))))

(defn get-counts
  "returns: `long[]`"
  ([^DoubleHistogramCounter this]
    (-> this (.getCounts))))

