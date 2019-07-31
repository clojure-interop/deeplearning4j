(ns org.datavec.local.transforms.analysis.histogram.HistogramCombineFunction
  "A combiner function used in the calculation of histograms"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.analysis.histogram HistogramCombineFunction]))

(defn ->histogram-combine-function
  "Constructor."
  (^HistogramCombineFunction []
    (new HistogramCombineFunction )))

(defn apply
  "Description copied from interface: BiFunction

  l-1 - First argument - `java.util.List`
  l-2 - Second argument - `java.util.List`

  returns: Result - `java.util.List<org.datavec.api.transform.analysis.histogram.HistogramCounter>`"
  (^java.util.List [^HistogramCombineFunction this ^java.util.List l-1 ^java.util.List l-2]
    (-> this (.apply l-1 l-2))))

