(ns org.nd4j.nativeblas.Nd4jCpu$double_While
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_While]))

(defn ->double-while
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_While [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_While p))
  (^Nd4jCpu$double_While []
    (new Nd4jCpu$double_While )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_While`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_While [^Nd4jCpu$double_While this ^Long position]
    (-> this (.position position))))

