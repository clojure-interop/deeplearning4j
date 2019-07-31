(ns org.datavec.spark.transform.analysis.SequenceFlatMapFunctionAdapter
  "SequenceFlatMapFunction: very simple function used to flatten a sequence
 Typically used only internally for certain analysis operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis SequenceFlatMapFunctionAdapter]))

(defn ->sequence-flat-map-function-adapter
  "Constructor."
  (^SequenceFlatMapFunctionAdapter []
    (new SequenceFlatMapFunctionAdapter )))

(defn call
  "collections - `java.util.List`

  returns: `java.lang.Iterable<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^SequenceFlatMapFunctionAdapter this ^java.util.List collections]
    (-> this (.call collections))))

