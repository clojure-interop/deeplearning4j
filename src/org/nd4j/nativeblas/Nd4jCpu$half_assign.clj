(ns org.nd4j.nativeblas.Nd4jCpu$half_assign
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_assign]))

(defn ->half-assign
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_assign [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_assign p))
  (^Nd4jCpu$half_assign []
    (new Nd4jCpu$half_assign )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_assign`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_assign [^Nd4jCpu$half_assign this ^Long position]
    (-> this (.position position))))

