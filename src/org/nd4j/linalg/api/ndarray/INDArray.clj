(ns org.nd4j.linalg.api.ndarray.INDArray
  "Interface for an ndarray"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray INDArray]))

(defn put-slice
  "Assigns the given matrix (put) to the specified slice

  slice - the slice to assign - `int`
  put - the slice to applyTransformToDestination - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this for chainability - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer slice ^org.nd4j.linalg.api.ndarray.INDArray put]
    (-> this (.putSlice slice put))))

(defn secondary-stride
  "Return the second stride for an ndarray.
  Think of this as the stride for the next element in a column.

  returns: the secondary stride for an ndarray - `int`"
  (^Integer [^INDArray this]
    (-> this (.secondaryStride))))

(defn mean-number
  "Returns the overall mean of this ndarray

  returns: the mean along the specified dimension of this ndarray - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.meanNumber))))

(defn get-vector-coordinates
  "Return a array of non-major pointers
  i.e. return the column indexes in case of row-major ndarray

  returns: a DataBuffer of indexes - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^INDArray this]
    (-> this (.getVectorCoordinates))))

(defn get-leading-ones
  "Get the number of leading ones in the array shape. For example, a rank 3 array with shape [1, 10, 1] would
  return value 1 for this method

  returns: Number of leading ones in shape - `int`"
  (^Integer [^INDArray this]
    (-> this (.getLeadingOnes))))

(defn amean-number
  "Returns the absolute overall mean of this ndarray

  returns: the mean along the specified dimension of this ndarray - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.ameanNumber))))

(defn set-data
  "data - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^INDArray this ^org.nd4j.linalg.api.buffer.DataBuffer data]
    (-> this (.setData data))))

(defn prod-number
  "Calculate the product of all values in the array

  returns: Product of all values in the array - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.prodNumber))))

(defn nnz
  "Return the number of non-null element

  returns: nnz - `int`"
  (^Integer [^INDArray this]
    (-> this (.nnz))))

(defn rsub-column-vector
  "Reverse subtraction of a column vector (copy)

  column-vector - the column vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rsubColumnVector column-vector))))

(defn min
  "Returns the overall min of this ndarray

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.min dimension))))

(defn vector-or-scalar?
  "Returns true if this ndarray is a vector or scalar

  returns: whether this ndarray is a vector or scalar - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isVectorOrScalar))))

(defn div-column-vector
  "Division of a column vector (copy)

  column-vector - the column vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.divColumnVector column-vector))))

(defn leverage
  "This method detaches INDArray from current Workspace, and attaches it to Workspace above, if any.
  PLEASE NOTE: If this INDArray instance is
  NOT attached - it will be returned unmodified.
  PLEASE NOTE: If current Workspace is the top-tier one,
  effect will be equal to detach() call - detached copy will be returned

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.leverage))))

(defn cleanup
  "Cleanup resources"
  ([^INDArray this]
    (-> this (.cleanup))))

(defn var-number
  "Returns the overall variance of all values in this INDArray

  returns: variance - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.varNumber))))

(defn get-double-unsafe
  "Get a scalar
  at the given linear offset

  offset - the offset to get at - `long`

  returns: this - `double`"
  (^Double [^INDArray this ^Long offset]
    (-> this (.getDoubleUnsafe offset))))

(defn rdivi
  "Reverse in place division

  n - the number to divide by by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rdivi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.rdivi n))))

(defn assign
  "Assign all of the elements in the given
  ndarray to this ndarray

  arr - the elements to assign - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.assign arr))))

(defn shannon-entropy-number
  "Returns non-normalized Shannon entropy value for this INDArray

  returns: `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.shannonEntropyNumber))))

(defn min-number
  "Returns min value in this INDArray

  returns: Minimum value in the array - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.minNumber))))

(defn compressed?
  "Returns true if this array is compressed, and false otherwise

  returns: `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isCompressed))))

