(ns org.datavec.spark.transform.misc.WritablesToNDArrayFunction
  "Function for converting lists of Writables to a single
 NDArray row vector. Necessary for creating and saving a
 dense matrix representation of raw data."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.misc WritablesToNDArrayFunction]))

(defn ->writables-to-nd-array-function
  "Constructor."
  (^WritablesToNDArrayFunction []
    (new WritablesToNDArrayFunction )))

(defn call
  "c - `java.util.List`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WritablesToNDArrayFunction this ^java.util.List c]
    (-> this (.call c))))

