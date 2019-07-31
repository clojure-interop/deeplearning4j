(ns org.datavec.api.transform.ops.StringWritableOp
  "This class converts an IAggregableReduceOp operating on a String to one operating
 on Writable instances. It's expected this will only work if that Writable
 supports a conversion to TextWritable.
 Created by huitseeker on 5/14/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops StringWritableOp]))

(defn ->string-writable-op
  "Constructor."
  (^StringWritableOp []
    (new StringWritableOp )))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,T>> void`"
  ([^StringWritableOp this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  writable - Input - `org.datavec.api.writable.Writable`"
  ([^StringWritableOp this ^org.datavec.api.writable.Writable writable]
    (-> this (.accept writable))))

(defn get
  "returns: Result - `T`"
  ([^StringWritableOp this]
    (-> this (.get))))