(defn log-entropy-number
  "Returns log entropy value for this INDArray

  returns: `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.logEntropyNumber))))

(defn std
  "Standard deviation of an ndarray along a dimension

  bias-corrected - `boolean`
  dimension - the dimension to getScalar the std along - `int`

  returns: the standard deviation along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Boolean bias-corrected ^Integer dimension]
    (-> this (.std bias-corrected dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.std dimension))))

(defn to-flat-array
  "Add an INDArray
  to flatbuffers builder

  builder - the builder to use - `com.google.flatbuffers.FlatBufferBuilder`

  returns: the offset to add - `int`"
  (^Integer [^INDArray this ^com.google.flatbuffers.FlatBufferBuilder builder]
    (-> this (.toFlatArray builder))))

(defn lt
  "Returns the binary ndarray for \"Less\" comparison.

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Less\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.lt other))))

(defn neq
  "Returns the binary ndarray for \"Not equals\" comparison.

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Not equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.neq other))))

(defn set-order
  "Set the ordering

  order - the ordering to set - `char`"
  ([^INDArray this ^Character order]
    (-> this (.setOrder order))))

(defn reset-linear-view
  "Deprecated."
  ([^INDArray this]
    (-> this (.resetLinearView))))

(defn addi-row-vector
  "In place addition of a row vector

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.addiRowVector row-vector))))

(defn index
  "Return the linear index of the specified row and column

  row - the row to getScalar the linear index for - `long`
  column - the column to getScalar the linear index for - `long`

  returns: the linear index of the given row and column - `long`"
  (^Long [^INDArray this ^Long row ^Long column]
    (-> this (.index row column))))

(defn fmodi
  "In place fmod

  denominator - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.fmodi denominator))))

(defn sub
  "copy subtraction of two NDArrays

  other - the second ndarray to subtract - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.sub other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.sub n))))

(defn offset
  "Returns the start of where the ndarray is
  for the underlying data

  returns: the starting offset - `long`"
  (^Long [^INDArray this]
    (-> this (.offset))))

(defn sub-column-vector
  "Subtraction of a column vector (copy)

  column-vector - the column vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.subColumnVector column-vector))))

(defn set-stride
  "Deprecated.

  stride - `long`"
  ([^INDArray this ^Long stride]
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
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Boolean detach-on-no-ws]
    (-> this (.migrate detach-on-no-ws)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.migrate))))

(defn columns
  "Returns the number of columns in this matrix (throws exception if not 2d)

  returns: the number of columns in this matrix - `int`"
  (^Integer [^INDArray this]
    (-> this (.columns))))

(defn permutei
  "An in-place version of permute. The array shape information (shape, strides)
  is modified by this operation (but not the data itself)
  See: http://www.mathworks.com/help/matlab/ref/permute.html

  rearrange - the dimensions to swap to - `int`

  returns: the current array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer rearrange]
    (-> this (.permutei rearrange))))

(defn put-scalar
  "Insert the value at the specified indices, in a 4d (rank 4) NDArray
  Equivalent to putScalar(int[], double) but avoids int[] creation

  dim-0 - Dimension 0 index - `long`
  dim-1 - Dimension 1 index - `long`
  dim-2 - Dimension 2 index - `long`
  dim-3 - Dimension 3 index - `long`
  value - Value to put - `double`

  returns: This INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long dim-0 ^Long dim-1 ^Long dim-2 ^Long dim-3 ^Double value]
    (-> this (.putScalar dim-0 dim-1 dim-2 dim-3 value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long dim-0 ^Long dim-1 ^Long dim-2 ^Double value]
    (-> this (.putScalar dim-0 dim-1 dim-2 value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long row ^Long col ^Double value]
    (-> this (.putScalar row col value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long i ^Double value]
    (-> this (.putScalar i value))))

(defn row-vector?
  "Returns true if the number of rows is 1

  returns: true if the number of rows is 1 - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isRowVector))))

(defn tensor-along-dimension
  "Get the vector along a particular dimension

  index - the index of the vector to getScalar - `int`
  dimension - the dimension to getScalar the vector from - `int`

  returns: the vector along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer index ^Integer dimension]
    (-> this (.tensorAlongDimension index dimension))))

(defn shape
  "Returns the shape of this ndarray

  returns: the shape of this ndarray - `long[]`"
  ([^INDArray this]
    (-> this (.shape))))

(defn get-column
  "Returns the specified column.
  Throws an exception if its not a matrix

  i - the column to getScalar - `long`

  returns: the specified column - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long i]
    (-> this (.getColumn i))))

(defn vectors-along-dimension
  "Returns the number of possible vectors for a given dimension

  dimension - the dimension to calculate the number of vectors for - `int`

  returns: the number of possible vectors along a dimension - `long`"
  (^Long [^INDArray this ^Integer dimension]
    (-> this (.vectorsAlongDimension dimension))))

(defn attached?
  "This method returns True, if this INDArray instance is attached to some Workspace. False otherwise.

  returns: True if attached to workspace, false otherwise - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isAttached))))

(defn put
  "Inserts the element at the specified index

  i - the row insert into - `int`
  j - the column to insert into - `int`
  element - a scalar ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: a scalar ndarray of the element at this index - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer i ^Integer j ^org.nd4j.linalg.api.ndarray.INDArray element]
    (-> this (.put i j element)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.util.List indices ^org.nd4j.linalg.api.ndarray.INDArray element]
    (-> this (.put indices element))))

(defn eq
  "Returns the binary ndarray for \"Equals\" comparison.

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.eq other))))

(defn cleaned-up?
  "Returns true if the ndarray has already been freed

  returns: `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isCleanedUp))))

(defn put-where-with-mask
  "Use a pre computed mask
  for assigning arrays

  mask - the mask to use - `org.nd4j.linalg.api.ndarray.INDArray`
  put - the array to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the resulting array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray mask ^org.nd4j.linalg.api.ndarray.INDArray put]
    (-> this (.putWhereWithMask mask put))))

(defn rsubi
  "Reverse in place subtraction

  n - the number to subtract by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rsubi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.rsubi n))))

(defn dim-shuffle
  "Dimshuffle: an extension of permute that adds the ability
  to broadcast various dimensions.
  This will only accept integers and xs.

  An x indicates a dimension should be broadcasted rather than permuted.
  Examples originally from the theano docs:
  http://deeplearning.net/software/theano/library/tensor/basic.html
  Returns a view of this tensor with permuted dimensions. Typically the pattern will include the integers 0, 1, ... ndim-1, and any number of ‘x’ characters in dimensions where this tensor should be broadcasted.
  A few examples of patterns and their effect:
  (‘x’) -> make a 0d (scalar) into a 1d vector
  (0, 1) -> identity for 2d vectors
  (1, 0) -> inverts the first and second dimensions
  (‘x’, 0) -> make a row out of a 1d vector (N to 1xN)
  (0, ‘x’) -> make a column out of a 1d vector (N to Nx1)
  (2, 0, 1) -> AxBxC to CxAxB
  (0, ‘x’, 1) -> AxB to Ax1xB
  (1, ‘x’, 0) -> AxB to Bx1xA
  (1,) -> This remove dimensions 0. It must be a broadcastable dimension (1xA to A)

  rearrange - the dimensions to swap to - `java.lang.Object[]`
  new-order - the new order (think permute) - `int[]`
  broad-castable - (whether the dimension is broadcastable) (must be same length as new order) - `boolean[]`

  returns: the newly permuted array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this rearrange new-order broad-castable]
    (-> this (.dimShuffle rearrange new-order broad-castable))))

