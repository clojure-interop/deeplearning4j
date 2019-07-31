(ns org.datavec.api.transform.ops.AggregableCheckingOp
  "A variant of IAggregableReduceOp exercised on a Writable that takes schema metadata
 in its constructor, and checks the input Writable against the schema before accepting it.
 Created by huitseeker on 5/8/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregableCheckingOp]))

(defn ->aggregable-checking-op
  "Constructor."
  (^AggregableCheckingOp []
    (new AggregableCheckingOp )))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,T>> void`"
  ([^AggregableCheckingOp this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  writable - Input - `org.datavec.api.writable.Writable`"
  ([^AggregableCheckingOp this ^org.datavec.api.writable.Writable writable]
    (-> this (.accept writable))))

(defn get
  "returns: Result - `T`"
  ([^AggregableCheckingOp this]
    (-> this (.get))))

