(ns org.nd4j.linalg.api.ndarray.BaseSparseNDArray
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray BaseSparseNDArray]))

(defn ->base-sparse-nd-array
  "Constructor."
  (^BaseSparseNDArray []
    (new BaseSparseNDArray )))

(def *-is-sparse
  "Static Constant.

  type: boolean"
  BaseSparseNDArray/isSparse)

(defn put-slice
  "Description copied from interface: INDArray

  slice - the slice to assign - `int`
  put - the slice to applyTransformToDestination - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this for chainability - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer slice ^org.nd4j.linalg.api.ndarray.INDArray put]
    (-> this (.putSlice slice put))))

(defn secondary-stride
  "Description copied from interface: INDArray

  returns: the secondary stride for an ndarray - `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.secondaryStride))))

(defn mean-number
  "Description copied from interface: INDArray

  returns: the mean along the specified dimension of this ndarray - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.meanNumber))))

(defn get-leading-ones
  "Description copied from interface: INDArray

  returns: Number of leading ones in shape - `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.getLeadingOnes))))

(defn amean-number
  "Description copied from interface: INDArray

  returns: the mean along the specified dimension of this ndarray - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.ameanNumber))))

(defn set-data
  "data - `org.nd4j.linalg.api.buffer.DataBuffer`"
  ([^BaseSparseNDArray this ^org.nd4j.linalg.api.buffer.DataBuffer data]
    (-> this (.setData data))))

(defn prod-number
  "Description copied from interface: INDArray

  returns: Product of all values in the array - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.prodNumber))))

(defn nnz
  "Description copied from interface: ISparseNDArray

  returns: nnz - `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.nnz))))

(defn rsub-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rsubColumnVector column-vector))))

(defn min
  "Description copied from interface: INDArray

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.min dimension))))

(defn vector-or-scalar?
  "Description copied from interface: INDArray

  returns: whether this ndarray is a vector or scalar - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isVectorOrScalar))))

(defn div-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.divColumnVector column-vector))))

(defn leverage
  "Description copied from interface: INDArray

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.leverage))))

(defn cleanup
  "Description copied from interface: INDArray"
  ([^BaseSparseNDArray this]
    (-> this (.cleanup))))

(defn var-number
  "Description copied from interface: INDArray

  returns: variance - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.varNumber))))

(defn get-double-unsafe
  "Description copied from interface: INDArray

  offset - the offset to get at - `long`

  returns: this - `double`"
  (^Double [^BaseSparseNDArray this ^Long offset]
    (-> this (.getDoubleUnsafe offset))))

(defn rdivi
  "Description copied from interface: INDArray

  n - the number to divide by by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rdivi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.rdivi n))))

(defn assign
  "Description copied from interface: INDArray

  arr - the elements to assign - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.assign arr))))

(defn shannon-entropy-number
  "Returns non-normalized Shannon entropy value for this INDArray

  returns: `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.shannonEntropyNumber))))

(defn min-number
  "Description copied from interface: INDArray

  returns: Minimum value in the array - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.minNumber))))

(defn compressed?
  "Description copied from interface: INDArray

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isCompressed))))

(defn log-entropy-number
  "Returns log entropy value for this INDArray

  returns: `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.logEntropyNumber))))

(defn std
  "Description copied from interface: INDArray

  bias-corrected - `boolean`
  dimension - `int`

  returns: the standard deviation along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Boolean bias-corrected ^Integer dimension]
    (-> this (.std bias-corrected dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.std dimension))))

(defn lt
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Less\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.lt other))))

(defn neq
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Not equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.neq other))))

(defn set-order
  "Description copied from interface: INDArray

  order - the ordering to set - `char`"
  ([^BaseSparseNDArray this ^Character order]
    (-> this (.setOrder order))))

(defn reset-linear-view
  "Description copied from interface: INDArray"
  ([^BaseSparseNDArray this]
    (-> this (.resetLinearView))))

(defn addi-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.addiRowVector row-vector))))

(defn index
  "Description copied from interface: INDArray

  row - the row to getScalar the linear index for - `long`
  column - the column to getScalar the linear index for - `long`

  returns: the linear index of the given row and column - `long`"
  (^Long [^BaseSparseNDArray this ^Long row ^Long column]
    (-> this (.index row column))))

(defn fmodi
  "Description copied from interface: INDArray

  denominator - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.fmodi denominator))))

(defn sub
  "Description copied from interface: INDArray

  other - the second ndarray to subtract - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.sub other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.sub n))))

(defn offset
  "Description copied from interface: INDArray

  returns: the starting offset - `long`"
  (^Long [^BaseSparseNDArray this]
    (-> this (.offset))))

(defn sub-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.subColumnVector column-vector))))

(defn set-stride
  "Description copied from interface: INDArray

  stride - `long`"
  ([^BaseSparseNDArray this ^Long stride]
    (-> this (.setStride stride))))

(defn migrate
  "Description copied from interface: INDArray

  detach-if-no-ws - If true: detach on no WS. If false and no workspace: return this. - `boolean`

  returns: Migrated INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Boolean detach-if-no-ws]
    (-> this (.migrate detach-if-no-ws)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.migrate))))

(defn columns
  "Description copied from interface: INDArray

  returns: the number of columns in this matrix - `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.columns))))

