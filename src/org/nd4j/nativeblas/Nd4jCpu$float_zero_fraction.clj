(ns org.nd4j.nativeblas.Nd4jCpu$float_zero_fraction
  "zero_fraction op.
 compute a fraction of zeros in given array
 input param - an array (tensor)
 output value - a real number with given type (e.g. float or double)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_zero_fraction]))

(defn ->float-zero-fraction
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_zero_fraction [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_zero_fraction p))
  (^Nd4jCpu$float_zero_fraction []
    (new Nd4jCpu$float_zero_fraction )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_zero_fraction`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_zero_fraction [^Nd4jCpu$float_zero_fraction this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_zero_fraction this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

