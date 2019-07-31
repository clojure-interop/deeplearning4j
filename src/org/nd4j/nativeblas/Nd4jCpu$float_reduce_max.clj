(ns org.nd4j.nativeblas.Nd4jCpu$float_reduce_max
  "This op calculates max of elements along given dimensions
 input array:
 x: tensor to calculate maxes for
 float arguments:
 keepDims: if non zero, then keep reduced dimensions with length = 1, default value is zero
 int arguments:
 list of integers - dimensions to calculate max along, default corresponds to empty list in which case calculation is performed for all dimensions and scalar is returned
 output array:
 reduced tensor with calculated maxes"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_reduce_max]))

(defn ->float-reduce-max
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_reduce_max [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_reduce_max p))
  (^Nd4jCpu$float_reduce_max []
    (new Nd4jCpu$float_reduce_max )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_reduce_max`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_reduce_max [^Nd4jCpu$float_reduce_max this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_reduce_max this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