(defn mean
  "Returns the overall mean of this ndarray

  result - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray result ^Integer dimension]
    (-> this (.mean result dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.mean dimension))))

(defn normmax-number
  "Return the max norm (aka infinity norm, equal to the maximum absolute value) for the entire array

  returns: Max norm for the entire array - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.normmaxNumber))))

(defn distance-1
  "Returns the (1-norm) distance.

  other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.distance1 other))))

(defn var
  "Returns the overall variance of this ndarray

  bias-corrected - boolean on whether to apply corrected bias - `boolean`
  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Boolean bias-corrected ^Integer dimension]
    (-> this (.var bias-corrected dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.var dimension))))

(defn prod
  "Returns the product along a given dimension

  dimension - the dimension to getScalar the product along - `int`

  returns: the product along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.prod dimension))))

(defn sum
  "Returns the sum along the last dimension of this ndarray

  result - result of this operation will be stored here - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - the dimension to getScalar the sum along - `int`

  returns: the sum along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray result ^Integer dimension]
    (-> this (.sum result dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.sum dimension))))

(defn set-shape
  "Deprecated.

  shape - `long`"
  ([^INDArray this ^Long shape]
    (-> this (.setShape shape))))

(defn square?
  "Returns whether the matrix
  has the same rows and columns

  returns: true if the matrix has the same rows and columns
  false otherwise - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isSquare))))

(defn column-vector?
  "Returns true if the number of columns is 1

  returns: true if the number of columns is 1 - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isColumnVector))))

(defn length-long
  "Returns the total number of elements in the ndarray

  returns: the number of elements in the ndarray - `long`"
  (^Long [^INDArray this]
    (-> this (.lengthLong))))

(defn eqi
  "Returns the binary ndarray for \"Equals\" comparison. In-place method.

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.eqi other))))

(defn muli-row-vector
  "In place multiplication of a row vector

  row-vector - the row vector used for multiplication - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.muliRowVector row-vector))))

(defn repeat
  "dimension - `int`
  repeats - `long`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension ^Long repeats]
    (-> this (.repeat dimension repeats))))

(defn slices
  "Returns the number of slices in this ndarray

  returns: the number of slices in this ndarray - `long`"
  (^Long [^INDArray this]
    (-> this (.slices))))

(defn mmuli
  "Perform an inplace matrix multiplication

  other - the other matrix to perform matrix multiply with - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the matrix multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.mmuli other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.mmuli other)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.blas.params.MMulTranspose transpose]
    (-> this (.mmuli other result transpose))))

(defn get-columns
  "Get an INDArray comprised of the specified columns only. Copy operation.

  columns - Columns to extract out of the current array - `int`

  returns: Array with only the specified columns - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer columns]
    (-> this (.getColumns columns))))

(defn put-column
  "Insert a column in to this array
  Will throw an exception if this
  ndarray is not a matrix

  column - the column to insert - `int`
  to-put - the array to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer column ^org.nd4j.linalg.api.ndarray.INDArray to-put]
    (-> this (.putColumn column to-put))))

(defn gtei
  "Returns the binary ndarray for \"Greter or equals\" comparison. In-place method.

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.gtei other))))

(defn puti-column-vector
  "In place assignment of a column vector

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.putiColumnVector column-vector))))

(defn detach
  "This method detaches INDArray from Workspace, returning copy.
  Basically it's dup() into new memory chunk.
  PLEASE NOTE: If this INDArray instance is NOT attached - it will be returned unmodified.

  returns: The attached copy of array, or original if not in workspace - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.detach))))

(defn max
  "Returns the overall max of this ndarray along given dimensions

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.max dimension))))

(defn muli
  "In place multiplication of this ndarray

  n - the number to divide by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.muli n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.muli n))))

(defn rdivi-row-vector
  "In place reverse division of a column vector

  row-vector - the row vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rdiviRowVector row-vector))))

(defn mmul
  "Perform an copy matrix multiplication

  other - the other matrix to perform matrix multiply with - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  m-mul-transpose - the transpose status of each array - `org.nd4j.linalg.api.blas.params.MMulTranspose`

  returns: the result of the matrix multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.blas.params.MMulTranspose m-mul-transpose]
    (-> this (.mmul other result m-mul-transpose)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.mmul other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.mmul other))))

(defn sub-row-vector
  "Subtraction of a row vector (copy)

  row-vector - the row vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.subRowVector row-vector))))

(defn shape-info
  "Shape info

  returns: `java.nio.LongBuffer`"
  (^java.nio.LongBuffer [^INDArray this]
    (-> this (.shapeInfo))))

(defn repmat
  "Replicate and tile array to fill out to the given shape

  shape - the new shape of this ndarray - `int`

  returns: the shape to fill out to - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer shape]
    (-> this (.repmat shape))))

(defn assign-if
  "Assign all elements from given ndarray that are matching given condition,
  ndarray to this ndarray

  arr - the elements to assign - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.assignIf arr condition))))

(defn epsi
  "Returns the binary ndarray for \"Epsilon equals\" comparison. In-place method.

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.epsi other))))

(defn permute
  "See: http://www.mathworks.com/help/matlab/ref/permute.html

  rearrange - the dimensions to swap to - `int`

  returns: the newly permuted array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer rearrange]
    (-> this (.permute rearrange))))

(defn rsub-row-vector
  "Reverse subtraction of a row vector (copy)

  row-vector - the row vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rsubRowVector row-vector))))

(defn flags
  "returns: `int[]`"
  ([^INDArray this]
    (-> this (.flags))))

(defn addi-column-vector
  "In place addition of a column vector

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.addiColumnVector column-vector))))

(defn eps
  "Returns the binary ndarray for \"Epsilon equals\" comparison.

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Epsilon equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.eps other))))

