(ns org.nd4j.nativeblas.Nd4jCuda$NativeOps
  "Copyright (c) 2015-2018 Skymind, Inc.
 This program and the accompanying materials are made available under the
 terms of the Apache License, Version 2.0 which is available at
 https://www.apache.org/licenses/LICENSE-2.0.
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an \"AS IS\" BASIS, WITHOUT
 WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 License for the specific language governing permissions and limitations
 under the License.
 SPDX-License-Identifier: Apache-2.0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$NativeOps]))

(defn ->native-ops
  "Constructor.

  Native array allocator. Access with Pointer.position(long).

  size - `long`"
  (^Nd4jCuda$NativeOps [^Long size]
    (new Nd4jCuda$NativeOps size))
  (^Nd4jCuda$NativeOps []
    (new Nd4jCuda$NativeOps )))

(defn exec-random-float
  "z-shape-buffer - `org.bytedeco.javacpp.LongPointer`
  extra-arguments - `org.bytedeco.javacpp.FloatPointer`

  returns: `void execRandomFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer state, org.bytedeco.javacpp.FloatPointer z, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape-buffer ^org.bytedeco.javacpp.FloatPointer extra-arguments]
    (-> this (.execRandomFloat z-shape-buffer extra-arguments))))

(defn get-device-minor
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.getDeviceMinor ptr-to-device-id))))

(defn malloc-host
  "This method acquires memory chunk of requested size on host side

  memory-size - memory size, in bytes - `long`
  flags - optional parameter - `int`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^Long memory-size ^Integer flags]
    (-> this (.mallocHost memory-size flags))))

(defn exec-custom-op-with-scope-float
  "output-shapes - `org.bytedeco.javacpp.PointerPointer`
  num-outputs - `int`

  returns: `(value="Nd4jStatus")  int execCustomOpWithScopeFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer state, (value="Nd4jLong") long opHash, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer scopes, int numScopes, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputBuffers, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapes, int numInputs, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer outputBuffers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer output-shapes ^Integer num-outputs]
    (-> this (.execCustomOpWithScopeFloat output-shapes num-outputs))))

(defn exec-meta-predicate-reduce-float
  "scalar-returned - `boolean`

  returns: `void execMetaPredicateReduceFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, org.bytedeco.javacpp.FloatPointer dx, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer dy, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.FloatPointer dz, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zShapeInfo, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadOffsets, org.bytedeco.javacpp.FloatPointer extraA, org.bytedeco.javacpp.FloatPointer extraB, float scalarA, float scalarB, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean scalar-returned]
    (-> this (.execMetaPredicateReduceFloat scalar-returned))))

(defn set-tad-threshold
  "Description copied from class: NativeOps

  num - `int`"
  ([^Nd4jCuda$NativeOps this ^Integer num]
    (-> this (.setTADThreshold num))))

(defn exec-reduce-scalar-half
  "extra-params - `org.bytedeco.javacpp.ShortPointer`

  returns: `float execReduceScalarHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params]
    (-> this (.execReduceScalarHalf extra-params))))

(defn malloc-device
  "This method acquires memory chunk of requested size on specified device

  ptr-to-device-id - pointer to deviceId. For cuda that's just and int, for OpenCL that's pointer to device_id, etc - `org.bytedeco.javacpp.Pointer`
  flags - optional parameter - `int`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer mallocDevice((value="Nd4jLong") long memorySize, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id ^Integer flags]
    (-> this (.mallocDevice ptr-to-device-id flags))))

(defn create-event
  "returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this]
    (-> this (.createEvent))))

(defn set-omp-num-threads
  "Description copied from class: NativeOps

  threads - `int`"
  ([^Nd4jCuda$NativeOps this ^Integer threads]
    (-> this (.setOmpNumThreads threads))))

(defn decode-threshold-double
  "n - `long`
  dz - `org.bytedeco.javacpp.DoublePointer`

  returns: `void decodeThresholdDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.Pointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.DoublePointer dz]
    (-> this (.decodeThresholdDouble n dz))))

(defn destroy-random
  "ptr-random - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-random]
    (-> this (.destroyRandom ptr-random))))

(defn set-grid-limit
  "grid-size - `int`"
  ([^Nd4jCuda$NativeOps this ^Integer grid-size]
    (-> this (.setGridLimit grid-size))))

(defn free-device
  "This method releases previously allocated memory space on device

  ptr-to-device-id - pointer to deviceId. - `org.bytedeco.javacpp.Pointer`

  returns: `int freeDevice((value="Nd4jPointer") org.bytedeco.javacpp.Pointer pointer, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.freeDevice ptr-to-device-id))))

(defn sort-float
  "descending - `boolean`

  returns: `void sortFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean descending]
    (-> this (.sortFloat descending))))

(defn numpy-from-file
  "Load a numpy array from a file
  and return it as an Nd4jPointer

  path - `org.bytedeco.javacpp.BytePointer`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.BytePointer path]
    (-> this (.numpyFromFile path))))

(defn sort-half
  "descending - `boolean`

  returns: `void sortHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean descending]
    (-> this (.sortHalf descending))))

(defn special-concat-double
  "Concatneate multi array of the same shape together
  along a particular dimension

  offset-pointers - `org.bytedeco.javacpp.PointerPointer`

  returns: `void specialConcatDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer data, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapeInfo, org.bytedeco.javacpp.DoublePointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer tadPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer offset-pointers]
    (-> this (.specialConcatDouble offset-pointers))))

(defn tad-only-shape-info
  "offsets-buffer - `org.bytedeco.javacpp.LongPointer`

  returns: `void tadOnlyShapeInfo((value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer targetBuffer, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer offsets-buffer]
    (-> this (.tadOnlyShapeInfo offsets-buffer))))

(defn exec-meta-predicate-strided-half
  "extra-b - `org.bytedeco.javacpp.ShortPointer`
  scalar-a - `float`
  scalar-b - `float`

  returns: `void execMetaPredicateStridedHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, (value="Nd4jLong") long N, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, (value="Nd4jLong") long xStride, (value="float16*") org.bytedeco.javacpp.ShortPointer dy, (value="Nd4jLong") long yStride, (value="float16*") org.bytedeco.javacpp.ShortPointer dz, (value="Nd4jLong") long zStride, (value="float16*") org.bytedeco.javacpp.ShortPointer extraA, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-b ^Float scalar-a ^Float scalar-b]
    (-> this (.execMetaPredicateStridedHalf extra-b scalar-a scalar-b))))

(defn exec-index-reduce-half
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execIndexReduceHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParams, (value="float16*") org.bytedeco.javacpp.ShortPointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execIndexReduceHalf result-shape-info-buffer dimension dimension-length))))

(defn execute-flat-graph-double
  "flat-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ResultWrapper executeFlatGraphDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer flat-buffer-pointer]
    (-> this (.executeFlatGraphDouble flat-buffer-pointer))))

(defn exec-custom-op-float
  "is-inplace - `boolean`

  returns: `int execCustomOpFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long hash, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputBuffers, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapes, int numInputs, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer outputBuffers, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer outputShapes, int numOutputs, org.bytedeco.javacpp.FloatPointer tArgs, int numTArgs, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer iArgs, int numIArgs, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean is-inplace]
    (-> this (.execCustomOpFloat is-inplace))))

(defn mmap-file
  "length - `long`

  returns: `(value="Nd4jLong*")  org.bytedeco.javacpp.LongPointer mmapFile((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="char*") java.lang.String fileName, @`"
  ([^Nd4jCuda$NativeOps this ^Long length]
    (-> this (.mmapFile length))))

