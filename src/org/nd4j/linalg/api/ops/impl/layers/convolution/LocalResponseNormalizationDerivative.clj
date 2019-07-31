(ns org.nd4j.linalg.api.ops.impl.layers.convolution.LocalResponseNormalizationDerivative
  "LocalResponseNormalizationDerivative operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution LocalResponseNormalizationDerivative]))

(defn ->local-response-normalization-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input-functions - `org.nd4j.autodiff.samediff.SDVariable[]`
  inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  in-place - `boolean`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.LocalResponseNormalizationConfig`"
  (^LocalResponseNormalizationDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff input-functions inputs outputs ^Boolean in-place ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.LocalResponseNormalizationConfig config]
    (new LocalResponseNormalizationDerivative same-diff input-functions inputs outputs in-place config))
  (^LocalResponseNormalizationDerivative []
    (new LocalResponseNormalizationDerivative )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^LocalResponseNormalizationDerivative this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LocalResponseNormalizationDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

