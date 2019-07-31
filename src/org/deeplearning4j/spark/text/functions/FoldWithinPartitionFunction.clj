(ns org.deeplearning4j.spark.text.functions.FoldWithinPartitionFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.text.functions FoldWithinPartitionFunction]))

(defn ->fold-within-partition-function
  "Constructor.

  max-partition-acc - `org.apache.spark.Accumulator`"
  (^FoldWithinPartitionFunction [^org.apache.spark.Accumulator max-partition-acc]
    (new FoldWithinPartitionFunction max-partition-acc)))

(defn call
  "ind - `java.lang.Integer`
  partition - `java.util.Iterator`

  returns: `java.util.Iterator<java.util.concurrent.atomic.AtomicLong>`

  throws: java.lang.Exception"
  (^java.util.Iterator [^FoldWithinPartitionFunction this ^java.lang.Integer ind ^java.util.Iterator partition]
    (-> this (.call ind partition))))

