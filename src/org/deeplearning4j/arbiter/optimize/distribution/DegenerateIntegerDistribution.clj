(ns org.deeplearning4j.arbiter.optimize.distribution.DegenerateIntegerDistribution
  "Degenerate distribution: i.e., integer \"distribution\" that is just a fixed value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.distribution DegenerateIntegerDistribution]))

(defn ->degenerate-integer-distribution
  "Constructor.

  value - `int`"
  (^DegenerateIntegerDistribution [^Integer value]
    (new DegenerateIntegerDistribution value)))

(defn probability
  "x - `int`

  returns: `double`"
  (^Double [^DegenerateIntegerDistribution this ^Integer x]
    (-> this (.probability x))))

(defn get-numerical-variance
  "returns: `double`"
  (^Double [^DegenerateIntegerDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "returns: `boolean`"
  (^Boolean [^DegenerateIntegerDistribution this]
    (-> this (.isSupportConnected))))

(defn reseed-random-generator
  "seed - `long`"
  ([^DegenerateIntegerDistribution this ^Long seed]
    (-> this (.reseedRandomGenerator seed))))

(defn inverse-cumulative-probability
  "p - `double`

  returns: `int`

  throws: org.apache.commons.math3.exception.OutOfRangeException"
  (^Integer [^DegenerateIntegerDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "returns: `int`"
  (^Integer [^DegenerateIntegerDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "returns: `int`"
  (^Integer [^DegenerateIntegerDistribution this]
    (-> this (.getSupportUpperBound))))

(defn get-numerical-mean
  "returns: `double`"
  (^Double [^DegenerateIntegerDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "x-0 - `int`
  x-1 - `int`

  returns: `double`

  throws: org.apache.commons.math3.exception.NumberIsTooLargeException"
  (^Double [^DegenerateIntegerDistribution this ^Integer x-0 ^Integer x-1]
    (-> this (.cumulativeProbability x-0 x-1)))
  (^Double [^DegenerateIntegerDistribution this ^Integer x]
    (-> this (.cumulativeProbability x))))

(defn sample
  "sample-size - `int`

  returns: `int[]`"
  ([^DegenerateIntegerDistribution this ^Integer sample-size]
    (-> this (.sample sample-size)))
  (^Integer [^DegenerateIntegerDistribution this]
    (-> this (.sample))))

