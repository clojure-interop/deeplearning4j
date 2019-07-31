(ns org.nd4j.linalg.api.blas.impl.BaseLapack
  "Base lapack define float and double versions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.impl BaseLapack]))

(defn ->base-lapack
  "Constructor."
  (^BaseLapack []
    (new BaseLapack )))

(defn gesvd
  "Description copied from interface: Lapack

  a - the input matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  s - the eigenvalues as a vector - `org.nd4j.linalg.api.ndarray.INDArray`
  u - the left singular vectors as a matrix. Maybe null if no S required - `org.nd4j.linalg.api.ndarray.INDArray`
  vt - the right singular vectors as a (transposed) matrix. Maybe null if no V required - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray s ^org.nd4j.linalg.api.ndarray.INDArray u ^org.nd4j.linalg.api.ndarray.INDArray vt]
    (-> this (.gesvd a s u vt))))

(defn dgesvd
  "jobu - `byte`
  jobvt - `byte`
  m - `int`
  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  s - `org.nd4j.linalg.api.ndarray.INDArray`
  u - `org.nd4j.linalg.api.ndarray.INDArray`
  vt - `org.nd4j.linalg.api.ndarray.INDArray`
  info - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLapack this ^Byte jobu ^Byte jobvt ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray s ^org.nd4j.linalg.api.ndarray.INDArray u ^org.nd4j.linalg.api.ndarray.INDArray vt ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.dgesvd jobu jobvt m n a s u vt info))))

(defn syev
  "Description copied from interface: Lapack

  jobz - `char`
  uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  v - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BaseLapack this ^Character jobz ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray v]
    (-> this (.syev jobz uplo a v))))

(defn get-u-factor
  "Description copied from interface: Lapack

  a - - the combined L & U matrices returned from factorization - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.getUFactor a))))

(defn geqrf
  "Description copied from interface: Lapack

  a - the input matrix, it will be overwritten with the factors - `org.nd4j.linalg.api.ndarray.INDArray`
  r - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r]
    (-> this (.geqrf a r))))

(defn sgesvd
  "jobu - `byte`
  jobvt - `byte`
  m - `int`
  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  s - `org.nd4j.linalg.api.ndarray.INDArray`
  u - `org.nd4j.linalg.api.ndarray.INDArray`
  vt - `org.nd4j.linalg.api.ndarray.INDArray`
  info - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLapack this ^Byte jobu ^Byte jobvt ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray s ^org.nd4j.linalg.api.ndarray.INDArray u ^org.nd4j.linalg.api.ndarray.INDArray vt ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.sgesvd jobu jobvt m n a s u vt info))))

(defn dgeqrf
  "m - `int`
  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  r - `org.nd4j.linalg.api.ndarray.INDArray`
  info - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLapack this ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.dgeqrf m n a r info))))

(defn sgeqrf
  "Float/Double versions of QR decomp.
  This is the official LAPACK interface (in case you want to call this directly)
  See geqrf for full details on LU Decomp

  m - the number of rows in the matrix A - `int`
  n - the number of cols in the matrix A - `int`
  a - the matrix to factorize - data must be in column order ( create with 'f' ordering ) - `org.nd4j.linalg.api.ndarray.INDArray`
  r - an output array for other part of factorization - `org.nd4j.linalg.api.ndarray.INDArray`
  info - error details 1 int array, a positive number (i) implies row i cannot be factored, a negative value implies paramtere i is invalid - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLapack this ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.sgeqrf m n a r info))))

(defn sgetrf
  "Float/Double versions of LU decomp.
  This is the official LAPACK interface (in case you want to call this directly)
  See getrf for full details on LU Decomp

  m - the number of rows in the matrix A - `int`
  n - the number of cols in the matrix A - `int`
  a - the matrix to factorize - data must be in column order ( create with 'f' ordering ) - `org.nd4j.linalg.api.ndarray.INDArray`
  ipiv - an output array for the permutations ( must be int based storage ) - `org.nd4j.linalg.api.ndarray.INDArray`
  info - error details 1 int array, a positive number (i) implies row i cannot be factored, a negative value implies paramtere i is invalid - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLapack this ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray ipiv ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.sgetrf m n a ipiv info))))

(defn getrf
  "Description copied from interface: Lapack

  a - the input matrix, it will be overwritten with the factors - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.getrf a))))

(defn spotrf
  "Float/Double versions of cholesky decomp for positive definite matrices
  A = LL*

  uplo - which factor to return L or U - `byte`
  n - `int`
  a - the matrix to factorize - data must be in column order ( create with 'f' ordering ) - `org.nd4j.linalg.api.ndarray.INDArray`
  info - error details 1 int array, a positive number (i) implies row i cannot be factored, a negative value implies paramtere i is invalid - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLapack this ^Byte uplo ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.spotrf uplo n a info))))

(defn ssyev
  "Float/Double versions of eigen value/vector calc.

  jobz - 'N' - no eigen vectors, 'V' - return eigenvectors - `char`
  uplo - upper or lower part of symmetric matrix to use - `char`
  n - the number of rows & cols in the matrix A - `int`
  a - the matrix to calculate eigenvectors - `org.nd4j.linalg.api.ndarray.INDArray`
  r - an output array for eigenvalues ( may be null ) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BaseLapack this ^Character jobz ^Character uplo ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r]
    (-> this (.ssyev jobz uplo n a r))))

(defn dgetrf
  "m - `int`
  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  ipiv - `org.nd4j.linalg.api.ndarray.INDArray`
  info - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLapack this ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray ipiv ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.dgetrf m n a ipiv info))))

(defn dpotrf
  "uplo - `byte`
  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  info - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLapack this ^Byte uplo ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.dpotrf uplo n a info))))

(defn get-l-factor
  "Description copied from interface: Lapack

  a - - the combined L & U matrices returned from factorization - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.getLFactor a))))

(defn get-p-factor
  "Description copied from interface: Lapack

  m - - the size of the permutation matrix ( usu. the # rows in factored matrix ) - `int`
  ipiv - - the vector returned from a refactoring - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseLapack this ^Integer m ^org.nd4j.linalg.api.ndarray.INDArray ipiv]
    (-> this (.getPFactor m ipiv))))

(defn dsyev
  "jobz - `char`
  uplo - `char`
  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  r - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BaseLapack this ^Character jobz ^Character uplo ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r]
    (-> this (.dsyev jobz uplo n a r))))

(defn potrf
  "Description copied from interface: Lapack

  a - the input matrix, it will be overwritten with the factors - `org.nd4j.linalg.api.ndarray.INDArray`
  lower - `boolean`"
  ([^BaseLapack this ^org.nd4j.linalg.api.ndarray.INDArray a ^Boolean lower]
    (-> this (.potrf a lower))))

