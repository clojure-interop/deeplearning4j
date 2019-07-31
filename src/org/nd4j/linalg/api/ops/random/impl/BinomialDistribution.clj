(ns org.nd4j.linalg.api.ops.random.impl.BinomialDistribution
  "This Op generates binomial distribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl BinomialDistribution]))

(defn ->binomial-distribution
  "Constructor.

  This op fills Z with binomial distribution over given trials with single given probability for all trials

  z - `org.nd4j.linalg.api.ndarray.INDArray`
  trials - `int`
  probability - `double`"
  (^BinomialDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^Integer trials ^Double probability]
    (new BinomialDistribution z trials probability))
  (^BinomialDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^org.nd4j.linalg.api.ndarray.INDArray probabilities]
    (new BinomialDistribution z probabilities))
  (^BinomialDistribution [^org.nd4j.autodiff.samediff.SameDiff sd ^Integer trials ^Double probability shape]
    (new BinomialDistribution sd trials probability shape))
  (^BinomialDistribution []
    (new BinomialDistribution )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^BinomialDistribution this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BinomialDistribution this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^BinomialDistribution this]
    (-> this (.opName))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^BinomialDistribution this]
    (-> this (.isExecSpecial))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BinomialDistribution this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BinomialDistribution this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BinomialDistribution this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn set-z
  "Description copied from interface: Op

  z - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BinomialDistribution this ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.setZ z))))

