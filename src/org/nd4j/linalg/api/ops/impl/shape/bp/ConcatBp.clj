(ns org.nd4j.linalg.api.ops.impl.shape.bp.ConcatBp
  "Backprop op for concat"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape.bp ConcatBp]))

(defn ->concat-bp
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  concat-dimension - `int`
  inputs-and-grad - Original inputs, followed by output gradient - `org.nd4j.autodiff.samediff.SDVariable`"
  (^ConcatBp [^org.nd4j.autodiff.samediff.SameDiff same-diff ^Integer concat-dimension ^org.nd4j.autodiff.samediff.SDVariable inputs-and-grad]
    (new ConcatBp same-diff concat-dimension inputs-and-grad))
  (^ConcatBp []
    (new ConcatBp )))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^ConcatBp this]
    (-> this (.opName))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^ConcatBp this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^ConcatBp this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ConcatBp this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^ConcatBp this]
    (-> this (.tensorflowName))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^ConcatBp this]
    (-> this (.opType))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^ConcatBp this]
    (-> this (.getNumOutputs))))

