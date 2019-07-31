(ns org.nd4j.nativeblas.Nd4jCpu$float_mod
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_mod]))

(defn ->float-mod
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_mod [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_mod p))
  (^Nd4jCpu$float_mod []
    (new Nd4jCpu$float_mod )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_mod`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_mod [^Nd4jCpu$float_mod this ^Long position]
    (-> this (.position position))))

