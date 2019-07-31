(ns org.nd4j.linalg.api.ndarray.BaseNDArray
  "NDArray: (think numpy)

 A few things of note.

 An NDArray can have any number of dimensions.

 An NDArray is accessed via strides.

 Strides are how to index over
 a contiguous block of data.

 This block of data has 2 orders(as of right now):
 fortran and c"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray BaseNDArray]))

(defn ->base-nd-array
  "Constructor.

  Construct an ndarray of the specified shape.

  shape - the shape of the ndarray - `int[]`
  stride - the stride of the ndarray - `int[]`
  offset - the desired offset - `long`
  ordering - the ordering of the ndarray - `char`
  initialize - Whether to initialize the INDArray. If true: initialize. If false: don't. - `boolean`"
  (^BaseNDArray [shape stride ^Long offset ^Character ordering ^Boolean initialize]
    (new BaseNDArray shape stride offset ordering initialize))
  (^BaseNDArray [shape stride ^Long offset ^Character ordering]
    (new BaseNDArray shape stride offset ordering))
  (^BaseNDArray [data shape ^Character ordering]
    (new BaseNDArray data shape ordering))
  (^BaseNDArray [shape ^org.nd4j.linalg.api.buffer.DataBuffer buffer]
    (new BaseNDArray shape buffer))
  (^BaseNDArray [data]
    (new BaseNDArray data))
  (^BaseNDArray []
    (new BaseNDArray )))

(defn put-slice
  "Assigns the given matrix (put) to the specified slice

  slice - the slice to assign - `int`
  put - the slice to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this for chainability - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer slice ^org.nd4j.linalg.api.ndarray.INDArray put]
    (-> this (.putSlice slice put))))

(defn secondary-stride
  "Deprecated.

  returns: the secondary stride for an ndarray - `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.secondaryStride))))

(defn mean-number
  "Description copied from interface: INDArray

  returns: the mean along the specified dimension of this ndarray - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.meanNumber))))

(defn get-vector-coordinates
  "Description copied from interface: INDArray

  returns: a DataBuffer of indexes - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseNDArray this]
    (-> this (.getVectorCoordinates))))

(defn get-leading-ones
  "Description copied from interface: INDArray

  returns: Number of leading ones in shape - `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.getLeadingOnes))))

(defn amean-number
  "Description copied from interface: INDArray

  returns: the mean along the specified dimension of this ndarray - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.ameanNumber))))

(defn set-data
  "data - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^BaseNDArray this ^org.nd4j.linalg.api.buffer.DataBuffer data]
    (-> this (.setData data))))

(defn prod-number
  "Description copied from interface: INDArray

  returns: Product of all values in the array - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.prodNumber))))

(defn nnz
  "Description copied from interface: INDArray

  returns: nnz - `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.nnz))))

(defn rsub-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rsubColumnVector column-vector))))

(defn min
  "Returns the overall min of this ndarray

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.min dimension))))

(defn vector-or-scalar?
  "Description copied from interface: INDArray

  returns: whether this ndarray is a vector or scalar - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isVectorOrScalar))))

(defn div-column-vector
  "In place addition of a column vector

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.divColumnVector column-vector))))

(defn leverage
  "This method detaches INDArray from current Workspace, and attaches it to Workspace above, if any.

  PLEASE NOTE: If this INDArray instance is NOT attached - it will be returned unmodified.
  PLEASE NOTE: If current Workspace is the top-tier one, effect will be equal to detach() call - detached copy will be returned

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.leverage))))

(defn cleanup
  "Deprecated."
  ([^BaseNDArray this]
    (-> this (.cleanup))))

(defn var-number
  "Description copied from interface: INDArray

  returns: variance - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.varNumber))))

(defn get-double-unsafe
  "Description copied from interface: INDArray

  offset - the offset to get at - `long`

  returns: this - `double`"
  (^Double [^BaseNDArray this ^Long offset]
    (-> this (.getDoubleUnsafe offset))))

(defn rdivi
  "Description copied from interface: INDArray

  n - the number to divide by by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rdivi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.rdivi other))))

(defn assign
  "Assign all of the elements in the given
  ndarray to this ndarray

  arr - the elements to assign - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.assign arr))))

(defn shannon-entropy-number
  "Returns non-normalized Shannon entropy value for this INDArray

  returns: `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.shannonEntropyNumber))))

(defn min-number
  "Description copied from interface: INDArray

  returns: Minimum value in the array - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.minNumber))))

(defn compressed?
  "Returns true if this array is compressed, and false otherwise

  returns: `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isCompressed))))

(defn log-entropy-number
  "Returns log entropy value for this INDArray

  returns: `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.logEntropyNumber))))

(defn std
  "Description copied from interface: INDArray

  bias-corrected - `boolean`
  dimension - `int`

  returns: the standard deviation along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Boolean bias-corrected ^Integer dimension]
    (-> this (.std bias-corrected dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.std dimension))))

(defn to-flat-array
  "Description copied from interface: INDArray

  builder - the builder to use - `com.google.flatbuffers.FlatBufferBuilder`

  returns: the offset to add - `int`"
  (^Integer [^BaseNDArray this ^com.google.flatbuffers.FlatBufferBuilder builder]
    (-> this (.toFlatArray builder))))

(defn lt
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Less\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.lt other))))

