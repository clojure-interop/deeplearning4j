(ns org.nd4j.linalg.cpu.nativecpu.cache.ConstantBuffersCache
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu.cache ConstantBuffersCache]))

(defn ->constant-buffers-cache
  "Constructor."
  (^ConstantBuffersCache []
    (new ConstantBuffersCache )))

(defn get-constant-buffer
  "Description copied from interface: ConstantHandler

  array - `int[]`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^ConstantBuffersCache this array]
    (-> this (.getConstantBuffer array))))

(defn purge-constants
  "This method removes all cached constants"
  ([^ConstantBuffersCache this]
    (-> this (.purgeConstants))))

(defn get-cached-bytes
  "Description copied from interface: ConstantHandler

  returns: `long`"
  (^Long [^ConstantBuffersCache this]
    (-> this (.getCachedBytes))))

