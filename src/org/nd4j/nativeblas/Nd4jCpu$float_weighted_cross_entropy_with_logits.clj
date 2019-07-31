(ns org.nd4j.nativeblas.Nd4jCpu$float_weighted_cross_entropy_with_logits
  "This op calculates weighted logarithmic loss of input
 Input arguments
 0 - target
 1 - input
 2 - weights (scalar or vector with same as last dimension)
 return value - a tensor with the same shape as target or input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_weighted_cross_entropy_with_logits]))

(defn ->float-weighted-cross-entropy-with-logits
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_weighted_cross_entropy_with_logits [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_weighted_cross_entropy_with_logits p))
  (^Nd4jCpu$float_weighted_cross_entropy_with_logits []
    (new Nd4jCpu$float_weighted_cross_entropy_with_logits )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_weighted_cross_entropy_with_logits`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_weighted_cross_entropy_with_logits [^Nd4jCpu$float_weighted_cross_entropy_with_logits this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_weighted_cross_entropy_with_logits this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

