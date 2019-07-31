(ns org.datavec.spark.transform.analysis.histogram.HistogramAddFunction
  "An adder function used in the calculation of histograms"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.histogram HistogramAddFunction]))

(defn ->histogram-add-function
  "Constructor."
  (^HistogramAddFunction []
    (new HistogramAddFunction )))

(defn call
  "histogram-counters - `java.util.List`
  writables - `java.util.List`

  returns: `java.util.List<org.datavec.spark.transform.analysis.histogram.HistogramCounter>`

  throws: java.lang.Exception"
  (^java.util.List [^HistogramAddFunction this ^java.util.List histogram-counters ^java.util.List writables]
    (-> this (.call histogram-counters writables))))

