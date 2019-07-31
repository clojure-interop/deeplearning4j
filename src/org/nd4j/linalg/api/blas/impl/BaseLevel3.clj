(ns org.nd4j.linalg.api.blas.impl.BaseLevel3
  "Base class for level 3 functions, abstract headers pulled from:
 http://www.netlib.org/blas/blast-forum/cblas.h"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.impl BaseLevel3]))

(defn ->base-level-3
  "Constructor."
  (^BaseLevel3 []
    (new BaseLevel3 )))

(defn gemm
  "gemm performs a matrix-matrix operation
  c := alpha*op(a)*op(b)  beta*c,
  where c is an m-by-n matrix,
  op(a) is an m-by-k matrix,
  op(b) is a k-by-n matrix.

  order - `char`
  trans-a - `char`
  trans-b - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLevel3 this ^Character order ^Character trans-a ^Character trans-b ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.gemm order trans-a trans-b alpha a b beta c)))
  ([^BaseLevel3 this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c ^Boolean transpose-a ^Boolean transpose-b ^Double alpha ^Double beta]
    (-> this (.gemm a b c transpose-a transpose-b alpha beta))))

(defn symm
  "her2k performs a rank-2k update of an n-by-n Hermitian matrix c, that is, one of the following operations:
  c := alpha*a*conjg(b')  conjg(alpha)*b*conjg(a')  beta*c, for trans = 'N'or'n'
  c := alpha*conjg(b')*a  conjg(alpha)*conjg(a')*b  beta*c, for trans = 'C'or'c'
  where c is an n-by-n Hermitian matrix;
  a and b are n-by-k matrices if trans = 'N'or'n',
  a and b are k-by-n matrices if trans = 'C'or'c'.

  order - `char`
  side - `char`
  uplo - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLevel3 this ^Character order ^Character side ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.symm order side uplo alpha a b beta c))))

(defn syrk
  "syrk performs a rank-n update of an n-by-n symmetric matrix c, that is, one of the following operations:
  c := alpha*a*a'  beta*c for trans = 'N'or'n'
  c := alpha*a'*a  beta*c for trans = 'T'or't','C'or'c',
  where c is an n-by-n symmetric matrix;
  a is an n-by-k matrix, if trans = 'N'or'n',
  a is a k-by-n matrix, if trans = 'T'or't','C'or'c'.

  order - `char`
  uplo - `char`
  trans - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLevel3 this ^Character order ^Character uplo ^Character trans ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.syrk order uplo trans alpha a beta c))))

(defn syr-2k
  "yr2k performs a rank-2k update of an n-by-n symmetric matrix c, that is, one of the following operations:
  c := alpha*a*b'  alpha*b*a'  beta*c for trans = 'N'or'n'
  c := alpha*a'*b  alpha*b'*a  beta*c for trans = 'T'or't',
  where c is an n-by-n symmetric matrix;
  a and b are n-by-k matrices, if trans = 'N'or'n',
  a and b are k-by-n matrices, if trans = 'T'or't'.

  order - `char`
  uplo - `char`
  trans - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLevel3 this ^Character order ^Character uplo ^Character trans ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.syr2k order uplo trans alpha a b beta c))))

(defn trmm
  "syr2k performs a rank-2k update of an n-by-n symmetric matrix c, that is, one of the following operations:
  c := alpha*a*b'  alpha*b*a'  beta*c for trans = 'N'or'n'
  c := alpha*a'*b  alpha*b'*a  beta*c for trans = 'T'or't',
  where c is an n-by-n symmetric matrix;
  a and b are n-by-k matrices, if trans = 'N'or'n',
  a and b are k-by-n matrices, if trans = 'T'or't'.

  order - `char`
  side - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLevel3 this ^Character order ^Character side ^Character uplo ^Character trans-a ^Character diag ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.trmm order side uplo trans-a diag alpha a b c))))

(defn trsm
  "?trsm solves one of the following matrix equations:
  op(a)*x = alpha*b or x*op(a) = alpha*b,
  where x and b are m-by-n general matrices, and a is triangular;
  op(a) must be an m-by-m matrix, if side = 'L'or'l'
  op(a) must be an n-by-n matrix, if side = 'R'or'r'.
  For the definition of op(a), see Matrix Arguments.
  The routine overwrites x on b.

  order - `char`
  side - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseLevel3 this ^Character order ^Character side ^Character uplo ^Character trans-a ^Character diag ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.trsm order side uplo trans-a diag alpha a b))))

