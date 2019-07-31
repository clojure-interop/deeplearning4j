(ns org.datavec.api.transform.ops.AggregatorImpls$AggregableSum
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregableSum]))

(defn ->aggregable-sum
  "Constructor."
  (^AggregatorImpls$AggregableSum []
    (new AggregatorImpls$AggregableSum )))

(defn accept
  "Description copied from interface: Consumer

  element - Input - `T`"
  ([^AggregatorImpls$AggregableSum this element]
    (-> this (.accept element))))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<T,org.datavec.api.writable.Writable>> void`"
  ([^AggregatorImpls$AggregableSum this accu]
    (-> this (.combine accu))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregableSum this]
    (-> this (.get))))

