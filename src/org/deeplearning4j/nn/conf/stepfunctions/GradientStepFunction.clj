(ns org.deeplearning4j.nn.conf.stepfunctions.GradientStepFunction
  "Normal gradient step function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.stepfunctions GradientStepFunction]))

(defn ->gradient-step-function
  "Constructor."
  (^GradientStepFunction []
    (new GradientStepFunction )))

(defn hash-code
  "returns: `int`"
  (^Integer [^GradientStepFunction this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GradientStepFunction this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GradientStepFunction this]
    (-> this (.toString))))

