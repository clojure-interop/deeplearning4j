(ns org.nd4j.linalg.api.ops.impl.shape.DiagPart
  "Return the diagonal part of a tensor. The input tensor has to
 have dimensions [d1,..., dk, d1,..., dk], so that the diagonal
 blocks have shape [d1,..., dk].

 A simple special case of this is returning the diagonal of a
 matrix as vector."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.shape DiagPart]))

(defn ->diag-part
  "Constructor.

  same-diff - `org.nd4j.autodiff.samediff.SameDiff`
  args - `org.nd4j.autodiff.samediff.SDVariable[]`
  in-place - `boolean`"
  (^DiagPart [^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new DiagPart same-diff args in-place))
  (^DiagPart [^org.nd4j.linalg.api.ndarray.INDArray in ^org.nd4j.linalg.api.ndarray.INDArray out]
    (new DiagPart in out))
  (^DiagPart []
    (new DiagPart )))

(defn do-diff
  "Description copied from class: DifferentialFunction

  i-v - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DiagPart this ^java.util.List i-v]
    (-> this (.doDiff i-v))))

(defn op-name
  "Description copied from class: DynamicCustomOp

  returns: `java.lang.String`"
  (^java.lang.String [^DiagPart this]
    (-> this (.opName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DiagPart this]
    (-> this (.tensorflowName))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^DiagPart this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^DiagPart this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

