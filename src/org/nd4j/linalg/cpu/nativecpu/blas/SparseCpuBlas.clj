(ns org.nd4j.linalg.cpu.nativecpu.blas.SparseCpuBlas
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu.blas SparseCpuBlas]))

(defn ->sparse-cpu-blas
  "Constructor."
  (^SparseCpuBlas []
    (new SparseCpuBlas )))

(defn set-max-threads
  "num - `int`"
  ([^SparseCpuBlas this ^Integer num]
    (-> this (.setMaxThreads num))))

(defn get-max-threads
  "returns: `int`"
  (^Integer [^SparseCpuBlas this]
    (-> this (.getMaxThreads))))

(defn get-blas-vendor-id
  "Description copied from interface: Blas

  returns: the BLAS library vendor id - `int`"
  (^Integer [^SparseCpuBlas this]
    (-> this (.getBlasVendorId))))

