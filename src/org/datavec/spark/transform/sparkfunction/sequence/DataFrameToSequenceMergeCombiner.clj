(ns org.datavec.spark.transform.sparkfunction.sequence.DataFrameToSequenceMergeCombiner
  "Combiner function for use in DataFrames#toRecordsSequence(Dataset)

 Assumption here: first two columns are the sequence UUID and the sequence index, as per
 DataFrames.toDataFrameSequence(Schema, JavaRDD)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sparkfunction.sequence DataFrameToSequenceMergeCombiner]))

(defn ->data-frame-to-sequence-merge-combiner
  "Constructor."
  (^DataFrameToSequenceMergeCombiner []
    (new DataFrameToSequenceMergeCombiner )))

(defn call
  "v-1 - `java.util.List`
  v-2 - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^DataFrameToSequenceMergeCombiner this ^java.util.List v-1 ^java.util.List v-2]
    (-> this (.call v-1 v-2))))

