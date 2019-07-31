(ns org.nd4j.linalg.cpu.nativecpu.CpuTADManager
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu CpuTADManager]))

(defn ->cpu-tad-manager
  "Constructor."
  (^CpuTADManager []
    (new CpuTADManager )))

(defn init
  "native-ops - `org.nd4j.nativeblas.NativeOps`
  constant-handler - `org.nd4j.linalg.cache.ConstantHandler`"
  ([^CpuTADManager this ^org.nd4j.nativeblas.NativeOps native-ops ^org.nd4j.linalg.cache.ConstantHandler constant-handler]
    (-> this (.init native-ops constant-handler))))

(defn purge-buffers
  "This method removes all cached shape buffers"
  ([^CpuTADManager this]
    (-> this (.purgeBuffers))))

(defn get-tad-only-shape-info
  "Description copied from interface: TADManager

  array - Tensor for TAD precalculation - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int[]`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.buffer.DataBuffer,org.nd4j.linalg.api.buffer.DataBuffer>`"
  (^org.nd4j.linalg.primitives.Pair [^CpuTADManager this ^org.nd4j.linalg.api.ndarray.INDArray array dimension]
    (-> this (.getTADOnlyShapeInfo array dimension))))

(defn get-cached-bytes
  "Description copied from interface: TADManager

  returns: `long`"
  (^Long [^CpuTADManager this]
    (-> this (.getCachedBytes))))

