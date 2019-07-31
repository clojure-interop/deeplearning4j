(ns org.datavec.api.transform.ops.AggregatorImpls$AggregableVariance
  "This class offers an aggregable reduce operation for the unbiased variance, i.e. the estimator
 of the arithmetic mean of squared differences to the mean, corrected with Bessel's correction.
 See https://en.wikipedia.org/wiki/Variance#Population_variance_and_sample_variance
 This is computed with Welford's method for increased numerical stability & aggregability."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregableVariance]))

(defn ->aggregable-variance
  "Constructor."
  (^AggregatorImpls$AggregableVariance []
    (new AggregatorImpls$AggregableVariance )))

(defn accept
  "Description copied from interface: Consumer

  n - Input - `T`"
  ([^AggregatorImpls$AggregableVariance this n]
    (-> this (.accept n))))

(defn combine
  "acc - `U`

  returns: `<U extends org.datavec.api.transform.ops.IAggregableReduceOp<T,org.datavec.api.writable.Writable>> void`"
  ([^AggregatorImpls$AggregableVariance this acc]
    (-> this (.combine acc))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregableVariance this]
    (-> this (.get))))

