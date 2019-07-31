(ns org.nd4j.nativeblas.Nd4jCpu$float_fill
  "This operation takes shape as first argument, and returns new NDArray filled with specific scalar value.
 Input arrays:
 0 - shape vector
 1 - optional scalar NDArray
 T arguments:
 0 - optional scalar value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_fill]))

(defn ->float-fill
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_fill [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_fill p))
  (^Nd4jCpu$float_fill []
    (new Nd4jCpu$float_fill )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_fill`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_fill [^Nd4jCpu$float_fill this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_fill this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