(defn neq
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Not equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.neq other))))

(defn set-order
  "Description copied from interface: INDArray

  order - the ordering to set - `char`"
  ([^BaseNDArray this ^Character order]
    (-> this (.setOrder order))))

(defn reset-linear-view
  "Deprecated."
  ([^BaseNDArray this]
    (-> this (.resetLinearView))))

(defn addi-row-vector
  "In place addition of a column vector

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.addiRowVector row-vector))))

(defn index
  "Deprecated.

  row - the row to getScalar the linear index for - `long`
  column - the column to getScalar the linear index for - `long`

  returns: the linear index of the given row and column - `long`"
  (^Long [^BaseNDArray this ^Long row ^Long column]
    (-> this (.index row column))))

(defn fmodi
  "Description copied from interface: INDArray

  denominator - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.fmodi denominator))))

(defn sub
  "copy subtraction of two matrices

  other - the second ndarray to subtract - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.sub other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.sub other))))

(defn offset
  "Description copied from interface: INDArray

  returns: the starting offset - `long`"
  (^Long [^BaseNDArray this]
    (-> this (.offset))))

(defn sub-column-vector
  "In place addition of a column vector

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.subColumnVector column-vector))))

(defn set-stride
  "Description copied from interface: INDArray

  stride - `long[]`"
  ([^BaseNDArray this stride]
    (-> this (.setStride stride))))

(defn migrate
  "This method pulls this INDArray into current Workspace, or optionally detaches if no workspace is present.
  That is:
  If current workspace is present/active, INDArray is migrated to it.
  If no current workspace is present/active, one of two things occur:
  1. If detachOnNoWs arg is true: if there is no current workspace, INDArray is detached
  2. If detachOnNoWs arg is false: this INDArray is returned as-is (no-op) - equivalent to migrate()

  detach-on-no-ws - If true: detach on no WS. If false and no workspace: return this. - `boolean`

  returns: Migrated INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Boolean detach-on-no-ws]
    (-> this (.migrate detach-on-no-ws)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.migrate))))

(defn columns
  "Number of columns (shape[1]), throws an exception when
  called when not 2d

  returns: the number of columns in the array (only 2d) - `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.columns))))

(defn permutei
  "An in-place version of permute. The array shape information (shape, strides)
  is modified by this operation (but not the data itself)
  See: http://www.mathworks.com/help/matlab/ref/permute.html

  rearrange - the dimensions to swap to - `int`

  returns: the current array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer rearrange]
    (-> this (.permutei rearrange))))

(defn put-scalar
  "Description copied from interface: INDArray

  dim-0 - Dimension 0 index - `long`
  dim-1 - Dimension 1 index - `long`
  dim-2 - Dimension 2 index - `long`
  dim-3 - Dimension 3 index - `long`
  value - Value to put - `double`

  returns: This INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long dim-0 ^Long dim-1 ^Long dim-2 ^Long dim-3 ^Double value]
    (-> this (.putScalar dim-0 dim-1 dim-2 dim-3 value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long dim-0 ^Long dim-1 ^Long dim-2 ^Double value]
    (-> this (.putScalar dim-0 dim-1 dim-2 value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long row ^Long col ^Double value]
    (-> this (.putScalar row col value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long i ^Double value]
    (-> this (.putScalar i value))))

(defn row-vector?
  "Checks whether the matrix is a row vector.

  returns: true if the number of rows is 1 - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isRowVector))))

(defn tensor-along-dimension
  "Description copied from interface: INDArray

  index - the index of the vector to getScalar - `int`
  dimension - the dimension to getScalar the vector from - `int`

  returns: the vector along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer index ^Integer dimension]
    (-> this (.tensorAlongDimension index dimension))))

(defn shape
  "Returns the shape(dimensions) of this array

  returns: the shape of this matrix - `long[]`"
  ([^BaseNDArray this]
    (-> this (.shape))))

(defn get-column
  "Get the specified column

  c - `long`

  returns: the specified column - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long c]
    (-> this (.getColumn c))))

(defn vectors-along-dimension
  "Returns the number of possible vectors for a given dimension

  dimension - the dimension to calculate the number of vectors for - `int`

  returns: the number of possible vectors along a dimension - `long`"
  (^Long [^BaseNDArray this ^Integer dimension]
    (-> this (.vectorsAlongDimension dimension))))

(defn attached?
  "This method returns True, if this INDArray instance is attached to some Workspace. False otherwise.

  returns: `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isAttached))))

(defn put
  "Inserts the element at the specified index

  i - the row insert into - `int`
  j - the column to insert into - `int`
  element - a scalar ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: a scalar ndarray of the element at this index - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer i ^Integer j ^org.nd4j.linalg.api.ndarray.INDArray element]
    (-> this (.put i j element)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this indices ^org.nd4j.linalg.api.ndarray.INDArray element]
    (-> this (.put indices element))))

(defn eq
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.eq other))))

