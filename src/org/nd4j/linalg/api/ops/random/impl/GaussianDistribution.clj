(ns org.nd4j.linalg.api.ops.random.impl.GaussianDistribution
  "This Op generates normal distribution over provided mean and stddev"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl GaussianDistribution]))

(defn ->gaussian-distribution
  "Constructor.

  This op fills Z with random values within stddev..mean..stddev boundaries

  z - `org.nd4j.linalg.api.ndarray.INDArray`
  mean - `double`
  stddev - `double`"
  (^GaussianDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^Double mean ^Double stddev]
    (new GaussianDistribution z mean stddev))
  (^GaussianDistribution [^org.nd4j.linalg.api.ndarray.INDArray z ^Double stddev]
    (new GaussianDistribution z stddev))
  (^GaussianDistribution [^org.nd4j.linalg.api.ndarray.INDArray z]
    (new GaussianDistribution z))
  (^GaussianDistribution [^org.nd4j.autodiff.samediff.SameDiff sd ^Double mean ^Double stddev shape]
    (new GaussianDistribution sd mean stddev shape))
  (^GaussianDistribution []
    (new GaussianDistribution )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^GaussianDistribution this]
    (-> this (.opNum))))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^GaussianDistribution this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^GaussianDistribution this]
    (-> this (.opName))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^GaussianDistribution this]
    (-> this (.isExecSpecial))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GaussianDistribution this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GaussianDistribution this]
    (-> this (.tensorflowName))))

(defn set-z
  "Description copied from interface: Op

  z - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GaussianDistribution this ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.setZ z))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^GaussianDistribution this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

