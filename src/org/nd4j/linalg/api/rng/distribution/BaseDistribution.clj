(ns org.nd4j.linalg.api.rng.distribution.BaseDistribution
  "Base distribution derived from apache commons math
 http://commons.apache.org/proper/commons-math/

 (specifically the AbstractRealDistribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.rng.distribution BaseDistribution]))

(defn ->base-distribution
  "Constructor.

  rng - `org.nd4j.linalg.api.rng.Random`"
  (^BaseDistribution [^org.nd4j.linalg.api.rng.Random rng]
    (new BaseDistribution rng))
  (^BaseDistribution []
    (new BaseDistribution )))

(defn probability
  "For a random variable X whose values are distributed according
  to this distribution, this method returns P(x0 < X <= x1).

  x-0 - Lower bound (excluded). - `double`
  x-1 - Upper bound (included). - `double`

  returns: the probability that a random variable with this distribution
  takes a value between x0 and x1, excluding the lower
  and including the upper endpoint. - `double`

  throws: org.apache.commons.math3.exception.NumberIsTooLargeException - if x0 > x1.The default implementation uses the identityP(x0 < X <= x1) = P(X <= x1) - P(X <= x0)"
  (^Double [^BaseDistribution this ^Double x-0 ^Double x-1]
    (-> this (.probability x-0 x-1)))
  (^Double [^BaseDistribution this ^Double x]
    (-> this (.probability x))))

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
  (^Double [^BaseDistribution this ^Double p]
    (-> this (.inverseCumulativeProbability p))))

(defn reseed-random-generator
  "Reseed the random generator used to generate samples.

  seed - the new seed - `long`"
  ([^BaseDistribution this ^Long seed]
    (-> this (.reseedRandomGenerator seed))))

(defn sample
  "Generate a random sample from the distribution.

  The default implementation generates the sample by calling
  sample() in a loop.

  sample-size - the number of random values to generate - `long`

  returns: an array representing the random sample - `double[]`"
  ([^BaseDistribution this ^Long sample-size]
    (-> this (.sample sample-size)))
  (^Double [^BaseDistribution this]
    (-> this (.sample))))

