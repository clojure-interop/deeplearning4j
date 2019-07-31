(ns org.nd4j.linalg.api.ops.impl.transforms.TimesOneMinus
  "If x is input: output is x*(1-x)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms TimesOneMinus]))

(defn ->times-one-minus
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^TimesOneMinus [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new TimesOneMinus same-diff i-v shape in-place extra-args))
  (^TimesOneMinus [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new TimesOneMinus x y z n))
  (^TimesOneMinus [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place]
    (new TimesOneMinus same-diff i-v in-place))
  (^TimesOneMinus [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new TimesOneMinus x z))
  (^TimesOneMinus [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new TimesOneMinus x))
  (^TimesOneMinus []
    (new TimesOneMinus )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^TimesOneMinus this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^TimesOneMinus this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TimesOneMinus this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TimesOneMinus this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^TimesOneMinus this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