(defn permutei
  "Description copied from interface: INDArray

  rearrange - the dimensions to swap to - `int`

  returns: the current array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer rearrange]
    (-> this (.permutei rearrange))))

(defn put-scalar
  "Description copied from interface: INDArray

  dim-0 - Dimension 0 index - `long`
  dim-1 - Dimension 1 index - `long`
  dim-2 - Dimension 2 index - `long`
  dim-3 - Dimension 3 index - `long`
  value - Value to put - `double`

  returns: This INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long dim-0 ^Long dim-1 ^Long dim-2 ^Long dim-3 ^Double value]
    (-> this (.putScalar dim-0 dim-1 dim-2 dim-3 value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long dim-0 ^Long dim-1 ^Long dim-2 ^Double value]
    (-> this (.putScalar dim-0 dim-1 dim-2 value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long row ^Long col ^Double value]
    (-> this (.putScalar row col value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long i ^Double value]
    (-> this (.putScalar i value))))

(defn row-vector?
  "Checks whether the matrix is a row vector.

  returns: true if the number of rows is 1 - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isRowVector))))

(defn tensor-along-dimension
  "Description copied from interface: INDArray

  index - the index of the vector to getScalar - `int`
  dimension - the dimension to getScalar the vector from - `int`

  returns: the vector along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer index ^Integer dimension]
    (-> this (.tensorAlongDimension index dimension))))

(defn shape
  "Description copied from interface: INDArray

  returns: the shape of this ndarray - `long[]`"
  ([^BaseSparseNDArray this]
    (-> this (.shape))))

(defn get-column
  "Description copied from interface: INDArray

  i - the column to getScalar - `long`

  returns: the specified column - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long i]
    (-> this (.getColumn i))))

(defn vectors-along-dimension
  "Description copied from interface: INDArray

  dimension - the dimension to calculate the number of vectors for - `int`

  returns: the number of possible vectors along a dimension - `long`"
  (^Long [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.vectorsAlongDimension dimension))))

(defn attached?
  "Description copied from interface: INDArray

  returns: True if attached to workspace, false otherwise - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isAttached))))

(defn put
  "Description copied from interface: INDArray

  i - the row insert into - `int`
  j - the column to insert into - `int`
  element - a scalar ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: a scalar ndarray of the element at this index - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer i ^Integer j ^org.nd4j.linalg.api.ndarray.INDArray element]
    (-> this (.put i j element)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.util.List indices ^org.nd4j.linalg.api.ndarray.INDArray element]
    (-> this (.put indices element))))

(defn eq
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.eq other))))

(defn cleaned-up?
  "Description copied from interface: INDArray

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isCleanedUp))))

(defn put-where-with-mask
  "Description copied from interface: INDArray

  mask - the mask to use - `org.nd4j.linalg.api.ndarray.INDArray`
  put - the array to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the resulting array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray mask ^org.nd4j.linalg.api.ndarray.INDArray put]
    (-> this (.putWhereWithMask mask put))))

(defn rsubi
  "Description copied from interface: INDArray

  n - the number to subtract by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rsubi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.rsubi n))))

(defn dim-shuffle
  "Description copied from interface: INDArray

  rearrange - the dimensions to swap to - `java.lang.Object[]`
  new-order - the new order (think permute) - `int[]`
  broad-castable - (whether the dimension is broadcastable) (must be same length as new order) - `boolean[]`

  returns: the newly permuted array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this rearrange new-order broad-castable]
    (-> this (.dimShuffle rearrange new-order broad-castable))))

(defn mean
  "Description copied from interface: INDArray

  result - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray result ^Integer dimension]
    (-> this (.mean result dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.mean dimension))))

(defn normmax-number
  "Description copied from interface: INDArray

  returns: Max norm for the entire array - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.normmaxNumber))))

