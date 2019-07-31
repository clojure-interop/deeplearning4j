(ns org.nd4j.linalg.api.ops.random.impl.BinomialDistributionEx
  "This Op generates binomial distribution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl BinomialDistributionEx]))

(defn ->binomial-distribution-ex
  "Constructor.

  This op fills Z with binomial distribution over given trials with single given probability for all trials

  z - `org.nd4j.linalg.api.ndarray.INDArray`
  trials - `int`
  probability - `double`"
  (^BinomialDistributionEx [^org.nd4j.linalg.api.ndarray.INDArray z ^Integer trials ^Double probability]
    (new BinomialDistributionEx z trials probability))
  (^BinomialDistributionEx [^org.nd4j.linalg.api.ndarray.INDArray z ^org.nd4j.linalg.api.ndarray.INDArray probabilities]
    (new BinomialDistributionEx z probabilities))
  (^BinomialDistributionEx []
    (new BinomialDistributionEx )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^BinomialDistributionEx this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BinomialDistributionEx this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^BinomialDistributionEx this]
    (-> this (.opName))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^BinomialDistributionEx this]
    (-> this (.isExecSpecial))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BinomialDistributionEx this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BinomialDistributionEx this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BinomialDistributionEx this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

