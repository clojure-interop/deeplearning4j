(ns org.deeplearning4j.optimize.api.StepFunction
  "Custom step function for line search"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.api StepFunction]))

(defn step
  "Step with the given parameters

  x - the current parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  line - the line to step - `org.nd4j.linalg.api.ndarray.INDArray`
  step - `double`"
  ([^StepFunction this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray line ^Double step]
    (-> this (.step x line step)))
  ([^StepFunction this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray line]
    (-> this (.step x line)))
  ([^StepFunction this]
    (-> this (.step))))

