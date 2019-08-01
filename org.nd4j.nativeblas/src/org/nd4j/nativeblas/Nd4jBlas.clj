(ns org.nd4j.nativeblas.Nd4jBlas
  "CBlas bindings
 Original credit:
 https://github.com/uncomplicate/neanderthal-atlas"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jBlas]))

(defn ->nd-4j-blas
  "Constructor."
  (^Nd4jBlas []
    (new Nd4jBlas )))

(defn get-blas-vendor
  "Returns the BLAS library vendor

  returns: the BLAS library vendor - `org.nd4j.linalg.api.blas.Blas$Vendor`"
  (^org.nd4j.linalg.api.blas.Blas$Vendor [^Nd4jBlas this]
    (-> this (.getBlasVendor))))

