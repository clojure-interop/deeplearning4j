(ns org.nd4j.jita.constant.ProtectedCudaConstantHandler
  "Created by raver on 08.06.2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.constant ProtectedCudaConstantHandler]))

(defn *get-instance
  "returns: `org.nd4j.jita.constant.ProtectedCudaConstantHandler`"
  (^org.nd4j.jita.constant.ProtectedCudaConstantHandler []
    (ProtectedCudaConstantHandler/getInstance )))

(defn purge-constants
  "This method removes all cached constants"
  ([^ProtectedCudaConstantHandler this]
    (-> this (.purgeConstants))))

(defn move-to-constant-space
  "This method moves specified dataBuffer to CUDA constant memory space.
  PLEASE NOTE: CUDA constant memory is limited to 48KB per device.

  data-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `long`"
  (^Long [^ProtectedCudaConstantHandler this ^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (-> this (.moveToConstantSpace data-buffer))))

(defn relocate-constant-space
  "PLEASE NOTE: This method implementation is hardware-dependant.
  PLEASE NOTE: This method does NOT allow concurrent use of any array

  data-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^ProtectedCudaConstantHandler this ^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (-> this (.relocateConstantSpace data-buffer))))

(defn get-constant-buffer
  "This method returns DataBuffer with contant equal to input array.
  PLEASE NOTE: This method assumes that you'll never ever change values within result DataBuffer

  array - `int[]`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^ProtectedCudaConstantHandler this array]
    (-> this (.getConstantBuffer array))))

(defn get-cached-bytes
  "Description copied from interface: ConstantHandler

  returns: `long`"
  (^Long [^ProtectedCudaConstantHandler this]
    (-> this (.getCachedBytes))))

