(ns org.datavec.api.transform.ops.StringAggregatorImpls$AggregableStringAppend
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops StringAggregatorImpls$AggregableStringAppend]))

(defn ->aggregable-string-append
  "Constructor."
  (^StringAggregatorImpls$AggregableStringAppend []
    (new StringAggregatorImpls$AggregableStringAppend )))

(defn combine
  "accu - `W`

  returns: `<W extends org.datavec.api.transform.ops.IAggregableReduceOp<java.lang.String,org.datavec.api.writable.Writable>> void`"
  ([^StringAggregatorImpls$AggregableStringAppend this accu]
    (-> this (.combine accu))))

(defn accept
  "Description copied from interface: Consumer

  s - Input - `java.lang.String`"
  ([^StringAggregatorImpls$AggregableStringAppend this ^java.lang.String s]
    (-> this (.accept s))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^StringAggregatorImpls$AggregableStringAppend this]
    (-> this (.get))))

