(ns org.nd4j.linalg.jcublas.blas.JcublasLapack
  "JCublas lapack"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas.blas JcublasLapack]))

(defn ->jcublas-lapack
  "Constructor."
  (^JcublasLapack []
    (new JcublasLapack )))

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
  ([^JcublasLapack this ^Byte jobu ^Byte jobvt ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray s ^org.nd4j.linalg.api.ndarray.INDArray u ^org.nd4j.linalg.api.ndarray.INDArray vt ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.dgesvd jobu jobvt m n a s u vt info))))

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
  ([^JcublasLapack this ^Byte jobu ^Byte jobvt ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray s ^org.nd4j.linalg.api.ndarray.INDArray u ^org.nd4j.linalg.api.ndarray.INDArray vt ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.sgesvd jobu jobvt m n a s u vt info))))

(defn dgeqrf
  "m - `int`
  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  r - `org.nd4j.linalg.api.ndarray.INDArray`
  info - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^JcublasLapack this ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.dgeqrf m n a r info))))

(defn sgeqrf
  "Description copied from class: BaseLapack

  m - the number of rows in the matrix A - `int`
  n - the number of cols in the matrix A - `int`
  a - the matrix to factorize - data must be in column order ( create with 'f' ordering ) - `org.nd4j.linalg.api.ndarray.INDArray`
  r - an output array for other part of factorization - `org.nd4j.linalg.api.ndarray.INDArray`
  info - error details 1 int array, a positive number (i) implies row i cannot be factored, a negative value implies paramtere i is invalid - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^JcublasLapack this ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.sgeqrf m n a r info))))

(defn sgetrf
  "Description copied from class: BaseLapack

  m - the number of rows in the matrix A - `int`
  n - the number of cols in the matrix A - `int`
  a - the matrix to factorize - data must be in column order ( create with 'f' ordering ) - `org.nd4j.linalg.api.ndarray.INDArray`
  ipiv - an output array for the permutations ( must be int based storage ) - `org.nd4j.linalg.api.ndarray.INDArray`
  info - error details 1 int array, a positive number (i) implies row i cannot be factored, a negative value implies paramtere i is invalid - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^JcublasLapack this ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray ipiv ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.sgetrf m n a ipiv info))))

(defn getri
  "Generate inverse ggiven LU decomp

  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  lda - `int`
  ipiv - `int[]`
  work - `org.nd4j.linalg.api.ndarray.INDArray`
  lwork - `int`
  info - `int`"
  ([^JcublasLapack this ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^Integer lda ipiv ^org.nd4j.linalg.api.ndarray.INDArray work ^Integer lwork ^Integer info]
    (-> this (.getri n a lda ipiv work lwork info))))

(defn spotrf
  "Description copied from class: BaseLapack

  uplo - which factor to return L or U - `byte`
  n - `int`
  a - the matrix to factorize - data must be in column order ( create with 'f' ordering ) - `org.nd4j.linalg.api.ndarray.INDArray`
  info - error details 1 int array, a positive number (i) implies row i cannot be factored, a negative value implies paramtere i is invalid - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^JcublasLapack this ^Byte uplo ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.spotrf uplo n a info))))

(defn ssyev
  "Description copied from class: BaseLapack

  jobz - 'N' - no eigen vectors, 'V' - return eigenvectors - `char`
  uplo - upper or lower part of symmetric matrix to use - `char`
  n - the number of rows & cols in the matrix A - `int`
  a - the matrix to calculate eigenvectors - `org.nd4j.linalg.api.ndarray.INDArray`
  r - an output array for eigenvalues ( may be null ) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^JcublasLapack this ^Character jobz ^Character uplo ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r]
    (-> this (.ssyev jobz uplo n a r))))

(defn dgetrf
  "m - `int`
  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  ipiv - `org.nd4j.linalg.api.ndarray.INDArray`
  info - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^JcublasLapack this ^Integer m ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray ipiv ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.dgetrf m n a ipiv info))))

(defn dpotrf
  "uplo - `byte`
  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  info - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^JcublasLapack this ^Byte uplo ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray info]
    (-> this (.dpotrf uplo n a info))))

(defn dsyev
  "jobz - `char`
  uplo - `char`
  n - `int`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  r - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^JcublasLapack this ^Character jobz ^Character uplo ^Integer n ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray r]
    (-> this (.dsyev jobz uplo n a r))))

