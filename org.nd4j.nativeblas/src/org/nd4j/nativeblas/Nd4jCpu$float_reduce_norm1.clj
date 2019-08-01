(ns org.nd4j.nativeblas.Nd4jCpu$float_reduce_norm1
  "This op calculates norm1 of elements along given dimensions
 input array:
 x: tensor to calculate norm1 for
 float arguments:
 keepDims: if non zero, then keep reduced dimensions with length = 1, default value is zero
 int arguments:
 list of integers - dimensions to calculate norm1 along, default corresponds to empty list in which case calculation is performed for all dimensions and scalar is returned
 output array:
 reduced tensor with calculated norm1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_reduce_norm1]))

(defn ->float-reduce-norm-1
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_reduce_norm1 [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_reduce_norm1 p))
  (^Nd4jCpu$float_reduce_norm1 []
    (new Nd4jCpu$float_reduce_norm1 )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_reduce_norm1`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_reduce_norm1 [^Nd4jCpu$float_reduce_norm1 this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_reduce_norm1 this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

