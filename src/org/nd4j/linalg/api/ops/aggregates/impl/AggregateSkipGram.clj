(ns org.nd4j.linalg.api.ops.aggregates.impl.AggregateSkipGram
  "This aggregate encapsulates AggregateSkipGram training round for a given word and context"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.aggregates.impl AggregateSkipGram]))

(defn ->aggregate-skip-gram
  "Constructor.

  This is special signature suitable for use with VoidParameterServer, never ever use it outside of spark-nlp

  w-1 - `int`
  w-2 - `int`
  codes - `int[]`
  points - `int[]`
  neg-samples - `int`
  lr - `double`
  vector-length - `int`"
  (^AggregateSkipGram [^Integer w-1 ^Integer w-2 codes points ^Integer neg-samples ^Double lr ^Integer vector-length]
    (new AggregateSkipGram w-1 w-2 codes points neg-samples lr vector-length))
  (^AggregateSkipGram [^org.nd4j.linalg.api.ndarray.INDArray syn-0 ^org.nd4j.linalg.api.ndarray.INDArray syn-1 ^org.nd4j.linalg.api.ndarray.INDArray syn-1-neg ^org.nd4j.linalg.api.ndarray.INDArray exp-table ^org.nd4j.linalg.api.ndarray.INDArray neg-table ^Integer idx-syn-0 idx-syn-1 codes ^Integer negative-rounds ^Integer ng-starter ^Integer vector-length ^Double alpha ^Long next-random ^Integer vocab-size ^org.nd4j.linalg.api.ndarray.INDArray inference-vector]
    (new AggregateSkipGram syn-0 syn-1 syn-1-neg exp-table neg-table idx-syn-0 idx-syn-1 codes negative-rounds ng-starter vector-length alpha next-random vocab-size inference-vector))
  (^AggregateSkipGram [^org.nd4j.linalg.api.ndarray.INDArray syn-0 ^org.nd4j.linalg.api.ndarray.INDArray syn-1 ^org.nd4j.linalg.api.ndarray.INDArray syn-1-neg ^org.nd4j.linalg.api.ndarray.INDArray exp-table ^org.nd4j.linalg.api.ndarray.INDArray neg-table ^Integer idx-syn-0 idx-syn-1 codes ^Integer negative-rounds ^Integer ng-starter ^Integer vector-length ^Double alpha ^Long next-random ^Integer vocab-size]
    (new AggregateSkipGram syn-0 syn-1 syn-1-neg exp-table neg-table idx-syn-0 idx-syn-1 codes negative-rounds ng-starter vector-length alpha next-random vocab-size)))

(defn max-real-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateSkipGram this]
    (-> this (.maxRealArguments))))

(defn get-shared-memory-size
  "This method returns amount of shared memory required for this specific Aggregate.
  PLEASE NOTE: this method is especially important for CUDA backend. On CPU backend it might be ignored, depending on Aggregate.

  returns: `int`"
  (^Integer [^AggregateSkipGram this]
    (-> this (.getSharedMemorySize))))

(defn max-shapes
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateSkipGram this]
    (-> this (.maxShapes))))

(defn max-int-array-size
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateSkipGram this]
    (-> this (.maxIntArraySize))))

(defn max-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateSkipGram this]
    (-> this (.maxArguments))))

(defn op-num
  "returns: `int`"
  (^Integer [^AggregateSkipGram this]
    (-> this (.opNum))))

(defn name
  "returns: `java.lang.String`"
  (^java.lang.String [^AggregateSkipGram this]
    (-> this (.name))))

(defn get-threads-per-instance
  "This method returns desired number of threads per Aggregate instance
  PLEASE NOTE: this method is especially important for CUDA backend. On CPU backend it might be ignored, depending on Aggregate.

  returns: `int`"
  (^Integer [^AggregateSkipGram this]
    (-> this (.getThreadsPerInstance))))

(defn max-int-arrays
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateSkipGram this]
    (-> this (.maxIntArrays))))

(defn max-index-arguments
  "Description copied from interface: Aggregate

  returns: `int`"
  (^Integer [^AggregateSkipGram this]
    (-> this (.maxIndexArguments))))

