(ns org.datavec.local.transforms.analysis.histogram.HistogramAddFunction
  "An adder function used in the calculation of histograms"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.analysis.histogram HistogramAddFunction]))

(defn ->histogram-add-function
  "Constructor."
  (^HistogramAddFunction []
    (new HistogramAddFunction )))

(defn apply
  "Description copied from interface: BiFunction

  histogram-counters - First argument - `java.util.List`
  writables - Second argument - `java.util.List`

  returns: Result - `java.util.List<org.datavec.api.transform.analysis.histogram.HistogramCounter>`"
  (^java.util.List [^HistogramAddFunction this ^java.util.List histogram-counters ^java.util.List writables]
    (-> this (.apply histogram-counters writables))))

