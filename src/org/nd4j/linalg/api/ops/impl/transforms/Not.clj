(ns org.nd4j.linalg.api.ops.impl.transforms.Not
  "Boolean AND pairwise transform"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms Not]))

(defn ->not
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  extra-args - `java.lang.Object[]`
  comparable - `double`"
  (^Not [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place extra-args ^Double comparable]
    (new Not same-diff i-v shape in-place extra-args comparable))
  (^Not [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place ^Double comparable]
    (new Not same-diff i-v in-place comparable))
  (^Not [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^java.lang.Number comparable]
    (new Not x z comparable))
  (^Not [^org.nd4j.linalg.api.ndarray.INDArray x ^java.lang.Number comparable]
    (new Not x comparable))
  (^Not [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new Not x))
  (^Not []
    (new Not )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Not this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Not this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Not this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Not this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Not this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

