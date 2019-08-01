(ns org.nd4j.nativeblas.Nd4jCpu$float_hinge_loss
  "Implementation of hinge loss function max(0, 1 - labels*logits)
 Input arrays:
 0: logits - logits, type float
 1: weights - is used for weighting (multiplying) of loss values, type float.
 Can be single scalar or has the same rank as labels and must be broadcastable to labels.
 2: labels - ground truth vales, expected to be 0. or 1., type float.
 Must have the same shape as logits.
 Input integer arguments:
 0: type of reduction to apply to loss
 0 - \"none\", unreduced weighted losses with the same shape as logits.
 1 - \"weighted_sum\", output is scalar and equal to sum of all elements of weightedLosses array
 2 - \"weighted_mean\", output is scalar and equal to sum of all elements of weightedLosses array divided by sum of all elements of weightsBroad array
 3 - \"weighted_sum_by_nonzero_weights\", output is scalar and equal to scalar sum of all elements of weightedLosses array divided by number of non-zero weights
 Output array:
 0: loss values, type float.
 Can be an array with the same shape as logits or just single scalar, depending on reduction mode (see input integer argument)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_hinge_loss]))

(defn ->float-hinge-loss
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_hinge_loss [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_hinge_loss p))
  (^Nd4jCpu$float_hinge_loss []
    (new Nd4jCpu$float_hinge_loss )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_hinge_loss`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_hinge_loss [^Nd4jCpu$float_hinge_loss this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_hinge_loss this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

