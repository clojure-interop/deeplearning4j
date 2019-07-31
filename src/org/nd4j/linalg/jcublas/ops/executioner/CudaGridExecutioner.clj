(ns org.nd4j.linalg.jcublas.ops.executioner.CudaGridExecutioner
  "mGRID implementation for CUDA
 PLEASE NOTE: WORK IN PROGRESS, DO NOT EVER USE THIS EXECUTIONER IN PRODUCTION"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.ops.executioner CudaGridExecutioner]))

(defn ->cuda-grid-executioner
  "Constructor."
  (^CudaGridExecutioner []
    (new CudaGridExecutioner )))

(defn add-to-watchdog
  "array - `org.nd4j.linalg.api.ndarray.INDArray`
  tag - `java.lang.String`"
  ([^CudaGridExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray array ^java.lang.String tag]
    (-> this (.addToWatchdog array tag))))

(defn get-queue-length
  "This method returns Op queue lengths for current device
  PLEASE NOTE: This value also includes variative lastOp

  returns: `int`"
  (^Integer [^CudaGridExecutioner this]
    (-> this (.getQueueLength))))

(defn get-meta-counter
  "returns: `long`"
  (^Long [^CudaGridExecutioner this]
    (-> this (.getMetaCounter))))

(defn flush-queue-blocking
  "This method forces all currently enqueued ops to be executed immediately
  PLEASE NOTE: This call is always blocking, until all queued operations are finished"
  ([^CudaGridExecutioner this]
    (-> this (.flushQueueBlocking))))

(defn push
  "Description copied from interface: OpExecutioner"
  ([^CudaGridExecutioner this]
    (-> this (.push))))

(defn exec
  "Description copied from interface: OpExecutioner

  op - the operation to execute - `org.nd4j.linalg.api.ops.Op`
  dimension - `int`

  returns: `org.nd4j.linalg.api.ops.Op`"
  (^org.nd4j.linalg.api.ops.Op [^CudaGridExecutioner this ^org.nd4j.linalg.api.ops.Op op ^Integer dimension]
    (-> this (.exec op dimension)))
  (^org.nd4j.linalg.api.ops.Op [^CudaGridExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.exec op))))

(defn get-execution-counter
  "returns: `long`"
  (^Long [^CudaGridExecutioner this]
    (-> this (.getExecutionCounter))))

(defn commit
  "Description copied from interface: OpExecutioner"
  ([^CudaGridExecutioner this]
    (-> this (.commit))))

(defn aggregate
  "This method enqueues aggregate op for future invocation.
  Key value will be used to batch individual ops

  op - `org.nd4j.linalg.api.ops.aggregates.Aggregate`
  key - `long`"
  ([^CudaGridExecutioner this ^org.nd4j.linalg.api.ops.aggregates.Aggregate op ^Long key]
    (-> this (.aggregate op key)))
  ([^CudaGridExecutioner this ^org.nd4j.linalg.api.ops.aggregates.Aggregate op]
    (-> this (.aggregate op))))

(defn flush-queue
  "This method forces all currently enqueued ops to be executed immediately
  PLEASE NOTE: This call IS non-blocking"
  ([^CudaGridExecutioner this]
    (-> this (.flushQueue))))

