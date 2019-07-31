(ns org.nd4j.linalg.api.blas.impl.SparseBaseLapack
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.impl SparseBaseLapack]))

(defn ->sparse-base-lapack
  "Constructor."
  (^SparseBaseLapack []
    (new SparseBaseLapack )))

(defn gesvd
  "Description copied from interface: Lapack

  a - the input matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  s - the eigenvalues as a vector - `org.nd4j.linalg.api.ndarray.INDArray`
  u - the left singular vectors as a matrix. Maybe null if no S required - `org.nd4j.linalg.api.ndarray.INDArray`
  vt - the right singular vectors as a (transposed) matrix. Maybe null if no V required - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray s ^org.nd4j.linalg.api.ndarray.INDArray u ^org.nd4j.linalg.api.ndarray.INDArray vt]
    (-> this (.gesvd a s u vt))))

(defn syev
  "Description copied from interface: Lapack

  jobz - `char`
  uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  v - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^SparseBaseLapack this ^Character jobz ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray v]
    (-> this (.syev jobz uplo a v))))

(defn get-u-factor
  "Description copied from interface: Lapack

  a - - the combined L & U matrices returned from factorization - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SparseBaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.getUFactor a))))

(defn geqrf
  "Description copied from interface: Lapack

  a - the input matrix, it will be overwritten with the factors - `org.nd4j.linalg.api.ndarray.INDArray`
  r - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r]
    (-> this (.geqrf a r))))

(defn getri
  "Description copied from interface: Lapack

  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  lda - `int`
  ipiv - `int[]`
  work - `org.nd4j.linalg.api.ndarray.INDArray`
  lwork - `int`
  info - `int`"
  ([^SparseBaseLapack this ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^Integer lda ipiv ^org.nd4j.linalg.api.ndarray.INDArray work ^Integer lwork ^Integer info]
    (-> this (.getri n a lda ipiv work lwork info))))

(defn getrf
  "Description copied from interface: Lapack

  a - the input matrix, it will be overwritten with the factors - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SparseBaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.getrf a))))

(defn get-l-factor
  "Description copied from interface: Lapack

  a - - the combined L & U matrices returned from factorization - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SparseBaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.getLFactor a))))

(defn get-p-factor
  "Description copied from interface: Lapack

  m - - the size of the permutation matrix ( usu. the # rows in factored matrix ) - `int`
  ipiv - - the vector returned from a refactoring - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SparseBaseLapack this ^Integer m ^org.nd4j.linalg.api.ndarray.INDArray ipiv]
    (-> this (.getPFactor m ipiv))))

(defn potrf
  "Description copied from interface: Lapack

  a - the input matrix, it will be overwritten with the factors - `org.nd4j.linalg.api.ndarray.INDArray`
  lower - `boolean`"
  ([^SparseBaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a ^Boolean lower]
    (-> this (.potrf a lower))))