(defn re-seed-buffer
  "ptr-random - `org.bytedeco.javacpp.Pointer`

  returns: `void reSeedBuffer((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, long seed, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-random]
    (-> this (.reSeedBuffer ptr-random))))

(defn delete-long-array
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deleteLongArray pointer))))

(defn is-experimental-enabled
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$NativeOps this]
    (-> this (.isExperimentalEnabled))))

(defn init-random
  "ptr-to-buffer - `org.bytedeco.javacpp.Pointer`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer initRandom((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, long seed, long bufferSize, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-buffer]
    (-> this (.initRandom ptr-to-buffer))))

(defn set-device
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.setDevice ptr-to-device-id))))

(defn exec-summary-stats-scalar-half
  "bias-corrected - `boolean`

  returns: `float execSummaryStatsScalarHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParams, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean bias-corrected]
    (-> this (.execSummaryStatsScalarHalf bias-corrected))))

(defn average-float
  "propagate - `boolean`

  returns: `void averageFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dx, org.bytedeco.javacpp.FloatPointer dz, int n, (value="Nd4jLong") long length, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean propagate]
    (-> this (.averageFloat propagate))))

(defn element-size-for-npy-array
  "Get the element size for a numpy array

  npy-array - the numpy array's addressto get the length for - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.elementSizeForNpyArray npy-array))))

(defn exec-broadcast-double
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execBroadcastDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, org.bytedeco.javacpp.DoublePointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yInfo, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execBroadcastDouble result-shape-info dimension dimension-length))))

(defn sort-double
  "descending - `boolean`

  returns: `void sortDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean descending]
    (-> this (.sortDouble descending))))

(defn memcpy-async
  "reserved - `org.bytedeco.javacpp.Pointer`

  returns: `int memcpyAsync((value="Nd4jPointer") org.bytedeco.javacpp.Pointer dst, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer src, (value="Nd4jLong") long size, int flags, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer reserved]
    (-> this (.memcpyAsync reserved))))

(defn exec-summary-stats-double
  "bias-corrected - `boolean`

  returns: `void execSummaryStatsDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, org.bytedeco.javacpp.DoublePointer extraParams, org.bytedeco.javacpp.DoublePointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean bias-corrected]
    (-> this (.execSummaryStatsDouble bias-corrected))))

(defn concat-double
  "Concatneate multi array of the same shape together
  along a particular dimension

  offset-pointers - `org.bytedeco.javacpp.PointerPointer`

  returns: `void concatDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer data, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapeInfo, org.bytedeco.javacpp.DoublePointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer tadPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer offset-pointers]
    (-> this (.concatDouble offset-pointers))))

(defn exec-reduce-3-scalar-float
  "y-shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `float execReduce3ScalarFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParamsVals, org.bytedeco.javacpp.FloatPointer y, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer y-shape-info]
    (-> this (.execReduce3ScalarFloat y-shape-info))))

(defn exec-broadcast-float
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execBroadcastFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.FloatPointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execBroadcastFloat result-shape-info dimension dimension-length))))

(defn element-size-for-npy-array-header
  "Get the element size for a numpy array

  npy-array - the numpy array's addressto get the length for - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.elementSizeForNpyArrayHeader npy-array))))

(defn get-graph-state-float
  "id - `long`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^Long id]
    (-> this (.getGraphStateFloat id))))

(defn exec-reduce-3-all-float
  "y-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void execReduce3AllFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, org.bytedeco.javacpp.FloatPointer extraParamsVals, org.bytedeco.javacpp.FloatPointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yInfo, org.bytedeco.javacpp.FloatPointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfoBuffer, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xTadShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xOffsets, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yTadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer y-offsets]
    (-> this (.execReduce3AllFloat y-offsets))))

(defn exec-pairwise-transform-double
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.DoublePointer`

  returns: `void execPairwiseTransformDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer dx, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.DoublePointer extra-params]
    (-> this (.execPairwiseTransformDouble result-shape-info extra-params)))
  ([^Nd4jCuda$NativeOps this ^Long n]
    (-> this (.execPairwiseTransformDouble n))))

(defn get-graph-state-half
  "id - `long`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^Long id]
    (-> this (.getGraphStateHalf id))))

(defn exec-custom-op-with-scope-half
  "output-shapes - `org.bytedeco.javacpp.PointerPointer`
  num-outputs - `int`

  returns: `(value="Nd4jStatus")  int execCustomOpWithScopeHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer state, (value="Nd4jLong") long opHash, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer scopes, int numScopes, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputBuffers, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapes, int numInputs, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer outputBuffers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer output-shapes ^Integer num-outputs]
    (-> this (.execCustomOpWithScopeHalf output-shapes num-outputs))))

(defn decode-bitmap-double
  "n - `long`
  dz - `org.bytedeco.javacpp.DoublePointer`

  returns: `void decodeBitmapDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.Pointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.DoublePointer dz]
    (-> this (.decodeBitmapDouble n dz))))

(defn exec-reduce-scalar-float
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.FloatPointer`

  returns: `float execReduceScalarFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^org.bytedeco.javacpp.FloatPointer extra-params]
    (-> this (.execReduceScalarFloat x-shape-info extra-params))))

(defn flatten-double
  "Append an input array
  to the end of a flat array
  in a particular order

  input-shape-info - the shape information for that array - `org.bytedeco.javacpp.LongPointer`

  returns: `void flattenDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int offset, char order, org.bytedeco.javacpp.DoublePointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, org.bytedeco.javacpp.DoublePointer input, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer input-shape-info]
    (-> this (.flattenDouble input-shape-info))))

(defn delete-pointer-array
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deletePointerArray pointer))))

(defn delete-graph-state-float
  "state - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer state]
    (-> this (.deleteGraphStateFloat state))))

(defn convert-types
  "z - `org.bytedeco.javacpp.Pointer`

  returns: `void convertTypes((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, int srcType, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer x, (value="Nd4jLong") long N, int dstType, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer z]
    (-> this (.convertTypes z))))

(defn exec-summary-stats-scalar-float
  "bias-corrected - `boolean`

  returns: `float execSummaryStatsScalarFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParams, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean bias-corrected]
    (-> this (.execSummaryStatsScalarFloat bias-corrected))))

(defn decode-threshold-float
  "n - `long`
  dz - `org.bytedeco.javacpp.FloatPointer`

  returns: `void decodeThresholdFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.Pointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.FloatPointer dz]
    (-> this (.decodeThresholdFloat n dz))))

(defn destroy-event
  "event - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer event]
    (-> this (.destroyEvent event))))

(defn pull-rows-float
  "z-tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void pullRowsFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer z, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="Nd4jLong") long n, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer indexes, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadOffsets, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zTadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer z-tad-offsets]
    (-> this (.pullRowsFloat z-tad-offsets))))

(defn exec-meta-predicate-shape-float
  "z-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-a - `org.bytedeco.javacpp.FloatPointer`
  extra-b - `org.bytedeco.javacpp.FloatPointer`
  scalar-a - `float`
  scalar-b - `float`

  returns: `void execMetaPredicateShapeFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, (value="Nd4jLong") long N, org.bytedeco.javacpp.FloatPointer dx, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer dy, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.FloatPointer dz, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape-info ^org.bytedeco.javacpp.FloatPointer extra-a ^org.bytedeco.javacpp.FloatPointer extra-b ^Float scalar-a ^Float scalar-b]
    (-> this (.execMetaPredicateShapeFloat z-shape-info extra-a extra-b scalar-a scalar-b))))

(defn event-synchronize
  "event - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer event]
    (-> this (.eventSynchronize event))))

(defn exec-random-double
  "z-shape-buffer - `org.bytedeco.javacpp.LongPointer`
  extra-arguments - `org.bytedeco.javacpp.DoublePointer`

  returns: `void execRandomDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer state, org.bytedeco.javacpp.DoublePointer z, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape-buffer ^org.bytedeco.javacpp.DoublePointer extra-arguments]
    (-> this (.execRandomDouble z-shape-buffer extra-arguments))))

