(ns org.nd4j.linalg.api.ops.aggregates.impl.AggregateDot
  "This op describes Dot call that'll happen soon(TM) in batch mode"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.aggregates.impl AggregateDot]))

(defn ->aggregate-dot
  "Constructor.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^AggregateDot [^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (new AggregateDot x y)))

(defn max-real-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateDot this]
    (-> this (.maxRealArguments))))

(defn get-shared-memory-size
  "This method returns amount of shared memory required for this specific Aggregate.
  PLEASE NOTE: this method is especially important for CUDA backend. On CPU backend it might be ignored, depending on Aggregate.

  returns: `int`"
  (^Integer [^AggregateDot this]
    (-> this (.getSharedMemorySize))))

(defn max-shapes
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateDot this]
    (-> this (.maxShapes))))

(defn max-int-array-size
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateDot this]
    (-> this (.maxIntArraySize))))

(defn max-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateDot this]
    (-> this (.maxArguments))))

(defn op-num
  "returns: `int`"
  (^Integer [^AggregateDot this]
    (-> this (.opNum))))

(defn name
  "returns: `java.lang.String`"
  (^java.lang.String [^AggregateDot this]
    (-> this (.name))))

(defn get-threads-per-instance
  "This method returns desired number of threads per Aggregate instance
  PLEASE NOTE: this method is especially important for CUDA backend. On CPU backend it might be ignored, depending on Aggregate.

  returns: `int`"
  (^Integer [^AggregateDot this]
    (-> this (.getThreadsPerInstance))))

(defn max-int-arrays
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateDot this]
    (-> this (.maxIntArrays))))

(defn max-index-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateDot this]
    (-> this (.maxIndexArguments))))

