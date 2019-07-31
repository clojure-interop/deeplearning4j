(ns org.nd4j.linalg.api.ops.impl.accum.MatchCondition
  "This operation returns number of elements matching specified condition"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.accum MatchCondition]))

(defn ->match-condition
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  in - `org.nd4j.autodiff.samediff.SDVariable`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`
  keep-dims - `boolean`
  dimensions - `int`"
  (^MatchCondition [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition ^Boolean keep-dims ^Integer dimensions]
    (new MatchCondition same-diff in condition keep-dims dimensions))
  (^MatchCondition [^org.nd4j.linalg.api.ndarray.INDArray x ^Double eps ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new MatchCondition x eps condition))
  (^MatchCondition [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new MatchCondition x condition))
  (^MatchCondition []
    (new MatchCondition )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^MatchCondition this]
    (-> this (.propertiesForFunction))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^MatchCondition this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^MatchCondition this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MatchCondition this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MatchCondition this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MatchCondition this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn get-op-type
  "returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^MatchCondition this]
    (-> this (.getOpType))))

