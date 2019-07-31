(ns org.nd4j.linalg.api.ops.impl.transforms.SoftPlus
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms SoftPlus]))

(defn ->soft-plus
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^SoftPlus [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new SoftPlus same-diff i-v shape in-place extra-args))
  (^SoftPlus [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new SoftPlus x y z n))
  (^SoftPlus [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place]
    (new SoftPlus same-diff i-v in-place))
  (^SoftPlus [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new SoftPlus x z))
  (^SoftPlus [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new SoftPlus x))
  (^SoftPlus []
    (new SoftPlus )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^SoftPlus this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^SoftPlus this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SoftPlus this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SoftPlus this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SoftPlus this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

