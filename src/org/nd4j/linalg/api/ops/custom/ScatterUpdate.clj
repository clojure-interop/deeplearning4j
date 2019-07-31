(ns org.nd4j.linalg.api.ops.custom.ScatterUpdate
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.custom ScatterUpdate]))

(defn ->scatter-update
  "Constructor.

  original - `org.nd4j.linalg.api.ndarray.INDArray`
  updates - `org.nd4j.linalg.api.ndarray.INDArray`
  result - `org.nd4j.linalg.api.ndarray.INDArray`
  indices - `int[]`
  dimension - `int[]`
  op - `org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp`"
  (^ScatterUpdate [^org.nd4j.linalg.api.ndarray.INDArray original ^org.nd4j.linalg.api.ndarray.INDArray updates ^org.nd4j.linalg.api.ndarray.INDArray result indices dimension ^org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp op]
    (new ScatterUpdate original updates result indices dimension op))
  (^ScatterUpdate [^org.nd4j.linalg.api.ndarray.INDArray original ^org.nd4j.linalg.api.ndarray.INDArray updates indices dimension ^org.nd4j.linalg.api.ops.custom.ScatterUpdate$UpdateOp op]
    (new ScatterUpdate original updates indices dimension op)))

(defn num-output-arguments
  "returns: `int`"
  (^Integer [^ScatterUpdate this]
    (-> this (.numOutputArguments))))

(defn num-t-arguments
  "returns: `int`"
  (^Integer [^ScatterUpdate this]
    (-> this (.numTArguments))))

(defn output-arguments
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ScatterUpdate this]
    (-> this (.outputArguments))))

(defn calculate-output-shape
  "Description copied from interface: CustomOp

  returns: `java.util.List<long[]>`"
  ([^ScatterUpdate this]
    (-> this (.calculateOutputShape))))

(defn remove-i-argument
  "arg - `java.lang.Integer`"
  ([^ScatterUpdate this ^java.lang.Integer arg]
    (-> this (.removeIArgument arg))))

(defn add-i-argument
  "arg - `int`"
  ([^ScatterUpdate this ^Integer arg]
    (-> this (.addIArgument arg))))

(defn add-input-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ScatterUpdate this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.addInputArgument arg))))

(defn op-name
  "This method returns op opName as string

  returns: `java.lang.String`"
  (^java.lang.String [^ScatterUpdate this]
    (-> this (.opName))))

(defn remove-t-argument
  "arg - `java.lang.Double`"
  ([^ScatterUpdate this ^java.lang.Double arg]
    (-> this (.removeTArgument arg))))

(defn op-hash
  "This method returns LongHash of the opName()

  returns: `long`"
  (^Long [^ScatterUpdate this]
    (-> this (.opHash))))

(defn get-descriptor
  "Description copied from interface: CustomOp

  returns: `org.nd4j.linalg.api.ops.CustomOpDescriptor`"
  (^org.nd4j.linalg.api.ops.CustomOpDescriptor [^ScatterUpdate this]
    (-> this (.getDescriptor))))

(defn get-t-argument
  "index - `int`

  returns: `java.lang.Double`"
  (^java.lang.Double [^ScatterUpdate this ^Integer index]
    (-> this (.getTArgument index))))

(defn get-i-argument
  "index - `int`

  returns: `java.lang.Long`"
  (^java.lang.Long [^ScatterUpdate this ^Integer index]
    (-> this (.getIArgument index))))

(defn add-output-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ScatterUpdate this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.addOutputArgument arg))))

(defn remove-output-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ScatterUpdate this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.removeOutputArgument arg))))

(defn num-i-arguments
  "returns: `int`"
  (^Integer [^ScatterUpdate this]
    (-> this (.numIArguments))))

(defn inplace-call?
  "This method returns true if op is supposed to be executed inplace

  returns: `boolean`"
  (^Boolean [^ScatterUpdate this]
    (-> this (.isInplaceCall))))

(defn remove-input-argument
  "arg - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ScatterUpdate this ^org.nd4j.linalg.api.ndarray.INDArray arg]
    (-> this (.removeInputArgument arg))))

(defn assert-valid-for-execution
  "Description copied from interface: CustomOp"
  ([^ScatterUpdate this]
    (-> this (.assertValidForExecution))))

(defn t-args
  "returns: `double[]`"
  ([^ScatterUpdate this]
    (-> this (.tArgs))))

(defn i-args
  "returns: `long[]`"
  ([^ScatterUpdate this]
    (-> this (.iArgs))))

(defn add-t-argument
  "arg - `double`"
  ([^ScatterUpdate this ^Double arg]
    (-> this (.addTArgument arg))))

(defn get-output-argument
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ScatterUpdate this ^Integer index]
    (-> this (.getOutputArgument index))))

(defn num-input-arguments
  "returns: `int`"
  (^Integer [^ScatterUpdate this]
    (-> this (.numInputArguments))))

(defn get-input-argument
  "index - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ScatterUpdate this ^Integer index]
    (-> this (.getInputArgument index))))

(defn populate-inputs-and-outputs-from-same-diff
  "Description copied from interface: CustomOp"
  ([^ScatterUpdate this]
    (-> this (.populateInputsAndOutputsFromSameDiff))))

(defn input-arguments
  "returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^ScatterUpdate this]
    (-> this (.inputArguments))))

