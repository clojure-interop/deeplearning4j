(ns org.nd4j.nativeblas.Nd4jCpu$float_xw_plus_b
  "xw_plus_b op.
 multiply two first matrices and add third vector to each row of result
 input params:
 - 2D matrix NxM
 - 2D matrix MxN
 - 1D vector with N elements
 output value - 2D matrix NxN as multiply of matrixes and add vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_xw_plus_b]))

(defn ->float-xw-plus-b
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_xw_plus_b [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_xw_plus_b p))
  (^Nd4jCpu$float_xw_plus_b []
    (new Nd4jCpu$float_xw_plus_b )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_xw_plus_b`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_xw_plus_b [^Nd4jCpu$float_xw_plus_b this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_xw_plus_b this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

