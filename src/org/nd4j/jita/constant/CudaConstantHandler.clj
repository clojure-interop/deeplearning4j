(ns org.nd4j.jita.constant.CudaConstantHandler
  "ConstantHandler implementation for CUDA backend."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.constant CudaConstantHandler]))

(defn ->cuda-constant-handler
  "Constructor."
  (^CudaConstantHandler []
    (new CudaConstantHandler )))

(defn move-to-constant-space
  "Description copied from interface: ConstantHandler

  data-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `long`"
  (^Long [^CudaConstantHandler this ^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (-> this (.moveToConstantSpace data-buffer))))

(defn get-constant-buffer
  "Description copied from interface: ConstantHandler

  array - `int[]`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaConstantHandler this array]
    (-> this (.getConstantBuffer array))))

(defn relocate-constant-space
  "Description copied from interface: ConstantHandler

  data-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^CudaConstantHandler this ^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (-> this (.relocateConstantSpace data-buffer))))

(defn purge-constants
  "This method removes all cached constants"
  ([^CudaConstantHandler this]
    (-> this (.purgeConstants))))

(defn get-cached-bytes
  "Description copied from interface: ConstantHandler

  returns: `long`"
  (^Long [^CudaConstantHandler this]
    (-> this (.getCachedBytes))))