(defn cleaned-up?
  "Deprecated.

  returns: `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isCleanedUp))))

(defn put-where-with-mask
  "Description copied from interface: INDArray

  mask - the mask to use - `org.nd4j.linalg.api.ndarray.INDArray`
  put - the array to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the resulting array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray mask ^org.nd4j.linalg.api.ndarray.INDArray put]
    (-> this (.putWhereWithMask mask put))))

(defn rsubi
  "Description copied from interface: INDArray

  n - the number to subtract by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rsubi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.rsubi other))))

(defn dim-shuffle
  "Description copied from interface: INDArray

  rearrange - the dimensions to swap to - `java.lang.Object[]`
  new-order - the new order (think permute) - `int[]`
  broad-castable - (whether the dimension is broadcastable) (must be same length as new order) - `boolean[]`

  returns: the newly permuted array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this rearrange new-order broad-castable]
    (-> this (.dimShuffle rearrange new-order broad-castable))))

(defn mean
  "Description copied from interface: INDArray

  result - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray result ^Integer dimension]
    (-> this (.mean result dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.mean dimension))))

(defn normmax-number
  "Description copied from interface: INDArray

  returns: Max norm for the entire array - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.normmaxNumber))))

(defn distance-1
  "Returns the (1-norm) distance.

  other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.distance1 other))))

(defn var
  "Returns the overall variance of this ndarray

  bias-corrected - boolean on whether to apply corrected bias - `boolean`
  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Boolean bias-corrected ^Integer dimension]
    (-> this (.var bias-corrected dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.var dimension))))

(defn prod
  "Returns the product along a given dimension

  dimension - the dimension to getScalar the product along - `int`

  returns: the product along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.prod dimension))))

(defn sum
  "Description copied from interface: INDArray

  result - result of this operation will be stored here - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - the dimension to getScalar the sum along - `int`

  returns: the sum along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray result ^Integer dimension]
    (-> this (.sum result dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.sum dimension))))

(defn set-shape
  "Description copied from interface: INDArray

  shape - `long[]`"
  ([^BaseNDArray this shape]
    (-> this (.setShape shape))))

(defn square?
  "Description copied from interface: INDArray

  returns: true if the matrix has the same rows and columns
  false otherwise - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isSquare))))

(defn column-vector?
  "Checks whether the matrix is a column vector.

  returns: true if the number of columns is 1 - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isColumnVector))))

(defn length-long
  "Deprecated.

  returns: the number of elements in the ndarray - `long`"
  (^Long [^BaseNDArray this]
    (-> this (.lengthLong))))

(defn eqi
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.eqi other))))

(defn muli-row-vector
  "In place addition of a column vector

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.muliRowVector row-vector))))

(defn repeat
  "Description copied from interface: INDArray

  dimension - the dimension to repeat - `int`
  repeats - the number of elements to repeat on each element - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension ^Integer repeats]
    (-> this (.repeat dimension repeats))))

(defn slices
  "Number of slices: aka shape[0]

  returns: the number of slices
  for this nd array - `long`"
  (^Long [^BaseNDArray this]
    (-> this (.slices))))

(defn mmuli
  "Perform an in place matrix multiplication

  other - the other matrix to perform matrix multiply with - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  transpose - `org.nd4j.linalg.api.blas.params.MMulTranspose`

  returns: the result of the matrix multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.blas.params.MMulTranspose transpose]
    (-> this (.mmuli other result transpose)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.blas.params.MMulTranspose transpose]
    (-> this (.mmuli other transpose)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.mmuli other))))

(defn get-columns
  "Get whole columns
  from the passed indices.

  cindices - `int`

  returns: Array with only the specified columns - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer cindices]
    (-> this (.getColumns cindices))))

(defn put-column
  "Insert a column in to this array
  Will throw an exception if this
  ndarray is not a matrix

  column - the column to insert - `int`
  to-put - the array to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer column ^org.nd4j.linalg.api.ndarray.INDArray to-put]
    (-> this (.putColumn column to-put))))

(defn gtei
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.gtei other))))

(defn puti-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.putiColumnVector column-vector))))

(defn detach
  "This metod detaches INDArray from Workspace, returning copy. Basically it's dup() into new memory chunk.

  PLEASE NOTE: If this INDArray instance is NOT attached - it will be returned unmodified.

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.detach))))

(defn max
  "Returns the overall max of this ndarray

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.max dimension))))

(defn muli
  "Description copied from interface: INDArray

  n - the number to divide by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.muli n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.muli other))))

(defn rdivi-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rdiviRowVector row-vector))))

(defn mmul
  "Perform a copy matrix multiplication

  other - the other matrix to perform matrix multiply with - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  m-mul-transpose - the transpose status of each array - `org.nd4j.linalg.api.blas.params.MMulTranspose`

  returns: the result of the matrix multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.blas.params.MMulTranspose m-mul-transpose]
    (-> this (.mmul other result m-mul-transpose)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.blas.params.MMulTranspose m-mul-transpose]
    (-> this (.mmul other m-mul-transpose)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.mmul other))))

(defn sub-row-vector
  "In place addition of a column vector

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.subRowVector row-vector))))

(defn shape-info
  "Description copied from interface: INDArray

  returns: `java.nio.LongBuffer`"
  (^java.nio.LongBuffer [^BaseNDArray this]
    (-> this (.shapeInfo))))

(defn repmat
  "Replicate and tile array to fill out to the given shape
  See:
  https://github.com/numpy/numpy/blob/master/numpy/matlib.py#L310-L358

  shape - the new shape of this ndarray - `int[]`

  returns: the shape to fill out to - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this shape]
    (-> this (.repmat shape))))

(defn assign-if
  "Assign all elements from given ndarray that are matching given condition,
  ndarray to this ndarray

  arr - the elements to assign - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.assignIf arr condition))))

(defn epsi
  "Returns an ndarray with 1 if the element is epsilon equals

  other - the number to compare - `java.lang.Number`

  returns: a ndarray with the given
  binary conditions - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.epsi other))))

(defn permute
  "See: http://www.mathworks.com/help/matlab/ref/permute.html

  rearrange - the dimensions to swap to - `int`

  returns: the newly permuted array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer rearrange]
    (-> this (.permute rearrange))))

(defn rsub-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rsubRowVector row-vector))))

(defn flags
  "returns: `int[]`"
  ([^BaseNDArray this]
    (-> this (.flags))))

(defn to-string
  "Generate string representation of the matrix.
  Printing will switch to scientific notation on a per element basis
  - when abs value is greater than or equal to 10000
  - when abs value is less than or equal to 0.0001 and not zero
  If the number of elements in the array is greater than 1000 (by default) only the first and last three elements
  in a dimension are included. This can be changed globally using NDArrayStrings#setMaxPrintElements(long)

  returns: `java.lang.String`"
  (^java.lang.String [^BaseNDArray this]
    (-> this (.toString))))

(defn addi-column-vector
  "In place addition of a column vector

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.addiColumnVector column-vector))))

(defn eps
  "Returns an ndarray with 1 if the element is epsilon equals

  other - the number to compare - `java.lang.Number`

  returns: a copied ndarray with the given
  binary conditions - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.eps other))))

(defn put-row
  "Insert a row in to this array
  Will throw an exception if this
  ndarray is not a matrix

  row - the row insert into - `long`
  to-put - the row to insert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long row ^org.nd4j.linalg.api.ndarray.INDArray to-put]
    (-> this (.putRow row to-put))))

(defn rank
  "Description copied from interface: INDArray

  returns: the rank for the ndarray. - `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.rank))))

