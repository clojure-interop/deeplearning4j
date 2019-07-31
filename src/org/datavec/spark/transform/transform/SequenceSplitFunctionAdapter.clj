(ns org.datavec.spark.transform.transform.SequenceSplitFunctionAdapter
  "Created by Alex on 17/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.transform SequenceSplitFunctionAdapter]))

(defn ->sequence-split-function-adapter
  "Constructor.

  split - `org.datavec.api.transform.sequence.SequenceSplit`"
  (^SequenceSplitFunctionAdapter [^org.datavec.api.transform.sequence.SequenceSplit split]
    (new SequenceSplitFunctionAdapter split)))

(defn call
  "collections - `java.util.List`

  returns: `java.lang.Iterable<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^SequenceSplitFunctionAdapter this ^java.util.List collections]
    (-> this (.call collections))))

