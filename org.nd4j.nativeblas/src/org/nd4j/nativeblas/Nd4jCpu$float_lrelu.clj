(ns org.nd4j.nativeblas.Nd4jCpu$float_lrelu
  "This is Leaky RELU activation function.
 Math is: x < 0 ? alpha * x : x;"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_lrelu]))

(defn ->float-lrelu
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_lrelu [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_lrelu p))
  (^Nd4jCpu$float_lrelu []
    (new Nd4jCpu$float_lrelu )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_lrelu`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_lrelu [^Nd4jCpu$float_lrelu this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_lrelu this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

