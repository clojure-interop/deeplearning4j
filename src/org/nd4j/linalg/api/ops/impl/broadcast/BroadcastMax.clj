(ns org.nd4j.linalg.api.ops.impl.broadcast.BroadcastMax
  "Broadcast Max comparison op"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.broadcast BroadcastMax]))

(defn ->broadcast-max
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  dimension - `int[]`
  extra-args - `java.lang.Object[]`"
  (^BroadcastMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place dimension extra-args]
    (new BroadcastMax same-diff i-v shape in-place dimension extra-args))
  (^BroadcastMax [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place dimension]
    (new BroadcastMax same-diff i-v-1 i-v-2 in-place dimension))
  (^BroadcastMax [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Integer dimension]
    (new BroadcastMax x y z dimension))
  (^BroadcastMax [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new BroadcastMax same-diff))
  (^BroadcastMax []
    (new BroadcastMax )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BroadcastMax this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^BroadcastMax this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastMax this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastMax this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BroadcastMax this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

