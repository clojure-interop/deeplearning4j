(ns org.nd4j.linalg.profiler.OpProfiler
  "This class is suited for execution statistics
 gathering on Op/Array level: number of
 sequential ops executed on the same data
 PLEASE NOTE: This isn't thread-safe implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler OpProfiler]))

(defn *get-instance
  "returns: `org.nd4j.linalg.profiler.OpProfiler`"
  (^org.nd4j.linalg.profiler.OpProfiler []
    (OpProfiler/getInstance )))

(defn clear-listener
  "Clear the listener from the profiler

  listener - the listener to clear - `org.nd4j.linalg.profiler.OpProfiler$OpProfilerListener`"
  ([^OpProfiler this ^org.nd4j.linalg.profiler.OpProfiler$OpProfilerListener listener]
    (-> this (.clearListener listener))))

(defn time-blas-call
  ""
  ([^OpProfiler this]
    (-> this (.timeBlasCall))))

(defn process-tad-operands
  "tad-buffers - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.profiler.OpProfiler$PenaltyCause[]`"
  ([^OpProfiler this ^org.nd4j.linalg.api.buffer.DataBuffer tad-buffers]
    (-> this (.processTADOperands tad-buffers))))

(defn time-op-call
  "op - `org.nd4j.linalg.api.ops.Op`
  start-time - `long`"
  ([^OpProfiler this ^org.nd4j.linalg.api.ops.Op op ^Long start-time]
    (-> this (.timeOpCall op start-time))))

(defn get-invocations-count
  "returns: `long`"
  (^Long [^OpProfiler this]
    (-> this (.getInvocationsCount))))

(defn get-scalar-aggregator
  "returns: `org.nd4j.linalg.profiler.data.StackAggregator`"
  (^org.nd4j.linalg.profiler.data.StackAggregator [^OpProfiler this]
    (-> this (.getScalarAggregator))))

(defn print-out-dashboard
  "This method prints out dashboard state"
  ([^OpProfiler this]
    (-> this (.printOutDashboard))))

(defn process-stack-call
  "This method builds

  op - `org.nd4j.linalg.api.ops.Op`
  time-start - `long`"
  ([^OpProfiler this ^org.nd4j.linalg.api.ops.Op op ^Long time-start]
    (-> this (.processStackCall op time-start))))

(defn process-orders
  "operands - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.lang.String`"
  (^java.lang.String [^OpProfiler this ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.processOrders operands))))

(defn reset
  "This method resets all counters"
  ([^OpProfiler this]
    (-> this (.reset))))

(defn add-listener
  "dd the listener to the profiler

  listener - the listener to add - `org.nd4j.linalg.profiler.OpProfiler$OpProfilerListener`"
  ([^OpProfiler this ^org.nd4j.linalg.profiler.OpProfiler$OpProfilerListener listener]
    (-> this (.addListener listener))))

(defn get-mixed-order-aggregator
  "Dev-time method.

  returns: `org.nd4j.linalg.profiler.data.StackAggregator`"
  (^org.nd4j.linalg.profiler.data.StackAggregator [^OpProfiler this]
    (-> this (.getMixedOrderAggregator))))

(defn process-blas-call
  "is-gemm - `boolean`
  operands - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^OpProfiler this ^Boolean is-gemm ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.processBlasCall is-gemm operands)))
  ([^OpProfiler this ^java.lang.String blas-op-name]
    (-> this (.processBlasCall blas-op-name))))

(defn process-scalar-call
  "This method tracks INDArray.putScalar()/getScalar() calls"
  ([^OpProfiler this]
    (-> this (.processScalarCall))))

(defn process-memory-access
  ""
  ([^OpProfiler this]
    (-> this (.processMemoryAccess))))

(defn process-op-call
  "This method tracks op calls

  op - `org.nd4j.linalg.api.ops.Op`"
  ([^OpProfiler this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.processOpCall op)))
  ([^OpProfiler this ^org.nd4j.linalg.api.ops.Op op ^org.nd4j.linalg.api.buffer.DataBuffer tad-buffers]
    (-> this (.processOpCall op tad-buffers))))

(defn process-operands
  "This method checks for something somewhere

  operands - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.profiler.OpProfiler$PenaltyCause[]`"
  ([^OpProfiler this ^org.nd4j.linalg.api.ndarray.INDArray operands]
    (-> this (.processOperands operands)))
  ([^OpProfiler this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.processOperands x y z)))
  ([^OpProfiler this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.processOperands x y))))

