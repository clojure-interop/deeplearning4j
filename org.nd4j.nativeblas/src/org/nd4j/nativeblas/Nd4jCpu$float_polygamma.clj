(ns org.nd4j.nativeblas.Nd4jCpu$float_polygamma
  "This op calculates polygamma function psi^(n)(x). Implementation is based on serial representation written in
 terms of the Hurwitz zeta function: polygamma = (-1)^{n+1} * n! * zeta(n+1, x).
 Currently the case n = 0 is not supported.
 Input arrays:
 0: n - define derivative order (n+1), type integer (however currently is implemented as float casted to integer)
 1: x - abscissa points where to evaluate the polygamma function, type float
 Output array:
 0: values of polygamma function at corresponding x, type float
 Two input and one output arrays have the same shape"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_polygamma]))

(defn ->float-polygamma
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_polygamma [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_polygamma p))
  (^Nd4jCpu$float_polygamma []
    (new Nd4jCpu$float_polygamma )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_polygamma`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_polygamma [^Nd4jCpu$float_polygamma this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_polygamma this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

