(ns org.deeplearning4j.nn.conf.distribution.BinomialDistribution
  "A binomial distribution.
 This is based on the interface from apache commons math."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution BinomialDistribution]))

(defn ->binomial-distribution
  "Constructor.

  Create a distribution

  number-of-trials - the number of trials - `int`
  probability-of-success - the probability of success - `double`"
  (^BinomialDistribution [^Integer number-of-trials ^Double probability-of-success]
    (new BinomialDistribution number-of-trials probability-of-success)))

(defn get-probability-of-success
  "returns: `double`"
  (^Double [^BinomialDistribution this]
    (-> this (.getProbabilityOfSuccess))))

(defn set-probability-of-success
  "probability-of-success - `double`"
  ([^BinomialDistribution this ^Double probability-of-success]
    (-> this (.setProbabilityOfSuccess probability-of-success))))

(defn get-number-of-trials
  "returns: `int`"
  (^Integer [^BinomialDistribution this]
    (-> this (.getNumberOfTrials))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BinomialDistribution this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BinomialDistribution this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BinomialDistribution this]
    (-> this (.toString))))

