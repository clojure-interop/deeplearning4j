(ns org.nd4j.nativeblas.Nd4jCpu$float_is_strictly_increasing
  "This op takes 1 n-dimensional array as input, and returns true if for every adjacent pair we have x[i] < x[i+1]."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_is_strictly_increasing]))

(defn ->float-is-strictly-increasing
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_is_strictly_increasing [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_is_strictly_increasing p))
  (^Nd4jCpu$float_is_strictly_increasing []
    (new Nd4jCpu$float_is_strictly_increasing )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_is_strictly_increasing`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_is_strictly_increasing [^Nd4jCpu$float_is_strictly_increasing this ^Long position]
    (-> this (.position position))))

