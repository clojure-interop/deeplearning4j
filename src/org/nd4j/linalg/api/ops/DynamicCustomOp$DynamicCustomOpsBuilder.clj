(ns org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops DynamicCustomOp$DynamicCustomOpsBuilder]))

(defn add-inputs
  "This method
  takes arbitrary number of input INDArrays in, as Op input
  Note that this ACCUMULATES arguments. You are able to call this method
  multiple times and it will add arguments to a list.
  PLEASE NOTE: this method does NOT validate lengths/shapes.

  inputs - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder [^DynamicCustomOp$DynamicCustomOpsBuilder this ^org.nd4j.linalg.api.ndarray.INDArray inputs]
    (-> this (.addInputs inputs))))

(defn add-outputs
  "This method takes arbitrary number of
  output INDArrays in, to store operation result
  Note that this ACCUMULATES arguments. You are able to call this method
  multiple times and it will add arguments to a list.
  PLEASE NOTE: this method does NOT validate lengths/shapes.

  outputs - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder [^DynamicCustomOp$DynamicCustomOpsBuilder this ^org.nd4j.linalg.api.ndarray.INDArray outputs]
    (-> this (.addOutputs outputs))))

(defn call-inplace
  "Whether an op call is in place or not.

  really-call - `boolean`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder [^DynamicCustomOp$DynamicCustomOpsBuilder this ^Boolean really-call]
    (-> this (.callInplace really-call))))

(defn add-integer-arguments
  "This method takes arbitrary number of Integer arguments for op,
  Note that this ACCUMULATES arguments. You are able to call this method
  multiple times and it will add arguments to a list.
  PLEASE NOTE: this method does NOT validate values.

  iargs - `java.util.List`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder [^DynamicCustomOp$DynamicCustomOpsBuilder this ^java.util.List iargs]
    (-> this (.addIntegerArguments iargs))))

(defn add-floating-point-arguments
  "This method takes arbitrary number of Double arguments for op,
  Note that this ACCUMULATES arguments. You are able to call this method
  multiple times and it will add arguments to a list.
  PLEASE NOTE: this method does NOT validate values.

  targs - `java.lang.Double`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder [^DynamicCustomOp$DynamicCustomOpsBuilder this ^java.lang.Double targs]
    (-> this (.addFloatingPointArguments targs))))

(defn add-output-shape
  "Adds an oup

  shape - `int[]`

  returns: `org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp$DynamicCustomOpsBuilder [^DynamicCustomOp$DynamicCustomOpsBuilder this shape]
    (-> this (.addOutputShape shape))))

(defn build
  "returns: `org.nd4j.linalg.api.ops.DynamicCustomOp`"
  (^org.nd4j.linalg.api.ops.DynamicCustomOp [^DynamicCustomOp$DynamicCustomOpsBuilder this]
    (-> this (.build))))

(defn get-num-outputs
  "returns: `int`"
  (^Integer [^DynamicCustomOp$DynamicCustomOpsBuilder this]
    (-> this (.getNumOutputs))))

