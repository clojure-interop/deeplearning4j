(ns org.nd4j.linalg.api.ops.impl.transforms.BinaryMinimalRelativeError
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms BinaryMinimalRelativeError]))

(defn ->binary-minimal-relative-error
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  threshold-relative - `double`
  threshold-absolute - `double`
  n - `long`"
  (^BinaryMinimalRelativeError [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Double threshold-relative ^Double threshold-absolute ^Long n]
    (new BinaryMinimalRelativeError x y z threshold-relative threshold-absolute n))
  (^BinaryMinimalRelativeError [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new BinaryMinimalRelativeError same-diff i-v shape in-place extra-args))
  (^BinaryMinimalRelativeError [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new BinaryMinimalRelativeError same-diff i-v-1 i-v-2 in-place))
  (^BinaryMinimalRelativeError [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2]
    (new BinaryMinimalRelativeError same-diff i-v-1 i-v-2))
  (^BinaryMinimalRelativeError [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new BinaryMinimalRelativeError same-diff))
  (^BinaryMinimalRelativeError []
    (new BinaryMinimalRelativeError )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BinaryMinimalRelativeError this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^BinaryMinimalRelativeError this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BinaryMinimalRelativeError this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BinaryMinimalRelativeError this]
    (-> this (.tensorflowName))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^BinaryMinimalRelativeError this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BinaryMinimalRelativeError this ^java.util.List i-v-1]
    (-> this (.doDiff i-v-1))))

