(ns org.nd4j.linalg.cpu.nativecpu.BlasWrapper
  "Copy of SimpleBlas to handle offsets implementing
 an interface for library neutral
 jblas operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.cpu.nativecpu BlasWrapper]))

(defn ->blas-wrapper
  "Constructor."
  (^BlasWrapper []
    (new BlasWrapper )))

