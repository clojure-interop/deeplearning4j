(ns org.datavec.api.transform.ops.FloatWritableOp
  "This class converts an IAggregableReduceOp operating on a Float to one operating
 on Writable instances. It's expected this will only work if that Writable
 supports a conversion to Float.
 Created by huitseeker on 5/14/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops FloatWritableOp]))

(defn ->float-writable-op
  "Constructor."
  (^FloatWritableOp []
    (new FloatWritableOp )))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,T>> void`"
  ([^FloatWritableOp this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  writable - Input - `org.datavec.api.writable.Writable`"
  ([^FloatWritableOp this ^org.datavec.api.writable.Writable writable]
    (-> this (.accept writable))))

(defn get
  "returns: Result - `T`"
  ([^FloatWritableOp this]
    (-> this (.get))))