(defn put-row
  "Insert a row in to this array
  Will throw an exception if this
  ndarray is not a matrix

  row - the row insert into - `long`
  to-put - the row to insert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long row ^org.nd4j.linalg.api.ndarray.INDArray to-put]
    (-> this (.putRow row to-put))))

(defn rank
  "Returns the rank of the ndarray (the number of dimensions).

  returns: the rank for the ndarray. - `int`"
  (^Integer [^INDArray this]
    (-> this (.rank))))

(defn underlying-rank
  "returns: `int`"
  (^Integer [^INDArray this]
    (-> this (.underlyingRank))))

(defn vector?
  "Returns true if this ndarray is a vector

  returns: whether this ndarray is a vector - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isVector))))

(defn subi-column-vector
  "In place subtraction of a column vector

  column-vector - the column vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.subiColumnVector column-vector))))

(defn fmod
  "remainder of division

  denominator - the - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.fmod denominator result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.fmod denominator))))

(defn rsubi-row-vector
  "In place reverse subtraction of a row vector

  row-vector - the row vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rsubiRowVector row-vector))))

(defn linear-view
  "Deprecated. Linear views are not always possible. Use reshape(array.length()) or reshape(1,array.length())

  returns: the linear view of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.linearView))))

(defn gt
  "Returns the binary ndarray for \"Greater\" comparison.

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Greater\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.gt other))))

(defn ordering
  "Return the ordering (fortran or c 'f' and 'c' respectively) of this ndarray

  returns: the ordering of this ndarray - `char`"
  (^Character [^INDArray this]
    (-> this (.ordering))))

(defn add-row-vector
  "Addition of a row vector (copy)

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.addRowVector row-vector))))

(defn gte
  "Returns binary ndarray for \"Greter or equals\" comparison.

  other - the number to compare. - `java.lang.Number`

  returns: binary ndarray for \"Greter or equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.gte other))))

(defn java-tensor-along-dimension
  "Get the vector along a particular dimension

  index - the index of the vector to getScalar - `int`
  dimension - the dimension to getScalar the vector from - `int`

  returns: the vector along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer index ^Integer dimension]
    (-> this (.javaTensorAlongDimension index dimension))))

(defn reshape
  "Reshapes the ndarray (can't change the length of the ndarray). Typically this will be a view, unless reshaping
  without copying is impossible.

  order - `char`
  rows - the rows of the matrix - `int`
  columns - the columns of the matrix - `int`

  returns: the reshaped ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Character order ^Integer rows ^Integer columns]
    (-> this (.reshape order rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Character order ^Long new-shape]
    (-> this (.reshape order new-shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long new-shape]
    (-> this (.reshape new-shape))))

(defn element
  "Returns a scalar (individual element)
  of a scalar ndarray

  returns: the individual item in this ndarray - `java.lang.Object`"
  (^java.lang.Object [^INDArray this]
    (-> this (.element))))

(defn cumsumi
  "Returns the cumulative sum along a dimension. In-place method.

  dimension - the dimension to perform cumulative sum along. - `int`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.cumsumi dimension))))

(defn distance-2
  "Returns the (euclidean) distance.

  other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.distance2 other))))

(defn divi-row-vector
  "In place division of a row vector

  row-vector - the row vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.diviRowVector row-vector))))

(defn to-int-matrix
  "Convert this ndarray to a 2d int matrix.
  Note that THIS SHOULD NOT BE USED FOR SPEED.
  This is mainly used for integrations with other libraries.
  Due to nd4j's off heap nature, moving data on heap is very expensive
  and should not be used if possible.

  returns: a copy of this array as a 2d int array - `int[][]`"
  ([^INDArray this]
    (-> this (.toIntMatrix))))

(defn norm-1
  "Returns the norm1 (L1 norm, i.e., sum of absolute values; also known as Taxicab or Manhattan norm) along the
  specified dimension

  dimension - the dimension to getScalar the norm1 along - `int`

  returns: the norm1 along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.norm1 dimension))))

(defn percentile
  "This method returns median along given dimension(s)

  percentile - target percentile in range of 0..100 - `java.lang.Number`
  dimension - Dimension to calculate percentile for - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number percentile ^Integer dimension]
    (-> this (.percentile percentile dimension))))

(defn scan
  "This method takes boolean condition, and returns number of elements matching this condition

  condition - Condition to calculate matches for - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: Number of elements matching condition - `java.lang.Number`"
  (^java.lang.Number [^INDArray this ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.scan condition))))

(defn cond
  "1 in the ndarray if the element matches
  the condition 0 otherwise

  condition - Condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: Copy of this array with values 0 (condition does not apply), or one (condition applies) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.cond condition))))

(defn mark-as-compressed
  "This method marks INDArray instance as compressed
  PLEASE NOTE: Do not use this method unless you 100% have to

  really-compressed - `boolean`"
  ([^INDArray this ^Boolean really-compressed]
    (-> this (.markAsCompressed really-compressed))))

(defn rsubi-column-vector
  "In place reverse subtraction of a column vector

  column-vector - the column vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rsubiColumnVector column-vector))))

(defn broadcast
  "Broadcasts this ndarray to be the specified shape

  shape - the new shape of this ndarray - `long`

  returns: the broadcasted ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long shape]
    (-> this (.broadcast shape))))

(defn to-float-matrix
  "Convert this ndarray to a 2d float matrix.
  Note that THIS SHOULD NOT BE USED FOR SPEED.
  This is mainly used for integrations with other libraries.
  Due to nd4j's off heap nature, moving data on heap is very expensive
  and should not be used if possible.

  returns: a copy of this array as a 2d float array - `float[][]`"
  ([^INDArray this]
    (-> this (.toFloatMatrix))))

(defn remainder
  "Remainder operator

  denominator - the denominator - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result array to put this in - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.remainder denominator result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.remainder denominator))))

