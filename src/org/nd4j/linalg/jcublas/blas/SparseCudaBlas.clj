(ns org.nd4j.linalg.jcublas.blas.SparseCudaBlas
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.blas SparseCudaBlas]))

(defn ->sparse-cuda-blas
  "Constructor."
  (^SparseCudaBlas []
    (new SparseCudaBlas )))

(defn set-max-threads
  "num - `int`"
  ([^SparseCudaBlas this ^Integer num]
    (-> this (.setMaxThreads num))))

(defn get-max-threads
  "returns: `int`"
  (^Integer [^SparseCudaBlas this]
    (-> this (.getMaxThreads))))

(defn get-blas-vendor-id
  "Description copied from interface: Blas

  returns: the BLAS library vendor id - `int`"
  (^Integer [^SparseCudaBlas this]
    (-> this (.getBlasVendorId))))

