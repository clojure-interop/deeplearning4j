(ns org.datavec.api.transform.ops.DispatchWithConditionOp
  "A variant of DispatchOp that for each operation, tests the input list of elements for a Condition,
 before dispatching the appropriate column of this element to its operation.
 Operations are, as with DispatchOp bound one-to-one to a column.
 However, the operation's Condition are per-record (a Writable list).
 Created by huitseeker on 5/14/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops DispatchWithConditionOp]))

(defn ->dispatch-with-condition-op
  "Constructor.

  ops - `java.util.List`
  conds - `java.util.List`"
  (^DispatchWithConditionOp [^java.util.List ops ^java.util.List conds]
    (new DispatchWithConditionOp ops conds)))

(defn accept
  "Description copied from interface: Consumer

  ts - Input - `java.util.List`"
  ([^DispatchWithConditionOp this ^java.util.List ts]
    (-> this (.accept ts))))

