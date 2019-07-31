(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.RSubOp
  "Reverse subtraction operation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic RSubOp]))

(defn ->r-sub-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v-1 - `org.nd4j.autodiff.samediff.SDVariable`
  i-v-2 - `org.nd4j.autodiff.samediff.SDVariable`
  in-place - `boolean`"
  (^RSubOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place]
    (new RSubOp same-diff i-v-1 i-v-2 in-place))
  (^RSubOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new RSubOp same-diff args in-place))
  (^RSubOp [inputs outputs]
    (new RSubOp inputs outputs))
  (^RSubOp []
    (new RSubOp )))

(def *-op-name
  "Static Constant.

  type: java.lang.String"
  RSubOp/OP_NAME)

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^RSubOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RSubOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RSubOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^RSubOp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

