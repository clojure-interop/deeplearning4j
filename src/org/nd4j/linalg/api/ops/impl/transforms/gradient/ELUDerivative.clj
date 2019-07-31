(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.ELUDerivative
  "Derivative of ELU: Exponential Linear Unit (alpha=1.0)
 Introduced in paper:
 Fast and Accurate Deep Network Learning by Exponential Linear Units (ELUs)
 Djork-Arné Clevert, Thomas Unterthiner, Sepp Hochreiter (2015)
 http://arxiv.org/abs/1511.07289"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient ELUDerivative]))

(defn ->elu-derivative
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^ELUDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new ELUDerivative same-diff i-v shape in-place extra-args))
  (^ELUDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new ELUDerivative x y z n))
  (^ELUDerivative [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place]
    (new ELUDerivative same-diff i-v in-place))
  (^ELUDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new ELUDerivative x z))
  (^ELUDerivative [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new ELUDerivative x))
  (^ELUDerivative []
    (new ELUDerivative )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ELUDerivative this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ELUDerivative this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ELUDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ELUDerivative this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ELUDerivative this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