(defn wrap-around?
  "Returns true if the ndarray
  on linear indexing wraps around
  based on the stride(1) of the ndarray
  This is a useful optimization in linear view
  where strides that might otherwise
  go out of bounds but wrap around instead.

  returns: true if this ndarray wraps around on linear
  indexing, false otherwise - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isWrapAround))))

(defn set-wrap-around
  "Set the ndarray to wrap around

  wrap-around - thewrap around - `boolean`"
  ([^INDArray this ^Boolean wrap-around]
    (-> this (.setWrapAround wrap-around))))

(defn in-scope?
  "This method checks, if given attached INDArray is still in scope of its parent Workspace
  PLEASE NOTE: if this INDArray isn't attached to any Workspace, this method will return true

  returns: `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isInScope))))

(defn get-int
  "Get an integer value at the specified indices. Result will be cast to an integer, precision loss is possible.

  indices - Indices to get the integer at. Number of indices must match the array rank. - `int`

  returns: Integer value at the specified index - `int`"
  (^Integer [^INDArray this ^Integer indices]
    (-> this (.getInt indices))))

(defn sparse-offsets
  "returns: `int[]`"
  ([^INDArray this]
    (-> this (.sparseOffsets))))

(defn mul-column-vector
  "Multiplication of a column vector (copy)

  column-vector - the column vector used for multiplication - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.mulColumnVector column-vector))))

(defn shape-info-java
  "This method returns shapeInformation as jvm long array

  returns: `long[]`"
  ([^INDArray this]
    (-> this (.shapeInfoJava))))

(defn sparse?
  "Returns true if this array is sparse

  returns: `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isSparse))))

(defn hidden-dimensions
  "returns: `int[]`"
  ([^INDArray this]
    (-> this (.hiddenDimensions))))

(defn neg
  "Returns the ndarray negative (cloned)

  returns: Array copy with all values negated - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.neg))))

(defn divi
  "In place division of this ndarray

  n - the number to divide by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.divi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.divi n))))

(defn puti-row-vector
  "in place assignment of row vector, to each row of this array

  row-vector - Row vector to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: This array, after assigning every road to the specified value - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.putiRowVector row-vector))))

(defn shape-info-data-buffer
  "Shape info

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^INDArray this]
    (-> this (.shapeInfoDataBuffer))))

(defn entropy
  "Returns entropy value for this INDArray along specified dimension(s)

  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.entropy dimension))))

(defn neqi
  "Returns the binary ndarray for \"Not equals\" comparison. In-place method.

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.neqi other))))

(defn ltei
  "Returns the binary ndarray for \"Less or equals\" comparison. In-place method.

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.ltei other))))

(defn to-long-matrix
  "Convert this ndarray to a 2d int matrix.
  Note that THIS SHOULD NOT BE USED FOR SPEED.
  This is mainly used for integrations with other libraries.
  Due to nd4j's off heap nature, moving data on heap is very expensive
  and should not be used if possible.

  returns: a copy of this array as a 2d int array - `long[][]`"
  ([^INDArray this]
    (-> this (.toLongMatrix))))

(defn element-wise-stride
  "Element wise stride

  returns: `int`"
  (^Integer [^INDArray this]
    (-> this (.elementWiseStride))))

(defn ravel
  "Returns a flattened version (row vector) of this ndarray

  order - `char`

  returns: a flattened version (row vector) of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Character order]
    (-> this (.ravel order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.ravel))))

(defn replace-where
  "Replaces all elements in this ndarray that are matching give condition, with corresponding elements from given array

  arr - Source array - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - Condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: New array with values conditionally replaced - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.replaceWhere arr condition))))

(defn put-where
  "Assign the element according
  to the comparison array

  comp - the comparison array - `org.nd4j.linalg.api.ndarray.INDArray`
  put - the elements to put - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - the condition for masking on - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray comp ^org.nd4j.linalg.api.ndarray.INDArray put ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.putWhere comp put condition))))

(defn to-long-vector
  "returns: `long[]`"
  ([^INDArray this]
    (-> this (.toLongVector))))

(defn shape-info-to-string
  "Returns the shape information debugging
  information

  returns: the shape information debugging information - `java.lang.String`"
  (^java.lang.String [^INDArray this]
    (-> this (.shapeInfoToString))))

(defn leverage-or-detach
  "This method detaches INDArray from current Workspace, and attaches it to Workspace with a given Id, if a workspace
  with the given ID is open and active.
  If the workspace does not exist, or is not active, the array is detached from any workspaces.

  id - ID of the workspace to leverage to - `java.lang.String`

  returns: The INDArray, leveraged to the specified workspace (if it exists and is active) otherwise the detached array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.String id]
    (-> this (.leverageOrDetach id))))

(defn median-number
  "This method returns median value for this INDArray

  returns: Median value for array - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.medianNumber))))

(defn to-double-vector
  "Convert this ndarray to a 1d double matrix.
  Note that THIS SHOULD NOT BE USED FOR SPEED.
  This is mainly used for integrations with other libraries.
  Due to nd4j's off heap nature, moving data on heap is very expensive
  and should not be used if possible.

  returns: a copy of this array as a 1d double array - `double[]`"
  ([^INDArray this]
    (-> this (.toDoubleVector))))

(defn amin-number
  "Returns absolute min value in this INDArray

  returns: Absolute min value - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.aminNumber))))

(defn equal-shapes
  "This method checks 2 INDArrays for equal shapes.
  Shapes are considered equal if:
  (a) Both arrays have equal rank, and
  (b) size(0)...size(rank()-1) are equal for both arrays

  other - Other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: True if shap - `boolean`"
  (^Boolean [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.equalShapes other))))

