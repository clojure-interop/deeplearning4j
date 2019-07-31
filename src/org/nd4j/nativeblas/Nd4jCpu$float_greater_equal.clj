(ns org.nd4j.nativeblas.Nd4jCpu$float_greater_equal
  "This op takes 2 equally shaped arrays as input, and provides binary matrix as output.
 Math is: _x >= _y ? (T) 1.0f : (T) 0.0f;"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_greater_equal]))

(defn ->float-greater-equal
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_greater_equal [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_greater_equal p))
  (^Nd4jCpu$float_greater_equal []
    (new Nd4jCpu$float_greater_equal )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_greater_equal`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_greater_equal [^Nd4jCpu$float_greater_equal this ^Long position]
    (-> this (.position position))))

