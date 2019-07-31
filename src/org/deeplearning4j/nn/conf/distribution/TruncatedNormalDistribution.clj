(ns org.deeplearning4j.nn.conf.distribution.TruncatedNormalDistribution
  "A truncated normal distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution TruncatedNormalDistribution]))

(defn ->truncated-normal-distribution
  "Constructor.

  Create a truncated normal distribution
  with the given mean and std

  mean - the mean - `double`
  std - the standard deviation - `double`"
  (^TruncatedNormalDistribution [^Double mean ^Double std]
    (new TruncatedNormalDistribution mean std)))

(defn get-mean
  "returns: `double`"
  (^Double [^TruncatedNormalDistribution this]
    (-> this (.getMean))))

(defn set-mean
  "mean - `double`"
  ([^TruncatedNormalDistribution this ^Double mean]
    (-> this (.setMean mean))))

(defn get-std
  "returns: `double`"
  (^Double [^TruncatedNormalDistribution this]
    (-> this (.getStd))))

(defn set-std
  "std - `double`"
  ([^TruncatedNormalDistribution this ^Double std]
    (-> this (.setStd std))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TruncatedNormalDistribution this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TruncatedNormalDistribution this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TruncatedNormalDistribution this]
    (-> this (.toString))))

