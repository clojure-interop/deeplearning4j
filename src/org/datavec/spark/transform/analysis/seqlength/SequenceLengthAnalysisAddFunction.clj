(ns org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisAddFunction
  "Created by Alex on 7/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.seqlength SequenceLengthAnalysisAddFunction]))

(defn ->sequence-length-analysis-add-function
  "Constructor."
  (^SequenceLengthAnalysisAddFunction []
    (new SequenceLengthAnalysisAddFunction )))

(defn call
  "v-1 - `org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter`
  length - `java.lang.Integer`

  returns: `org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter`

  throws: java.lang.Exception"
  (^org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter [^SequenceLengthAnalysisAddFunction this ^org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter v-1 ^java.lang.Integer length]
    (-> this (.call v-1 length))))

