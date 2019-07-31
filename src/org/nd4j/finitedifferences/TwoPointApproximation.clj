(ns org.nd4j.finitedifferences.TwoPointApproximation
  "Simple 2 point finite difference approximation
 to compute the partial derivatives wrt the 2 given points
 based on:
 https://github.com/apache/commons-math/blob/master/src/main/java/org/apache/commons/math4/analysis/interpolation/BicubicInterpolator.java"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.finitedifferences TwoPointApproximation]))

(defn ->two-point-approximation
  "Constructor."
  (^TwoPointApproximation []
    (new TwoPointApproximation )))

(defn *prepare-bounds
  "Prepare the boundaries for processing

  bounds - the bounds - `org.nd4j.linalg.api.ndarray.INDArray`
  x - the input in to the approximation - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the lower and upper bounds as an array of ndarrays
  (in that order) of the same shape as x - `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray bounds ^org.nd4j.linalg.api.ndarray.INDArray x]
    (TwoPointApproximation/prepareBounds bounds x)))

(defn *adjust-scheme-to-bounds
  "Adjust final scheme to presence of bounds
  Returns (in this order):
  adjusted hypothesis, whether to use onesided as an int mask array

  x - the point to estimate the derivative - `org.nd4j.linalg.api.ndarray.INDArray`
  h - the finite difference steps - `org.nd4j.linalg.api.ndarray.INDArray`
  num-steps - Number of h steps in 1 directionto implement finite difference scheme. - `int`
  lower-bound - Lower bounds for independent variable variable - `org.nd4j.linalg.api.ndarray.INDArray`
  upper-bound - Upper bounds for independent variable - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray h ^Integer num-steps ^org.nd4j.linalg.api.ndarray.INDArray lower-bound ^org.nd4j.linalg.api.ndarray.INDArray upper-bound]
    (TwoPointApproximation/adjustSchemeToBounds x h num-steps lower-bound upper-bound)))

(defn *compute-absolute-step
  "rel-step - `org.nd4j.linalg.api.ndarray.INDArray`
  x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray rel-step ^org.nd4j.linalg.api.ndarray.INDArray x]
    (TwoPointApproximation/computeAbsoluteStep rel-step x))
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.api.ndarray.INDArray x]
    (TwoPointApproximation/computeAbsoluteStep x)))

(defn *get-eps-relative-to
  "data - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `double`"
  (^Double [^org.nd4j.linalg.api.ndarray.INDArray data]
    (TwoPointApproximation/getEpsRelativeTo data)))

(defn *approximate-derivative
  "f - `org.nd4j.linalg.function.Function`
  x - `org.nd4j.linalg.api.ndarray.INDArray`
  rel-step - `org.nd4j.linalg.api.ndarray.INDArray`
  f-0 - `org.nd4j.linalg.api.ndarray.INDArray`
  bounds - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.function.Function f ^org.nd4j.linalg.api.ndarray.INDArray x ^org.nd4j.linalg.api.ndarray.INDArray rel-step ^org.nd4j.linalg.api.ndarray.INDArray f-0 ^org.nd4j.linalg.api.ndarray.INDArray bounds]
    (TwoPointApproximation/approximateDerivative f x rel-step f-0 bounds)))

(defn *dense-difference
  "func - `org.nd4j.linalg.function.Function`
  x-0 - `org.nd4j.linalg.api.ndarray.INDArray`
  f-0 - `org.nd4j.linalg.api.ndarray.INDArray`
  h - `org.nd4j.linalg.api.ndarray.INDArray`
  one-sided - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^org.nd4j.linalg.function.Function func ^org.nd4j.linalg.api.ndarray.INDArray x-0 ^org.nd4j.linalg.api.ndarray.INDArray f-0 ^org.nd4j.linalg.api.ndarray.INDArray h ^org.nd4j.linalg.api.ndarray.INDArray one-sided]
    (TwoPointApproximation/denseDifference func x-0 f-0 h one-sided)))

