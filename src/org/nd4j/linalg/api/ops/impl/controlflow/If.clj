(ns org.nd4j.linalg.api.ops.impl.controlflow.If
  "Equivalent to tensorflow's conditional op.
 Runs one of 2 SameDiff.SameDiffFunctionDefinition
 depending on a predicate SameDiff.SameDiffConditional"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.controlflow If]))

(defn ->if
  "Constructor.

  block-name - `java.lang.String`
  parent - `org.nd4j.autodiff.samediff.SameDiff`
  input-vars - `org.nd4j.autodiff.samediff.SDVariable[]`
  condition-body - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`
  predicate - `org.nd4j.autodiff.samediff.SameDiffConditional`
  true-body - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`
  false-body - `org.nd4j.autodiff.samediff.SameDiffFunctionDefinition`"
  (^If [^java.lang.String block-name ^org.nd4j.autodiff.samediff.SameDiff parent input-vars ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition condition-body ^org.nd4j.autodiff.samediff.SameDiffConditional predicate ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition true-body ^org.nd4j.autodiff.samediff.SameDiffFunctionDefinition false-body]
    (new If block-name parent input-vars condition-body predicate true-body false-body))
  (^If [^org.nd4j.linalg.api.ops.impl.controlflow.If if-statement]
    (new If if-statement)))

(defn num-output-arguments
  "returns: `int`"
  (^Integer [^If this]
    (-> this (.numOutputArguments))))

(defn num-t-arguments
  "returns: `int`"
  (^Integer [^If this]
    (-> this (.numTArguments))))

(defn output-arguments
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^If this]
    (-> this (.outputArguments))))

(defn calculate-output-shape
  "Description copied from class: DifferentialFunction

  returns: `java.util.List<long[]>`"
  ([^If this]
    (-> this (.calculateOutputShape))))

(defn remove-i-argument
  "arg - `java.lang.Integer`"
  ([^If this ^java.lang.Integer arg]
    (-> this (.removeIArgument arg))))

(defn op-type
  "Description copied from class: DifferentialFunction

  returns: `org.nd4j.linalg.api.ops.Op$Type`"
  (^org.nd4j.linalg.api.ops.Op$Type [^If this]
    (-> this (.opType))))

(defn add-i-argument
  "arg - `int`"
  ([^If this ^Integer arg]
    (-> this (.addIArgument arg))))

(defn add-input-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^If this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.addInputArgument arg))))

(defn op-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^If this]
    (-> this (.opName))))

(defn remove-t-argument
  "arg - `java.lang.Double`"
  ([^If this ^java.lang.Double arg]
    (-> this (.removeTArgument arg))))

(defn op-hash
  "Description copied from interface: CustomOp

  returns: `long`"
  (^Long [^If this]
    (-> this (.opHash))))

(defn get-descriptor
  "Description copied from interface: CustomOp

  returns: `org.nd4j.linalg.api.ops.CustomOpDescriptor`"
  (^org.nd4j.linalg.api.ops.CustomOpDescriptor [^If this]
    (-> this (.getDescriptor))))

(defn init-from-onnx
  "Description copied from class: DifferentialFunction

  node - `onnx.OnnxProto3$NodeProto`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `onnx.OnnxProto3$GraphProto`"
  ([^If this ^onnx.OnnxProto3$NodeProto node ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^onnx.OnnxProto3$GraphProto graph]
    (-> this (.initFromOnnx node init-with attributes-for-node graph))))

(defn get-t-argument
  "index - `int`

  returns: `java.lang.Double`"
  (^java.lang.Double [^If this ^Integer index]
    (-> this (.getTArgument index))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^If this]
    (-> this (.toString))))

(defn do-diff
  "Description copied from class: DifferentialFunction

  f-1 - `java.util.List`

  returns: `java.util.List<org.nd4j.autodiff.samediff.SDVariable>`"
  (^java.util.List [^If this ^java.util.List f-1]
    (-> this (.doDiff f-1))))

(defn get-i-argument
  "index - `int`

  returns: `java.lang.Long`"
  (^java.lang.Long [^If this ^Integer index]
    (-> this (.getIArgument index))))

(defn add-output-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^If this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.addOutputArgument arg))))

(defn remove-output-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^If this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.removeOutputArgument arg))))

(defn num-i-arguments
  "returns: `int`"
  (^Integer [^If this]
    (-> this (.numIArguments))))

(defn tensorflow-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^If this]
    (-> this (.tensorflowName))))

(defn inplace-call?
  "Description copied from interface: CustomOp

  returns: `boolean`"
  (^Boolean [^If this]
    (-> this (.isInplaceCall))))

(defn remove-input-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^If this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.removeInputArgument arg))))

(defn onnx-name
  "Description copied from class: DifferentialFunction

  returns: `java.lang.String`"
  (^java.lang.String [^If this]
    (-> this (.onnxName))))

(defn assert-valid-for-execution
  "Description copied from interface: CustomOp"
  ([^If this]
    (-> this (.assertValidForExecution))))

(defn t-args
  "returns: `double[]`"
  ([^If this]
    (-> this (.tArgs))))

(defn i-args
  "returns: `long[]`"
  ([^If this]
    (-> this (.iArgs))))

(defn output-variables
  "Description copied from class: DifferentialFunction

  base-name - `java.lang.String`

  returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^If this ^java.lang.String base-name]
    (-> this (.outputVariables base-name))))

(defn add-t-argument
  "arg - `double`"
  ([^If this ^Double arg]
    (-> this (.addTArgument arg))))

(defn get-output-argument
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^If this ^Integer index]
    (-> this (.getOutputArgument index))))

(defn init-from-tensor-flow
  "Description copied from class: DifferentialFunction

  node-def - `org.tensorflow.framework.NodeDef`
  init-with - `org.nd4j.autodiff.samediff.SameDiff`
  attributes-for-node - `java.util.Map`
  graph - `org.tensorflow.framework.GraphDef`"
  ([^If this ^org.tensorflow.framework.NodeDef node-def ^org.nd4j.autodiff.samediff.SameDiff init-with ^java.util.Map attributes-for-node ^org.tensorflow.framework.GraphDef graph]
    (-> this (.initFromTensorFlow node-def init-with attributes-for-node graph))))

(defn exected-true-or-false
  "Toggle whether the true body was executed
  or the false body

  true-body-executed - `boolean`"
  ([^If this ^Boolean true-body-executed]
    (-> this (.exectedTrueOrFalse true-body-executed))))

(defn num-input-arguments
  "returns: `int`"
  (^Integer [^If this]
    (-> this (.numInputArguments))))

(defn get-input-argument
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^If this ^Integer index]
    (-> this (.getInputArgument index))))

(defn populate-inputs-and-outputs-from-same-diff
  "Description copied from interface: CustomOp"
  ([^If this]
    (-> this (.populateInputsAndOutputsFromSameDiff))))

(defn input-arguments
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^If this]
    (-> this (.inputArguments))))

