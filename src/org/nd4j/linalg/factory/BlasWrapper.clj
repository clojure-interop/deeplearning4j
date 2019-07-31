(ns org.nd4j.linalg.factory.BlasWrapper
  "This class provides a cleaner direct interface to the BLAS routines by extracting the parameters of the matrices from
 the matrices itself.

 For example, you can just pass the vector and do not have to pass the length, corresponding DoubleBuffer, offset and
 step size explicitly.

 Currently, all the general matrix routines are implemented."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.factory BlasWrapper]))

(defn syevx
  "jobz - `char`
  range - `char`
  uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  vl - `double`
  vu - `double`
  il - `int`
  iu - `int`
  abstol - `double`
  w - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BlasWrapper this ^Character jobz ^Character range ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^Double vl ^Double vu ^Integer il ^Integer iu ^Double abstol ^org.nd4j.linalg.api.ndarray.INDArray w ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.syevx jobz range uplo a vl vu il iu abstol w z))))

(defn copy
  "Compute y <- x (copy a matrix)

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.copy x y))))

(defn lapack
  "LAPack interface

  returns: `org.nd4j.linalg.api.blas.Lapack`"
  (^org.nd4j.linalg.api.blas.Lapack [^BlasWrapper this]
    (-> this (.lapack))))

(defn sysv
  "uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  ipiv - `int[]`
  b - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BlasWrapper this ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ipiv ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.sysv uplo a ipiv b))))

(defn iamax
  "Compute index of element with largest absolute value (index of absolute
  value maximum)

  x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.iamax x))))

(defn syev
  "jobz - `char`
  uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  w - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BlasWrapper this ^Character jobz ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray w]
    (-> this (.syev jobz uplo a w))))

(defn geqrf
  "a - `org.nd4j.linalg.api.ndarray.INDArray`
  tau - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray tau]
    (-> this (.geqrf a tau))))

(defn check-info
  "name - `java.lang.String`
  info - `int`"
  ([^BlasWrapper this ^java.lang.String name ^Integer info]
    (-> this (.checkInfo name info))))

(defn dot
  "Compute x^T * y (dot product)

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.dot x y))))

(defn gemm
  "Deprecated.

  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BlasWrapper this ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.gemm alpha a b beta c))))

(defn gesv
  "************************************************************************
  LAPACK

  a - `org.nd4j.linalg.api.ndarray.INDArray`
  ipiv - `int[]`
  b - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray a ipiv ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.gesv a ipiv b))))

(defn saxpy
  "Deprecated.

  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BlasWrapper this ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.saxpy alpha x y))))

(defn axpy
  "Compute y <- y  x * alpha

  da - the alpha to multiply by - `java.lang.Number`
  dx - `org.nd4j.linalg.api.ndarray.INDArray`
  dy - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BlasWrapper this ^java.lang.Number da ^org.nd4j.linalg.api.ndarray.INDArray dx ^org.nd4j.linalg.api.ndarray.INDArray dy]
    (-> this (.axpy da dx dy))))

(defn level-2
  "Return the level 2 functions
  for this blas impl

  returns: `org.nd4j.linalg.api.blas.Level2`"
  (^org.nd4j.linalg.api.blas.Level2 [^BlasWrapper this]
    (-> this (.level2))))

(defn asum
  "Compute || x ||_1 (1-norm, sum of absolute values)

  x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.asum x))))

(defn level-3
  "Return the level 3 functions
  for this blas impl

  returns: `org.nd4j.linalg.api.blas.Level3`"
  (^org.nd4j.linalg.api.blas.Level3 [^BlasWrapper this]
    (-> this (.level3))))

(defn posv
  "uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BlasWrapper this ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.posv uplo a b))))

(defn syevd
  "jobz - `char`
  uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  w - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BlasWrapper this ^Character jobz ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray w]
    (-> this (.syevd jobz uplo a w))))

(defn geev
  "jobvl - `char`
  jobvr - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  wr - `org.nd4j.linalg.api.ndarray.INDArray`
  wi - `org.nd4j.linalg.api.ndarray.INDArray`
  vl - `org.nd4j.linalg.api.ndarray.INDArray`
  vr - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BlasWrapper this ^Character jobvl ^Character jobvr ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray wr ^org.nd4j.linalg.api.ndarray.INDArray wi ^org.nd4j.linalg.api.ndarray.INDArray vl ^org.nd4j.linalg.api.ndarray.INDArray vr]
    (-> this (.geev jobvl jobvr a wr wi vl vr))))

(defn ger
  "Compute A <- alpha * x * y^T  A (general rank-1 update)

  alpha - `float`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  a - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BlasWrapper this ^Float alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.ger alpha x y a))))

(defn nrm-2
  "Compute || x ||_2 (2-norm)

  x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.nrm2 x))))

(defn gelsd
  "Generalized Least Squares via *GELSD.

  Note that B must be padded to contain the solution matrix. This occurs when A has fewer rows
  than columns.

  For example: in A * X = B, A is (m,n), X is (n,k) and B is (m,k). Now if m < n, since B is overwritten to contain
  the solution (in classical LAPACK style), B needs to be padded to be an (n,k) matrix.

  Likewise, if m > n, the solution consists only of the first n rows of B.

  a - an (m,n) matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  b - an (max(m,n), k) matrix (well, at least) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.gelsd a b))))

(defn scal
  "Deprecated.

  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BlasWrapper this ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.scal alpha x))))

(defn gemv
  "************************************************************************
  BLAS Level 2

  alpha - `java.lang.Number`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BlasWrapper this ^java.lang.Number alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.gemv alpha a x beta y))))

(defn level-1
  "Return the level 1 functions
  for this blas impl

  returns: `org.nd4j.linalg.api.blas.Level1`"
  (^org.nd4j.linalg.api.blas.Level1 [^BlasWrapper this]
    (-> this (.level1))))

(defn syevr
  "jobz - `char`
  range - `char`
  uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  vl - `float`
  vu - `float`
  il - `int`
  iu - `int`
  abstol - `java.lang.Number`
  w - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`
  isuppz - `int[]`

  returns: `int`"
  (^Integer [^BlasWrapper this ^Character jobz ^Character range ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^Float vl ^Float vu ^Integer il ^Integer iu ^java.lang.Number abstol ^org.nd4j.linalg.api.ndarray.INDArray w ^org.nd4j.linalg.api.ndarray.INDArray z isuppz]
    (-> this (.syevr jobz range uplo a vl vu il iu abstol w z isuppz))))

(defn sygvd
  "itype - `int`
  jobz - `char`
  uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  w - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BlasWrapper this ^Integer itype ^Character jobz ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray w]
    (-> this (.sygvd itype jobz uplo a b w))))

(defn ormqr
  "side - `char`
  trans - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  tau - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BlasWrapper this ^Character side ^Character trans ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray tau ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.ormqr side trans a tau c))))

(defn swap
  "Compute x <-> y (swap two matrices)

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.swap x y))))