(defn norm-1-number
  "Calculate and return norm1 (L1 norm, i.e., sum of absolute values; also known as Taxicab or Manhattan norm) for
  the entire array

  returns: Norm 1 for the array - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.norm1Number))))

(defn length
  "Returns the total number of elements in the ndarray

  returns: the number of elements in the ndarray - `long`"
  (^Long [^INDArray this]
    (-> this (.length))))

(defn subi-row-vector
  "In place subtraction of a row vector

  row-vector - the row vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.subiRowVector row-vector))))

(defn norm-2
  "Returns the norm2 (L2 norm, sqrt(sum(x_i^2), also known as Euclidean norm) along the specified dimension(s)

  dimension - the dimension to getScalar the norm2 along - `int`

  returns: the norm2 along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.norm2 dimension))))

(defn negi
  "In place setting of the negative version of this ndarray

  returns: This array with all values negated - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.negi))))

(defn percentile-number
  "This method returns percentile value for this INDArray

  percentile - target percentile in range of 0..100 - `java.lang.Number`

  returns: `java.lang.Number`"
  (^java.lang.Number [^INDArray this ^java.lang.Number percentile]
    (-> this (.percentileNumber percentile))))

(defn scalar?
  "Returns true if this ndarray is a scalar

  returns: whether this ndarray is a scalar - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isScalar))))

(defn sum-number
  "Sum the entire array

  returns: Sum of array - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.sumNumber))))

(defn equals-with-eps
  "This method checks 2 INDArrays equality with given eps

  o - `java.lang.Object`
  eps - Epsilon value to use for the quality operation - `double`

  returns: `boolean`"
  (^Boolean [^INDArray this ^java.lang.Object o ^Double eps]
    (-> this (.equalsWithEps o eps))))

(defn get-row
  "Returns the specified row.
  Throws an exception if its not a matrix

  i - the row to getScalar - `long`

  returns: the specified row - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long i]
    (-> this (.getRow i))))

(defn get-rows
  "Get an INDArray comprised of the specified rows only. Copy operation

  rows - Rose to extract from this array - `int`

  returns: Array with only the specified rows - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer rows]
    (-> this (.getRows rows))))

(defn get-where
  "Boolean indexing:
  Return the element if it fulfills the condition in
  result array

  comp - the comparison array - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - the condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: the array fulfilling the criteria - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray comp ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.getWhere comp condition))))

(defn get-format
  "Return the sparse format (i.e COO, CSR, ...)

  returns: format - `org.nd4j.linalg.api.ndarray.SparseFormat`"
  (^org.nd4j.linalg.api.ndarray.SparseFormat [^INDArray this]
    (-> this (.getFormat))))

(defn shannon-entropy
  "Returns entropy value for this INDArray along specified dimension(s)

  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.shannonEntropy dimension))))

(defn set-shape-and-stride
  "Shape and stride setter

  shape - `int[]`
  stride - `int[]`"
  ([^INDArray this shape stride]
    (-> this (.setShapeAndStride shape stride))))

(defn mul-row-vector
  "Multiplication of a row vector (copy)

  row-vector - the row vector used for multiplication - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.mulRowVector row-vector))))

(defn mul
  "copy (element wise) multiplication of two NDArrays

  other - the second ndarray to multiply - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.mul other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.mul n))))

(defn divi-column-vector
  "In place division of a column vector

  column-vector - the column vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.diviColumnVector column-vector))))

(defn rsub
  "Reverse subtraction

  n - the number to subtract by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rsub n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.rsub n))))

(defn data-type
  "This method returns dtype for this INDArray

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^INDArray this]
    (-> this (.dataType))))

(defn tensorss-along-dimension
  "Returns the number of possible vectors for a given dimension

  dimension - the dimension to calculate the number of vectors for - `int`

  returns: the number of possible vectors along a dimension - `long`"
  (^Long [^INDArray this ^Integer dimension]
    (-> this (.tensorssAlongDimension dimension))))

(defn max-number
  "Returns maximum value in this INDArray

  returns: maximum value - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.maxNumber))))

(defn addi
  "In place addition

  n - the number to add - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.addi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.addi n))))

(defn matrix?
  "Returns true if this ndarray is a matrix

  returns: whether this ndarray is a matrix - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isMatrix))))

(defn div
  "copy (element wise) division of two NDArrays

  other - the second ndarray to divide - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the divide - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.div other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.div n))))

(defn row-vector-or-scalar?
  "Returns true if the number of rows is 1

  returns: true if the number of rows is 1 - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isRowVectorOrScalar))))

(defn rdiv-row-vector
  "Reverse division of a column vector (copy)

  row-vector - the row vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rdivRowVector row-vector))))

