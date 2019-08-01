(ns org.nd4j.nativeblas.NativeOps
  "Native interface for
 op execution on cpu"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas NativeOps]))

(defn ->native-ops
  "Constructor.

  p - `org.bytedeco.javacpp.Pointer`"
  (^NativeOps [^org.bytedeco.javacpp.Pointer p]
    (new NativeOps p)))

(defn *get-cores
  "totals - `int`

  returns: `int`"
  (^Integer [^Integer totals]
    (NativeOps/getCores totals)))

(defn exec-random-float
  "z-shape-buffer - `org.bytedeco.javacpp.LongPointer`
  extra-arguments - `org.bytedeco.javacpp.FloatPointer`

  returns: `void execRandomFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.Pointer state, org.bytedeco.javacpp.FloatPointer z, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape-buffer ^org.bytedeco.javacpp.FloatPointer extra-arguments]
    (-> this (.execRandomFloat z-shape-buffer extra-arguments))))

(defn get-device-minor
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.getDeviceMinor ptr-to-device-id))))

(defn malloc-host
  "memory-size - `long`
  flags - `int`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^Long memory-size ^Integer flags]
    (-> this (.mallocHost memory-size flags))))

(defn exec-custom-op-with-scope-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  state - `org.bytedeco.javacpp.Pointer`
  op-hash - `long`
  scopes - `long[]`
  num-scopes - `int`
  input-buffers - `org.bytedeco.javacpp.PointerPointer`
  input-shapes - `org.bytedeco.javacpp.PointerPointer`
  num-inputs - `int`
  output-buffers - `org.bytedeco.javacpp.PointerPointer`
  output-shapes - `org.bytedeco.javacpp.PointerPointer`
  num-outputs - `int`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer state ^Long op-hash scopes ^Integer num-scopes ^org.bytedeco.javacpp.PointerPointer input-buffers ^org.bytedeco.javacpp.PointerPointer input-shapes ^Integer num-inputs ^org.bytedeco.javacpp.PointerPointer output-buffers ^org.bytedeco.javacpp.PointerPointer output-shapes ^Integer num-outputs]
    (-> this (.execCustomOpWithScopeFloat extra-pointers state op-hash scopes num-scopes input-buffers input-shapes num-inputs output-buffers output-shapes num-outputs))))

(defn exec-meta-predicate-reduce-float
  "tad-offsets - `org.bytedeco.javacpp.LongPointer`
  extra-a - `org.bytedeco.javacpp.FloatPointer`
  extra-b - `org.bytedeco.javacpp.FloatPointer`
  scalar-a - `float`
  scalar-b - `float`
  scalar-returned - `boolean`

  returns: `void execMetaPredicateReduceFloat(org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, org.bytedeco.javacpp.FloatPointer dx, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer dy, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.FloatPointer dz, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zShapeInfo, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer tad-offsets ^org.bytedeco.javacpp.FloatPointer extra-a ^org.bytedeco.javacpp.FloatPointer extra-b ^Float scalar-a ^Float scalar-b ^Boolean scalar-returned]
    (-> this (.execMetaPredicateReduceFloat tad-offsets extra-a extra-b scalar-a scalar-b scalar-returned))))

(defn set-tad-threshold
  "This method allows you to specify minimal number of TADs per thread/block during op call
  PLEASE NOTE: Changing this value might and will affect performance.

  value - `int`"
  ([^NativeOps this ^Integer value]
    (-> this (.setTADThreshold value))))

(defn exec-reduce-scalar-half
  "extra-params - `org.bytedeco.javacpp.ShortPointer`

  returns: `float execReduceScalarHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params]
    (-> this (.execReduceScalarHalf extra-params))))

(defn malloc-device
  "memory-size - `long`
  ptr-to-device-id - `org.bytedeco.javacpp.Pointer`
  flags - `int`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^Long memory-size ^org.bytedeco.javacpp.Pointer ptr-to-device-id ^Integer flags]
    (-> this (.mallocDevice memory-size ptr-to-device-id flags))))

(defn create-event
  "returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this]
    (-> this (.createEvent))))

(defn set-omp-num-threads
  "Sets the number of openmp threads

  threads - `int`"
  ([^NativeOps this ^Integer threads]
    (-> this (.setOmpNumThreads threads))))

(defn decode-threshold-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.Pointer`
  n - `long`
  dz - `org.bytedeco.javacpp.DoublePointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer dx ^Long n ^org.bytedeco.javacpp.DoublePointer dz]
    (-> this (.decodeThresholdDouble extra-pointers dx n dz))))

(defn destroy-random
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.destroyRandom pointer))))

(defn set-grid-limit
  "grid-size - `int`"
  ([^NativeOps this ^Integer grid-size]
    (-> this (.setGridLimit grid-size))))

(defn free-device
  "pointer - `org.bytedeco.javacpp.Pointer`
  device-id - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer pointer ^org.bytedeco.javacpp.Pointer device-id]
    (-> this (.freeDevice pointer device-id))))

(defn sort-float
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  descending - `boolean`

  returns: `void sortFloat(org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.FloatPointer dx, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^Boolean descending]
    (-> this (.sortFloat x-shape-info descending))))

(defn numpy-from-file
  "Create a numpy array pointer
  from a file

  path - the path to the file - `org.bytedeco.javacpp.BytePointer`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.BytePointer path]
    (-> this (.numpyFromFile path))))

(defn sort-half
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  descending - `boolean`

  returns: `void sortHalf(org.bytedeco.javacpp.PointerPointer extraPointers, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^Boolean descending]
    (-> this (.sortHalf x-shape-info descending))))

(defn special-concat-double
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  tad-pointers - `org.bytedeco.javacpp.PointerPointer`
  tad-offsets - `org.bytedeco.javacpp.PointerPointer`

  returns: `void specialConcatDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, org.bytedeco.javacpp.PointerPointer data, org.bytedeco.javacpp.PointerPointer inputShapeInfo, org.bytedeco.javacpp.DoublePointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.PointerPointer tad-pointers ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.specialConcatDouble result-shape-info tad-pointers tad-offsets))))

(defn tad-only-shape-info
  "offsets-buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `void tadOnlyShapeInfo((value="Nd4jLong *") org.bytedeco.javacpp.LongPointer shapeInfo, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer targetBuffer, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer offsets-buffer]
    (-> this (.tadOnlyShapeInfo offsets-buffer))))

(defn exec-meta-predicate-strided-half
  "extra-b - `org.bytedeco.javacpp.ShortPointer`
  scalar-a - `float`
  scalar-b - `float`

  returns: `void execMetaPredicateStridedHalf(org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, long N, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, long xStride, (value="float16*") org.bytedeco.javacpp.ShortPointer dy, long yStride, (value="float16*") org.bytedeco.javacpp.ShortPointer dz, long zStride, (value="float16*") org.bytedeco.javacpp.ShortPointer extraA, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-b ^Float scalar-a ^Float scalar-b]
    (-> this (.execMetaPredicateStridedHalf extra-b scalar-a scalar-b))))

(defn exec-index-reduce-half
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execIndexReduceHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParams, (value="float16*") org.bytedeco.javacpp.ShortPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execIndexReduceHalf result-shape-info-buffer dimension dimension-length))))

(defn exec-custom-op-float
  "i-args - `org.bytedeco.javacpp.LongPointer`
  num-i-args - `int`
  is-inplace - `boolean`

  returns: `int execCustomOpFloat(org.bytedeco.javacpp.PointerPointer extraPointers, long opHashCode, org.bytedeco.javacpp.PointerPointer inputBuffers, org.bytedeco.javacpp.PointerPointer inputShapes, int numInput, org.bytedeco.javacpp.PointerPointer outputBuffers, org.bytedeco.javacpp.PointerPointer outputShapes, int numOutputs, org.bytedeco.javacpp.FloatPointer tArgs, int numTArgs, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer i-args ^Integer num-i-args ^Boolean is-inplace]
    (-> this (.execCustomOpFloat i-args num-i-args is-inplace))))

(defn mmap-file
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  file-name - `java.lang.String`
  length - `long`

  returns: `org.bytedeco.javacpp.LongPointer`"
  (^org.bytedeco.javacpp.LongPointer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^java.lang.String file-name ^Long length]
    (-> this (.mmapFile extra-pointers file-name length))))

(defn re-seed-buffer
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  seed - `long`
  pointer - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Long seed ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.reSeedBuffer extra-pointers seed pointer))))

(defn experimental-enabled?
  "returns: `boolean`"
  (^Boolean [^NativeOps this]
    (-> this (.isExperimentalEnabled))))

(defn init-random
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  seed - `long`
  number-of-elements - `long`
  pointer-to-buffer - `org.bytedeco.javacpp.Pointer`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Long seed ^Long number-of-elements ^org.bytedeco.javacpp.Pointer pointer-to-buffer]
    (-> this (.initRandom extra-pointers seed number-of-elements pointer-to-buffer))))

(defn set-device
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.setDevice ptr-to-device-id))))

