(ns org.nd4j.linalg.util.NDArrayMath
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util NDArrayMath]))

(defn *matrices-per-slice
  "The number of vectors
  in each slice of an ndarray.

  arr - the array toget the numberof vectors per slice for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the number of vectors per slice - `long`"
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (NDArrayMath/matricesPerSlice arr)))

(defn *tensors-per-slice
  "Computes the tensors per slice
  given a tensor shape and array

  arr - the array to get the tensors per slice for - `org.nd4j.linalg.api.ndarray.INDArray`
  tensor-shape - the desired tensor shape - `int[]`

  returns: the tensors per slice of an ndarray - `long`"
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray arr tensor-shape]
    (NDArrayMath/tensorsPerSlice arr tensor-shape)))

(defn *num-vectors
  "Return the number of vectors for an array
  the number of vectors for an array

  arr - the array to calculate the number of vectors for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the number of vectors for the given array - `long`"
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (NDArrayMath/numVectors arr)))

(defn *slice-offset-for-tensor
  "calculates the offset for a tensor

  index - `int`
  arr - `org.nd4j.linalg.api.ndarray.INDArray`
  tensor-shape - `int[]`

  returns: `long`"
  (^Long [^Integer index ^org.nd4j.linalg.api.ndarray.INDArray arr tensor-shape]
    (NDArrayMath/sliceOffsetForTensor index arr tensor-shape)))

(defn *vectors-per-slice
  "The number of vectors
  in each slice of an ndarray.

  arr - the array toget the numberof vectors per slice for - `org.nd4j.linalg.api.ndarray.INDArray`
  rank - the dimensions to get the number of vectors per slice for - `int`

  returns: the number of vectors per slice - `long`"
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer rank]
    (NDArrayMath/vectorsPerSlice arr rank))
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (NDArrayMath/vectorsPerSlice arr)))

(defn *map-index-onto-vector
  "This maps an index of a vector
  on to a vector in the matrix that can be used
  for indexing in to a tensor

  index - the index to map - `int`
  arr - the array to usefor indexing - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the mapped index - `long`"
  (^Long [^Integer index ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (NDArrayMath/mapIndexOntoVector index arr)))

(defn *offset-for-slice
  "Compute the offset for a given slice

  arr - the array to computethe offset frm - `org.nd4j.linalg.api.ndarray.INDArray`
  slice - the slice to compute the offset for - `int`

  returns: the offset for a given slice - `long`"
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer slice]
    (NDArrayMath/offsetForSlice arr slice)))

(defn *length-per-slice
  "The number of elements in a slice
  along a set of dimensions

  arr - the arrayto calculate the length per slice for - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - the dimensions to do the calculations along - `int`

  returns: the number of elements in a slice along
  arbitrary dimensions - `long`"
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer dimension]
    (NDArrayMath/lengthPerSlice arr dimension))
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (NDArrayMath/lengthPerSlice arr)))

(defn *map-index-onto-tensor
  "This maps an index of a vector
  on to a vector in the matrix that can be used
  for indexing in to a tensor

  index - the index to map - `int`
  arr - the array to usefor indexing - `org.nd4j.linalg.api.ndarray.INDArray`
  rank - the dimensions to compute a slice for - `int`

  returns: the mapped index - `int`"
  (^Integer [^Integer index ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer rank]
    (NDArrayMath/mapIndexOntoTensor index arr rank)))

