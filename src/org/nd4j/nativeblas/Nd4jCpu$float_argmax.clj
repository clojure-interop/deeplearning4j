(ns org.nd4j.nativeblas.Nd4jCpu$float_argmax
  "This operation returns index of max element in a given NDArray (optionally: along given dimension(s))
 Expected input:
 0: N-dimensional array
 1: optional axis vector
 Int args:
 0: optional axis"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_argmax]))

(defn ->float-argmax
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_argmax [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_argmax p))
  (^Nd4jCpu$float_argmax []
    (new Nd4jCpu$float_argmax )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_argmax`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_argmax [^Nd4jCpu$float_argmax this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_argmax this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

