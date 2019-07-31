(ns org.nd4j.linalg.api.ops.executioner.DefaultOpExecutioner
  "Basic op executioner. Knows how to iterate over
 the buffers of each
 respective ndarray and apply transformations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.executioner DefaultOpExecutioner]))

(defn ->default-op-executioner
  "Constructor."
  (^DefaultOpExecutioner []
    (new DefaultOpExecutioner )))

(defn *validate-data-type
  "Validate the data types
  for the given operation

  expected-type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`
  op - `org.nd4j.linalg.api.ops.Op`"
  ([^org.nd4j.linalg.api.buffer.DataBuffer$Type expected-type ^org.nd4j.linalg.api.ops.Op op]
    (DefaultOpExecutioner/validateDataType expected-type op)))

(defn calculate-output-shape
  "op - `org.nd4j.linalg.api.ops.CustomOp`

  returns: `java.util.List<long[]>`"
  ([^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.CustomOp op]
    (-> this (.calculateOutputShape op))))

(defn forget-graph
  "id - `long`"
  ([^DefaultOpExecutioner this ^Long id]
    (-> this (.forgetGraph id))))

(defn get-profiling-mode
  "Description copied from interface: OpExecutioner

  returns: `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode`"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode [^DefaultOpExecutioner this]
    (-> this (.getProfilingMode))))

(defn profiling-hook-out
  "op - `org.nd4j.linalg.api.ops.Op`
  time-start - `long`"
  ([^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.Op op ^Long time-start]
    (-> this (.profilingHookOut op time-start))))

(defn threshold-encode
  "Description copied from interface: OpExecutioner

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  threshold - `double`
  boundary - `java.lang.Integer`

  returns: encoded array is returned - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray input ^Double threshold ^java.lang.Integer boundary]
    (-> this (.thresholdEncode input threshold boundary)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray input ^Double threshold]
    (-> this (.thresholdEncode input threshold))))

(defn bitmap-encode
  "Description copied from interface: OpExecutioner

  ind-array - `org.nd4j.linalg.api.ndarray.INDArray`
  target - `org.nd4j.linalg.api.ndarray.INDArray`
  threshold - `double`

  returns: `long`"
  (^Long [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray ind-array ^org.nd4j.linalg.api.ndarray.INDArray target ^Double threshold]
    (-> this (.bitmapEncode ind-array target threshold)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray ind-array ^Double threshold]
    (-> this (.bitmapEncode ind-array threshold))))

(defn enable-verbose-mode
  "really-enable - `boolean`"
  ([^DefaultOpExecutioner this ^Boolean really-enable]
    (-> this (.enableVerboseMode really-enable))))

(defn execution-mode
  "Description copied from interface: OpExecutioner

  returns: the execution mode for this executioner - `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionMode`"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionMode [^DefaultOpExecutioner this]
    (-> this (.executionMode))))

(defn push
  "Description copied from interface: OpExecutioner"
  ([^DefaultOpExecutioner this]
    (-> this (.push))))

(defn print-environment-information
  "Description copied from interface: OpExecutioner"
  ([^DefaultOpExecutioner this]
    (-> this (.printEnvironmentInformation))))

(defn exec
  "Description copied from interface: OpExecutioner

  accumulation - the accumulation - `org.nd4j.linalg.api.ops.impl.accum.Variance`
  bias-corrected - `boolean`
  dimension - the dimension - `int`

  returns: the accmulation op - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.impl.accum.Variance accumulation ^Boolean bias-corrected ^Integer dimension]
    (-> this (.exec accumulation bias-corrected dimension)))
  (^org.nd4j.linalg.api.ops.Op [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.Op op ^Integer dimension]
    (-> this (.exec op dimension)))
  (^org.nd4j.linalg.api.ops.Op [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.exec op))))

(defn bitmap-decode
  "encoded - `org.nd4j.linalg.api.ndarray.INDArray`
  target - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray encoded ^org.nd4j.linalg.api.ndarray.INDArray target]
    (-> this (.bitmapDecode encoded target))))

(defn verbose?
  "Description copied from interface: OpExecutioner

  returns: `boolean`"
  (^Boolean [^DefaultOpExecutioner this]
    (-> this (.isVerbose))))

(defn commit
  "Description copied from interface: OpExecutioner"
  ([^DefaultOpExecutioner this]
    (-> this (.commit))))

(defn get-environment-information
  "This method return set of key/value and key/key/value objects, describing current environment

  returns: `java.util.Properties`"
  (^java.util.Properties [^DefaultOpExecutioner this]
    (-> this (.getEnvironmentInformation))))

(defn execute-graph
  "id - `long`
  map - `java.util.Map`
  reverse-map - `java.util.Map`

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^DefaultOpExecutioner this ^Long id ^java.util.Map map ^java.util.Map reverse-map]
    (-> this (.executeGraph id map reverse-map))))

(defn exec-and-return
  "Description copied from interface: OpExecutioner

  op - the operation to execute - `org.nd4j.linalg.api.ops.impl.accum.Variance`
  bias-corrected - `boolean`

  returns: the accumulated result - `org.nd4j.linalg.api.ops.Accumulation`"
  (^org.nd4j.linalg.api.ops.Accumulation [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.impl.accum.Variance op ^Boolean bias-corrected]
    (-> this (.execAndReturn op bias-corrected)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.execAndReturn op))))

(defn set-tad-threshold
  "This method allows to set desired number of sub-arrays per thread, for performance optimization purposes.
  I.e. if matrix has shape of 64 x 128, and threshold is set to 8, each thread will be processing 8 sub-arrays (sure, if you have 8 core cpu).
  If your cpu has, say, 4, cores, only 4 threads will be spawned, and each will process 16 sub-arrays

  Default value: 8

  threshold - `int`"
  ([^DefaultOpExecutioner this ^Integer threshold]
    (-> this (.setTadThreshold threshold))))

(defn get-custom-operations
  "Description copied from interface: OpExecutioner

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ops.CustomOpDescriptor>`"
  (^java.util.Map [^DefaultOpExecutioner this]
    (-> this (.getCustomOperations))))

