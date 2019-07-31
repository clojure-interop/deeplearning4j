(ns org.nd4j.linalg.api.rng.distribution.impl.TruncatedNormalDistribution
  "Truncated Normal Distribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.rng.distribution.impl TruncatedNormalDistribution]))

(defn ->truncated-normal-distribution
  "Constructor.

  Creates a normal distribution.

  rng - Random number generator. - `org.nd4j.linalg.api.rng.Random`
  mean - Mean for this distribution. - `double`
  sd - Standard deviation for this distribution. - `double`
  inverse-cum-accuracy - Inverse cumulative probability accuracy. - `double`

  throws: org.apache.commons.math3.exception.NotStrictlyPositiveException - if sd <= 0."
  (^TruncatedNormalDistribution [^org.nd4j.linalg.api.rng.Random rng ^Double mean ^Double sd ^Double inverse-cum-accuracy]
    (new TruncatedNormalDistribution rng mean sd inverse-cum-accuracy))
  (^TruncatedNormalDistribution [^Double mean ^Double sd ^Double inverse-cum-accuracy]
    (new TruncatedNormalDistribution mean sd inverse-cum-accuracy))
  (^TruncatedNormalDistribution [^Double mean ^Double sd]
    (new TruncatedNormalDistribution mean sd))
  (^TruncatedNormalDistribution []
    (new TruncatedNormalDistribution )))

(def *-default-inverse-absolute-accuracy
  "Static Constant.

  Default inverse cumulative probability accuracy.

  type: double"
  TruncatedNormalDistribution/DEFAULT_INVERSE_ABSOLUTE_ACCURACY)

(defn support-upper-bound-inclusive?
  "Whether or not the upper bound of support is in the domain of the density
  function. Returns true iff getSupportUpperBound() is finite and
  density(getSupportUpperBound()) returns a non-NaN, non-infinite
  value.

  returns: true if the upper bound of support is finite and the density
  function returns a non-NaN, non-infinite value there - `boolean`"
  (^Boolean [^TruncatedNormalDistribution this]
    (-> this (.isSupportUpperBoundInclusive))))

(defn probability
  "For a random variable X whose values are distributed according
  to this distribution, this method returns P(x0 < X <= x1).

  x-0 - Lower bound (excluded). - `double`
  x-1 - Upper bound (included). - `double`

  returns: the probability that a random variable with this distribution
  takes a value between x0 and x1, excluding the lower
  and including the upper endpoint. - `double`

  throws: org.apache.commons.math3.exception.NumberIsTooLargeException - if x0 > x1.The default implementation uses the identityP(x0 < X <= x1) = P(X <= x1) - P(X <= x0)"
  (^Double [^TruncatedNormalDistribution this ^Double x-0 ^Double x-1]
    (-> this (.probability x-0 x-1))))

(defn get-mean
  "Access the mean.

  returns: the mean for this distribution. - `double`"
  (^Double [^TruncatedNormalDistribution this]
    (-> this (.getMean))))

(defn get-numerical-variance
  "Use this method to get the numerical value of the variance of this
  distribution.

  For standard deviation parameter s, the variance is s^2.

  returns: the variance (possibly Double.POSITIVE_INFINITY as
  for certain cases in TDistribution) or Double.NaN if it
  is not defined - `double`"
  (^Double [^TruncatedNormalDistribution this]
    (-> this (.getNumericalVariance))))

(defn support-connected?
  "Use this method to get information about whether the support is connected,
  i.e. whether all values between the lower and upper bound of the support
  are included in the support.

  The support of this distribution is connected.

  returns: true - `boolean`"
  (^Boolean [^TruncatedNormalDistribution this]
    (-> this (.isSupportConnected))))

(defn inverse-cumulative-probability
  "Computes the quantile function of this distribution. For a random
  variable X distributed according to this distribution, the
  returned value is

  inf{x in R | P(X<=x) >= p} for 0 < p <= 1,
  inf{x in R | P(X<=x) > 0} for p = 0.


  The default implementation returns

  Distribution.getSupportLowerBound() for p = 0,
  Distribution.getSupportUpperBound() for p = 1.

  p - the cumulative probability - `double`

  returns: the smallest p-quantile of this distribution
  (largest 0-quantile for p = 0) - `double`

  throws: org.apache.commons.math3.exception.OutOfRangeException - if p < 0 or p > 1"
  (^Double [^TruncatedNormalDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn get-support-lower-bound
  "Access the lower bound of the support. This method must return the same
  value as inverseCumulativeProbability(0). In other words, this
  method must return
  inf {x in R | P(X <= x) > 0}.

  The lower bound of the support is always negative infinity
  no matter the parameters.

  returns: lower bound of the support (always
  Double.NEGATIVE_INFINITY) - `double`"
  (^Double [^TruncatedNormalDistribution this]
    (-> this (.getSupportLowerBound))))

(defn get-standard-deviation
  "Access the standard deviation.

  returns: the standard deviation for this distribution. - `double`"
  (^Double [^TruncatedNormalDistribution this]
    (-> this (.getStandardDeviation))))

(defn get-support-upper-bound
  "Access the upper bound of the support. This method must return the same
  value as inverseCumulativeProbability(1). In other words, this
  method must return
  inf {x in R | P(X <= x) = 1}.

  The upper bound of the support is always positive infinity
  no matter the parameters.

  returns: upper bound of the support (always
  Double.POSITIVE_INFINITY) - `double`"
  (^Double [^TruncatedNormalDistribution this]
    (-> this (.getSupportUpperBound))))

(defn support-lower-bound-inclusive?
  "Whether or not the lower bound of support is in the domain of the density
  function. Returns true iff getSupporLowerBound() is finite and
  density(getSupportLowerBound()) returns a non-NaN, non-infinite
  value.

  returns: true if the lower bound of support is finite and the density
  function returns a non-NaN, non-infinite value there - `boolean`"
  (^Boolean [^TruncatedNormalDistribution this]
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
  (^Double [^TruncatedNormalDistribution this ^Double x]
    (-> this (.density x))))

(defn get-numerical-mean
  "Use this method to get the numerical value of the mean of this
  distribution.

  For mean parameter mu, the mean is mu.

  returns: the mean or Double.NaN if it is not defined - `double`"
  (^Double [^TruncatedNormalDistribution this]
    (-> this (.getNumericalMean))))

(defn cumulative-probability
  "For a random variable X whose values are distributed according
  to this distribution, this method returns P(X <= x). In other
  words, this method represents the (cumulative) distribution function
  (CDF) for this distribution.

  If x is more than 40 standard deviations from the mean, 0 or 1
  is returned, as in these cases the actual value is within
  Double.MIN_VALUE of 0 or 1.

  x - the point at which the CDF is evaluated - `double`

  returns: the probability that a random variable with this
  distribution takes a value less than or equal to x - `double`"
  (^Double [^TruncatedNormalDistribution this ^Double x]
    (-> this (.cumulativeProbability x)))
  (^Double [^TruncatedNormalDistribution this ^Double x-0 ^Double x-1]
    (-> this (.cumulativeProbability x-0 x-1))))

(defn sample
  "Description copied from interface: Distribution

  shape - the given shape - `int[]`

  returns: an ndarray with random samples
  from this distribution - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^TruncatedNormalDistribution this shape]
    (-> this (.sample shape)))
  (^Double [^TruncatedNormalDistribution this]
    (-> this (.sample))))

