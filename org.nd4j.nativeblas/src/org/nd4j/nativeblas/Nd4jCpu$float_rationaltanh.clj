(ns org.nd4j.nativeblas.Nd4jCpu$float_rationaltanh
  "This is RationalTanh activation function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_rationaltanh]))

(defn ->float-rationaltanh
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_rationaltanh [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_rationaltanh p))
  (^Nd4jCpu$float_rationaltanh []
    (new Nd4jCpu$float_rationaltanh )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_rationaltanh`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_rationaltanh [^Nd4jCpu$float_rationaltanh this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_rationaltanh this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

