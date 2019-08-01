(ns org.nd4j.nativeblas.Nd4jCpu$half_While
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_While]))

(defn ->half-while
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_While [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_While p))
  (^Nd4jCpu$half_While []
    (new Nd4jCpu$half_While )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_While`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_While [^Nd4jCpu$half_While this ^Long position]
    (-> this (.position position))))

