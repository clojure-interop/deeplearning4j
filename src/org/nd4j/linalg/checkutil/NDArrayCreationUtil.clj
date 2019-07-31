(ns org.nd4j.linalg.checkutil.NDArrayCreationUtil
  "This class contains utility methods for generating NDArrays for use in unit tests
 The idea is to generate arrays with a specific shape, after various operations have been undertaken on them
 So output is after get, reshape, transpose, permute, tensorAlongDimension etc operations have been done
 Most useful methods:
 - getAllTestMatricesWithShape
 - getAll4dTestArraysWithShape
 - getAll4dTestArraysWithShape"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.checkutil NDArrayCreationUtil]))

(defn *get-3d-reshaped-with-shape
  "seed - `int`
  shape - `int[]`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed shape]
    (NDArrayCreationUtil/get3dReshapedWithShape seed shape)))

(defn *get-5d-sub-arrays-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get5dSubArraysWithShape seed shape)))

(defn *get-transposed-matrix-with-shape
  "ordering - `char`
  rows - `int`
  cols - `int`
  seed - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair [^Character ordering ^Integer rows ^Integer cols ^Integer seed]
    (NDArrayCreationUtil/getTransposedMatrixWithShape ordering rows cols seed))
  (^org.nd4j.linalg.primitives.Pair [^Long rows ^Long cols ^Long seed]
    (NDArrayCreationUtil/getTransposedMatrixWithShape rows cols seed)))

(defn *get-3d-sub-arrays-with-shape
  "seed - `int`
  shape - `int[]`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed shape]
    (NDArrayCreationUtil/get3dSubArraysWithShape seed shape)))

(defn *get-5d-reshaped-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get5dReshapedWithShape seed shape)))

(defn *get-all-test-matrices-with-shape
  "Get an array of INDArrays (2d) all with the specified shape. Pair returned to aid
  debugging: String contains information on how to reproduce the matrix (i.e., which function, and arguments)
  Each NDArray in the returned array has been obtained by applying an operation such as transpose, tensorAlongDimension,
  etc to an original array.

  ordering - `char`
  rows - `int`
  cols - `int`
  seed - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Character ordering ^Integer rows ^Integer cols ^Integer seed]
    (NDArrayCreationUtil/getAllTestMatricesWithShape ordering rows cols seed))
  (^java.util.List [^Long rows ^Long cols ^Long seed]
    (NDArrayCreationUtil/getAllTestMatricesWithShape rows cols seed)))

(defn *get-5d-permuted-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get5dPermutedWithShape seed shape)))

(defn *get-6d-permuted-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get6dPermutedWithShape seed shape)))

(defn *get-6d-sub-arrays-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get6dSubArraysWithShape seed shape)))

(defn *get-permuted-with-shape
  "ordering - `char`
  rows - `long`
  cols - `long`
  seed - `long`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair [^Character ordering ^Long rows ^Long cols ^Long seed]
    (NDArrayCreationUtil/getPermutedWithShape ordering rows cols seed))
  (^org.nd4j.linalg.primitives.Pair [^Long rows ^Long cols ^Long seed]
    (NDArrayCreationUtil/getPermutedWithShape rows cols seed)))

(defn *get-all-4d-test-arrays-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/getAll4dTestArraysWithShape seed shape)))

