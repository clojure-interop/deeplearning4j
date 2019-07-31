(ns org.datavec.api.transform.ops.AggregatorImpls$AggregableProd
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregableProd]))

(defn ->aggregable-prod
  "Constructor."
  (^AggregatorImpls$AggregableProd []
    (new AggregatorImpls$AggregableProd )))

(defn accept
  "Description copied from interface: Consumer

  element - Input - `T`"
  ([^AggregatorImpls$AggregableProd this element]
    (-> this (.accept element))))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<T,org.datavec.api.writable.Writable>> void`"
  ([^AggregatorImpls$AggregableProd this accu]
    (-> this (.combine accu))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregableProd this]
    (-> this (.get))))

