(ns org.nd4j.linalg.api.ops.impl.transforms.LegacyDropOutInverted
  "Inverted DropOut implementation as Op
 PLEASE NOTE: This is legacy DropOutInverted implementation, please consider using op with the same opName from randomOps"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms LegacyDropOutInverted]))

(defn ->legacy-drop-out-inverted
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `long[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`
  p - `double`"
  (^LegacyDropOutInverted [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args ^Double p]
    (new LegacyDropOutInverted same-diff i-v shape in-place extra-args p))
  (^LegacyDropOutInverted [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place ^Double p]
    (new LegacyDropOutInverted same-diff i-v in-place p))
  (^LegacyDropOutInverted [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double p]
    (new LegacyDropOutInverted x z p))
  (^LegacyDropOutInverted [^org.nd4j.linalg.api.ndarray.INDArray x ^Double p]
    (new LegacyDropOutInverted x p))
  (^LegacyDropOutInverted []
    (new LegacyDropOutInverted )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^LegacyDropOutInverted this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^LegacyDropOutInverted this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LegacyDropOutInverted this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LegacyDropOutInverted this]
    (-> this (.tensorflowName))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^LegacyDropOutInverted this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LegacyDropOutInverted this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

