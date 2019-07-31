(ns org.nd4j.linalg.api.ops.impl.layers.convolution.Upsampling2dDerivative
  "UpsamplingDerivative operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution Upsampling2dDerivative]))

(defn ->upsampling-2d-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  gradient - `org.nd4j.autodiff.samediff.SDVariable`
  nchw - `boolean`
  scale-h - `int`
  scale-w - `int`"
  (^Upsampling2dDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable gradient ^Boolean nchw ^Integer scale-h ^Integer scale-w]
    (new Upsampling2dDerivative same-diff input gradient nchw scale-h scale-w))
  (^Upsampling2dDerivative []
    (new Upsampling2dDerivative )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^Upsampling2dDerivative this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Upsampling2dDerivative this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

