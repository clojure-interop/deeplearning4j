(ns org.nd4j.linalg.api.ops.impl.transforms.LeakyReLU
  "Leaky Rectified linear unit. Default alpha=0.01, cutoff=0
 Out(x) = alpha*x if x<0
 Out(x) = x if x >= 0
 Leaky ReLU may avoid zero gradient \"dying ReLU\" problem by having non-zero
 gradient below 0.
 See for example http://arxiv.org/abs/1505.00853 for a comparison of
 ReLU variants."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms LeakyReLU]))

(defn ->leaky-re-lu
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`
  alpha - `double`"
  (^LeakyReLU [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args ^Double alpha]
    (new LeakyReLU same-diff i-v shape in-place extra-args alpha))
  (^LeakyReLU [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^Double alpha]
    (new LeakyReLU x y z n alpha))
  (^LeakyReLU [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place ^Double alpha]
    (new LeakyReLU same-diff i-v in-place alpha))
  (^LeakyReLU [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double alpha]
    (new LeakyReLU x z alpha))
  (^LeakyReLU [^org.nd4j.linalg.api.ndarray.INDArray x ^Double alpha]
    (new LeakyReLU x alpha))
  (^LeakyReLU [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new LeakyReLU x))
  (^LeakyReLU []
    (new LeakyReLU )))

(def *-default-alpha
  "Static Constant.

  type: double"
  LeakyReLU/DEFAULT_ALPHA)

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^LeakyReLU this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^LeakyReLU this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^LeakyReLU this]
    (-> this (.opName))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^LeakyReLU this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LeakyReLU this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LeakyReLU this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LeakyReLU this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