(defn exec-summary-stats-scalar-half
  "extra-params - `org.bytedeco.javacpp.ShortPointer`
  bias-corrected - `boolean`

  returns: `float execSummaryStatsScalarHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params ^Boolean bias-corrected]
    (-> this (.execSummaryStatsScalarHalf extra-params bias-corrected))))

(defn average-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  x - `org.bytedeco.javacpp.PointerPointer`
  z - `org.bytedeco.javacpp.FloatPointer`
  n - `int`
  length - `long`
  propagate - `boolean`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.PointerPointer x ^org.bytedeco.javacpp.FloatPointer z ^Integer n ^Long length ^Boolean propagate]
    (-> this (.averageFloat extra-pointers x z n length propagate))))

(defn element-size-for-npy-array
  "Calculate the element size
  for a numpy array

  npy-array - the numpy array to get theelement size for - `org.bytedeco.javacpp.Pointer`

  returns: the element size for a given array - `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.elementSizeForNpyArray npy-array))))

(defn exec-broadcast-double
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execBroadcastDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer y, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execBroadcastDouble result-shape-info dimension dimension-length))))

(defn sort-double
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  descending - `boolean`

  returns: `void sortDouble(org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.DoublePointer dx, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^Boolean descending]
    (-> this (.sortDouble x-shape-info descending))))

(defn memcpy-async
  "dst - `org.bytedeco.javacpp.Pointer`
  src - `org.bytedeco.javacpp.Pointer`
  size - `long`
  flags - `int`
  reserved - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer dst ^org.bytedeco.javacpp.Pointer src ^Long size ^Integer flags ^org.bytedeco.javacpp.Pointer reserved]
    (-> this (.memcpyAsync dst src size flags reserved))))

(defn exec-summary-stats-double
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`
  bias-corrected - `boolean`

  returns: `void execSummaryStatsDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer extraParams, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length ^Boolean bias-corrected]
    (-> this (.execSummaryStatsDouble result-shape-info-buffer dimension dimension-length bias-corrected)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^Boolean bias-corrected]
    (-> this (.execSummaryStatsDouble result-shape-info bias-corrected))))

(defn concat-double
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  tad-pointers - `org.bytedeco.javacpp.PointerPointer`
  tad-offsets - `org.bytedeco.javacpp.PointerPointer`

  returns: `void concatDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, org.bytedeco.javacpp.PointerPointer data, org.bytedeco.javacpp.PointerPointer inputShapeInfo, org.bytedeco.javacpp.DoublePointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.PointerPointer tad-pointers ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.concatDouble result-shape-info tad-pointers tad-offsets))))

(defn exec-reduce-3-scalar-float
  "y-shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `float execReduce3ScalarFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParamsVals, org.bytedeco.javacpp.FloatPointer y, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer y-shape-info]
    (-> this (.execReduce3ScalarFloat y-shape-info))))

(defn exec-broadcast-float
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execBroadcastFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer y, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.FloatPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execBroadcastFloat result-shape-info dimension dimension-length))))

(defn element-size-for-npy-array-header
  "Get the element size for a numpy array

  npy-array - the numpy array's addressto get the length for - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.elementSizeForNpyArrayHeader npy-array))))

(defn get-graph-state-float
  "id - `long`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^Long id]
    (-> this (.getGraphStateFloat id))))

(defn exec-reduce-3-all-float
  "y-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void execReduce3AllFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParamsVals, org.bytedeco.javacpp.FloatPointer y, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.FloatPointer result, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer resultShapeInfoBuffer, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xTadShape, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xOffsets, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yTadShape, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer y-offsets]
    (-> this (.execReduce3AllFloat y-offsets))))

(defn exec-pairwise-transform-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  op-num - `int`
  dx - `org.bytedeco.javacpp.DoublePointer`
  x-stride - `long`
  y - `org.bytedeco.javacpp.DoublePointer`
  y-stride - `long`
  result - `org.bytedeco.javacpp.DoublePointer`
  result-stride - `long`
  extra-params - `org.bytedeco.javacpp.DoublePointer`
  n - `long`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Integer op-num ^org.bytedeco.javacpp.DoublePointer dx ^Long x-stride ^org.bytedeco.javacpp.DoublePointer y ^Long y-stride ^org.bytedeco.javacpp.DoublePointer result ^Long result-stride ^org.bytedeco.javacpp.DoublePointer extra-params ^Long n]
    (-> this (.execPairwiseTransformDouble extra-pointers op-num dx x-stride y y-stride result result-stride extra-params n)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.DoublePointer extra-params]
    (-> this (.execPairwiseTransformDouble result-shape-info extra-params)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-indexes]
    (-> this (.execPairwiseTransformDouble result-indexes))))

(defn get-graph-state-half
  "id - `long`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^Long id]
    (-> this (.getGraphStateHalf id))))

(defn exec-custom-op-with-scope-half
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  state - `org.bytedeco.javacpp.Pointer`
  op-hash - `long`
  scopes - `long[]`
  num-scopes - `int`
  input-buffers - `org.bytedeco.javacpp.PointerPointer`
  input-shapes - `org.bytedeco.javacpp.PointerPointer`
  num-inputs - `int`
  output-buffers - `org.bytedeco.javacpp.PointerPointer`
  output-shapes - `org.bytedeco.javacpp.PointerPointer`
  num-outputs - `int`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer state ^Long op-hash scopes ^Integer num-scopes ^org.bytedeco.javacpp.PointerPointer input-buffers ^org.bytedeco.javacpp.PointerPointer input-shapes ^Integer num-inputs ^org.bytedeco.javacpp.PointerPointer output-buffers ^org.bytedeco.javacpp.PointerPointer output-shapes ^Integer num-outputs]
    (-> this (.execCustomOpWithScopeHalf extra-pointers state op-hash scopes num-scopes input-buffers input-shapes num-inputs output-buffers output-shapes num-outputs))))

(defn decode-bitmap-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.Pointer`
  n - `long`
  dz - `org.bytedeco.javacpp.DoublePointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer dx ^Long n ^org.bytedeco.javacpp.DoublePointer dz]
    (-> this (.decodeBitmapDouble extra-pointers dx n dz))))

(defn exec-reduce-scalar-float
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.FloatPointer`

  returns: `float execReduceScalarFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^org.bytedeco.javacpp.FloatPointer extra-params]
    (-> this (.execReduceScalarFloat x-shape-info extra-params))))

(defn flatten-double
  "input-shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `void flattenDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int offset, char order, org.bytedeco.javacpp.DoublePointer results, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer resultShapeInfo, org.bytedeco.javacpp.DoublePointer input, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer input-shape-info]
    (-> this (.flattenDouble input-shape-info))))

(defn delete-pointer-array
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deletePointerArray pointer))))

(defn delete-graph-state-float
  "state - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer state]
    (-> this (.deleteGraphStateFloat state))))

(defn convert-types
  "extras - `org.bytedeco.javacpp.PointerPointer`
  src-type - `int`
  x - `org.bytedeco.javacpp.Pointer`
  n - `long`
  dst-type - `int`
  z - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extras ^Integer src-type ^org.bytedeco.javacpp.Pointer x ^Long n ^Integer dst-type ^org.bytedeco.javacpp.Pointer z]
    (-> this (.convertTypes extras src-type x n dst-type z))))

(defn exec-summary-stats-scalar-float
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.FloatPointer`
  bias-corrected - `boolean`

  returns: `float execSummaryStatsScalarFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^org.bytedeco.javacpp.FloatPointer extra-params ^Boolean bias-corrected]
    (-> this (.execSummaryStatsScalarFloat x-shape-info extra-params bias-corrected))))

(defn decode-threshold-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.Pointer`
  n - `long`
  dz - `org.bytedeco.javacpp.FloatPointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer dx ^Long n ^org.bytedeco.javacpp.FloatPointer dz]
    (-> this (.decodeThresholdFloat extra-pointers dx n dz))))

(defn destroy-event
  "event - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer event]
    (-> this (.destroyEvent event))))

(defn pull-rows-float
  "z-tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void pullRowsFloat(org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer z, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zShapeInfo, long n, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer indexes, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadShapeInfo, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadOffsets, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zTadShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer z-tad-offsets]
    (-> this (.pullRowsFloat z-tad-offsets))))

