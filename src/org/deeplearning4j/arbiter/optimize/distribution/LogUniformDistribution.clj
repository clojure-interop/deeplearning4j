(ns org.deeplearning4j.arbiter.optimize.distribution.LogUniformDistribution
  "Log uniform distribution, with support in range [min, max] for min > 0
 Reference: https://www.vosesoftware.com/riskwiki/LogUniformdistribution.php"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.distribution LogUniformDistribution]))

(defn ->log-uniform-distribution
  "Constructor.

  min - Minimum value - `double`
  max - Maximum value - `double`"
  (^LogUniformDistribution [^Double min ^Double max]
    (new LogUniformDistribution min max)))

(defn support-upper-bound-inclusive?
  "returns: `boolean`"
  (^Boolean [^LogUniformDistribution this]
    (-> this (.isSupportUpperBoundInclusive))))

(defn probability
  "x - `double`

  returns: `double`"
  (^Double [^LogUniformDistribution this ^Double x]
    (-> this (.probability x))))

(defn get-numerical-variance
  "returns: `double`"
  (^Double [^LogUniformDistribution this]
    (-> this (.getNumericalVariance))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LogUniformDistribution this]
    (-> this (.toString))))

(defn support-connected?
  "returns: `boolean`"
  (^Boolean [^LogUniformDistribution this]
    (-> this (.isSupportConnected))))

(defn reseed-random-generator
  "seed - `long`"
  ([^LogUniformDistribution this ^Long seed]
    (-> this (.reseedRandomGenerator seed))))

(defn inverse-cumulative-probability
  "p - `double`

  returns: `double`

  throws: org.apache.commons.math3.exception.OutOfRangeException"
  (^Double [^LogUniformDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "returns: `double`"
  (^Double [^LogUniformDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "returns: `double`"
  (^Double [^LogUniformDistribution this]
    (-> this (.getSupportUpperBound))))

(defn support-lower-bound-inclusive?
  "returns: `boolean`"
  (^Boolean [^LogUniformDistribution this]
    (-> this (.isSupportLowerBoundInclusive))))

(defn density
  "x - `double`

  returns: `double`"
  (^Double [^LogUniformDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "returns: `double`"
  (^Double [^LogUniformDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "x-0 - `double`
  x-1 - `double`

  returns: `double`

  throws: org.apache.commons.math3.exception.NumberIsTooLargeException"
  (^Double [^LogUniformDistribution this ^Double x-0 ^Double x-1]
    (-> this (.cumulativeProbability x-0 x-1)))
  (^Double [^LogUniformDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

(defn sample
  "sample-size - `int`

  returns: `double[]`"
  ([^LogUniformDistribution this ^Integer sample-size]
    (-> this (.sample sample-size)))
  (^Double [^LogUniformDistribution this]
    (-> this (.sample))))

