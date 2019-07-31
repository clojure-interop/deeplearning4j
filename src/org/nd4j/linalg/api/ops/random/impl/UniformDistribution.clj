(ns org.nd4j.linalg.api.ops.random.impl.UniformDistribution
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl UniformDistribution]))

(defn ->uniform-distribution
  "Constructor.

  This op fills Z with random values within from...to boundaries

  z - `org.nd4j.linalg.api.ndarray.INDArray`
  from - `double`
  to - `double`"
  (^UniformDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^Double from ^Double to]
    (new UniformDistribution z from to))
  (^UniformDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^Double to]
    (new UniformDistribution z to))
  (^UniformDistribution [^org.nd4j.linalg.api.ndarray.INDArray z]
    (new UniformDistribution z))
  (^UniformDistribution [^org.nd4j.autodiff.samediff.SameDiff sd ^Double from ^Double to shape]
    (new UniformDistribution sd from to shape))
  (^UniformDistribution []
    (new UniformDistribution )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^UniformDistribution this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^UniformDistribution this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^UniformDistribution this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^UniformDistribution this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^UniformDistribution this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

