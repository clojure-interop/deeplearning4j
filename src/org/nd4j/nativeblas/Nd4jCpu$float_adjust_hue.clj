(ns org.nd4j.nativeblas.Nd4jCpu$float_adjust_hue
  "This operation adjusts image hue by delta
 Input arrays:
 0 - 1D or 3D input array, must have 3 channels.
 1 - optional scalar, delta value
 T arguments:
 0 - optional delta value
 Int arguments:
 0 - optional argument, isNHWC. false by default."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_adjust_hue]))

(defn ->float-adjust-hue
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_adjust_hue [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_adjust_hue p))
  (^Nd4jCpu$float_adjust_hue []
    (new Nd4jCpu$float_adjust_hue )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_adjust_hue`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_adjust_hue [^Nd4jCpu$float_adjust_hue this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_adjust_hue this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

