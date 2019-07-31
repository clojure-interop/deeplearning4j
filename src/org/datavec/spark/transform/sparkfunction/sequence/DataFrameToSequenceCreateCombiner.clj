(ns org.datavec.spark.transform.sparkfunction.sequence.DataFrameToSequenceCreateCombiner
  "A create combiner function for use in DataFrames#toRecordsSequence(Dataset)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sparkfunction.sequence DataFrameToSequenceCreateCombiner]))

(defn ->data-frame-to-sequence-create-combiner
  "Constructor."
  (^DataFrameToSequenceCreateCombiner []
    (new DataFrameToSequenceCreateCombiner )))

(defn call
  "rows - `java.lang.Iterable`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^DataFrameToSequenceCreateCombiner this ^java.lang.Iterable rows]
    (-> this (.call rows))))

