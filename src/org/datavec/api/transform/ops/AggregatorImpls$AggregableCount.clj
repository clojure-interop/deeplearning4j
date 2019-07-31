(ns org.datavec.api.transform.ops.AggregatorImpls$AggregableCount
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregableCount]))

(defn ->aggregable-count
  "Constructor."
  (^AggregatorImpls$AggregableCount []
    (new AggregatorImpls$AggregableCount )))

(defn accept
  "Description copied from interface: Consumer

  element - Input - `T`"
  ([^AggregatorImpls$AggregableCount this element]
    (-> this (.accept element))))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<T,org.datavec.api.writable.Writable>> void`"
  ([^AggregatorImpls$AggregableCount this accu]
    (-> this (.combine accu))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregableCount this]
    (-> this (.get))))

