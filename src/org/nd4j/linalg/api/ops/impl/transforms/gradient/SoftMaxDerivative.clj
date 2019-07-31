(ns org.nd4j.linalg.api.ops.impl.transforms.gradient.SoftMaxDerivative
  "Deprecated.
 To be replaced by SoftmaxBp"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.gradient SoftMaxDerivative]))

(defn ->soft-max-derivative
  "Constructor.

  Deprecated.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`"
  (^SoftMaxDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new SoftMaxDerivative x z n))
  (^SoftMaxDerivative [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new SoftMaxDerivative x z))
  (^SoftMaxDerivative [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new SoftMaxDerivative x))
  (^SoftMaxDerivative []
    (new SoftMaxDerivative )))

(defn op-num
  "Deprecated.

  returns: `int`"
  (^Integer [^SoftMaxDerivative this]
    (-> this (.opNum))))

(defn op-name
  "Deprecated.

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^SoftMaxDerivative this]
    (-> this (.opName))))

(defn onnx-name
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^SoftMaxDerivative this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^SoftMaxDerivative this]
    (-> this (.tensorflowName))))

(defn exec
  "Deprecated.

  dimensions - the dimensions to execute on - `int`"
  ([^SoftMaxDerivative this ^Integer dimensions]
    (-> this (.exec dimensions)))
  ([^SoftMaxDerivative this]
    (-> this (.exec))))

(defn do-diff
  "Deprecated.

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SoftMaxDerivative this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

