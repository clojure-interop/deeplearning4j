(ns org.nd4j.linalg.api.ops.aggregates.impl.HierarchicSoftmax
  "This Op describes HS round for AggregateSkipGram/CBOW Hierarchic Softmax"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.aggregates.impl HierarchicSoftmax]))

(defn ->hierarchic-softmax
  "Constructor.

  syn-0 - `org.nd4j.linalg.api.ndarray.INDArray`
  syn-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  exp-table - `org.nd4j.linalg.api.ndarray.INDArray`
  neu-1e - `org.nd4j.linalg.api.ndarray.INDArray`
  code - `int`
  lr - `double`"
  (^HierarchicSoftmax [^org.nd4j.linalg.api.ndarray.INDArray syn-0 ^org.nd4j.linalg.api.ndarray.INDArray syn-1 ^org.nd4j.linalg.api.ndarray.INDArray exp-table ^org.nd4j.linalg.api.ndarray.INDArray neu-1e ^Integer code ^Double lr]
    (new HierarchicSoftmax syn-0 syn-1 exp-table neu-1e code lr)))

(defn max-real-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^HierarchicSoftmax this]
    (-> this (.maxRealArguments))))

(defn get-shared-memory-size
  "This method returns amount of shared memory required for this specific Aggregate.
  PLEASE NOTE: this method is especially important for CUDA backend. On CPU backend it might be ignored, depending on Aggregate.

  returns: `int`"
  (^Integer [^HierarchicSoftmax this]
    (-> this (.getSharedMemorySize))))

(defn max-shapes
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^HierarchicSoftmax this]
    (-> this (.maxShapes))))

(defn max-int-array-size
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^HierarchicSoftmax this]
    (-> this (.maxIntArraySize))))

(defn max-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^HierarchicSoftmax this]
    (-> this (.maxArguments))))

(defn op-num
  "returns: `int`"
  (^Integer [^HierarchicSoftmax this]
    (-> this (.opNum))))

(defn name
  "returns: `java.lang.String`"
  (^java.lang.String [^HierarchicSoftmax this]
    (-> this (.name))))

(defn get-threads-per-instance
  "This method returns desired number of threads per Aggregate instance
  PLEASE NOTE: this method is especially important for CUDA backend. On CPU backend it might be ignored, depending on Aggregate.

  returns: `int`"
  (^Integer [^HierarchicSoftmax this]
    (-> this (.getThreadsPerInstance))))

(defn max-int-arrays
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^HierarchicSoftmax this]
    (-> this (.maxIntArrays))))

(defn max-index-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^HierarchicSoftmax this]
    (-> this (.maxIndexArguments))))

