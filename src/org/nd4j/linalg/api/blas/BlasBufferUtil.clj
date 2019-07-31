(ns org.nd4j.linalg.api.blas.BlasBufferUtil
  "Blas buffer util for interopping with the underlying buffers
 and the given ndarrays"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas BlasBufferUtil]))

(defn ->blas-buffer-util
  "Constructor."
  (^BlasBufferUtil []
    (new BlasBufferUtil )))

(defn *set-data
  "Set the data for the underlying array.
  If the underlying buffer's array is equivalent to this array
  it returns (avoiding an unneccessary copy)
  If the underlying storage mechanism isn't heap (no arrays)
  it just copied the data over (strided access with offsets where neccessary)
  This is meant to be used with blas operations where the underlying blas implementation
  takes an array but the data buffer being used might not be an array.
  This is also for situations where there is strided access and it's not
  optimal to want to use the whole data buffer but just the subset of the
  buffer needed for calculations.

  data - the data to set - `float[]`
  to-set - the array to set the data to - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([data ^org.nd4j.linalg.api.ndarray.INDArray to-set]
    (BlasBufferUtil/setData data to-set)))

(defn *get-blas-offset
  "Get blas stride for the
  given array

  arr - the array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the blas stride - `int`"
  (^Integer [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (BlasBufferUtil/getBlasOffset arr)))

(defn *get-blas-stride
  "Get blas stride for the
  given array

  arr - the array - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the blas stride - `int`"
  (^Integer [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (BlasBufferUtil/getBlasStride arr)))

(defn *get-double-data
  "Returns the double data
  for this ndarray.
  If possible (the offset is 0 representing the whole buffer)
  it will return a direct reference to the underlying array

  buf - the ndarray to get the data for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the double data for this ndarray - `double[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray buf]
    (BlasBufferUtil/getDoubleData buf)))

(defn *get-dimension
  "Get the dimension associated with
  the given ordering.
  When working with blas routines, they typically assume
  c ordering, instead you can invert the rows/columns
  which enable you to do no copy blas operations.

  arr - `org.nd4j.linalg.api.ndarray.INDArray`
  default-rows - `boolean`

  returns: `int`"
  (^Integer [^org.nd4j.linalg.api.ndarray.INDArray arr ^Boolean default-rows]
    (BlasBufferUtil/getDimension arr default-rows)))

(defn *get-ld
  "Get the leading dimension
  for a blas invocation.
  The lead dimension is usually
  arr.size(0) (this is only for fortran ordering though).
  It can be size(1) (assuming matrix) for C ordering though.

  arr - the array to - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the leading dimension wrt the ordering of the array - `int`"
  (^Integer [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (BlasBufferUtil/getLd arr)))

(defn *get-stride-for-ordering
  "Return the proper stride
  through a vector
  relative to the ordering of the array
  This is for incX/incY parameters in BLAS.

  arr - the array to get the stride for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the stride wrt the ordering
  for the given array - `int`"
  (^Integer [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (BlasBufferUtil/getStrideForOrdering arr)))

(defn *get-char-for-transpose
  "Returns the proper character for
  how to interpret a buffer (fortran being N C being T)

  arr - the array to get the transpose for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the character for transpose of a particular
  array - `char`"
  (^Character [^org.nd4j.linalg.api.ndarray.INDArray arr]
    (BlasBufferUtil/getCharForTranspose arr)))

(defn *get-float-data
  "Returns the float data
  for this ndarray.
  If possible (the offset is 0 representing the whole buffer)
  it will return a direct reference to the underlying array

  buf - the ndarray to get the data for - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the float data for this ndarray - `float[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray buf]
    (BlasBufferUtil/getFloatData buf)))

