(ns org.nd4j.linalg.api.rng.distribution.factory.DefaultDistributionFactory
  "Default distribution factory"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.rng.distribution.factory DefaultDistributionFactory]))

(defn ->default-distribution-factory
  "Constructor."
  (^DefaultDistributionFactory []
    (new DefaultDistributionFactory )))

(defn create-binomial
  "Description copied from interface: DistributionFactory

  n - the number of trials - `int`
  p - the probabilities - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the biniomial distribution with the given parameters - `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DefaultDistributionFactory this ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray p]
    (-> this (.createBinomial n p))))

(defn create-normal
  "Description copied from interface: DistributionFactory

  mean - the mean - `org.nd4j.linalg.api.ndarray.INDArray`
  std - the standard deviation - `double`

  returns: the distribution with the given
  mean and standard deviation - `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DefaultDistributionFactory this ^org.nd4j.linalg.api.ndarray.INDArray mean ^Double std]
    (-> this (.createNormal mean std))))

(defn create-log-normal
  "Description copied from interface: DistributionFactory

  mean - `double`
  std - `double`

  returns: `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DefaultDistributionFactory this ^Double mean ^Double std]
    (-> this (.createLogNormal mean std))))

(defn create-truncated-normal
  "Description copied from interface: DistributionFactory

  mean - `double`
  std - `double`

  returns: `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DefaultDistributionFactory this ^Double mean ^Double std]
    (-> this (.createTruncatedNormal mean std))))

(defn create-orthogonal
  "Description copied from interface: DistributionFactory

  gain - `double`

  returns: `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DefaultDistributionFactory this ^Double gain]
    (-> this (.createOrthogonal gain))))

(defn create-constant
  "Description copied from interface: DistributionFactory

  value - `double`

  returns: `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DefaultDistributionFactory this ^Double value]
    (-> this (.createConstant value))))

(defn create-uniform
  "Description copied from interface: DistributionFactory

  min - the min - `double`
  max - the max - `double`

  returns: the uniform distribution - `org.nd4j.linalg.api.rng.distribution.Distribution`"
  (^org.nd4j.linalg.api.rng.distribution.Distribution [^DefaultDistributionFactory this ^Double min ^Double max]
    (-> this (.createUniform min max))))

