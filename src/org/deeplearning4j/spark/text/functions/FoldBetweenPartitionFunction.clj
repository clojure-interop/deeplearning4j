(ns org.deeplearning4j.spark.text.functions.FoldBetweenPartitionFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.functions FoldBetweenPartitionFunction]))

(defn ->fold-between-partition-function
  "Constructor.

  broadcasted-max-per-partition-counter - `org.apache.spark.broadcast.Broadcast`"
  (^FoldBetweenPartitionFunction [^org.apache.spark.broadcast.Broadcast broadcasted-max-per-partition-counter]
    (new FoldBetweenPartitionFunction broadcasted-max-per-partition-counter)))

(defn call
  "ind - `java.lang.Integer`
  partition - `java.util.Iterator`

  returns: `java.util.Iterator<java.lang.Long>`

  throws: java.lang.Exception"
  (^java.util.Iterator [^FoldBetweenPartitionFunction this ^java.lang.Integer ind ^java.util.Iterator partition]
    (-> this (.call ind partition))))

