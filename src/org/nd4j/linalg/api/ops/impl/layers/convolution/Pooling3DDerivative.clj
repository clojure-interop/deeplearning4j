(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3DDerivative
  "Pooling3DDerivative operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Pooling3DDerivative]))

(defn ->pooling-3-d-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `org.nd4j.autodiff.samediff.SDVariable[]`
  input-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  in-place - `boolean`
  pooling-3-d-config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig`
  type - `org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType`"
  (^Pooling3DDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff inputs input-arrays outputs ^Boolean in-place ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig pooling-3-d-config ^org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling3D$Pooling3DType type]
    (new Pooling3DDerivative same-diff inputs input-arrays outputs in-place pooling-3-d-config type))
  (^Pooling3DDerivative []
    (new Pooling3DDerivative )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Pooling3DDerivative this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Pooling3DDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

