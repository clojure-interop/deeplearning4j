(ns org.nd4j.linalg.api.ops.impl.transforms.Stabilize
  "Stabilization function, forces values to be within a range"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms Stabilize]))

(defn ->stabilize
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`
  real-min - `double`
  cut-off - `double`
  k - `double`"
  (^Stabilize [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args ^Double real-min ^Double cut-off ^Double k]
    (new Stabilize same-diff i-v shape in-place extra-args real-min cut-off k))
  (^Stabilize [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place ^Double real-min ^Double cut-off ^Double k]
    (new Stabilize same-diff i-v in-place real-min cut-off k))
  (^Stabilize [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^Double k]
    (new Stabilize x y z n k))
  (^Stabilize [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n ^Double k]
    (new Stabilize x z n k))
  (^Stabilize [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double k]
    (new Stabilize x z k))
  (^Stabilize [^org.nd4j.linalg.api.ndarray.INDArray x ^Double k]
    (new Stabilize x k))
  (^Stabilize []
    (new Stabilize )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Stabilize this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Stabilize this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Stabilize this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Stabilize this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Stabilize this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

