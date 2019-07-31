(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.bp.SquaredDifferenceBpOp
  "Backprop op for squared difference operation, i.e. backprop for (x - y) * (x - y)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic.bp SquaredDifferenceBpOp]))

(defn ->squared-difference-bp-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`"
  (^SquaredDifferenceBpOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new SquaredDifferenceBpOp same-diff args))
  (^SquaredDifferenceBpOp []
    (new SquaredDifferenceBpOp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SquaredDifferenceBpOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SquaredDifferenceBpOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SquaredDifferenceBpOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SquaredDifferenceBpOp this ^java.util.List i-v-1]
    (-> this (.doDiff i-v-1))))