(defn distance-1
  "Description copied from interface: INDArray

  other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.distance1 other))))

(defn var
  "Description copied from interface: INDArray

  bias-corrected - boolean on whether to apply corrected bias - `boolean`
  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Boolean bias-corrected ^Integer dimension]
    (-> this (.var bias-corrected dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.var dimension))))

(defn prod
  "Description copied from interface: INDArray

  dimension - the dimension to getScalar the product along - `int`

  returns: the product along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.prod dimension))))

(defn sum
  "Description copied from interface: INDArray

  result - result of this operation will be stored here - `org.nd4j.linalg.api.ndarray.INDArray`
  dimension - the dimension to getScalar the sum along - `int`

  returns: the sum along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray result ^Integer dimension]
    (-> this (.sum result dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.sum dimension))))

(defn set-shape
  "Description copied from interface: INDArray

  shape - `long`"
  ([^BaseSparseNDArray this ^Long shape]
    (-> this (.setShape shape))))

(defn square?
  "Description copied from interface: INDArray

  returns: true if the matrix has the same rows and columns
  false otherwise - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isSquare))))

(defn column-vector?
  "Checks whether the matrix is a column vector.

  returns: true if the number of columns is 1 - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isColumnVector))))

(defn length-long
  "Description copied from interface: INDArray

  returns: the number of elements in the ndarray - `long`"
  (^Long [^BaseSparseNDArray this]
    (-> this (.lengthLong))))

(defn eqi
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.eqi other))))

(defn muli-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector used for multiplication - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.muliRowVector row-vector))))

(defn repeat
  "Description copied from interface: INDArray

  dimension - the dimension to repeat - `int`
  repeats - the number of elements to repeat on each element - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension ^Integer repeats]
    (-> this (.repeat dimension repeats))))

(defn slices
  "Description copied from interface: INDArray

  returns: the number of slices in this ndarray - `long`"
  (^Long [^BaseSparseNDArray this]
    (-> this (.slices))))

(defn mmuli
  "Description copied from interface: INDArray

  other - the other matrix to perform matrix multiply with - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the matrix multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.mmuli other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.mmuli other))))

(defn get-columns
  "Description copied from interface: INDArray

  columns - Columns to extract out of the current array - `int`

  returns: Array with only the specified columns - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer columns]
    (-> this (.getColumns columns))))

(defn put-column
  "Description copied from interface: INDArray

  column - the column to insert - `int`
  to-put - the array to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer column ^org.nd4j.linalg.api.ndarray.INDArray to-put]
    (-> this (.putColumn column to-put))))

(defn gtei
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.gtei other))))

(defn detach
  "Description copied from interface: INDArray

  returns: The attached copy of array, or original if not in workspace - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.detach))))

(defn max
  "Description copied from interface: INDArray

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.max dimension))))

(defn muli
  "Description copied from interface: INDArray

  n - the number to divide by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.muli n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.muli n))))

(defn rdivi-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rdiviRowVector row-vector))))

(defn mmul
  "Description copied from interface: INDArray

  other - the other matrix to perform matrix multiply with - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the matrix multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.mmul other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.mmul other))))

(defn sub-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.subRowVector row-vector))))

(defn shape-info
  "Description copied from interface: INDArray

  returns: `java.nio.LongBuffer`"
  (^java.nio.LongBuffer [^BaseSparseNDArray this]
    (-> this (.shapeInfo))))

(defn repmat
  "Description copied from interface: INDArray

  shape - the new shape of this ndarray - `int`

  returns: the shape to fill out to - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer shape]
    (-> this (.repmat shape))))

(defn assign-if
  "Description copied from interface: INDArray

  arr - the elements to assign - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.assignIf arr condition))))

(defn epsi
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.epsi other))))

(defn permute
  "Description copied from interface: INDArray

  rearrange - the dimensions to swap to - `int`

  returns: the newly permuted array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer rearrange]
    (-> this (.permute rearrange))))

(defn rsub-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rsubRowVector row-vector))))

(defn flags
  "returns: `int[]`"
  ([^BaseSparseNDArray this]
    (-> this (.flags))))

(defn addi-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.addiColumnVector column-vector))))

(defn eps
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Epsilon equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.eps other))))

(defn put-row
  "Description copied from interface: INDArray

  row - the row insert into - `long`
  to-put - the row to insert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long row ^org.nd4j.linalg.api.ndarray.INDArray to-put]
    (-> this (.putRow row to-put))))