(defn exec-meta-predicate-shape-float
  "z-shape - `org.bytedeco.javacpp.LongPointer`
  extra-a - `org.bytedeco.javacpp.FloatPointer`
  extra-b - `org.bytedeco.javacpp.FloatPointer`
  scalar-a - `float`
  scalar-b - `float`

  returns: `void execMetaPredicateShapeFloat(org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, long N, org.bytedeco.javacpp.FloatPointer dx, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShape, org.bytedeco.javacpp.FloatPointer dy, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShape, org.bytedeco.javacpp.FloatPointer dz, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape ^org.bytedeco.javacpp.FloatPointer extra-a ^org.bytedeco.javacpp.FloatPointer extra-b ^Float scalar-a ^Float scalar-b]
    (-> this (.execMetaPredicateShapeFloat z-shape extra-a extra-b scalar-a scalar-b))))

(defn event-synchronize
  "event - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer event]
    (-> this (.eventSynchronize event))))

(defn exec-random-double
  "z-shape-buffer - `org.bytedeco.javacpp.LongPointer`
  extra-arguments - `org.bytedeco.javacpp.DoublePointer`

  returns: `void execRandomDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.Pointer state, org.bytedeco.javacpp.DoublePointer z, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape-buffer ^org.bytedeco.javacpp.DoublePointer extra-arguments]
    (-> this (.execRandomDouble z-shape-buffer extra-arguments))))

(defn numpy-from-nd-4j
  "Create a numpy array from an nd4j
  array

  data - a pointer to the data - `org.bytedeco.javacpp.Pointer`
  shape-buffer - the shapebuffer for the nd4j array - `org.bytedeco.javacpp.Pointer`
  word-size - the word size (4 for float, 8 for doubles) - `long`

  returns: a pointer to a numpy array - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.Pointer data ^org.bytedeco.javacpp.Pointer shape-buffer ^Long word-size]
    (-> this (.numpyFromNd4j data shape-buffer word-size))))

(defn stream-synchronize
  "stream - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer stream]
    (-> this (.streamSynchronize stream))))

(defn get-all-operations
  "returns: `java.lang.String`"
  (^java.lang.String [^NativeOps this]
    (-> this (.getAllOperations))))

(defn pointer-for-address
  "The pointer to get the address for

  address - the address to get the pointer - `long`

  returns: the pointer for the given address - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^Long address]
    (-> this (.pointerForAddress address))))

(defn exec-meta-predicate-strided-float
  "extras - `org.bytedeco.javacpp.PointerPointer`
  op-type-a - `int`
  op-num-a - `int`
  op-type-b - `int`
  op-num-b - `int`
  n - `long`
  dx - `org.bytedeco.javacpp.FloatPointer`
  x-stride - `long`
  dy - `org.bytedeco.javacpp.FloatPointer`
  y-stride - `long`
  dz - `org.bytedeco.javacpp.FloatPointer`
  z-stride - `long`
  extra-a - `org.bytedeco.javacpp.FloatPointer`
  extra-b - `org.bytedeco.javacpp.FloatPointer`
  scalar-a - `float`
  scalar-b - `float`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extras ^Integer op-type-a ^Integer op-num-a ^Integer op-type-b ^Integer op-num-b ^Long n ^org.bytedeco.javacpp.FloatPointer dx ^Long x-stride ^org.bytedeco.javacpp.FloatPointer dy ^Long y-stride ^org.bytedeco.javacpp.FloatPointer dz ^Long z-stride ^org.bytedeco.javacpp.FloatPointer extra-a ^org.bytedeco.javacpp.FloatPointer extra-b ^Float scalar-a ^Float scalar-b]
    (-> this (.execMetaPredicateStridedFloat extras op-type-a op-num-a op-type-b op-num-b n dx x-stride dy y-stride dz z-stride extra-a extra-b scalar-a scalar-b))))

(defn exec-summary-stats-scalar-double
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.DoublePointer`
  bias-corrected - `boolean`

  returns: `double execSummaryStatsScalarDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^org.bytedeco.javacpp.DoublePointer extra-params ^Boolean bias-corrected]
    (-> this (.execSummaryStatsScalarDouble x-shape-info extra-params bias-corrected))))

(defn exec-random-half
  "extra-arguments - `org.bytedeco.javacpp.ShortPointer`

  returns: `void execRandomHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.Pointer state, (value="float16*") org.bytedeco.javacpp.ShortPointer z, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zShapeBuffer, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-arguments]
    (-> this (.execRandomHalf extra-arguments))))

(defn omp-get-num-threads
  "Gets the number of open mp threads

  returns: `int`"
  (^Integer [^NativeOps this]
    (-> this (.ompGetNumThreads))))

(defn data-point-for-numpy-struct
  "npy-array-struct - `org.bytedeco.javacpp.Pointer`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.Pointer npy-array-struct]
    (-> this (.dataPointForNumpyStruct npy-array-struct))))

(defn delete-shape-list
  "ptr - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer ptr]
    (-> this (.deleteShapeList ptr))))

(defn set-omp-min-threads
  "Sets the minimal number of openmp threads for variative methods

  threads - `int`"
  ([^NativeOps this ^Integer threads]
    (-> this (.setOmpMinThreads threads))))

(defn delete-variables-set-half
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deleteVariablesSetHalf pointer))))

(defn get-graph-state-double
  "id - `long`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^Long id]
    (-> this (.getGraphStateDouble id))))

(defn exec-reduce-scalar-double
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.DoublePointer`

  returns: `double execReduceScalarDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^org.bytedeco.javacpp.DoublePointer extra-params]
    (-> this (.execReduceScalarDouble x-shape-info extra-params))))

(defn execute-stored-graph-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  graph-id - `long`
  input-buffers - `org.bytedeco.javacpp.PointerPointer`
  input-shapes - `org.bytedeco.javacpp.PointerPointer`
  input-indices - `org.bytedeco.javacpp.IntPointer`
  num-inputs - `int`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Long graph-id ^org.bytedeco.javacpp.PointerPointer input-buffers ^org.bytedeco.javacpp.PointerPointer input-shapes ^org.bytedeco.javacpp.IntPointer input-indices ^Integer num-inputs]
    (-> this (.executeStoredGraphFloat extra-pointers graph-id input-buffers input-shapes input-indices num-inputs))))

(defn flatten-half
  "input-shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `void flattenHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int offset, char order, (value="float16*") org.bytedeco.javacpp.ShortPointer results, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer resultShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer input, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer input-shape-info]
    (-> this (.flattenHalf input-shape-info))))

(defn exec-summary-stats-half
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`
  bias-corrected - `boolean`

  returns: `void execSummaryStatsHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParams, (value="float16*") org.bytedeco.javacpp.ShortPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length ^Boolean bias-corrected]
    (-> this (.execSummaryStatsHalf result-shape-info-buffer dimension dimension-length bias-corrected)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^Boolean bias-corrected]
    (-> this (.execSummaryStatsHalf result-shape-info bias-corrected))))

(defn memset
  "dst - `org.bytedeco.javacpp.Pointer`
  value - `int`
  size - `long`
  flags - `int`
  reserved - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer dst ^Integer value ^Long size ^Integer flags ^org.bytedeco.javacpp.Pointer reserved]
    (-> this (.memset dst value size flags reserved))))

(defn memcpy
  "dst - `org.bytedeco.javacpp.Pointer`
  src - `org.bytedeco.javacpp.Pointer`
  size - `long`
  flags - `int`
  reserved - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer dst ^org.bytedeco.javacpp.Pointer src ^Long size ^Integer flags ^org.bytedeco.javacpp.Pointer reserved]
    (-> this (.memcpy dst src size flags reserved))))

(defn sort-coo-indices-half
  "values - `org.bytedeco.javacpp.ShortPointer`
  length - `long`
  rank - `int`

  returns: `void sortCooIndicesHalf(org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer indices, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer values ^Long length ^Integer rank]
    (-> this (.sortCooIndicesHalf values length rank))))

(defn enable-verbose-mode
  "really-enable - `boolean`"
  ([^NativeOps this ^Boolean really-enable]
    (-> this (.enableVerboseMode really-enable))))

(defn encode-threshold-p-2-int
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.IntPointer`
  n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.IntPointer dx ^Long n ^org.bytedeco.javacpp.IntPointer dz]
    (-> this (.encodeThresholdP2Int extra-pointers dx n dz))))

(defn exec-transform-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  op-num - `int`
  dx - `org.bytedeco.javacpp.FloatPointer`
  x-stride - `long`
  results - `org.bytedeco.javacpp.FloatPointer`
  result-stride - `long`
  extra-params - `org.bytedeco.javacpp.FloatPointer`
  n - `long`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Integer op-num ^org.bytedeco.javacpp.FloatPointer dx ^Long x-stride ^org.bytedeco.javacpp.FloatPointer results ^Long result-stride ^org.bytedeco.javacpp.FloatPointer extra-params ^Long n]
    (-> this (.execTransformFloat extra-pointers op-num dx x-stride results result-stride extra-params n)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.FloatPointer extra-params]
    (-> this (.execTransformFloat result-shape-info extra-params)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-indexes]
    (-> this (.execTransformFloat result-indexes))))

(defn enable-p-2-p
  "really-enable - `boolean`"
  ([^NativeOps this ^Boolean really-enable]
    (-> this (.enableP2P really-enable))))

(defn data-point-for-numpy
  "Used in NDArrayFactory.createFromNpyPointer(Pointer)
  to allow reuse of an in memory numpy buffer.
  This is heavily used for python interop

  npy-array - the pointer to the numpy array to use - `org.bytedeco.javacpp.Pointer`

  returns: the pointer for the numpy array - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.dataPointForNumpy npy-array))))

