(ns org.deeplearning4j.nn.conf.distribution.NormalDistribution
  "A normal distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution NormalDistribution]))

(defn ->normal-distribution
  "Constructor.

  Create a normal distribution
  with the given mean and std

  mean - the mean - `double`
  std - the standard deviation - `double`"
  (^NormalDistribution [^Double mean ^Double std]
    (new NormalDistribution mean std)))

(defn get-mean
  "returns: `double`"
  (^Double [^NormalDistribution this]
    (-> this (.getMean))))

(defn set-mean
  "mean - `double`"
  ([^NormalDistribution this ^Double mean]
    (-> this (.setMean mean))))

(defn get-std
  "returns: `double`"
  (^Double [^NormalDistribution this]
    (-> this (.getStd))))

(defn set-std
  "std - `double`"
  ([^NormalDistribution this ^Double std]
    (-> this (.setStd std))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NormalDistribution this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NormalDistribution this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NormalDistribution this]
    (-> this (.toString))))

