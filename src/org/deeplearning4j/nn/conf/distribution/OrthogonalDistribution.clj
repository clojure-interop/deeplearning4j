(ns org.deeplearning4j.nn.conf.distribution.OrthogonalDistribution
  "Orthogonal distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution OrthogonalDistribution]))

(defn ->orthogonal-distribution
  "Constructor.

  Create a log-normal distribution
  with the given mean and std

  gain - the gain - `double`"
  (^OrthogonalDistribution [^Double gain]
    (new OrthogonalDistribution gain)))

(defn get-gain
  "returns: `double`"
  (^Double [^OrthogonalDistribution this]
    (-> this (.getGain))))

(defn set-gain
  "gain - `double`"
  ([^OrthogonalDistribution this ^Double gain]
    (-> this (.setGain gain))))

(defn hash-code
  "returns: `int`"
  (^Integer [^OrthogonalDistribution this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^OrthogonalDistribution this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^OrthogonalDistribution this]
    (-> this (.toString))))