(defn underlying-rank
  "returns: `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.underlyingRank))))

(defn vector?
  "Checks whether the matrix is a vector.

  returns: whether this ndarray is a vector - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isVector))))

(defn subi-column-vector
  "In place addition of a column vector

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.subiColumnVector column-vector))))

(defn fmod
  "Description copied from interface: INDArray

  denominator - the - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.fmod denominator result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.fmod denominator))))

(defn rsubi-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rsubiRowVector row-vector))))

(defn linear-view
  "Deprecated. Linear views are not always possible. Use reshape(array.length()) or reshape(1,array.length())

  returns: the linear view of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.linearView))))

(defn gt
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Greater\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.gt other))))

(defn ordering
  "Description copied from interface: INDArray

  returns: the ordering of this ndarray - `char`"
  (^Character [^BaseNDArray this]
    (-> this (.ordering))))

(defn iterator
  "returns: `java.util.Iterator<java.lang.Object>`"
  (^java.util.Iterator [^BaseNDArray this]
    (-> this (.iterator))))

(defn add-row-vector
  "In place addition of a column vector

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.addRowVector row-vector))))

(defn gte
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: binary ndarray for \"Greter or equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.gte other))))

(defn java-tensor-along-dimension
  "Get the vector along a particular dimension

  index - the index of the vector to getScalar - `int`
  dimension - the dimension to getScalar the vector from - `int`

  returns: the vector along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer index ^Integer dimension]
    (-> this (.javaTensorAlongDimension index dimension))))

(defn reshape
  "Description copied from interface: INDArray

  order - `char`
  rows - `int`
  columns - `int`

  returns: the reshaped ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Character order ^Integer rows ^Integer columns]
    (-> this (.reshape order rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Character order ^Long new-shape]
    (-> this (.reshape order new-shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this shape]
    (-> this (.reshape shape))))

(defn element
  "Returns a scalar (individual element)
  of a scalar ndarray

  returns: the individual item in this ndarray - `java.lang.Object`"
  (^java.lang.Object [^BaseNDArray this]
    (-> this (.element))))

(defn cumsumi
  "Cumulative sum along a dimension

  dimension - the dimension to perform cumulative sum along - `int`

  returns: the cumulative sum along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.cumsumi dimension))))

(defn distance-2
  "Returns the (euclidean) distance.

  other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.distance2 other))))

(defn divi-row-vector
  "In place addition of a column vector

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.diviRowVector row-vector))))

(defn to-int-matrix
  "Description copied from interface: INDArray

  returns: a copy of this array as a 2d int array - `int[][]`"
  ([^BaseNDArray this]
    (-> this (.toIntMatrix))))

(defn norm-1
  "Returns the norm1 along the specified dimension

  dimension - the dimension to getScalar the norm1 along - `int`

  returns: the norm1 along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.norm1 dimension))))

(defn percentile
  "Description copied from interface: INDArray

  quantile - target percentile in range of 0..100 - `java.lang.Number`
  dimension - Dimension to calculate percentile for - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number quantile ^Integer dimension]
    (-> this (.percentile quantile dimension))))

(defn scan
  "Description copied from interface: INDArray

  condition - Condition to calculate matches for - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: Number of elements matching condition - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.scan condition))))

