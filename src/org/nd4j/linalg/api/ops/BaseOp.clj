(ns org.nd4j.linalg.api.ops.BaseOp
  "Base op. An op involves iterating over 2 buffers (x,y) up to n elements
 and applying a transform or accumulating a result."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops BaseOp]))

(defn ->base-op
  "Constructor.

  Specify an alternative output array

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the output - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements to iterate on - `long`"
  (^BaseOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new BaseOp x z n))
  (^BaseOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (new BaseOp x z))
  (^BaseOp [^org.nd4j.linalg.api.ndarray.INDArray x]
    (new BaseOp x))
  (^BaseOp [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (new BaseOp x y z n))
  (^BaseOp []
    (new BaseOp )))

(defn *get-op-type
  "op - `org.nd4j.linalg.api.ops.Op`

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^org.nd4j.linalg.api.ops.Op op]
    (BaseOp/getOpType op)))

(defn set-n
  "Description copied from interface: Op

  n - `long`"
  ([^BaseOp this ^Long n]
    (-> this (.setN n))))

(defn n
  "Description copied from interface: Op

  returns: the op - `long`"
  (^Long [^BaseOp this]
    (-> this (.n))))

(defn set-z
  "Description copied from interface: Op

  z - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseOp this ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.setZ z))))

(defn extra-args-buff
  "Description copied from interface: Op

  returns: a buffer of either opType float or double
  representing the extra args for this op - `java.nio.Buffer`"
  (^java.nio.Buffer [^BaseOp this]
    (-> this (.extraArgsBuff))))

(defn z
  "Description copied from interface: Op

  returns: the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseOp this]
    (-> this (.z))))

(defn num-processed
  "Description copied from interface: Op

  returns: the number of elements accumulated - `long`"
  (^Long [^BaseOp this]
    (-> this (.numProcessed))))

(defn extra-args
  "Description copied from interface: Op

  returns: the extra arguments - `java.lang.Object[]`"
  ([^BaseOp this]
    (-> this (.extraArgs))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^BaseOp this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn x
  "Description copied from interface: Op

  returns: the origin ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseOp this]
    (-> this (.x))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseOp this]
    (-> this (.toString))))

(defn exec
  "Description copied from interface: Op

  dimensions - the dimensions to execute on - `int`"
  ([^BaseOp this ^Integer dimensions]
    (-> this (.exec dimensions)))
  ([^BaseOp this]
    (-> this (.exec))))

(defn pass-through?
  "Description copied from interface: Op

  returns: true if the op is pass through false otherwise - `boolean`"
  (^Boolean [^BaseOp this]
    (-> this (.isPassThrough))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  base-name - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^BaseOp this ^java.lang.String base-name]
    (-> this (.outputVariables base-name))))

(defn extra-args-data-buff
  "Description copied from interface: Op

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseOp this]
    (-> this (.extraArgsDataBuff))))

(defn set-y
  "Description copied from interface: Op

  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseOp this ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.setY y))))

(defn y
  "Description copied from interface: Op

  returns: the pairwise op ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseOp this]
    (-> this (.y))))

(defn init
  "Description copied from interface: Op

  x - the input - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the pairwise transform ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  z - the resulting ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  n - the number of elements - `long`"
  ([^BaseOp this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z ^Long n]
    (-> this (.init x y z n))))

(defn set-x
  "Description copied from interface: Op

  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseOp this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.setX x))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^BaseOp this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BaseOp this]
    (-> this (.hashCode))))

(defn exec-special?
  "Description copied from interface: Op

  returns: true if the executioner needs to do a special
  call or not false otherwise - `boolean`"
  (^Boolean [^BaseOp this]
    (-> this (.isExecSpecial))))

(defn to-custom-op
  "Description copied from interface: Op

  returns: the equivalent CustomOp - `org.nd4j.linalg.api.ops.CustomOp`"
  (^org.nd4j.linalg.api.ops.CustomOp [^BaseOp this]
    (-> this (.toCustomOp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseOp this ^java.lang.Object o]
    (-> this (.equals o))))

