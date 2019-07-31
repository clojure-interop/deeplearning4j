(ns org.deeplearning4j.nn.conf.distribution.UniformDistribution
  "A uniform distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution UniformDistribution]))

(defn ->uniform-distribution
  "Constructor.

  Create a uniform real distribution using the given lower and upper
  bounds.

  lower - Lower bound of this distribution (inclusive). - `double`
  upper - Upper bound of this distribution (exclusive). - `double`

  throws: org.apache.commons.math3.exception.NumberIsTooLargeException - if lower >= upper."
  (^UniformDistribution [^Double lower ^Double upper]
    (new UniformDistribution lower upper)))

(defn get-upper
  "returns: `double`"
  (^Double [^UniformDistribution this]
    (-> this (.getUpper))))

(defn set-upper
  "upper - `double`"
  ([^UniformDistribution this ^Double upper]
    (-> this (.setUpper upper))))

(defn get-lower
  "returns: `double`"
  (^Double [^UniformDistribution this]
    (-> this (.getLower))))

(defn set-lower
  "lower - `double`"
  ([^UniformDistribution this ^Double lower]
    (-> this (.setLower lower))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UniformDistribution this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UniformDistribution this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UniformDistribution this]
    (-> this (.toString))))

