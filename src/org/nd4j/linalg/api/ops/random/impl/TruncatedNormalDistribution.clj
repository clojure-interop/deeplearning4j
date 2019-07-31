(ns org.nd4j.linalg.api.ops.random.impl.TruncatedNormalDistribution
  "This Op generates truncated normal distribution over provided mean and stddev"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl TruncatedNormalDistribution]))

(defn ->truncated-normal-distribution
  "Constructor.

  This op fills Z with random values within stddev..mean..stddev boundaries

  z - `org.nd4j.linalg.api.ndarray.INDArray`
  mean - `double`
  stddev - `double`"
  (^TruncatedNormalDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^Double mean ^Double stddev]
    (new TruncatedNormalDistribution z mean stddev))
  (^TruncatedNormalDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^Double stddev]
    (new TruncatedNormalDistribution z stddev))
  (^TruncatedNormalDistribution [^org.nd4j.linalg.api.ndarray.INDArray z]
    (new TruncatedNormalDistribution z))
  (^TruncatedNormalDistribution [^org.nd4j.autodiff.samediff.SameDiff sd ^Double mean ^Double stddev shape]
    (new TruncatedNormalDistribution sd mean stddev shape))
  (^TruncatedNormalDistribution []
    (new TruncatedNormalDistribution )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^TruncatedNormalDistribution this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^TruncatedNormalDistribution this]
    (-> this (.opName))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^TruncatedNormalDistribution this]
    (-> this (.isExecSpecial))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TruncatedNormalDistribution this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TruncatedNormalDistribution this]
    (-> this (.tensorflowName))))

(defn set-z
  "Description copied from interface: Op

  z - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^TruncatedNormalDistribution this ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.setZ z))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^TruncatedNormalDistribution this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

