(ns org.nd4j.linalg.indexing.NDArrayIndex
  "NDArray indexing"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing NDArrayIndex]))

(defn ->nd-array-index
  "Constructor.

  NDArrayIndexing based on the given
  indexes

  indices - `long`"
  (^NDArrayIndex [^Long indices]
    (new NDArrayIndex indices)))

(defn *num-new-axis
  "Given an array of indexes
  return the number of new axis elements
  in teh array

  axes - the indexes to get the numberof new axes for - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: the number of new axis elements in the given array - `int`"
  (^Integer [^org.nd4j.linalg.indexing.INDArrayIndex axes]
    (NDArrayIndex/numNewAxis axes)))

(defn *resolve
  "Given an all index and
  the intended indexes, return an
  index array containing a combination of all elements
  for slicing and overriding particular indexes where necessary

  arr - the array to resolve indexes for - `org.nd4j.linalg.api.ndarray.INDArray`
  intended-indexes - the indexes specified by the user - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: the resolved indexes (containing all where nothing is specified, and the intended index
  for a particular dimension otherwise) - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.indexing.INDArrayIndex intended-indexes]
    (NDArrayIndex/resolve arr intended-indexes)))

(defn *offset
  "Compute the offset given an array of offsets.
  The offset is computed(for both fortran an d c ordering) as:
  sum from i to n - 1 o[i] * s[i]
  where i is the index o is the offset and s is the stride
  Notice the -1 at the end.

  arr - the array to compute the offset for - `org.nd4j.linalg.api.ndarray.INDArray`
  offsets - the offsets for each dimension - `long`

  returns: the offset that should be used for indexing - `long`"
  (^Long [^org.nd4j.linalg.api.ndarray.INDArray arr ^Long offsets]
    (NDArrayIndex/offset arr offsets)))

(defn *n-times
  "Repeat a copy of copy n times

  copy - the ndarray index to copy - `org.nd4j.linalg.indexing.INDArrayIndex`
  n - the number of times to copy - `int`

  returns: an array of length n containing copies of
  the given ndarray index - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([^org.nd4j.linalg.indexing.INDArrayIndex copy ^Integer n]
    (NDArrayIndex/nTimes copy n)))

(defn *interval
  "Generates an interval from begin (inclusive) to end (exclusive)

  begin - the begin - `long`
  stride - the stride at which to increment - `long`
  end - the end index - `long`
  max - the max length for this domain - `long`

  returns: the interval - `org.nd4j.linalg.indexing.INDArrayIndex`"
  (^org.nd4j.linalg.indexing.INDArrayIndex [^Long begin ^Long stride ^Long end ^Long max]
    (NDArrayIndex/interval begin stride end max))
  (^org.nd4j.linalg.indexing.INDArrayIndex [^Long begin ^Long stride ^Long end]
    (NDArrayIndex/interval begin stride end))
  (^org.nd4j.linalg.indexing.INDArrayIndex [^Integer begin ^Integer end]
    (NDArrayIndex/interval begin end))
  (^org.nd4j.linalg.indexing.INDArrayIndex [^Long begin ^Long stride ^Long end ^Long max ^Boolean inclusive]
    (NDArrayIndex/interval begin stride end max inclusive)))

(defn *new-axis
  "Represents adding a new dimension

  returns: the indexing for
  adding a new dimension - `org.nd4j.linalg.indexing.INDArrayIndex`"
  (^org.nd4j.linalg.indexing.INDArrayIndex []
    (NDArrayIndex/newAxis )))

(defn *empty
  "Represents collecting no elements

  returns: an ndarray index
  meaning collect
  no elements - `org.nd4j.linalg.indexing.INDArrayIndex`"
  (^org.nd4j.linalg.indexing.INDArrayIndex []
    (NDArrayIndex/empty )))

(defn *update-for-new-axes
  "Set the shape and stride for
  new axes based dimensions

  arr - the array to updatethe shape/strides for - `org.nd4j.linalg.api.ndarray.INDArray`
  indexes - the indexes to update based on - `org.nd4j.linalg.indexing.INDArrayIndex`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr ^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (NDArrayIndex/updateForNewAxes arr indexes)))

