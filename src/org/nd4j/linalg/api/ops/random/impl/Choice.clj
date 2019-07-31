(ns org.nd4j.linalg.api.ops.random.impl.Choice
  "This Op implements numpy.choice method
 It fills Z from source, following probabilities for each source element"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.random.impl Choice]))

(defn ->choice
  "Constructor.

  source - `org.nd4j.linalg.api.ndarray.INDArray`
  probabilities - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^Choice [^org.nd4j.linalg.api.ndarray.INDArray source ^org.nd4j.linalg.api.ndarray.INDArray probabilities ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new Choice source probabilities z))
  (^Choice []
    (new Choice )))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^Choice this]
    (-> this (.isExecSpecial))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^Choice this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^Choice this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Choice this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^Choice this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^Choice this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

