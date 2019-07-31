(ns org.nd4j.linalg.util.LinAlgExceptions
  "Linear algebra exceptions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util LinAlgExceptions]))

(defn ->lin-alg-exceptions
  "Constructor."
  (^LinAlgExceptions []
    (new LinAlgExceptions )))

(defn *assert-same-length
  "Asserts both arrays be the same length

  x - `org.nd4j.linalg.api.ndarray.INDArray`
  z - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray z]
    (LinAlgExceptions/assertSameLength x z))
  ([^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray y ^org.nd4j.linalg.api.ndarray.INDArray z]
    (LinAlgExceptions/assertSameLength x y z)))

(defn *assert-same-shape
  "n - `org.nd4j.linalg.api.ndarray.INDArray`
  n-2 - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray n ^org.nd4j.linalg.api.ndarray.INDArray n-2]
    (LinAlgExceptions/assertSameShape n n-2)))

(defn *assert-rows
  "n - `org.nd4j.linalg.api.ndarray.INDArray`
  n-2 - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray n ^org.nd4j.linalg.api.ndarray.INDArray n-2]
    (LinAlgExceptions/assertRows n n-2)))

(defn *assert-vector
  "arr - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr]
    (LinAlgExceptions/assertVector arr)))

(defn *assert-matrix
  "arr - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray arr]
    (LinAlgExceptions/assertMatrix arr)))

(defn *assert-multiplies
  "Asserts matrix multiply rules (columns of left == rows of right or rows of left == columns of right)

  nd-1 - the left ndarray - `org.nd4j.linalg.api.ndarray.INDArray`
  nd-2 - the right ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray nd-1 ^org.nd4j.linalg.api.ndarray.INDArray nd-2]
    (LinAlgExceptions/assertMultiplies nd-1 nd-2)))

(defn *assert-columns
  "n - `org.nd4j.linalg.api.ndarray.INDArray`
  n-2 - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray n ^org.nd4j.linalg.api.ndarray.INDArray n-2]
    (LinAlgExceptions/assertColumns n n-2)))

(defn *assert-valid-num
  "n - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray n]
    (LinAlgExceptions/assertValidNum n)))

