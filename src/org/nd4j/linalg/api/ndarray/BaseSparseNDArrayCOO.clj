(ns org.nd4j.linalg.api.ndarray.BaseSparseNDArrayCOO
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray BaseSparseNDArrayCOO]))

(defn ->base-sparse-nd-array-coo
  "Constructor.

  values - `org.nd4j.linalg.api.buffer.DataBuffer`
  indices - `org.nd4j.linalg.api.buffer.DataBuffer`
  sparse-offsets - `long[]`
  flags - `int[]`
  hidden-dimensions - `int[]`
  underlying-rank - `int`
  shape - `long[]`"
  (^BaseSparseNDArrayCOO [^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices sparse-offsets flags hidden-dimensions ^Integer underlying-rank shape]
    (new BaseSparseNDArrayCOO values indices sparse-offsets flags hidden-dimensions underlying-rank shape))
  (^BaseSparseNDArrayCOO [^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices ^org.nd4j.linalg.api.buffer.DataBuffer sparse-information shape]
    (new BaseSparseNDArrayCOO values indices sparse-information shape))
  (^BaseSparseNDArrayCOO [^org.nd4j.linalg.api.buffer.DataBuffer values ^org.nd4j.linalg.api.buffer.DataBuffer indices shape]
    (new BaseSparseNDArrayCOO values indices shape)))

(defn get-vector-coordinates
  "Returns the indices of non-zero element of the vector

  returns: indices in Databuffer - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this]
    (-> this (.getVectorCoordinates))))

(defn dimension-fixed?
  "Return if the dimension in argument is a fixed dimension.

  i - `int`

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArrayCOO this ^Integer i]
    (-> this (.isDimensionFixed i))))

(defn assign
  "Description copied from interface: INDArray

  arr - the elements to assign - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.assign arr))))

(defn can-insert?
  "Return if there is enough allocated memory space to add data of a given length in the databuffer

  buffer - a databuffer in which we want to add data - `org.nd4j.linalg.api.buffer.DataBuffer`
  length - the length of the data - `int`

  returns: a boolean if the insertion is possible - `boolean`"
  (^Boolean [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^Integer length]
    (-> this (.canInsert buffer length))))

(defn to-flat-array
  "Description copied from interface: INDArray

  builder - the builder to use - `com.google.flatbuffers.FlatBufferBuilder`

  returns: the offset to add - `int`"
  (^Integer [^BaseSparseNDArrayCOO this ^com.google.flatbuffers.FlatBufferBuilder builder]
    (-> this (.toFlatArray builder))))

(defn filter-out-fixed-dimensions
  "flags - `int[]`
  idx - `java.util.List`

  returns: `int[]`"
  ([^BaseSparseNDArrayCOO this flags ^java.util.List idx]
    (-> this (.filterOutFixedDimensions flags idx))))

(defn zero?
  "indexes - `int`

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArrayCOO this ^Integer indexes]
    (-> this (.isZero indexes))))

(defn remove-entry
  "Remove an element of the ndarray

  idx - the index of the element to be removed - `int`

  returns: the ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Integer idx]
    (-> this (.removeEntry idx))))

(defn get-num-hidden-dimension
  "returns: `int`"
  (^Integer [^BaseSparseNDArrayCOO this]
    (-> this (.getNumHiddenDimension))))

(defn set-stride
  "Description copied from interface: INDArray

  stride - `long`"
  ([^BaseSparseNDArrayCOO this ^Long stride]
    (-> this (.setStride stride))))

(defn put-scalar
  "Description copied from interface: INDArray

  dim-0 - Dimension 0 index - `long`
  dim-1 - Dimension 1 index - `long`
  dim-2 - Dimension 2 index - `long`
  dim-3 - Dimension 3 index - `long`
  value - Value to put - `double`

  returns: This INDArray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Long dim-0 ^Long dim-1 ^Long dim-2 ^Long dim-3 ^Double value]
    (-> this (.putScalar dim-0 dim-1 dim-2 dim-3 value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Long dim-0 ^Long dim-1 ^Long dim-2 ^Double value]
    (-> this (.putScalar dim-0 dim-1 dim-2 value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Long row ^Long col ^Double value]
    (-> this (.putScalar row col value)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Long i ^Double value]
    (-> this (.putScalar i value))))

(defn get-values
  "returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this]
    (-> this (.getValues))))

(defn shift-left
  "buffer - `org.nd4j.linalg.api.buffer.DataBuffer`
  from - `int`
  offset - `int`
  datalength - `long`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.api.buffer.DataBuffer buffer ^Integer from ^Integer offset ^Long datalength]
    (-> this (.shiftLeft buffer from offset datalength))))

