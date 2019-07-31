(ns org.nd4j.linalg.jcublas.ops.executioner.CudaExecutioner
  "JCuda executioner.

 Runs ops directly on the gpu
 If requested Op doesn't exist within GPU context, DefaultOpExecutioner will be used, with arrays/buffers updated after that."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.ops.executioner CudaExecutioner]))

(defn ->cuda-executioner
  "Constructor."
  (^CudaExecutioner []
    (new CudaExecutioner )))

(defn calculate-output-shape
  "op - `org.nd4j.linalg.api.ops.CustomOp`

  returns: `java.util.List<long[]>`"
  ([^CudaExecutioner this ^org.nd4j.linalg.api.ops.CustomOp op]
    (-> this (.calculateOutputShape op))))

(defn forget-graph
  "id - `long`"
  ([^CudaExecutioner this ^Long id]
    (-> this (.forgetGraph id))))

(defn threshold-encode
  "Description copied from interface: OpExecutioner

  input - `org.nd4j.linalg.api.ndarray.INDArray`
  threshold - `double`
  boundary - `java.lang.Integer`

  returns: encoded array is returned - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudaExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray input ^Double threshold ^java.lang.Integer boundary]
    (-> this (.thresholdEncode input threshold boundary)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudaExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray input ^Double threshold]
    (-> this (.thresholdEncode input threshold))))

(defn bitmap-encode
  "Description copied from interface: OpExecutioner

  ind-array - `org.nd4j.linalg.api.ndarray.INDArray`
  target - `org.nd4j.linalg.api.ndarray.INDArray`
  threshold - `double`

  returns: `long`"
  (^Long [^CudaExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray ind-array ^org.nd4j.linalg.api.ndarray.INDArray target ^Double threshold]
    (-> this (.bitmapEncode ind-array target threshold))))

(defn enable-verbose-mode
  "really-enable - `boolean`"
  ([^CudaExecutioner this ^Boolean really-enable]
    (-> this (.enableVerboseMode really-enable))))

(defn print-environment-information
  "Description copied from interface: OpExecutioner"
  ([^CudaExecutioner this]
    (-> this (.printEnvironmentInformation))))

(defn exec
  "Description copied from interface: OpExecutioner

  op - the accumulation - `org.nd4j.linalg.api.ops.BroadcastOp`
  dimension - the dimension - `int`

  returns: the broadcast op - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudaExecutioner this ^org.nd4j.linalg.api.ops.BroadcastOp op ^Integer dimension]
    (-> this (.exec op dimension)))
  (^org.nd4j.linalg.api.ops.Op [^CudaExecutioner this ^org.nd4j.linalg.api.ops.Op op]
    (-> this (.exec op))))

(defn get-native-ops
  "returns: `org.nd4j.nativeblas.NativeOps`"
  (^org.nd4j.nativeblas.NativeOps [^CudaExecutioner this]
    (-> this (.getNativeOps))))

(defn bitmap-decode
  "encoded - `org.nd4j.linalg.api.ndarray.INDArray`
  target - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudaExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray encoded ^org.nd4j.linalg.api.ndarray.INDArray target]
    (-> this (.bitmapDecode encoded target))))

(defn commit
  "Description copied from interface: OpExecutioner"
  ([^CudaExecutioner this]
    (-> this (.commit))))

(defn get-environment-information
  "This method return set of key/value
  and key/key/value objects,
  describing current environment

  returns: `java.util.Properties`"
  (^java.util.Properties [^CudaExecutioner this]
    (-> this (.getEnvironmentInformation))))

(defn execute-graph
  "id - `long`
  map - `java.util.Map`
  reverse-map - `java.util.Map`

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^CudaExecutioner this ^Long id ^java.util.Map map ^java.util.Map reverse-map]
    (-> this (.executeGraph id map reverse-map))))

(defn exec-and-return
  "Description copied from interface: OpExecutioner

  op - the operation to execute - `org.nd4j.linalg.api.ops.TransformOp`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudaExecutioner this ^org.nd4j.linalg.api.ops.TransformOp op]
    (-> this (.execAndReturn op))))

(defn set-tad-threshold
  "This method allows to set desired number of sub-arrays per thread, for performance optimization purposes.
  I.e. if matrix has shape of 64 x 128, and threshold is set to 8, each thread will be processing 8 sub-arrays (sure, if you have 8 core cpu).
  If your cpu has, say, 4, cores, only 4 threads will be spawned, and each will process 16 sub-arrays

  Default value: 8

  threshold - `int`"
  ([^CudaExecutioner this ^Integer threshold]
    (-> this (.setTadThreshold threshold))))

(defn get-custom-operations
  "Description copied from interface: OpExecutioner

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ops.CustomOpDescriptor>`"
  (^java.util.Map [^CudaExecutioner this]
    (-> this (.getCustomOperations))))

(defn set-elements-threshold
  "This method allows to set desired number of elements per thread, for performance optimization purposes.
  I.e. if array contains 2048 elements, and threshold is set to 1024, 2 threads will be used for given op execution.

  Default value: 1024

  threshold - `int`"
  ([^CudaExecutioner this ^Integer threshold]
    (-> this (.setElementsThreshold threshold))))

(defn get-tad-manager
  "Description copied from interface: OpExecutioner

  returns: `org.nd4j.linalg.cache.TADManager`"
  (^org.nd4j.linalg.cache.TADManager [^CudaExecutioner this]
    (-> this (.getTADManager))))

(defn enable-debug-mode
  "really-enable - `boolean`"
  ([^CudaExecutioner this ^Boolean really-enable]
    (-> this (.enableDebugMode really-enable))))

(defn type
  "Description copied from interface: OpExecutioner

  returns: `org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType`"
  (^org.nd4j.linalg.api.ops.executioner.OpExecutioner$ExecutionerType [^CudaExecutioner this]
    (-> this (.type))))

(defn threshold-decode
  "Description copied from interface: OpExecutioner

  encoded - `org.nd4j.linalg.api.ndarray.INDArray`
  target - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: target is returned - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CudaExecutioner this ^org.nd4j.linalg.api.ndarray.INDArray encoded ^org.nd4j.linalg.api.ndarray.INDArray target]
    (-> this (.thresholdDecode encoded target))))

(defn get-last-op
  "Description copied from interface: OpExecutioner

  returns: `java.lang.String`"
  (^java.lang.String [^CudaExecutioner this]
    (-> this (.getLastOp))))

(defn register-graph
  "id - `long`
  graph - `org.bytedeco.javacpp.Pointer`"
  ([^CudaExecutioner this ^Long id ^org.bytedeco.javacpp.Pointer graph]
    (-> this (.registerGraph id graph))))