(defn pull-rows-half
  "z-tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void pullRowsHalf(org.bytedeco.javacpp.PointerPointer extraPointers, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer z, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zShapeInfo, long n, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer indexes, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadShapeInfo, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadOffsets, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zTadShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer z-tad-offsets]
    (-> this (.pullRowsHalf z-tad-offsets))))

(defn pull-rows-double
  "z-tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void pullRowsDouble(org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer z, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zShapeInfo, long n, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer indexes, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadShapeInfo, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadOffsets, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zTadShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer z-tad-offsets]
    (-> this (.pullRowsDouble z-tad-offsets))))

(defn concat-float
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  tad-pointers - `org.bytedeco.javacpp.PointerPointer`
  tad-offsets - `org.bytedeco.javacpp.PointerPointer`

  returns: `void concatFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, org.bytedeco.javacpp.PointerPointer data, org.bytedeco.javacpp.PointerPointer inputShapeInfo, org.bytedeco.javacpp.FloatPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.PointerPointer tad-pointers ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.concatFloat result-shape-info tad-pointers tad-offsets))))

(defn delete-result-wrapper
  "ptr - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer ptr]
    (-> this (.deleteResultWrapper ptr))))

(defn execute-flat-graph-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  flat-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `org.nd4j.nativeblas.ResultWrapperAbstraction`"
  (^org.nd4j.nativeblas.ResultWrapperAbstraction [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer flat-buffer-pointer]
    (-> this (.executeFlatGraphFloat extra-pointers flat-buffer-pointer))))

(defn get-device-name
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `java.lang.String`"
  (^java.lang.String [^NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.getDeviceName ptr-to-device-id))))

(defn decode-bitmap-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.Pointer`
  n - `long`
  dz - `org.bytedeco.javacpp.FloatPointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer dx ^Long n ^org.bytedeco.javacpp.FloatPointer dz]
    (-> this (.decodeBitmapFloat extra-pointers dx n dz))))

(defn tear-float
  "tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void tearFloat(org.bytedeco.javacpp.PointerPointer extras, org.bytedeco.javacpp.FloatPointer tensor, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.PointerPointer targets, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer tad-offsets]
    (-> this (.tearFloat tad-offsets))))

(defn register-graph-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  graph-id - `long`
  flat-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Long graph-id ^org.bytedeco.javacpp.Pointer flat-buffer-pointer]
    (-> this (.registerGraphFloat extra-pointers graph-id flat-buffer-pointer))))

(defn exec-reduce-3-all-half
  "y-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void execReduce3AllHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParamsVals, (value="float16*") org.bytedeco.javacpp.ShortPointer y, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer result, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer resultShapeInfoBuffer, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xTadShape, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xOffsets, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yTadShape, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer y-offsets]
    (-> this (.execReduce3AllHalf y-offsets))))

(defn encode-threshold-p-3-half
  "dx - `org.bytedeco.javacpp.ShortPointer`
  offsets - `org.bytedeco.javacpp.IntPointer`
  n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`

  returns: `void encodeThresholdP3Half(org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer dx ^org.bytedeco.javacpp.IntPointer offsets ^Long n ^org.bytedeco.javacpp.IntPointer dz]
    (-> this (.encodeThresholdP3Half dx offsets n dz))))

(defn release-numpy
  "Thie method releases numpy pointer
  PLEASE NOTE: This method should be ONLY used if pointer/numpy array was originated from file

  npy-array - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.releaseNumpy npy-array))))

(defn delete-graph-state-double
  "state - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer state]
    (-> this (.deleteGraphStateDouble state))))

(defn encode-threshold-p-3-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.FloatPointer`
  offsets - `org.bytedeco.javacpp.IntPointer`
  n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.FloatPointer dx ^org.bytedeco.javacpp.IntPointer offsets ^Long n ^org.bytedeco.javacpp.IntPointer dz]
    (-> this (.encodeThresholdP3Float extra-pointers dx offsets n dz))))

(defn accumulate-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  x - `org.bytedeco.javacpp.PointerPointer`
  z - `org.bytedeco.javacpp.DoublePointer`
  n - `int`
  length - `long`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.PointerPointer x ^org.bytedeco.javacpp.DoublePointer z ^Integer n ^Long length]
    (-> this (.accumulateDouble extra-pointers x z n length))))

(defn exec-custom-op-with-scope-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  state - `org.bytedeco.javacpp.Pointer`
  op-hash - `long`
  scopes - `long[]`
  num-scopes - `int`
  input-buffers - `org.bytedeco.javacpp.PointerPointer`
  input-shapes - `org.bytedeco.javacpp.PointerPointer`
  num-inputs - `int`
  output-buffers - `org.bytedeco.javacpp.PointerPointer`
  output-shapes - `org.bytedeco.javacpp.PointerPointer`
  num-outputs - `int`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer state ^Long op-hash scopes ^Integer num-scopes ^org.bytedeco.javacpp.PointerPointer input-buffers ^org.bytedeco.javacpp.PointerPointer input-shapes ^Integer num-inputs ^org.bytedeco.javacpp.PointerPointer output-buffers ^org.bytedeco.javacpp.PointerPointer output-shapes ^Integer num-outputs]
    (-> this (.execCustomOpWithScopeDouble extra-pointers state op-hash scopes num-scopes input-buffers input-shapes num-inputs output-buffers output-shapes num-outputs))))

(defn execute-stored-graph-half
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  graph-id - `long`
  input-buffers - `org.bytedeco.javacpp.PointerPointer`
  input-shapes - `org.bytedeco.javacpp.PointerPointer`
  input-indices - `org.bytedeco.javacpp.IntPointer`
  num-inputs - `int`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Long graph-id ^org.bytedeco.javacpp.PointerPointer input-buffers ^org.bytedeco.javacpp.PointerPointer input-shapes ^org.bytedeco.javacpp.IntPointer input-indices ^Integer num-inputs]
    (-> this (.executeStoredGraphHalf extra-pointers graph-id input-buffers input-shapes input-indices num-inputs))))

(defn special-concat-half
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  tad-pointers - `org.bytedeco.javacpp.PointerPointer`
  tad-offsets - `org.bytedeco.javacpp.PointerPointer`

  returns: `void specialConcatHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, org.bytedeco.javacpp.PointerPointer data, org.bytedeco.javacpp.PointerPointer inputShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.PointerPointer tad-pointers ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.specialConcatHalf result-shape-info tad-pointers tad-offsets))))

(defn exec-scalar-half
  "extra-params - `org.bytedeco.javacpp.ShortPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execScalarHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer z, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer scalars, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execScalarHalf extra-params dimension dimension-length)))
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params ^Long n]
    (-> this (.execScalarHalf extra-params n)))
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params]
    (-> this (.execScalarHalf extra-params))))

(defn get-all-custom-ops
  "returns: `java.lang.String`"
  (^java.lang.String [^NativeOps this]
    (-> this (.getAllCustomOps))))

(defn shape-buffer-for-numpy
  "Get a shape buffer for a numpy array.
  Used in conjunction with NDArrayFactory.createFromNpyPointer(Pointer)

  npy-array - the numpy array to get the shape buffer for - `org.bytedeco.javacpp.Pointer`

  returns: a pointer representing the shape buffer for numpy - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.shapeBufferForNumpy npy-array))))

(defn encode-threshold-p-1-half
  "dx - `org.bytedeco.javacpp.ShortPointer`
  n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`

  returns: `void encodeThresholdP1Half(org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer dx ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeThresholdP1Half dx n dz threshold))))

(defn encode-bitmap-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.FloatPointer`
  n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`

  returns: `long`"
  (^Long [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.FloatPointer dx ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeBitmapFloat extra-pointers dx n dz threshold))))

(defn execute-stored-graph-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  graph-id - `long`
  input-buffers - `org.bytedeco.javacpp.PointerPointer`
  input-shapes - `org.bytedeco.javacpp.PointerPointer`
  input-indices - `org.bytedeco.javacpp.IntPointer`
  num-inputs - `int`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Long graph-id ^org.bytedeco.javacpp.PointerPointer input-buffers ^org.bytedeco.javacpp.PointerPointer input-shapes ^org.bytedeco.javacpp.IntPointer input-indices ^Integer num-inputs]
    (-> this (.executeStoredGraphDouble extra-pointers graph-id input-buffers input-shapes input-indices num-inputs))))

(defn delete-graph-state-half
  "state - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer state]
    (-> this (.deleteGraphStateHalf state))))

(defn exec-index-reduce-scalar-float
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.FloatPointer`

  returns: `float execIndexReduceScalarFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^org.bytedeco.javacpp.FloatPointer extra-params]
    (-> this (.execIndexReduceScalarFloat x-shape-info extra-params))))

(defn omp-get-max-threads
  "Gets the maximum number of open mp threads

  returns: `int`"
  (^Integer [^NativeOps this]
    (-> this (.ompGetMaxThreads))))

