(ns org.nd4j.linalg.api.rng.distribution.impl.UniformDistribution
  "Base distribution derived from apache commons math
 http://commons.apache.org/proper/commons-math/

 (specifically the UniformIntegerDistribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.rng.distribution.impl UniformDistribution]))

(defn ->uniform-distribution
  "Constructor.

  Creates a uniform distribution.

  rng - Random number generator. - `org.nd4j.linalg.api.rng.Random`
  lower - Lower bound of this distribution (inclusive). - `double`
  upper - Upper bound of this distribution (exclusive). - `double`

  throws: org.apache.commons.math3.exception.NumberIsTooLargeException - if lower >= upper."
  (^UniformDistribution [^org.nd4j.linalg.api.rng.Random rng ^Double lower ^Double upper]
    (new UniformDistribution rng lower upper))
  (^UniformDistribution [^Double lower ^Double upper]
    (new UniformDistribution lower upper)))

(defn support-upper-bound-inclusive?
  "Whether or not the upper bound of support is in the domain of the density
  function. Returns true iff getSupportUpperBound() is finite and
  density(getSupportUpperBound()) returns a non-NaN, non-infinite
  value.

  returns: true if the upper bound of support is finite and the density
  function returns a non-NaN, non-infinite value there - `boolean`"
  (^Boolean [^UniformDistribution this]
    (-> this (.isSupportUpperBoundInclusive))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
  distribution.

  For lower bound lower and upper bound upper, the
  variance is (upper - lower)^2 / 12.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
  for certain cases in TDistribution) or Double.NaN if it
  is not defined - `double`"
  (^Double [^UniformDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
  i.e. whether all values between the lower and upper bound of the support
  are included in the support.

  The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^UniformDistribution this]
    (-> this (.isSupportConnected))))

(defn inverse-cumulative-probability
  "Description copied from class: BaseDistribution

  p - the cumulative probability - `double`

  returns: the smallest p-quantile of this distribution
  (largest 0-quantile for p = 0) - `double`

  throws: org.apache.commons.math3.exception.OutOfRangeException - if p < 0 or p > 1"
  (^Double [^UniformDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
  value as inverseCumulativeProbability(0). In other words, this
  method must return
  inf {x in R | P(X <= x) > 0}.

  The lower bound of the support is equal to the lower bound parameter
  of the distribution.

  returns: lower bound of the support - `double`"
  (^Double [^UniformDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
  value as inverseCumulativeProbability(1). In other words, this
  method must return
  inf {x in R | P(X <= x) = 1}.

  The upper bound of the support is equal to the upper bound parameter
  of the distribution.

  returns: upper bound of the support - `double`"
  (^Double [^UniformDistribution this]
    (-> this (.getSupportUpperBound))))

(defn support-lower-bound-inclusive?
  "Whether or not the lower bound of support is in the domain of the density
  function. Returns true iff getSupporLowerBound() is finite and
  density(getSupportLowerBound()) returns a non-NaN, non-infinite
  value.

  returns: true if the lower bound of support is finite and the density
  function returns a non-NaN, non-infinite value there - `boolean`"
  (^Boolean [^UniformDistribution this]
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
  (^Double [^UniformDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
  distribution.

  For lower bound lower and upper bound upper, the mean is
  0.5 * (lower  upper).

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^UniformDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "Description copied from interface: Distribution

  x-0 - the exclusive lower bound - `double`
  x-1 - the inclusive upper bound - `double`

  returns: the probability that a random variable with this distribution
  takes a value between x0 and x1,
  excluding the lower and including the upper endpoint - `double`

  throws: org.apache.commons.math3.exception.NumberIsTooLargeException - if x0 > x1"
  (^Double [^UniformDistribution this ^Double x-0 ^Double x-1]
    (-> this (.cumulativeProbability x-0 x-1)))
  (^Double [^UniformDistribution this ^Double x]
    (-> this (.cumulativeProbability x))))

(defn sample
  "Description copied from interface: Distribution

  shape - the given shape - `int[]`

  returns: an ndarray with random samples
  from this distribution - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^UniformDistribution this shape]
    (-> this (.sample shape)))
  (^Double [^UniformDistribution this]
    (-> this (.sample))))

