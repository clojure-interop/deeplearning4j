(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.RDivOp
  "OldReverse Division operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic RDivOp]))

(defn ->r-div-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^RDivOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new RDivOp same-diff args in-place))
  (^RDivOp [inputs outputs]
    (new RDivOp inputs outputs))
  (^RDivOp []
    (new RDivOp )))

(def *-op-name
  "Static Constant.

  type: java.lang.String"
  RDivOp/OP_NAME)

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^RDivOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RDivOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RDivOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^RDivOp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

