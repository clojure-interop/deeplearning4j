(ns org.nd4j.linalg.api.ops.impl.broadcast.BroadcastGreaterThanOrEqual
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.broadcast BroadcastGreaterThanOrEqual]))

(defn ->broadcast-greater-than-or-equal
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  dimension - `int[]`
  extra-args - `java.lang.Object[]`"
  (^BroadcastGreaterThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place dimension extra-args]
    (new BroadcastGreaterThanOrEqual same-diff i-v shape in-place dimension extra-args))
  (^BroadcastGreaterThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place dimension]
    (new BroadcastGreaterThanOrEqual same-diff i-v-1 i-v-2 in-place dimension))
  (^BroadcastGreaterThanOrEqual [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Integer dimension]
    (new BroadcastGreaterThanOrEqual x y z dimension))
  (^BroadcastGreaterThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new BroadcastGreaterThanOrEqual same-diff))
  (^BroadcastGreaterThanOrEqual []
    (new BroadcastGreaterThanOrEqual )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BroadcastGreaterThanOrEqual this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^BroadcastGreaterThanOrEqual this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BroadcastGreaterThanOrEqual this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastGreaterThanOrEqual this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastGreaterThanOrEqual this]
    (-> this (.tensorflowName))))

