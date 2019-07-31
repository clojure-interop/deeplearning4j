(ns org.nd4j.nativeblas.Nd4jCpu$float_reversesubtract
  "This is one of auto-broadcastable operations. It accepts 2 operands, and operation is applied based on their shapes:
 1) if shapes are equal that's pairwise operation, result will have the same shape.
 2) if shape X is scalar and shape Y is array - result will have shape equal to Y.
 3) if shape X is array and shape Y is scalar - result will have shape equal to X.
 4) if shape X and Y are both arrays, but shapes aren't equal - result shape will be broadcast result.
 This operation returns Z = Subtract(Y, X)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_reversesubtract]))

(defn ->float-reversesubtract
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_reversesubtract [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_reversesubtract p))
  (^Nd4jCpu$float_reversesubtract []
    (new Nd4jCpu$float_reversesubtract )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_reversesubtract`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_reversesubtract [^Nd4jCpu$float_reversesubtract this ^Long position]
    (-> this (.position position))))

