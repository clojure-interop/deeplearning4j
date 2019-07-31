(ns org.nd4j.linalg.jcublas.buffer.JCudaBuffer
  "A Jcuda buffer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.buffer JCudaBuffer]))

(defn get-host-buffer
  "Deprecated.

  returns: `java.nio.Buffer`"
  (^java.nio.Buffer [^JCudaBuffer this]
    (-> this (.getHostBuffer))))

(defn get-host-pointer
  "Deprecated.

  returns: the pointer for this buffer - `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^JCudaBuffer this]
    (-> this (.getHostPointer)))
  (^org.bytedeco.javacpp.Pointer [^JCudaBuffer this ^Long offset]
    (-> this (.getHostPointer offset))))

