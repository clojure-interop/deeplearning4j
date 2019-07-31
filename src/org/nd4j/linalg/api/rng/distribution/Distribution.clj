(ns org.nd4j.linalg.api.rng.distribution.Distribution
  "A probability distribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.rng.distribution Distribution]))

(defn support-upper-bound-inclusive?
  "Deprecated. to be removed in 4.0

  returns: true if the upper bound of support is finite and the density
  function returns a non-NaN, non-infinite value there - `boolean`"
  (^Boolean [^Distribution this]
    (-> this (.isSupportUpperBoundInclusive))))

(defn probability
  "For a random variable X whose values are distributed according
  to this distribution, this method returns P(X = x). In other
  words, this method represents the probability mass function (PMF)
  for the distribution.

  x - the point at which the PMF is evaluated - `double`

  returns: the value of the probability mass function at point x - `double`"
  (^Double [^Distribution this ^Double x]
    (-> this (.probability x))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
  distribution.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
  for certain cases in TDistribution) or Double.NaN if it
  is not defined - `double`"
  (^Double [^Distribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
  i.e. whether all values between the lower and upper bound of the support
  are included in the support.

  returns: whether the support is connected or not - `boolean`"
  (^Boolean [^Distribution this]
    (-> this (.isSupportConnected))))

(defn reseed-random-generator
  "Reseed the random generator used to generate samples.

  seed - the new seed - `long`"
  ([^Distribution this ^Long seed]
    (-> this (.reseedRandomGenerator seed))))

(defn inverse-cumulative-probability
  "Computes the quantile function of this distribution. For a random
  variable X distributed according to this distribution, the
  returned value is

  inf{x in R | P(X<=x) >= p} for 0 < p <= 1,
  inf{x in R | P(X<=x) > 0} for p = 0.

  p - the cumulative probability - `double`

  returns: the smallest p-quantile of this distribution
  (largest 0-quantile for p = 0) - `double`

  throws: org.apache.commons.math3.exception.OutOfRangeException - if p < 0 or p > 1"
  (^Double [^Distribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
  value as inverseCumulativeProbability(0). In other words, this
  method must return
  inf {x in R | P(X <= x) > 0}.

  returns: lower bound of the support (might be
  Double.NEGATIVE_INFINITY) - `double`"
  (^Double [^Distribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
  value as inverseCumulativeProbability(1). In other words, this
  method must return
  inf {x in R | P(X <= x) = 1}.

  returns: upper bound of the support (might be
  Double.POSITIVE_INFINITY) - `double`"
  (^Double [^Distribution this]
    (-> this (.getSupportUpperBound))))

(defn support-lower-bound-inclusive?
  "Deprecated. to be removed in 4.0

  returns: true if the lower bound of support is finite and the density
  function returns a non-NaN, non-infinite value there - `boolean`"
  (^Boolean [^Distribution this]
    (-> this (.isSupportLowerBoundInclusive))))

(defn density
  "Returns the probability density function (PDF) of this distribution
  evaluated at the specified point x. In general, the PDF is
  the derivative of the CDF.
  If the derivative does not exist at x, then an appropriate
  replacement should be returned, e.g. Double.POSITIVE_INFINITY,
  Double.NaN, or the limit inferior or limit superior of the
  difference quotient.

  x - the point at which the PDF is evaluated - `double`

  returns: the value of the probability density function at point x - `double`"
  (^Double [^Distribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
  distribution.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^Distribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
  to this distribution, this method returns P(X <= x). In other
  words, this method represents the (cumulative) distribution function
  (CDF) for this distribution.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
  distribution takes a value less than or equal to x - `double`"
  (^Double [^Distribution this ^Double x]
    (-> this (.cumulativeProbability x)))
  (^Double [^Distribution this ^Double x-0 ^Double x-1]
    (-> this (.cumulativeProbability x-0 x-1))))

(defn sample
  "Generate a random sample from the distribution.

  sample-size - the number of random values to generate - `long`

  returns: an array representing the random sample - `double[]`

  throws: org.apache.commons.math3.exception.NotStrictlyPositiveException - if sampleSize is not positive"
  ([^Distribution this ^Long sample-size]
    (-> this (.sample sample-size)))
  (^Double [^Distribution this]
    (-> this (.sample))))

