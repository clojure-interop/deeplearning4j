(ns org.datavec.api.transform.analysis.counter.StringAnalysisMergeFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.counter StringAnalysisMergeFunction]))

(defn ->string-analysis-merge-function
  "Constructor."
  (^StringAnalysisMergeFunction []
    (new StringAnalysisMergeFunction )))

(defn apply
  "v-1 - `org.datavec.api.transform.analysis.counter.StringAnalysisCounter`
  v-2 - `org.datavec.api.transform.analysis.counter.StringAnalysisCounter`

  returns: `org.datavec.api.transform.analysis.counter.StringAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.StringAnalysisCounter [^StringAnalysisMergeFunction this ^org.datavec.api.transform.analysis.counter.StringAnalysisCounter v-1 ^org.datavec.api.transform.analysis.counter.StringAnalysisCounter v-2]
    (-> this (.apply v-1 v-2))))

