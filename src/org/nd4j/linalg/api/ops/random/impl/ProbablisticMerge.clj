(ns org.nd4j.linalg.api.ops.random.impl.ProbablisticMerge
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl ProbablisticMerge]))

(defn ->probablistic-merge
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  probability - `double`"
  (^ProbablisticMerge [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Double probability]
    (new ProbablisticMerge x y z probability))
  (^ProbablisticMerge [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Double probability]
    (new ProbablisticMerge x y probability))
  (^ProbablisticMerge []
    (new ProbablisticMerge )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^ProbablisticMerge this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^ProbablisticMerge this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ProbablisticMerge this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ProbablisticMerge this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^ProbablisticMerge this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

