(ns org.nd4j.nativeblas.Nd4jCpu$double_subtract
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_subtract]))

(defn ->double-subtract
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_subtract [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_subtract p))
  (^Nd4jCpu$double_subtract []
    (new Nd4jCpu$double_subtract )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_subtract`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_subtract [^Nd4jCpu$double_subtract this ^Long position]
    (-> this (.position position))))

