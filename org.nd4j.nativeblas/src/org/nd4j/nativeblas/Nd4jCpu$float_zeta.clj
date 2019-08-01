(ns org.nd4j.nativeblas.Nd4jCpu$float_zeta
  "This op calculates Hurwitz zeta function zeta(x, q) = sum_{n=0}^{inf} (q  n)^{-x}
 Implementation is based on Euler-Maclaurin summation formula
 Input arrays:
 x: define power {-x}, must be > 1, type float.
 q: define summand in denominator, must be > 0, type float.
 Output array:
 0: corresponding values of Hurwitz zeta function
 Two input and one output arrays must have the same shape"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_zeta]))

(defn ->float-zeta
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_zeta [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_zeta p))
  (^Nd4jCpu$float_zeta []
    (new Nd4jCpu$float_zeta )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_zeta`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_zeta [^Nd4jCpu$float_zeta this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_zeta this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

