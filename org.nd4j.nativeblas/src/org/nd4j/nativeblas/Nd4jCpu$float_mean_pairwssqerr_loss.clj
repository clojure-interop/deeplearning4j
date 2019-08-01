(ns org.nd4j.nativeblas.Nd4jCpu$float_mean_pairwssqerr_loss
  "Implementation of pairwise-errors-squared loss function
 Input arrays:
 0: predictions - the predicted values, type float.
 1: weights - is used for weighting (multiplying) of loss values, type float.
 Can be single scalar or has the same rank as labels and must be broadcastable to labels.
 2: labels - ground truth vales, type float.
 Must have the same shape as predictions.
 Output array:
 0: loss value, it is just single scalar, type float."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_mean_pairwssqerr_loss]))

(defn ->float-mean-pairwssqerr-loss
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_mean_pairwssqerr_loss [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_mean_pairwssqerr_loss p))
  (^Nd4jCpu$float_mean_pairwssqerr_loss []
    (new Nd4jCpu$float_mean_pairwssqerr_loss )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_mean_pairwssqerr_loss`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_mean_pairwssqerr_loss [^Nd4jCpu$float_mean_pairwssqerr_loss this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_mean_pairwssqerr_loss this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

