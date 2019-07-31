(ns org.datavec.spark.transform.sparkfunction.sequence.DataFrameToSequenceMergeValue
  "Combiner function for use in DataFrames#toRecordsSequence(DataFrame)

 Assumption here: first two columns are the sequence UUID and the sequence index, as per
 DataFrames.toDataFrameSequence(Schema, JavaRDD)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sparkfunction.sequence DataFrameToSequenceMergeValue]))

(defn ->data-frame-to-sequence-merge-value
  "Constructor."
  (^DataFrameToSequenceMergeValue []
    (new DataFrameToSequenceMergeValue )))

(defn call
  "seq-so-far - `java.util.List`
  rows - `java.lang.Iterable`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^DataFrameToSequenceMergeValue this ^java.util.List seq-so-far ^java.lang.Iterable rows]
    (-> this (.call seq-so-far rows))))

