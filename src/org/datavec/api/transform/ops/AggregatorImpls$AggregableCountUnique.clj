(ns org.datavec.api.transform.ops.AggregatorImpls$AggregableCountUnique
  "This distinct count is based on streamlib's implementation of \"HyperLogLog in Practice:
 Algorithmic Engineering of a State of The Art Cardinality Estimation Algorithm\", available
 here.
 The relative accuracy is approximately `1.054 / sqrt(2^p)`. Setting
 a nonzero `sp > p` in HyperLogLogPlus(p, sp) would trigger sparse
 representation of registers, which may reduce the memory consumption
 and increase accuracy when the cardinality is small."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregableCountUnique]))

(defn ->aggregable-count-unique
  "Constructor.

  precision - `float`"
  (^AggregatorImpls$AggregableCountUnique [^Float precision]
    (new AggregatorImpls$AggregableCountUnique precision)))

(defn accept
  "Description copied from interface: Consumer

  element - Input - `T`"
  ([^AggregatorImpls$AggregableCountUnique this element]
    (-> this (.accept element))))

(defn combine
  "acc - `U`

  returns: `<U extends org.datavec.api.transform.ops.IAggregableReduceOp<T,org.datavec.api.writable.Writable>> void`"
  ([^AggregatorImpls$AggregableCountUnique this acc]
    (-> this (.combine acc))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregableCountUnique this]
    (-> this (.get))))

