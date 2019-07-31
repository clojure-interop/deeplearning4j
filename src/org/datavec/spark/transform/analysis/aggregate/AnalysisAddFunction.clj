(ns org.datavec.spark.transform.analysis.aggregate.AnalysisAddFunction
  "Add function used for undertaking analysis of a data set via Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.aggregate AnalysisAddFunction]))

(defn ->analysis-add-function
  "Constructor."
  (^AnalysisAddFunction []
    (new AnalysisAddFunction )))

(defn call
  "analysis-counters - `java.util.List`
  writables - `java.util.List`

  returns: `java.util.List<org.datavec.api.transform.analysis.AnalysisCounter>`

  throws: java.lang.Exception"
  (^java.util.List [^AnalysisAddFunction this ^java.util.List analysis-counters ^java.util.List writables]
    (-> this (.call analysis-counters writables))))

