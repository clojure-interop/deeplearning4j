(ns org.nd4j.linalg.jcublas.SparseBlasWrapper
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas SparseBlasWrapper]))

(defn ->sparse-blas-wrapper
  "Constructor."
  (^SparseBlasWrapper []
    (new SparseBlasWrapper )))

