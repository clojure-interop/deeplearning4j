(ns org.nd4j.linalg.exception.ND4JArraySizeException
  "This exception is thrown once if INDArray length exceeds Integer.MAX_VALUE"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.exception ND4JArraySizeException]))

(defn ->nd-4-j-array-size-exception
  "Constructor."
  (^ND4JArraySizeException []
    (new ND4JArraySizeException )))

