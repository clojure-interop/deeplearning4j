(ns org.nd4j.nativeblas.Nd4jCpu$float_expose
  "This operations exposes given arguments as it's own outputs, but does it only once.
 Subsequent calls will be served directly by this op.
 PLEASE NOTE: This operation is internal graph operation, and shouldn't be used directly usually."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_expose]))

(defn ->float-expose
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_expose [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_expose p))
  (^Nd4jCpu$float_expose []
    (new Nd4jCpu$float_expose )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_expose`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_expose [^Nd4jCpu$float_expose this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_expose this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

