(ns org.nd4j.nativeblas.Nd4jCpu$double_reversedivide
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_reversedivide]))

(defn ->double-reversedivide
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_reversedivide [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_reversedivide p))
  (^Nd4jCpu$double_reversedivide []
    (new Nd4jCpu$double_reversedivide )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_reversedivide`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_reversedivide [^Nd4jCpu$double_reversedivide this ^Long position]
    (-> this (.position position))))

