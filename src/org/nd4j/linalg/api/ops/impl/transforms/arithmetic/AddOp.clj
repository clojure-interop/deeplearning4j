(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.AddOp
  "Addition operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic AddOp]))

(defn ->add-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^AddOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new AddOp same-diff args in-place))
  (^AddOp [inputs outputs]
    (new AddOp inputs outputs))
  (^AddOp []
    (new AddOp )))

(def *-op-name
  "Static Constant.

  type: java.lang.String"
  AddOp/OP_NAME)

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^AddOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^AddOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^AddOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^AddOp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

