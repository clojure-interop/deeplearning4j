(ns org.nd4j.nativeblas.Nd4jCpu$float_lrn
  "Local response normalization implementation as TF.
 input: 4D array
 T args:
 0: bias
 1: alpha
 2: beta
 Int arg: depth - optional local radius
 output - 4D array"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_lrn]))

(defn ->float-lrn
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_lrn [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_lrn p))
  (^Nd4jCpu$float_lrn []
    (new Nd4jCpu$float_lrn )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_lrn`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_lrn [^Nd4jCpu$float_lrn this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_lrn this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

