(ns org.deeplearning4j.util.MovingWindowMatrix
  "Moving window on a matrix (usually used for images)
 Given a: This is a list of flattened arrays:
 1 1 1 1 1 1 2 2
 2 2 2 2 ----> 1 1 2 2
 3 3 3 3 3 3 4 4
 4 4 4 4 3 3 4 4"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.util MovingWindowMatrix]))

(defn ->moving-window-matrix
  "Constructor.

  Same as calling new MovingWindowMatrix(toSlice,windowRowSize,windowColumnSize,false)

  to-slice - `org.nd4j.linalg.api.ndarray.INDArray`
  window-row-size - `int`
  window-column-size - `int`"
  (^MovingWindowMatrix [^org.nd4j.linalg.api.ndarray.INDArray to-slice ^Integer window-row-size ^Integer window-column-size]
    (new MovingWindowMatrix to-slice window-row-size window-column-size))
  (^MovingWindowMatrix [^org.nd4j.linalg.api.ndarray.INDArray to-slice ^Integer window-row-size ^Integer window-column-size ^Boolean add-rotate]
    (new MovingWindowMatrix to-slice window-row-size window-column-size add-rotate)))

(defn windows
  "Moving window, capture a row x column moving window of
  a given matrix

  flattened - whether the arrays should be flattened or not - `boolean`

  returns: the list of moving windows - `java.util.List<org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.List [^MovingWindowMatrix this ^Boolean flattened]
    (-> this (.windows flattened)))
  (^java.util.List [^MovingWindowMatrix this]
    (-> this (.windows))))

