(ns org.datavec.spark.transform.analysis.aggregate.AnalysisCombineFunction
  "Combine function used for undertaking analysis of a data set via Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.aggregate AnalysisCombineFunction]))

(defn ->analysis-combine-function
  "Constructor."
  (^AnalysisCombineFunction []
    (new AnalysisCombineFunction )))

(defn call
  "l-1 - `java.util.List`
  l-2 - `java.util.List`

  returns: `java.util.List<org.datavec.api.transform.analysis.AnalysisCounter>`

  throws: java.lang.Exception"
  (^java.util.List [^AnalysisCombineFunction this ^java.util.List l-1 ^java.util.List l-2]
    (-> this (.call l-1 l-2))))