(defn rank
  "Description copied from interface: INDArray

  returns: the rank for the ndarray. - `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.rank))))

(defn vector?
  "Checks whether the matrix is a vector.

  returns: whether this ndarray is a vector - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isVector))))

(defn subi-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.subiColumnVector column-vector))))

(defn fmod
  "Description copied from interface: INDArray

  denominator - the - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.fmod denominator result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.fmod denominator))))

(defn rsubi-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rsubiRowVector row-vector))))

(defn linear-view
  "Description copied from interface: INDArray

  returns: the linear view of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.linearView))))

(defn gt
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Greater\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.gt other))))

(defn ordering
  "Description copied from interface: INDArray

  returns: the ordering of this ndarray - `char`"
  (^Character [^BaseSparseNDArray this]
    (-> this (.ordering))))

(defn add-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.addRowVector row-vector))))

(defn gte
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: binary ndarray for \"Greter or equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.gte other))))

(defn java-tensor-along-dimension
  "Description copied from interface: INDArray

  index - the index of the vector to getScalar - `int`
  dimension - the dimension to getScalar the vector from - `int`

  returns: the vector along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer index ^Integer dimension]
    (-> this (.javaTensorAlongDimension index dimension))))

(defn reshape
  "Description copied from interface: INDArray

  order - `char`
  rows - `int`
  columns - `int`

  returns: the reshaped ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Character order ^Integer rows ^Integer columns]
    (-> this (.reshape order rows columns)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Character order ^Long new-shape]
    (-> this (.reshape order new-shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long new-shape]
    (-> this (.reshape new-shape))))

(defn element
  "Description copied from interface: INDArray

  returns: the individual item in this ndarray - `java.lang.Object`"
  (^java.lang.Object [^BaseSparseNDArray this]
    (-> this (.element))))

(defn cumsumi
  "Description copied from interface: INDArray

  dimension - the dimension to perform cumulative sum along. - `int`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.cumsumi dimension))))

(defn distance-2
  "Description copied from interface: INDArray

  other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.distance2 other))))

(defn divi-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.diviRowVector row-vector))))

(defn to-int-matrix
  "Description copied from interface: INDArray

  returns: a copy of this array as a 2d int array - `int[][]`"
  ([^BaseSparseNDArray this]
    (-> this (.toIntMatrix))))

(defn norm-1
  "Description copied from interface: INDArray

  dimension - the dimension to getScalar the norm1 along - `int`

  returns: the norm1 along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.norm1 dimension))))

(defn percentile
  "Description copied from interface: INDArray

  quantile - target percentile in range of 0..100 - `java.lang.Number`
  dimension - Dimension to calculate percentile for - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number quantile ^Integer dimension]
    (-> this (.percentile quantile dimension))))

(defn scan
  "Description copied from interface: INDArray

  condition - Condition to calculate matches for - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: Number of elements matching condition - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.scan condition))))

(defn cond
  "Description copied from interface: INDArray

  condition - Condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: Copy of this array with values 0 (condition does not apply), or one (condition applies) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.cond condition))))

(defn mark-as-compressed
  "Description copied from interface: INDArray

  really-compressed - `boolean`"
  ([^BaseSparseNDArray this ^Boolean really-compressed]
    (-> this (.markAsCompressed really-compressed))))

(defn rsubi-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rsubiColumnVector column-vector))))

(defn broadcast
  "Description copied from interface: INDArray

  result - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the broadcasted ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.broadcast result))))

(defn to-float-matrix
  "Description copied from interface: INDArray

  returns: a copy of this array as a 2d float array - `float[][]`"
  ([^BaseSparseNDArray this]
    (-> this (.toFloatMatrix))))

(defn remainder
  "Description copied from interface: INDArray

  denominator - the denominator - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result array to put this in - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.remainder denominator result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.remainder denominator))))

(defn wrap-around?
  "Description copied from interface: INDArray

  returns: true if this ndarray wraps around on linear
  indexing, false otherwise - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isWrapAround))))

(defn set-wrap-around
  "Description copied from interface: INDArray

  wrap-around - thewrap around - `boolean`"
  ([^BaseSparseNDArray this ^Boolean wrap-around]
    (-> this (.setWrapAround wrap-around))))

(defn in-scope?
  "Description copied from interface: INDArray

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isInScope))))

(defn get-int
  "Description copied from interface: INDArray

  indices - Indices to get the integer at. Number of indices must match the array rank. - `int`

  returns: Integer value at the specified index - `int`"
  (^Integer [^BaseSparseNDArray this ^Integer indices]
    (-> this (.getInt indices))))

(defn sparse-offsets
  "returns: `int[]`"
  ([^BaseSparseNDArray this]
    (-> this (.sparseOffsets))))

(defn mul-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector used for multiplication - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.mulColumnVector column-vector))))

(defn shape-info-java
  "Description copied from interface: INDArray

  returns: `long[]`"
  ([^BaseSparseNDArray this]
    (-> this (.shapeInfoJava))))

(defn sparse?
  "Description copied from interface: INDArray

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isSparse))))

(defn hidden-dimensions
  "returns: `int[]`"
  ([^BaseSparseNDArray this]
    (-> this (.hiddenDimensions))))

(defn neg
  "Description copied from interface: INDArray

  returns: Array copy with all values negated - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.neg))))

(defn divi
  "Description copied from interface: INDArray

  n - the number to divide by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.divi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.divi n))))

(defn shape-info-data-buffer
  "Description copied from interface: INDArray

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArray this]
    (-> this (.shapeInfoDataBuffer))))

(defn entropy
  "Returns entropy along dimension

  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.entropy dimension))))

(defn neqi
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.neqi other))))

(defn ltei
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.ltei other))))

(defn to-long-matrix
  "Description copied from interface: INDArray

  returns: a copy of this array as a 2d int array - `long[][]`"
  ([^BaseSparseNDArray this]
    (-> this (.toLongMatrix))))

(defn element-wise-stride
  "Description copied from interface: INDArray

  returns: `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.elementWiseStride))))

