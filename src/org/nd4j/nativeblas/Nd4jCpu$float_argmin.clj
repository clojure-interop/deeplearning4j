(ns org.nd4j.nativeblas.Nd4jCpu$float_argmin
  "This operation returns index of min element in a given NDArray (optionally: along given dimension(s))
 Expected input:
 0: N-dimensional array
 1: optional axis vector
 Int args:
 0: optional axis"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_argmin]))

(defn ->float-argmin
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_argmin [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_argmin p))
  (^Nd4jCpu$float_argmin []
    (new Nd4jCpu$float_argmin )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_argmin`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_argmin [^Nd4jCpu$float_argmin this ^Long position]
    (-> this (.position position))))

