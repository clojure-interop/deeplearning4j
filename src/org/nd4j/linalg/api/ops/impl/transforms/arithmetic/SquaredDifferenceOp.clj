(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.SquaredDifferenceOp
  "Squared difference operation, i.e. returns (x - y) * (x - y)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic SquaredDifferenceOp]))

(defn ->squared-difference-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^SquaredDifferenceOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new SquaredDifferenceOp same-diff args in-place))
  (^SquaredDifferenceOp [inputs outputs]
    (new SquaredDifferenceOp inputs outputs))
  (^SquaredDifferenceOp []
    (new SquaredDifferenceOp )))

(def *-op-name
  "Static Constant.

  type: java.lang.String"
  SquaredDifferenceOp/OP_NAME)

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SquaredDifferenceOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SquaredDifferenceOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SquaredDifferenceOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SquaredDifferenceOp this ^java.util.List i-v-1]
    (-> this (.doDiff i-v-1))))

