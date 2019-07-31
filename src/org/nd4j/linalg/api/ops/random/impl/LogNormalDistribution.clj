(ns org.nd4j.linalg.api.ops.random.impl.LogNormalDistribution
  "This Op generates log-normal distribution over provided mean and stddev"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl LogNormalDistribution]))

(defn ->log-normal-distribution
  "Constructor.

  This op fills Z with random values within stddev..mean..stddev boundaries

  z - `org.nd4j.linalg.api.ndarray.INDArray`
  mean - `double`
  stddev - `double`"
  (^LogNormalDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^Double mean ^Double stddev]
    (new LogNormalDistribution z mean stddev))
  (^LogNormalDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^Double stddev]
    (new LogNormalDistribution z stddev))
  (^LogNormalDistribution [^org.nd4j.linalg.api.ndarray.INDArray z]
    (new LogNormalDistribution z))
  (^LogNormalDistribution [^org.nd4j.autodiff.samediff.SameDiff sd ^Double mean ^Double stdev ^Long shape]
    (new LogNormalDistribution sd mean stdev shape))
  (^LogNormalDistribution []
    (new LogNormalDistribution )))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LogNormalDistribution this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^LogNormalDistribution this]
    (-> this (.tensorflowName))))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^LogNormalDistribution this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^LogNormalDistribution this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^LogNormalDistribution this]
    (-> this (.opName))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^LogNormalDistribution this]
    (-> this (.isExecSpecial))))

(defn set-z
  "Description copied from interface: Op

  z - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^LogNormalDistribution this ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.setZ z))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^LogNormalDistribution this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

