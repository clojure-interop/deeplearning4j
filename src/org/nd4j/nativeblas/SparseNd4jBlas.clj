(ns org.nd4j.nativeblas.SparseNd4jBlas
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas SparseNd4jBlas]))

(defn ->sparse-nd-4j-blas
  "Constructor."
  (^SparseNd4jBlas []
    (new SparseNd4jBlas )))

(defn get-blas-vendor
  "Returns the BLAS library vendor

  returns: the BLAS library vendor - `org.nd4j.linalg.api.blas.Blas$Vendor`"
  (^org.nd4j.linalg.api.blas.Blas$Vendor [^SparseNd4jBlas this]
    (-> this (.getBlasVendor))))