(defn put
  "Description copied from interface: INDArray

  i - the row insert into - `int`
  j - the column to insert into - `int`
  element - a scalar ndarray - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: a scalar ndarray of the element at this index - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Integer i ^Integer j ^org.nd4j.linalg.api.ndarray.INDArray element]
    (-> this (.put i j element)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this indices ^org.nd4j.linalg.api.ndarray.INDArray element]
    (-> this (.put indices element))))

(defn get-included-values
  "Return a copy of the values included in the array.
  /!\\ Change this DataBuffer won't change the ndarray!

  returns: an array containing the values - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this]
    (-> this (.getIncludedValues))))

(defn get-included-indices
  "Return a copy of the indices included in the view.
  /!\\ Change this DataBuffer won't change the ndarray!

  returns: an array containing the virtual indexes of the values (think about views). - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this]
    (-> this (.getIncludedIndices))))

(defn set-shape
  "Description copied from interface: INDArray

  shape - `long`"
  ([^BaseSparseNDArrayCOO this ^Long shape]
    (-> this (.setShape shape))))

(defn repeat
  "dimension - `int`
  repeats - `long`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Integer dimension ^Long repeats]
    (-> this (.repeat dimension repeats))))

(defn mmuli
  "other - `org.nd4j.linalg.api.ndarray.INDArray`
  result - `org.nd4j.linalg.api.ndarray.INDArray`
  transpose - `org.nd4j.linalg.api.blas.params.MMulTranspose`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.blas.params.MMulTranspose transpose]
    (-> this (.mmuli other result transpose)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.blas.params.MMulTranspose transpose]
    (-> this (.mmuli other transpose))))

(defn put-column
  "Description copied from interface: INDArray

  column - the column to insert - `int`
  to-put - the array to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Integer column ^org.nd4j.linalg.api.ndarray.INDArray to-put]
    (-> this (.putColumn column to-put))))

(defn count-nnz
  "Count the number of value that are included in the ndarray (view) according to the sparse offsets and the shape

  returns: nnz - `long`"
  (^Long [^BaseSparseNDArrayCOO this]
    (-> this (.countNNZ))))

(defn puti-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.putiColumnVector column-vector))))

(defn mmul
  "Perform an copy matrix multiplication

  other - the other matrix to perform matrix multiply with - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  m-mul-transpose - the transpose status of each array - `org.nd4j.linalg.api.blas.params.MMulTranspose`

  returns: the result of the matrix multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.blas.params.MMulTranspose m-mul-transpose]
    (-> this (.mmul other result m-mul-transpose)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.blas.params.MMulTranspose m-mul-transpose]
    (-> this (.mmul other m-mul-transpose))))

(defn get-underlying-values
  "Return the values buffer

  returns: values - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this]
    (-> this (.getUnderlyingValues))))

(defn put-row
  "Description copied from interface: INDArray

  row - the row insert into - `long`
  to-put - the row to insert - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: this - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Long row ^org.nd4j.linalg.api.ndarray.INDArray to-put]
    (-> this (.putRow row to-put))))

(defn underlying-rank
  "returns: `int`"
  (^Integer [^BaseSparseNDArrayCOO this]
    (-> this (.underlyingRank))))

(defn get-indices
  "returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this]
    (-> this (.getIndices))))

(defn sort
  "Sort the indexes and the values buffers"
  ([^BaseSparseNDArrayCOO this]
    (-> this (.sort))))

(defn reshape
  "order - `char`
  new-shape - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Character order ^Integer new-shape]
    (-> this (.reshape order new-shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this shape]
    (-> this (.reshape shape))))

(defn indexes-binary-search
  "Return the position of the idx array into the indexes buffer between the lower and upper bound.

  lower-bound - the lower bound of the position - `int`
  upper-bound - the upper bound of the position - `int`
  idx - a set of coordinates - `int[]`

  returns: the position of the idx array into the indexes buffers, which corresponds to the position of
  the corresponding value in the values data. - `int`"
  (^Integer [^BaseSparseNDArrayCOO this ^Integer lower-bound ^Integer upper-bound idx]
    (-> this (.indexesBinarySearch lower-bound upper-bound idx))))

(defn get-int
  "Description copied from interface: INDArray

  indices - Indices to get the integer at. Number of indices must match the array rank. - `int`

  returns: Integer value at the specified index - `int`"
  (^Integer [^BaseSparseNDArrayCOO this ^Integer indices]
    (-> this (.getInt indices))))

(defn puti-row-vector
  "Description copied from interface: INDArray

  row-vector - Row vector to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: This array, after assigning every road to the specified value - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.putiRowVector row-vector))))