(defn *num-points
  "Number of point indexes

  indexes - the indexesto count for points - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: the number of point indexes
  in the array - `int`"
  (^Integer [^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (NDArrayIndex/numPoints indexes)))

(defn *create
  "Create from a matrix. The rows are the indices
  The columns are the individual element in each ndarrayindex

  index - the matrix to getFloat indices from - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the indices to getFloat - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray index]
    (NDArrayIndex/create index)))

(defn *all
  "Represents collecting all elements

  returns: an ndarray index
  meaning collect
  all elements - `org.nd4j.linalg.indexing.INDArrayIndex`"
  (^org.nd4j.linalg.indexing.INDArrayIndex []
    (NDArrayIndex/all )))

(defn *indexes-for
  "Add indexes for the given shape

  shape - the shape ot convert to indexes - `long`

  returns: the indexes for the given shape - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([^Long shape]
    (NDArrayIndex/indexesFor shape)))

(defn *create-covering-shape
  "Creates an index covering the given shape
  (for each dimension 0,shape[i])

  shape - the shape to cover - `int[]`

  returns: the ndarray indexes to cover - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([shape]
    (NDArrayIndex/createCoveringShape shape)))

(defn *all-for
  "Generate an all index
  equal to the rank of the given array

  arr - the array to generate the all index for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: an ndarray index array containing of length
  arr.rank() containing all elements - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr]
    (NDArrayIndex/allFor arr)))

(defn *point
  "Returns a point index

  point - the point index - `long`

  returns: the point index based
  on the specified point - `org.nd4j.linalg.indexing.INDArrayIndex`"
  (^org.nd4j.linalg.indexing.INDArrayIndex [^Long point]
    (NDArrayIndex/point point)))

(defn *range-of-length
  "Create a range based on the given indexes.
  This is similar to create covering shape in that it approximates
  the length of each dimension (ignoring elements) and
  reproduces an index of the same dimension and length.

  indexes - the indexes to create the range for - `org.nd4j.linalg.indexing.INDArrayIndex[]`

  returns: the index ranges. - `org.nd4j.linalg.indexing.INDArrayIndex[]`"
  ([indexes]
    (NDArrayIndex/rangeOfLength indexes)))

(defn next
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndex this]
    (-> this (.next))))

(defn offset
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndex this]
    (-> this (.offset))))

(defn reverse
  "Description copied from interface: INDArrayIndex"
  ([^NDArrayIndex this]
    (-> this (.reverse))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NDArrayIndex this]
    (-> this (.toString))))

(defn reset
  ""
  ([^NDArrayIndex this]
    (-> this (.reset))))

(defn current
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndex this]
    (-> this (.current))))

(defn has-next?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^NDArrayIndex this]
    (-> this (.hasNext))))

(defn length
  "Returns the length of the indices

  returns: the length of the range - `long`"
  (^Long [^NDArrayIndex this]
    (-> this (.length))))

(defn init
  "Description copied from interface: INDArrayIndex

  arr - the array to initialize on - `org.nd4j.linalg.api.ndarray.INDArray`
  begin - the beginning index - `long`
  dimension - the dimension to initialize on - `int`"
  ([^NDArrayIndex this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Long begin ^Integer dimension]
    (-> this (.init arr begin dimension)))
  ([^NDArrayIndex this ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer dimension]
    (-> this (.init arr dimension))))

(defn interval?
  "Description copied from interface: INDArrayIndex

  returns: `boolean`"
  (^Boolean [^NDArrayIndex this]
    (-> this (.isInterval))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NDArrayIndex this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NDArrayIndex this ^java.lang.Object o]
    (-> this (.equals o))))

(defn end
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndex this]
    (-> this (.end))))

(defn stride
  "Description copied from interface: INDArrayIndex

  returns: `long`"
  (^Long [^NDArrayIndex this]
    (-> this (.stride))))

(defn set-interval
  "is-interval - `boolean`"
  ([^NDArrayIndex this ^Boolean is-interval]
    (-> this (.setInterval is-interval))))

