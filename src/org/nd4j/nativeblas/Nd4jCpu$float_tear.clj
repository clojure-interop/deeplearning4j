(ns org.nd4j.nativeblas.Nd4jCpu$float_tear
  "This operation splits input NDArray into multiple TADs along given dimensions
 Expected arguments:
 input: N-dimensional array
 Int args:
 0..: TAD axis"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_tear]))

(defn ->float-tear
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_tear [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_tear p))
  (^Nd4jCpu$float_tear []
    (new Nd4jCpu$float_tear )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_tear`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_tear [^Nd4jCpu$float_tear this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_tear this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

