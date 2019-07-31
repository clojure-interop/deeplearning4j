(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.OldMulOp
  "Multiplication operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic OldMulOp]))

(defn ->old-mul-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v-1 - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^OldMulOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new OldMulOp same-diff i-v-1 i-v-2 in-place))
  (^OldMulOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new OldMulOp same-diff i-v-1 i-v-2))
  (^OldMulOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new OldMulOp x z))
  (^OldMulOp [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new OldMulOp x))
  (^OldMulOp []
    (new OldMulOp )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^OldMulOp this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^OldMulOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldMulOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^OldMulOp this]
    (-> this (.tensorflowName))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^OldMulOp this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^OldMulOp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

