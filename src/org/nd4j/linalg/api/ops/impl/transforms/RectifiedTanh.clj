(ns org.nd4j.linalg.api.ops.impl.transforms.RectifiedTanh
  "RectifiedTanh
 Essentially max(0, tanh(x))"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.transforms RectifiedTanh]))

(defn ->rectified-tanh
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  n - `long`"
  (^RectifiedTanh [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new RectifiedTanh x y z n))
  (^RectifiedTanh [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^Boolean in-place]
    (new RectifiedTanh same-diff i-v in-place))
  (^RectifiedTanh [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new RectifiedTanh x z))
  (^RectifiedTanh [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new RectifiedTanh x))
  (^RectifiedTanh []
    (new RectifiedTanh )))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^RectifiedTanh this]
    (-> this (.opNum))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: the opName of this operation - `java.lang.String`"
  (^java.lang.String [^RectifiedTanh this]
    (-> this (.opName))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RectifiedTanh this]
    (-> this (.onnxName))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^RectifiedTanh this]
    (-> this (.tensorflowName))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^RectifiedTanh this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^RectifiedTanh this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^RectifiedTanh this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

