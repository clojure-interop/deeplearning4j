(ns org.datavec.spark.transform.analysis.SequenceLengthFunction
  "Map a sequence to the size of that sequence"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis SequenceLengthFunction]))

(defn ->sequence-length-function
  "Constructor."
  (^SequenceLengthFunction []
    (new SequenceLengthFunction )))

(defn call
  "v-1 - `java.util.List`

  returns: `java.lang.Integer`

  throws: java.lang.Exception"
  (^java.lang.Integer [^SequenceLengthFunction this ^java.util.List v-1]
    (-> this (.call v-1))))

