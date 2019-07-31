(ns org.nd4j.linalg.api.ops.impl.layers.convolution.FullConv3DDerivative
  "FullConv3DDerivative operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution FullConv3DDerivative]))

(defn ->full-conv-3-d-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input-functions - `org.nd4j.autodiff.samediff.SDVariable[]`
  inputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  conv-3-d-config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.FullConv3DConfig`"
  (^FullConv3DDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff input-functions inputs outputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.FullConv3DConfig conv-3-d-config]
    (new FullConv3DDerivative same-diff input-functions inputs outputs conv-3-d-config))
  (^FullConv3DDerivative []
    (new FullConv3DDerivative )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^FullConv3DDerivative this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^FullConv3DDerivative this]
    (-> this (.tensorflowName))))

(defn tensorflow-names
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String[]`"
  ([^FullConv3DDerivative this]
    (-> this (.tensorflowNames))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^FullConv3DDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

