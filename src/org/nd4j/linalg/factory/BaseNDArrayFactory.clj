(ns org.nd4j.linalg.factory.BaseNDArrayFactory
  "Base NDArrayFactory class.

 Allows specification or data opType and row (c) or column(fortran) major order"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.factory BaseNDArrayFactory]))

(defn ->base-nd-array-factory
  "Constructor."
  (^BaseNDArrayFactory []
    (new BaseNDArrayFactory )))

(defn to-flattened
  "Description copied from interface: NDArrayFactory

  length - `int`
  matrices - `java.util.Iterator`

  returns: a flattened ndarray of the elements in the order of titerating over the ndarray and the linear view of
  each - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Integer length ^java.util.Iterator matrices]
    (-> this (.toFlattened length matrices)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^java.util.Collection matrices]
    (-> this (.toFlattened matrices))))

(defn zeros
  "Creates a row vector with the specified number of columns

  rows - the rows of the ndarray - `long`
  columns - the columns of the ndarray - `long`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long rows ^Long columns]
    (-> this (.zeros rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long columns]
    (-> this (.zeros columns))))

(defn ones
  "Creates a row vector with the specified number of columns

  rows - the number of rows in the matrix - `long`
  columns - the columns of the ndarray - `long`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long rows ^Long columns]
    (-> this (.ones rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long columns]
    (-> this (.ones columns))))

(defn set-order
  "Sets the order. Primarily for testing purposes

  order - `char`"
  ([^BaseNDArrayFactory this ^Character order]
    (-> this (.setOrder order))))

(defn copy
  "Copy a to b

  a - the origin matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  b - the destination matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.copy a b))))

(defn scalar
  "Create a scalar ndarray with the specified offset

  value - the value to initialize the scalar with - `java.lang.Number`
  offset - the offset of the ndarray - `long`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^java.lang.Number value ^Long offset]
    (-> this (.scalar value offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^java.lang.Number value]
    (-> this (.scalar value))))

(defn lapack
  "returns: `org.nd4j.linalg.api.blas.Lapack`"
  (^org.nd4j.linalg.api.blas.Lapack [^BaseNDArrayFactory this]
    (-> this (.lapack))))

(defn reverse
  "Reverses the passed in matrix such that m[0] becomes m[m.length - 1] etc

  reverse - the matrix to reverse - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the reversed matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray reverse]
    (-> this (.reverse reverse))))

(defn rand
  "Generates a random matrix between min and max

  rows - the number of rows of the matrix - `long`
  columns - the number of columns in the matrix - `long`
  min - the minimum number - `float`
  max - the maximum number - `float`
  rng - the rng to use - `org.nd4j.linalg.api.rng.Random`

  returns: a random matrix of the specified shape and range - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long rows ^Long columns ^Float min ^Float max ^org.nd4j.linalg.api.rng.Random rng]
    (-> this (.rand rows columns min max rng)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this shape ^Float min ^Float max ^org.nd4j.linalg.api.rng.Random rng]
    (-> this (.rand shape min max rng)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long rows ^Long columns ^org.nd4j.linalg.api.rng.Random r]
    (-> this (.rand rows columns r)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long rows ^Long columns]
    (-> this (.rand rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this shape]
    (-> this (.rand shape))))

(defn linspace
  "Generate a linearly spaced vector

  lower - upper bound - `int`
  upper - lower bound - `int`
  num - the step size - `int`

  returns: the linearly spaced vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Integer lower ^Integer upper ^Integer num]
    (-> this (.linspace lower upper num))))

(defn append-bias
  "Merge the vectors and append a bias.
  Each vector must be either row or column vectors.
  An exception is thrown for inconsistency (mixed row and column vectors)

  vectors - the vectors to merge - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the merged ndarray appended with the bias - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray vectors]
    (-> this (.appendBias vectors))))

(defn rot
  "Reverses the passed in matrix such that m[0] becomes m[m.length - 1] etc

  reverse - the matrix to reverse - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the reversed matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray reverse]
    (-> this (.rot reverse))))

(defn bilinear-products
  "Returns a column vector where each entry is the nth bilinear
  product of the nth slices of the two tensors.

  curr - `org.nd4j.linalg.api.ndarray.INDArray`
  in - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray curr ^org.nd4j.linalg.api.ndarray.INDArray in]
    (-> this (.bilinearProducts curr in))))

(defn true-scalar
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^java.lang.Number value]
    (-> this (.trueScalar value))))

(defn set-d-type
  "Sets the data opType

  dtype - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  ([^BaseNDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$Type dtype]
    (-> this (.setDType dtype))))

