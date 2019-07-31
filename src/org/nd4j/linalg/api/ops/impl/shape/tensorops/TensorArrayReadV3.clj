(ns org.nd4j.linalg.api.ops.impl.shape.tensorops.TensorArrayReadV3
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape.tensorops TensorArrayReadV3]))

(defn ->tensor-array-read-v-3
  "Constructor.

  name - `java.lang.String`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`"
  (^TensorArrayReadV3 [^java.lang.String name ^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new TensorArrayReadV3 name same-diff args))
  (^TensorArrayReadV3 [^org.nd4j.autodiff.samediff.SameDiff same-diff args]
    (new TensorArrayReadV3 same-diff args))
  (^TensorArrayReadV3 []
    (new TensorArrayReadV3 )))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayReadV3 this]
    (-> this (.tensorflowName))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^TensorArrayReadV3 this]
    (-> this (.opName))))

(defn execute
  "same-diff - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `org.nd4j.list.compat.TensorList`"
  (^org.nd4j.list.compat.TensorList [^TensorArrayReadV3 this ^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (-> this (.execute same-diff))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^TensorArrayReadV3 this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