(defn numpy-from-nd-4j
  "Create a numpy array from an nd4j
  array

  word-size - the word size (4 for float, 8 for doubles) - `long`

  returns: a pointer to a numpy array - `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer numpyFromNd4j((value="Nd4jPointer") org.bytedeco.javacpp.Pointer data, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer shapeBuffer, @`"
  ([^Nd4jCuda$NativeOps this ^Long word-size]
    (-> this (.numpyFromNd4j word-size))))

(defn stream-synchronize
  "stream - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer stream]
    (-> this (.streamSynchronize stream))))

(defn get-all-operations
  "returns: `(value="char*")  java.lang.String`"
  ([^Nd4jCuda$NativeOps this]
    (-> this (.getAllOperations))))

(defn pointer-for-address
  "The pointer to get the address for

  address - the address to get the pointer - `long`

  returns: the pointer for the given address - `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^Long address]
    (-> this (.pointerForAddress address))))

(defn exec-meta-predicate-strided-float
  "z-stride - `long`
  extra-a - `org.bytedeco.javacpp.FloatPointer`
  extra-b - `org.bytedeco.javacpp.FloatPointer`
  scalar-a - `float`
  scalar-b - `float`

  returns: `void execMetaPredicateStridedFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, (value="Nd4jLong") long N, org.bytedeco.javacpp.FloatPointer dx, (value="Nd4jLong") long xStride, org.bytedeco.javacpp.FloatPointer dy, (value="Nd4jLong") long yStride, org.bytedeco.javacpp.FloatPointer dz, @`"
  ([^Nd4jCuda$NativeOps this ^Long z-stride ^org.bytedeco.javacpp.FloatPointer extra-a ^org.bytedeco.javacpp.FloatPointer extra-b ^Float scalar-a ^Float scalar-b]
    (-> this (.execMetaPredicateStridedFloat z-stride extra-a extra-b scalar-a scalar-b))))

(defn exec-summary-stats-scalar-double
  "bias-corrected - `boolean`

  returns: `double execSummaryStatsScalarDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, org.bytedeco.javacpp.DoublePointer extraParams, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean bias-corrected]
    (-> this (.execSummaryStatsScalarDouble bias-corrected))))

(defn exec-random-half
  "extra-arguments - `org.bytedeco.javacpp.ShortPointer`

  returns: `void execRandomHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer state, (value="float16*") org.bytedeco.javacpp.ShortPointer z, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zShapeBuffer, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-arguments]
    (-> this (.execRandomHalf extra-arguments))))

(defn omp-get-num-threads
  "Description copied from class: NativeOps

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this]
    (-> this (.ompGetNumThreads))))

(defn data-point-for-numpy-struct
  "npy-array-struct - `org.bytedeco.javacpp.Pointer`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer npy-array-struct]
    (-> this (.dataPointForNumpyStruct npy-array-struct))))

(defn delete-shape-list
  "shape-list - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer shape-list]
    (-> this (.deleteShapeList shape-list))))

(defn set-omp-min-threads
  "Description copied from class: NativeOps

  threads - `int`"
  ([^Nd4jCuda$NativeOps this ^Integer threads]
    (-> this (.setOmpMinThreads threads))))

(defn delete-variables-set-half
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deleteVariablesSetHalf pointer))))

(defn get-graph-state-double
  "id - `long`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^Long id]
    (-> this (.getGraphStateDouble id))))

(defn exec-reduce-scalar-double
  "x-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.DoublePointer`

  returns: `double execReduceScalarDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer x-info ^org.bytedeco.javacpp.DoublePointer extra-params]
    (-> this (.execReduceScalarDouble x-info extra-params))))

(defn execute-stored-graph-float
  "input-shapes - `org.bytedeco.javacpp.PointerPointer`
  input-indices - `org.bytedeco.javacpp.IntPointer`
  num-inputs - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$FloatVariablesSet executeStoredGraphFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long graphId, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputBuffers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer input-shapes ^org.bytedeco.javacpp.IntPointer input-indices ^Integer num-inputs]
    (-> this (.executeStoredGraphFloat input-shapes input-indices num-inputs))))

(defn flatten-half
  "input-shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `void flattenHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int offset, char order, (value="float16*") org.bytedeco.javacpp.ShortPointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer input, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer input-shape-info]
    (-> this (.flattenHalf input-shape-info))))

(defn exec-summary-stats-half
  "bias-corrected - `boolean`

  returns: `void execSummaryStatsHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParams, (value="float16*") org.bytedeco.javacpp.ShortPointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean bias-corrected]
    (-> this (.execSummaryStatsHalf bias-corrected))))

(defn memset
  "reserved - `org.bytedeco.javacpp.Pointer`

  returns: `int memset((value="Nd4jPointer") org.bytedeco.javacpp.Pointer dst, int value, (value="Nd4jLong") long size, int flags, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer reserved]
    (-> this (.memset reserved))))

(defn memcpy
  "reserved - `org.bytedeco.javacpp.Pointer`

  returns: `int memcpy((value="Nd4jPointer") org.bytedeco.javacpp.Pointer dst, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer src, (value="Nd4jLong") long size, int flags, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer reserved]
    (-> this (.memcpy reserved))))

(defn sort-coo-indices-half
  "length - `long`
  rank - `int`

  returns: `void sortCooIndicesHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer indices, (value="float16*") org.bytedeco.javacpp.ShortPointer values, @`"
  ([^Nd4jCuda$NativeOps this ^Long length ^Integer rank]
    (-> this (.sortCooIndicesHalf length rank))))

(defn enable-verbose-mode
  "really-enable - `boolean`"
  ([^Nd4jCuda$NativeOps this ^Boolean really-enable]
    (-> this (.enableVerboseMode really-enable))))

(defn encode-threshold-p-2-int
  "n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`

  returns: `void encodeThresholdP2Int((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.IntPointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.IntPointer dz]
    (-> this (.encodeThresholdP2Int n dz))))

(defn exec-transform-float
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.FloatPointer`

  returns: `void execTransformFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer dx, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.FloatPointer extra-params]
    (-> this (.execTransformFloat result-shape-info extra-params)))
  ([^Nd4jCuda$NativeOps this ^Long n]
    (-> this (.execTransformFloat n))))

(defn enable-p-2-p
  "enable - `boolean`"
  ([^Nd4jCuda$NativeOps this ^Boolean enable]
    (-> this (.enableP2P enable))))

(defn data-point-for-numpy
  "Description copied from class: NativeOps

  npy-array - `org.bytedeco.javacpp.Pointer`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.dataPointForNumpy npy-array))))

(defn pull-rows-half
  "z-tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void pullRowsHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer z, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="Nd4jLong") long n, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer indexes, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadOffsets, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zTadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer z-tad-offsets]
    (-> this (.pullRowsHalf z-tad-offsets))))

(defn pull-rows-double
  "z-tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void pullRowsDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer z, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="Nd4jLong") long n, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer indexes, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadOffsets, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zTadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer z-tad-offsets]
    (-> this (.pullRowsDouble z-tad-offsets))))

(defn concat-float
  "Concatneate multi array of the same shape together
  along a particular dimension

  offset-pointers - `org.bytedeco.javacpp.PointerPointer`

  returns: `void concatFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer data, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapeInfo, org.bytedeco.javacpp.FloatPointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer tadPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer offset-pointers]
    (-> this (.concatFloat offset-pointers))))

