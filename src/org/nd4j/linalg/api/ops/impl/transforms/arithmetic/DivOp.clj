(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.DivOp
  "Division operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic DivOp]))

(defn ->div-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^DivOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new DivOp same-diff args in-place))
  (^DivOp [inputs outputs]
    (new DivOp inputs outputs))
  (^DivOp []
    (new DivOp )))

(def *-op-name
  "Static Constant.

  type: java.lang.String"
  DivOp/OP_NAME)

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^DivOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DivOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DivOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DivOp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

