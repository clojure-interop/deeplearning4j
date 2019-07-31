(ns org.datavec.local.transforms.transform.SequenceSplitFunctionAdapter
  "Created by Alex on 17/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.transform SequenceSplitFunctionAdapter]))

(defn ->sequence-split-function-adapter
  "Constructor.

  split - `org.datavec.api.transform.sequence.SequenceSplit`"
  (^SequenceSplitFunctionAdapter [^org.datavec.api.transform.sequence.SequenceSplit split]
    (new SequenceSplitFunctionAdapter split)))

(defn call
  "collections - `java.util.List`

  returns: `java.util.List<java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`

  throws: java.lang.Exception"
  (^java.util.List [^SequenceSplitFunctionAdapter this ^java.util.List collections]
    (-> this (.call collections))))

