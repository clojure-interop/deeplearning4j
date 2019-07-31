(ns org.deeplearning4j.nn.conf.distribution.LogNormalDistribution
  "A log-normal distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution LogNormalDistribution]))

(defn ->log-normal-distribution
  "Constructor.

  Create a log-normal distribution
  with the given mean and std

  mean - the mean - `double`
  std - the standard deviation - `double`"
  (^LogNormalDistribution [^Double mean ^Double std]
    (new LogNormalDistribution mean std)))

(defn get-mean
  "returns: `double`"
  (^Double [^LogNormalDistribution this]
    (-> this (.getMean))))

(defn set-mean
  "mean - `double`"
  ([^LogNormalDistribution this ^Double mean]
    (-> this (.setMean mean))))

(defn get-std
  "returns: `double`"
  (^Double [^LogNormalDistribution this]
    (-> this (.getStd))))

(defn set-std
  "std - `double`"
  ([^LogNormalDistribution this ^Double std]
    (-> this (.setStd std))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LogNormalDistribution this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LogNormalDistribution this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LogNormalDistribution this]
    (-> this (.toString))))

