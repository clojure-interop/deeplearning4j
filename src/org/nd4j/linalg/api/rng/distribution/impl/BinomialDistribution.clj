(ns org.nd4j.linalg.api.rng.distribution.impl.BinomialDistribution
  "Base distribution derived from apache commons math
 http://commons.apache.org/proper/commons-math/

 (specifically the BinomialDistribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.rng.distribution.impl BinomialDistribution]))

(defn ->binomial-distribution
  "Constructor.

  Creates a binomial distribution.

  rng - Random number generator. - `org.nd4j.linalg.api.rng.Random`
  trials - Number of trials. - `int`
  p - Probability of success. - `double`

  throws: org.apache.commons.math3.exception.NotPositiveException - if trials < 0."
  (^BinomialDistribution [^org.nd4j.linalg.api.rng.Random rng ^Integer trials ^Double p]
    (new BinomialDistribution rng trials p))
  (^BinomialDistribution [^Integer trials ^Double p]
    (new BinomialDistribution trials p)))

(defn support-upper-bound-inclusive?
  "Description copied from interface: Distribution

  returns: true if the upper bound of support is finite and the density
  function returns a non-NaN, non-infinite value there - `boolean`"
  (^Boolean [^BinomialDistribution this]
    (-> this (.isSupportUpperBoundInclusive))))

(defn probability
  "x - `int`

  returns: `double`"
  (^Double [^BinomialDistribution this ^Integer x]
    (-> this (.probability x))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
  distribution.

  For n trials and probability parameter p, the variance is
  n * p * (1 - p).

  returns: the variance (possibly Double.POSITIVE_INFINITY as
  for certain cases in TDistribution) or Double.NaN if it
  is not defined - `double`"
  (^Double [^BinomialDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
  i.e. whether all values between the lower and upper bound of the support
  are included in the support.

  The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^BinomialDistribution this]
    (-> this (.isSupportConnected))))

(defn get-probability-of-success
  "Access the probability of success for this distribution.

  returns: the probability of success. - `double`"
  (^Double [^BinomialDistribution this]
    (-> this (.getProbabilityOfSuccess))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
  value as inverseCumulativeProbability(0). In other words, this
  method must return
  inf {x in R | P(X <= x) > 0}.

  The lower bound of the support is always 0 except for the probability
  parameter p = 1.

  returns: lower bound of the support (0 or the number of trials) - `double`"
  (^Double [^BinomialDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
  value as inverseCumulativeProbability(1). In other words, this
  method must return
  inf {x in R | P(X <= x) = 1}.

  The upper bound of the support is the number of trials except for the
  probability parameter p = 0.

  returns: upper bound of the support (number of trials or 0) - `double`"
  (^Double [^BinomialDistribution this]
    (-> this (.getSupportUpperBound))))

(defn support-lower-bound-inclusive?
  "Description copied from interface: Distribution

  returns: true if the lower bound of support is finite and the density
  function returns a non-NaN, non-infinite value there - `boolean`"
  (^Boolean [^BinomialDistribution this]
    (-> this (.isSupportLowerBoundInclusive))))

(defn get-number-of-trials
  "Access the number of trials for this distribution.

  returns: the number of trials. - `int`"
  (^Integer [^BinomialDistribution this]
    (-> this (.getNumberOfTrials))))

(defn density
  "Description copied from interface: Distribution

  x - the point at which the PDF is evaluated - `double`

  returns: the value of the probability density function at point x - `double`"
  (^Double [^BinomialDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
  distribution.

  For n trials and probability parameter p, the mean is
  n * p.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^BinomialDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "Description copied from interface: Distribution

  x-0 - the exclusive lower bound - `double`
  x-1 - the inclusive upper bound - `double`

  returns: the probability that a random variable with this distribution
  takes a value between x0 and x1,
  excluding the lower and including the upper endpoint - `double`

  throws: org.apache.commons.math3.exception.NumberIsTooLargeException - if x0 > x1"
  (^Double [^BinomialDistribution this ^Double x-0 ^Double x-1]
    (-> this (.cumulativeProbability x-0 x-1)))
  (^Double [^BinomialDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

(defn sample
  "Description copied from interface: Distribution

  shape - the given shape - `int[]`

  returns: an ndarray with random samples
  from this distribution - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BinomialDistribution this shape]
    (-> this (.sample shape))))

