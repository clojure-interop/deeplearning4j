(ns org.nd4j.nativeblas.Nd4jCpu$float_fill_as
  "This operation takes input's shape, and returns new NDArray filled with specified value
 Expected arguments:
 input: N-dimensional array
 T args:
 0: scalar value, used to fill NDArray"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_fill_as]))

(defn ->float-fill-as
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_fill_as [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_fill_as p))
  (^Nd4jCpu$float_fill_as []
    (new Nd4jCpu$float_fill_as )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_fill_as`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_fill_as [^Nd4jCpu$float_fill_as this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_fill_as this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

