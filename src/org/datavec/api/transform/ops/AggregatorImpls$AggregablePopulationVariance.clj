(ns org.datavec.api.transform.ops.AggregatorImpls$AggregablePopulationVariance
  "This class offers an aggregable reduce operation for the population variance, i.e. the uncorrected estimator
 of the arithmetic mean of squared differences to the mean.
 See https://en.wikipedia.org/wiki/Variance#Population_variance_and_sample_variance
 This is computed with Welford's method for increased numerical stability & aggregability."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.ops AggregatorImpls$AggregablePopulationVariance]))

(defn ->aggregable-population-variance
  "Constructor."
  (^AggregatorImpls$AggregablePopulationVariance []
    (new AggregatorImpls$AggregablePopulationVariance )))

(defn get
  "returns: Result - `org.datavec.api.writable.Writable`"
  (^org.datavec.api.writable.Writable [^AggregatorImpls$AggregablePopulationVariance this]
    (-> this (.get))))