(defn *get-reshaped-with-shape
  "ordering - `char`
  rows - `long`
  cols - `long`
  seed - `long`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>`"
  (^org.nd4j.linalg.primitives.Pair [^Character ordering ^Long rows ^Long cols ^Long seed]
    (NDArrayCreationUtil/getReshapedWithShape ordering rows cols seed))
  (^org.nd4j.linalg.primitives.Pair [^Long rows ^Long cols ^Long seed]
    (NDArrayCreationUtil/getReshapedWithShape rows cols seed)))

(defn *get-3d-permuted-with-shape
  "seed - `int`
  shape - `int[]`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed shape]
    (NDArrayCreationUtil/get3dPermutedWithShape seed shape)))

(defn *get-all-6d-test-arrays-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/getAll6dTestArraysWithShape seed shape)))

(defn *get-5d-tensor-along-dimension-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get5dTensorAlongDimensionWithShape seed shape)))

(defn *get-4d-reshaped-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get4dReshapedWithShape seed shape)))

(defn *get-3d-tensor-along-dimension-with-shape
  "seed - `int`
  shape - `int[]`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed shape]
    (NDArrayCreationUtil/get3dTensorAlongDimensionWithShape seed shape)))

(defn *broadcast-to-shape
  "Generate a random shape to
  broadcast to
  given a randomly generated
  shape with 1s in it as inputs

  input-shape-with-ones - `int[]`
  seed - `long`

  returns: `int[]`"
  ([input-shape-with-ones ^Long seed]
    (NDArrayCreationUtil/broadcastToShape input-shape-with-ones seed)))

(defn *get-random-broad-cast-shape
  "Create an ndarray
  of

  seed - `long`
  rank - `int`
  num-shapes - `int`

  returns: `int[][]`"
  ([^Long seed ^Integer rank ^Integer num-shapes]
    (NDArrayCreationUtil/getRandomBroadCastShape seed rank num-shapes)))

(defn *get-test-matrices-with-varying-shapes
  "Test utility to sweep shapes given a rank
  Given a rank will generate random test matrices that will cover all cases of a shape with a '1' anywhere in the shape
  as well a shape with random ints that are not 0 or 1
  eg. rank 2: 1,1; 1,2; 2,1; 2,2; 3,4
  Motivated by TADs that often hit bugs when a \"1\" occurs as the size of a dimension

  rank - any rank including true scalars i.e rank >= 0 - `int`
  order - what order array to return i.e 'c' or 'f' order arrays - `char`

  returns: List of arrays and the shapes as strings - `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer rank ^Character order]
    (NDArrayCreationUtil/getTestMatricesWithVaryingShapes rank order)))

(defn *get-4d-tensor-along-dimension-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get4dTensorAlongDimensionWithShape seed shape)))

(defn *get-all-3d-test-arrays-with-shape
  "seed - `int`
  shape - `int[]`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed shape]
    (NDArrayCreationUtil/getAll3dTestArraysWithShape seed shape)))

(defn *get-sub-matrices-with-shape
  "ordering - `char`
  rows - `long`
  cols - `long`
  seed - `long`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Character ordering ^Long rows ^Long cols ^Long seed]
    (NDArrayCreationUtil/getSubMatricesWithShape ordering rows cols seed))
  (^java.util.List [^Long rows ^Long cols ^Long seed]
    (NDArrayCreationUtil/getSubMatricesWithShape rows cols seed)))

(defn *get-4d-sub-arrays-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get4dSubArraysWithShape seed shape)))

(defn *get-6d-reshaped-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get6dReshapedWithShape seed shape)))

(defn *get-all-5d-test-arrays-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/getAll5dTestArraysWithShape seed shape)))

(defn *get-tensor-along-dimension-matrices-with-shape
  "ordering - `char`
  rows - `long`
  cols - `long`
  seed - `long`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Character ordering ^Long rows ^Long cols ^Long seed]
    (NDArrayCreationUtil/getTensorAlongDimensionMatricesWithShape ordering rows cols seed))
  (^java.util.List [^Long rows ^Long cols ^Long seed]
    (NDArrayCreationUtil/getTensorAlongDimensionMatricesWithShape rows cols seed)))

(defn *get-4d-permuted-with-shape
  "seed - `int`
  shape - `int`

  returns: `java.util.List<org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,java.lang.String>>`"
  (^java.util.List [^Integer seed ^Integer shape]
    (NDArrayCreationUtil/get4dPermutedWithShape seed shape)))

