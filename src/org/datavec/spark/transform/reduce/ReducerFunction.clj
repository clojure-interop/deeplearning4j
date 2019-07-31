(ns org.datavec.spark.transform.reduce.ReducerFunction
  "Spark function for executing
 a reduction of a set of examples by key"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.reduce ReducerFunction]))

(defn ->reducer-function
  "Constructor."
  (^ReducerFunction []
    (new ReducerFunction )))

(defn call
  "lists - `java.lang.Iterable`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.lang.Exception"
  (^java.util.List [^ReducerFunction this ^java.lang.Iterable lists]
    (-> this (.call lists))))

