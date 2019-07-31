(ns org.datavec.spark.transform.sequence.SparkGroupToSequenceFunction
  "Spark function for grouping independent values/examples into a sequence, and then sorting them
 using a provided SequenceComparator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sequence SparkGroupToSequenceFunction]))

(defn ->spark-group-to-sequence-function
  "Constructor."
  (^SparkGroupToSequenceFunction []
    (new SparkGroupToSequenceFunction )))

(defn call
  "lists - `java.lang.Iterable`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^SparkGroupToSequenceFunction this ^java.lang.Iterable lists]
    (-> this (.call lists))))

