(ns org.deeplearning4j.spark.models.sequencevectors.functions.ListSequenceConvertFunction
  "Simple function to convert List to Sequence"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions ListSequenceConvertFunction]))

(defn ->list-sequence-convert-function
  "Constructor."
  (^ListSequenceConvertFunction []
    (new ListSequenceConvertFunction )))

(defn call
  "ts - `java.util.List`

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`

  throws: java.lang.Exception"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^ListSequenceConvertFunction this ^java.util.List ts]
    (-> this (.call ts))))

