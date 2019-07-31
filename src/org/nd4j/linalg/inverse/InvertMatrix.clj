(ns org.nd4j.linalg.inverse.InvertMatrix
  "Created by agibsoncccc on 11/30/15."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.inverse InvertMatrix]))

(defn ->invert-matrix
  "Constructor."
  (^InvertMatrix []
    (new InvertMatrix )))

(defn *invert
  "Inverts a matrix

  arr - the array to invert - `org.nd4j.linalg.api.ndarray.INDArray`
  in-place - Whether to store the result in arr - `boolean`

  returns: the inverted matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^Boolean in-place]
    (InvertMatrix/invert arr in-place)))

(defn *pinvert
  "Calculates pseudo inverse of a matrix using QR decomposition

  arr - the array to invert - `org.nd4j.linalg.api.ndarray.INDArray`
  in-place - `boolean`

  returns: the pseudo inverted matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^Boolean in-place]
    (InvertMatrix/pinvert arr in-place)))

(defn *p-left-invert
  "Compute the left pseudo inverse. Input matrix must have full column rank.
  See also: Moore–Penrose inverse

  arr - Input matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  in-place - Whether to store the result in arr - `boolean`

  returns: Left pseudo inverse of arr - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.lang.IllegalArgumentException - Input matrix arr did not have full column rank."
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^Boolean in-place]
    (InvertMatrix/pLeftInvert arr in-place)))

(defn *p-right-invert
  "Compute the right pseudo inverse. Input matrix must have full row rank.
  See also: Moore–Penrose inverse

  arr - Input matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  in-place - Whether to store the result in arr - `boolean`

  returns: Right pseudo inverse of arr - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.lang.IllegalArgumentException - Input matrix arr did not have full row rank."
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray arr ^Boolean in-place]
    (InvertMatrix/pRightInvert arr in-place)))