(defn delete-result-wrapper
  "ptr - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr]
    (-> this (.deleteResultWrapper ptr))))

(defn execute-flat-graph-float
  "flat-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ResultWrapper executeFlatGraphFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer flat-buffer-pointer]
    (-> this (.executeFlatGraphFloat flat-buffer-pointer))))

(defn get-device-name
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `(value="char*")  java.lang.String`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.getDeviceName ptr-to-device-id))))

(defn decode-bitmap-float
  "n - `long`
  dz - `org.bytedeco.javacpp.FloatPointer`

  returns: `void decodeBitmapFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.Pointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.FloatPointer dz]
    (-> this (.decodeBitmapFloat n dz))))

(defn tear-float
  "This method takes single N-dimensional tensor, and copies its TADs to target arrays

  tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void tearFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer targets, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer tad-offsets]
    (-> this (.tearFloat tad-offsets))))

(defn register-graph-float
  "flat-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `int registerGraphFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long graphId, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer flat-buffer-pointer]
    (-> this (.registerGraphFloat flat-buffer-pointer))))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCuda$NativeOps`"
  (^org.nd4j.nativeblas.Nd4jCuda$NativeOps [^Nd4jCuda$NativeOps this ^Long position]
    (-> this (.position position))))

(defn exec-reduce-3-all-half
  "y-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void execReduce3AllHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParamsVals, (value="float16*") org.bytedeco.javacpp.ShortPointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfoBuffer, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xTadShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xOffsets, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yTadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer y-offsets]
    (-> this (.execReduce3AllHalf y-offsets))))

(defn encode-threshold-p-3-half
  "n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`

  returns: `void encodeThresholdP3Half((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, org.bytedeco.javacpp.IntPointer offsets, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.IntPointer dz]
    (-> this (.encodeThresholdP3Half n dz))))

(defn release-numpy
  "Description copied from class: NativeOps

  npy-array - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.releaseNumpy npy-array))))

(defn delete-graph-state-double
  "state - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer state]
    (-> this (.deleteGraphStateDouble state))))

(defn encode-threshold-p-3-float
  "n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`

  returns: `void encodeThresholdP3Float((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.FloatPointer dx, org.bytedeco.javacpp.IntPointer offsets, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.IntPointer dz]
    (-> this (.encodeThresholdP3Float n dz))))

(defn accumulate-double
  "length - `long`

  returns: `void accumulateDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dx, org.bytedeco.javacpp.DoublePointer dz, int n, @`"
  ([^Nd4jCuda$NativeOps this ^Long length]
    (-> this (.accumulateDouble length))))

(defn exec-custom-op-with-scope-double
  "output-shapes - `org.bytedeco.javacpp.PointerPointer`
  num-outputs - `int`

  returns: `(value="Nd4jStatus")  int execCustomOpWithScopeDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer state, (value="Nd4jLong") long opHash, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer scopes, int numScopes, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputBuffers, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapes, int numInputs, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer outputBuffers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer output-shapes ^Integer num-outputs]
    (-> this (.execCustomOpWithScopeDouble output-shapes num-outputs))))

(defn execute-stored-graph-half
  "input-shapes - `org.bytedeco.javacpp.PointerPointer`
  input-indices - `org.bytedeco.javacpp.IntPointer`
  num-inputs - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$HalfVariablesSet executeStoredGraphHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long graphId, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputBuffers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer input-shapes ^org.bytedeco.javacpp.IntPointer input-indices ^Integer num-inputs]
    (-> this (.executeStoredGraphHalf input-shapes input-indices num-inputs))))

(defn special-concat-half
  "offset-pointers - `org.bytedeco.javacpp.PointerPointer`

  returns: `void specialConcatHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer data, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer tadPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer offset-pointers]
    (-> this (.specialConcatHalf offset-pointers))))

(defn exec-scalar-half
  "extra-params - `org.bytedeco.javacpp.ShortPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execScalarHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer z, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer scalars, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execScalarHalf extra-params dimension dimension-length)))
  ([^Nd4jCuda$NativeOps this ^Long n]
    (-> this (.execScalarHalf n))))

(defn get-all-custom-ops
  "returns: `(value="char*")  java.lang.String`"
  ([^Nd4jCuda$NativeOps this]
    (-> this (.getAllCustomOps))))

(defn shape-buffer-for-numpy
  "Description copied from class: NativeOps

  npy-array - `org.bytedeco.javacpp.Pointer`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.shapeBufferForNumpy npy-array))))

(defn encode-threshold-p-1-half
  "n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`

  returns: `void encodeThresholdP1Half((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeThresholdP1Half n dz threshold))))

(defn encode-bitmap-float
  "n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`

  returns: `(value="Nd4jLong")  long encodeBitmapFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.FloatPointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeBitmapFloat n dz threshold))))

(defn execute-stored-graph-double
  "input-shapes - `org.bytedeco.javacpp.PointerPointer`
  input-indices - `org.bytedeco.javacpp.IntPointer`
  num-inputs - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$DoubleVariablesSet executeStoredGraphDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long graphId, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputBuffers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer input-shapes ^org.bytedeco.javacpp.IntPointer input-indices ^Integer num-inputs]
    (-> this (.executeStoredGraphDouble input-shapes input-indices num-inputs))))

(defn delete-graph-state-half
  "state - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer state]
    (-> this (.deleteGraphStateHalf state))))

(defn exec-index-reduce-scalar-float
  "x-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.FloatPointer`

  returns: `float execIndexReduceScalarFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer x-shape-info ^org.bytedeco.javacpp.FloatPointer extra-params]
    (-> this (.execIndexReduceScalarFloat x-shape-info extra-params))))

(defn omp-get-max-threads
  "Description copied from class: NativeOps

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this]
    (-> this (.ompGetMaxThreads))))

(defn exec-reduce-half
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduceHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParams, (value="float16*") org.bytedeco.javacpp.ShortPointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduceHalf result-shape-info dimension dimension-length)))
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduceHalf result-shape-info))))

(defn accumulate-float
  "length - `long`

  returns: `void accumulateFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dx, org.bytedeco.javacpp.FloatPointer dz, int n, @`"
  ([^Nd4jCuda$NativeOps this ^Long length]
    (-> this (.accumulateFloat length))))

(defn memcpy-constant-async
  "reserved - `org.bytedeco.javacpp.Pointer`

  returns: `int memcpyConstantAsync((value="Nd4jLong") long dst, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer src, (value="Nd4jLong") long size, int flags, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer reserved]
    (-> this (.memcpyConstantAsync reserved))))

(defn encode-threshold-p-1-float
  "n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`

  returns: `void encodeThresholdP1Float((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.FloatPointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeThresholdP1Float n dz threshold))))

(defn execute-proto-graph-float
  "proto-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer executeProtoGraphFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer proto-buffer-pointer]
    (-> this (.executeProtoGraphFloat proto-buffer-pointer))))

(defn decode-bitmap-half
  "dz - `org.bytedeco.javacpp.ShortPointer`

  returns: `void decodeBitmapHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.Pointer dx, (value="Nd4jLong") long N, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.ShortPointer dz]
    (-> this (.decodeBitmapHalf dz))))

(defn get-device
  "returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this]
    (-> this (.getDevice))))

