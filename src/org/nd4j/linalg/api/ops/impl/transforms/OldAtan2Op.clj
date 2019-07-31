(ns org.nd4j.linalg.api.ops.impl.transforms.OldAtan2Op
  "atan2 operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms OldAtan2Op]))

(defn ->old-atan-2-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^OldAtan2Op [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new OldAtan2Op same-diff i-v shape in-place extra-args))
  (^OldAtan2Op [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new OldAtan2Op same-diff i-v-1 i-v-2 in-place))
  (^OldAtan2Op [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new OldAtan2Op same-diff i-v-1 i-v-2))
  (^OldAtan2Op [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new OldAtan2Op x y))
  (^OldAtan2Op [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new OldAtan2Op same-diff))
  (^OldAtan2Op []
    (new OldAtan2Op )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^OldAtan2Op this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^OldAtan2Op this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldAtan2Op this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldAtan2Op this]
    (-> this (.tensorflowName))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^OldAtan2Op this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^OldAtan2Op this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