(defn entropy-number
  "Returns entropy value for this INDArray

  returns: `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.entropyNumber))))

(defn to-int-vector
  "Convert this ndarray to a 1d int matrix.
  Note that THIS SHOULD NOT BE USED FOR SPEED.
  This is mainly used for integrations with other libraries.
  Due to nd4j's off heap nature, moving data on heap is very expensive
  and should not be used if possible.

  returns: a copy of this array as a 1d int array - `int[]`"
  ([^INDArray this]
    (-> this (.toIntVector))))

(defn to-double-matrix
  "Convert this ndarray to a 2d double matrix.
  Note that THIS SHOULD NOT BE USED FOR SPEED.
  This is mainly used for integrations with other libraries.
  Due to nd4j's off heap nature, moving data on heap is very expensive
  and should not be used if possible.

  returns: a copy of this array as a 2d double array - `double[][]`"
  ([^INDArray this]
    (-> this (.toDoubleMatrix))))

(defn to-dense
  "Return a dense representation of the sparse ndarray

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.toDense))))

(defn swap-axes
  "Mainly here for people coming from numpy.
  This is equivalent to a call to permute

  dimension - the dimension to swap - `int`
  with - the one to swap it with - `int`

  returns: the swapped axes view - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension ^Integer with]
    (-> this (.swapAxes dimension with))))

(defn match
  "Return a mask on whether each element
  matches the given condition

  comp - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray comp ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.match comp condition))))

(defn linear-view-column-order
  "Deprecated.

  returns: the linear view of this ndarray
  * @deprecated Linear views are not always possible. Use reshape(array.length()) or reshape(1,array.length()) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.linearViewColumnOrder))))

(defn arg-max
  "This method returns index of highest value along specified dimension(s)

  dimension - Dimension along which to perform the argMax operation - `int`

  returns: Array containing indices - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.argMax dimension))))

(defn to-float-vector
  "Convert this ndarray to a 1d float vector.
  Note that THIS SHOULD NOT BE USED FOR SPEED.
  This is mainly used for integrations with other libraries.
  Due to nd4j's off heap nature, moving data on heap is very expensive
  and should not be used if possible.

  returns: a copy of this array as a 1d float array - `float[]`"
  ([^INDArray this]
    (-> this (.toFloatVector))))

(defn inner-most-stride
  "Get the inner most stride
  wrt the ordering of the array

  returns: `int`"
  (^Integer [^INDArray this]
    (-> this (.innerMostStride))))

(defn check-dimensions
  "Validate dimensions are equal

  other - the other ndarray to compare - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.checkDimensions other))))

(defn rdivi-column-vector
  "In place reverse divison of a column vector

  column-vector - the column vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rdiviColumnVector column-vector))))

(defn slice
  "Returns the specified slice of this ndarray

  i - the index of the slice to return - `long`
  dimension - the dimension to return the slice for - `int`

  returns: the specified slice of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long i ^Integer dimension]
    (-> this (.slice i dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long i]
    (-> this (.slice i))))

(defn vector-along-dimension
  "Get the vector along a particular dimension

  index - the index of the vector to getScalar - `int`
  dimension - the dimension to getScalar the vector from - `int`

  returns: the vector along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer index ^Integer dimension]
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
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.String id ^Boolean enforce-existence]
    (-> this (.leverageTo id enforce-existence)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.String id]
    (-> this (.leverageTo id))))

(defn lte
  "Returns the binary ndarray for \"Less or equals\" comparison.

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Less or equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.lte other))))

(defn div-row-vector
  "Division of a row vector (copy)

  row-vector - the row vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.divRowVector row-vector))))

(defn transposei
  "Flip the rows and columns of a matrix, in-place

  returns: the flipped rows and columns of a matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.transposei))))

(defn add
  "Element-wise copy addition of two NDArrays

  other - the second ndarray to add - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.add other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.add n))))

(defn get-scalar
  "Returns the element at the specified row/column
  This will throw an exception if the

  row - the row of the element to return - `long`
  column - the row of the element to return - `long`

  returns: a scalar indarray of the element at this index - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long row ^Long column]
    (-> this (.getScalar row column)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long i]
    (-> this (.getScalar i))))

(defn remainderi
  "In place remainder

  denominator - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.remainderi denominator))))

(defn squared-distance
  "Returns the square of the Euclidean distance.

  other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.squaredDistance other))))

(defn amax
  "Returns the absolute overall max of this ndarray along given dimensions

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.amax dimension))))

(defn put-scalar-unsafe
  "Insert a scalar
  at the given linear offset

  offset - the offset to insert at - `long`
  value - the value to insert - `double`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Long offset ^Double value]
    (-> this (.putScalarUnsafe offset value))))

(defn original-offset
  "Returns the start of where the ndarray is for the original data buffer

  returns: `long`"
  (^Long [^INDArray this]
    (-> this (.originalOffset))))

(defn empty?
  "This method returns true if this INDArray is special case: no-value INDArray

  returns: `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isEmpty))))

(defn size
  "Returns the size along a specified dimension

  dimension - the dimension to return the size for - `int`

  returns: the size of the array along the specified dimension - `long`"
  (^Long [^INDArray this ^Integer dimension]
    (-> this (.size dimension))))

(defn rows
  "Returns the number of rows in this matrix (throws exception if not 2d)

  returns: the number of rows in this matrix - `int`"
  (^Integer [^INDArray this]
    (-> this (.rows))))

(defn convert-to-doubles
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.convertToDoubles))))

