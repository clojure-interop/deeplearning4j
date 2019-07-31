(ns org.datavec.api.transform.ops.ByteWritableOp
  "This class converts an IAggregableReduceOp operating on a Byte to one operating
 on Writable instances. It's expected this will only work if that Writable
 supports a conversion to Byte.
 Created by huitseeker on 5/14/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops ByteWritableOp]))

(defn ->byte-writable-op
  "Constructor."
  (^ByteWritableOp []
    (new ByteWritableOp )))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<org.datavec.api.writable.Writable,T>> void`"
  ([^ByteWritableOp this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  writable - Input - `org.datavec.api.writable.Writable`"
  ([^ByteWritableOp this ^org.datavec.api.writable.Writable writable]
    (-> this (.accept writable))))

(defn get
  "returns: Result - `T`"
  ([^ByteWritableOp this]
    (-> this (.get))))

