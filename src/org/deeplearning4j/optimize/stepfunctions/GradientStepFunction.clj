(ns org.deeplearning4j.optimize.stepfunctions.GradientStepFunction
  "Normal gradient step function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.stepfunctions GradientStepFunction]))

(defn ->gradient-step-function
  "Constructor."
  (^GradientStepFunction []
    (new GradientStepFunction )))

(defn step
  "Description copied from interface: StepFunction

  x - the current parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  line - the line to step - `org.nd4j.linalg.api.ndarray.INDArray`
  step - `double`"
  ([^GradientStepFunction this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray line ^Double step]
    (-> this (.step x line step)))
  ([^GradientStepFunction this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray line]
    (-> this (.step x line)))
  ([^GradientStepFunction this]
    (-> this (.step))))

