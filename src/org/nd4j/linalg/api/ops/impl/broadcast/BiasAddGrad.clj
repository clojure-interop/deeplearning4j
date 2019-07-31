(ns org.nd4j.linalg.api.ops.impl.broadcast.BiasAddGrad
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.broadcast BiasAddGrad]))

(defn ->bias-add-grad
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  bias - `org.nd4j.autodiff.samediff.SDVariable`
  gradient - `org.nd4j.autodiff.samediff.SDVariable`"
  (^BiasAddGrad [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable bias ^org.nd4j.autodiff.samediff.SDVariable gradient]
    (new BiasAddGrad same-diff input bias gradient))
  (^BiasAddGrad []
    (new BiasAddGrad )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^BiasAddGrad this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^BiasAddGrad this]
    (-> this (.opName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BiasAddGrad this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BiasAddGrad this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BiasAddGrad this]
    (-> this (.tensorflowName))))

