(ns org.datavec.api.transform.analysis.sequence.SequenceLengthAnalysis
  "Created by Alex on 12/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.sequence SequenceLengthAnalysis]))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SequenceLengthAnalysis this]
    (-> this (.toString))))

