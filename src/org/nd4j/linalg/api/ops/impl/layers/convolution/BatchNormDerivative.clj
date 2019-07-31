(ns org.nd4j.linalg.api.ops.impl.layers.convolution.BatchNormDerivative
  "BatchNormDerivative operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution BatchNormDerivative]))

(defn ->batch-norm-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input-functions - `org.nd4j.autodiff.samediff.SDVariable[]`
  input-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  output-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  in-place - `boolean`
  apply-gamma - `boolean`
  apply-beta - `boolean`
  epsilon - `double`"
  (^BatchNormDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff input-functions input-arrays output-arrays ^Boolean in-place ^Boolean apply-gamma ^Boolean apply-beta ^Double epsilon]
    (new BatchNormDerivative same-diff input-functions input-arrays output-arrays in-place apply-gamma apply-beta epsilon))
  (^BatchNormDerivative []
    (new BatchNormDerivative )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^BatchNormDerivative this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BatchNormDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

