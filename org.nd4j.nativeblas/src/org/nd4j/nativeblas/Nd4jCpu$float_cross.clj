(ns org.nd4j.nativeblas.Nd4jCpu$float_cross
  "This op calculates cross-product between input arguments
 Input arguments
 0 - vector or tensor A
 1 - vector or tensor B"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_cross]))

(defn ->float-cross
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_cross [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_cross p))
  (^Nd4jCpu$float_cross []
    (new Nd4jCpu$float_cross )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_cross`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_cross [^Nd4jCpu$float_cross this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_cross this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

