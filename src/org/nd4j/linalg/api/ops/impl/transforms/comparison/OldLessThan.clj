(ns org.nd4j.linalg.api.ops.impl.transforms.comparison.OldLessThan
  "Bit mask over the ndarrays as to whether
 the components are less than or not"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.comparison OldLessThan]))

(defn ->old-less-than
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^OldLessThan [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new OldLessThan same-diff i-v shape in-place extra-args))
  (^OldLessThan [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new OldLessThan same-diff i-v-1 i-v-2 in-place))
  (^OldLessThan [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new OldLessThan same-diff i-v-1 i-v-2))
  (^OldLessThan [^org.nd4j.linalg.api.ndarray.INDArray nd-array ^org.nd4j.linalg.api.ndarray.INDArray dup]
    (new OldLessThan nd-array dup))
  (^OldLessThan [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new OldLessThan same-diff))
  (^OldLessThan []
    (new OldLessThan )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^OldLessThan this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^OldLessThan this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldLessThan this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldLessThan this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^OldLessThan this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

