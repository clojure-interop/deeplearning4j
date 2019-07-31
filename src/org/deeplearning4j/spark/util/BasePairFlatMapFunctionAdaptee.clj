(ns org.deeplearning4j.spark.util.BasePairFlatMapFunctionAdaptee
  "PairFlatMapFunction adapter to hide incompatibilities between Spark 1.x and Spark 2.x
 This class should be used instead of direct referral to PairFlatMapFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util BasePairFlatMapFunctionAdaptee]))

(defn ->base-pair-flat-map-function-adaptee
  "Constructor.

  adapter - `org.datavec.spark.functions.FlatMapFunctionAdapter`"
  (^BasePairFlatMapFunctionAdaptee [^org.datavec.spark.functions.FlatMapFunctionAdapter adapter]
    (new BasePairFlatMapFunctionAdaptee adapter)))

(defn call
  "t - `T`

  returns: `java.lang.Iterable<scala.Tuple2<K,V>>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^BasePairFlatMapFunctionAdaptee this t]
    (-> this (.call t))))

