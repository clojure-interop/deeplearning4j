(ns org.nd4j.linalg.api.ops.impl.transforms.IsMax
  "[1, 2, 3, 1] -> [0, 0, 1, 0]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms IsMax]))

(defn ->is-max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^IsMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new IsMax same-diff i-v shape in-place extra-args))
  (^IsMax [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new IsMax x y z n))
  (^IsMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place]
    (new IsMax same-diff i-v in-place))
  (^IsMax [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new IsMax x z))
  (^IsMax [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new IsMax x))
  (^IsMax []
    (new IsMax )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^IsMax this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^IsMax this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IsMax this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^IsMax this]
    (-> this (.tensorflowName))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^IsMax this]
    (-> this (.isExecSpecial))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^IsMax this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

