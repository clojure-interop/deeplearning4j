(ns org.datavec.api.transform.analysis.histogram.CategoricalHistogramCounter
  "A counter for building histograms of Categorical columns"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.histogram CategoricalHistogramCounter]))

(defn ->categorical-histogram-counter
  "Constructor.

  state-names - `java.util.List`"
  (^CategoricalHistogramCounter [^java.util.List state-names]
    (new CategoricalHistogramCounter state-names)))

(defn add
  "w - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.histogram.HistogramCounter`"
  (^org.datavec.api.transform.analysis.histogram.HistogramCounter [^CategoricalHistogramCounter this ^org.datavec.api.writable.Writable w]
    (-> this (.add w))))

(defn merge
  "other - `org.datavec.api.transform.analysis.histogram.HistogramCounter`

  returns: `org.datavec.api.transform.analysis.histogram.HistogramCounter`"
  (^org.datavec.api.transform.analysis.histogram.HistogramCounter [^CategoricalHistogramCounter this ^org.datavec.api.transform.analysis.histogram.HistogramCounter other]
    (-> this (.merge other))))

(defn get-bins
  "returns: `double[]`"
  ([^CategoricalHistogramCounter this]
    (-> this (.getBins))))

(defn get-counts
  "returns: `long[]`"
  ([^CategoricalHistogramCounter this]
    (-> this (.getCounts))))

