(ns org.datavec.api.transform.ops.AggregableMultiOp
  "This class transforms a list of IAggregableReduceOp on one single field, each returning a Writable
 and transforms it into an operation on that single column, that returns a Writable list.
 It is used to execute many reduction operations in parallel on the same column, datavec#238
 Created by huitseeker on 5/8/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregableMultiOp]))

(defn ->aggregable-multi-op
  "Constructor."
  (^AggregableMultiOp []
    (new AggregableMultiOp )))

(defn accept
  "Description copied from interface: Consumer

  t - Input - `T`"
  ([^AggregableMultiOp this t]
    (-> this (.accept t))))

(defn combine
  "accu - `U`

  returns: `<U extends org.datavec.api.transform.ops.IAggregableReduceOp<T,java.util.List<org.datavec.api.writable.Writable>>> void`"
  ([^AggregableMultiOp this accu]
    (-> this (.combine accu))))

(defn get
  "returns: Result - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^AggregableMultiOp this]
    (-> this (.get))))

