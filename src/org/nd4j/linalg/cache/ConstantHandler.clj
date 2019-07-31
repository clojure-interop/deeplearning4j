(ns org.nd4j.linalg.cache.ConstantHandler
  "This interface describes
 memory reuse strategy
 for java-originated arrays."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cache ConstantHandler]))

(defn move-to-constant-space
  "If specific hardware supports dedicated constant memory,
  this method forces DataBuffer passed in to be moved
  to that constant memory.
  PLEASE NOTE: This method implementation is hardware-dependant.

  data-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `long`"
  (^Long [^ConstantHandler this ^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (-> this (.moveToConstantSpace data-buffer))))

(defn relocate-constant-space
  "PLEASE NOTE: This method implementation is hardware-dependant.
  PLEASE NOTE: This method does NOT allow concurrent use of any array

  data-buffer - `org.nd4j.linalg.api.buffer.DataBuffer`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^ConstantHandler this ^org.nd4j.linalg.api.buffer.DataBuffer data-buffer]
    (-> this (.relocateConstantSpace data-buffer))))

(defn get-constant-buffer
  "This method returns DataBuffer with
  constant equal to input array.
  PLEASE NOTE: This method assumes that
  you'll never ever change values
  within result DataBuffer

  array - `int[]`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^ConstantHandler this array]
    (-> this (.getConstantBuffer array))))

(defn purge-constants
  "This method removes all cached constants"
  ([^ConstantHandler this]
    (-> this (.purgeConstants))))

(defn get-cached-bytes
  "This method returns memory used for cache, in bytes

  returns: `long`"
  (^Long [^ConstantHandler this]
    (-> this (.getCachedBytes))))

