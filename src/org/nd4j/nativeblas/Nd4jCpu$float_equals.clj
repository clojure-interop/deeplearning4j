(ns org.nd4j.nativeblas.Nd4jCpu$float_equals
  "This op takes 2 equally shaped arrays as input, and provides binary matrix as output.
 Math is: _x == _y ? (T) 1.0f : (T) 0.0f;"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_equals]))

(defn ->float-equals
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_equals [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_equals p))
  (^Nd4jCpu$float_equals []
    (new Nd4jCpu$float_equals )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_equals`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_equals [^Nd4jCpu$float_equals this ^Long position]
    (-> this (.position position))))

