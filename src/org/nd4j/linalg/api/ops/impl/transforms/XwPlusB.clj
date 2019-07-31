(ns org.nd4j.linalg.api.ops.impl.transforms.XwPlusB
  "Composed op: mmul (X, W)  b"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms XwPlusB]))

(defn ->xw-plus-b
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  input - `org.nd4j.autodiff.samediff.SDVariable`
  weights - `org.nd4j.autodiff.samediff.SDVariable`
  bias - `org.nd4j.autodiff.samediff.SDVariable`"
  (^XwPlusB [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable input ^org.nd4j.autodiff.samediff.SDVariable weights ^org.nd4j.autodiff.samediff.SDVariable bias]
    (new XwPlusB same-diff input weights bias)))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^XwPlusB this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^XwPlusB this]
    (-> this (.tensorflowName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^XwPlusB this]
    (-> this (.onnxName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  gradient - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^XwPlusB this ^java.util.List gradient]
    (-> this (.doDiff gradient))))

