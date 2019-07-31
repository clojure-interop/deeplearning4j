(ns org.nd4j.linalg.api.ndarray.BaseNDArrayProxy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray BaseNDArrayProxy]))

(defn ->base-nd-array-proxy
  "Constructor.

  an-instance - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^BaseNDArrayProxy [^org.nd4j.linalg.api.ndarray.INDArray an-instance]
    (new BaseNDArrayProxy an-instance)))

