(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Upsampling2d
  "Upsampling operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Upsampling2d]))

(defn ->upsampling-2d
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  nchw - `boolean`
  scale-h - `int`
  scale-w - `int`"
  (^Upsampling2d [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^Boolean nchw ^Integer scale-h ^Integer scale-w]
    (new Upsampling2d same-diff input nchw scale-h scale-w))
  (^Upsampling2d []
    (new Upsampling2d )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Upsampling2d this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Upsampling2d this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Upsampling2d this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Upsampling2d this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

