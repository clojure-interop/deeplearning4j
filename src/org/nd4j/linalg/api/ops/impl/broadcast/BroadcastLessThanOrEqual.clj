(ns org.nd4j.linalg.api.ops.impl.broadcast.BroadcastLessThanOrEqual
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.broadcast BroadcastLessThanOrEqual]))

(defn ->broadcast-less-than-or-equal
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  dimension - `int[]`
  extra-args - `java.lang.Object[]`"
  (^BroadcastLessThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place dimension extra-args]
    (new BroadcastLessThanOrEqual same-diff i-v shape in-place dimension extra-args))
  (^BroadcastLessThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place dimension]
    (new BroadcastLessThanOrEqual same-diff i-v-1 i-v-2 in-place dimension))
  (^BroadcastLessThanOrEqual [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Integer dimension]
    (new BroadcastLessThanOrEqual x y z dimension))
  (^BroadcastLessThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new BroadcastLessThanOrEqual same-diff))
  (^BroadcastLessThanOrEqual []
    (new BroadcastLessThanOrEqual )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BroadcastLessThanOrEqual this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^BroadcastLessThanOrEqual this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastLessThanOrEqual this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BroadcastLessThanOrEqual this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BroadcastLessThanOrEqual this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