(defn ravel
  "Description copied from interface: INDArray

  order - `char`

  returns: a flattened version (row vector) of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Character order]
    (-> this (.ravel order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.ravel))))

(defn replace-where
  "Description copied from interface: INDArray

  arr - Source array - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - Condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: New array with values conditionally replaced - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.replaceWhere arr condition))))

(defn put-where
  "Description copied from interface: INDArray

  comp - the comparison array - `org.nd4j.linalg.api.ndarray.INDArray`
  put - the elements to put - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - the condition for masking on - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray comp ^org.nd4j.linalg.api.ndarray.INDArray put ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.putWhere comp put condition))))

(defn to-long-vector
  "returns: `long[]`"
  ([^BaseSparseNDArray this]
    (-> this (.toLongVector))))

(defn shape-info-to-string
  "Description copied from interface: INDArray

  returns: the shape information debugging information - `java.lang.String`"
  (^java.lang.String [^BaseSparseNDArray this]
    (-> this (.shapeInfoToString))))

(defn leverage-or-detach
  "Description copied from interface: INDArray

  id - ID of the workspace to leverage to - `java.lang.String`

  returns: The INDArray, leveraged to the specified workspace (if it exists and is active) otherwise the detached array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.String id]
    (-> this (.leverageOrDetach id))))

(defn median-number
  "Description copied from interface: INDArray

  returns: Median value for array - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.medianNumber))))

(defn to-double-vector
  "Description copied from interface: INDArray

  returns: a copy of this array as a 1d double array - `double[]`"
  ([^BaseSparseNDArray this]
    (-> this (.toDoubleVector))))

(defn amin-number
  "Description copied from interface: INDArray

  returns: Absolute min value - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.aminNumber))))

(defn equal-shapes
  "Description copied from interface: INDArray

  other - Other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: True if shap - `boolean`"
  (^Boolean [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.equalShapes other))))

(defn norm-1-number
  "Description copied from interface: INDArray

  returns: Norm 1 for the array - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.norm1Number))))

(defn length
  "Description copied from interface: INDArray

  returns: the number of elements in the ndarray - `long`"
  (^Long [^BaseSparseNDArray this]
    (-> this (.length))))

(defn subi-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector to subtract - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the subtraction - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.subiRowVector row-vector))))

(defn norm-2
  "Description copied from interface: INDArray

  dimension - the dimension to getScalar the norm2 along - `int`

  returns: the norm2 along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.norm2 dimension))))

(defn negi
  "Description copied from interface: INDArray

  returns: This array with all values negated - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.negi))))

