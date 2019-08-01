(ns org.nd4j.nativeblas.Nd4jCpu$half_reversemod
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_reversemod]))

(defn ->half-reversemod
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_reversemod [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_reversemod p))
  (^Nd4jCpu$half_reversemod []
    (new Nd4jCpu$half_reversemod )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_reversemod`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_reversemod [^Nd4jCpu$half_reversemod this ^Long position]
    (-> this (.position position))))

