(ns org.datavec.api.transform.ops.DoubleWritableOp
  "This class converts an IAggregableReduceOp operating on a Double to one operating
 on Writable instances. It's expected this will only work well if that Writable
 supports a conversion to Double.
 Created by huitseeker on 5/14/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops DoubleWritableOp]))

(defn ->double-writable-op
  "Constructor."
  (^DoubleWritableOp []
    (new DoubleWritableOp )))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,T>> void`"
  ([^DoubleWritableOp this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  writable - Input - `org.datavec.api.writable.Writable`"
  ([^DoubleWritableOp this ^org.datavec.api.writable.Writable writable]
    (-> this (.accept writable))))

(defn get
  "returns: Result - `T`"
  ([^DoubleWritableOp this]
    (-> this (.get))))

