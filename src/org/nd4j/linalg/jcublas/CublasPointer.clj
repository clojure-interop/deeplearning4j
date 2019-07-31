(ns org.nd4j.linalg.jcublas.CublasPointer
  "Wraps the allocation
 and freeing of resources on a cuda device"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas CublasPointer]))

(defn ->cublas-pointer
  "Constructor.

  Creates a CublasPointer
  for a given JCudaBuffer

  buffer - `org.nd4j.linalg.jcublas.buffer.JCudaBuffer`
  context - `org.nd4j.linalg.jcublas.context.CudaContext`"
  (^CublasPointer [^org.nd4j.linalg.jcublas.buffer.JCudaBuffer buffer ^org.nd4j.linalg.jcublas.context.CudaContext context]
    (new CublasPointer buffer context)))

(defn *free
  "pointers - `org.nd4j.linalg.jcublas.CublasPointer`"
  ([^org.nd4j.linalg.jcublas.CublasPointer pointers]
    (CublasPointer/free pointers)))

(defn get-buffer
  "returns: `org.nd4j.linalg.jcublas.buffer.JCudaBuffer`"
  (^org.nd4j.linalg.jcublas.buffer.JCudaBuffer [^CublasPointer this]
    (-> this (.getBuffer))))

(defn get-device-pointer
  "returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^CublasPointer this]
    (-> this (.getDevicePointer))))

(defn result-pointer?
  "Whether this is a result pointer or not
  A result pointer means that this
  pointer should not automatically be freed
  but instead wait for results to accumulate
  so they can be returned from
  the gpu first

  returns: `boolean`"
  (^Boolean [^CublasPointer this]
    (-> this (.isResultPointer))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^CublasPointer this]
    (-> this (.toString))))

(defn get-host-pointer
  "returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^CublasPointer this]
    (-> this (.getHostPointer))))

(defn destroy
  "The actual destroy method"
  ([^CublasPointer this]
    (-> this (.destroy))))

(defn close
  "frees the underlying
  device memory allocated for this pointer

  throws: java.lang.Exception"
  ([^CublasPointer this]
    (-> this (.close))))

(defn set-result-pointer
  "Sets whether this is a result pointer or not
  A result pointer means that this
  pointer should not automatically be freed
  but instead wait for results to accumulate
  so they can be returned from
  the gpu first

  result-pointer - `boolean`"
  ([^CublasPointer this ^Boolean result-pointer]
    (-> this (.setResultPointer result-pointer))))

(defn set-host-pointer
  "host-pointer - `org.bytedeco.javacpp.Pointer`"
  ([^CublasPointer this ^org.bytedeco.javacpp.Pointer host-pointer]
    (-> this (.setHostPointer host-pointer))))

