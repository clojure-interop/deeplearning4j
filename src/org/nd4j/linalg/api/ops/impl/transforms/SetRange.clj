(ns org.nd4j.linalg.api.ops.impl.transforms.SetRange
  "Set range to a particular set of values"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms SetRange]))

(defn ->set-range
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`
  min - `double`
  max - `double`"
  (^SetRange [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args ^Double min ^Double max]
    (new SetRange same-diff i-v shape in-place extra-args min max))
  (^SetRange [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^Double min ^Double max]
    (new SetRange x y z n min max))
  (^SetRange [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place ^Double min ^Double max]
    (new SetRange same-diff i-v in-place min max))
  (^SetRange [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double min ^Double max]
    (new SetRange x z min max))
  (^SetRange [^org.nd4j.linalg.api.ndarray.INDArray x ^Double min ^Double max]
    (new SetRange x min max))
  (^SetRange [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new SetRange x))
  (^SetRange []
    (new SetRange )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^SetRange this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^SetRange this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SetRange this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SetRange this]
    (-> this (.tensorflowName))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^SetRange this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SetRange this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

