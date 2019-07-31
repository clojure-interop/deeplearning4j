(ns org.datavec.spark.transform.analysis.histogram.HistogramCombineFunction
  "A combiner function used in the calculation of histograms"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.histogram HistogramCombineFunction]))

(defn ->histogram-combine-function
  "Constructor."
  (^HistogramCombineFunction []
    (new HistogramCombineFunction )))

(defn call
  "l-1 - `java.util.List`
  l-2 - `java.util.List`

  returns: `java.util.List<org.datavec.api.transform.analysis.histogram.HistogramCounter>`

  throws: java.lang.Exception"
  (^java.util.List [^HistogramCombineFunction this ^java.util.List l-1 ^java.util.List l-2]
    (-> this (.call l-1 l-2))))

