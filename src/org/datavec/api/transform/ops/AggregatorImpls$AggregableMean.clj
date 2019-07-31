(ns org.datavec.api.transform.ops.AggregatorImpls$AggregableMean
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregableMean]))

(defn ->aggregable-mean
  "Constructor."
  (^AggregatorImpls$AggregableMean []
    (new AggregatorImpls$AggregableMean )))

(defn accept
  "Description copied from interface: Consumer

  n - Input - `T`"
  ([^AggregatorImpls$AggregableMean this n]
    (-> this (.accept n))))

(defn combine
  "acc - `U`

  returns: `<U extends org.datavec.api.transform.ops.IAggregableReduceOp<T,org.datavec.api.writable.Writable>> void`"
  ([^AggregatorImpls$AggregableMean this acc]
    (-> this (.combine acc))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregableMean this]
    (-> this (.get))))