(defn view?
  "Returns true if this array is a view or not

  returns: `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isView))))

(defn add-column-vector
  "Addition of a column vector (copy)

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.addColumnVector column-vector))))

(defn amin
  "Returns minimum (absolute) value in this INDArray, along the specified dimensions

  dimension - `int`

  returns: Minimum absolute value - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.amin dimension))))

(defn std-number
  "Calculate the standard deviation for the entire array, specifying whether it is bias corrected or not

  bias-corrected - If true: bias corrected standard deviation. False: not bias corrected - `boolean`

  returns: Standard dev - `java.lang.Number`"
  (^java.lang.Number [^INDArray this ^Boolean bias-corrected]
    (-> this (.stdNumber bias-corrected)))
  (^java.lang.Number [^INDArray this]
    (-> this (.stdNumber))))

(defn element-stride
  "Deprecated. Previously used for complex numbers

  returns: `int`"
  (^Integer [^INDArray this]
    (-> this (.elementStride))))

(defn amean
  "Returns the absolute overall mean of this ndarray

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.amean dimension))))

(defn dup
  "Returns a copy of this ndarray, where the returned ndarray has the specified order

  order - order of the NDArray. 'f' or 'c' - `char`

  returns: copy of ndarray with specified order - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Character order]
    (-> this (.dup order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.dup))))

(defn get-float
  "Return the item at row i column j
  Note that this is the same as calling getScalar(new int[]{i,j}

  i - the row to getScalar - `long`
  j - the column to getScalar - `long`

  returns: the item at row i column j - `float`"
  (^Float [^INDArray this ^Long i ^Long j]
    (-> this (.getFloat i j)))
  (^Float [^INDArray this indices]
    (-> this (.getFloat indices))))

(defn cumsum
  "Returns the cumulative sum along a dimension.

  dimension - the dimension to perform cumulative sum along. - `int`

  returns: the cumulative sum along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.cumsum dimension))))

(defn rdiv
  "Reverse division (number / ndarray)

  n - the number to divide by - `java.lang.Number`
  result - Array to place the result in. Must match shape of this array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Result array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rdiv n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.rdiv n))))

(defn convert-to-halfs
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.convertToHalfs))))

(defn sub-array
  "Sub array based on the
  pre calculated shape,strides, offsets

  resolution - the resolution to use - `org.nd4j.linalg.indexing.ShapeOffsetResolution`

  returns: the sub array based on the calculations from the resolution - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.indexing.ShapeOffsetResolution resolution]
    (-> this (.subArray resolution)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this offsets shape stride]
    (-> this (.subArray offsets shape stride))))

(defn get-double
  "Get the double value at the specified indices. Can only be used for 2D (rank 2) arrays.

  i - Dimension 0 (row) index - `long`
  j - Dimension 1 (column) index - `long`

  returns: `double`"
  (^Double [^INDArray this ^Long i ^Long j]
    (-> this (.getDouble i j)))
  (^Double [^INDArray this ^Integer indices]
    (-> this (.getDouble indices))))

(defn column-vector-or-scalar?
  "Returns true if the number of columns is 1

  returns: true if the number of columns is 1 - `boolean`"
  (^Boolean [^INDArray this]
    (-> this (.isColumnVectorOrScalar))))

(defn get-trailing-ones
  "Get the number of trailing ones in the array shape. For example, a rank 3 array with shape [10, 1, 1] would
  return 2 for this method

  returns: Number of trailing ones in shape - `int`"
  (^Integer [^INDArray this]
    (-> this (.getTrailingOnes))))

(defn gti
  "Returns the binary ndarray for \"Greter\" comparison. In-place method.

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.gti other))))

(defn data
  "Returns a linear double array representation of this ndarray

  returns: the linear double array representation of this ndarray - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^INDArray this]
    (-> this (.data))))

(defn get
  "Returns a subset of this array based on the specified
  indexes

  indexes - the indexes in to the array - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: a view of the array with the specified indices - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (-> this (.get indexes))))

(defn muli-column-vector
  "In place multiplication of a column vector

  column-vector - the column vector used for multiplication - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.muliColumnVector column-vector))))

(defn subi
  "In place subtraction of this ndarray

  n - the number to subtract by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.subi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number n]
    (-> this (.subi n))))

(defn sparse-info-data-buffer
  "Sparse info

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^INDArray this]
    (-> this (.sparseInfoDataBuffer))))

(defn convert-to-floats
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.convertToFloats))))

(defn rdiv-column-vector
  "Reverse division of a column vector (copy)

  column-vector - the column vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rdivColumnVector column-vector))))

(defn transpose
  "Flip the rows and columns of a matrix

  returns: the flipped rows and columns of a matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.transpose))))

(defn amax-number
  "Returns maximum (absolute) value in this INDArray

  returns: Max absolute value - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.amaxNumber))))

(defn normmax
  "Returns the max norm (aka infinity norm, equal to the maximum absolute value) along the specified dimension(s)

  dimension - the dimension to the max norm along - `int`

  returns: Max norm along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.normmax dimension))))

(defn slice-vectors
  "list - `java.util.List`"
  ([^INDArray this ^java.util.List list]
    (-> this (.sliceVectors list))))

(defn major-stride
  "Return the major stride for an ndarray

  returns: the major stride for an ndarray - `int`"
  (^Integer [^INDArray this]
    (-> this (.majorStride))))

(defn lti
  "Returns the binary ndarray for \"Less\" comparison. In-place method.

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^java.lang.Number other]
    (-> this (.lti other))))

(defn stride
  "Calculate the stride along a particular dimension

  dimension - the dimension to get the stride for - `int`

  returns: the stride for a particular dimension - `int`"
  (^Integer [^INDArray this ^Integer dimension]
    (-> this (.stride dimension)))
  ([^INDArray this]
    (-> this (.stride))))

(defn unsafe-duplication
  "Perform efficient (but unsafe) duplication. Don't use this method unless you know exactly what you are doing.
  Instead, use dup()

  blocking - `boolean`

  returns: Unsafe duplicate of array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Boolean blocking]
    (-> this (.unsafeDuplication blocking)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this]
    (-> this (.unsafeDuplication))))

(defn log-entropy
  "Returns entropy value for this INDArray along specified dimension(s)

  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.logEntropy dimension))))

(defn linear-index
  "Get the linear index of the data in to
  the array

  i - the index to getScalar - `long`

  returns: the linear index in to the data - `long`"
  (^Long [^INDArray this ^Long i]
    (-> this (.linearIndex i))))

(defn condi
  "In-place: 1 in the ndarray if the element matches the condition 0 otherwise

  condition - Condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: This array, modified with values 0 (condition does not apply), or one (condition applies) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.condi condition))))

(defn norm-2-number
  "Return the norm2 (L2 norm, sqrt(sum(x_i^2), also known as Euclidean norm) for the entire array

  returns: L2 norm for the array - `java.lang.Number`"
  (^java.lang.Number [^INDArray this]
    (-> this (.norm2Number))))

(defn median
  "This method returns median along given dimension(s)

  dimension - `int`

  returns: Median along specified dimensions - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^INDArray this ^Integer dimension]
    (-> this (.median dimension))))

