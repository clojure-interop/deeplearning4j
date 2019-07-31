(ns org.nd4j.linalg.api.ops.BaseAccumulation
  "Base class for accumulation, initiates the initial entry
 with respect to the child class. Also contains baseline fields
 for the over all field with accumulation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops BaseAccumulation]))

(defn ->base-accumulation
  "Constructor.

  Initialize with the given
  input, pairwise transform, result, and number
  of elements

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the result - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  (^BaseAccumulation [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new BaseAccumulation x y z n))
  (^BaseAccumulation [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Boolean new-format ^Boolean keep-dims dimensions]
    (new BaseAccumulation x y z new-format keep-dims dimensions))
  (^BaseAccumulation [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v ^org.nd4j.autodiff.samediff.SDVariable i-v-2 dimensions ^Boolean keep-dims]
    (new BaseAccumulation same-diff i-v i-v-2 dimensions keep-dims))
  (^BaseAccumulation [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v dimensions]
    (new BaseAccumulation same-diff i-v dimensions))
  (^BaseAccumulation [^org.nd4j.autodiff.samediff.SameDiff same-diff ^org.nd4j.autodiff.samediff.SDVariable i-v]
    (new BaseAccumulation same-diff i-v))
  (^BaseAccumulation [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new BaseAccumulation x))
  (^BaseAccumulation []
    (new BaseAccumulation )))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^BaseAccumulation this]
    (-> this (.calculateOutputShape))))

(defn zero-double
  "Description copied from interface: Accumulation

  returns: the initial value - `double`"
  (^Double [^BaseAccumulation this]
    (-> this (.zeroDouble))))

(defn get-final-result
  "Description copied from interface: Accumulation

  returns: `java.lang.Number`"
  (^java.lang.Number [^BaseAccumulation this]
    (-> this (.getFinalResult))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^BaseAccumulation this]
    (-> this (.opType))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^BaseAccumulation this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn keep-dims?
  "Description copied from interface: Accumulation

  returns: `boolean`"
  (^Boolean [^BaseAccumulation this]
    (-> this (.isKeepDims))))

(defn complex-accumulation?
  "returns: `boolean`"
  (^Boolean [^BaseAccumulation this]
    (-> this (.isComplexAccumulation))))

(defn zero-float
  "Description copied from interface: Accumulation

  returns: `float`"
  (^Float [^BaseAccumulation this]
    (-> this (.zeroFloat))))

(defn no-op
  "Description copied from interface: Accumulation

  returns: the no op version of the input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseAccumulation this]
    (-> this (.noOp))))

(defn zero-half
  "Description copied from interface: Accumulation

  returns: `float`"
  (^Float [^BaseAccumulation this]
    (-> this (.zeroHalf))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^BaseAccumulation this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn set-final-result
  "Description copied from interface: Accumulation

  value - `double`"
  ([^BaseAccumulation this ^Double value]
    (-> this (.setFinalResult value))))

