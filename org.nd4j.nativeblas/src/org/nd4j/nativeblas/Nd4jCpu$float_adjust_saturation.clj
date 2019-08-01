(ns org.nd4j.nativeblas.Nd4jCpu$float_adjust_saturation
  "This operation adjusts image saturation by delta
 Input arrays:
 0 - 1D or 3D input array, must have 3 channels.
 1 - optional scalar, delta value
 T arguments:
 0 - optional delta value
 Int arguments:
 0 - optional argument, isNHWC. false by default."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_adjust_saturation]))

(defn ->float-adjust-saturation
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_adjust_saturation [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_adjust_saturation p))
  (^Nd4jCpu$float_adjust_saturation []
    (new Nd4jCpu$float_adjust_saturation )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_adjust_saturation`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_adjust_saturation [^Nd4jCpu$float_adjust_saturation this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_adjust_saturation this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

