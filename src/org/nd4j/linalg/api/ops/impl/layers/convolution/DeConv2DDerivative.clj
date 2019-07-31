(ns org.nd4j.linalg.api.ops.impl.layers.convolution.DeConv2DDerivative
  "DeConv2DDerivative operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution DeConv2DDerivative]))

(defn ->de-conv-2-d-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  inputs - `org.nd4j.autodiff.samediff.SDVariable[]`
  input-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig`"
  (^DeConv2DDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff inputs input-arrays outputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig config]
    (new DeConv2DDerivative same-diff inputs input-arrays outputs config))
  (^DeConv2DDerivative []
    (new DeConv2DDerivative )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^DeConv2DDerivative this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DeConv2DDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DeConv2DDerivative this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DeConv2DDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^DeConv2DDerivative this]
    (-> this (.getNumOutputs))))

