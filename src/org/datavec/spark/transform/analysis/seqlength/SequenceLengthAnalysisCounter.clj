(ns org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter
  "Created by Alex on 7/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.seqlength SequenceLengthAnalysisCounter]))

(defn ->sequence-length-analysis-counter
  "Constructor."
  (^SequenceLengthAnalysisCounter []
    (new SequenceLengthAnalysisCounter )))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter`"
  (^org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter [^SequenceLengthAnalysisCounter this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter`

  returns: `org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter`"
  (^org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter [^SequenceLengthAnalysisCounter this ^org.datavec.spark.transform.analysis.seqlength.SequenceLengthAnalysisCounter other]
    (-> this (.merge other))))

