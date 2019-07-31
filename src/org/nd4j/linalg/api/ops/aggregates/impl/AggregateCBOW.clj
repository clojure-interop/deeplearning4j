(ns org.nd4j.linalg.api.ops.aggregates.impl.AggregateCBOW
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.aggregates.impl AggregateCBOW]))

(defn ->aggregate-cbow
  "Constructor.

  Optional constructor for ParagraphVectors PV-DM implementation

  syn-0 - `org.nd4j.linalg.api.ndarray.INDArray`
  syn-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  syn-1-neg - `org.nd4j.linalg.api.ndarray.INDArray`
  exp-table - `org.nd4j.linalg.api.ndarray.INDArray`
  neg-table - `org.nd4j.linalg.api.ndarray.INDArray`
  word-idx - `int`
  idx-syn-0 - `int[]`
  idx-syn-1 - `int[]`
  codes - `int[]`
  negative-rounds - `int`
  ng-starter - `int`
  vector-length - `int`
  alpha - `double`
  next-random - `long`
  vocab-size - `int`
  num-labels - `int`
  train-words - `boolean`
  inference-vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^AggregateCBOW [^org.nd4j.linalg.api.ndarray.INDArray syn-0 ^org.nd4j.linalg.api.ndarray.INDArray syn-1 ^org.nd4j.linalg.api.ndarray.INDArray syn-1-neg ^org.nd4j.linalg.api.ndarray.INDArray exp-table ^org.nd4j.linalg.api.ndarray.INDArray neg-table ^Integer word-idx idx-syn-0 idx-syn-1 codes ^Integer negative-rounds ^Integer ng-starter ^Integer vector-length ^Double alpha ^Long next-random ^Integer vocab-size ^Integer num-labels ^Boolean train-words ^org.nd4j.linalg.api.ndarray.INDArray inference-vector]
    (new AggregateCBOW syn-0 syn-1 syn-1-neg exp-table neg-table word-idx idx-syn-0 idx-syn-1 codes negative-rounds ng-starter vector-length alpha next-random vocab-size num-labels train-words inference-vector))
  (^AggregateCBOW [^org.nd4j.linalg.api.ndarray.INDArray syn-0 ^org.nd4j.linalg.api.ndarray.INDArray syn-1 ^org.nd4j.linalg.api.ndarray.INDArray syn-1-neg ^org.nd4j.linalg.api.ndarray.INDArray exp-table ^org.nd4j.linalg.api.ndarray.INDArray neg-table ^Integer word-idx idx-syn-0 idx-syn-1 codes ^Integer negative-rounds ^Integer ng-starter ^Integer vector-length ^Double alpha ^Long next-random ^Integer vocab-size]
    (new AggregateCBOW syn-0 syn-1 syn-1-neg exp-table neg-table word-idx idx-syn-0 idx-syn-1 codes negative-rounds ng-starter vector-length alpha next-random vocab-size)))

(defn max-real-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateCBOW this]
    (-> this (.maxRealArguments))))

(defn get-shared-memory-size
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateCBOW this]
    (-> this (.getSharedMemorySize))))

(defn max-shapes
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateCBOW this]
    (-> this (.maxShapes))))

(defn max-int-array-size
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateCBOW this]
    (-> this (.maxIntArraySize))))

(defn max-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateCBOW this]
    (-> this (.maxArguments))))

(defn op-num
  "returns: `int`"
  (^Integer [^AggregateCBOW this]
    (-> this (.opNum))))

(defn name
  "returns: `java.lang.String`"
  (^java.lang.String [^AggregateCBOW this]
    (-> this (.name))))

(defn get-threads-per-instance
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateCBOW this]
    (-> this (.getThreadsPerInstance))))

(defn max-int-arrays
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateCBOW this]
    (-> this (.maxIntArrays))))

(defn max-index-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateCBOW this]
    (-> this (.maxIndexArguments))))

