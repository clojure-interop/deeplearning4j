(ns org.nd4j.linalg.api.ops.impl.broadcast.BroadcastRDivOp
  "Broadcast reverse divide"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.broadcast BroadcastRDivOp]))

(defn ->broadcast-r-div-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  dimension - `int[]`
  extra-args - `java.lang.Object[]`"
  (^BroadcastRDivOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place dimension extra-args]
    (new BroadcastRDivOp same-diff i-v shape in-place dimension extra-args))
  (^BroadcastRDivOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place dimension]
    (new BroadcastRDivOp same-diff i-v-1 i-v-2 in-place dimension))
  (^BroadcastRDivOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Integer dimension]
    (new BroadcastRDivOp x y z dimension))
  (^BroadcastRDivOp [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new BroadcastRDivOp same-diff))
  (^BroadcastRDivOp []
    (new BroadcastRDivOp )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BroadcastRDivOp this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^BroadcastRDivOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastRDivOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastRDivOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BroadcastRDivOp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

