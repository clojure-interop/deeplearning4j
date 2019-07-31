(ns org.nd4j.linalg.api.ops.impl.broadcast.BroadcastDivOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.broadcast BroadcastDivOp]))

(defn ->broadcast-div-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  dimension - `int[]`
  extra-args - `java.lang.Object[]`"
  (^BroadcastDivOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place dimension extra-args]
    (new BroadcastDivOp same-diff i-v shape in-place dimension extra-args))
  (^BroadcastDivOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place dimension]
    (new BroadcastDivOp same-diff i-v-1 i-v-2 in-place dimension))
  (^BroadcastDivOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 dimension]
    (new BroadcastDivOp same-diff i-v-1 i-v-2 dimension))
  (^BroadcastDivOp [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new BroadcastDivOp same-diff))
  (^BroadcastDivOp []
    (new BroadcastDivOp )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BroadcastDivOp this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^BroadcastDivOp this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BroadcastDivOp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastDivOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastDivOp this]
    (-> this (.tensorflowName))))