(defn exec-reduce-half
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduceHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParams, (value="float16*") org.bytedeco.javacpp.ShortPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduceHalf result-shape-info dimension dimension-length)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduceHalf result-shape-info))))

(defn accumulate-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  x - `org.bytedeco.javacpp.PointerPointer`
  z - `org.bytedeco.javacpp.FloatPointer`
  n - `int`
  length - `long`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.PointerPointer x ^org.bytedeco.javacpp.FloatPointer z ^Integer n ^Long length]
    (-> this (.accumulateFloat extra-pointers x z n length))))

(defn memcpy-constant-async
  "dst - `long`
  src - `org.bytedeco.javacpp.Pointer`
  size - `long`
  flags - `int`
  reserved - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^Long dst ^org.bytedeco.javacpp.Pointer src ^Long size ^Integer flags ^org.bytedeco.javacpp.Pointer reserved]
    (-> this (.memcpyConstantAsync dst src size flags reserved))))

(defn encode-threshold-p-1-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.FloatPointer`
  n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.FloatPointer dx ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeThresholdP1Float extra-pointers dx n dz threshold))))

(defn decode-bitmap-half
  "dz - `org.bytedeco.javacpp.ShortPointer`

  returns: `void decodeBitmapHalf(org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.Pointer dx, long N, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer dz]
    (-> this (.decodeBitmapHalf dz))))

(defn get-device
  "returns: `int`"
  (^Integer [^NativeOps this]
    (-> this (.getDevice))))

(defn exec-reduce-3-half
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduce3Half(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParamsVals, (value="float16*") org.bytedeco.javacpp.ShortPointer y, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduce3Half result-shape-info-buffer dimension dimension-length)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduce3Half result-shape-info))))

(defn numpy-header-for-nd-4j
  "Creates a numpy header for nd4j

  data - the data to use - `org.bytedeco.javacpp.Pointer`
  shape-buffer - the shape buffer for the array - `org.bytedeco.javacpp.Pointer`
  word-size - the word size - `long`
  length - `org.bytedeco.javacpp.LongPointer`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.Pointer data ^org.bytedeco.javacpp.Pointer shape-buffer ^Long word-size ^org.bytedeco.javacpp.LongPointer length]
    (-> this (.numpyHeaderForNd4j data shape-buffer word-size length))))

(defn exec-aggregate-batch-double
  "extras - `org.bytedeco.javacpp.PointerPointer`
  num-aggregates - `int`
  op-num - `int`
  max-args - `int`
  max-shapes - `int`
  max-int-arrays - `int`
  max-int-array-size - `int`
  max-idx - `int`
  max-reals - `int`
  ptr-to-arguments - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extras ^Integer num-aggregates ^Integer op-num ^Integer max-args ^Integer max-shapes ^Integer max-int-arrays ^Integer max-int-array-size ^Integer max-idx ^Integer max-reals ^org.bytedeco.javacpp.Pointer ptr-to-arguments]
    (-> this (.execAggregateBatchDouble extras num-aggregates op-num max-args max-shapes max-int-arrays max-int-array-size max-idx max-reals ptr-to-arguments))))

(defn calculate-output-shapes-double
  "i-args - `org.bytedeco.javacpp.LongPointer`
  num-i-args - `int`

  returns: `org.bytedeco.javacpp.Pointer calculateOutputShapesDouble(org.bytedeco.javacpp.PointerPointer extraPointers, long hash, org.bytedeco.javacpp.PointerPointer inputShapes, int numInputShapes, org.bytedeco.javacpp.DoublePointer tArgs, int numTArgs, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer i-args ^Integer num-i-args]
    (-> this (.calculateOutputShapesDouble i-args num-i-args))))

(defn shuffle-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  x - `org.bytedeco.javacpp.PointerPointer`
  x-shape-info - `org.bytedeco.javacpp.PointerPointer`
  z - `org.bytedeco.javacpp.PointerPointer`
  z-shape-info - `org.bytedeco.javacpp.PointerPointer`
  n - `int`
  shuffle-map - `org.bytedeco.javacpp.IntPointer`
  tad-shape-info - `org.bytedeco.javacpp.PointerPointer`
  tad-offsets - `org.bytedeco.javacpp.PointerPointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.PointerPointer x ^org.bytedeco.javacpp.PointerPointer x-shape-info ^org.bytedeco.javacpp.PointerPointer z ^org.bytedeco.javacpp.PointerPointer z-shape-info ^Integer n ^org.bytedeco.javacpp.IntPointer shuffle-map ^org.bytedeco.javacpp.PointerPointer tad-shape-info ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.shuffleDouble extra-pointers x x-shape-info z z-shape-info n shuffle-map tad-shape-info tad-offsets))))

(defn create-context
  "returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this]
    (-> this (.createContext))))

(defn average-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  x - `org.bytedeco.javacpp.PointerPointer`
  z - `org.bytedeco.javacpp.DoublePointer`
  n - `int`
  length - `long`
  propagate - `boolean`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.PointerPointer x ^org.bytedeco.javacpp.DoublePointer z ^Integer n ^Long length ^Boolean propagate]
    (-> this (.averageDouble extra-pointers x z n length propagate))))

(defn exec-index-reduce-float
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execIndexReduceFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParams, org.bytedeco.javacpp.FloatPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execIndexReduceFloat result-shape-info-buffer dimension dimension-length))))

(defn enable-debug-mode
  "really-enable - `boolean`"
  ([^NativeOps this ^Boolean really-enable]
    (-> this (.enableDebugMode really-enable))))

(defn get-device-free-memory
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `long`"
  (^Long [^NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.getDeviceFreeMemory ptr-to-device-id))))

(defn sort-tad-half
  "tad-offsets - `org.bytedeco.javacpp.LongPointer`
  descending - `boolean`

  returns: `void sortTadHalf(org.bytedeco.javacpp.PointerPointer extraPointers, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer tad-offsets ^Boolean descending]
    (-> this (.sortTadHalf tad-offsets descending))))

(defn memset-async
  "dst - `org.bytedeco.javacpp.Pointer`
  value - `int`
  size - `long`
  flags - `int`
  reserved - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer dst ^Integer value ^Long size ^Integer flags ^org.bytedeco.javacpp.Pointer reserved]
    (-> this (.memsetAsync dst value size flags reserved))))

(defn sort-coo-indices-double
  "indices - `org.bytedeco.javacpp.LongPointer`
  values - `org.bytedeco.javacpp.DoublePointer`
  length - `long`
  rank - `int`

  returns: `void sortCooIndicesDouble(org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer indices ^org.bytedeco.javacpp.DoublePointer values ^Long length ^Integer rank]
    (-> this (.sortCooIndicesDouble indices values length rank))))

(defn exec-custom-op-half
  "i-args - `org.bytedeco.javacpp.LongPointer`
  num-i-args - `int`
  is-inplace - `boolean`

  returns: `int execCustomOpHalf(org.bytedeco.javacpp.PointerPointer extraPointers, long opHashCode, org.bytedeco.javacpp.PointerPointer inputBuffers, org.bytedeco.javacpp.PointerPointer inputShapes, int numInput, org.bytedeco.javacpp.PointerPointer outputBuffers, org.bytedeco.javacpp.PointerPointer outputShapes, int numOutputs, (value="float16*") org.bytedeco.javacpp.ShortPointer tArgs, int numTArgs, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer i-args ^Integer num-i-args ^Boolean is-inplace]
    (-> this (.execCustomOpHalf i-args num-i-args is-inplace))))

(defn load-npy-from-header
  "Load numpy from a header
  based on the cnpy parse from header method.

  data - the header data to parse - `org.bytedeco.javacpp.Pointer`

  returns: a pointer to a numpy cnpy:NpyArray struct - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.Pointer data]
    (-> this (.loadNpyFromHeader data))))

(defn exec-transform-half
  "extra-params - `org.bytedeco.javacpp.ShortPointer`
  n - `long`

  returns: `void execTransformHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, long xStride, (value="float16*") org.bytedeco.javacpp.ShortPointer results, long resultStride, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params ^Long n]
    (-> this (.execTransformHalf extra-params n)))
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params]
    (-> this (.execTransformHalf extra-params))))

