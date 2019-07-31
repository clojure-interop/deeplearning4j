(ns org.nd4j.linalg.api.ops.impl.shape.tensorops.TensorArrayGatherV3
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape.tensorops TensorArrayGatherV3]))

(defn ->tensor-array-gather-v-3
  "Constructor.

  name - `java.lang.String`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`"
  (^TensorArrayGatherV3 [^java.lang.String name ^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new TensorArrayGatherV3 name same-diff args))
  (^TensorArrayGatherV3 [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new TensorArrayGatherV3 same-diff args))
  (^TensorArrayGatherV3 []
    (new TensorArrayGatherV3 )))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayGatherV3 this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayGatherV3 this]
    (-> this (.tensorflowName))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayGatherV3 this]
    (-> this (.toString))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayGatherV3 this]
    (-> this (.opName))))

(defn execute
  "same-diff - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `org.nd4j.list.compat.TensorList`"
  (^org.nd4j.list.compat.TensorList [^TensorArrayGatherV3 this ^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (-> this (.execute same-diff))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^TensorArrayGatherV3 this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^TensorArrayGatherV3 this]
    (-> this (.opType))))

