(ns org.deeplearning4j.nn.conf.distribution.ConstantDistribution
  "Constant distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution ConstantDistribution]))

(defn ->constant-distribution
  "Constructor.

  Create a Constant distribution with given value

  value - the gain - `double`"
  (^ConstantDistribution [^Double value]
    (new ConstantDistribution value)))

(defn get-value
  "returns: `double`"
  (^Double [^ConstantDistribution this]
    (-> this (.getValue))))

(defn set-value
  "value - `double`"
  ([^ConstantDistribution this ^Double value]
    (-> this (.setValue value))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ConstantDistribution this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ConstantDistribution this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ConstantDistribution this]
    (-> this (.toString))))

