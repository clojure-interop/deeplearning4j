(ns org.nd4j.nativeblas.Nd4jCpu$float_greater
  "This op takes 2 equally shaped arrays as input, and provides binary matrix as output.
 Math is: _x > _y ? (T) 1.0f : (T) 0.0f;"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_greater]))

(defn ->float-greater
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_greater [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_greater p))
  (^Nd4jCpu$float_greater []
    (new Nd4jCpu$float_greater )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_greater`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_greater [^Nd4jCpu$float_greater this ^Long position]
    (-> this (.position position))))

