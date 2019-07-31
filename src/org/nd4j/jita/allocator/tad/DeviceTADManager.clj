(ns org.nd4j.jita.allocator.tad.DeviceTADManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.tad DeviceTADManager]))

(defn ->device-tad-manager
  "Constructor."
  (^DeviceTADManager []
    (new DeviceTADManager )))

(defn purge-buffers
  "This method removes all cached shape buffers"
  ([^DeviceTADManager this]
    (-> this (.purgeBuffers))))

(defn get-tad-only-shape-info
  "Description copied from interface: TADManager

  array - Tensor for TAD precalculation - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int[]`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.buffer.DataBuffer,org.nd4j.linalg.api.buffer.DataBuffer>`"
  (^org.nd4j.linalg.primitives.Pair [^DeviceTADManager this ^org.nd4j.linalg.api.ndarray.INDArray array dimension]
    (-> this (.getTADOnlyShapeInfo array dimension))))

