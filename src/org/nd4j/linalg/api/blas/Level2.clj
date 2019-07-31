(ns org.nd4j.linalg.api.blas.Level2
  "Level 2 blas implementations.
 Incx and other parameters are inferred
 from the given ndarrays.
 To avoid boxing, doubles are used in place of normal numbers.
 The underlying implementation will call the proper data opType.
 This is a fortran 95 style api that gives us the efficiency
 and flexibility of the fortran 77 api
 Credit to:
 https://www.ualberta.ca/AICT/RESEARCH/LinuxClusters/doc/mkl81/mklqref/blaslev2.htm
 for the descriptions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas Level2]))

(defn sbmv
  "sbmv computes a matrix-vector product using a symmetric band matrix:
  y := alpha*a*x  beta*y.
  Here a is an n-by-n symmetric band matrix with k superdiagonals, x and y are n-element vectors, alpha and beta are scalars.

  order - `char`
  uplo - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.sbmv order uplo alpha a x beta y))))

(defn tbmv
  "syr2 performs a rank-2 update of an n-by-n symmetric matrix a:
  a := alpha*x*y'  alpha*y*x'  a.

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.tbmv order uplo trans-a diag a x))))

(defn syr-2
  "order - `char`
  uplo - `char`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  a - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.syr2 order uplo alpha x y a))))

(defn trsv
  "trsv solves a system of linear equations whose coefficients are in a triangular matrix.

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.trsv order uplo trans-a diag a x))))

(defn tpsv
  "tpsv solves a system of linear equations whose coefficients are in a triangular packed matrix.

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  ap - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray ap ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.tpsv order uplo trans-a diag ap x))))

(defn syr
  "syr performs a rank-1 update of an n-by-n symmetric matrix a:
  a := alpha*x*x'  a.

  order - `char`
  uplo - `char`
  n - `int`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  a - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Integer n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.syr order uplo n alpha x a))))

(defn spr-2
  "?spr2 performs a rank-2 update of an n-by-n packed symmetric matrix a:
  a := alpha*x*y'  alpha*y*x'  a.

  order - `char`
  uplo - `char`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  a - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.spr2 order uplo alpha x y a))))

(defn spr
  "spr performs a rank-1 update of an n-by-n packed symmetric matrix a:
  a := alpha*x*x'  a.

  order - `char`
  uplo - `char`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  ap - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray ap]
    (-> this (.spr order uplo alpha x ap))))

(defn trmv
  "trmv computes a matrix-vector product using a triangular matrix.

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.trmv order uplo trans-a diag a x))))

(defn tpmv
  "tpmv computes a matrix-vector product using a triangular packed matrix.

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  ap - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray ap ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.tpmv order uplo trans-a diag ap x))))

(defn tbsv
  "?tbsv solves a system of linear equations whose coefficients are in a triangular band matrix.

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.tbsv order uplo trans-a diag a x))))

(defn spmv
  "order - `char`
  uplo - `char`
  alpha - `double`
  ap - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray ap ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.spmv order uplo alpha ap x beta y))))

(defn gbmv
  "gbmv computes a matrix-vector product using a general band matrix and performs one of the following matrix-vector operations:
  y := alpha*a*x  beta*y for trans = 'N'or'n';
  y := alpha*a'*x  beta*y for trans = 'T'or't';
  y := alpha*conjg(a')*x  beta*y for trans = 'C'or'c'.
  Here a is an m-by-n band matrix with ku superdiagonals and kl subdiagonals, x and y are vectors, alpha and beta are scalars.

  order - `char`
  trans-a - `char`
  kl - `int`
  ku - `int`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character trans-a ^Integer kl ^Integer ku ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.gbmv order trans-a kl ku alpha a x beta y))))

(defn ger
  "performs a rank-1 update of a general m-by-n matrix a:
  a := alpha*x*y'  a.

  order - `char`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  a - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.ger order alpha x y a))))

(defn gemv
  "gemv computes a matrix-vector product using a general matrix and performs one of the following matrix-vector operations:
  y := alpha*a*x  beta*y for trans = 'N'or'n';
  y := alpha*a'*x  beta*y for trans = 'T'or't';
  y := alpha*conjg(a')*x  beta*y for trans = 'C'or'c'.
  Here a is an m-by-n band matrix, x and y are vectors, alpha and beta are scalars.

  order - `char`
  trans-a - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character trans-a ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.gemv order trans-a alpha a x beta y))))

(defn symv
  "symv computes a matrix-vector product for a symmetric matrix:
  y := alpha*a*x  beta*y.
  Here a is an n-by-n symmetric matrix; x and y are n-element vectors, alpha and beta are scalars.

  order - `char`
  uplo - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Level2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.symv order uplo alpha a x beta y))))

