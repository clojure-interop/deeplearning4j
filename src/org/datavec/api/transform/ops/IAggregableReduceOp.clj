(ns org.datavec.api.transform.ops.IAggregableReduceOp
  "Created by huitseeker on 4/28/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops IAggregableReduceOp]))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<T,V>> void`"
  ([^IAggregableReduceOp this accu]
    (-> this (.combine accu))))

