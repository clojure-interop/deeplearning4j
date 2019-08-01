(ns org.nd4j.nativeblas.Nd4jCpu$float_assign
  "This is one of auto-broadcastable operations. It accepts 2 operands, and operation is applied based on their shapes:
 1) if shapes are equal that's pairwise operation, result will have the same shape.
 2) if shape X is scalar and shape Y is array - result will have shape equal to Y.
 3) if shape X is array and shape Y is scalar - result will have shape equal to X.
 4) if shape X and Y are both arrays, but shapes aren't equal - result shape will be broadcast result.
 This operation returns Z = Assign(X, Y)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_assign]))

(defn ->float-assign
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_assign [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_assign p))
  (^Nd4jCpu$float_assign []
    (new Nd4jCpu$float_assign )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_assign`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_assign [^Nd4jCpu$float_assign this ^Long position]
    (-> this (.position position))))

