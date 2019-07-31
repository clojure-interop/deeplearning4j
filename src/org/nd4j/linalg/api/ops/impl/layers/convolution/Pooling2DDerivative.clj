(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Pooling2DDerivative
  "Pooling2DDerivative operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Pooling2DDerivative]))

(defn ->pooling-2-d-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `org.nd4j.autodiff.samediff.SDVariable[]`
  array-inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  array-outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig`"
  (^Pooling2DDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff inputs array-inputs array-outputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig config]
    (new Pooling2DDerivative same-diff inputs array-inputs array-outputs config))
  (^Pooling2DDerivative []
    (new Pooling2DDerivative )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Pooling2DDerivative this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Pooling2DDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

