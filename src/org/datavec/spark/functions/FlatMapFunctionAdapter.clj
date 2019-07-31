(ns org.datavec.spark.functions.FlatMapFunctionAdapter
  "A function that returns zero or more output records from each input record.
 Adapter for Spark interface in order to freeze interface changes between spark versions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions FlatMapFunctionAdapter]))

(defn call
  "t - `T`

  returns: `java.lang.Iterable<R>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^FlatMapFunctionAdapter this t]
    (-> this (.call t))))