(defn cond
  "Description copied from interface: INDArray

  condition - Condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: Copy of this array with values 0 (condition does not apply), or one (condition applies) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.cond condition))))

(defn mark-as-compressed
  "This method marks INDArray instance as compressed
  PLEASE NOTE: Do not use this method unless you 100% have to

  really-compressed - `boolean`"
  ([^BaseNDArray this ^Boolean really-compressed]
    (-> this (.markAsCompressed really-compressed))))

(defn rsubi-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rsubiColumnVector column-vector))))

(defn broadcast
  "Description copied from interface: INDArray

  result - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the broadcasted ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.broadcast result))))

(defn to-float-matrix
  "Description copied from interface: INDArray

  returns: a copy of this array as a 2d float array - `float[][]`"
  ([^BaseNDArray this]
    (-> this (.toFloatMatrix))))

(defn remainder
  "Description copied from interface: INDArray

  denominator - the denominator - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result array to put this in - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.remainder denominator result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.remainder denominator))))

(defn wrap-around?
  "Deprecated.

  returns: true if this ndarray wraps around on linear
  indexing, false otherwise - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isWrapAround))))

(defn set-wrap-around
  "Deprecated.

  wrap-around - thewrap around - `boolean`"
  ([^BaseNDArray this ^Boolean wrap-around]
    (-> this (.setWrapAround wrap-around))))

(defn in-scope?
  "This method checks, if given attached INDArray is still in scope of its parent Workspace

  PLEASE NOTE: if this INDArray isn't attached to any Workspace, this method will return true

  returns: `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isInScope))))

(defn get-int
  "Returns the elements at the the specified indices

  indices - the indices to getScalar - `int`

  returns: the array with the specified elements - `int`"
  (^Integer [^BaseNDArray this ^Integer indices]
    (-> this (.getInt indices))))

(defn sparse-offsets
  "returns: `int[]`"
  ([^BaseNDArray this]
    (-> this (.sparseOffsets))))

(defn mul-column-vector
  "In place addition of a column vector

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.mulColumnVector column-vector))))

(defn shape-info-java
  "Description copied from interface: INDArray

  returns: `long[]`"
  ([^BaseNDArray this]
    (-> this (.shapeInfoJava))))

(defn sparse?
  "Description copied from interface: INDArray

  returns: `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isSparse))))

(defn hidden-dimensions
  "returns: `int[]`"
  ([^BaseNDArray this]
    (-> this (.hiddenDimensions))))

(defn neg
  "Negate each element.

  returns: Array copy with all values negated - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.neg))))

(defn divi
  "Description copied from interface: INDArray

  n - the number to divide by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.divi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.divi other))))

(defn puti-row-vector
  "Description copied from interface: INDArray

  row-vector - Row vector to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: This array, after assigning every road to the specified value - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.putiRowVector row-vector))))

(defn shape-info-data-buffer
  "Description copied from interface: INDArray

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseNDArray this]
    (-> this (.shapeInfoDataBuffer))))

(defn entropy
  "Returns entropy along dimension

  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.entropy dimension))))

(defn neqi
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.neqi other))))

(defn ltei
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.ltei other))))

(defn to-long-matrix
  "Description copied from interface: INDArray

  returns: a copy of this array as a 2d int array - `long[][]`"
  ([^BaseNDArray this]
    (-> this (.toLongMatrix))))

(defn element-wise-stride
  "Description copied from interface: INDArray

  returns: `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.elementWiseStride))))

(defn ravel
  "Flattens the array for linear indexing

  ordering - `char`

  returns: the flattened version of this array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Character ordering]
    (-> this (.ravel ordering)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.ravel))))

(defn replace-where
  "Replaces all elements in this ndarray that are matching give condition, with corresponding elements from given array

  arr - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.replaceWhere arr condition))))

(defn put-where
  "Description copied from interface: INDArray

  comp - the comparison array - `org.nd4j.linalg.api.ndarray.INDArray`
  put - the elements to put - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - the condition for masking on - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray comp ^org.nd4j.linalg.api.ndarray.INDArray put ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.putWhere comp put condition))))

(defn to-long-vector
  "returns: `long[]`"
  ([^BaseNDArray this]
    (-> this (.toLongVector))))

(defn shape-info-to-string
  "Returns the shape information debugging
  information

  returns: the shape information debugging information - `java.lang.String`"
  (^java.lang.String [^BaseNDArray this]
    (-> this (.shapeInfoToString))))

(defn leverage-or-detach
  "This method detaches INDArray from current Workspace, and attaches it to Workspace with a given Id, if a workspace
  with the given ID is open and active.
  If the workspace does not exist, or is not active, the array is detached from any workspaces.

  id - ID of the workspace to leverage to - `java.lang.String`

  returns: The INDArray, leveraged to the specified workspace (if it exists and is active) otherwise the detached array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.String id]
    (-> this (.leverageOrDetach id))))

(defn median-number
  "Description copied from interface: INDArray

  returns: Median value for array - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.medianNumber))))

(defn to-double-vector
  "Description copied from interface: INDArray

  returns: a copy of this array as a 1d double array - `double[]`"
  ([^BaseNDArray this]
    (-> this (.toDoubleVector))))

(defn amin-number
  "Description copied from interface: INDArray

  returns: Absolute min value - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.aminNumber))))

(defn equal-shapes
  "Description copied from interface: INDArray

  other - Other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: True if shap - `boolean`"
  (^Boolean [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.equalShapes other))))

(defn norm-1-number
  "Description copied from interface: INDArray

  returns: Norm 1 for the array - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.norm1Number))))

(defn length
  "Returns the total number of elements in the ndarray

  returns: the number of elements in the ndarray - `long`"
  (^Long [^BaseNDArray this]
    (-> this (.length))))

(defn subi-row-vector
  "In place addition of a column vector

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.subiRowVector row-vector))))

(defn norm-2
  "Returns the norm2 along the specified dimension

  dimension - the dimension to getScalar the norm2 along - `int`

  returns: the norm2 along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.norm2 dimension))))

(defn negi
  "Negate each element (in-place).

  returns: This array with all values negated - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.negi))))

(defn percentile-number
  "Description copied from interface: INDArray

  quantile - target percentile in range of 0..100 - `java.lang.Number`

  returns: `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this ^java.lang.Number quantile]
    (-> this (.percentileNumber quantile))))

