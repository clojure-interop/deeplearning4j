(ns org.deeplearning4j.nn.conf.distribution.GaussianDistribution
  "A normal distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution GaussianDistribution]))

(defn ->gaussian-distribution
  "Constructor.

  Create a gaussian distribution (equivalent to normal)
  with the given mean and std

  mean - the mean - `double`
  std - the standard deviation - `double`"
  (^GaussianDistribution [^Double mean ^Double std]
    (new GaussianDistribution mean std)))

