(ns org.nd4j.linalg.api.ops.random.impl.BernoulliDistribution
  "BernoulliDistribution implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl BernoulliDistribution]))

(defn ->bernoulli-distribution
  "Constructor.

  This op fills Z with bernoulli trial results, so 0, or 1, depending by common probability

  z - `org.nd4j.linalg.api.ndarray.INDArray`
  prob - `double`"
  (^BernoulliDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^Double prob]
    (new BernoulliDistribution z prob))
  (^BernoulliDistribution [^org.nd4j.autodiff.samediff.SameDiff sd ^Double prob shape]
    (new BernoulliDistribution sd prob shape))
  (^BernoulliDistribution []
    (new BernoulliDistribution )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^BernoulliDistribution this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BernoulliDistribution this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^BernoulliDistribution this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BernoulliDistribution this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BernoulliDistribution this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BernoulliDistribution this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

