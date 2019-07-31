(ns org.datavec.api.transform.ops.AggregatorImpls$AggregableMax
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregableMax]))

(defn ->aggregable-max
  "Constructor."
  (^AggregatorImpls$AggregableMax []
    (new AggregatorImpls$AggregableMax )))

(defn accept
  "Description copied from interface: Consumer

  element - Input - `T`"
  ([^AggregatorImpls$AggregableMax this element]
    (-> this (.accept element))))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<T,org.datavec.api.writable.Writable>> void`"
  ([^AggregatorImpls$AggregableMax this accu]
    (-> this (.combine accu))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregableMax this]
    (-> this (.get))))

