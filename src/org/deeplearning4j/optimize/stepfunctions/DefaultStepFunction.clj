(ns org.deeplearning4j.optimize.stepfunctions.DefaultStepFunction
  "Default step function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.stepfunctions DefaultStepFunction]))

(defn ->default-step-function
  "Constructor."
  (^DefaultStepFunction []
    (new DefaultStepFunction )))

(defn step
  "Does x = x  stepSize * line

  parameters - the current parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  search-direction - the line to step - `org.nd4j.linalg.api.ndarray.INDArray`
  step - step size. - `double`"
  ([^DefaultStepFunction this ^org.nd4j.linalg.api.ndarray.INDArray parameters ^org.nd4j.linalg.api.ndarray.INDArray search-direction ^Double step]
    (-> this (.step parameters search-direction step)))
  ([^DefaultStepFunction this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray line]
    (-> this (.step x line)))
  ([^DefaultStepFunction this]
    (-> this (.step))))

