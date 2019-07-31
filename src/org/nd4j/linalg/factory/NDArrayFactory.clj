(ns org.nd4j.linalg.factory.NDArrayFactory
  "Creation of ndarrays via classpath discovery."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.factory NDArrayFactory]))

(defn to-flattened
  "Returns a flattened ndarray with all of the elements in each ndarray
  regardless of dimension

  length - `int`
  matrices - the ndarrays to use - `java.util.Iterator`

  returns: a flattened ndarray of the elements in the order of titerating over the ndarray and the linear view of
  each - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Integer length ^java.util.Iterator matrices]
    (-> this (.toFlattened length matrices)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^java.util.Collection matrices]
    (-> this (.toFlattened matrices))))

(defn zeros
  "Creates a row vector with the specified number of columns

  rows - the rows of the ndarray - `long`
  columns - the columns of the ndarray - `long`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long rows ^Long columns]
    (-> this (.zeros rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long columns]
    (-> this (.zeros columns))))

(defn ones
  "Creates a row vector with the specified number of columns

  rows - the number of rows in the matrix - `long`
  columns - the columns of the ndarray - `long`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long rows ^Long columns]
    (-> this (.ones rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long columns]
    (-> this (.ones columns))))

(defn set-order
  "Sets the order. Primarily for testing purposes

  order - `char`"
  ([^NDArrayFactory this ^Character order]
    (-> this (.setOrder order))))

(defn create-lapack
  "Create lapack"
  ([^NDArrayFactory this]
    (-> this (.createLapack))))

(defn create-level-2
  "Create level 2"
  ([^NDArrayFactory this]
    (-> this (.createLevel2))))

(defn copy
  "Copy a to b

  a - the origin matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  b - the destination matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.copy a b))))

(defn average
  "This method averages input arrays, and returns averaged array

  target - `org.nd4j.linalg.api.ndarray.INDArray`
  arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray target arrays]
    (-> this (.average target arrays)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this arrays]
    (-> this (.average arrays))))

(defn scalar
  "Create a scalar ndarray with the specified offset

  value - the value to initialize the scalar with - `java.lang.Number`
  offset - the offset of the ndarray - `long`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^java.lang.Number value ^Long offset]
    (-> this (.scalar value offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^java.lang.Number value]
    (-> this (.scalar value))))

(defn lapack
  "returns: `org.nd4j.linalg.api.blas.Lapack`"
  (^org.nd4j.linalg.api.blas.Lapack [^NDArrayFactory this]
    (-> this (.lapack))))

(defn reverse
  "Reverses the passed in matrix such that m[0] becomes m[m.length - 1] etc

  reverse - the matrix to reverse - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the reversed matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray reverse]
    (-> this (.reverse reverse))))

(defn rand
  "Generates a random matrix between min and max

  rows - the number of rows of the matrix - `long`
  columns - the number of columns in the matrix - `long`
  min - the minimum number - `float`
  max - the maximum number - `float`
  rng - the rng to use - `org.nd4j.linalg.api.rng.Random`

  returns: a drandom matrix of the specified shape and range - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long rows ^Long columns ^Float min ^Float max ^org.nd4j.linalg.api.rng.Random rng]
    (-> this (.rand rows columns min max rng)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this shape ^Float min ^Float max ^org.nd4j.linalg.api.rng.Random rng]
    (-> this (.rand shape min max rng)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long rows ^Long columns ^org.nd4j.linalg.api.rng.Random r]
    (-> this (.rand rows columns r)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long rows ^Long columns]
    (-> this (.rand rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this shape]
    (-> this (.rand shape))))

(defn create-from-npy-pointer
  "Create from an in memory numpy pointer

  pointer - the pointer to thenumpy array - `org.bytedeco.javacpp.Pointer`

  returns: an ndarray created from the in memory
  numpy pointer - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.createFromNpyPointer pointer))))

(defn linspace
  "Generate a linearly spaced vector

  lower - upper bound - `int`
  upper - lower bound - `int`
  num - the step size - `int`

  returns: the linearly spaced vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Integer lower ^Integer upper ^Integer num]
    (-> this (.linspace lower upper num))))

(defn special-concat
  "Concatenate ndarrays along a dimension
  PLEASE NOTE: This method is special for GPU backend, it works on HOST side only.

  dimension - the dimension to concatneate along - `int`
  to-concat - the ndarrays to concateneate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the concatneated ndarrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Integer dimension ^org.nd4j.linalg.api.ndarray.INDArray to-concat]
    (-> this (.specialConcat dimension to-concat))))

(defn create-from-npy-file
  "Create from a given numpy file.

  file - the file to create the ndarray from - `java.io.File`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^java.io.File file]
    (-> this (.createFromNpyFile file))))

(defn shuffle
  "In place shuffle of an ndarray
  along a specified set of dimensions

  array - the ndarray to shuffle - `org.nd4j.linalg.api.ndarray.INDArray`
  rnd - `java.util.Random`
  dimension - the dimension to do the shuffle - `int`"
  ([^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray array ^java.util.Random rnd ^Integer dimension]
    (-> this (.shuffle array rnd dimension))))

