(ns org.nd4j.nativeblas.Nd4jCpu$float_cosine_distance_loss
  "Implementation of cosine-distance loss function 1. - (predictions * labels).reduce_sum_along(dimension)
 Input arrays:
 0: predictions - the predicted values, type float
 1: weights - is used for weighting (multiplying) of loss values, type float.
 Can be single scalar or has the same rank as labels and must be broadcastable to labels.
 2: labels - ground truth vales, type float.
 Must have the same shape as predictions.
 Input integer arguments:
 0: type of reduction to apply to loss
 0 - \"none\", unreduced weighted losses with the same shape as predictions
 1 - \"weighted_sum\", output is scalar and equal to sum of all elements of weightedLosses array
 2 - \"weighted_mean\", output is scalar and equal to sum of all elements of weightedLosses array divided by sum of all elements of weightsBroad array
 3 - \"weighted_sum_by_nonzero_weights\", output is scalar and equal to scalar sum of all elements of weightedLosses array divided by number of non-zero weights
 1: dimension along which the cosine distance is computed.
 Output array:
 0: loss values, type float.
 Can be an array with the same shape as predictions or just single scalar, depending on reduction mode (see input integer argument)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_cosine_distance_loss]))

(defn ->float-cosine-distance-loss
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_cosine_distance_loss [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_cosine_distance_loss p))
  (^Nd4jCpu$float_cosine_distance_loss []
    (new Nd4jCpu$float_cosine_distance_loss )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_cosine_distance_loss`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_cosine_distance_loss [^Nd4jCpu$float_cosine_distance_loss this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_cosine_distance_loss this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

