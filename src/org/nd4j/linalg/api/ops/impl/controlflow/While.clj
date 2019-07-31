(ns org.nd4j.linalg.api.ops.impl.controlflow.While
  "Equivalent to tensorflow's while loop
 Takes in:
 loopVars
 loop body
 condition
 runs loop till condition is false."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow While]))

(defn ->while
  "Constructor.

  Mainly meant for tensorflow import.
  This allows initFromTensorFlow(NodeDef, SameDiff, Map, GraphDef)
  to continue from a parent while loop
  using the same graph

  start-position - the start position for the import scan - `java.util.concurrent.atomic.AtomicInteger`"
  (^While [^java.util.concurrent.atomic.AtomicInteger start-position]
    (new While start-position))
  (^While [^java.lang.String block-name ^org.nd4j.autodiff.samediff.SameDiff parent input-vars ^org.nd4j.autodiff.samediff.SameDiffConditional predicate ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition condition ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition true-body]
    (new While block-name parent input-vars predicate condition true-body)))

(defn num-output-arguments
  "returns: `int`"
  (^Integer [^While this]
    (-> this (.numOutputArguments))))

(defn num-t-arguments
  "returns: `int`"
  (^Integer [^While this]
    (-> this (.numTArguments))))

(defn output-arguments
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^While this]
    (-> this (.outputArguments))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^While this]
    (-> this (.calculateOutputShape))))

(defn remove-i-argument
  "arg - `java.lang.Integer`"
  ([^While this ^java.lang.Integer arg]
    (-> this (.removeIArgument arg))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^While this]
    (-> this (.opType))))

(defn add-i-argument
  "arg - `int`"
  ([^While this ^Integer arg]
    (-> this (.addIArgument arg))))

(defn add-input-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^While this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.addInputArgument arg))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^While this]
    (-> this (.opName))))

(defn remove-t-argument
  "arg - `java.lang.Double`"
  ([^While this ^java.lang.Double arg]
    (-> this (.removeTArgument arg))))

(defn op-hash
  "Description copied from interface: CustomOp

  returns: `long`"
  (^Long [^While this]
    (-> this (.opHash))))

(defn get-descriptor
  "Description copied from interface: CustomOp

  returns: `org.nd4j.linalg.api.ops.CustomOpDescriptor`"
  (^org.nd4j.linalg.api.ops.CustomOpDescriptor [^While this]
    (-> this (.getDescriptor))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^While this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn increment-loop-counter
  "Increments the loop counter.
  This should be called when the loop
  actually executes."
  ([^While this]
    (-> this (.incrementLoopCounter))))

(defn get-t-argument
  "index - `int`

  returns: `java.lang.Double`"
  (^java.lang.Double [^While this ^Integer index]
    (-> this (.getTArgument index))))

(defn tensorflow-names
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String[]`"
  ([^While this]
    (-> this (.tensorflowNames))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^While this]
    (-> this (.toString))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^While this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn get-i-argument
  "index - `int`

  returns: `java.lang.Long`"
  (^java.lang.Long [^While this ^Integer index]
    (-> this (.getIArgument index))))

(defn add-output-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^While this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.addOutputArgument arg))))

(defn remove-output-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^While this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.removeOutputArgument arg))))

(defn num-i-arguments
  "returns: `int`"
  (^Integer [^While this]
    (-> this (.numIArguments))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^While this]
    (-> this (.tensorflowName))))

(defn inplace-call?
  "Description copied from interface: CustomOp

  returns: `boolean`"
  (^Boolean [^While this]
    (-> this (.isInplaceCall))))

(defn remove-input-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^While this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.removeInputArgument arg))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^While this]
    (-> this (.onnxName))))

(defn assert-valid-for-execution
  "Description copied from interface: CustomOp"
  ([^While this]
    (-> this (.assertValidForExecution))))

(defn t-args
  "returns: `double[]`"
  ([^While this]
    (-> this (.tArgs))))

(defn i-args
  "returns: `long[]`"
  ([^While this]
    (-> this (.iArgs))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  base-name - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^While this ^java.lang.String base-name]
    (-> this (.outputVariables base-name))))

(defn add-t-argument
  "arg - `double`"
  ([^While this ^Double arg]
    (-> this (.addTArgument arg))))

(defn get-output-argument
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^While this ^Integer index]
    (-> this (.getOutputArgument index))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^While this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn num-input-arguments
  "returns: `int`"
  (^Integer [^While this]
    (-> this (.numInputArguments))))

(defn get-input-argument
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^While this ^Integer index]
    (-> this (.getInputArgument index))))

(defn populate-inputs-and-outputs-from-same-diff
  "Description copied from interface: CustomOp"
  ([^While this]
    (-> this (.populateInputsAndOutputsFromSameDiff))))

(defn input-arguments
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^While this]
    (-> this (.inputArguments))))

