(ns org.nd4j.autodiff.samediff.SameDiffOpExecutioner
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.autodiff.samediff SameDiffOpExecutioner]))

(defn ->same-diff-op-executioner
  "Constructor."
  (^SameDiffOpExecutioner []
    (new SameDiffOpExecutioner )))

(defn invoke
  "op - `org.nd4j.linalg.api.ops.Op`"
  ([^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.invoke op))))

(defn calculate-output-shape
  "op - `org.nd4j.linalg.api.ops.CustomOp`

  returns: `java.util.List<long[]>`"
  ([^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.CustomOp op]
    (-> this (.calculateOutputShape op))))

(defn forget-graph
  "id - `long`"
  ([^SameDiffOpExecutioner this ^Long id]
    (-> this (.forgetGraph id))))

(defn get-profiling-mode
  "Ths method returns current profiling

  returns: `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode`"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode [^SameDiffOpExecutioner this]
    (-> this (.getProfilingMode))))

(defn threshold-encode
  "This method encodes array as thresholds, updating input array at the same time

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  threshold - `double`
  boundary - @return encoded array is returned - `java.lang.Integer`

  returns: encoded array is returned - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray input ^Double threshold ^java.lang.Integer boundary]
    (-> this (.thresholdEncode input threshold boundary)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray input ^Double threshold]
    (-> this (.thresholdEncode input threshold))))

(defn bitmap-encode
  "This method returns number of elements affected by encoder

  ind-array - `org.nd4j.linalg.api.ndarray.INDArray`
  target - `org.nd4j.linalg.api.ndarray.INDArray`
  threshold - `double`

  returns: `long`"
  (^Long [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray ind-array ^org.nd4j.linalg.api.ndarray.INDArray target ^Double threshold]
    (-> this (.bitmapEncode ind-array target threshold)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray ind-array ^Double threshold]
    (-> this (.bitmapEncode ind-array threshold))))

(defn enable-verbose-mode
  "really-enable - `boolean`"
  ([^SameDiffOpExecutioner this ^Boolean really-enable]
    (-> this (.enableVerboseMode really-enable))))

(defn execution-mode
  "Get the execution mode for this
  execuioner

  returns: the execution mode for this executioner - `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionMode`"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionMode [^SameDiffOpExecutioner this]
    (-> this (.executionMode))))

(defn push
  "This method ensures all operations that supposed to be executed at this moment, are executed."
  ([^SameDiffOpExecutioner this]
    (-> this (.push))))

(defn print-environment-information
  "This method prints out environmental information returned by getEnvironmentInformation() method"
  ([^SameDiffOpExecutioner this]
    (-> this (.printEnvironmentInformation))))

(defn exec
  "Execute an accumulation along one or more dimensions

  accumulation - the accumulation - `org.nd4j.linalg.api.ops.impl.accum.Variance`
  bias-corrected - `boolean`
  dimension - the dimension @return the accmulation op - `int`

  returns: the accmulation op - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.impl.accum.Variance accumulation ^Boolean bias-corrected ^Integer dimension]
    (-> this (.exec accumulation bias-corrected dimension)))
  (^org.nd4j.linalg.api.ops.Op [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.Op op ^Integer dimension]
    (-> this (.exec op dimension)))
  (^org.nd4j.linalg.api.ops.Op [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.exec op))))

(defn bitmap-decode
  "encoded - `org.nd4j.linalg.api.ndarray.INDArray`
  target - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray encoded ^org.nd4j.linalg.api.ndarray.INDArray target]
    (-> this (.bitmapDecode encoded target))))

(defn verbose?
  "Description copied from interface: OpExecutioner

  returns: `boolean`"
  (^Boolean [^SameDiffOpExecutioner this]
    (-> this (.isVerbose))))

(defn commit
  "This method ensures all operations that supposed to be executed at this moment, are executed and finished."
  ([^SameDiffOpExecutioner this]
    (-> this (.commit))))

(defn get-environment-information
  "This method return set of key/value and
  key/key/value objects,
  describing current environment

  returns: `java.util.Properties`"
  (^java.util.Properties [^SameDiffOpExecutioner this]
    (-> this (.getEnvironmentInformation))))

