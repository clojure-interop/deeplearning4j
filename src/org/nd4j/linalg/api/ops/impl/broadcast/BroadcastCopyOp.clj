(ns org.nd4j.linalg.api.ops.impl.broadcast.BroadcastCopyOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.broadcast BroadcastCopyOp]))

(defn ->broadcast-copy-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  dimension - `int[]`
  extra-args - `java.lang.Object[]`"
  (^BroadcastCopyOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place dimension extra-args]
    (new BroadcastCopyOp same-diff i-v shape in-place dimension extra-args))
  (^BroadcastCopyOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place dimension]
    (new BroadcastCopyOp same-diff i-v-1 i-v-2 in-place dimension))
  (^BroadcastCopyOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 dimension]
    (new BroadcastCopyOp same-diff i-v-1 i-v-2 dimension))
  (^BroadcastCopyOp [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new BroadcastCopyOp same-diff))
  (^BroadcastCopyOp []
    (new BroadcastCopyOp )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BroadcastCopyOp this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^BroadcastCopyOp this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BroadcastCopyOp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastCopyOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastCopyOp this]
    (-> this (.tensorflowName))))