(defn sorted?
  "returns: `boolean`"
  (^Boolean [^BaseSparseNDArrayCOO this]
    (-> this (.isSorted))))

(defn shape-info-data-buffer
  "Description copied from interface: INDArray

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this]
    (-> this (.shapeInfoDataBuffer))))

(defn add-or-update
  "Add a new element in the ndarray or update the value if there is already a non-null element at this position

  indexes - the indexes of the element to be added - `long[]`
  value - the value of the element to be added - `double`"
  ([^BaseSparseNDArrayCOO this indexes ^Double value]
    (-> this (.addOrUpdate indexes value))))

(defn get-format
  "Description copied from interface: ISparseNDArray

  returns: format - `org.nd4j.linalg.api.ndarray.SparseFormat`"
  (^org.nd4j.linalg.api.ndarray.SparseFormat [^BaseSparseNDArrayCOO this]
    (-> this (.getFormat))))

(defn get-underlying-indices
  "Return the indices buffer

  returns: indices - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this]
    (-> this (.getUnderlyingIndices))))

(defn to-dense
  "Converts the sparse ndarray into a dense one

  returns: a dense ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this]
    (-> this (.toDense))))

(defn get-indices-of
  "Returns the indices of the element of the given index in the array context

  i - the index of the element - `int`

  returns: a dataBuffer containing the indices of element - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this ^Integer i]
    (-> this (.getIndicesOf i))))

(defn get-underlying-indices-of
  "Returns the underlying indices of the element of the given index
  such as there really are in the original ndarray

  i - the index of the element+ - `int`

  returns: a dataBuffer containing the indices of element - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this ^Integer i]
    (-> this (.getUnderlyingIndicesOf i))))

(defn get-scalar
  "Description copied from interface: INDArray

  indices - the indices to getScalar - `int`

  returns: the array with the specified elements - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^Integer indices]
    (-> this (.getScalar indices))))

(defn translate-to-physical
  "Translate the view index to the corresponding index of the original ndarray

  virtual-indexes - the view indexes - `long[]`

  returns: the original indexes - `long[]`"
  ([^BaseSparseNDArrayCOO this virtual-indexes]
    (-> this (.translateToPhysical virtual-indexes))))

(defn empty?
  "This method returns true if this INDArray is special case: no-value INDArray

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArrayCOO this]
    (-> this (.isEmpty))))

(defn convert-to-doubles
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this]
    (-> this (.convertToDoubles))))

(defn view?
  "Description copied from interface: INDArray

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArrayCOO this]
    (-> this (.isView))))

(defn get-float
  "Description copied from interface: INDArray

  i - the row to getScalar - `long`
  j - the column to getScalar - `long`

  returns: the item at row i column j - `float`"
  (^Float [^BaseSparseNDArrayCOO this ^Long i ^Long j]
    (-> this (.getFloat i j)))
  (^Float [^BaseSparseNDArrayCOO this indices]
    (-> this (.getFloat indices))))

(defn convert-to-halfs
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this]
    (-> this (.convertToHalfs))))

(defn sub-array
  "Description copied from interface: INDArray

  resolution - the resolution to use - `org.nd4j.linalg.indexing.ShapeOffsetResolution`

  returns: the sub array based on the calculations from the resolution - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.indexing.ShapeOffsetResolution resolution]
    (-> this (.subArray resolution)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this offsets shape stride]
    (-> this (.subArray offsets shape stride)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.indexing.ShapeOffsetResolution resolution ^org.nd4j.linalg.indexing.ShapeOffsetResolution resolution-without-new-axis]
    (-> this (.subArray resolution resolution-without-new-axis))))

(defn get-double
  "Description copied from interface: INDArray

  i - Dimension 0 (row) index - `long`
  j - Dimension 1 (column) index - `long`

  returns: `double`"
  (^Double [^BaseSparseNDArrayCOO this ^Long i ^Long j]
    (-> this (.getDouble i j)))
  (^Double [^BaseSparseNDArrayCOO this ^Integer indices]
    (-> this (.getDouble indices))))

(defn data
  "Description copied from interface: INDArray

  returns: the linear double array representation of this ndarray - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCOO this]
    (-> this (.data))))

(defn get
  "Returns a subset of this array based on the specified
  indexes

  indexes - the indexes in to the array - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: a view of the array with the specified indices - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this ^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (-> this (.get indexes))))

(defn reverse-indexes
  "Return the index of the value corresponding to the indexes

  indexes - `int`

  returns: index of the value - `int`"
  (^Integer [^BaseSparseNDArrayCOO this ^Integer indexes]
    (-> this (.reverseIndexes indexes))))

(defn convert-to-floats
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCOO this]
    (-> this (.convertToFloats))))

