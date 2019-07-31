(ns org.nd4j.linalg.api.blas.impl.SparseBaseLevel2
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.blas.impl SparseBaseLevel2]))

(defn ->sparse-base-level-2
  "Constructor."
  (^SparseBaseLevel2 []
    (new SparseBaseLevel2 )))

(defn sbmv
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.sbmv order uplo alpha a x beta y))))

(defn tbmv
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.tbmv order uplo trans-a diag a x))))

(defn syr-2
  "order - `char`
  uplo - `char`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  a - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.syr2 order uplo alpha x y a))))

(defn trsv
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.trsv order uplo trans-a diag a x))))

(defn tpsv
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  ap - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray ap ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.tpsv order uplo trans-a diag ap x))))

(defn syr
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  n - `int`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  a - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Integer n ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.syr order uplo n alpha x a))))

(defn spr-2
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  a - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.spr2 order uplo alpha x y a))))

(defn spr
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  ap - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray ap]
    (-> this (.spr order uplo alpha x ap))))

(defn trmv
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.trmv order uplo trans-a diag a x))))

(defn tpmv
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  ap - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray ap ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.tpmv order uplo trans-a diag ap x))))

(defn tbsv
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  trans-a - `char`
  diag - `char`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Character trans-a ^Character diag ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.tbsv order uplo trans-a diag a x))))

(defn spmv
  "order - `char`
  uplo - `char`
  alpha - `double`
  ap - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray ap ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.spmv order uplo alpha ap x beta y))))

(defn gbmv
  "Description copied from interface: Level2

  order - `char`
  trans-a - `char`
  kl - `int`
  ku - `int`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character trans-a ^Integer kl ^Integer ku ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.gbmv order trans-a kl ku alpha a x beta y))))

(defn ger
  "Description copied from interface: Level2

  order - `char`
  alpha - `double`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  y - `org.nd4j.linalg.api.ndarray.INDArray`
  a - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray a]
    (-> this (.ger order alpha x y a))))

(defn gemv
  "Description copied from interface: Level2

  order - `char`
  trans-a - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character trans-a ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.gemv order trans-a alpha a x beta y))))

(defn symv
  "Description copied from interface: Level2

  order - `char`
  uplo - `char`
  alpha - `double`
  a - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  beta - `double`
  y - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SparseBaseLevel2 this ^Character order ^Character uplo ^Double alpha ^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray x ^Double beta ^org.nd4j.linalg.api.ndarray.INDArray y]
    (-> this (.symv order uplo alpha a x beta y))))

