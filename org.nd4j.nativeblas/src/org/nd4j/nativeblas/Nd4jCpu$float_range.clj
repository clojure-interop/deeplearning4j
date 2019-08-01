(ns org.nd4j.nativeblas.Nd4jCpu$float_range
  "This operation generate sequences. Basically from......to, with step used as increment.
 Expected arguments:
 start: optional scalar with starting value
 stop: optional scalar with end value
 step: optional scalar witn step value
 Int args: (optional)
 0: optional scalar with starting value
 1: optional scalar with end value
 1: optional scalar witn step value
 T args: (optional)
 0: optional scalar with starting value
 1: optional scalar with end value
 1: optional scalar witn step value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_range]))

(defn ->float-range
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_range [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_range p))
  (^Nd4jCpu$float_range []
    (new Nd4jCpu$float_range )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_range`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_range [^Nd4jCpu$float_range this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_range this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

