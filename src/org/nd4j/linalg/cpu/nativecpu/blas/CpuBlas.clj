(ns org.nd4j.linalg.cpu.nativecpu.blas.CpuBlas
  "Implementation of Nd4jBlas with OpenBLAS/MKL"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu.blas CpuBlas]))

(defn ->cpu-blas
  "Constructor."
  (^CpuBlas []
    (new CpuBlas )))

(defn set-max-threads
  "num - `int`"
  ([^CpuBlas this ^Integer num]
    (-> this (.setMaxThreads num))))

(defn get-max-threads
  "returns: `int`"
  (^Integer [^CpuBlas this]
    (-> this (.getMaxThreads))))

(defn get-blas-vendor-id
  "Description copied from interface: Blas

  returns: the BLAS library vendor id - `int`"
  (^Integer [^CpuBlas this]
    (-> this (.getBlasVendorId))))

