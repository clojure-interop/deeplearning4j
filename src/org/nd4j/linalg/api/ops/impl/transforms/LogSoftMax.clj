(ns org.nd4j.linalg.api.ops.impl.transforms.LogSoftMax
  "Log(softmax(X))"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms LogSoftMax]))

(defn ->log-soft-max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^LogSoftMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new LogSoftMax same-diff i-v shape in-place extra-args))
  (^LogSoftMax [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new LogSoftMax x y z n))
  (^LogSoftMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place]
    (new LogSoftMax same-diff i-v in-place))
  (^LogSoftMax [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new LogSoftMax x z))
  (^LogSoftMax [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new LogSoftMax x))
  (^LogSoftMax []
    (new LogSoftMax )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^LogSoftMax this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^LogSoftMax this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LogSoftMax this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LogSoftMax this]
    (-> this (.tensorflowName))))

(defn exec
  "Description copied from interface: Op

  dimensions - the dimensions to execute on - `int`"
  ([^LogSoftMax this ^Integer dimensions]
    (-> this (.exec dimensions)))
  ([^LogSoftMax this]
    (-> this (.exec))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^LogSoftMax this]
    (-> this (.isExecSpecial))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LogSoftMax this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

