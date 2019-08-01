(ns org.nd4j.nativeblas.Nd4jCpu$float_is_numeric_tensor
  "This op takes 1 n-dimensional array as input, and returns true if input is a numeric array."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_is_numeric_tensor]))

(defn ->float-is-numeric-tensor
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_is_numeric_tensor [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_is_numeric_tensor p))
  (^Nd4jCpu$float_is_numeric_tensor []
    (new Nd4jCpu$float_is_numeric_tensor )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_is_numeric_tensor`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_is_numeric_tensor [^Nd4jCpu$float_is_numeric_tensor this ^Long position]
    (-> this (.position position))))

