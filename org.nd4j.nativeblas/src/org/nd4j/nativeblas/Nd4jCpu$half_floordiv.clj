(ns org.nd4j.nativeblas.Nd4jCpu$half_floordiv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_floordiv]))

(defn ->half-floordiv
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_floordiv [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_floordiv p))
  (^Nd4jCpu$half_floordiv []
    (new Nd4jCpu$half_floordiv )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_floordiv`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_floordiv [^Nd4jCpu$half_floordiv this ^Long position]
    (-> this (.position position))))

