(ns org.nd4j.nativeblas.Nd4jCpu$float_norm
  "This operation provides various normalization modes:
 0: frobenius
 1: euclidean (norm2)
 2: norm1
 3: norm2
 4: inf-norm
 5: p-norm
 Expected arguments:
 input: N-dimensional array
 Int args:
 0...: axis
 T args:
 0: norm mode
 1: p for p-norm"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_norm]))

(defn ->float-norm
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_norm [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_norm p))
  (^Nd4jCpu$float_norm []
    (new Nd4jCpu$float_norm )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_norm`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_norm [^Nd4jCpu$float_norm this ^Long position]
    (-> this (.position position))))