(defn exec-pairwise-transform-half
  "extra-params - `org.bytedeco.javacpp.ShortPointer`
  n - `long`

  returns: `void execPairwiseTransformHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, long xStride, (value="float16*") org.bytedeco.javacpp.ShortPointer y, long yStride, (value="float16*") org.bytedeco.javacpp.ShortPointer results, long resultStride, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params ^Long n]
    (-> this (.execPairwiseTransformHalf extra-params n)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-indexes]
    (-> this (.execPairwiseTransformHalf result-indexes))))

(defn tear-double
  "tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void tearDouble(org.bytedeco.javacpp.PointerPointer extras, org.bytedeco.javacpp.DoublePointer tensor, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.PointerPointer targets, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer tad-offsets]
    (-> this (.tearDouble tad-offsets))))

(defn length-for-shape-buffer-pointer
  "Return the length of a shape buffer
  based on the pointer

  buffer - the buffer pointer to check - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer buffer]
    (-> this (.lengthForShapeBufferPointer buffer))))

(defn exec-index-reduce-scalar-double
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.DoublePointer`

  returns: `double execIndexReduceScalarDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^org.bytedeco.javacpp.DoublePointer extra-params]
    (-> this (.execIndexReduceScalarDouble x-shape-info extra-params))))

(defn exec-transform-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  op-num - `int`
  dx - `org.bytedeco.javacpp.DoublePointer`
  x-stride - `long`
  result - `org.bytedeco.javacpp.DoublePointer`
  result-stride - `long`
  extra-params - `org.bytedeco.javacpp.DoublePointer`
  n - `long`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Integer op-num ^org.bytedeco.javacpp.DoublePointer dx ^Long x-stride ^org.bytedeco.javacpp.DoublePointer result ^Long result-stride ^org.bytedeco.javacpp.DoublePointer extra-params ^Long n]
    (-> this (.execTransformDouble extra-pointers op-num dx x-stride result result-stride extra-params n)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.DoublePointer extra-params]
    (-> this (.execTransformDouble result-shape-info extra-params)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-indexes]
    (-> this (.execTransformDouble result-indexes))))

(defn exec-index-reduce-double
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execIndexReduceDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer extraParams, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execIndexReduceDouble result-shape-info-buffer dimension dimension-length))))

(defn get-device-major
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.getDeviceMajor ptr-to-device-id))))

(defn encode-bitmap-half
  "dx - `org.bytedeco.javacpp.ShortPointer`
  n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`

  returns: `long encodeBitmapHalf(org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer dx ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeBitmapHalf dx n dz threshold))))

(defn register-graph-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  graph-id - `long`
  flat-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Long graph-id ^org.bytedeco.javacpp.Pointer flat-buffer-pointer]
    (-> this (.registerGraphDouble extra-pointers graph-id flat-buffer-pointer))))

(defn exec-scalar-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  op-num - `int`
  x - `org.bytedeco.javacpp.DoublePointer`
  x-stride - `long`
  result - `org.bytedeco.javacpp.DoublePointer`
  result-stride - `long`
  scalar - `double`
  extra-params - `org.bytedeco.javacpp.DoublePointer`
  n - `long`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Integer op-num ^org.bytedeco.javacpp.DoublePointer x ^Long x-stride ^org.bytedeco.javacpp.DoublePointer result ^Long result-stride ^Double scalar ^org.bytedeco.javacpp.DoublePointer extra-params ^Long n]
    (-> this (.execScalarDouble extra-pointers op-num x x-stride result result-stride scalar extra-params n)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape-info ^org.bytedeco.javacpp.DoublePointer scalars ^org.bytedeco.javacpp.DoublePointer extra-params ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execScalarDouble z-shape-info scalars extra-params dimension dimension-length)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^Double scalar ^org.bytedeco.javacpp.DoublePointer extra-params]
    (-> this (.execScalarDouble result-shape-info scalar extra-params)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-indexes]
    (-> this (.execScalarDouble result-indexes))))

(defn calculate-output-shapes-float
  "i-args - `org.bytedeco.javacpp.LongPointer`
  num-i-args - `int`

  returns: `org.bytedeco.javacpp.Pointer calculateOutputShapesFloat(org.bytedeco.javacpp.PointerPointer extraPointers, long hash, org.bytedeco.javacpp.PointerPointer inputShapes, int numInputShapes, org.bytedeco.javacpp.FloatPointer tArgs, int numTArgs, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer i-args ^Integer num-i-args]
    (-> this (.calculateOutputShapesFloat i-args num-i-args))))

(defn concat-half
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  tad-pointers - `org.bytedeco.javacpp.PointerPointer`
  tad-offsets - `org.bytedeco.javacpp.PointerPointer`

  returns: `void concatHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, org.bytedeco.javacpp.PointerPointer data, org.bytedeco.javacpp.PointerPointer inputShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.PointerPointer tad-pointers ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.concatHalf result-shape-info tad-pointers tad-offsets))))

(defn encode-threshold-p-3-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.DoublePointer`
  offsets - `org.bytedeco.javacpp.IntPointer`
  n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.DoublePointer dx ^org.bytedeco.javacpp.IntPointer offsets ^Long n ^org.bytedeco.javacpp.IntPointer dz]
    (-> this (.encodeThresholdP3Double extra-pointers dx offsets n dz))))

(defn set-element-threshold
  "This method allows you to specify minimal number of elements per thread/block during op call
  PLEASE NOTE: Changing this value might and will affect performance.

  value - `int`"
  ([^NativeOps this ^Integer value]
    (-> this (.setElementThreshold value))))

(defn register-event
  "event - `org.bytedeco.javacpp.Pointer`
  stream - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer event ^org.bytedeco.javacpp.Pointer stream]
    (-> this (.registerEvent event stream))))

(defn exec-scalar-float
  "ScalarOp along dimension

  z-shape-info - `org.bytedeco.javacpp.LongPointer`
  scalars - `org.bytedeco.javacpp.FloatPointer`
  extra-params - `org.bytedeco.javacpp.FloatPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execScalarFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer z, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape-info ^org.bytedeco.javacpp.FloatPointer scalars ^org.bytedeco.javacpp.FloatPointer extra-params ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execScalarFloat z-shape-info scalars extra-params dimension dimension-length)))
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Integer op-num ^org.bytedeco.javacpp.FloatPointer x ^Long x-stride ^org.bytedeco.javacpp.FloatPointer results ^Long result-stride ^Float scalar ^org.bytedeco.javacpp.FloatPointer extra-params ^Long n]
    (-> this (.execScalarFloat extra-pointers op-num x x-stride results result-stride scalar extra-params n)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^Float scalar ^org.bytedeco.javacpp.FloatPointer extra-params]
    (-> this (.execScalarFloat result-shape-info scalar extra-params)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-indexes]
    (-> this (.execScalarFloat result-indexes))))

(defn exec-broadcast-half
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execBroadcastHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer y, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execBroadcastHalf result-shape-info dimension dimension-length))))

(defn sort-coo-indices-float
  "indices - `org.bytedeco.javacpp.LongPointer`
  values - `org.bytedeco.javacpp.FloatPointer`
  length - `long`
  rank - `int`

  returns: `void sortCooIndicesFloat(org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer indices ^org.bytedeco.javacpp.FloatPointer values ^Long length ^Integer rank]
    (-> this (.sortCooIndicesFloat indices values length rank))))

(defn register-graph-half
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  graph-id - `long`
  flat-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Long graph-id ^org.bytedeco.javacpp.Pointer flat-buffer-pointer]
    (-> this (.registerGraphHalf extra-pointers graph-id flat-buffer-pointer))))

(defn unregister-graph
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  graph-id - `long`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Long graph-id]
    (-> this (.unregisterGraph extra-pointers graph-id))))

(defn shape-buffer-for-numpy-header
  "Get the shape buffer from a
  numpy array.
  **Warning** this allocates memory

  npy-array - `org.bytedeco.javacpp.Pointer`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.shapeBufferForNumpyHeader npy-array))))

(defn delete-int-array
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deleteIntArray pointer))))

(defn exec-meta-predicate-shape-double
  "z-shape - `org.bytedeco.javacpp.LongPointer`
  extra-a - `org.bytedeco.javacpp.DoublePointer`
  extra-b - `org.bytedeco.javacpp.DoublePointer`
  scalar-a - `double`
  scalar-b - `double`

  returns: `void execMetaPredicateShapeDouble(org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, long N, org.bytedeco.javacpp.DoublePointer dx, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShape, org.bytedeco.javacpp.DoublePointer dy, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShape, org.bytedeco.javacpp.DoublePointer dz, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape ^org.bytedeco.javacpp.DoublePointer extra-a ^org.bytedeco.javacpp.DoublePointer extra-b ^Double scalar-a ^Double scalar-b]
    (-> this (.execMetaPredicateShapeDouble z-shape extra-a extra-b scalar-a scalar-b))))

(defn exec-meta-predicate-shape-half
  "extra-b - `org.bytedeco.javacpp.ShortPointer`
  scalar-a - `float`
  scalar-b - `float`

  returns: `void execMetaPredicateShapeHalf(org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, long N, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShape, (value="float16*") org.bytedeco.javacpp.ShortPointer dy, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShape, (value="float16*") org.bytedeco.javacpp.ShortPointer dz, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zShape, (value="float16*") org.bytedeco.javacpp.ShortPointer extraA, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-b ^Float scalar-a ^Float scalar-b]
    (-> this (.execMetaPredicateShapeHalf extra-b scalar-a scalar-b))))

(defn tear-half
  "tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void tearHalf(org.bytedeco.javacpp.PointerPointer extras, (value="float16*") org.bytedeco.javacpp.ShortPointer tensor, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.PointerPointer targets, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer tad-offsets]
    (-> this (.tearHalf tad-offsets))))

