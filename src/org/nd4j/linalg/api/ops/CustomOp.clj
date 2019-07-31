(ns org.nd4j.linalg.api.ops.CustomOp
  "This interface describe \"custom operations.
 Originally these operations are designed for SameDiff, and execution within graph,
 but we also want to provide option to use them with regular ND4J methods via NativeOpExecutioner"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops CustomOp]))

(defn num-output-arguments
  "returns: `int`"
  (^Integer [^CustomOp this]
    (-> this (.numOutputArguments))))

(defn num-t-arguments
  "returns: `int`"
  (^Integer [^CustomOp this]
    (-> this (.numTArguments))))

(defn output-arguments
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^CustomOp this]
    (-> this (.outputArguments))))

(defn calculate-output-shape
  "Calculate the output shape for this op

  returns: `java.util.List<long[]>`"
  ([^CustomOp this]
    (-> this (.calculateOutputShape))))

(defn remove-i-argument
  "arg - `java.lang.Integer`"
  ([^CustomOp this ^java.lang.Integer arg]
    (-> this (.removeIArgument arg))))

(defn add-i-argument
  "arg - `int`"
  ([^CustomOp this ^Integer arg]
    (-> this (.addIArgument arg))))

(defn add-input-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CustomOp this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.addInputArgument arg))))

(defn op-name
  "This method returns op opName as string

  returns: `java.lang.String`"
  (^java.lang.String [^CustomOp this]
    (-> this (.opName))))

(defn remove-t-argument
  "arg - `java.lang.Double`"
  ([^CustomOp this ^java.lang.Double arg]
    (-> this (.removeTArgument arg))))

(defn op-hash
  "This method returns LongHash of the opName()

  returns: `long`"
  (^Long [^CustomOp this]
    (-> this (.opHash))))

(defn get-descriptor
  "Get the custom op descriptor if one is available.

  returns: `org.nd4j.linalg.api.ops.CustomOpDescriptor`"
  (^org.nd4j.linalg.api.ops.CustomOpDescriptor [^CustomOp this]
    (-> this (.getDescriptor))))

(defn get-t-argument
  "index - `int`

  returns: `java.lang.Double`"
  (^java.lang.Double [^CustomOp this ^Integer index]
    (-> this (.getTArgument index))))

(defn get-i-argument
  "index - `int`

  returns: `java.lang.Long`"
  (^java.lang.Long [^CustomOp this ^Integer index]
    (-> this (.getIArgument index))))

(defn add-output-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CustomOp this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.addOutputArgument arg))))

(defn remove-output-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CustomOp this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.removeOutputArgument arg))))

(defn num-i-arguments
  "returns: `int`"
  (^Integer [^CustomOp this]
    (-> this (.numIArguments))))

(defn inplace-call?
  "This method returns true if op is supposed to be executed inplace

  returns: `boolean`"
  (^Boolean [^CustomOp this]
    (-> this (.isInplaceCall))))

(defn remove-input-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^CustomOp this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.removeInputArgument arg))))

(defn assert-valid-for-execution
  "Asserts a valid state for execution,
  otherwise throws an ND4JIllegalStateException"
  ([^CustomOp this]
    (-> this (.assertValidForExecution))))

(defn t-args
  "returns: `double[]`"
  ([^CustomOp this]
    (-> this (.tArgs))))

(defn i-args
  "returns: `long[]`"
  ([^CustomOp this]
    (-> this (.iArgs))))

(defn add-t-argument
  "arg - `double`"
  ([^CustomOp this ^Double arg]
    (-> this (.addTArgument arg))))

(defn get-output-argument
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CustomOp this ^Integer index]
    (-> this (.getOutputArgument index))))

(defn num-input-arguments
  "returns: `int`"
  (^Integer [^CustomOp this]
    (-> this (.numInputArguments))))

(defn get-input-argument
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CustomOp this ^Integer index]
    (-> this (.getInputArgument index))))

(defn populate-inputs-and-outputs-from-same-diff
  "Attempt to populate inputs and outputs from samediff.
  This method will not attempt to fill in integer or double aruguments."
  ([^CustomOp this]
    (-> this (.populateInputsAndOutputsFromSameDiff))))

(defn input-arguments
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^CustomOp this]
    (-> this (.inputArguments))))

