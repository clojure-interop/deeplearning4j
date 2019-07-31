(ns org.nd4j.nativeblas.Nd4jCpu$double_reversemod
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_reversemod]))

(defn ->double-reversemod
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_reversemod [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_reversemod p))
  (^Nd4jCpu$double_reversemod []
    (new Nd4jCpu$double_reversemod )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_reversemod`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_reversemod [^Nd4jCpu$double_reversemod this ^Long position]
    (-> this (.position position))))

