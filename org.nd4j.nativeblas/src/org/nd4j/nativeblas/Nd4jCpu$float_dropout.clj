(ns org.nd4j.nativeblas.Nd4jCpu$float_dropout
  "This op calculates weighted logarithmic loss of input
 Input arguments
 0 - input tensor
 1 - noise_shape - (vector with shape to reduce) - optional
 int parameter - seed for random numbers
 T parameter - probability (should be between 0 and 1)
 return value - a tensor with the same shape as target or input"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_dropout]))

(defn ->float-dropout
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_dropout [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_dropout p))
  (^Nd4jCpu$float_dropout []
    (new Nd4jCpu$float_dropout )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_dropout`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_dropout [^Nd4jCpu$float_dropout this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_dropout this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

