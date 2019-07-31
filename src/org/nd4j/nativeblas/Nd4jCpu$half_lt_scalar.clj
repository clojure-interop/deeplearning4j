(ns org.nd4j.nativeblas.Nd4jCpu$half_lt_scalar
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_lt_scalar]))

(defn ->half-lt-scalar
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_lt_scalar [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_lt_scalar p))
  (^Nd4jCpu$half_lt_scalar []
    (new Nd4jCpu$half_lt_scalar )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_lt_scalar`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_lt_scalar [^Nd4jCpu$half_lt_scalar this ^Long position]
    (-> this (.position position))))

