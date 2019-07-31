(ns org.nd4j.linalg.jcublas.JcusparseNDArrayCSR
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas JcusparseNDArrayCSR]))

(defn ->jcusparse-nd-array-csr
  "Constructor.

  The length of the values and columns arrays is equal to the number of non-zero elements in A.
  The length of the pointerB and pointerE arrays is equal to the number of rows in A.

  data - a double array that contains the non-zero element of the sparse matrix A - `double[]`
  columns-pointers - Element i of the integer array columns is the number of the column in A that contains the i-th valuein the values array. - `int[]`
  pointer-b - Element j of this integer array gives the index of the element in the values array that is firstnon-zero element in a row j of A. Note that this index is equal to pointerB(j) - pointerB(1)+1 . - `int[]`
  pointer-e - An integer array that contains row indices, such that pointerE(j)-pointerB(1) is the index of theelement in the values array that is last non-zero element in a row j of A. - `int[]`
  shape - Shape of the matrix A - `long[]`"
  (^JcusparseNDArrayCSR [data columns-pointers pointer-b pointer-e shape]
    (new JcusparseNDArrayCSR data columns-pointers pointer-b pointer-e shape)))

(defn to-flat-array
  "Description copied from interface: INDArray

  builder - the builder to use - `com.google.flatbuffers.FlatBufferBuilder`

  returns: the offset to add - `int`"
  (^Integer [^JcusparseNDArrayCSR this ^com.google.flatbuffers.FlatBufferBuilder builder]
    (-> this (.toFlatArray builder))))

(defn repeat
  "dimension - `int`
  repeats - `long`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JcusparseNDArrayCSR this ^Integer dimension ^Long repeats]
    (-> this (.repeat dimension repeats))))

(defn mmuli
  "other - `org.nd4j.linalg.api.ndarray.INDArray`
  result - `org.nd4j.linalg.api.ndarray.INDArray`
  transpose - `org.nd4j.linalg.api.blas.params.MMulTranspose`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JcusparseNDArrayCSR this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.blas.params.MMulTranspose transpose]
    (-> this (.mmuli other result transpose)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^JcusparseNDArrayCSR this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.blas.params.MMulTranspose transpose]
    (-> this (.mmuli other transpose))))

(defn mmul
  "Perform an copy matrix multiplication

  other - the other matrix to perform matrix multiply with - `org.nd4j.linalg.api.ndarray.INDArray`
  result - the result ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  m-mul-transpose - the transpose status of each array - `org.nd4j.linalg.api.blas.params.MMulTranspose`

  returns: the result of the matrix multiplication - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JcusparseNDArrayCSR this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.ndarray.INDArray result ^org.nd4j.linalg.api.blas.params.MMulTranspose m-mul-transpose]
    (-> this (.mmul other result m-mul-transpose)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^JcusparseNDArrayCSR this ^org.nd4j.linalg.api.ndarray.INDArray other ^org.nd4j.linalg.api.blas.params.MMulTranspose m-mul-transpose]
    (-> this (.mmul other m-mul-transpose))))

(defn reshape
  "order - `char`
  new-shape - `int`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JcusparseNDArrayCSR this ^Character order ^Integer new-shape]
    (-> this (.reshape order new-shape)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^JcusparseNDArrayCSR this shape]
    (-> this (.reshape shape))))

(defn empty?
  "This method returns true if this INDArray is special case: no-value INDArray

  returns: `boolean`"
  (^Boolean [^JcusparseNDArrayCSR this]
    (-> this (.isEmpty))))

(defn convert-to-doubles
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JcusparseNDArrayCSR this]
    (-> this (.convertToDoubles))))

(defn convert-to-halfs
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JcusparseNDArrayCSR this]
    (-> this (.convertToHalfs))))

(defn convert-to-floats
  "returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^JcusparseNDArrayCSR this]
    (-> this (.convertToFloats))))

