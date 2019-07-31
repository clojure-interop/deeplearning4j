(ns org.datavec.spark.transform.join.ExecuteJoinFromCoGroupFlatMapFunctionAdapter
  "Execute a join"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.join ExecuteJoinFromCoGroupFlatMapFunctionAdapter]))

(defn ->execute-join-from-co-group-flat-map-function-adapter
  "Constructor.

  join - `org.datavec.api.transform.join.Join`"
  (^ExecuteJoinFromCoGroupFlatMapFunctionAdapter [^org.datavec.api.transform.join.Join join]
    (new ExecuteJoinFromCoGroupFlatMapFunctionAdapter join)))

(defn call
  "t-2 - `scala.Tuple2`

  returns: `java.lang.Iterable<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^ExecuteJoinFromCoGroupFlatMapFunctionAdapter this ^scala.Tuple2 t-2]
    (-> this (.call t-2))))

