(ns org.datavec.local.transforms.join.ExecuteJoinFromCoGroupFlatMapFunction
  "Execute a join"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.join ExecuteJoinFromCoGroupFlatMapFunction]))

(defn ->execute-join-from-co-group-flat-map-function
  "Constructor.

  join - `org.datavec.api.transform.join.Join`"
  (^ExecuteJoinFromCoGroupFlatMapFunction [^org.datavec.api.transform.join.Join join]
    (new ExecuteJoinFromCoGroupFlatMapFunction join)))