(defn scalar?
  "Test whether a matrix is scalar.

  returns: whether this ndarray is a scalar - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isScalar))))

(defn sum-number
  "Description copied from interface: INDArray

  returns: Sum of array - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.sumNumber))))

(defn equals-with-eps
  "This method allows you to compare INDArray against other INDArray, with variable eps

  o - `java.lang.Object`
  eps - `double`

  returns: `boolean`"
  (^Boolean [^BaseNDArray this ^java.lang.Object o ^Double eps]
    (-> this (.equalsWithEps o eps))))

(defn get-row
  "Get a copy of a row.

  r - the row to get - `long`

  returns: the specified row - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long r]
    (-> this (.getRow r))))

(defn get-rows
  "Get whole rows from the passed indices.

  rindices - `int[]`

  returns: Array with only the specified rows - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this rindices]
    (-> this (.getRows rindices))))

(defn get-where
  "Description copied from interface: INDArray

  comp - the comparison array - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - the condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: the array fulfilling the criteria - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray comp ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.getWhere comp condition))))

(defn valid?
  "Deprecated.

  returns: true if the ndarray is valid
  false otherwise - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isValid))))

(defn get-format
  "Description copied from interface: INDArray

  returns: format - `org.nd4j.linalg.api.ndarray.SparseFormat`"
  (^org.nd4j.linalg.api.ndarray.SparseFormat [^BaseNDArray this]
    (-> this (.getFormat))))

(defn shannon-entropy
  "Returns non-normalized Shannon entropy along dimension

  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.shannonEntropy dimension))))

(defn set-shape-and-stride
  "Description copied from interface: INDArray

  shape - `int[]`
  stride - `int[]`"
  ([^BaseNDArray this shape stride]
    (-> this (.setShapeAndStride shape stride))))

(defn mul-row-vector
  "In place addition of a column vector

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.mulRowVector row-vector))))

(defn mul
  "copy (element wise) multiplication of two matrices

  other - the second ndarray to multiply - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.mul other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.mul other))))

(defn divi-column-vector
  "In place addition of a column vector

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.diviColumnVector column-vector))))

(defn rsub
  "Description copied from interface: INDArray

  n - the number to subtract by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rsub n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.rsub other))))

(defn data-type
  "Description copied from interface: INDArray

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^BaseNDArray this]
    (-> this (.dataType))))

(defn tensorss-along-dimension
  "Description copied from interface: INDArray

  dimension - the dimension to calculate the number of vectors for - `int`

  returns: the number of possible vectors along a dimension - `long`"
  (^Long [^BaseNDArray this ^Integer dimension]
    (-> this (.tensorssAlongDimension dimension))))

(defn max-number
  "Description copied from interface: INDArray

  returns: maximum value - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.maxNumber))))

(defn addi
  "Description copied from interface: INDArray

  n - the number to add - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.addi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.addi other))))

(defn matrix?
  "Returns true if this ndarray is 2d
  or 3d with a singleton element

  returns: true if the element is a matrix, false otherwise - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isMatrix))))

(defn div
  "copy (element wise) division of two matrices

  other - the second ndarray to divide - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the divide - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.div other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.div other))))

(defn row-vector-or-scalar?
  "Description copied from interface: INDArray

  returns: true if the number of rows is 1 - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isRowVectorOrScalar))))

(defn rdiv-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rdivRowVector row-vector))))

(defn entropy-number
  "Returns entropy value for this INDArray

  returns: `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.entropyNumber))))

(defn to-int-vector
  "Description copied from interface: INDArray

  returns: a copy of this array as a 1d int array - `int[]`"
  ([^BaseNDArray this]
    (-> this (.toIntVector))))

(defn to-double-matrix
  "Description copied from interface: INDArray

  returns: a copy of this array as a 2d double array - `double[][]`"
  ([^BaseNDArray this]
    (-> this (.toDoubleMatrix))))

(defn to-dense
  "Description copied from interface: INDArray

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.toDense))))

(defn swap-axes
  "Mainly here for people coming from numpy.
  This is equivalent to a call to permute

  dimension - the dimension to swap - `int`
  with - the one to swap it with - `int`

  returns: the swapped axes view - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension ^Integer with]
    (-> this (.swapAxes dimension with))))

(defn match
  "Description copied from interface: INDArray

  comp - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray comp ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.match comp condition))))

(defn linear-view-column-order
  "Deprecated.

  returns: the linear view of this ndarray
  * @deprecated Linear views are not always possible. Use reshape(array.length()) or reshape(1,array.length()) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.linearViewColumnOrder))))

(defn arg-max
  "This method returns index of highest value along specified dimension(s)

  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.argMax dimension))))

(defn to-float-vector
  "Description copied from interface: INDArray

  returns: a copy of this array as a 1d float array - `float[]`"
  ([^BaseNDArray this]
    (-> this (.toFloatVector))))

(defn inner-most-stride
  "Description copied from interface: INDArray

  returns: `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.innerMostStride))))

