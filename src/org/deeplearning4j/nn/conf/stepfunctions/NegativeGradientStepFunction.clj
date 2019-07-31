(ns org.deeplearning4j.nn.conf.stepfunctions.NegativeGradientStepFunction
  "Subtract the line"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.stepfunctions NegativeGradientStepFunction]))

(defn ->negative-gradient-step-function
  "Constructor."
  (^NegativeGradientStepFunction []
    (new NegativeGradientStepFunction )))

(defn hash-code
  "returns: `int`"
  (^Integer [^NegativeGradientStepFunction this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NegativeGradientStepFunction this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NegativeGradientStepFunction this]
    (-> this (.toString))))

