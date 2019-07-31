(ns org.nd4j.linalg.api.ops.BaseBroadcastOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops BaseBroadcastOp]))

(defn ->base-broadcast-op
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  i-v - `org.nd4j.autodiff.samediff.SDVariable`
  shape - `int[]`
  in-place - `boolean`
  dimension - `int[]`
  extra-args - `java.lang.Object[]`"
  (^BaseBroadcastOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v shape ^Boolean in-place dimension extra-args]
    (new BaseBroadcastOp same-diff i-v shape in-place dimension extra-args))
  (^BaseBroadcastOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 ^Boolean in-place dimension]
    (new BaseBroadcastOp same-diff i-v-1 i-v-2 in-place dimension))
  (^BaseBroadcastOp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v-1 ^org.nd4j.autodiff.samediff.SDVariable i-v-2 dimension]
    (new BaseBroadcastOp same-diff i-v-1 i-v-2 dimension))
  (^BaseBroadcastOp [^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (new BaseBroadcastOp same-diff)))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^BaseBroadcastOp this]
    (-> this (.opType))))

(defn calculate-output-shape
  "Calculate the output shape for this op

  returns: `java.util.List<long[]>`"
  ([^BaseBroadcastOp this]
    (-> this (.calculateOutputShape))))

(defn get-dimension
  "Description copied from interface: BroadcastOp

  returns: `int[]`"
  ([^BaseBroadcastOp this]
    (-> this (.getDimension))))

(defn set-dimension
  "Description copied from interface: BroadcastOp

  dimension - `int`"
  ([^BaseBroadcastOp this ^Integer dimension]
    (-> this (.setDimension dimension))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^BaseBroadcastOp this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^BaseBroadcastOp this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