(defn percentile-number
  "Description copied from interface: INDArray

  quantile - target percentile in range of 0..100 - `java.lang.Number`

  returns: `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this ^java.lang.Number quantile]
    (-> this (.percentileNumber quantile))))

(defn scalar?
  "Description copied from interface: INDArray

  returns: whether this ndarray is a scalar - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isScalar))))

(defn sum-number
  "Description copied from interface: INDArray

  returns: Sum of array - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.sumNumber))))

(defn equals-with-eps
  "Description copied from interface: INDArray

  o - `java.lang.Object`
  eps - `double`

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArray this ^java.lang.Object o ^Double eps]
    (-> this (.equalsWithEps o eps))))

(defn get-row
  "Description copied from interface: INDArray

  i - the row to getScalar - `long`

  returns: the specified row - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long i]
    (-> this (.getRow i))))

(defn get-rows
  "Description copied from interface: INDArray

  rows - Rose to extract from this array - `int`

  returns: Array with only the specified rows - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer rows]
    (-> this (.getRows rows))))

(defn get-where
  "Description copied from interface: INDArray

  comp - the comparison array - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - the condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: the array fulfilling the criteria - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray comp ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.getWhere comp condition))))

(defn shannon-entropy
  "Returns non-normalized Shannon entropy along dimension

  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.shannonEntropy dimension))))

(defn set-shape-and-stride
  "Description copied from interface: INDArray

  shape - `int[]`
  stride - `int[]`"
  ([^BaseSparseNDArray this shape stride]
    (-> this (.setShapeAndStride shape stride))))

(defn mul-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector used for multiplication - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.mulRowVector row-vector))))

(defn mul
  "Description copied from interface: INDArray

  other - the second ndarray to multiply - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.mul other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.mul n))))

(defn divi-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.diviColumnVector column-vector))))

(defn rsub
  "Description copied from interface: INDArray

  n - the number to subtract by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rsub n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.rsub n))))

(defn data-type
  "Description copied from interface: INDArray

  returns: `org.nd4j.linalg.api.buffer.DataBuffer$Type`"
  (^org.nd4j.linalg.api.buffer.DataBuffer$Type [^BaseSparseNDArray this]
    (-> this (.dataType))))

(defn tensorss-along-dimension
  "Description copied from interface: INDArray

  dimension - the dimension to calculate the number of vectors for - `int`

  returns: the number of possible vectors along a dimension - `long`"
  (^Long [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.tensorssAlongDimension dimension))))

(defn max-number
  "Description copied from interface: INDArray

  returns: maximum value - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.maxNumber))))

(defn addi
  "Description copied from interface: INDArray

  n - the number to add - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.addi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.addi n))))

(defn matrix?
  "Description copied from interface: INDArray

  returns: whether this ndarray is a matrix - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isMatrix))))

(defn div
  "Description copied from interface: INDArray

  other - the second ndarray to divide - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the divide - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.div other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.div n))))

(defn row-vector-or-scalar?
  "Description copied from interface: INDArray

  returns: true if the number of rows is 1 - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isRowVectorOrScalar))))

(defn rdiv-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.rdivRowVector row-vector))))

(defn entropy-number
  "Returns entropy value for this INDArray

  returns: `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.entropyNumber))))

(defn to-int-vector
  "Description copied from interface: INDArray

  returns: a copy of this array as a 1d int array - `int[]`"
  ([^BaseSparseNDArray this]
    (-> this (.toIntVector))))

(defn to-double-matrix
  "Description copied from interface: INDArray

  returns: a copy of this array as a 2d double array - `double[][]`"
  ([^BaseSparseNDArray this]
    (-> this (.toDoubleMatrix))))

(defn to-dense
  "Description copied from interface: ISparseNDArray

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.toDense))))

(defn swap-axes
  "Description copied from interface: INDArray

  dimension - the dimension to swap - `int`
  with - the one to swap it with - `int`

  returns: the swapped axes view - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension ^Integer with]
    (-> this (.swapAxes dimension with))))

(defn match
  "Description copied from interface: INDArray

  comp - `org.nd4j.linalg.api.ndarray.INDArray`
  condition - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray comp ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.match comp condition))))

(defn linear-view-column-order
  "Description copied from interface: INDArray

  returns: the linear view of this ndarray
  * @deprecated Linear views are not always possible. Use reshape(array.length()) or reshape(1,array.length()) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.linearViewColumnOrder))))

(defn arg-max
  "Description copied from interface: INDArray

  dimension - Dimension along which to perform the argMax operation - `int`

  returns: Array containing indices - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.argMax dimension))))

(defn to-float-vector
  "Description copied from interface: INDArray

  returns: a copy of this array as a 1d float array - `float[]`"
  ([^BaseSparseNDArray this]
    (-> this (.toFloatVector))))

