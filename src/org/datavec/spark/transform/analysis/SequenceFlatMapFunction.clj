(ns org.datavec.spark.transform.analysis.SequenceFlatMapFunction
  "SequenceFlatMapFunction: very simple function used to flatten a sequence
 Typically used only internally for certain analysis operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis SequenceFlatMapFunction]))

(defn ->sequence-flat-map-function
  "Constructor."
  (^SequenceFlatMapFunction []
    (new SequenceFlatMapFunction )))

