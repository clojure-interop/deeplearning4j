(ns org.deeplearning4j.nn.conf.stepfunctions.StepFunction
  "Custom step function for line search."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.stepfunctions StepFunction]))

(defn ->step-function
  "Constructor."
  (^StepFunction []
    (new StepFunction )))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.stepfunctions.StepFunction`"
  (^org.deeplearning4j.nn.conf.stepfunctions.StepFunction [^StepFunction this]
    (-> this (.clone))))

