(ns org.nd4j.linalg.api.ops.impl.shape.tensorops.TensorArrayV3
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape.tensorops TensorArrayV3]))

(defn ->tensor-array-v-3
  "Constructor.

  name - `java.lang.String`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`"
  (^TensorArrayV3 [^java.lang.String name ^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new TensorArrayV3 name same-diff))
  (^TensorArrayV3 [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new TensorArrayV3 same-diff))
  (^TensorArrayV3 []
    (new TensorArrayV3 )))

(defn get-same-diff
  "returns: `org.nd4j.autodiff.samediff.SameDiff`"
  (^org.nd4j.autodiff.samediff.SameDiff [^TensorArrayV3 this]
    (-> this (.getSameDiff))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^TensorArrayV3 this]
    (-> this (.opType))))

(defn unstack
  "value - `org.nd4j.autodiff.samediff.SDVariable`"
  ([^TensorArrayV3 this ^org.nd4j.autodiff.samediff.SDVariable value]
    (-> this (.unstack value))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayV3 this]
    (-> this (.opName))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayV3 this]
    (-> this (.toString))))

(defn read
  "index - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^TensorArrayV3 this ^Integer index]
    (-> this (.read index))))

(defn gather
  "indices - `int`

  returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^TensorArrayV3 this ^Integer indices]
    (-> this (.gather indices))))

(defn scatter
  "value - `org.nd4j.autodiff.samediff.SDVariable`
  indices - `int`"
  ([^TensorArrayV3 this ^org.nd4j.autodiff.samediff.SDVariable value ^Integer indices]
    (-> this (.scatter value indices))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayV3 this]
    (-> this (.tensorflowName))))

(defn concat
  "returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^TensorArrayV3 this]
    (-> this (.concat))))

(defn execute
  "same-diff - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `org.nd4j.list.compat.TensorList`"
  (^org.nd4j.list.compat.TensorList [^TensorArrayV3 this ^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (-> this (.execute same-diff))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^TensorArrayV3 this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn write
  "index - `int`
  value - `org.nd4j.autodiff.samediff.SDVariable`"
  ([^TensorArrayV3 this ^Integer index ^org.nd4j.autodiff.samediff.SDVariable value]
    (-> this (.write index value))))

(defn stack
  "returns: `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^TensorArrayV3 this]
    (-> this (.stack))))

