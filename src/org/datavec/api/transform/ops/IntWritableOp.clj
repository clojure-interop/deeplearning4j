(ns org.datavec.api.transform.ops.IntWritableOp
  "This class converts an IAggregableReduceOp operating on a Integer to one operating
 on Writable instances. It's expected this will only work if that Writable
 supports a conversion to Integer.
 Created by huitseeker on 5/14/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops IntWritableOp]))

(defn ->int-writable-op
  "Constructor."
  (^IntWritableOp []
    (new IntWritableOp )))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,T>> void`"
  ([^IntWritableOp this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  writable - Input - `org.datavec.api.writable.Writable`"
  ([^IntWritableOp this ^org.datavec.api.writable.Writable writable]
    (-> this (.accept writable))))

(defn get
  "returns: Result - `T`"
  ([^IntWritableOp this]
    (-> this (.get))))

