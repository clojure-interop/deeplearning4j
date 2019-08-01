(ns org.nd4j.nativeblas.Nd4jCpu$half_reversedivide
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_reversedivide]))

(defn ->half-reversedivide
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_reversedivide [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_reversedivide p))
  (^Nd4jCpu$half_reversedivide []
    (new Nd4jCpu$half_reversedivide )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_reversedivide`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_reversedivide [^Nd4jCpu$half_reversedivide this ^Long position]
    (-> this (.position position))))

