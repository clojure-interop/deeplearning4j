(ns org.nd4j.linalg.api.ndarray.BaseSparseNDArrayCSR
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray BaseSparseNDArrayCSR]))

(defn ->base-sparse-nd-array-csr
  "Constructor.

  The length of the values and columns arrays is equal to the number of non-zero elements in A.
  The length of the pointerB and pointerE arrays is equal to the number of rows in A.

  data - a double array that contains the non-zero element of the sparse matrix A - `double[]`
  columns-pointers - Element i of the integer array columns is the number of the column in A that contains the i-th valuein the values array. - `int[]`
  pointer-b - Element j of this integer array gives the index of the element in the values array that is firstnon-zero element in a row j of A. Note that this index is equal to pointerB(j) - pointerB(1)+1 . - `int[]`
  pointer-e - An integer array that contains row indices, such that pointerE(j)-pointerB(1) is the index of theelement in the values array that is last non-zero element in a row j of A. - `int[]`
  shape - Shape of the matrix A - `long[]`"
  (^BaseSparseNDArrayCSR [data columns-pointers pointer-b pointer-e shape]
    (new BaseSparseNDArrayCSR data columns-pointers pointer-b pointer-e shape)))

(defn get-vector-coordinates
  "Return the minor pointers. (columns for CSR, rows for CSC,...)

  returns: a DataBuffer of indexes - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCSR this]
    (-> this (.getVectorCoordinates))))

(defn put-scalar
  "row - `int`
  col - `int`
  value - `double`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCSR this ^Integer row ^Integer col ^Double value]
    (-> this (.putScalar row col value))))

(defn get-columns
  "returns: `double[]`"
  ([^BaseSparseNDArrayCSR this]
    (-> this (.getColumns))))

(defn puti-column-vector
  "Description copied from interface: INDArray

  column-vector - the column vector to add - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the result of the addition - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCSR this ^org.nd4j.linalg.api.ndarray.INDArray column-vector]
    (-> this (.putiColumnVector column-vector))))

(defn get-pointer-b-array
  "returns: `int[]`"
  ([^BaseSparseNDArrayCSR this]
    (-> this (.getPointerBArray))))

(defn underlying-rank
  "returns: `int`"
  (^Integer [^BaseSparseNDArrayCSR this]
    (-> this (.underlyingRank))))

(defn get-pointer-e-array
  "returns: `int[]`"
  ([^BaseSparseNDArrayCSR this]
    (-> this (.getPointerEArray))))

(defn puti-row-vector
  "Description copied from interface: INDArray

  row-vector - Row vector to put - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: This array, after assigning every road to the specified value - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCSR this ^org.nd4j.linalg.api.ndarray.INDArray row-vector]
    (-> this (.putiRowVector row-vector))))

(defn shape-info-data-buffer
  "Description copied from interface: INDArray

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCSR this]
    (-> this (.shapeInfoDataBuffer))))

(defn get-pointer-e
  "returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCSR this]
    (-> this (.getPointerE))))

(defn get-format
  "Description copied from interface: ISparseNDArray

  returns: format - `org.nd4j.linalg.api.ndarray.SparseFormat`"
  (^org.nd4j.linalg.api.ndarray.SparseFormat [^BaseSparseNDArrayCSR this]
    (-> this (.getFormat))))

(defn to-dense
  "Description copied from interface: ISparseNDArray

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCSR this]
    (-> this (.toDense))))

(defn get-pointer-b
  "returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCSR this]
    (-> this (.getPointerB))))

(defn view?
  "Description copied from interface: INDArray

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArrayCSR this]
    (-> this (.isView))))

(defn sub-array
  "Description copied from interface: INDArray

  resolution - the resolution to use - `org.nd4j.linalg.indexing.ShapeOffsetResolution`

  returns: the sub array based on the calculations from the resolution - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCSR this ^org.nd4j.linalg.indexing.ShapeOffsetResolution resolution]
    (-> this (.subArray resolution)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCSR this offsets shape stride]
    (-> this (.subArray offsets shape stride))))

(defn get-double-values
  "returns: `double[]`"
  ([^BaseSparseNDArrayCSR this]
    (-> this (.getDoubleValues))))

(defn data
  "Description copied from interface: INDArray

  returns: the linear double array representation of this ndarray - `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseNDArrayCSR this]
    (-> this (.data))))

(defn get
  "Returns a subset of this array based on the specified
  indexes

  indexes - the indexes in to the array - `org.nd4j.linalg.indexing.INDArrayIndex`

  returns: a view of the array with the specified indices - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseSparseNDArrayCSR this ^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (-> this (.get indexes))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseSparseNDArrayCSR this ^java.lang.Object o]
    (-> this (.equals o))))

