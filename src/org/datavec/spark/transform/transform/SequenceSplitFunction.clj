(ns org.datavec.spark.transform.transform.SequenceSplitFunction
  "Created by Alex on 17/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.transform SequenceSplitFunction]))

(defn ->sequence-split-function
  "Constructor.

  split - `org.datavec.api.transform.sequence.SequenceSplit`"
  (^SequenceSplitFunction [^org.datavec.api.transform.sequence.SequenceSplit split]
    (new SequenceSplitFunction split)))