(defn inner-most-stride
  "Description copied from interface: INDArray

  returns: `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.innerMostStride))))

(defn check-dimensions
  "Description copied from interface: INDArray

  other - the other ndarray to compare - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.checkDimensions other))))

(defn rdivi-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rdiviColumnVector column-vector))))

(defn slice
  "Description copied from interface: INDArray

  i - the index of the slice to return - `long`
  dimension - the dimension to return the slice for - `int`

  returns: the specified slice of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long i ^Integer dimension]
    (-> this (.slice i dimension)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long i]
    (-> this (.slice i))))

(defn vector-along-dimension
  "Description copied from interface: INDArray

  index - the index of the vector to getScalar - `int`
  dimension - the dimension to getScalar the vector from - `int`

  returns: the vector along a particular dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer index ^Integer dimension]
    (-> this (.vectorAlongDimension index dimension))))

(defn leverage-to
  "Description copied from interface: INDArray

  id - ID of the workspace to leverage to - `java.lang.String`
  enforce-existence - If true, and the specified workspace does not exist: an Nd4jNoSuchWorkspaceExceptionwill be thrown. - `boolean`

  returns: The INDArray, leveraged to the specified workspace - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: org.nd4j.linalg.exception.Nd4jNoSuchWorkspaceException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.String id ^Boolean enforce-existence]
    (-> this (.leverageTo id enforce-existence)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.String id]
    (-> this (.leverageTo id))))

(defn lte
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: the binary ndarray for \"Less or equals\" comparison. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.lte other))))

(defn div-row-vector
  "Description copied from interface: INDArray

  row-vector - the row vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.divRowVector row-vector))))

(defn transposei
  "Description copied from interface: INDArray

  returns: the flipped rows and columns of a matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.transposei))))

(defn add
  "Description copied from interface: INDArray

  other - the second ndarray to add - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.add other result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.add n))))

(defn get-scalar
  "Description copied from interface: INDArray

  row - the row of the element to return - `long`
  column - the row of the element to return - `long`

  returns: a scalar indarray of the element at this index - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long row ^Long column]
    (-> this (.getScalar row column)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long i]
    (-> this (.getScalar i))))

(defn remainderi
  "Description copied from interface: INDArray

  denominator - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray denominator]
    (-> this (.remainderi denominator))))

(defn squared-distance
  "Description copied from interface: INDArray

  other - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray other]
    (-> this (.squaredDistance other))))

(defn amax
  "Description copied from interface: INDArray

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.amax dimension))))

(defn put-scalar-unsafe
  "Description copied from interface: INDArray

  offset - the offset to insert at - `long`
  value - the value to insert - `double`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Long offset ^Double value]
    (-> this (.putScalarUnsafe offset value))))

(defn original-offset
  "Description copied from interface: INDArray

  returns: `long`"
  (^Long [^BaseSparseNDArray this]
    (-> this (.originalOffset))))

(defn size
  "Description copied from interface: INDArray

  dimension - the dimension to return the size for - `int`

  returns: the size of the array along the specified dimension - `long`"
  (^Long [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.size dimension))))

(defn rows
  "Description copied from interface: INDArray

  returns: the number of rows in this matrix - `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.rows))))

(defn add-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.addColumnVector column-vector))))

(defn amin
  "Description copied from interface: INDArray

  dimension - `int`

  returns: Minimum absolute value - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.amin dimension))))

(defn std-number
  "Description copied from interface: INDArray

  bias-corrected - If true: bias corrected standard deviation. False: not bias corrected - `boolean`

  returns: Standard dev - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this ^Boolean bias-corrected]
    (-> this (.stdNumber bias-corrected)))
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.stdNumber))))

