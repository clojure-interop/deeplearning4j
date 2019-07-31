(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.CopyOp
  "Copy operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic CopyOp]))

(defn ->copy-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^CopyOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new CopyOp same-diff i-v shape in-place extra-args))
  (^CopyOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new CopyOp same-diff i-v-1 i-v-2 in-place))
  (^CopyOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new CopyOp same-diff i-v-1 i-v-2))
  (^CopyOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new CopyOp x z))
  (^CopyOp [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new CopyOp same-diff))
  (^CopyOp []
    (new CopyOp )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^CopyOp this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^CopyOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CopyOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^CopyOp this]
    (-> this (.tensorflowName))))

(defn exec
  "Description copied from interface: Op"
  ([^CopyOp this]
    (-> this (.exec))))

(defn pass-through?
  "Description copied from interface: Op

  returns: true if the op is pass through false otherwise - `boolean`"
  (^Boolean [^CopyOp this]
    (-> this (.isPassThrough))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^CopyOp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