(defn append-bias
  "vectors - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray vectors]
    (-> this (.appendBias vectors))))

(defn sort
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  descending - `boolean`
  dimensions - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray x ^Boolean descending ^Integer dimensions]
    (-> this (.sort x descending dimensions)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray x ^Boolean descending]
    (-> this (.sort x descending))))

(defn rot
  "Reverses the passed in matrix such that m[0] becomes m[m.length - 1] etc

  reverse - the matrix to reverse - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the reversed matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray reverse]
    (-> this (.rot reverse))))

(defn bilinear-products
  "Returns a column vector where each entry is the nth bilinear
  product of the nth slices of the two tensors.

  curr - `org.nd4j.linalg.api.ndarray.INDArray`
  in - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray curr ^org.nd4j.linalg.api.ndarray.INDArray in]
    (-> this (.bilinearProducts curr in))))

(defn true-scalar
  "value - `java.lang.Number`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^java.lang.Number value]
    (-> this (.trueScalar value))))

(defn sort-coo-indices
  "x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.sortCooIndices x))))

(defn set-d-type
  "Sets the data opType

  dtype - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  ([^NDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$Type dtype]
    (-> this (.setDType dtype))))

(defn tear
  "tensor - `org.nd4j.linalg.api.ndarray.INDArray`
  dimensions - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray tensor ^Integer dimensions]
    (-> this (.tear tensor dimensions))))

(defn pull-rows
  "This method produces concatenated array, that consist from tensors,
  fetched from source array, against some dimension and specified indexes

  source - source tensor - `org.nd4j.linalg.api.ndarray.INDArray`
  source-dimension - dimension of source tensor - `int`
  indexes - indexes from source array - `int[]`
  order - order for result array - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray source ^Integer source-dimension indexes ^Character order]
    (-> this (.pullRows source source-dimension indexes order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray source ^Integer source-dimension indexes]
    (-> this (.pullRows source source-dimension indexes))))

(defn convert-data-ex
  "type-src - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`
  source - `org.bytedeco.javacpp.Pointer`
  type-dst - `org.nd4j.linalg.api.buffer.DataBuffer$TypeEx`
  target - `org.bytedeco.javacpp.Pointer`
  length - `long`"
  ([^NDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-src ^org.bytedeco.javacpp.Pointer source ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-dst ^org.bytedeco.javacpp.Pointer target ^Long length]
    (-> this (.convertDataEx type-src source type-dst target length)))
  ([^NDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-src ^org.nd4j.linalg.api.buffer.DataBuffer source ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-dst ^org.nd4j.linalg.api.buffer.DataBuffer target]
    (-> this (.convertDataEx type-src source type-dst target)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-src ^org.nd4j.linalg.api.ndarray.INDArray source ^org.nd4j.linalg.api.buffer.DataBuffer$TypeEx type-dst]
    (-> this (.convertDataEx type-src source type-dst))))

(defn eye
  "Create the identity ndarray

  n - the number for the identity - `long`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long n]
    (-> this (.eye n))))

(defn level-2
  "Return the level 2 blas operations

  returns: `org.nd4j.linalg.api.blas.Level2`"
  (^org.nd4j.linalg.api.blas.Level2 [^NDArrayFactory this]
    (-> this (.level2))))

(defn concat
  "Concatneate ndarrays along a dimension

  dimension - the dimension to concatneate along - `int`
  to-concat - the ndarrays to concateneate - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the concatneated ndarrays - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Integer dimension ^org.nd4j.linalg.api.ndarray.INDArray to-concat]
    (-> this (.concat dimension to-concat))))

(defn empty
  "type - `org.nd4j.linalg.api.buffer.DataBuffer$Type`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer$Type type]
    (-> this (.empty type))))

(defn true-vector
  "data - `float[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this data]
    (-> this (.trueVector data))))

(defn order
  "Returns the order for this ndarray for internal data storage

  returns: the order (c or f) - `char`"
  (^Character [^NDArrayFactory this]
    (-> this (.order))))

(defn level-3
  "Return the level 3 blas operations

  returns: `org.nd4j.linalg.api.blas.Level3`"
  (^org.nd4j.linalg.api.blas.Level3 [^NDArrayFactory this]
    (-> this (.level3))))

(defn randn
  "Random normal using the given rng

  rows - the number of rows in the matrix - `long`
  columns - the number of columns in the matrix - `long`
  r - the random generator to use - `org.nd4j.linalg.api.rng.Random`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long rows ^Long columns ^org.nd4j.linalg.api.rng.Random r]
    (-> this (.randn rows columns r)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long rows ^Long columns]
    (-> this (.randn rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this shape]
    (-> this (.randn shape))))

(defn accumulate
  "This method sums given arrays to target

  target - `org.nd4j.linalg.api.ndarray.INDArray`
  arrays - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray target ^org.nd4j.linalg.api.ndarray.INDArray arrays]
    (-> this (.accumulate target arrays))))

