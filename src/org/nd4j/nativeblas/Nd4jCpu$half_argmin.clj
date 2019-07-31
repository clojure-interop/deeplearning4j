(ns org.nd4j.nativeblas.Nd4jCpu$half_argmin
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$half_argmin]))

(defn ->half-argmin
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$half_argmin [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$half_argmin p))
  (^Nd4jCpu$half_argmin []
    (new Nd4jCpu$half_argmin )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$half_argmin`"
  (^org.nd4j.nativeblas.Nd4jCpu$half_argmin [^Nd4jCpu$half_argmin this ^Long position]
    (-> this (.position position))))

