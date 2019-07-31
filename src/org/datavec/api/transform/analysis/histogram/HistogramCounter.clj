(ns org.datavec.api.transform.analysis.histogram.HistogramCounter
  "HistogramCounter: used to calculate histogram values for one column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.histogram HistogramCounter]))

(defn add
  "w - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.histogram.HistogramCounter`"
  (^org.datavec.api.transform.analysis.histogram.HistogramCounter [^HistogramCounter this ^org.datavec.api.writable.Writable w]
    (-> this (.add w))))

(defn merge
  "other - `org.datavec.api.transform.analysis.histogram.HistogramCounter`

  returns: `org.datavec.api.transform.analysis.histogram.HistogramCounter`"
  (^org.datavec.api.transform.analysis.histogram.HistogramCounter [^HistogramCounter this ^org.datavec.api.transform.analysis.histogram.HistogramCounter other]
    (-> this (.merge other))))

(defn get-bins
  "returns: `double[]`"
  ([^HistogramCounter this]
    (-> this (.getBins))))

(defn get-counts
  "returns: `long[]`"
  ([^HistogramCounter this]
    (-> this (.getCounts))))

