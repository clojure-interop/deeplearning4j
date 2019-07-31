(ns org.deeplearning4j.spark.data.shuffle.SplitDataSetExamplesPairFlatMapFunction
  "A PairFlatMapFunction that splits each example in a DataSet object into its own DataSet.
 Also adds a random key (integer value) in the range 0 to maxKeyIndex-1.
 Used in SparkUtils.shuffleExamples(JavaRDD, int, int)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data.shuffle SplitDataSetExamplesPairFlatMapFunction]))

(defn ->split-data-set-examples-pair-flat-map-function
  "Constructor.

  max-key-index - `int`"
  (^SplitDataSetExamplesPairFlatMapFunction [^Integer max-key-index]
    (new SplitDataSetExamplesPairFlatMapFunction max-key-index)))

