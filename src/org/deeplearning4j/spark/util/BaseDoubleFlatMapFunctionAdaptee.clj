(ns org.deeplearning4j.spark.util.BaseDoubleFlatMapFunctionAdaptee
  "DoubleFlatMapFunction adapter to hide incompatibilities between Spark 1.x and Spark 2.x
 This class should be used instead of direct referral to DoubleFlatMapFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.util BaseDoubleFlatMapFunctionAdaptee]))

(defn ->base-double-flat-map-function-adaptee
  "Constructor.

  adapter - `org.datavec.spark.functions.FlatMapFunctionAdapter`"
  (^BaseDoubleFlatMapFunctionAdaptee [^org.datavec.spark.functions.FlatMapFunctionAdapter adapter]
    (new BaseDoubleFlatMapFunctionAdaptee adapter)))

(defn call
  "t - `T`

  returns: `java.lang.Iterable<java.lang.Double>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^BaseDoubleFlatMapFunctionAdaptee this t]
    (-> this (.call t))))

