(ns org.datavec.spark.transform.BaseFlatMapFunctionAdaptee
  "FlatMapFunction adapter to
 hide incompatibilities between Spark 1.x and Spark 2.x
 This class should be used instead of direct referral to FlatMapFunction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform BaseFlatMapFunctionAdaptee]))

(defn ->base-flat-map-function-adaptee
  "Constructor.

  adapter - `org.datavec.spark.functions.FlatMapFunctionAdapter`"
  (^BaseFlatMapFunctionAdaptee [^org.datavec.spark.functions.FlatMapFunctionAdapter adapter]
    (new BaseFlatMapFunctionAdaptee adapter)))

(defn call
  "k - `K`

  returns: `java.lang.Iterable<V>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^BaseFlatMapFunctionAdaptee this k]
    (-> this (.call k))))

