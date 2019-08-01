(ns org.nd4j.nativeblas.Nd4jCpu$float_While
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_While]))

(defn ->float-while
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_While [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_While p))
  (^Nd4jCpu$float_While []
    (new Nd4jCpu$float_While )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_While`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_While [^Nd4jCpu$float_While this ^Long position]
    (-> this (.position position))))

