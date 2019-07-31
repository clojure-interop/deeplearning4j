(ns org.datavec.api.transform.ops.AggregatorImpls$AggregableUncorrectedStdDev
  "This class offers an aggregable reduce operation for the biased standard deviation, i.e. the estimator
 of the square root of the arithmetic mean of squared differences to the mean.
 See https://en.wikipedia.org/wiki/Unbiased_estimation_of_standard_deviation
 This is computed with Welford's method for increased numerical stability & aggregability."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregableUncorrectedStdDev]))

(defn ->aggregable-uncorrected-std-dev
  "Constructor."
  (^AggregatorImpls$AggregableUncorrectedStdDev []
    (new AggregatorImpls$AggregableUncorrectedStdDev )))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregableUncorrectedStdDev this]
    (-> this (.get))))

