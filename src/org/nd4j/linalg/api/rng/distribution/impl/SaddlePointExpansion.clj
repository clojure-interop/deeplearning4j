(ns org.nd4j.linalg.api.rng.distribution.impl.SaddlePointExpansion
  "Utility class used by various distributions to accurately compute their
 respective probability mass functions. The implementation for this class is
 based on the Catherine Loader's dbinom routines.


 This class is not intended to be called directly.


 References:

 Catherine Loader (2000). \"Fast and Accurate Computation of Binomial
 Probabilities.\".
 http://www.herine.net/stat/papers/dbinom.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.rng.distribution.impl SaddlePointExpansion]))

(defn *get-stirling-error
  "Compute the error of Stirling's series at the given value.

  References:

  Eric W. Weisstein. \"Stirling's Series.\" From MathWorld--A Wolfram Web
  Resource.
  http://mathworld.wolfram.com/StirlingsSeries.html

  z - the value. - `double`

  returns: the Striling's series error. - `double`"
  (^Double [^Double z]
    (SaddlePointExpansion/getStirlingError z)))

(defn *get-deviance-part
  "A part of the deviance portion of the saddle point approximation.

  References:

  Catherine Loader (2000). \"Fast and Accurate Computation of Binomial
  Probabilities.\".
  http://www.herine.net/stat/papers/dbinom.pdf

  x - the x value. - `double`
  mu - the average. - `double`

  returns: a part of the deviance. - `double`"
  (^Double [^Double x ^Double mu]
    (SaddlePointExpansion/getDeviancePart x mu)))

(defn *log-binomial-probability
  "Compute the logarithm of the PMF for a binomial distribution
  using the saddle point expansion.

  x - the value at which the probability is evaluated. - `int`
  n - the number of trials. - `int`
  p - the probability of success. - `double`
  q - the probability of failure (1 - p). - `double`

  returns: log(p(x)). - `double`"
  (^Double [^Integer x ^Integer n ^Double p ^Double q]
    (SaddlePointExpansion/logBinomialProbability x n p q)))

