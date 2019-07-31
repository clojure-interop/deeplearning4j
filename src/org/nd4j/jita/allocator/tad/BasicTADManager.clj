(ns org.nd4j.jita.allocator.tad.BasicTADManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.tad BasicTADManager]))

(defn ->basic-tad-manager
  "Constructor."
  (^BasicTADManager []
    (new BasicTADManager )))

(defn get-tad-only-shape-info
  "Description copied from interface: TADManager

  array - Tensor for TAD precalculation - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int[]`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.buffer.DataBuffer,org.nd4j.linalg.api.buffer.DataBuffer>`"
  (^org.nd4j.linalg.primitives.Pair [^BasicTADManager this ^org.nd4j.linalg.api.ndarray.INDArray array dimension]
    (-> this (.getTADOnlyShapeInfo array dimension))))

(defn purge-buffers
  "This method removes all cached shape buffers"
  ([^BasicTADManager this]
    (-> this (.purgeBuffers))))

(defn get-cached-bytes
  "Description copied from interface: TADManager

  returns: `long`"
  (^Long [^BasicTADManager this]
    (-> this (.getCachedBytes))))

