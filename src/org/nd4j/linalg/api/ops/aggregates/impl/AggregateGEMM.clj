(ns org.nd4j.linalg.api.ops.aggregates.impl.AggregateGEMM
  "PLEASE NOTE: This op is available for CPU only, and should NOT be ever called manually, unless you know why you're using it"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.aggregates.impl AggregateGEMM]))

(defn ->aggregate-gemm
  "Constructor.

  order - `int`
  trans-a - `int`
  trans-b - `int`
  m - `int`
  n - `int`
  k - `int`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  lda - `int`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  ldb - `int`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`
  ldc - `int`"
  (^AggregateGEMM [^Integer order ^Integer trans-a ^Integer trans-b ^Integer m ^Integer n ^Integer k ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^Integer lda ^org.nd4j.linalg.api.ndarray.INDArray b ^Integer ldb ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c ^Integer ldc]
    (new AggregateGEMM order trans-a trans-b m n k alpha a lda b ldb beta c ldc))
  (^AggregateGEMM []
    (new AggregateGEMM )))

(defn max-real-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateGEMM this]
    (-> this (.maxRealArguments))))

(defn get-shared-memory-size
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateGEMM this]
    (-> this (.getSharedMemorySize))))

(defn max-shapes
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateGEMM this]
    (-> this (.maxShapes))))

(defn max-int-array-size
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateGEMM this]
    (-> this (.maxIntArraySize))))

(defn max-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateGEMM this]
    (-> this (.maxArguments))))

(defn op-num
  "returns: `int`"
  (^Integer [^AggregateGEMM this]
    (-> this (.opNum))))

(defn name
  "returns: `java.lang.String`"
  (^java.lang.String [^AggregateGEMM this]
    (-> this (.name))))

(defn get-threads-per-instance
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateGEMM this]
    (-> this (.getThreadsPerInstance))))

(defn max-int-arrays
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateGEMM this]
    (-> this (.maxIntArrays))))

(defn max-index-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateGEMM this]
    (-> this (.maxIndexArguments))))

