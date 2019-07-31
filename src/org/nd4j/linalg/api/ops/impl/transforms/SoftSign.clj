(ns org.nd4j.linalg.api.ops.impl.transforms.SoftSign
  "Softsign element-wise activation function. f(x) = x/(1+abs(x))
 Similar in shape to tanh but may outperform it due to
 'gentler' nonlinearity (smoother asymptotes).
 See for example: http://jmlr.org/proceedings/papers/v9/glorot10a/glorot10a.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms SoftSign]))

(defn ->soft-sign
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`"
  (^SoftSign [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args]
    (new SoftSign same-diff i-v shape in-place extra-args))
  (^SoftSign [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new SoftSign x y z n))
  (^SoftSign [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place]
    (new SoftSign same-diff i-v in-place))
  (^SoftSign [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new SoftSign x z))
  (^SoftSign [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new SoftSign x))
  (^SoftSign []
    (new SoftSign )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^SoftSign this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^SoftSign this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SoftSign this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SoftSign this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SoftSign this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

