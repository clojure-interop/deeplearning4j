(ns org.nd4j.linalg.api.ops.impl.scalar.ScalarFMod
  "Scalar floating-point remainder (fmod aka 'floormod')"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.scalar ScalarFMod]))

(defn ->scalar-f-mod
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`
  num - `java.lang.Number`"
  (^ScalarFMod [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^java.lang.Number num]
    (new ScalarFMod x y z n num))
  (^ScalarFMod [^org.nd4j.autodiff.samediff.SameDiff sd ^org.nd4j.autodiff.samediff.SDVariable in ^java.lang.Number number]
    (new ScalarFMod sd in number))
  (^ScalarFMod [^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.Number num]
    (new ScalarFMod x num))
  (^ScalarFMod []
    (new ScalarFMod )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ScalarFMod this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ScalarFMod this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarFMod this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ScalarFMod this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ScalarFMod this ^java.util.List i-v-1]
    (-> this (.doDiff i-v-1))))

