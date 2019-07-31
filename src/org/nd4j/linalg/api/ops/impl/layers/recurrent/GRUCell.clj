(ns org.nd4j.linalg.api.ops.impl.layers.recurrent.GRUCell
  "GRU cell for RNNs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.recurrent GRUCell]))

(defn ->gru-cell
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  configuration - `org.nd4j.linalg.api.ops.impl.layers.recurrent.config.GRUCellConfiguration`"
  (^GRUCell [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.linalg.api.ops.impl.layers.recurrent.config.GRUCellConfiguration configuration]
    (new GRUCell same-diff configuration))
  (^GRUCell []
    (new GRUCell )))

(defn properties-for-function
  "Description copied from class: DifferentialFunction

  returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^GRUCell this]
    (-> this (.propertiesForFunction))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^GRUCell this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GRUCell this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^GRUCell this]
    (-> this (.tensorflowName))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^GRUCell this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^GRUCell this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn onnx-names
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String[]`"
  ([^GRUCell this]
    (-> this (.onnxNames))))

