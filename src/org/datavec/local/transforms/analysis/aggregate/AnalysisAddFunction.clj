(ns org.datavec.local.transforms.analysis.aggregate.AnalysisAddFunction
  "Add function used for undertaking analysis of a data set via Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.analysis.aggregate AnalysisAddFunction]))

(defn ->analysis-add-function
  "Constructor."
  (^AnalysisAddFunction []
    (new AnalysisAddFunction )))

(defn apply
  "Description copied from interface: BiFunction

  analysis-counters - First argument - `java.util.List`
  writables - Second argument - `java.util.List`

  returns: Result - `java.util.List<org.datavec.api.transform.analysis.AnalysisCounter>`"
  (^java.util.List [^AnalysisAddFunction this ^java.util.List analysis-counters ^java.util.List writables]
    (-> this (.apply analysis-counters writables))))

