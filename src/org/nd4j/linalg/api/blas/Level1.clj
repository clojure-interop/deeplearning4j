(ns org.nd4j.linalg.api.blas.Level1
  "Level 1 blas implementations.
 Incx and other parameters are inferred
 from the given ndarrays.
 To avoid boxing, doubles are used in place of normal numbers.
 The underlying implementation will call the proper data opType.
 This is a fortran 95 style api that gives us the efficiency
 and flexibility of the fortran 77 api
 Credit to:
 https://www.ualberta.ca/AICT/RESEARCH/LinuxClusters/doc/mkl81/mklqref/blaslev1.htm
 for the descriptions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas Level1]))

(defn iamin
  "finds the element of a vector that has the minimum absolute value.

  arr - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^Level1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.iamin arr))))

(defn copy
  "copy a vector to another vector.

  n - `long`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`
  y - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-y - `int`
  incr-y - `int`"
  ([^Level1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.copy n x offset-x incr-x y offset-y incr-y)))
  ([^Level1 this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.copy x y))))

(defn supports-data-buffer-l-1-ops
  "Can we use the axpy and copy methods that take a DataBuffer instead of an INDArray with this backend?

  returns: `boolean`"
  (^Boolean [^Level1 this]
    (-> this (.supportsDataBufferL1Ops))))

(defn iamax
  "Index of largest absolute value

  n - `long`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`

  returns: `int`"
  (^Integer [^Level1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x]
    (-> this (.iamax n x offset-x incr-x)))
  (^Integer [^Level1 this ^Long n ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer stride]
    (-> this (.iamax n arr stride)))
  (^Integer [^Level1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.iamax arr))))

(defn dot
  "Vector-vector dot product

  n - `long`
  dx - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`
  y - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-y - `int`
  incr-y - `int`

  returns: `double`"
  (^Double [^Level1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer dx ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.dot n dx offset-x incr-x y offset-y incr-y)))
  (^Double [^Level1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.dot n alpha x y))))

(defn rot
  "performs rotation of points in the plane.

  n - `long`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `double`
  s - `double`"
  ([^Level1 this ^Long n ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Double c ^Double s]
    (-> this (.rot n x y c s))))

(defn axpy
  "computes a vector-scalar product and adds the result to a vector.
  y = a*x  y

  n - `long`
  alpha - `double`
  x - X - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - offset of first element of X in buffer - `int`
  incr-x - increment/stride between elements of X in buffer - `int`
  y - Y - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-y - offset of first element of Y in buffer - `int`
  incr-y - increment/stride between elements of Y in buffer - `int`"
  ([^Level1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.axpy n alpha x offset-x incr-x y offset-y incr-y)))
  ([^Level1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.axpy n alpha x y))))

(defn asum
  "sum of magnitudes of all elements

  n - `long`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`

  returns: `double`"
  (^Double [^Level1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x]
    (-> this (.asum n x offset-x incr-x)))
  (^Double [^Level1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.asum arr))))

(defn nrm-2
  "computes the Euclidean norm of a vector.

  arr - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^Level1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.nrm2 arr))))

(defn scal
  "computes a vector by a scalar product.

  n - `long`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.scal n alpha x))))

(defn rotmg
  "computes the modified parameters for a Givens rotation.

  d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`
  b-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  b-2 - `double`
  p - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level1 this ^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2 ^org.nd4j.linalg.api.ndarray.INDArray b-1 ^Double b-2 ^org.nd4j.linalg.api.ndarray.INDArray p]
    (-> this (.rotmg d-1 d-2 b-1 b-2 p))))

(defn rotg
  "computes parameters for a Givens rotation.

  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `org.nd4j.linalg.api.ndarray.INDArray`
  s - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level1 this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c ^org.nd4j.linalg.api.ndarray.INDArray s]
    (-> this (.rotg a b c s))))

(defn swap
  "swaps a vector with another vector.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level1 this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.swap x y))))

