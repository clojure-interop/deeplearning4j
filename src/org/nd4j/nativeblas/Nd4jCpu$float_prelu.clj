(ns org.nd4j.nativeblas.Nd4jCpu$float_prelu
  "Parametric Rectified Linear Unit
 f(x) = alpha * x for x < 0, f(x) = x for x >= 0"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_prelu]))

(defn ->float-prelu
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_prelu [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_prelu p))
  (^Nd4jCpu$float_prelu []
    (new Nd4jCpu$float_prelu )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_prelu`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_prelu [^Nd4jCpu$float_prelu this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_prelu this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

