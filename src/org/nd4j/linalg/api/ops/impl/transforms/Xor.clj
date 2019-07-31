(ns org.nd4j.linalg.api.ops.impl.transforms.Xor
  "Boolean XOR pairwise transform"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms Xor]))

(defn ->xor
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`
  comparable - `double`"
  (^Xor [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args ^Double comparable]
    (new Xor same-diff i-v shape in-place extra-args comparable))
  (^Xor [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^java.lang.Number comparable ^Long n]
    (new Xor x y z comparable n))
  (^Xor [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place ^Double comparable]
    (new Xor same-diff i-v in-place comparable))
  (^Xor [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable ix ^org.nd4j.autodiff.samediff.SDVariable iy]
    (new Xor same-diff ix iy))
  (^Xor [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new Xor x y))
  (^Xor []
    (new Xor )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Xor this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Xor this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Xor this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Xor this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Xor this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

