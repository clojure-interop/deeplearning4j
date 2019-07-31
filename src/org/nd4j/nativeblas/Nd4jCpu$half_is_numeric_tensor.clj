(ns org.nd4j.nativeblas.Nd4jCpu$half_is_numeric_tensor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_is_numeric_tensor]))

(defn ->half-is-numeric-tensor
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_is_numeric_tensor [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_is_numeric_tensor p))
  (^Nd4jCpu$half_is_numeric_tensor []
    (new Nd4jCpu$half_is_numeric_tensor )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_is_numeric_tensor`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_is_numeric_tensor [^Nd4jCpu$half_is_numeric_tensor this ^Long position]
    (-> this (.position position))))

