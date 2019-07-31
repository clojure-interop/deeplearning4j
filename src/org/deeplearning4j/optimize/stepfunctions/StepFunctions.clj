(ns org.deeplearning4j.optimize.stepfunctions.StepFunctions
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.stepfunctions StepFunctions]))

(defn *create-step-function
  "step-function - `org.deeplearning4j.nn.conf.stepfunctions.StepFunction`

  returns: `org.deeplearning4j.optimize.api.StepFunction`"
  (^org.deeplearning4j.optimize.api.StepFunction [^org.deeplearning4j.nn.conf.stepfunctions.StepFunction step-function]
    (StepFunctions/createStepFunction step-function)))

