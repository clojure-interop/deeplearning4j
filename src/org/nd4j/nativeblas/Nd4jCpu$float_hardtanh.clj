(ns org.nd4j.nativeblas.Nd4jCpu$float_hardtanh
  "This is HardTanh activation function.
 Math is: x < -1.0 ? -1.0 : x > 1.0 ? 1.0 : x;"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_hardtanh]))

(defn ->float-hardtanh
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_hardtanh [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_hardtanh p))
  (^Nd4jCpu$float_hardtanh []
    (new Nd4jCpu$float_hardtanh )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_hardtanh`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_hardtanh [^Nd4jCpu$float_hardtanh this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_hardtanh this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

