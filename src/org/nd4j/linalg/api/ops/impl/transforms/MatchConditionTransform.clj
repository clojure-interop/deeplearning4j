(ns org.nd4j.linalg.api.ops.impl.transforms.MatchConditionTransform
  "Absolute sum the components"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms MatchConditionTransform]))

(defn ->match-condition-transform
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  eps - `double`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`"
  (^MatchConditionTransform [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Double eps ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new MatchConditionTransform x z eps condition))
  (^MatchConditionTransform [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable in ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new MatchConditionTransform same-diff in condition))
  (^MatchConditionTransform [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (new MatchConditionTransform x condition))
  (^MatchConditionTransform []
    (new MatchConditionTransform )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^MatchConditionTransform this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^MatchConditionTransform this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MatchConditionTransform this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^MatchConditionTransform this]
    (-> this (.tensorflowName))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^MatchConditionTransform this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

