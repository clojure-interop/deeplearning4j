(ns org.nd4j.nativeblas.Nd4jCpu$half_mod
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_mod]))

(defn ->half-mod
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_mod [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_mod p))
  (^Nd4jCpu$half_mod []
    (new Nd4jCpu$half_mod )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_mod`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_mod [^Nd4jCpu$half_mod this ^Long position]
    (-> this (.position position))))