(defn convert-to-numpy
  "Convert an INDArray
  to a numpy array.
  This will usually be used
  for writing out to an external source.
  Note that this will create a zero copy reference
  to this ndarray's underlying data.

  array - the array to convert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.bytedeco.javacpp.Pointer`"
  (^org.bytedeco.javacpp.Pointer [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray array]
    (-> this (.convertToNumpy array))))

(defn arange
  "Array of evenly spaced values.
  Returns a row vector

  begin - the begin of the range - `double`
  end - the end of the range - `double`

  returns: the range vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Double begin ^Double end]
    (-> this (.arange begin end))))

(defn vstack
  "Concatenates two matrices vertically. Matrices must have identical
  numbers of columns.

  arrs - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray arrs]
    (-> this (.vstack arrs))))

(defn create
  "Creates an ndarray with the specified shape

  data - the data to use with the ndarray - `org.nd4j.linalg.api.buffer.DataBuffer`
  rows - the rows of the ndarray - `long`
  columns - the columns of the ndarray - `long`
  stride - the stride for the ndarray - `int[]`
  offset - the offset of the ndarray - `long`

  returns: the instance - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer data ^Long rows ^Long columns stride ^Long offset]
    (-> this (.create data rows columns stride offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this data shape stride ^Long offset]
    (-> this (.create data shape stride offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this shape stride ^Long offset]
    (-> this (.create shape stride offset)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this shape ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (-> this (.create shape buffer)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this data]
    (-> this (.create data)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this data ^Long rows ^Long columns stride ^Long offset ^Character ordering]
    (-> this (.create data rows columns stride offset ordering))))

(defn create-uninitialized-detached
  "Cretes uninitialized INDArray detached from any (if any) workspace

  shape - `int[]`
  ordering - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this shape ^Character ordering]
    (-> this (.createUninitializedDetached shape ordering))))

(defn create-uninitialized
  "shape - `int[]`
  ordering - `char`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this shape ^Character ordering]
    (-> this (.createUninitialized shape ordering))))

(defn create-level-1
  "Create level 1"
  ([^NDArrayFactory this]
    (-> this (.createLevel1))))

(defn create-level-3
  "Create level 3"
  ([^NDArrayFactory this]
    (-> this (.createLevel3))))

(defn rot-90
  "Rotate a matrix 90 degrees

  to-rotate - the matrix to rotate - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray to-rotate]
    (-> this (.rot90 to-rotate))))

(defn value-array-of
  "Creates a row vector with the specified number of columns

  rows - the number of rows in the matrix - `long`
  columns - the columns of the ndarray - `long`
  value - the value to assign - `double`

  returns: the created ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^Long rows ^Long columns ^Double value]
    (-> this (.valueArrayOf rows columns value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this shape ^Double value]
    (-> this (.valueArrayOf shape value))))

(defn create-sparse-csr
  "data - `double[]`
  columns - `int[]`
  pointer-b - `int[]`
  pointer-e - `int[]`
  shape - `long[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this data columns pointer-b pointer-e shape]
    (-> this (.createSparseCSR data columns pointer-b pointer-e shape))))

(defn dtype
  "Returns the data opType for this ndarray

  returns: the data opType for this ndarray - `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^NDArrayFactory this]
    (-> this (.dtype))))

(defn level-1
  "Return the level 1 blas operations

  returns: `org.nd4j.linalg.api.blas.Level1`"
  (^org.nd4j.linalg.api.blas.Level1 [^NDArrayFactory this]
    (-> this (.level1))))

(defn hstack
  "Concatenates two matrices horizontally. Matrices must have identical
  numbers of rows.

  arrs - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.ndarray.INDArray arrs]
    (-> this (.hstack arrs))))

(defn create-blas
  "Create blas"
  ([^NDArrayFactory this]
    (-> this (.createBlas))))

(defn blas
  "Return extra blas operations

  returns: `org.nd4j.linalg.api.blas.Blas`"
  (^org.nd4j.linalg.api.blas.Blas [^NDArrayFactory this]
    (-> this (.blas))))

(defn create-sparse-coo
  "values - `org.nd4j.linalg.api.buffer.DataBuffer`
  indices - `org.nd4j.linalg.api.buffer.DataBuffer`
  sparse-offsets - `long[]`
  flags - `int[]`
  hidden-dimensions - `int[]`
  underlying-rank - `int`
  shape - `long[]`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices sparse-offsets flags hidden-dimensions ^Integer underlying-rank shape]
    (-> this (.createSparseCOO values indices sparse-offsets flags hidden-dimensions underlying-rank shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices ^org.nd4j.linalg.api.buffer.DataBuffer sparse-information shape]
    (-> this (.createSparseCOO values indices sparse-information shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this values indices shape]
    (-> this (.createSparseCOO values indices shape))))

(defn create-from-npy-header-pointer
  "Create from an in memory numpy header.
  Use this when not interopping
  directly from python.

  pointer - the pointer to thenumpy header - `org.bytedeco.javacpp.Pointer`

  returns: an ndarray created from the in memory
  numpy pointer - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayFactory this ^org.bytedeco.javacpp.Pointer pointer]
    (-> this (.createFromNpyHeaderPointer pointer))))

