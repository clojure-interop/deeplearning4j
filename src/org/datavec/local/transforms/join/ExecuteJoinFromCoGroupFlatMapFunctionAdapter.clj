(ns org.datavec.local.transforms.join.ExecuteJoinFromCoGroupFlatMapFunctionAdapter
  "Execute a join"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.join ExecuteJoinFromCoGroupFlatMapFunctionAdapter]))

(defn ->execute-join-from-co-group-flat-map-function-adapter
  "Constructor.

  join - `org.datavec.api.transform.join.Join`"
  (^ExecuteJoinFromCoGroupFlatMapFunctionAdapter [^org.datavec.api.transform.join.Join join]
    (new ExecuteJoinFromCoGroupFlatMapFunctionAdapter join)))

(defn call
  "t-2 - `org.nd4j.linalg.primitives.Pair`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^ExecuteJoinFromCoGroupFlatMapFunctionAdapter this ^org.nd4j.linalg.primitives.Pair t-2]
    (-> this (.call t-2))))

