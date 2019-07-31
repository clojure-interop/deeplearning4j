(ns org.datavec.api.transform.ops.AggregatorImpls$AggregableFirst
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregableFirst]))

(defn ->aggregable-first
  "Constructor."
  (^AggregatorImpls$AggregableFirst []
    (new AggregatorImpls$AggregableFirst )))

(defn accept
  "Description copied from interface: Consumer

  element - Input - `T`"
  ([^AggregatorImpls$AggregableFirst this element]
    (-> this (.accept element))))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<T,org.datavec.api.writable.Writable>> void`"
  ([^AggregatorImpls$AggregableFirst this accu]
    (-> this (.combine accu))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregableFirst this]
    (-> this (.get))))

