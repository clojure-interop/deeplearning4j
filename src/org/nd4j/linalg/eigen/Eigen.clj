(ns org.nd4j.linalg.eigen.Eigen
  "Compute eigen values"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.eigen Eigen]))

(defn ->eigen
  "Constructor."
  (^Eigen []
    (new Eigen )))

(defn *-dummy
  "Static Field.

  type: org.nd4j.linalg.api.ndarray.INDArray"
  []
  Eigen/dummy)

(defn *symmetric-generalized-eigenvalues
  "Compute generalized eigenvalues of the problem A x = L B x.
  The data will be unchanged, no eigenvectors returned unless calculateVectors is true.
  If calculateVectors == true, A will contain a matrix with the eigenvectors as columns.

  a - symmetric Matrix A. - `org.nd4j.linalg.api.ndarray.INDArray`
  b - symmetric Matrix B. - `org.nd4j.linalg.api.ndarray.INDArray`
  calculate-vectors - `boolean`

  returns: a vector of eigenvalues L. - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^Boolean calculate-vectors]
    (Eigen/symmetricGeneralizedEigenvalues a b calculate-vectors))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a ^Boolean calculate-vectors]
    (Eigen/symmetricGeneralizedEigenvalues a calculate-vectors))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray a]
    (Eigen/symmetricGeneralizedEigenvalues a)))

