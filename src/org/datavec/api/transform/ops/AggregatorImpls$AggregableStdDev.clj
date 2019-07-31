(ns org.datavec.api.transform.ops.AggregatorImpls$AggregableStdDev
  "This class offers an aggregable reduce operation for the unbiased standard deviation, i.e. the estimator
 of the square root of the arithmetic mean of squared differences to the mean, corrected with Bessel's correction.
 See https://en.wikipedia.org/wiki/Unbiased_estimation_of_standard_deviation
 This is computed with Welford's method for increased numerical stability & aggregability."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregableStdDev]))

(defn ->aggregable-std-dev
  "Constructor."
  (^AggregatorImpls$AggregableStdDev []
    (new AggregatorImpls$AggregableStdDev )))

(defn accept
  "Description copied from interface: Consumer

  n - Input - `T`"
  ([^AggregatorImpls$AggregableStdDev this n]
    (-> this (.accept n))))

(defn combine
  "acc - `U`

  returns: `<U extends org.datavec.api.transform.ops.IAggregableReduceOp<T,org.datavec.api.writable.Writable>> void`"
  ([^AggregatorImpls$AggregableStdDev this acc]
    (-> this (.combine acc))))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregableStdDev this]
    (-> this (.get))))

