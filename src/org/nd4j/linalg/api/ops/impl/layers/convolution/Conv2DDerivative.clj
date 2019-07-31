(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Conv2DDerivative
  "Conv2DDerivative operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Conv2DDerivative]))

(defn ->conv-2-d-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input-functions - `org.nd4j.autodiff.samediff.SDVariable[]`
  input-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - `org.nd4j.linalg.api.ndarray.INDArray[]`
  config - `org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig`"
  (^Conv2DDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff input-functions input-arrays outputs ^org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig config]
    (new Conv2DDerivative same-diff input-functions input-arrays outputs config))
  (^Conv2DDerivative []
    (new Conv2DDerivative )))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Conv2DDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Conv2DDerivative this]
    (-> this (.tensorflowName))))

(defn tensorflow-names
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String[]`"
  ([^Conv2DDerivative this]
    (-> this (.tensorflowNames))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Conv2DDerivative this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Conv2DDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^Conv2DDerivative this]
    (-> this (.getNumOutputs))))

