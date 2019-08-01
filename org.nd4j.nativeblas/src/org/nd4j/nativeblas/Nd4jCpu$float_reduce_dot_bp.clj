(ns org.nd4j.nativeblas.Nd4jCpu$float_reduce_dot_bp
  "This op calculates backprop dot for two tensors along given dimensions
 input array:
 x: tensor to calculate dot for
 y: tensor to calculate dot for
 z: tensor with gradient output of the FF dot for x and y
 int arguments:
 list of integers - dimensions to calculate dot along,
 default corresponds to empty list in which case calculation
 is performed for all dimensions and scalar is returned.
 output array:
 the tensor with calculated backproped dots"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_reduce_dot_bp]))

(defn ->float-reduce-dot-bp
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_reduce_dot_bp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_reduce_dot_bp p))
  (^Nd4jCpu$float_reduce_dot_bp []
    (new Nd4jCpu$float_reduce_dot_bp )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_reduce_dot_bp`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_reduce_dot_bp [^Nd4jCpu$float_reduce_dot_bp this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_reduce_dot_bp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

