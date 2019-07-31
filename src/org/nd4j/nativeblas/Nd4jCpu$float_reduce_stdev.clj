(ns org.nd4j.nativeblas.Nd4jCpu$float_reduce_stdev
  "This op calculates sample standard deviation of elements along given dimensions
 input array:
 x: tensor to calculate mean for
 float arguments:
 keepDims: if non zero, then keep reduced dimensions with length = 1, default value is zero
 biasCorrected - if non zero, then bias correction will be applied, default value is zero
 int arguments:
 list of integers - dimensions to calculate mean along, default corresponds to empty list in which case calculation is performed for all dimensions and scalar is returned
 output array:
 reduced tensor with calculated means"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_reduce_stdev]))

(defn ->float-reduce-stdev
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_reduce_stdev [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_reduce_stdev p))
  (^Nd4jCpu$float_reduce_stdev []
    (new Nd4jCpu$float_reduce_stdev )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_reduce_stdev`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_reduce_stdev [^Nd4jCpu$float_reduce_stdev this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_reduce_stdev this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

