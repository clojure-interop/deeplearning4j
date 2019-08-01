(ns org.nd4j.nativeblas.Nd4jCpu$float_betainc
  "This op calculates regularized incomplete beta integral Ix(a, b).
 Implementation is based on two algorithms depending on input values of a and b:
 - when a and b are both > maxValue (3000.), then apply Gauss-Legendre quadrature method
 - when a and b are both <= maxValue (3000.), then apply modified Lentz’s algorithm for continued fractions
 Input arrays:
 a: define power t^{a-1}, must be > 0, type float.
 b: define power (1-t)^{b-1}, must be > 0, type float.
 x: define upper limit of integration, must be within (0 <= x <= 1) range, type float.
 Output array:
 0: values of regularized incomplete beta integral that corresponds to variable upper limit x, type float
 Three input and one output arrays must have the same shape"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_betainc]))

(defn ->float-betainc
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_betainc [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_betainc p))
  (^Nd4jCpu$float_betainc []
    (new Nd4jCpu$float_betainc )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_betainc`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_betainc [^Nd4jCpu$float_betainc this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_betainc this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

