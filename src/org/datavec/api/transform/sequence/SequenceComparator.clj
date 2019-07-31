(ns org.datavec.api.transform.sequence.SequenceComparator
  "Compare the time steps of a sequence"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.sequence SequenceComparator]))

(defn set-schema
  "sequence-schema - `org.datavec.api.transform.schema.Schema`"
  ([^SequenceComparator this ^org.datavec.api.transform.schema.Schema sequence-schema]
    (-> this (.setSchema sequence-schema))))

