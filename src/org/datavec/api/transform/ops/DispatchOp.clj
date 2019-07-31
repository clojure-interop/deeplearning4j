(ns org.datavec.api.transform.ops.DispatchOp
  "This class takes many IAggregableReduceOp, each acting on one field, and each returning several
 Writable elements, in the form of a list of Writable. It produces a reduce operation that
 distributes a list of Writable elements to these operations, one per operation.
 Created by huitseeker on 5/14/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops DispatchOp]))

(defn ->dispatch-op
  "Constructor."
  (^DispatchOp []
    (new DispatchOp )))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<java.util.List<T>,java.util.List<U>>> void`"
  ([^DispatchOp this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  ts - Input - `java.util.List`"
  ([^DispatchOp this ^java.util.List ts]
    (-> this (.accept ts))))

(defn get
  "returns: Result - `java.util.List<U>`"
  (^java.util.List [^DispatchOp this]
    (-> this (.get))))

