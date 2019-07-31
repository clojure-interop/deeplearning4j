(ns org.nd4j.nativeblas.Nd4jCpu$float_biasadd
  "This operation is added for compatibility purposes mostly.
 PLEASE NOTE: Please consider using Add instead
 Expected arguments:
 0: N-dimensional input
 1: bias vector"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_biasadd]))

(defn ->float-biasadd
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_biasadd [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_biasadd p))
  (^Nd4jCpu$float_biasadd []
    (new Nd4jCpu$float_biasadd )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_biasadd`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_biasadd [^Nd4jCpu$float_biasadd this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_biasadd this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

