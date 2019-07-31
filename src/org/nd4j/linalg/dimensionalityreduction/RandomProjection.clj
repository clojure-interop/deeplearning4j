(ns org.nd4j.linalg.dimensionalityreduction.RandomProjection
  "Created by huitseeker on 7/28/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dimensionalityreduction RandomProjection]))

(defn ->random-projection
  "Constructor.

  eps - `double`
  rng - `org.nd4j.linalg.api.rng.Random`"
  (^RandomProjection [^Double eps ^org.nd4j.linalg.api.rng.Random rng]
    (new RandomProjection eps rng))
  (^RandomProjection [^Double eps]
    (new RandomProjection eps)))

(defn *johnson-lindenstrauss-min-dim
  "Find a safe number of components to project this to, through
  the Johnson-Lindenstrauss lemma
  The minimum number n' of components to guarantee the eps-embedding is
  given by:
  n' >= 4 log(n) / (eps² / 2 - eps³ / 3)
  see http://cseweb.ucsd.edu/~dasgupta/papers/jl.pdf §2.1

  n - Number of samples. If an array is given, it will computea safe number of components array-wise. - `int[]`
  eps - Maximum distortion rate as defined by the Johnson-Lindenstrauss lemma.Will compute array-wise if an array is given. - `double`

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [n ^Double eps]
    (RandomProjection/johnsonLindenstraussMinDim n eps)))

(defn *johnson-linden-strauss-min-dim
  "n - `int`
  eps - `double`

  returns: `java.util.List<java.lang.Integer>`"
  (^java.util.List [^Integer n ^Double eps]
    (RandomProjection/johnsonLindenStraussMinDim n eps)))

(defn project
  "Create a copy random projection by using matrix product with a random matrix

  data - `org.nd4j.linalg.api.ndarray.INDArray`
  result - a placeholder result - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RandomProjection this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.project data result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^RandomProjection this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.project data))))

(defn projecti
  "Create an in-place random projection by using in-place matrix product with a random matrix

  data - `org.nd4j.linalg.api.ndarray.INDArray`
  result - a placeholder result - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RandomProjection this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.nd4j.linalg.api.ndarray.INDArray result]
    (-> this (.projecti data result)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^RandomProjection this ^org.nd4j.linalg.api.ndarray.INDArray data]
    (-> this (.projecti data))))

