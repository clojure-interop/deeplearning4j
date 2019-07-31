(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.Axpy
  "Level 1 blas op Axpy as libnd4j native op"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic Axpy]))

(defn ->axpy
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`
  p - `double`"
  (^Axpy [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args ^Double p]
    (new Axpy same-diff i-v shape in-place extra-args p))
  (^Axpy [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place ^Double p]
    (new Axpy same-diff i-v-1 i-v-2 in-place p))
  (^Axpy [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Double p]
    (new Axpy same-diff i-v-1 i-v-2 p))
  (^Axpy [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double p]
    (new Axpy x z p))
  (^Axpy [^org.nd4j.autodiff.samediff.SameDiff same-diff ^Double p]
    (new Axpy same-diff p))
  (^Axpy []
    (new Axpy )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Axpy this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Axpy this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Axpy this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Axpy this]
    (-> this (.tensorflowName))))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Axpy this]
    (-> this (.propertiesForFunction))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^Axpy this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Axpy this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

