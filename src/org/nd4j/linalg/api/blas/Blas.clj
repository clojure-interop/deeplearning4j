(ns org.nd4j.linalg.api.blas.Blas
  "Extra functionality for BLAS"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas Blas]))

(defn set-max-threads
  "num - `int`"
  ([^Blas this ^Integer num]
    (-> this (.setMaxThreads num))))

(defn get-max-threads
  "returns: `int`"
  (^Integer [^Blas this]
    (-> this (.getMaxThreads))))

(defn get-blas-vendor-id
  "Returns the BLAS library vendor id
  0 - UNKNOWN, 1 - CUBLAS, 2 - OPENBLAS, 3 - MKL

  returns: the BLAS library vendor id - `int`"
  (^Integer [^Blas this]
    (-> this (.getBlasVendorId))))

(defn get-blas-vendor
  "Returns the BLAS library vendor

  returns: the BLAS library vendor - `org.nd4j.linalg.api.blas.Blas$Vendor`"
  (^org.nd4j.linalg.api.blas.Blas$Vendor [^Blas this]
    (-> this (.getBlasVendor))))

