(ns org.nd4j.linalg.api.ops.DynamicCustomOp$SameDiffBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops DynamicCustomOp$SameDiffBuilder]))

(defn same-diff
  "same-diff - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$SameDiffBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$SameDiffBuilder [^DynamicCustomOp$SameDiffBuilder this ^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (-> this (.sameDiff same-diff))))

(defn add-inputs
  "Description copied from class: DynamicCustomOp.DynamicCustomOpsBuilder

  inputs - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder [^DynamicCustomOp$SameDiffBuilder this ^org.nd4j.linalg.api.ndarray.INDArray inputs]
    (-> this (.addInputs inputs))))

(defn add-outputs
  "Description copied from class: DynamicCustomOp.DynamicCustomOpsBuilder

  outputs - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder [^DynamicCustomOp$SameDiffBuilder this ^org.nd4j.linalg.api.ndarray.INDArray outputs]
    (-> this (.addOutputs outputs))))

(defn build
  "returns: `org.nd4j.linalg.api.ops.DynamicCustomOp`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp [^DynamicCustomOp$SameDiffBuilder this]
    (-> this (.build))))