(defn set-elements-threshold
  "This method allows to set desired number of elements per thread, for performance optimization purposes.
  I.e. if array contains 2048 elements, and threshold is set to 1024, 2 threads will be used for given op execution.

  Default value: 1024

  threshold - `int`"
  ([^DefaultOpExecutioner this ^Integer threshold]
    (-> this (.setElementsThreshold threshold))))

(defn get-tad-manager
  "Description copied from interface: OpExecutioner

  returns: `org.nd4j.linalg.cache.TADManager`"
  (^org.nd4j.linalg.cache.TADManager [^DefaultOpExecutioner this]
    (-> this (.getTADManager))))

(defn set-profiling-mode
  "Description copied from interface: OpExecutioner

  mode - `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode`"
  ([^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode mode]
    (-> this (.setProfilingMode mode))))

(defn set-execution-mode
  "Description copied from interface: OpExecutioner

  execution-mode - the execution mode - `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionMode`"
  ([^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionMode execution-mode]
    (-> this (.setExecutionMode execution-mode))))

(defn enable-debug-mode
  "really-enable - `boolean`"
  ([^DefaultOpExecutioner this ^Boolean really-enable]
    (-> this (.enableDebugMode really-enable))))

(defn type
  "Description copied from interface: OpExecutioner

  returns: `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType`"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType [^DefaultOpExecutioner this]
    (-> this (.type))))

(defn threshold-decode
  "Description copied from interface: OpExecutioner

  encoded - `org.nd4j.linalg.api.ndarray.INDArray`
  target - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: target is returned - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray encoded ^org.nd4j.linalg.api.ndarray.INDArray target]
    (-> this (.thresholdDecode encoded target))))

(defn get-last-op
  "Description copied from interface: OpExecutioner

  returns: `java.lang.String`"
  (^java.lang.String [^DefaultOpExecutioner this]
    (-> this (.getLastOp))))

(defn debug?
  "Description copied from interface: OpExecutioner

  returns: `boolean`"
  (^Boolean [^DefaultOpExecutioner this]
    (-> this (.isDebug))))

(defn register-graph
  "id - `long`
  graph - `org.bytedeco.javacpp.Pointer`"
  ([^DefaultOpExecutioner this ^Long id ^org.bytedeco.javacpp.Pointer graph]
    (-> this (.registerGraph id graph))))

(defn profiling-hook-in
  "op - `org.nd4j.linalg.api.ops.Op`
  tad-buffers - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `long`"
  (^Long [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.Op op ^org.nd4j.linalg.api.buffer.DataBuffer tad-buffers]
    (-> this (.profilingHookIn op tad-buffers)))
  (^Long [^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.profilingHookIn op))))

(defn iterate-over-all-rows
  "Description copied from interface: OpExecutioner

  op - the operation to apply - `org.nd4j.linalg.api.ops.Op`"
  ([^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.iterateOverAllRows op))))

(defn iterate-over-all-columns
  "Description copied from interface: OpExecutioner

  op - the operation to apply - `org.nd4j.linalg.api.ops.Op`"
  ([^DefaultOpExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.iterateOverAllColumns op))))

