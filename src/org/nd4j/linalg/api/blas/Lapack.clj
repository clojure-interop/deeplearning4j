(ns org.nd4j.linalg.api.blas.Lapack
  "Lapack interface"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas Lapack]))

(defn gesvd
  "SVD decomposiiton of a matrix
  Factorize a matrix into its singular vectors and eigenvalues
  The decomposition is such that:
  A = U x S x VT
  gesvd = singular value decomposition (SVD) of a general matrix (GE)

  a - the input matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  s - the eigenvalues as a vector - `org.nd4j.linalg.api.ndarray.INDArray`
  u - the left singular vectors as a matrix. Maybe null if no S required - `org.nd4j.linalg.api.ndarray.INDArray`
  vt - the right singular vectors as a (transposed) matrix. Maybe null if no V required - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.lang.Error - - with a message to indicate failure (usu. bad params)"
  ([^Lapack this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray s ^org.nd4j.linalg.api.ndarray.INDArray u ^org.nd4j.linalg.api.ndarray.INDArray vt]
    (-> this (.gesvd a s u vt))))

(defn syev
  "Caclulate the eigenvalues and vectors of a symmetric matrix. The
  symmetric matrix means the results are guaranteed to be real (not complex)
  The matrix A is overridden by the eigenvectors. The eigenvalues
  are returned separately

  jobz - `char`
  uplo - `char`
  a - the input matrix, it will be overwritten with the eigenvectors - `org.nd4j.linalg.api.ndarray.INDArray`
  v - the resulting eigenvalues - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`

  throws: java.lang.Error - - with a message to indicate failure (usu. bad params)"
  (^Integer [^Lapack this ^Character jobz ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray v]
    (-> this (.syev jobz uplo a v))))

(defn get-u-factor
  "extracts the U (upper triangular) matrix from the LU factor result
  U will be n x n matrix where n = num cols in A

  a - - the combined L & U matrices returned from factorization - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Lapack this ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.getUFactor a))))

(defn geqrf
  "QR decomposiiton of a matrix
  Factorize a matrix A such that A = QR
  The matrix A is overwritten by the Q component (i.e. destroyed)
  geqrf = QR factorization of a general matrix (GE) into an orthogonal
  matrix Q and an upper triangular R matrix

  a - the input matrix, it will be overwritten with the factors - `org.nd4j.linalg.api.ndarray.INDArray`
  r - `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.lang.Error - - with a message to indicate failure (usu. bad params)"
  ([^Lapack this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r]
    (-> this (.geqrf a r))))

(defn getri
  "Generate inverse ggiven LU decomp

  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  lda - `int`
  ipiv - `int[]`
  work - `org.nd4j.linalg.api.ndarray.INDArray`
  lwork - `int`
  info - `int`"
  ([^Lapack this ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^Integer lda ipiv ^org.nd4j.linalg.api.ndarray.INDArray work ^Integer lwork ^Integer info]
    (-> this (.getri n a lda ipiv work lwork info))))

(defn getrf
  "LU decomposiiton of a matrix
  Factorize a matrix A
  The matrix A is overridden by the L & U combined.
  The permutation results are returned directly as a vector. To
  create the permutation matrix use getPFactor method
  To split out the L & U matrix use getLFactor and getUFactor methods
  getrf = triangular factorization (TRF) of a general matrix (GE)

  a - the input matrix, it will be overwritten with the factors - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.lang.Error - - with a message to indicate failure (usu. bad params)"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Lapack this ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.getrf a))))

(defn get-l-factor
  "extracts the L (lower triangular) matrix from the LU factor result
  L will be the same dimensions as A

  a - - the combined L & U matrices returned from factorization - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Lapack this ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.getLFactor a))))

(defn get-p-factor
  "This method takes one of the ipiv returns from LAPACK and creates
  the permutation matrix. When factorizing, it is useful to avoid underflows
  and overflows by reordering rows/and or columns of the input matrix (mostly
  these methods solve simultaneous equations, so order is not important).
  The ipiv method assumes that only row ordering is done ( never seen column
  ordering done )

  m - - the size of the permutation matrix ( usu. the # rows in factored matrix ) - `int`
  ipiv - - the vector returned from a refactoring - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Lapack this ^Integer m ^org.nd4j.linalg.api.ndarray.INDArray ipiv]
    (-> this (.getPFactor m ipiv))))

(defn potrf
  "Triangular decomposiiton of a positive definite matrix ( cholesky )
  Factorize a matrix A such that A = LL* (assuming lower==true) or
  A = U*U (a * represents conjugate i.e. if matrix is real U* is a transpose)
  The matrix A is overridden by the L (or U).
  potrf = LU factorization of a positive definite matrix (PO) into a
  lower L ( or upper U ) triangular matrix

  a - the input matrix, it will be overwritten with the factors - `org.nd4j.linalg.api.ndarray.INDArray`
  lower - `boolean`

  throws: java.lang.Error - - with a message to indicate failure (usu. bad params)"
  ([^Lapack this ^org.nd4j.linalg.api.ndarray.INDArray a ^Boolean lower]
    (-> this (.potrf a lower))))