(defn pull-rows
  "This method produces concatenated array, that consist from tensors, fetched from source array, against some dimension and specified indexes

  source - source tensor - `org.nd4j.linalg.api.ndarray.INDArray`
  source-dimension - dimension of source tensor - `int`
  indexes - indexes from source array - `int[]`
  order - order for result array - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray source ^Integer source-dimension indexes ^Character order]
    (-> this (.pullRows source source-dimension indexes order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray source ^Integer source-dimension indexes]
    (-> this (.pullRows source source-dimension indexes))))

(defn eye
  "Create the identity ndarray

  n - the number for the identity - `long`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long n]
    (-> this (.eye n))))

(defn level-2
  "Description copied from interface: NDArrayFactory

  returns: `org.nd4j.linalg.api.blas.Level2`"
  (^org.nd4j.linalg.api.blas.Level2 [^BaseNDArrayFactory this]
    (-> this (.level2))))

(defn concat
  "concatenate ndarrays along a dimension

  dimension - the dimension to concatenate along - `int`
  to-concat - the ndarrays to concatenate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the concatenate ndarrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Integer dimension ^org.nd4j.linalg.api.ndarray.INDArray to-concat]
    (-> this (.concat dimension to-concat))))

(defn true-vector
  "data - `float[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this data]
    (-> this (.trueVector data))))

(defn order
  "Returns the order for this ndarray for internal data storage

  returns: the order (c or f) - `char`"
  (^Character [^BaseNDArrayFactory this]
    (-> this (.order))))

(defn level-3
  "Description copied from interface: NDArrayFactory

  returns: `org.nd4j.linalg.api.blas.Level3`"
  (^org.nd4j.linalg.api.blas.Level3 [^BaseNDArrayFactory this]
    (-> this (.level3))))

(defn randn
  "Random normal using the given rng

  rows - the number of rows in the matrix - `long`
  columns - the number of columns in the matrix - `long`
  r - the random generator to use - `org.nd4j.linalg.api.rng.Random`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long rows ^Long columns ^org.nd4j.linalg.api.rng.Random r]
    (-> this (.randn rows columns r)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long rows ^Long columns]
    (-> this (.randn rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this shape]
    (-> this (.randn shape))))

(defn arange
  "Array of evenly spaced values.

  begin - the begin of the range - `double`
  end - the end of the range - `double`

  returns: the range vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Double begin ^Double end]
    (-> this (.arange begin end))))

(defn vstack
  "Concatenates two matrices vertically. Matrices must have identical
  numbers of columns.

  arrs - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray arrs]
    (-> this (.vstack arrs))))

(defn create
  "Creates an ndarray with the specified shape

  data - the data to use with the ndarray - `float[]`
  rows - the rows of the ndarray - `long`
  columns - the columns of the ndarray - `long`
  stride - the stride for the ndarray - `int[]`
  offset - the offset of the ndarray - `long`

  returns: the instance - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this data ^Long rows ^Long columns stride ^Long offset]
    (-> this (.create data rows columns stride offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this data shape stride ^Long offset]
    (-> this (.create data shape stride offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this shape stride ^Long offset]
    (-> this (.create shape stride offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this data shape]
    (-> this (.create data shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this data]
    (-> this (.create data))))

(defn rot-90
  "Rotate a matrix 90 degrees

  to-rotate - the matrix to rotate - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray to-rotate]
    (-> this (.rot90 to-rotate))))

(defn value-array-of
  "Creates a row vector with the specified number of columns

  rows - the number of rows in the matrix - `long`
  columns - the columns of the ndarray - `long`
  value - the value to assign - `double`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^Long rows ^Long columns ^Double value]
    (-> this (.valueArrayOf rows columns value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this shape ^Double value]
    (-> this (.valueArrayOf shape value))))

(defn dtype
  "Returns the data opType for this ndarray

  returns: the data opType for this ndarray - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^BaseNDArrayFactory this]
    (-> this (.dtype))))

(defn level-1
  "Description copied from interface: NDArrayFactory

  returns: `org.nd4j.linalg.api.blas.Level1`"
  (^org.nd4j.linalg.api.blas.Level1 [^BaseNDArrayFactory this]
    (-> this (.level1))))

(defn hstack
  "Concatenates two matrices horizontally.
  Matrices must have identical
  numbers of rows.

  arrs - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray arrs]
    (-> this (.hstack arrs))))

(defn blas
  "Description copied from interface: NDArrayFactory

  returns: `org.nd4j.linalg.api.blas.Blas`"
  (^org.nd4j.linalg.api.blas.Blas [^BaseNDArrayFactory this]
    (-> this (.blas))))

