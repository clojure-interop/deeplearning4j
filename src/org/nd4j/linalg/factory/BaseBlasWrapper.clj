(ns org.nd4j.linalg.factory.BaseBlasWrapper
  "Base implementation of a blas wrapper that
 delegates things to the underlying level.
 This is a migration tool to preserve the old api
 while allowing for migration to the newer one."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.factory BaseBlasWrapper]))

(defn ->base-blas-wrapper
  "Constructor."
  (^BaseBlasWrapper []
    (new BaseBlasWrapper )))

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
  (^Integer [^BaseBlasWrapper this ^Character jobz ^Character range ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^Double vl ^Double vu ^Integer il ^Integer iu ^Double abstol ^org.nd4j.linalg.api.ndarray.INDArray w ^org.nd4j.linalg.api.ndarray.INDArray z]
    (-> this (.syevx jobz range uplo a vl vu il iu abstol w z))))

(defn copy
  "Description copied from interface: BlasWrapper

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseBlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.copy x y))))

(defn lapack
  "Description copied from interface: BlasWrapper

  returns: `org.nd4j.linalg.api.blas.Lapack`"
  (^org.nd4j.linalg.api.blas.Lapack [^BaseBlasWrapper this]
    (-> this (.lapack))))

(defn sysv
  "uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  ipiv - `int[]`
  b - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseBlasWrapper this ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ipiv ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.sysv uplo a ipiv b))))

(defn iamax
  "Description copied from interface: BlasWrapper

  x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BaseBlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.iamax x))))

(defn syev
  "jobz - `char`
  uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  w - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BaseBlasWrapper this ^Character jobz ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray w]
    (-> this (.syev jobz uplo a w))))

(defn geqrf
  "a - `org.nd4j.linalg.api.ndarray.INDArray`
  tau - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseBlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray tau]
    (-> this (.geqrf a tau))))

(defn check-info
  "name - `java.lang.String`
  info - `int`"
  ([^BaseBlasWrapper this ^java.lang.String name ^Integer info]
    (-> this (.checkInfo name info))))

(defn dot
  "Description copied from interface: BlasWrapper

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BaseBlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.dot x y))))

(defn gemm
  "Description copied from interface: BlasWrapper

  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseBlasWrapper this ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.gemm alpha a b beta c))))

(defn gesv
  "Description copied from interface: BlasWrapper

  a - `org.nd4j.linalg.api.ndarray.INDArray`
  ipiv - `int[]`
  b - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseBlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray a ipiv ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.gesv a ipiv b))))

(defn saxpy
  "Description copied from interface: BlasWrapper

  alpha - the alpha to scale by - `float`
  x - the ndarray to use - `org.nd4j.linalg.api.ndarray.INDArray`
  y - the ndarray to use - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseBlasWrapper this ^Float alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.saxpy alpha x y))))

(defn axpy
  "Description copied from interface: BlasWrapper

  da - the alpha to multiply by - `java.lang.Number`
  dx - `org.nd4j.linalg.api.ndarray.INDArray`
  dy - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseBlasWrapper this ^java.lang.Number da ^org.nd4j.linalg.api.ndarray.INDArray dx ^org.nd4j.linalg.api.ndarray.INDArray dy]
    (-> this (.axpy da dx dy))))

(defn level-2
  "Description copied from interface: BlasWrapper

  returns: `org.nd4j.linalg.api.blas.Level2`"
  (^org.nd4j.linalg.api.blas.Level2 [^BaseBlasWrapper this]
    (-> this (.level2))))

(defn asum
  "Description copied from interface: BlasWrapper

  x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BaseBlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.asum x))))

(defn level-3
  "Description copied from interface: BlasWrapper

  returns: `org.nd4j.linalg.api.blas.Level3`"
  (^org.nd4j.linalg.api.blas.Level3 [^BaseBlasWrapper this]
    (-> this (.level3))))

(defn posv
  "uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseBlasWrapper this ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.posv uplo a b))))

(defn syevd
  "jobz - `char`
  uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  w - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BaseBlasWrapper this ^Character jobz ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray w]
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
  (^Integer [^BaseBlasWrapper this ^Character jobvl ^Character jobvr ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray wr ^org.nd4j.linalg.api.ndarray.INDArray wi ^org.nd4j.linalg.api.ndarray.INDArray vl ^org.nd4j.linalg.api.ndarray.INDArray vr]
    (-> this (.geev jobvl jobvr a wr wi vl vr))))

(defn ger
  "Description copied from interface: BlasWrapper

  alpha - `float`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  a - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseBlasWrapper this ^Float alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.ger alpha x y a))))

(defn nrm-2
  "Description copied from interface: BlasWrapper

  x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^BaseBlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.nrm2 x))))

(defn gelsd
  "Description copied from interface: BlasWrapper

  a - an (m,n) matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  b - an (max(m,n), k) matrix (well, at least) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseBlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.gelsd a b))))

(defn scal
  "Description copied from interface: BlasWrapper

  alpha - `float`
  x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseBlasWrapper this ^Float alpha ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.scal alpha x))))

(defn gemv
  "Description copied from interface: BlasWrapper

  alpha - `java.lang.Number`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseBlasWrapper this ^java.lang.Number alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.gemv alpha a x beta y))))

(defn level-1
  "Description copied from interface: BlasWrapper

  returns: `org.nd4j.linalg.api.blas.Level1`"
  (^org.nd4j.linalg.api.blas.Level1 [^BaseBlasWrapper this]
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
  (^Integer [^BaseBlasWrapper this ^Character jobz ^Character range ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^Float vl ^Float vu ^Integer il ^Integer iu ^java.lang.Number abstol ^org.nd4j.linalg.api.ndarray.INDArray w ^org.nd4j.linalg.api.ndarray.INDArray z isuppz]
    (-> this (.syevr jobz range uplo a vl vu il iu abstol w z isuppz))))

(defn sygvd
  "itype - `int`
  jobz - `char`
  uplo - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  w - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `int`"
  (^Integer [^BaseBlasWrapper this ^Integer itype ^Character jobz ^Character uplo ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray w]
    (-> this (.sygvd itype jobz uplo a b w))))

(defn ormqr
  "side - `char`
  trans - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  tau - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseBlasWrapper this ^Character side ^Character trans ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray tau ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.ormqr side trans a tau c))))

(defn swap
  "Description copied from interface: BlasWrapper

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseBlasWrapper this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.swap x y))))

