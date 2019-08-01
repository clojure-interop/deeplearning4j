(ns org.nd4j.nativeblas.Nd4jCpu$float_eq_scalar
  "This is scalar boolean op.
 Both operands should be scalars.
 Returns true if both operands are equal."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_eq_scalar]))

(defn ->float-eq-scalar
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_eq_scalar [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_eq_scalar p))
  (^Nd4jCpu$float_eq_scalar []
    (new Nd4jCpu$float_eq_scalar )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_eq_scalar`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_eq_scalar [^Nd4jCpu$float_eq_scalar this ^Long position]
    (-> this (.position position))))

