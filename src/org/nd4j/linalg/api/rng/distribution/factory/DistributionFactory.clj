(ns org.nd4j.linalg.api.rng.distribution.factory.DistributionFactory
  "Create a distribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.rng.distribution.factory DistributionFactory]))

(defn create-binomial
  "Create a distribution

  n - the number of trials - `int`
  p - the probabilities - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the biniomial distribution with the given parameters - `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DistributionFactory this ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray p]
    (-> this (.createBinomial n p))))

(defn create-normal
  "Create a normal distribution
  with the given mean and std

  mean - the mean - `org.nd4j.linalg.api.ndarray.INDArray`
  std - the standard deviation - `double`

  returns: the distribution with the given
  mean and standard deviation - `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DistributionFactory this ^org.nd4j.linalg.api.ndarray.INDArray mean ^Double std]
    (-> this (.createNormal mean std))))

(defn create-uniform
  "Create a uniform distribution with the
  given min and max

  min - the min - `double`
  max - the max - `double`

  returns: the uniform distribution - `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DistributionFactory this ^Double min ^Double max]
    (-> this (.createUniform min max))))

(defn create-log-normal
  "Creates a log-normal distribution

  mean - `double`
  std - `double`

  returns: `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DistributionFactory this ^Double mean ^Double std]
    (-> this (.createLogNormal mean std))))

(defn create-truncated-normal
  "Creates truncated normal distribution

  mean - `double`
  std - `double`

  returns: `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DistributionFactory this ^Double mean ^Double std]
    (-> this (.createTruncatedNormal mean std))))

(defn create-orthogonal
  "Creates orthogonal distribution

  gain - `double`

  returns: `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DistributionFactory this ^Double gain]
    (-> this (.createOrthogonal gain))))

(defn create-constant
  "Creates constant distribution

  value - `double`

  returns: `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DistributionFactory this ^Double value]
    (-> this (.createConstant value))))

