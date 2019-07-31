(ns org.nd4j.linalg.api.ops.impl.transforms.OldIdentity
  "Identity function"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms OldIdentity]))

(defn ->old-identity
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^OldIdentity [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new OldIdentity same-diff i-v shape in-place extra-args))
  (^OldIdentity [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new OldIdentity x y z n))
  (^OldIdentity [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place]
    (new OldIdentity same-diff i-v in-place))
  (^OldIdentity [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new OldIdentity x z))
  (^OldIdentity [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new OldIdentity x))
  (^OldIdentity []
    (new OldIdentity )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^OldIdentity this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^OldIdentity this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldIdentity this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldIdentity this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^OldIdentity this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

