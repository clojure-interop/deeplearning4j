(ns org.nd4j.linalg.api.ops.aggregates.Aggregate
  "Aggregates are ops that work with custom operands,
 that are not limited to traditional X, Y and Z constraints."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.aggregates Aggregate]))

(defn get-shapes
  "returns: `java.util.List<org.nd4j.linalg.api.buffer.DataBuffer>`"
  (^java.util.List [^Aggregate this]
    (-> this (.getShapes))))

(defn max-real-arguments
  "This method returns maximum number of real (float/double) per Aggregate

  returns: `int`"
  (^Integer [^Aggregate this]
    (-> this (.maxRealArguments))))

(defn get-final-result
  "returns: `java.lang.Number`"
  (^java.lang.Number [^Aggregate this]
    (-> this (.getFinalResult))))

(defn get-shared-memory-size
  "This method returns amount of shared memory required for this specific Aggregate.
  PLEASE NOTE: this method is especially important for
  CUDA backend. On CPU backend it might be ignored, depending on Aggregate.

  returns: `int`"
  (^Integer [^Aggregate this]
    (-> this (.getSharedMemorySize))))

(defn get-arguments
  "returns: `java.util.List<org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.List [^Aggregate this]
    (-> this (.getArguments))))

(defn get-int-array-arguments
  "returns: `java.util.List<int[]>`"
  ([^Aggregate this]
    (-> this (.getIntArrayArguments))))

(defn max-shapes
  "This method returns maximum number of shapes being passed per Aggregate

  returns: `int`"
  (^Integer [^Aggregate this]
    (-> this (.maxShapes))))

(defn max-int-array-size
  "This method returns maximum length for IntArrays, if any

  returns: `int`"
  (^Integer [^Aggregate this]
    (-> this (.maxIntArraySize))))

(defn get-required-batch-memory-size
  "This method returns amount of memory required for batch creation for this specific Aggregate

  returns: `long`"
  (^Long [^Aggregate this]
    (-> this (.getRequiredBatchMemorySize))))

(defn max-arguments
  "This method returns maximum number of shapes being passed per Aggregate

  returns: `int`"
  (^Integer [^Aggregate this]
    (-> this (.maxArguments))))

(defn op-num
  "returns: `int`"
  (^Integer [^Aggregate this]
    (-> this (.opNum))))

(defn name
  "returns: `java.lang.String`"
  (^java.lang.String [^Aggregate this]
    (-> this (.name))))

(defn get-real-arguments
  "returns: `java.util.List<java.lang.Number>`"
  (^java.util.List [^Aggregate this]
    (-> this (.getRealArguments))))

(defn get-threads-per-instance
  "This method returns desired number of threads per Aggregate instance
  PLEASE NOTE: this method is especially important for CUDA backend.
  On CPU backend it might be ignored, depending on Aggregate.

  returns: `int`"
  (^Integer [^Aggregate this]
    (-> this (.getThreadsPerInstance))))

(defn get-indexing-arguments
  "returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^Aggregate this]
    (-> this (.getIndexingArguments))))

(defn max-int-arrays
  "This method returns maximum number of IntArrays being passed per Aggregate

  returns: `int`"
  (^Integer [^Aggregate this]
    (-> this (.maxIntArrays))))

(defn max-index-arguments
  "This method returns maximum number of IndexArguments per Aggregate

  returns: `int`"
  (^Integer [^Aggregate this]
    (-> this (.maxIndexArguments))))

(defn set-final-result
  "result - `java.lang.Number`"
  ([^Aggregate this ^java.lang.Number result]
    (-> this (.setFinalResult result))))

