(ns org.nd4j.linalg.util.NDArrayUtil
  "Created by agibsonccc on 2/26/16."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util NDArrayUtil]))

(defn *to-nd-array
  "nums - `int[][]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [nums]
    (NDArrayUtil/toNDArray nums)))

(defn *to-ints
  "n - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray n]
    (NDArrayUtil/toInts n)))

(defn *to-longs
  "n - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `long[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray n]
    (NDArrayUtil/toLongs n)))

