(ns org.nd4j.nativeblas.Nd4jCpu$float_roll
  "roll - op porting from numpy (https://docs.scipy.org/doc/numpy-1.14.0/reference/generated/numpy.roll.html)
 input params:
 0 - NDArray
 int params:
 0 - shift
 1 - axe 1
 2 - axe 2
 ...
 N - axe N
 All axes are optional and should be between 0 and input->rankOf(). Of course, all axes can be repeated.
 output:
 0 - NDArray with the same shape as input."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_roll]))

(defn ->float-roll
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_roll [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_roll p))
  (^Nd4jCpu$float_roll []
    (new Nd4jCpu$float_roll )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_roll`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_roll [^Nd4jCpu$float_roll this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_roll this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

