(ns org.nd4j.nativeblas.Nd4jCpu$float_gte_scalar
  "This is scalar boolean op.
 Both operands should be scalars.
 Returns true if x >= y"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_gte_scalar]))

(defn ->float-gte-scalar
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_gte_scalar [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_gte_scalar p))
  (^Nd4jCpu$float_gte_scalar []
    (new Nd4jCpu$float_gte_scalar )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_gte_scalar`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_gte_scalar [^Nd4jCpu$float_gte_scalar this ^Long position]
    (-> this (.position position))))

