(ns org.nd4j.linalg.jcublas.blas.JcublasLevel1
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.blas JcublasLevel1]))

(defn ->jcublas-level-1
  "Constructor."
  (^JcublasLevel1 []
    (new JcublasLevel1 )))

(defn supports-data-buffer-l-1-ops
  "Description copied from interface: Level1

  returns: `boolean`"
  (^Boolean [^JcublasLevel1 this]
    (-> this (.supportsDataBufferL1Ops))))