(defn check-dimensions
  "Description copied from interface: INDArray

  other - the other ndarray to compare - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.checkDimensions other))))

(defn rdivi-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rdiviColumnVector column-vector))))

(defn slice
  "Returns the slice of this from the specified dimension

  slice - the dimension to return from - `long`
  dimension - the dimension of the slice to return - `int`

  returns: the slice of this matrix from the specified dimension
  and dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long slice ^Integer dimension]
    (-> this (.slice slice dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long slice]
    (-> this (.slice slice))))

(defn vector-along-dimension
  "Get the vector along a particular dimension

  index - the index of the vector to get - `int`
  dimension - the dimension to get the vector from - `int`

  returns: the vector along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer index ^Integer dimension]
    (-> this (.vectorAlongDimension index dimension))))

(defn leverage-to
  "This method detaches INDArray from current Workspace, and attaches it to Workspace with a given Id.
  If enforceExistence == true, and no workspace with the specified ID exists, then an Nd4jNoSuchWorkspaceException
  is thrown. Otherwise, if enforceExistance == false and no workspace with the specified ID exists, then the current
  INDArray is returned unmodified (same as leverage()

  id - ID of the workspace to leverage to - `java.lang.String`
  enforce-existence - If true, and the specified workspace does not exist: an Nd4jNoSuchWorkspaceExceptionwill be thrown. - `boolean`

  returns: The INDArray, leveraged to the specified workspace - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: org.nd4j.linalg.exception.Nd4jNoSuchWorkspaceException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.String id ^Boolean enforce-existence]
    (-> this (.leverageTo id enforce-existence)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.String id]
    (-> this (.leverageTo id))))

(defn lte
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Less or equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.lte other))))

(defn div-row-vector
  "In place addition of a column vector

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.divRowVector row-vector))))

(defn transposei
  "Return transposed version of this matrix.
  PLEASE NOTE: This method is NOT in place, it will return transposed copy instead.

  returns: the flipped rows and columns of a matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.transposei))))

(defn add
  "copy addition of two matrices

  other - the second ndarray to add - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.add other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.add other))))

(defn get-scalar
  "Returns the element at the specified row/column
  This will throw an exception if the

  row - the row of the element to return - `long`
  column - the row of the element to return - `long`

  returns: a scalar indarray of the element at this index - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long row ^Long column]
    (-> this (.getScalar row column)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long i]
    (-> this (.getScalar i))))

(defn remainderi
  "Description copied from interface: INDArray

  denominator - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.remainderi denominator))))

(defn squared-distance
  "Returns the square of the Euclidean distance.

  other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.squaredDistance other))))

(defn amax
  "Description copied from interface: INDArray

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.amax dimension))))

(defn put-scalar-unsafe
  "Description copied from interface: INDArray

  offset - the offset to insert at - `long`
  value - the value to insert - `double`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Long offset ^Double value]
    (-> this (.putScalarUnsafe offset value))))

(defn original-offset
  "Returns the start of where the ndarray is for the original data buffer

  returns: `long`"
  (^Long [^BaseNDArray this]
    (-> this (.originalOffset))))

(defn empty?
  "This method returns true if this INDArray is special case: no-value INDArray

  returns: `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isEmpty))))

(defn size
  "Returns the size of this array
  along a particular dimension

  dimension - the dimension to return from - `int`

  returns: the shape of the specified dimension - `long`"
  (^Long [^BaseNDArray this ^Integer dimension]
    (-> this (.size dimension))))

(defn rows
  "Returns the number of rows
  in the array (only 2d) throws an exception when
  called when not 2d

  returns: the number of rows in the matrix - `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.rows))))

(defn convert-to-doubles
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.convertToDoubles))))

(defn view?
  "Description copied from interface: INDArray

  returns: `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isView))))

(defn add-column-vector
  "In place addition of a column vector

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.addColumnVector column-vector))))

(defn amin
  "Description copied from interface: INDArray

  dimension - `int`

  returns: Minimum absolute value - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.amin dimension))))

(defn std-number
  "Description copied from interface: INDArray

  bias-corrected - If true: bias corrected standard deviation. False: not bias corrected - `boolean`

  returns: Standard dev - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this ^Boolean bias-corrected]
    (-> this (.stdNumber bias-corrected)))
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.stdNumber))))

(defn element-stride
  "Description copied from interface: INDArray

  returns: `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.elementStride))))

(defn amean
  "Description copied from interface: INDArray

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.amean dimension))))

