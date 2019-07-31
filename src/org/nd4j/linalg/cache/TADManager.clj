(ns org.nd4j.linalg.cache.TADManager
  "This interface describes TAD caching.
 While working with tensors, all operations are happening on some demensions,
 and since training tasks are repetitive, we can pre-calculate TAD shapes and offsets once,
 and reuse them later during whole training process."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cache TADManager]))

(defn get-tad-only-shape-info
  "This method returns TAD shapeInfo and all offsets
  for specified tensor and dimensions.

  array - Tensor for TAD precalculation - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.buffer.DataBuffer,org.nd4j.linalg.api.buffer.DataBuffer>`"
  (^org.nd4j.linalg.primitives.Pair [^TADManager this ^org.nd4j.linalg.api.ndarray.INDArray array ^Integer dimension]
    (-> this (.getTADOnlyShapeInfo array dimension))))

(defn purge-buffers
  "This method removes all cached shape buffers"
  ([^TADManager this]
    (-> this (.purgeBuffers))))

(defn get-cached-bytes
  "This method returns memory used for cache, in bytes

  returns: `long`"
  (^Long [^TADManager this]
    (-> this (.getCachedBytes))))

