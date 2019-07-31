(ns org.nd4j.linalg.api.ops.DynamicCustomOp
  "Basic implementation for CustomOp"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops DynamicCustomOp]))

(defn ->dynamic-custom-op
  "Constructor.

  Initialize this custom op with all of the
  inputs, outputs, and respective
  arguments for execution

  op-name - the opName of the op to execute - `java.lang.String`
  inputs - the inputs to the op - `org.nd4j.linalg.api.ndarray.INDArray[]`
  outputs - the outputs of the op - `org.nd4j.linalg.api.ndarray.INDArray[]`
  t-arguments - the input float arguments - `java.util.List`
  i-arguments - the input int arguments - `java.util.List`"
  (^DynamicCustomOp [^java.lang.String op-name inputs outputs ^java.util.List t-arguments ^java.util.List i-arguments]
    (new DynamicCustomOp op-name inputs outputs t-arguments i-arguments))
  (^DynamicCustomOp [^java.lang.String op-name ^org.nd4j.autodiff.samediff.SameDiff same-diff args ^Boolean in-place]
    (new DynamicCustomOp op-name same-diff args in-place))
  (^DynamicCustomOp [^java.lang.String op-name inputs outputs]
    (new DynamicCustomOp op-name inputs outputs))
  (^DynamicCustomOp []
    (new DynamicCustomOp )))

(defn *builder
  "This method takes custom opname, and return Op DynamicCustomOpsBuilder instance

  op-name - `java.lang.String`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder [^java.lang.String op-name]
    (DynamicCustomOp/builder op-name)))

(defn *same-diff-builder
  "op-name - `java.lang.String`
  same-diff - `org.nd4j.autodiff.samediff.SameDiff`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$SameDiffBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$SameDiffBuilder [^java.lang.String op-name ^org.nd4j.autodiff.samediff.SameDiff same-diff]
    (DynamicCustomOp/sameDiffBuilder op-name same-diff)))

(defn num-output-arguments
  "returns: `int`"
  (^Integer [^DynamicCustomOp this]
    (-> this (.numOutputArguments))))

(defn num-t-arguments
  "returns: `int`"
  (^Integer [^DynamicCustomOp this]
    (-> this (.numTArguments))))

(defn output-arguments
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^DynamicCustomOp this]
    (-> this (.outputArguments))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^DynamicCustomOp this]
    (-> this (.calculateOutputShape))))

(defn remove-i-argument
  "arg - `java.lang.Integer`"
  ([^DynamicCustomOp this ^java.lang.Integer arg]
    (-> this (.removeIArgument arg))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^DynamicCustomOp this]
    (-> this (.opType))))

(defn as-properties
  "Return function properties for the given function

  returns: `org.nd4j.autodiff.functions.FunctionProperties`"
  (^org.nd4j.autodiff.functions.FunctionProperties [^DynamicCustomOp this]
    (-> this (.asProperties))))

(defn add-i-argument
  "arg - `int`"
  ([^DynamicCustomOp this ^Integer arg]
    (-> this (.addIArgument arg))))

(defn add-input-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DynamicCustomOp this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.addInputArgument arg))))

(defn op-name
  "This method returns op opName as string

  returns: `java.lang.String`"
  (^java.lang.String [^DynamicCustomOp this]
    (-> this (.opName))))

(defn remove-t-argument
  "arg - `java.lang.Double`"
  ([^DynamicCustomOp this ^java.lang.Double arg]
    (-> this (.removeTArgument arg))))

(defn op-hash
  "This method returns LongHash of the opName()

  returns: `long`"
  (^Long [^DynamicCustomOp this]
    (-> this (.opHash))))

(defn get-descriptor
  "Description copied from interface: CustomOp

  returns: `org.nd4j.linalg.api.ops.CustomOpDescriptor`"
  (^org.nd4j.linalg.api.ops.CustomOpDescriptor [^DynamicCustomOp this]
    (-> this (.getDescriptor))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^DynamicCustomOp this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn set-input-argument
  "index - `int`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DynamicCustomOp this ^Integer index ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.setInputArgument index input))))

(defn get-t-argument
  "index - `int`

  returns: `java.lang.Double`"
  (^java.lang.Double [^DynamicCustomOp this ^Integer index]
    (-> this (.getTArgument index))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DynamicCustomOp this]
    (-> this (.toString))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^DynamicCustomOp this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn get-i-argument
  "index - `int`

  returns: `java.lang.Long`"
  (^java.lang.Long [^DynamicCustomOp this ^Integer index]
    (-> this (.getIArgument index))))

(defn op-num
  "Description copied from class: DifferentialFunction

  returns: `int`"
  (^Integer [^DynamicCustomOp this]
    (-> this (.opNum))))

(defn add-output-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DynamicCustomOp this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.addOutputArgument arg))))

(defn remove-output-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DynamicCustomOp this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.removeOutputArgument arg))))

(defn num-i-arguments
  "returns: `int`"
  (^Integer [^DynamicCustomOp this]
    (-> this (.numIArguments))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DynamicCustomOp this]
    (-> this (.tensorflowName))))

(defn remove-input-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DynamicCustomOp this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.removeInputArgument arg))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^DynamicCustomOp this]
    (-> this (.onnxName))))

(defn assert-valid-for-execution
  "Description copied from interface: CustomOp"
  ([^DynamicCustomOp this]
    (-> this (.assertValidForExecution))))

(defn t-args
  "returns: `double[]`"
  ([^DynamicCustomOp this]
    (-> this (.tArgs))))

(defn i-args
  "returns: `long[]`"
  ([^DynamicCustomOp this]
    (-> this (.iArgs))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  base-name - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^DynamicCustomOp this ^java.lang.String base-name]
    (-> this (.outputVariables base-name)))
  ([^DynamicCustomOp this]
    (-> this (.outputVariables))))

(defn add-t-argument
  "arg - `double`"
  ([^DynamicCustomOp this ^Double arg]
    (-> this (.addTArgument arg))))

(defn get-output-argument
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DynamicCustomOp this ^Integer index]
    (-> this (.getOutputArgument index))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^DynamicCustomOp this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn num-input-arguments
  "returns: `int`"
  (^Integer [^DynamicCustomOp this]
    (-> this (.numInputArguments))))

(defn get-input-argument
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DynamicCustomOp this ^Integer index]
    (-> this (.getInputArgument index))))

(defn set-output-argument
  "index - `int`
  output - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DynamicCustomOp this ^Integer index ^org.nd4j.linalg.api.ndarray.INDArray output]
    (-> this (.setOutputArgument index output))))

(defn populate-inputs-and-outputs-from-same-diff
  "Description copied from interface: CustomOp"
  ([^DynamicCustomOp this]
    (-> this (.populateInputsAndOutputsFromSameDiff))))

(defn input-arguments
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^DynamicCustomOp this]
    (-> this (.inputArguments))))

