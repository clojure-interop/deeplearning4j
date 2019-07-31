(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MulOp
  "Multiplication operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic MulOp]))

(defn ->mul-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^MulOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new MulOp same-diff args in-place))
  (^MulOp [inputs outputs]
    (new MulOp inputs outputs))
  (^MulOp []
    (new MulOp )))

(def *-op-name
  "Static Constant.

  type: java.lang.String"
  MulOp/OP_NAME)

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MulOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MulOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MulOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MulOp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

