(ns org.nd4j.linalg.api.ops.impl.transforms.arithmetic.MergeAddOp
  "Addition operation for n operands, called \"mergeadd\" in libnd4j"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms.arithmetic MergeAddOp]))

(defn ->merge-add-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^MergeAddOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new MergeAddOp same-diff args in-place))
  (^MergeAddOp [inputs outputs]
    (new MergeAddOp inputs outputs))
  (^MergeAddOp []
    (new MergeAddOp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^MergeAddOp this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MergeAddOp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MergeAddOp this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MergeAddOp this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