(defn check-p-2-p
  ""
  ([^NativeOps this]
    (-> this (.checkP2P))))

(defn average-half
  "z - `org.bytedeco.javacpp.ShortPointer`
  n - `int`
  length - `long`
  propagate - `boolean`

  returns: `void averageHalf(org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.PointerPointer x, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer z ^Integer n ^Long length ^Boolean propagate]
    (-> this (.averageHalf z n length propagate))))

(defn get-constant-space
  "returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this]
    (-> this (.getConstantSpace))))

(defn exec-reduce-3-scalar-half
  "y-shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `float execReduce3ScalarHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParamsVals, (value="float16*") org.bytedeco.javacpp.ShortPointer y, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer y-shape-info]
    (-> this (.execReduce3ScalarHalf y-shape-info))))

(defn exec-reduce-float
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduceFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParams, org.bytedeco.javacpp.FloatPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduceFloat result-shape-info dimension dimension-length)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduceFloat result-shape-info))))

(defn munmap-file
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  ptr-map - `org.bytedeco.javacpp.LongPointer`
  length - `long`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.LongPointer ptr-map ^Long length]
    (-> this (.munmapFile extra-pointers ptr-map length))))

(defn exec-reduce-3-scalar-double
  "y-shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `double execReduce3ScalarDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer extraParamsVals, org.bytedeco.javacpp.DoublePointer y, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer y-shape-info]
    (-> this (.execReduce3ScalarDouble y-shape-info))))

(defn special-concat-float
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  tad-pointers - `org.bytedeco.javacpp.PointerPointer`
  tad-offsets - `org.bytedeco.javacpp.PointerPointer`

  returns: `void specialConcatFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, org.bytedeco.javacpp.PointerPointer data, org.bytedeco.javacpp.PointerPointer inputShapeInfo, org.bytedeco.javacpp.FloatPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.PointerPointer tad-pointers ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.specialConcatFloat result-shape-info tad-pointers tad-offsets))))

(defn exec-aggregate-batch-half
  "extras - `org.bytedeco.javacpp.PointerPointer`
  num-aggregates - `int`
  op-num - `int`
  max-args - `int`
  max-shapes - `int`
  max-int-arrays - `int`
  max-int-array-size - `int`
  max-idx - `int`
  max-reals - `int`
  ptr-to-arguments - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extras ^Integer num-aggregates ^Integer op-num ^Integer max-args ^Integer max-shapes ^Integer max-int-arrays ^Integer max-int-array-size ^Integer max-idx ^Integer max-reals ^org.bytedeco.javacpp.Pointer ptr-to-arguments]
    (-> this (.execAggregateBatchHalf extras num-aggregates op-num max-args max-shapes max-int-arrays max-int-array-size max-idx max-reals ptr-to-arguments))))

(defn data-point-for-numpy-header
  "npy-array - `org.bytedeco.javacpp.Pointer`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.dataPointForNumpyHeader npy-array))))

(defn delete-variables-set-double
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deleteVariablesSetDouble pointer))))

(defn estimate-threshold-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  x - `org.bytedeco.javacpp.Pointer`
  n - `int`
  threshold - `float`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer x ^Integer n ^Float threshold]
    (-> this (.estimateThresholdFloat extra-pointers x n threshold))))

(defn exec-meta-predicate-strided-double
  "extras - `org.bytedeco.javacpp.PointerPointer`
  op-type-a - `int`
  op-num-a - `int`
  op-type-b - `int`
  op-num-b - `int`
  n - `long`
  dx - `org.bytedeco.javacpp.DoublePointer`
  x-stride - `long`
  dy - `org.bytedeco.javacpp.DoublePointer`
  y-stride - `long`
  dz - `org.bytedeco.javacpp.DoublePointer`
  z-stride - `long`
  extra-a - `org.bytedeco.javacpp.DoublePointer`
  extra-b - `org.bytedeco.javacpp.DoublePointer`
  scalar-a - `double`
  scalar-b - `double`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extras ^Integer op-type-a ^Integer op-num-a ^Integer op-type-b ^Integer op-num-b ^Long n ^org.bytedeco.javacpp.DoublePointer dx ^Long x-stride ^org.bytedeco.javacpp.DoublePointer dy ^Long y-stride ^org.bytedeco.javacpp.DoublePointer dz ^Long z-stride ^org.bytedeco.javacpp.DoublePointer extra-a ^org.bytedeco.javacpp.DoublePointer extra-b ^Double scalar-a ^Double scalar-b]
    (-> this (.execMetaPredicateStridedDouble extras op-type-a op-num-a op-type-b op-num-b n dx x-stride dy y-stride dz z-stride extra-a extra-b scalar-a scalar-b))))

(defn calculate-output-shapes-half
  "i-args - `org.bytedeco.javacpp.LongPointer`
  num-i-args - `int`

  returns: `org.bytedeco.javacpp.Pointer calculateOutputShapesHalf(org.bytedeco.javacpp.PointerPointer extraPointers, long hash, org.bytedeco.javacpp.PointerPointer inputShapes, int numInputShapes, (value="float16") org.bytedeco.javacpp.ShortPointer tArgs, int numTArgs, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer i-args ^Integer num-i-args]
    (-> this (.calculateOutputShapesHalf i-args num-i-args))))

(defn exec-reduce-3-float
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduce3Float(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParamsVals, org.bytedeco.javacpp.FloatPointer y, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.FloatPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduce3Float result-shape-info-buffer dimension dimension-length)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduce3Float result-shape-info))))

(defn decode-threshold-half
  "dz - `org.bytedeco.javacpp.ShortPointer`

  returns: `void decodeThresholdHalf(org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.Pointer dx, long N, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer dz]
    (-> this (.decodeThresholdHalf dz))))

(defn refresh-buffer
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  seed - `long`
  pointer - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Long seed ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.refreshBuffer extra-pointers seed pointer))))

(defn exec-summary-stats-float
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`
  bias-corrected - `boolean`

  returns: `void execSummaryStatsFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParams, org.bytedeco.javacpp.FloatPointer results, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length ^Boolean bias-corrected]
    (-> this (.execSummaryStatsFloat result-shape-info-buffer dimension dimension-length bias-corrected)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^Boolean bias-corrected]
    (-> this (.execSummaryStatsFloat result-shape-info bias-corrected))))

(defn flatten-float
  "input-shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `void flattenFloat(org.bytedeco.javacpp.PointerPointer extraPointers, int offset, char order, org.bytedeco.javacpp.FloatPointer results, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer resultShapeInfo, org.bytedeco.javacpp.FloatPointer input, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer input-shape-info]
    (-> this (.flattenFloat input-shape-info))))

(defn encode-bitmap-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.DoublePointer`
  n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`

  returns: `long`"
  (^Long [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.DoublePointer dx ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeBitmapDouble extra-pointers dx n dz threshold))))

(defn exec-reduce-double
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduceDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer extraParams, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduceDouble result-shape-info dimension dimension-length)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduceDouble result-shape-info))))

(defn get-available-devices
  "returns: `int`"
  (^Integer [^NativeOps this]
    (-> this (.getAvailableDevices))))

(defn exec-pairwise-transform-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  op-num - `int`
  dx - `org.bytedeco.javacpp.FloatPointer`
  x-stride - `long`
  y - `org.bytedeco.javacpp.FloatPointer`
  y-stride - `long`
  results - `org.bytedeco.javacpp.FloatPointer`
  result-stride - `long`
  extra-params - `org.bytedeco.javacpp.FloatPointer`
  n - `long`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Integer op-num ^org.bytedeco.javacpp.FloatPointer dx ^Long x-stride ^org.bytedeco.javacpp.FloatPointer y ^Long y-stride ^org.bytedeco.javacpp.FloatPointer results ^Long result-stride ^org.bytedeco.javacpp.FloatPointer extra-params ^Long n]
    (-> this (.execPairwiseTransformFloat extra-pointers op-num dx x-stride y y-stride results result-stride extra-params n)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.FloatPointer extra-params]
    (-> this (.execPairwiseTransformFloat result-shape-info extra-params)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-indexes]
    (-> this (.execPairwiseTransformFloat result-indexes))))

(defn exec-reduce-3-double
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduce3Double(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer extraParamsVals, org.bytedeco.javacpp.DoublePointer y, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduce3Double result-shape-info-buffer dimension dimension-length)))
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduce3Double result-shape-info))))

