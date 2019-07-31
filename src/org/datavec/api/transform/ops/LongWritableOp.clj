(ns org.datavec.api.transform.ops.LongWritableOp
  "This class converts an IAggregableReduceOp operating on a Long to one operating
 on Writable instances. It's expected this will only work if that Writable
 supports a conversion to Long.
 Created by huitseeker on 5/14/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops LongWritableOp]))

(defn ->long-writable-op
  "Constructor."
  (^LongWritableOp []
    (new LongWritableOp )))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,T>> void`"
  ([^LongWritableOp this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  writable - Input - `org.datavec.api.writable.Writable`"
  ([^LongWritableOp this ^org.datavec.api.writable.Writable writable]
    (-> this (.accept writable))))

(defn get
  "returns: Result - `T`"
  ([^LongWritableOp this]
    (-> this (.get))))

