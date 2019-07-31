(ns org.datavec.spark.transform.analysis.string.StringAnalysisMergeFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.string StringAnalysisMergeFunction]))

(defn ->string-analysis-merge-function
  "Constructor."
  (^StringAnalysisMergeFunction []
    (new StringAnalysisMergeFunction )))

(defn call
  "v-1 - `org.datavec.spark.transform.analysis.string.StringAnalysisCounter`
  v-2 - `org.datavec.spark.transform.analysis.string.StringAnalysisCounter`

  returns: `org.datavec.spark.transform.analysis.string.StringAnalysisCounter`

  throws: java.lang.Exception"
  (^org.datavec.spark.transform.analysis.string.StringAnalysisCounter [^StringAnalysisMergeFunction this ^org.datavec.spark.transform.analysis.string.StringAnalysisCounter v-1 ^org.datavec.spark.transform.analysis.string.StringAnalysisCounter v-2]
    (-> this (.call v-1 v-2))))