(defn exec-reduce-3-half
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduce3Half((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParamsVals, (value="float16*") org.bytedeco.javacpp.ShortPointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduce3Half result-shape-info-buffer dimension dimension-length)))
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduce3Half result-shape-info))))

(defn numpy-header-for-nd-4j
  "Description copied from class: NativeOps

  header-size - `org.bytedeco.javacpp.LongPointer`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer numpyHeaderForNd4j((value="Nd4jPointer") org.bytedeco.javacpp.Pointer data, (value="Nd4jPointer") org.bytedeco.javacpp.Pointer shapeBuffer, (value="Nd4jLong") long wordSize, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer header-size]
    (-> this (.numpyHeaderForNd4j header-size))))

(defn exec-aggregate-batch-double
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  num-aggregates - `int`
  op-num - `int`
  max-args - `int`
  max-shapes - `int`
  max-int-arrays - `int`
  max-int-array-size - `int`
  max-idx - `int`
  max-reals - `int`
  ptr-to-arguments - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Integer num-aggregates ^Integer op-num ^Integer max-args ^Integer max-shapes ^Integer max-int-arrays ^Integer max-int-array-size ^Integer max-idx ^Integer max-reals ^org.bytedeco.javacpp.Pointer ptr-to-arguments]
    (-> this (.execAggregateBatchDouble extra-pointers num-aggregates op-num max-args max-shapes max-int-arrays max-int-array-size max-idx max-reals ptr-to-arguments))))

(defn calculate-output-shapes-double
  "i-args - `org.bytedeco.javacpp.LongPointer`
  num-i-args - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList calculateOutputShapesDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long hash, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapes, int numInputShapes, org.bytedeco.javacpp.DoublePointer tArgs, int numTArgs, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer i-args ^Integer num-i-args]
    (-> this (.calculateOutputShapesDouble i-args num-i-args))))

(defn shuffle-double
  "tad-offsets - `org.bytedeco.javacpp.PointerPointer`

  returns: `void shuffleDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dx, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer xShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dz, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer zShapeInfo, int N, org.bytedeco.javacpp.IntPointer shuffleMap, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer tadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.shuffleDouble tad-offsets))))

(defn create-context
  "returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this]
    (-> this (.createContext))))

(defn average-double
  "propagate - `boolean`

  returns: `void averageDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dx, org.bytedeco.javacpp.DoublePointer dz, int n, (value="Nd4jLong") long length, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean propagate]
    (-> this (.averageDouble propagate))))

(defn exec-index-reduce-float
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execIndexReduceFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParams, org.bytedeco.javacpp.FloatPointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execIndexReduceFloat result-shape-info-buffer dimension dimension-length))))

(defn enable-debug-mode
  "really-enable - `boolean`"
  ([^Nd4jCuda$NativeOps this ^Boolean really-enable]
    (-> this (.enableDebugMode really-enable))))

(defn get-device-free-memory
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.getDeviceFreeMemory ptr-to-device-id))))

(defn sort-tad-half
  "descending - `boolean`

  returns: `void sortTadHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadOffsets, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean descending]
    (-> this (.sortTadHalf descending))))

(defn memset-async
  "reserved - `org.bytedeco.javacpp.Pointer`

  returns: `int memsetAsync((value="Nd4jPointer") org.bytedeco.javacpp.Pointer dst, int value, (value="Nd4jLong") long size, int flags, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer reserved]
    (-> this (.memsetAsync reserved))))

(defn sort-coo-indices-double
  "length - `long`
  rank - `int`

  returns: `void sortCooIndicesDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer indices, org.bytedeco.javacpp.DoublePointer values, @`"
  ([^Nd4jCuda$NativeOps this ^Long length ^Integer rank]
    (-> this (.sortCooIndicesDouble length rank))))

(defn exec-custom-op-half
  "is-inplace - `boolean`

  returns: `int execCustomOpHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long hash, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputBuffers, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapes, int numInputs, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer outputBuffers, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer outputShapes, int numOutputs, (value="float16*") org.bytedeco.javacpp.ShortPointer tArgs, int numTArgs, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer iArgs, int numIArgs, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean is-inplace]
    (-> this (.execCustomOpHalf is-inplace))))

(defn load-npy-from-header
  "Load numpy from a header
  based on the cnpy parse from header method.

  data - the header data to parse - `org.bytedeco.javacpp.Pointer`

  returns: a pointer to a numpy cnpy:NpyArray struct - `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer data]
    (-> this (.loadNpyFromHeader data))))

(defn exec-transform-half
  "n - `long`

  returns: `void execTransformHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, (value="Nd4jLong") long xStride, (value="float16*") org.bytedeco.javacpp.ShortPointer result, (value="Nd4jLong") long resultStride, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParams, @`"
  ([^Nd4jCuda$NativeOps this ^Long n]
    (-> this (.execTransformHalf n))))

(defn exec-pairwise-transform-half
  "n - `long`

  returns: `void execPairwiseTransformHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, (value="Nd4jLong") long xStride, (value="float16*") org.bytedeco.javacpp.ShortPointer y, (value="Nd4jLong") long yStride, (value="float16*") org.bytedeco.javacpp.ShortPointer result, (value="Nd4jLong") long resultStride, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParams, @`"
  ([^Nd4jCuda$NativeOps this ^Long n]
    (-> this (.execPairwiseTransformHalf n))))

(defn tear-double
  "This method takes single N-dimensional tensor, and copies its TADs to target arrays

  tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void tearDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer targets, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer tad-offsets]
    (-> this (.tearDouble tad-offsets))))

(defn length-for-shape-buffer-pointer
  "Return the length of a shape buffer
  based on the pointer

  buffer - the buffer pointer to check - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer buffer]
    (-> this (.lengthForShapeBufferPointer buffer))))

(defn exec-index-reduce-scalar-double
  "x-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.DoublePointer`

  returns: `double execIndexReduceScalarDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer x-info ^org.bytedeco.javacpp.DoublePointer extra-params]
    (-> this (.execIndexReduceScalarDouble x-info extra-params))))

(defn exec-transform-double
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.DoublePointer`

  returns: `void execTransformDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer dx, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.DoublePointer extra-params]
    (-> this (.execTransformDouble result-shape-info extra-params)))
  ([^Nd4jCuda$NativeOps this ^Long n]
    (-> this (.execTransformDouble n))))

(defn exec-index-reduce-double
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execIndexReduceDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, org.bytedeco.javacpp.DoublePointer extraParams, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execIndexReduceDouble result-shape-info-buffer dimension dimension-length))))

(defn get-device-major
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.getDeviceMajor ptr-to-device-id))))

(defn encode-bitmap-half
  "n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`

  returns: `(value="Nd4jLong")  long encodeBitmapHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeBitmapHalf n dz threshold))))

(defn register-graph-double
  "flat-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `int registerGraphDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long graphId, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer flat-buffer-pointer]
    (-> this (.registerGraphDouble flat-buffer-pointer))))

