(ns org.nd4j.nativeblas.Nd4jCpu$float_less
  "This op takes 2 equally shaped arrays as input, and provides binary matrix as output.
 Math is: _x < _y ? (T) 1.0f : (T) 0.0f;"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_less]))

(defn ->float-less
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_less [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_less p))
  (^Nd4jCpu$float_less []
    (new Nd4jCpu$float_less )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_less`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_less [^Nd4jCpu$float_less this ^Long position]
    (-> this (.position position))))

