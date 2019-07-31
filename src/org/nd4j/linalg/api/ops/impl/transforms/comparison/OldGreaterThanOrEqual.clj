(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.OldGreaterThanOrEqual
  "Bit mask over the ndarrays as to whether
 the components are greater than or equal or not"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison OldGreaterThanOrEqual]))

(defn ->old-greater-than-or-equal
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^OldGreaterThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new OldGreaterThanOrEqual same-diff i-v shape in-place extra-args))
  (^OldGreaterThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new OldGreaterThanOrEqual same-diff i-v-1 i-v-2 in-place))
  (^OldGreaterThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new OldGreaterThanOrEqual same-diff i-v-1 i-v-2))
  (^OldGreaterThanOrEqual [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new OldGreaterThanOrEqual x z))
  (^OldGreaterThanOrEqual [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new OldGreaterThanOrEqual same-diff))
  (^OldGreaterThanOrEqual []
    (new OldGreaterThanOrEqual )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^OldGreaterThanOrEqual this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^OldGreaterThanOrEqual this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldGreaterThanOrEqual this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldGreaterThanOrEqual this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^OldGreaterThanOrEqual this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

