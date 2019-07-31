(ns org.nd4j.linalg.api.blas.impl.SparseBaseLevel3
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.impl SparseBaseLevel3]))

(defn ->sparse-base-level-3
  "Constructor."
  (^SparseBaseLevel3 []
    (new SparseBaseLevel3 )))

(defn gemm
  "Description copied from interface: Level3

  order - `char`
  trans-a - `char`
  trans-b - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel3 this ^Character order ^Character trans-a ^Character trans-b ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.gemm order trans-a trans-b alpha a b beta c)))
  ([^SparseBaseLevel3 this ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c ^Boolean transpose-a ^Boolean transpose-b ^Double alpha ^Double beta]
    (-> this (.gemm a b c transpose-a transpose-b alpha beta))))

(defn symm
  "Description copied from interface: Level3

  order - `char`
  side - `char`
  uplo - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel3 this ^Character order ^Character side ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.symm order side uplo alpha a b beta c))))

(defn syrk
  "Description copied from interface: Level3

  order - `char`
  uplo - `char`
  trans - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel3 this ^Character order ^Character uplo ^Character trans ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.syrk order uplo trans alpha a beta c))))

(defn syr-2k
  "Description copied from interface: Level3

  order - `char`
  uplo - `char`
  trans - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel3 this ^Character order ^Character uplo ^Character trans ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.syr2k order uplo trans alpha a b beta c))))

(defn trmm
  "Description copied from interface: Level3

  order - `char`
  side - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel3 this ^Character order ^Character side ^Character uplo ^Character trans-a ^Character diag ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c]
    (-> this (.trmm order side uplo trans-a diag alpha a b c))))

(defn trsm
  "Description copied from interface: Level3

  order - `char`
  side - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel3 this ^Character order ^Character side ^Character uplo ^Character trans-a ^Character diag ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b]
    (-> this (.trsm order side uplo trans-a diag alpha a b))))

