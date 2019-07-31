(ns org.datavec.local.transforms.misc.WritablesToNDArrayFunction
  "Function for converting lists of Writables to a single
 NDArray row vector. Necessary for creating and saving a
 dense matrix representation of raw data."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.misc WritablesToNDArrayFunction]))

(defn ->writables-to-nd-array-function
  "Constructor."
  (^WritablesToNDArrayFunction []
    (new WritablesToNDArrayFunction )))

(defn apply
  "Description copied from interface: Function

  c - Input - `java.util.List`

  returns: Result - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^WritablesToNDArrayFunction this ^java.util.List c]
    (-> this (.apply c))))