(defn exec-scalar-double
  "z-shape-info - `org.bytedeco.javacpp.LongPointer`
  scalars - `org.bytedeco.javacpp.DoublePointer`
  extra-params - `org.bytedeco.javacpp.DoublePointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execScalarDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer z, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape-info ^org.bytedeco.javacpp.DoublePointer scalars ^org.bytedeco.javacpp.DoublePointer extra-params ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execScalarDouble z-shape-info scalars extra-params dimension dimension-length)))
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^Double scalar ^org.bytedeco.javacpp.DoublePointer extra-params]
    (-> this (.execScalarDouble result-shape-info scalar extra-params)))
  ([^Nd4jCuda$NativeOps this ^Long n]
    (-> this (.execScalarDouble n))))

(defn calculate-output-shapes-float
  "i-args - `org.bytedeco.javacpp.LongPointer`
  num-i-args - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList calculateOutputShapesFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long hash, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapes, int numInputShapes, org.bytedeco.javacpp.FloatPointer tArgs, int numTArgs, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer i-args ^Integer num-i-args]
    (-> this (.calculateOutputShapesFloat i-args num-i-args))))

(defn concat-half
  "offset-pointers - `org.bytedeco.javacpp.PointerPointer`

  returns: `void concatHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer data, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer tadPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer offset-pointers]
    (-> this (.concatHalf offset-pointers))))

(defn execute-flat-graph-half
  "flat-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ResultWrapper executeFlatGraphHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer flat-buffer-pointer]
    (-> this (.executeFlatGraphHalf flat-buffer-pointer))))

(defn encode-threshold-p-3-double
  "n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`

  returns: `void encodeThresholdP3Double((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.DoublePointer dx, org.bytedeco.javacpp.IntPointer offsets, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.IntPointer dz]
    (-> this (.encodeThresholdP3Double n dz))))

(defn set-element-threshold
  "Description copied from class: NativeOps

  num - `int`"
  ([^Nd4jCuda$NativeOps this ^Integer num]
    (-> this (.setElementThreshold num))))

(defn register-event
  "stream - `org.bytedeco.javacpp.Pointer`

  returns: `int registerEvent((value="Nd4jPointer") org.bytedeco.javacpp.Pointer event, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer stream]
    (-> this (.registerEvent stream))))

(defn exec-scalar-float
  "Description copied from class: NativeOps

  z-shape-info - `org.bytedeco.javacpp.LongPointer`
  scalars - `org.bytedeco.javacpp.FloatPointer`
  extra-params - `org.bytedeco.javacpp.FloatPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execScalarFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer z, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape-info ^org.bytedeco.javacpp.FloatPointer scalars ^org.bytedeco.javacpp.FloatPointer extra-params ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execScalarFloat z-shape-info scalars extra-params dimension dimension-length)))
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^Float scalar ^org.bytedeco.javacpp.FloatPointer extra-params]
    (-> this (.execScalarFloat result-shape-info scalar extra-params)))
  ([^Nd4jCuda$NativeOps this ^Long n]
    (-> this (.execScalarFloat n))))

(defn exec-broadcast-half
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execBroadcastHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execBroadcastHalf result-shape-info dimension dimension-length))))

(defn sort-coo-indices-float
  "length - `long`
  rank - `int`

  returns: `void sortCooIndicesFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer indices, org.bytedeco.javacpp.FloatPointer values, @`"
  ([^Nd4jCuda$NativeOps this ^Long length ^Integer rank]
    (-> this (.sortCooIndicesFloat length rank))))

(defn register-graph-half
  "flat-buffer-pointer - `org.bytedeco.javacpp.Pointer`

  returns: `int registerGraphHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long graphId, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer flat-buffer-pointer]
    (-> this (.registerGraphHalf flat-buffer-pointer))))

(defn unregister-graph
  "graph-id - `long`

  returns: `int unregisterGraph((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^Nd4jCuda$NativeOps this ^Long graph-id]
    (-> this (.unregisterGraph graph-id))))

(defn shape-buffer-for-numpy-header
  "Get the shape buffer from a
  numpy array.
  **Warning** this allocates memory

  npy-array - `org.bytedeco.javacpp.Pointer`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.shapeBufferForNumpyHeader npy-array))))

(defn delete-int-array
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deleteIntArray pointer))))

(defn exec-meta-predicate-shape-double
  "z-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-a - `org.bytedeco.javacpp.DoublePointer`
  extra-b - `org.bytedeco.javacpp.DoublePointer`
  scalar-a - `double`
  scalar-b - `double`

  returns: `void execMetaPredicateShapeDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, (value="Nd4jLong") long N, org.bytedeco.javacpp.DoublePointer dx, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.DoublePointer dy, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.DoublePointer dz, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer z-shape-info ^org.bytedeco.javacpp.DoublePointer extra-a ^org.bytedeco.javacpp.DoublePointer extra-b ^Double scalar-a ^Double scalar-b]
    (-> this (.execMetaPredicateShapeDouble z-shape-info extra-a extra-b scalar-a scalar-b))))

(defn exec-meta-predicate-shape-half
  "extra-b - `org.bytedeco.javacpp.ShortPointer`
  scalar-a - `float`
  scalar-b - `float`

  returns: `void execMetaPredicateShapeHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, (value="Nd4jLong") long N, (value="float16*") org.bytedeco.javacpp.ShortPointer dx, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer dy, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer dz, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraA, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-b ^Float scalar-a ^Float scalar-b]
    (-> this (.execMetaPredicateShapeHalf extra-b scalar-a scalar-b))))

(defn tear-half
  "This method takes single N-dimensional tensor, and copies its TADs to target arrays

  tad-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void tearHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer targets, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer zShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer tad-offsets]
    (-> this (.tearHalf tad-offsets))))

(defn check-p-2-p
  ""
  ([^Nd4jCuda$NativeOps this]
    (-> this (.checkP2P))))

(defn average-half
  "propagate - `boolean`

  returns: `void averageHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dx, (value="float16*") org.bytedeco.javacpp.ShortPointer dz, int n, (value="Nd4jLong") long length, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean propagate]
    (-> this (.averageHalf propagate))))

(defn get-constant-space
  "returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this]
    (-> this (.getConstantSpace))))

(defn exec-reduce-3-scalar-half
  "y-shape-info - `org.bytedeco.javacpp.LongPointer`

  returns: `float execReduce3ScalarHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, (value="float16*") org.bytedeco.javacpp.ShortPointer extraParamsVals, (value="float16*") org.bytedeco.javacpp.ShortPointer y, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer y-shape-info]
    (-> this (.execReduce3ScalarHalf y-shape-info))))

(defn exec-reduce-float
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduceFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParams, org.bytedeco.javacpp.FloatPointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduceFloat result-shape-info dimension dimension-length)))
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduceFloat result-shape-info))))

(defn munmap-file
  "length - `long`

  returns: `void munmapFile((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer ptrMap, @`"
  ([^Nd4jCuda$NativeOps this ^Long length]
    (-> this (.munmapFile length))))

(defn exec-reduce-3-scalar-double
  "y-info - `org.bytedeco.javacpp.LongPointer`

  returns: `double execReduce3ScalarDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, org.bytedeco.javacpp.DoublePointer extraParamsVals, org.bytedeco.javacpp.DoublePointer y, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer y-info]
    (-> this (.execReduce3ScalarDouble y-info))))

