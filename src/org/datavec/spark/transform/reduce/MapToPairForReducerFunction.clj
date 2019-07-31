(ns org.datavec.spark.transform.reduce.MapToPairForReducerFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.reduce MapToPairForReducerFunction]))

(defn ->map-to-pair-for-reducer-function
  "Constructor."
  (^MapToPairForReducerFunction []
    (new MapToPairForReducerFunction )))

(def *-global-key
  "Static Constant.

  type: java.lang.String"
  MapToPairForReducerFunction/GLOBAL_KEY)

(defn call
  "writables - `java.util.List`

  returns: `scala.Tuple2<java.lang.String,java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^MapToPairForReducerFunction this ^java.util.List writables]
    (-> this (.call writables))))

