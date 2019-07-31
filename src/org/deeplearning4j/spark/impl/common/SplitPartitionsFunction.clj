(ns org.deeplearning4j.spark.impl.common.SplitPartitionsFunction
  "SplitPartitionsFunction is used to split a RDD (using AbstractJavaRDDLike.mapPartitionsWithIndex(Function2, boolean)
 via filtering.
 It is similar in design to JavaRDD.randomSplit(double[]) however it is less prone to
 producing imbalanced splits that that method. Specifically, JavaRDD.randomSplit(double[])
 splts each element individually (i.e., randomly determine a new split for each element at random), whereas this method
 chooses one out of every numSplits objects per output split. Exactly which of these is done randomly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common SplitPartitionsFunction]))

(defn ->split-partitions-function
  "Constructor."
  (^SplitPartitionsFunction []
    (new SplitPartitionsFunction )))

(defn call
  "v-1 - `java.lang.Integer`
  iter - `java.util.Iterator`

  returns: `java.util.Iterator<T>`

  throws: java.lang.Exception"
  (^java.util.Iterator [^SplitPartitionsFunction this ^java.lang.Integer v-1 ^java.util.Iterator iter]
    (-> this (.call v-1 iter))))