(defn special-concat-float
  "offset-pointers - `org.bytedeco.javacpp.PointerPointer`

  returns: `void specialConcatFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int dimension, int numArrays, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer data, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapeInfo, org.bytedeco.javacpp.FloatPointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer tadPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer offset-pointers]
    (-> this (.specialConcatFloat offset-pointers))))

(defn exec-aggregate-batch-half
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  num-aggregates - `int`
  op-num - `int`
  max-args - `int`
  max-shapes - `int`
  max-int-arrays - `int`
  max-int-array-size - `int`
  max-idx - `int`
  max-reals - `int`
  ptr-to-arguments - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Integer num-aggregates ^Integer op-num ^Integer max-args ^Integer max-shapes ^Integer max-int-arrays ^Integer max-int-array-size ^Integer max-idx ^Integer max-reals ^org.bytedeco.javacpp.Pointer ptr-to-arguments]
    (-> this (.execAggregateBatchHalf extra-pointers num-aggregates op-num max-args max-shapes max-int-arrays max-int-array-size max-idx max-reals ptr-to-arguments))))

(defn data-point-for-numpy-header
  "npy-array - `org.bytedeco.javacpp.Pointer`

  returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer npy-array]
    (-> this (.dataPointForNumpyHeader npy-array))))

(defn delete-variables-set-double
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deleteVariablesSetDouble pointer))))

(defn estimate-threshold-float
  "x - `org.bytedeco.javacpp.Pointer`
  n - `int`
  threshold - `float`

  returns: `int estimateThresholdFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer x ^Integer n ^Float threshold]
    (-> this (.estimateThresholdFloat x n threshold))))

(defn exec-meta-predicate-strided-double
  "z-stride - `long`
  extra-a - `org.bytedeco.javacpp.DoublePointer`
  extra-b - `org.bytedeco.javacpp.DoublePointer`
  scalar-a - `double`
  scalar-b - `double`

  returns: `void execMetaPredicateStridedDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, int opTypeA, int opNumA, int opTypeB, int opNumB, (value="Nd4jLong") long N, org.bytedeco.javacpp.DoublePointer dx, (value="Nd4jLong") long xStride, org.bytedeco.javacpp.DoublePointer dy, (value="Nd4jLong") long yStride, org.bytedeco.javacpp.DoublePointer dz, @`"
  ([^Nd4jCuda$NativeOps this ^Long z-stride ^org.bytedeco.javacpp.DoublePointer extra-a ^org.bytedeco.javacpp.DoublePointer extra-b ^Double scalar-a ^Double scalar-b]
    (-> this (.execMetaPredicateStridedDouble z-stride extra-a extra-b scalar-a scalar-b))))

(defn calculate-output-shapes-half
  "i-args - `org.bytedeco.javacpp.LongPointer`
  num-i-args - `int`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList calculateOutputShapesHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long hash, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapes, int numInputShapes, (value="float16*") org.bytedeco.javacpp.ShortPointer tArgs, int numTArgs, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer i-args ^Integer num-i-args]
    (-> this (.calculateOutputShapesHalf i-args num-i-args))))

(defn exec-reduce-3-float
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduce3Float((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParamsVals, org.bytedeco.javacpp.FloatPointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.FloatPointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduce3Float result-shape-info-buffer dimension dimension-length)))
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduce3Float result-shape-info))))

(defn decode-threshold-half
  "dz - `org.bytedeco.javacpp.ShortPointer`

  returns: `void decodeThresholdHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.Pointer dx, (value="Nd4jLong") long N, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.ShortPointer dz]
    (-> this (.decodeThresholdHalf dz))))

(defn refresh-buffer
  "ptr-random - `org.bytedeco.javacpp.Pointer`

  returns: `void refreshBuffer((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, long seed, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-random]
    (-> this (.refreshBuffer ptr-random))))

(defn exec-summary-stats-float
  "bias-corrected - `boolean`

  returns: `void execSummaryStatsFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer extraParams, org.bytedeco.javacpp.FloatPointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean bias-corrected]
    (-> this (.execSummaryStatsFloat bias-corrected))))

(defn flatten-float
  "Append an input array
  to the end of a flat array
  in a particular order

  input-shape-info - the shape information for that array - `org.bytedeco.javacpp.LongPointer`

  returns: `void flattenFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int offset, char order, org.bytedeco.javacpp.FloatPointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfo, org.bytedeco.javacpp.FloatPointer input, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer input-shape-info]
    (-> this (.flattenFloat input-shape-info))))

(defn encode-bitmap-double
  "n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`

  returns: `(value="Nd4jLong")  long encodeBitmapDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.DoublePointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeBitmapDouble n dz threshold))))

(defn exec-reduce-double
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduceDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, org.bytedeco.javacpp.DoublePointer extraParams, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduceDouble result-shape-info dimension dimension-length)))
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduceDouble result-shape-info))))

(defn get-available-devices
  "returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this]
    (-> this (.getAvailableDevices))))

(defn exec-pairwise-transform-float
  "result-shape-info - `org.bytedeco.javacpp.LongPointer`
  extra-params - `org.bytedeco.javacpp.FloatPointer`

  returns: `void execPairwiseTransformFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.FloatPointer dx, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.FloatPointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yShapeInfo, org.bytedeco.javacpp.FloatPointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info ^org.bytedeco.javacpp.FloatPointer extra-params]
    (-> this (.execPairwiseTransformFloat result-shape-info extra-params)))
  ([^Nd4jCuda$NativeOps this ^Long n]
    (-> this (.execPairwiseTransformFloat n))))

(defn exec-reduce-3-double
  "result-shape-info-buffer - `org.bytedeco.javacpp.LongPointer`
  dimension - `org.bytedeco.javacpp.IntPointer`
  dimension-length - `int`

  returns: `void execReduce3Double((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, org.bytedeco.javacpp.DoublePointer extraParamsVals, org.bytedeco.javacpp.DoublePointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yInfo, org.bytedeco.javacpp.DoublePointer result, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info-buffer ^org.bytedeco.javacpp.IntPointer dimension ^Integer dimension-length]
    (-> this (.execReduce3Double result-shape-info-buffer dimension dimension-length)))
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer result-shape-info]
    (-> this (.execReduce3Double result-shape-info))))

(defn exec-aggregate-half
  "real-arguments - `org.bytedeco.javacpp.ShortPointer`
  num-real-arguments - `int`

  returns: `void execAggregateHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16**") org.bytedeco.javacpp.PointerPointer arguments, int numArguments, (value="Nd4jLong**") org.bytedeco.javacpp.PointerPointer shapeArguments, int numShapeArguments, org.bytedeco.javacpp.IntPointer indexArguments, int numIndexArguments, (value="int**") org.bytedeco.javacpp.PointerPointer intArrays, int numIntArrays, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.ShortPointer real-arguments ^Integer num-real-arguments]
    (-> this (.execAggregateHalf real-arguments num-real-arguments))))

(defn sort-tad-double
  "descending - `boolean`

  returns: `void sortTadDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadOffsets, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean descending]
    (-> this (.sortTadDouble descending))))

(defn initialize-devices-and-functions
  "This method implementation exists only for cuda.
  The other backends should have dummy method for JNI compatibility reasons."
  ([^Nd4jCuda$NativeOps this]
    (-> this (.initializeDevicesAndFunctions))))

(defn shuffle-float
  "tad-offsets - `org.bytedeco.javacpp.PointerPointer`

  returns: `void shuffleFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dx, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer xShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dz, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer zShapeInfo, int N, org.bytedeco.javacpp.IntPointer shuffleMap, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer tadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.shuffleFloat tad-offsets))))

(defn free-host
  "This method releases previously allocated host memory space

  pointer - pointer that'll be freed - `org.bytedeco.javacpp.Pointer`

  returns: `int`"
  (^Integer [^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.freeHost pointer))))

(defn is-p-2-p-available
  "returns: `(value="bool")  boolean`"
  ([^Nd4jCuda$NativeOps this]
    (-> this (.isP2PAvailable))))

(defn create-stream
  "returns: `(value="Nd4jPointer")  org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this]
    (-> this (.createStream))))

