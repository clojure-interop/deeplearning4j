(ns org.nd4j.linalg.api.blas.impl.SparseBaseLevel1
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.impl SparseBaseLevel1]))

(defn ->sparse-base-level-1
  "Constructor."
  (^SparseBaseLevel1 []
    (new SparseBaseLevel1 )))

(defn iamin
  "Find the index of the element with maximum absolute value

  arr - a vector - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the index of the element with minimum absolute value - `int`"
  (^Integer [^SparseBaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.iamin arr))))

(defn copy
  "Description copied from interface: Level1

  n - `long`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`
  y - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-y - `int`
  incr-y - `int`"
  ([^SparseBaseLevel1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.copy n x offset-x incr-x y offset-y incr-y)))
  ([^SparseBaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.copy x y))))

(defn supports-data-buffer-l-1-ops
  "Description copied from interface: Level1

  returns: `boolean`"
  (^Boolean [^SparseBaseLevel1 this]
    (-> this (.supportsDataBufferL1Ops))))

(defn iamax
  "Description copied from interface: Level1

  n - `long`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`

  returns: `int`"
  (^Integer [^SparseBaseLevel1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x]
    (-> this (.iamax n x offset-x incr-x)))
  (^Integer [^SparseBaseLevel1 this ^Long n ^org.nd4j.linalg.api.ndarray.INDArray arr ^Integer stride]
    (-> this (.iamax n arr stride)))
  (^Integer [^SparseBaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.iamax arr))))

(defn dot
  "Description copied from interface: Level1

  n - `long`
  dx - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`
  y - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-y - `int`
  incr-y - `int`

  returns: `double`"
  (^Double [^SparseBaseLevel1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer dx ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.dot n dx offset-x incr-x y offset-y incr-y)))
  (^Double [^SparseBaseLevel1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.dot n alpha x y))))

(defn rot
  "Applies Givens rotation to sparse vectors one of which is in compressed form.

  n - The number of elements in vectors X and Y - `long`
  x - a sparse vector - `org.nd4j.linalg.api.ndarray.INDArray`
  y - a full-storage vector - `org.nd4j.linalg.api.ndarray.INDArray`
  c - a scalar - `double`
  s - a scalar - `double`"
  ([^SparseBaseLevel1 this ^Long n ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^Double c ^Double s]
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
  ([^SparseBaseLevel1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x ^org.nd4j.linalg.api.buffer.DataBuffer y ^Integer offset-y ^Integer incr-y]
    (-> this (.axpy n alpha x offset-x incr-x y offset-y incr-y)))
  ([^SparseBaseLevel1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.axpy n alpha x y))))

(defn asum
  "Description copied from interface: Level1

  n - `long`
  x - `org.nd4j.linalg.api.buffer.DataBuffer`
  offset-x - `int`
  incr-x - `int`

  returns: `double`"
  (^Double [^SparseBaseLevel1 this ^Long n ^org.nd4j.linalg.api.buffer.DataBuffer x ^Integer offset-x ^Integer incr-x]
    (-> this (.asum n x offset-x incr-x)))
  (^Double [^SparseBaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.asum arr))))

(defn nrm-2
  "Computes the Euclidean norm of a vector.

  arr - a vector - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the Euclidean norm of the vector - `double`"
  (^Double [^SparseBaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray arr]
    (-> this (.nrm2 arr))))

(defn scal
  "Computes the product of a vector by a scalar.

  n - The number of elements of the vector X - `long`
  alpha - a scalar - `double`
  x - a vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel1 this ^Long n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.scal n alpha x))))

(defn rotmg
  "Description copied from interface: Level1

  d-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  d-2 - `org.nd4j.linalg.api.ndarray.INDArray`
  b-1 - `org.nd4j.linalg.api.ndarray.INDArray`
  b-2 - `double`
  p - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray d-1 ^org.nd4j.linalg.api.ndarray.INDArray d-2 ^org.nd4j.linalg.api.ndarray.INDArray b-1 ^Double b-2 ^org.nd4j.linalg.api.ndarray.INDArray p]
    (-> this (.rotmg d-1 d-2 b-1 b-2 p))))

(defn rotg
  "Description copied from interface: Level1

  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `org.nd4j.linalg.api.ndarray.INDArray`
  s - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c ^org.nd4j.linalg.api.ndarray.INDArray s]
    (-> this (.rotg a b c s))))

(defn swap
  "Description copied from interface: Level1

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel1 this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.swap x y))))