(defn element-stride
  "Description copied from interface: INDArray

  returns: `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.elementStride))))

(defn amean
  "Description copied from interface: INDArray

  dimension - the dimension to getScalar the mean along - `int`

  returns: the mean along the specified dimension of this ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.amean dimension))))

(defn dup
  "Description copied from interface: INDArray

  order - order of the NDArray. 'f' or 'c' - `char`

  returns: copy of ndarray with specified order - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Character order]
    (-> this (.dup order)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.dup))))

(defn get-float
  "Description copied from interface: INDArray

  i - the row to getScalar - `long`
  j - the column to getScalar - `long`

  returns: the item at row i column j - `float`"
  (^Float [^BaseSparseNDArray this ^Long i ^Long j]
    (-> this (.getFloat i j)))
  (^Float [^BaseSparseNDArray this indices]
    (-> this (.getFloat indices))))

(defn cumsum
  "Description copied from interface: INDArray

  dimension - the dimension to perform cumulative sum along. - `int`

  returns: the cumulative sum along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.cumsum dimension))))

(defn rdiv
  "Description copied from interface: INDArray

  n - the number to divide by - `java.lang.Number`
  result - Array to place the result in. Must match shape of this array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: Result array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.rdiv n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.rdiv n))))

(defn sub-array
  "Description copied from interface: INDArray

  resolution - the resolution to use - `org.nd4j.linalg.indexing.ShapeOffsetResolution`

  returns: the sub array based on the calculations from the resolution - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.indexing.ShapeOffsetResolution resolution]
    (-> this (.subArray resolution)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this offsets shape stride]
    (-> this (.subArray offsets shape stride))))

(defn get-double
  "Description copied from interface: INDArray

  i - Dimension 0 (row) index - `long`
  j - Dimension 1 (column) index - `long`

  returns: `double`"
  (^Double [^BaseSparseNDArray this ^Long i ^Long j]
    (-> this (.getDouble i j)))
  (^Double [^BaseSparseNDArray this ^Integer indices]
    (-> this (.getDouble indices))))

(defn column-vector-or-scalar?
  "Description copied from interface: INDArray

  returns: true if the number of columns is 1 - `boolean`"
  (^Boolean [^BaseSparseNDArray this]
    (-> this (.isColumnVectorOrScalar))))

(defn get-trailing-ones
  "Description copied from interface: INDArray

  returns: Number of trailing ones in shape - `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.getTrailingOnes))))

(defn gti
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.gti other))))

(defn get
  "Description copied from interface: INDArray

  indices - an ndaray of the indices to get the elements for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the elements to get the array for - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray indices]
    (-> this (.get indices))))

(defn muli-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector used for multiplication - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.muliColumnVector column-vector))))

(defn subi
  "Description copied from interface: INDArray

  n - the number to subtract by - `java.lang.Number`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.subi n result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number n]
    (-> this (.subi n))))

(defn sparse-info-data-buffer
  "Description copied from interface: INDArray

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArray this]
    (-> this (.sparseInfoDataBuffer))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArray this ^java.lang.Object o]
    (-> this (.equals o))))

(defn rdiv-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector used for division - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the division - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.rdivColumnVector column-vector))))

(defn transpose
  "Description copied from interface: INDArray

  returns: the flipped rows and columns of a matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.transpose))))

(defn amax-number
  "Description copied from interface: INDArray

  returns: Max absolute value - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.amaxNumber))))

(defn normmax
  "Description copied from interface: INDArray

  dimension - the dimension to the max norm along - `int`

  returns: Max norm along the specified dimension - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.normmax dimension))))

(defn slice-vectors
  "list - `java.util.List`"
  ([^BaseSparseNDArray this ^java.util.List list]
    (-> this (.sliceVectors list))))

(defn major-stride
  "Description copied from interface: INDArray

  returns: the major stride for an ndarray - `int`"
  (^Integer [^BaseSparseNDArray this]
    (-> this (.majorStride))))

(defn lti
  "Description copied from interface: INDArray

  other - the number to compare. - `java.lang.Number`

  returns: this object. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^java.lang.Number other]
    (-> this (.lti other))))

(defn stride
  "Description copied from interface: INDArray

  dimension - the dimension to get the stride for - `int`

  returns: the stride for a particular dimension - `int`"
  (^Integer [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.stride dimension)))
  ([^BaseSparseNDArray this]
    (-> this (.stride))))

(defn unsafe-duplication
  "Description copied from interface: INDArray

  blocking - `boolean`

  returns: Unsafe duplicate of array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Boolean blocking]
    (-> this (.unsafeDuplication blocking)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this]
    (-> this (.unsafeDuplication))))

(defn log-entropy
  "Returns log entropy along dimension

  dimension - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.logEntropy dimension))))

(defn linear-index
  "Description copied from interface: INDArray

  i - the index to getScalar - `long`

  returns: the linear index in to the data - `long`"
  (^Long [^BaseSparseNDArray this ^Long i]
    (-> this (.linearIndex i))))

(defn condi
  "Description copied from interface: INDArray

  condition - Condition to apply - `org.nd4j.linalg.indexing.conditions.Condition`

  returns: This array, modified with values 0 (condition does not apply), or one (condition applies) - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^org.nd4j.linalg.indexing.conditions.Condition condition]
    (-> this (.condi condition))))

(defn norm-2-number
  "Description copied from interface: INDArray

  returns: L2 norm for the array - `java.lang.Number`"
  (^java.lang.Number [^BaseSparseNDArray this]
    (-> this (.norm2Number))))

(defn median
  "Description copied from interface: INDArray

  dimension - `int`

  returns: Median along specified dimensions - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArray this ^Integer dimension]
    (-> this (.median dimension))))

