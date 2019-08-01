(ns org.nd4j.nativeblas.Nd4jCpu$float_square
  "This operation applies element-wise pow(x, 2) to the given input
 Expected arguments:
 input: N-Dimensional array"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_square]))

(defn ->float-square
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_square [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_square p))
  (^Nd4jCpu$float_square []
    (new Nd4jCpu$float_square )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_square`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_square [^Nd4jCpu$float_square this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_square this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

