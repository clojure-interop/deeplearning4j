(ns org.nd4j.linalg.api.ops.impl.transforms.MaxOut
  "Max out activation:
 http://arxiv.org/pdf/1302.4389.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms MaxOut]))

(defn ->max-out
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`
  max - `java.lang.Number`"
  (^MaxOut [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args ^java.lang.Number max]
    (new MaxOut same-diff i-v shape in-place extra-args max))
  (^MaxOut [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place ^java.lang.Number max]
    (new MaxOut same-diff i-v in-place max))
  (^MaxOut [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new MaxOut x z n))
  (^MaxOut [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new MaxOut x z))
  (^MaxOut [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new MaxOut x))
  (^MaxOut []
    (new MaxOut )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^MaxOut this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^MaxOut this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MaxOut this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MaxOut this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MaxOut this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

