(ns org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisMergeFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.seqlength SequenceLengthAnalysisMergeFunction]))

(defn ->sequence-length-analysis-merge-function
  "Constructor."
  (^SequenceLengthAnalysisMergeFunction []
    (new SequenceLengthAnalysisMergeFunction )))

(defn call
  "v-1 - `org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter`
  v-2 - `org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter`

  returns: `org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter`

  throws: java.lang.Exception"
  (^org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter [^SequenceLengthAnalysisMergeFunction this ^org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter v-1 ^org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter v-2]
    (-> this (.call v-1 v-2))))

