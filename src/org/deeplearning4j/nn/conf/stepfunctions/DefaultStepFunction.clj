(ns org.deeplearning4j.nn.conf.stepfunctions.DefaultStepFunction
  "Default step function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.stepfunctions DefaultStepFunction]))

(defn ->default-step-function
  "Constructor."
  (^DefaultStepFunction []
    (new DefaultStepFunction )))

(defn hash-code
  "returns: `int`"
  (^Integer [^DefaultStepFunction this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DefaultStepFunction this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DefaultStepFunction this]
    (-> this (.toString))))

