(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.RealDivOp
  "RealDivision operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic RealDivOp]))

(defn ->real-div-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^RealDivOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new RealDivOp same-diff args in-place))
  (^RealDivOp [inputs outputs]
    (new RealDivOp inputs outputs))
  (^RealDivOp []
    (new RealDivOp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^RealDivOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RealDivOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RealDivOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^RealDivOp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

