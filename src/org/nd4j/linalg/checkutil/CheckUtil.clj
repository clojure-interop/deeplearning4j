(ns org.nd4j.linalg.checkutil.CheckUtil
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.checkutil CheckUtil]))

(defn ->check-util
  "Constructor."
  (^CheckUtil []
    (new CheckUtil )))

(defn *check-mul-manually
  "first - `org.nd4j.linalg.api.ndarray.INDArray`
  second - `org.nd4j.linalg.api.ndarray.INDArray`
  max-relative-difference - `double`
  min-abs-difference - `double`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray second ^Double max-relative-difference ^Double min-abs-difference]
    (CheckUtil/checkMulManually first second max-relative-difference min-abs-difference)))

(defn *check-subtract
  "Same as checkMmul, but for matrix subtraction

  first - `org.nd4j.linalg.api.ndarray.INDArray`
  second - `org.nd4j.linalg.api.ndarray.INDArray`
  max-relative-difference - `double`
  min-abs-difference - `double`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray second ^Double max-relative-difference ^Double min-abs-difference]
    (CheckUtil/checkSubtract first second max-relative-difference min-abs-difference)))

(defn *print-matrix-full-precision
  "matrix - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray matrix]
    (CheckUtil/printMatrixFullPrecision matrix)))

(defn *print-failure-details
  "first - `org.nd4j.linalg.api.ndarray.INDArray`
  second - `org.nd4j.linalg.api.ndarray.INDArray`
  expected - `org.apache.commons.math3.linear.RealMatrix`
  actual - `org.nd4j.linalg.api.ndarray.INDArray`
  on-copies - `org.nd4j.linalg.api.ndarray.INDArray`
  op - `java.lang.String`"
  ([^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray second ^org.apache.commons.math3.linear.RealMatrix expected ^org.nd4j.linalg.api.ndarray.INDArray actual ^org.nd4j.linalg.api.ndarray.INDArray on-copies ^java.lang.String op]
    (CheckUtil/printFailureDetails first second expected actual on-copies op)))

(defn *check-mmul
  "Check first.mmul(second) using Apache commons math mmul. Float/double matrices only.
  Returns true if OK, false otherwise.
  Checks each element according to relative error (|a-b|/(|a|+|b|); however absolute error |a-b| must
  also exceed minAbsDifference for it to be considered a failure. This is necessary to avoid instability
  near 0: i.e., Nd4j mmul might return element of 0.0 (due to underflow on float) while Apache commons math
  mmul might be say 1e-30 or something (using doubles).
  Throws exception if matrices can't be multiplied
  Checks each element of the result. If

  first - First matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  second - Second matrix - `org.nd4j.linalg.api.ndarray.INDArray`
  max-relative-difference - Maximum relative error - `double`
  min-abs-difference - Minimum absolute difference for failure - `double`

  returns: true if OK, false if result incorrect - `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray second ^Double max-relative-difference ^Double min-abs-difference]
    (CheckUtil/checkMmul first second max-relative-difference min-abs-difference)))

(defn *check-entries
  "rm-result - `org.apache.commons.math3.linear.RealMatrix`
  result - `org.nd4j.linalg.api.ndarray.INDArray`
  max-relative-difference - `double`
  min-abs-difference - `double`

  returns: `boolean`"
  (^Boolean [^org.apache.commons.math3.linear.RealMatrix rm-result ^org.nd4j.linalg.api.ndarray.INDArray result ^Double max-relative-difference ^Double min-abs-difference]
    (CheckUtil/checkEntries rm-result result max-relative-difference min-abs-difference)))

(defn *check-div-manually
  "first - `org.nd4j.linalg.api.ndarray.INDArray`
  second - `org.nd4j.linalg.api.ndarray.INDArray`
  max-relative-difference - `double`
  min-abs-difference - `double`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray second ^Double max-relative-difference ^Double min-abs-difference]
    (CheckUtil/checkDivManually first second max-relative-difference min-abs-difference)))

(defn *check-add
  "Same as checkMmul, but for matrix addition

  first - `org.nd4j.linalg.api.ndarray.INDArray`
  second - `org.nd4j.linalg.api.ndarray.INDArray`
  max-relative-difference - `double`
  min-abs-difference - `double`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray first ^org.nd4j.linalg.api.ndarray.INDArray second ^Double max-relative-difference ^Double min-abs-difference]
    (CheckUtil/checkAdd first second max-relative-difference min-abs-difference)))

(defn *check-gemm
  "a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `org.nd4j.linalg.api.ndarray.INDArray`
  transpose-a - `boolean`
  transpose-b - `boolean`
  alpha - `double`
  beta - `double`
  max-relative-difference - `double`
  min-abs-difference - `double`

  returns: `boolean`"
  (^Boolean [^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c ^Boolean transpose-a ^Boolean transpose-b ^Double alpha ^Double beta ^Double max-relative-difference ^Double min-abs-difference]
    (CheckUtil/checkGemm a b c transpose-a transpose-b alpha beta max-relative-difference min-abs-difference)))

(defn *print-nd-array-header
  "array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray array]
    (CheckUtil/printNDArrayHeader array)))

(defn *convert-to-apache-matrix
  "matrix - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.apache.commons.math3.linear.RealMatrix`"
  (^org.apache.commons.math3.linear.RealMatrix [^org.nd4j.linalg.api.ndarray.INDArray matrix]
    (CheckUtil/convertToApacheMatrix matrix)))

(defn *convert-from-apache-matrix
  "matrix - `org.apache.commons.math3.linear.RealMatrix`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.apache.commons.math3.linear.RealMatrix matrix]
    (CheckUtil/convertFromApacheMatrix matrix)))

(defn *print-gemm-failure-details
  "a - `org.nd4j.linalg.api.ndarray.INDArray`
  b - `org.nd4j.linalg.api.ndarray.INDArray`
  c - `org.nd4j.linalg.api.ndarray.INDArray`
  transpose-a - `boolean`
  transpose-b - `boolean`
  alpha - `double`
  beta - `double`
  expected - `org.apache.commons.math3.linear.RealMatrix`
  actual - `org.nd4j.linalg.api.ndarray.INDArray`
  on-copies - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^org.nd4j.linalg.api.ndarray.INDArray a ^org.nd4j.linalg.api.ndarray.INDArray b ^org.nd4j.linalg.api.ndarray.INDArray c ^Boolean transpose-a ^Boolean transpose-b ^Double alpha ^Double beta ^org.apache.commons.math3.linear.RealMatrix expected ^org.nd4j.linalg.api.ndarray.INDArray actual ^org.nd4j.linalg.api.ndarray.INDArray on-copies]
    (CheckUtil/printGemmFailureDetails a b c transpose-a transpose-b alpha beta expected actual on-copies)))

(defn *print-apache-matrix
  "matrix - `org.apache.commons.math3.linear.RealMatrix`"
  ([^org.apache.commons.math3.linear.RealMatrix matrix]
    (CheckUtil/printApacheMatrix matrix)))

