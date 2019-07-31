(ns org.nd4j.linalg.api.ops.impl.transforms.SELU
  "SELU activation function

 https://arxiv.org/pdf/1706.02515.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms SELU]))

(defn ->selu
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^SELU [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new SELU same-diff i-v shape in-place extra-args))
  (^SELU [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place]
    (new SELU same-diff i-v in-place))
  (^SELU [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new SELU x z))
  (^SELU [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new SELU x))
  (^SELU []
    (new SELU )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^SELU this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^SELU this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SELU this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SELU this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SELU this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

