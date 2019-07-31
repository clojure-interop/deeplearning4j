(ns org.deeplearning4j.nn.conf.stepfunctions.NegativeDefaultStepFunction
  "Inverse step function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.stepfunctions NegativeDefaultStepFunction]))

(defn ->negative-default-step-function
  "Constructor."
  (^NegativeDefaultStepFunction []
    (new NegativeDefaultStepFunction )))

(defn hash-code
  "returns: `int`"
  (^Integer [^NegativeDefaultStepFunction this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NegativeDefaultStepFunction this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NegativeDefaultStepFunction this]
    (-> this (.toString))))

