(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.SubOp
  "Subtraction operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic SubOp]))

(defn ->sub-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^SubOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new SubOp same-diff args in-place))
  (^SubOp [inputs outputs]
    (new SubOp inputs outputs))
  (^SubOp []
    (new SubOp )))

(def *-op-name
  "Static Constant.

  type: java.lang.String"
  SubOp/OP_NAME)

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^SubOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SubOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^SubOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^SubOp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

