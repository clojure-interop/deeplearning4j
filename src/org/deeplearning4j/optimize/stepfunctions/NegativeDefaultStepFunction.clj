(ns org.deeplearning4j.optimize.stepfunctions.NegativeDefaultStepFunction
  "Inverse step function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.stepfunctions NegativeDefaultStepFunction]))

(defn ->negative-default-step-function
  "Constructor."
  (^NegativeDefaultStepFunction []
    (new NegativeDefaultStepFunction )))

(defn step
  "Description copied from interface: StepFunction

  parameters - the current parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  search-direction - the line to step - `org.nd4j.linalg.api.ndarray.INDArray`
  step - `double`"
  ([^NegativeDefaultStepFunction this ^org.nd4j.linalg.api.ndarray.INDArray parameters ^org.nd4j.linalg.api.ndarray.INDArray search-direction ^Double step]
    (-> this (.step parameters search-direction step)))
  ([^NegativeDefaultStepFunction this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray line]
    (-> this (.step x line)))
  ([^NegativeDefaultStepFunction this]
    (-> this (.step))))