(defn execute-graph
  "id - `long`
  map - `java.util.Map`
  reverse-map - `java.util.Map`

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^SameDiffOpExecutioner this ^Long id ^java.util.Map map ^java.util.Map reverse-map]
    (-> this (.executeGraph id map reverse-map))))

(defn exec-and-return
  "Execute and return the result from an accumulation

  op - the operation to execute - `org.nd4j.linalg.api.ops.impl.accum.Variance`
  bias-corrected - `boolean`

  returns: the accumulated result - `org.nd4j.linalg.api.ops.Accumulation`"
  (^org.nd4j.linalg.api.ops.Accumulation [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.impl.accum.Variance op ^Boolean bias-corrected]
    (-> this (.execAndReturn op bias-corrected)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.TransformOp op]
    (-> this (.execAndReturn op))))

(defn set-tad-threshold
  "This method allows to set desired number of sub-arrays per thread, for performance optimization purposes.
  I.e. if matrix has shape of 64 x 128, and threshold is set to 8, each thread will be processing 8 sub-arrays (sure, if you have 8 core cpu).
  If your cpu has, say, 4, cores, only 4 threads will be spawned, and each will process 16 sub-arrays

  Default value: 8

  threshold - `int`"
  ([^SameDiffOpExecutioner this ^Integer threshold]
    (-> this (.setTadThreshold threshold))))

(defn get-custom-operations
  "Description copied from interface: OpExecutioner

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ops.CustomOpDescriptor>`"
  (^java.util.Map [^SameDiffOpExecutioner this]
    (-> this (.getCustomOperations))))

(defn set-elements-threshold
  "This method allows to set desired number of elements per thread, for performance optimization purposes.
  I.e. if array contains 2048 elements, and threshold is set to 1024, 2 threads will be used for given op execution.

  Default value: 1024

  threshold - `int`"
  ([^SameDiffOpExecutioner this ^Integer threshold]
    (-> this (.setElementsThreshold threshold))))

(defn get-tad-manager
  "This method returns TADManager instance used for this OpExecutioner

  returns: `org.nd4j.linalg.cache.TADManager`"
  (^org.nd4j.linalg.cache.TADManager [^SameDiffOpExecutioner this]
    (-> this (.getTADManager))))

(defn set-profiling-mode
  "This method specifies desired profiling mode

  mode - `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode`"
  ([^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ProfilingMode mode]
    (-> this (.setProfilingMode mode))))

(defn set-execution-mode
  "Set the execution mode

  execution-mode - the execution mode - `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionMode`"
  ([^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionMode execution-mode]
    (-> this (.setExecutionMode execution-mode))))

(defn enable-debug-mode
  "really-enable - `boolean`"
  ([^SameDiffOpExecutioner this ^Boolean really-enable]
    (-> this (.enableDebugMode really-enable))))

(defn type
  "Description copied from interface: OpExecutioner

  returns: `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType`"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType [^SameDiffOpExecutioner this]
    (-> this (.type))))

(defn threshold-decode
  "This method decodes thresholds array, and puts it into target array

  encoded - `org.nd4j.linalg.api.ndarray.INDArray`
  target - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: target is returned - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray encoded ^org.nd4j.linalg.api.ndarray.INDArray target]
    (-> this (.thresholdDecode encoded target))))

(defn get-last-op
  "This method returns opName of the last invoked op

  returns: `java.lang.String`"
  (^java.lang.String [^SameDiffOpExecutioner this]
    (-> this (.getLastOp))))

(defn debug?
  "Description copied from interface: OpExecutioner

  returns: `boolean`"
  (^Boolean [^SameDiffOpExecutioner this]
    (-> this (.isDebug))))

(defn register-graph
  "id - `long`
  graph - `org.bytedeco.javacpp.Pointer`"
  ([^SameDiffOpExecutioner this ^Long id ^org.bytedeco.javacpp.Pointer graph]
    (-> this (.registerGraph id graph))))

(defn iterate-over-all-rows
  "Iterate over every row of every slice

  op - the operation to apply - `org.nd4j.linalg.api.ops.Op`"
  ([^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.iterateOverAllRows op))))

(defn iterate-over-all-columns
  "Iterate over every column of every slice

  op - the operation to apply - `org.nd4j.linalg.api.ops.Op`"
  ([^SameDiffOpExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.iterateOverAllColumns op))))