(defn exec-aggregate-half
  "real-arguments - `org.bytedeco.javacpp.ShortPointer`
  num-real-arguments - `int`

  returns: `void execAggregateHalf(org.bytedeco.javacpp.PointerPointer extras, int opNum, (value="float16 **") org.bytedeco.javacpp.PointerPointer arguments, int numArguments, (value="Nd4jLong **") org.bytedeco.javacpp.PointerPointer shapes, int numShapes, org.bytedeco.javacpp.IntPointer indexArguments, int numIndexArguments, (value="int **") org.bytedeco.javacpp.PointerPointer intArrays, int numIntArrays, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer real-arguments ^Integer num-real-arguments]
    (-> this (.execAggregateHalf real-arguments num-real-arguments))))

(defn sort-tad-double
  "tad-offsets - `org.bytedeco.javacpp.LongPointer`
  descending - `boolean`

  returns: `void sortTadDouble(org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.DoublePointer dx, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer tad-offsets ^Boolean descending]
    (-> this (.sortTadDouble tad-offsets descending))))

(defn initialize-devices-and-functions
  "NEVER EVER USE THIS METHOD OUTSIDE OF CUDA"
  ([^NativeOps this]
    (-> this (.initializeDevicesAndFunctions))))

(defn shuffle-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  x - `org.bytedeco.javacpp.PointerPointer`
  x-shape-info - `org.bytedeco.javacpp.PointerPointer`
  z - `org.bytedeco.javacpp.PointerPointer`
  z-shape-info - `org.bytedeco.javacpp.PointerPointer`
  n - `int`
  shuffle-map - `org.bytedeco.javacpp.IntPointer`
  tad-shape-info - `org.bytedeco.javacpp.PointerPointer`
  tad-offsets - `org.bytedeco.javacpp.PointerPointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.PointerPointer x ^org.bytedeco.javacpp.PointerPointer x-shape-info ^org.bytedeco.javacpp.PointerPointer z ^org.bytedeco.javacpp.PointerPointer z-shape-info ^Integer n ^org.bytedeco.javacpp.IntPointer shuffle-map ^org.bytedeco.javacpp.PointerPointer tad-shape-info ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.shuffleFloat extra-pointers x x-shape-info z z-shape-info n shuffle-map tad-shape-info tad-offsets))))

(defn free-host
  "pointer - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.freeHost pointer))))

(defn p-2-p-available?
  "returns: `boolean`"
  (^Boolean [^NativeOps this]
    (-> this (.isP2PAvailable))))

(defn create-stream
  "returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NativeOps this]
    (-> this (.createStream))))

(defn delete-variables-set-float
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deleteVariablesSetFloat pointer))))

(defn sort-tad-float
  "tad-offsets - `org.bytedeco.javacpp.LongPointer`
  descending - `boolean`

  returns: `void sortTadFloat(org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.FloatPointer dx, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer tadShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer tad-offsets ^Boolean descending]
    (-> this (.sortTadFloat tad-offsets descending))))

(defn estimate-threshold-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  x - `org.bytedeco.javacpp.Pointer`
  n - `int`
  threshold - `float`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer x ^Integer n ^Float threshold]
    (-> this (.estimateThresholdDouble extra-pointers x n threshold))))

(defn initialize-functions
  "functions - `org.bytedeco.javacpp.PointerPointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer functions]
    (-> this (.initializeFunctions functions))))

(defn get-device-total-memory
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `long`"
  (^Long [^NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.getDeviceTotalMemory ptr-to-device-id))))

(defn shuffle-half
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  x - `org.bytedeco.javacpp.PointerPointer`
  x-shape-info - `org.bytedeco.javacpp.PointerPointer`
  z - `org.bytedeco.javacpp.PointerPointer`
  z-shape-info - `org.bytedeco.javacpp.PointerPointer`
  n - `int`
  shuffle-map - `org.bytedeco.javacpp.IntPointer`
  tad-shape-info - `org.bytedeco.javacpp.PointerPointer`
  tad-offsets - `org.bytedeco.javacpp.PointerPointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.PointerPointer x ^org.bytedeco.javacpp.PointerPointer x-shape-info ^org.bytedeco.javacpp.PointerPointer z ^org.bytedeco.javacpp.PointerPointer z-shape-info ^Integer n ^org.bytedeco.javacpp.IntPointer shuffle-map ^org.bytedeco.javacpp.PointerPointer tad-shape-info ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.shuffleHalf extra-pointers x x-shape-info z z-shape-info n shuffle-map tad-shape-info tad-offsets))))

(defn exec-custom-op-double
  "i-args - `org.bytedeco.javacpp.LongPointer`
  num-i-args - `int`
  is-inplace - `boolean`

  returns: `int execCustomOpDouble(org.bytedeco.javacpp.PointerPointer extraPointers, long opHashCode, org.bytedeco.javacpp.PointerPointer inputBuffers, org.bytedeco.javacpp.PointerPointer inputShapes, int numInput, org.bytedeco.javacpp.PointerPointer outputBuffers, org.bytedeco.javacpp.PointerPointer outputShapes, int numOutputs, org.bytedeco.javacpp.DoublePointer tArgs, int numTArgs, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer i-args ^Integer num-i-args ^Boolean is-inplace]
    (-> this (.execCustomOpDouble i-args num-i-args is-inplace))))

(defn estimate-threshold-half
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  x - `org.bytedeco.javacpp.Pointer`
  n - `int`
  threshold - `float`

  returns: `int`"
  (^Integer [^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.Pointer x ^Integer n ^Float threshold]
    (-> this (.estimateThresholdHalf extra-pointers x n threshold))))

(defn exec-index-reduce-scalar-half
  "extra-params - `org.bytedeco.javacpp.ShortPointer`

  returns: `float execIndexReduceScalarHalf(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params]
    (-> this (.execIndexReduceScalarHalf extra-params))))

(defn exec-reduce-3-all-double
  "y-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void execReduce3AllDouble(org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer extraParamsVals, org.bytedeco.javacpp.DoublePointer y, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.DoublePointer result, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer resultShapeInfoBuffer, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xTadShape, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer xOffsets, (value="Nd4jLong *") org.bytedeco.javacpp.LongPointer yTadShape, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.LongPointer y-offsets]
    (-> this (.execReduce3AllDouble y-offsets))))

(defn exec-aggregate-batch-float
  "extras - `org.bytedeco.javacpp.PointerPointer`
  num-aggregates - `int`
  op-num - `int`
  max-args - `int`
  max-shapes - `int`
  max-int-arrays - `int`
  max-int-array-size - `int`
  max-idx - `int`
  max-reals - `int`
  ptr-to-arguments - `org.bytedeco.javacpp.Pointer`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extras ^Integer num-aggregates ^Integer op-num ^Integer max-args ^Integer max-shapes ^Integer max-int-arrays ^Integer max-int-array-size ^Integer max-idx ^Integer max-reals ^org.bytedeco.javacpp.Pointer ptr-to-arguments]
    (-> this (.execAggregateBatchFloat extras num-aggregates op-num max-args max-shapes max-int-arrays max-int-array-size max-idx max-reals ptr-to-arguments))))

(defn exec-aggregate-double
  "int-arrays - `org.bytedeco.javacpp.PointerPointer`
  num-int-arrays - `int`
  real-arguments - `org.bytedeco.javacpp.DoublePointer`
  num-real-arguments - `int`

  returns: `void execAggregateDouble(org.bytedeco.javacpp.PointerPointer extras, int opNum, (value="double **") org.bytedeco.javacpp.PointerPointer arguments, int numArguments, (value="Nd4jLong **") org.bytedeco.javacpp.PointerPointer shapes, int numShapes, org.bytedeco.javacpp.IntPointer indexArguments, int numIndexArguments, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer int-arrays ^Integer num-int-arrays ^org.bytedeco.javacpp.DoublePointer real-arguments ^Integer num-real-arguments]
    (-> this (.execAggregateDouble int-arrays num-int-arrays real-arguments num-real-arguments))))

(defn encode-threshold-p-1-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  dx - `org.bytedeco.javacpp.DoublePointer`
  n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^org.bytedeco.javacpp.DoublePointer dx ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeThresholdP1Double extra-pointers dx n dz threshold))))

(defn accumulate-half
  "z - `org.bytedeco.javacpp.ShortPointer`
  n - `int`
  length - `long`

  returns: `void accumulateHalf(org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.PointerPointer x, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.ShortPointer z ^Integer n ^Long length]
    (-> this (.accumulateHalf z n length))))

(defn exec-aggregate-float
  "int-arrays - `org.bytedeco.javacpp.PointerPointer`
  num-int-arrays - `int`
  real-arguments - `org.bytedeco.javacpp.FloatPointer`
  num-real-arguments - `int`

  returns: `void execAggregateFloat(org.bytedeco.javacpp.PointerPointer extras, int opNum, (value="float **") org.bytedeco.javacpp.PointerPointer arguments, int numArguments, (value="Nd4jLong **") org.bytedeco.javacpp.PointerPointer shapes, int numShapes, org.bytedeco.javacpp.IntPointer indexArguments, int numIndexArguments, @`"
  ([^NativeOps this ^org.bytedeco.javacpp.PointerPointer int-arrays ^Integer num-int-arrays ^org.bytedeco.javacpp.FloatPointer real-arguments ^Integer num-real-arguments]
    (-> this (.execAggregateFloat int-arrays num-int-arrays real-arguments num-real-arguments))))

