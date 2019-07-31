(ns org.nd4j.linalg.indexing.Indices
  "Indexing util."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing Indices]))

(defn ->indices
  "Constructor."
  (^Indices []
    (new Indices )))

(defn *fill-in
  "Fill in the missing indices to be the
  same length as the original shape.

  Think of this as what fills in the indices for numpy or matlab:
  Given a which is (4,3,2) in numpy:

  a[1:3] is filled in by the rest
  to give back the full slice

  This algorithm fills in that delta

  shape - the original shape - `int[]`
  indexes - the indexes to start from - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: the filled in indices - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([shape ^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (Indices/fillIn shape indexes)))

(defn *shape
  "Calculate the shape for the given set of indices and offsets.

  The shape is defined as (for each dimension)
  the difference between the end index  1 and
  the begin index

  If specified, this will check for whether any of the indices are >= to end - 1
  and if so, prune it down

  shape - the original shape - `int[]`
  indices - the indices to calculate the shape for - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: the shape for the given indices - `int[]`"
  ([shape ^org.nd4j.linalg.indexing.INDArrayIndex indices]
    (Indices/shape shape indices))
  ([^org.nd4j.linalg.indexing.INDArrayIndex indices]
    (Indices/shape indices)))

(defn *create-from-start-and-end
  "Create indices representing intervals
  along each dimension

  start - the start index - `org.nd4j.linalg.api.ndarray.INDArray`
  end - the end index - `org.nd4j.linalg.api.ndarray.INDArray`
  inclusive - whether the lastindex should be included - `boolean`

  returns: the ndarray indexes covering
  each dimension - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray start ^org.nd4j.linalg.api.ndarray.INDArray end ^Boolean inclusive]
    (Indices/createFromStartAndEnd start end inclusive))
  ([^org.nd4j.linalg.api.ndarray.INDArray start ^org.nd4j.linalg.api.ndarray.INDArray end]
    (Indices/createFromStartAndEnd start end)))

(defn *row-number
  "Compute the linear offset
  for an index in an ndarray.
  For c ordering this is just the index itself.
  For fortran ordering, the following algorithm is used.
  Assuming an ndarray is a list of vectors.
  The index of the vector relative to the given index is calculated.
  vectorAlongDimension is then used along the last dimension
  using the computed index.
  The offset  the computed column wrt the index: (index % the size of the last dimension)
  will render the given index in fortran ordering

  index - the index - `int`
  arr - the array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the linear offset - `int`"
  (^Integer [^Integer index ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Indices/rowNumber index arr)))

(defn *scalar?
  "Check if the given indexes
  over the specified array
  are searching for a scalar

  index-over - the array to index over - `org.nd4j.linalg.api.ndarray.INDArray`
  indexes - the index query - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: true if the given indexes are searching
  for a scalar false otherwise - `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray index-over ^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (Indices/isScalar index-over indexes)))

(defn *strides
  "Calculate the strides based on the given indices

  ordering - the ordering to calculate strides for - `char`
  indexes - the indices to calculate stride for - `org.nd4j.linalg.indexing.NDArrayIndex`

  returns: the strides for the given indices - `int[]`"
  ([^Character ordering ^org.nd4j.linalg.indexing.NDArrayIndex indexes]
    (Indices/strides ordering indexes)))

(defn *linear-offset
  "Compute the linear offset
  for an index in an ndarray.
  For c ordering this is just the index itself.
  For fortran ordering, the following algorithm is used.
  Assuming an ndarray is a list of vectors.
  The index of the vector relative to the given index is calculated.
  vectorAlongDimension is then used along the last dimension
  using the computed index.
  The offset  the computed column wrt the index: (index % the size of the last dimension)
  will render the given index in fortran ordering

  index - the index - `int`
  arr - the array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the linear offset - `long`"
  (^Long [^Integer index ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (Indices/linearOffset index arr)))

(defn *offsets
  "The offsets (begin index) for each index

  shape - `long[]`
  indices - the indices - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: the offsets for the given set of indices - `long[]`"
  ([shape ^org.nd4j.linalg.indexing.INDArrayIndex indices]
    (Indices/offsets shape indices)))

(defn *stride
  "Return the stride to be used for indexing

  arr - the array to get the strides for - `org.nd4j.linalg.api.ndarray.INDArray`
  indexes - the indexes to use for computing stride - `org.nd4j.linalg.indexing.INDArrayIndex[]`
  shape - the shape of the output - `int`

  returns: the strides used for indexing - `int[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr indexes ^Integer shape]
    (Indices/stride arr indexes shape)))

(defn *contiguous?
  "Returns whether indices are contiguous
  by a certain amount or not

  indices - the indices to test - `int[]`
  diff - the difference considered to be contiguous - `int`

  returns: whether the given indices are contiguous or not - `boolean`"
  (^Boolean [indices ^Integer diff]
    (Indices/isContiguous indices diff)))

(defn *adjust-indices
  "Prunes indices of greater length than the shape
  and fills in missing indices if there are any

  original-shape - the original shape to adjust to - `int[]`
  indexes - the indexes to adjust - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: the adjusted indices - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([original-shape ^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (Indices/adjustIndices original-shape indexes)))