(defn dup
  "Description copied from interface: INDArray

  order - order of the NDArray. 'f' or 'c' - `char`

  returns: copy of ndarray with specified order - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Character order]
    (-> this (.dup order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.dup))))

(defn get-float
  "Description copied from interface: INDArray

  i - the row to getScalar - `long`
  j - the column to getScalar - `long`

  returns: the item at row i column j - `float`"
  (^Float [^BaseNDArray this ^Long i ^Long j]
    (-> this (.getFloat i j)))
  (^Float [^BaseNDArray this ^Integer indices]
    (-> this (.getFloat indices))))

(defn cumsum
  "Cumulative sum along a dimension (in place)

  dimension - the dimension to perform cumulative sum along - `int`

  returns: the cumulative sum along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.cumsum dimension))))

(defn rdiv
  "Description copied from interface: INDArray

  n - the number to divide by - `java.lang.Number`
  result - Array to place the result in. Must match shape of this array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Result array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rdiv n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.rdiv other))))

(defn convert-to-halfs
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.convertToHalfs))))

(defn sub-array
  "Description copied from interface: INDArray

  resolution - the resolution to use - `org.nd4j.linalg.indexing.ShapeOffsetResolution`

  returns: the sub array based on the calculations from the resolution - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.indexing.ShapeOffsetResolution resolution]
    (-> this (.subArray resolution)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this offsets shape stride]
    (-> this (.subArray offsets shape stride))))

(defn get-double
  "Description copied from interface: INDArray

  i - Dimension 0 (row) index - `long`
  j - Dimension 1 (column) index - `long`

  returns: `double`"
  (^Double [^BaseNDArray this ^Long i ^Long j]
    (-> this (.getDouble i j)))
  (^Double [^BaseNDArray this ^Integer indices]
    (-> this (.getDouble indices))))

(defn column-vector-or-scalar?
  "Description copied from interface: INDArray

  returns: true if the number of columns is 1 - `boolean`"
  (^Boolean [^BaseNDArray this]
    (-> this (.isColumnVectorOrScalar))))

(defn get-trailing-ones
  "Description copied from interface: INDArray

  returns: Number of trailing ones in shape - `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.getTrailingOnes))))

(defn gti
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.gti other))))

(defn data
  "Description copied from interface: INDArray

  returns: the linear double array representation of this ndarray - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseNDArray this]
    (-> this (.data))))

(defn get
  "Description copied from interface: INDArray

  indices - an ndaray of the indices to get the elements for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the elements to get the array for - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray indices]
    (-> this (.get indices))))

(defn muli-column-vector
  "In place addition of a column vector

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.muliColumnVector column-vector))))

(defn subi
  "Description copied from interface: INDArray

  n - the number to subtract by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.subi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.subi other))))

(defn sparse-info-data-buffer
  "Description copied from interface: INDArray

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseNDArray this]
    (-> this (.sparseInfoDataBuffer))))

(defn equals
  "Compare two matrices. Returns true if and only if other is also a
  DoubleMatrix which has the same size and the maximal absolute
  difference in matrix elements is smaller than 1e-5.

  o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseNDArray this ^java.lang.Object o]
    (-> this (.equals o))))

(defn convert-to-floats
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.convertToFloats))))

(defn rdiv-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rdivColumnVector column-vector))))

(defn transpose
  "Return transposed copy of this matrix.

  returns: the flipped rows and columns of a matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this]
    (-> this (.transpose))))

(defn amax-number
  "Description copied from interface: INDArray

  returns: Max absolute value - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.amaxNumber))))

(defn normmax
  "Returns the normmax along the specified dimension

  dimension - the dimension to getScalar the norm1 along - `int`

  returns: the norm1 along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.normmax dimension))))

(defn slice-vectors
  "Flattens the array for linear indexing

  list - `java.util.List`"
  ([^BaseNDArray this ^java.util.List list]
    (-> this (.sliceVectors list))))

(defn major-stride
  "Deprecated.

  returns: the major stride for an ndarray - `int`"
  (^Integer [^BaseNDArray this]
    (-> this (.majorStride))))

(defn lti
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^java.lang.Number other]
    (-> this (.lti other))))

(defn stride
  "Description copied from interface: INDArray

  dimension - the dimension to get the stride for - `int`

  returns: the stride for a particular dimension - `int`"
  (^Integer [^BaseNDArray this ^Integer dimension]
    (-> this (.stride dimension)))
  ([^BaseNDArray this]
    (-> this (.stride))))

(defn log-entropy
  "Returns log entropy along dimension

  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.logEntropy dimension))))

(defn linear-index
  "Deprecated.

  i - the index to getScalar - `long`

  returns: the linear index in to the data - `long`"
  (^Long [^BaseNDArray this ^Long i]
    (-> this (.linearIndex i))))

(defn condi
  "Description copied from interface: INDArray

  condition - Condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: This array, modified with values 0 (condition does not apply), or one (condition applies) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.condi condition))))

(defn norm-2-number
  "Description copied from interface: INDArray

  returns: L2 norm for the array - `java.lang.Number`"
  (^java.lang.Number [^BaseNDArray this]
    (-> this (.norm2Number))))

(defn median
  "Description copied from interface: INDArray

  dimension - `int`

  returns: Median along specified dimensions - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseNDArray this ^Integer dimension]
    (-> this (.median dimension))))

