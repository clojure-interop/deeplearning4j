(ns org.nd4j.linalg.api.ops.random.impl.AlphaDropOut
  "AlphaDropOut implementation as Op"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl AlphaDropOut]))

(defn ->alpha-drop-out
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  p - `double`
  alpha - `double`
  alpha-prime - `double`
  beta - `double`
  n - `long`"
  (^AlphaDropOut [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double p ^Double alpha ^Double alpha-prime ^Double beta ^Long n]
    (new AlphaDropOut x z p alpha alpha-prime beta n))
  (^AlphaDropOut [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double p ^Double alpha ^Double alpha-prime ^Double beta]
    (new AlphaDropOut x z p alpha alpha-prime beta))
  (^AlphaDropOut [^org.nd4j.linalg.api.ndarray.INDArray x ^Double p ^Double alpha ^Double alpha-prime ^Double beta]
    (new AlphaDropOut x p alpha alpha-prime beta))
  (^AlphaDropOut []
    (new AlphaDropOut )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^AlphaDropOut this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^AlphaDropOut this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^AlphaDropOut this]
    (-> this (.opName))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^AlphaDropOut this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^AlphaDropOut this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^AlphaDropOut this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^AlphaDropOut this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

