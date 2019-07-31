(ns org.nd4j.nativeblas.Nd4jCpu$half_subtract
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_subtract]))

(defn ->half-subtract
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_subtract [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_subtract p))
  (^Nd4jCpu$half_subtract []
    (new Nd4jCpu$half_subtract )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_subtract`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_subtract [^Nd4jCpu$half_subtract this ^Long position]
    (-> this (.position position))))

