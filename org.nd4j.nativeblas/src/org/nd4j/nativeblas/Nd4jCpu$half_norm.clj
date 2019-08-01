(ns org.nd4j.nativeblas.Nd4jCpu$half_norm
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_norm]))

(defn ->half-norm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_norm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_norm p))
  (^Nd4jCpu$half_norm []
    (new Nd4jCpu$half_norm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_norm`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_norm [^Nd4jCpu$half_norm this ^Long position]
    (-> this (.position position))))

