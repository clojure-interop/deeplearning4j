(ns org.datavec.api.transform.ops.StringAggregatorImpls$AggregableStringPrepend
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops StringAggregatorImpls$AggregableStringPrepend]))

(defn ->aggregable-string-prepend
  "Constructor."
  (^StringAggregatorImpls$AggregableStringPrepend []
    (new StringAggregatorImpls$AggregableStringPrepend )))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<java.lang.String,org.datavec.api.writable.Writable>> void`"
  ([^StringAggregatorImpls$AggregableStringPrepend this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  s - Input - `java.lang.String`"
  ([^StringAggregatorImpls$AggregableStringPrepend this ^java.lang.String s]
    (-> this (.accept s))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^StringAggregatorImpls$AggregableStringPrepend this]
    (-> this (.get))))

