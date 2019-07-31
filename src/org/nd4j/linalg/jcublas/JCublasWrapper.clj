(ns org.nd4j.linalg.jcublas.JCublasWrapper
  "Blas wrapper for JCUDA"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas JCublasWrapper]))

(defn ->j-cublas-wrapper
  "Constructor."
  (^JCublasWrapper []
    (new JCublasWrapper )))

