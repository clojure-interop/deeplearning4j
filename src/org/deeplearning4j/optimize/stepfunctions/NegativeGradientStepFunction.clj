(ns org.deeplearning4j.optimize.stepfunctions.NegativeGradientStepFunction
  "Subtract the line"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.stepfunctions NegativeGradientStepFunction]))

(defn ->negative-gradient-step-function
  "Constructor."
  (^NegativeGradientStepFunction []
    (new NegativeGradientStepFunction )))

(defn step
  "Description copied from interface: StepFunction

  x - the current parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  line - the line to step - `org.nd4j.linalg.api.ndarray.INDArray`
  step - `double`"
  ([^NegativeGradientStepFunction this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray line ^Double step]
    (-> this (.step x line step)))
  ([^NegativeGradientStepFunction this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray line]
    (-> this (.step x line)))
  ([^NegativeGradientStepFunction this]
    (-> this (.step))))