(defn delete-variables-set-float
  "pointer - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.deleteVariablesSetFloat pointer))))

(defn sort-tad-float
  "descending - `boolean`

  returns: `void sortTadFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.FloatPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer tadOffsets, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean descending]
    (-> this (.sortTadFloat descending))))

(defn estimate-threshold-double
  "x - `org.bytedeco.javacpp.Pointer`
  n - `int`
  threshold - `float`

  returns: `int estimateThresholdDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer x ^Integer n ^Float threshold]
    (-> this (.estimateThresholdDouble x n threshold))))

(defn initialize-functions
  "functions - `org.bytedeco.javacpp.PointerPointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer functions]
    (-> this (.initializeFunctions functions))))

(defn get-device-total-memory
  "ptr-to-device-id - `org.bytedeco.javacpp.Pointer`

  returns: `(value="Nd4jLong")  long`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer ptr-to-device-id]
    (-> this (.getDeviceTotalMemory ptr-to-device-id))))

(defn shuffle-half
  "tad-offsets - `org.bytedeco.javacpp.PointerPointer`

  returns: `void shuffleHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dx, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer xShapeInfo, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dz, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer zShapeInfo, int N, org.bytedeco.javacpp.IntPointer shuffleMap, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer tadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer tad-offsets]
    (-> this (.shuffleHalf tad-offsets))))

(defn exec-custom-op-double
  "is-inplace - `boolean`

  returns: `int execCustomOpDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, (value="Nd4jLong") long hash, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputBuffers, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer inputShapes, int numInputs, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer outputBuffers, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer outputShapes, int numOutputs, org.bytedeco.javacpp.DoublePointer tArgs, int numTArgs, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer iArgs, int numIArgs, @`"
  ([^Nd4jCuda$NativeOps this ^Boolean is-inplace]
    (-> this (.execCustomOpDouble is-inplace))))

(defn estimate-threshold-half
  "x - `org.bytedeco.javacpp.Pointer`
  n - `int`
  threshold - `float`

  returns: `int estimateThresholdHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.Pointer x ^Integer n ^Float threshold]
    (-> this (.estimateThresholdHalf x n threshold))))

(defn exec-index-reduce-scalar-half
  "extra-params - `org.bytedeco.javacpp.ShortPointer`

  returns: `float execIndexReduceScalarHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, (value="float16*") org.bytedeco.javacpp.ShortPointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.ShortPointer extra-params]
    (-> this (.execIndexReduceScalarHalf extra-params))))

(defn exec-reduce-3-all-double
  "y-offsets - `org.bytedeco.javacpp.LongPointer`

  returns: `void execReduce3AllDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum, org.bytedeco.javacpp.DoublePointer x, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xInfo, org.bytedeco.javacpp.DoublePointer extraParamsVals, org.bytedeco.javacpp.DoublePointer y, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yInfo, org.bytedeco.javacpp.DoublePointer result, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer resultShapeInfoBuffer, org.bytedeco.javacpp.IntPointer dimension, int dimensionLength, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xTadShapeInfo, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer xOffsets, (value="Nd4jLong*") org.bytedeco.javacpp.LongPointer yTadShapeInfo, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer y-offsets]
    (-> this (.execReduce3AllDouble y-offsets))))

(defn exec-aggregate-batch-float
  "extra-pointers - `org.bytedeco.javacpp.PointerPointer`
  num-aggregates - `int`
  op-num - `int`
  max-args - `int`
  max-shapes - `int`
  max-int-arrays - `int`
  max-int-array-size - `int`
  max-idx - `int`
  max-reals - `int`
  ptr-to-arguments - `org.bytedeco.javacpp.Pointer`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer extra-pointers ^Integer num-aggregates ^Integer op-num ^Integer max-args ^Integer max-shapes ^Integer max-int-arrays ^Integer max-int-array-size ^Integer max-idx ^Integer max-reals ^org.bytedeco.javacpp.Pointer ptr-to-arguments]
    (-> this (.execAggregateBatchFloat extra-pointers num-aggregates op-num max-args max-shapes max-int-arrays max-int-array-size max-idx max-reals ptr-to-arguments))))

(defn exec-aggregate-double
  "shape-arguments - `org.bytedeco.javacpp.LongPointer`
  num-shape-arguments - `int`
  index-arguments - `org.bytedeco.javacpp.IntPointer`
  num-index-arguments - `int`
  int-arrays - `org.bytedeco.javacpp.IntPointer`
  num-int-arrays - `int`
  real-arguments - `org.bytedeco.javacpp.DoublePointer`
  num-real-arguments - `int`

  returns: `void execAggregateDouble((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum,  org.bytedeco.javacpp.DoublePointer arguments, int numArguments, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer shape-arguments ^Integer num-shape-arguments ^org.bytedeco.javacpp.IntPointer index-arguments ^Integer num-index-arguments ^org.bytedeco.javacpp.IntPointer int-arrays ^Integer num-int-arrays ^org.bytedeco.javacpp.DoublePointer real-arguments ^Integer num-real-arguments]
    (-> this (.execAggregateDouble shape-arguments num-shape-arguments index-arguments num-index-arguments int-arrays num-int-arrays real-arguments num-real-arguments)))
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer int-arrays ^Integer num-int-arrays ^org.bytedeco.javacpp.DoublePointer real-arguments ^Integer num-real-arguments]
    (-> this (.execAggregateDouble int-arrays num-int-arrays real-arguments num-real-arguments))))

(defn encode-threshold-p-1-double
  "n - `long`
  dz - `org.bytedeco.javacpp.IntPointer`
  threshold - `float`

  returns: `void encodeThresholdP1Double((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, org.bytedeco.javacpp.DoublePointer dx, @`"
  ([^Nd4jCuda$NativeOps this ^Long n ^org.bytedeco.javacpp.IntPointer dz ^Float threshold]
    (-> this (.encodeThresholdP1Double n dz threshold))))

(defn accumulate-half
  "length - `long`

  returns: `void accumulateHalf((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extras, (value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer dx, (value="float16*") org.bytedeco.javacpp.ShortPointer dz, int n, @`"
  ([^Nd4jCuda$NativeOps this ^Long length]
    (-> this (.accumulateHalf length))))

(defn exec-aggregate-float
  "shape-arguments - `org.bytedeco.javacpp.LongPointer`
  num-shape-arguments - `int`
  index-arguments - `org.bytedeco.javacpp.IntPointer`
  num-index-arguments - `int`
  int-arrays - `org.bytedeco.javacpp.IntPointer`
  num-int-arrays - `int`
  real-arguments - `org.bytedeco.javacpp.FloatPointer`
  num-real-arguments - `int`

  returns: `void execAggregateFloat((value="Nd4jPointer*") org.bytedeco.javacpp.PointerPointer extraPointers, int opNum,  org.bytedeco.javacpp.FloatPointer arguments, int numArguments, @`"
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.LongPointer shape-arguments ^Integer num-shape-arguments ^org.bytedeco.javacpp.IntPointer index-arguments ^Integer num-index-arguments ^org.bytedeco.javacpp.IntPointer int-arrays ^Integer num-int-arrays ^org.bytedeco.javacpp.FloatPointer real-arguments ^Integer num-real-arguments]
    (-> this (.execAggregateFloat shape-arguments num-shape-arguments index-arguments num-index-arguments int-arrays num-int-arrays real-arguments num-real-arguments)))
  ([^Nd4jCuda$NativeOps this ^org.bytedeco.javacpp.PointerPointer int-arrays ^Integer num-int-arrays ^org.bytedeco.javacpp.FloatPointer real-arguments ^Integer num-real-arguments]
    (-> this (.execAggregateFloat int-arrays num-int-arrays real-arguments num-real-arguments))))

