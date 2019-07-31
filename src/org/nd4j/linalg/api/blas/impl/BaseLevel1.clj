(ns org.nd4j.linalg.api.blas.impl.BaseLevel1
  "Base class for level 1 functions, abstract headers pulled from:
 http://www.netlib.org/blas/blast-forum/cblas.h"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.impl BaseLevel1]))

(defn ->base-level-1
  "Constructor."
  (^BaseLevel1 []
    (new BaseLevel1 )))

(defn iamin
  "finds the element of a vector that has the minimum absolute value.

  arr - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
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
  ([^BaseLevel1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.copy n x offset-x incr-x y offset-y incr-y)))
  ([^BaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.copy x y))))

(defn supports-data-buffer-l-1-ops
  "Description copied from interface: Level1

  returns: `boolean`"
  (^Boolean [^BaseLevel1 this]
    (-> this (.supportsDataBufferL1Ops))))

(defn iamax
  "Description copied from interface: Level1

  n - `long`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`

  returns: `int`"
  (^Integer [^BaseLevel1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x]
    (-> this (.iamax n x offset-x incr-x)))
  (^Integer [^BaseLevel1 this ^Long n ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer stride]
    (-> this (.iamax n arr stride)))
  (^Integer [^BaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.iamax arr))))

(defn dot
  "Description copied from interface: Level1

  n - `long`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`
  y - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-y - `int`
  incr-y - `int`

  returns: `double`"
  (^Double [^BaseLevel1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.dot n x offset-x incr-x y offset-y incr-y)))
  (^Double [^BaseLevel1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.dot n alpha x y))))

(defn rot
  "performs rotation of points in the plane.

  n - `long`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `double`
  s - `double`"
  ([^BaseLevel1 this ^Long n ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Double c ^Double s]
    (-> this (.rot n x y c s))))

(defn axpy
  "Description copied from interface: Level1

  n - `long`
  alpha - `double`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`
  y - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-y - `int`
  incr-y - `int`"
  ([^BaseLevel1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.axpy n alpha x offset-x incr-x y offset-y incr-y)))
  ([^BaseLevel1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.axpy n alpha x y))))

(defn asum
  "Description copied from interface: Level1

  n - `long`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`

  returns: `double`"
  (^Double [^BaseLevel1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x]
    (-> this (.asum n x offset-x incr-x)))
  (^Double [^BaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.asum arr))))

(defn nrm-2
  "computes the Euclidean norm of a vector.

  arr - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.nrm2 arr))))

(defn scal
  "computes a vector by a scalar product.

  n - `long`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLevel1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.scal n alpha x))))

(defn rotmg
  "computes the modified parameters for a Givens rotation.

  d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`
  b-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  b-2 - `double`
  p - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2 ^org.nd4j.linalg.api.ndarray.INDArray b-1 ^Double b-2 ^org.nd4j.linalg.api.ndarray.INDArray p]
    (-> this (.rotmg d-1 d-2 b-1 b-2 p))))

(defn rotg
  "computes parameters for a Givens rotation.

  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `org.nd4j.linalg.api.ndarray.INDArray`
  s - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c ^org.nd4j.linalg.api.ndarray.INDArray s]
    (-> this (.rotg a b c s))))

(defn swap
  "swaps a vector with another vector.

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.swap x y))))

