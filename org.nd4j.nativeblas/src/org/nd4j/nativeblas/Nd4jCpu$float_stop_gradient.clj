(ns org.nd4j.nativeblas.Nd4jCpu$float_stop_gradient
  "This operation is missed due it simplicy.
 Input and output params are the same after operation.
 Input - NDArray, output - NDArray with the same shape."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_stop_gradient]))

(defn ->float-stop-gradient
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_stop_gradient [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_stop_gradient p))
  (^Nd4jCpu$float_stop_gradient []
    (new Nd4jCpu$float_stop_gradient )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_stop_gradient`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_stop_gradient [^Nd4jCpu$float_stop_gradient this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_stop_gradient this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

