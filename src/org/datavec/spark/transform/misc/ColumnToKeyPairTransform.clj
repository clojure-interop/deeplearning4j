(ns org.datavec.spark.transform.misc.ColumnToKeyPairTransform
  "Extract out one writable, and map it to a pair with count 1.
 Used to count the N most frequent values in a column, as in AnalyzeSpark.sampleMostFrequentFromColumn(int, String, Schema, JavaRDD)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.misc ColumnToKeyPairTransform]))

(defn ->column-to-key-pair-transform
  "Constructor."
  (^ColumnToKeyPairTransform []
    (new ColumnToKeyPairTransform )))

(defn call
  "list - `java.util.List`

  returns: `scala.Tuple2<org.datavec.api.writable.Writable,java.lang.Long>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^ColumnToKeyPairTransform this ^java.util.List list]
    (-> this (.call list))))

