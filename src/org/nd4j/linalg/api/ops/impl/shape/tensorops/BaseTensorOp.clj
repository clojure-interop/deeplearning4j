(ns org.nd4j.linalg.api.ops.impl.shape.tensorops.BaseTensorOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape.tensorops BaseTensorOp]))

(defn ->base-tensor-op
  "Constructor.

  name - `java.lang.String`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`"
  (^BaseTensorOp [^java.lang.String name ^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new BaseTensorOp name same-diff args))
  (^BaseTensorOp [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new BaseTensorOp same-diff args))
  (^BaseTensorOp []
    (new BaseTensorOp )))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^BaseTensorOp this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^BaseTensorOp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn execute
  "same-diff - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `org.nd4j.list.compat.TensorList`"
  (^org.nd4j.list.compat.TensorList [^BaseTensorOp this ^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (-> this (.execute same-diff))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^BaseTensorOp this]
    (-> this (.opType))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^BaseTensorOp this]
    (-> this (.onnxName))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseTensorOp this]
    (-> this (.toString))))

