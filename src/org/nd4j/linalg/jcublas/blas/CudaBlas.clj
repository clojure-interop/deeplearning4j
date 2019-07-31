(ns org.nd4j.linalg.jcublas.blas.CudaBlas
  "Implementation of Nd4jBlas for cuBLAS"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.blas CudaBlas]))

(defn ->cuda-blas
  "Constructor."
  (^CudaBlas []
    (new CudaBlas )))

(defn set-max-threads
  "num - `int`"
  ([^CudaBlas this ^Integer num]
    (-> this (.setMaxThreads num))))

(defn get-max-threads
  "returns: `int`"
  (^Integer [^CudaBlas this]
    (-> this (.getMaxThreads))))

(defn get-blas-vendor-id
  "Returns the BLAS library vendor id
  1 - CUBLAS

  returns: the BLAS library vendor id - `int`"
  (^Integer [^CudaBlas this]
    (-> this (.getBlasVendorId))))

