(ns org.nd4j.nativeblas.Nd4jCpu$float_broadcast_dynamic_shape
  "broadcast_dynamic_shape op.
 input params:
 0 - the first shape (vector with shape)
 1 - the second shape (vector with shape)
 return value:
 vector with broadcasted shape"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$float_broadcast_dynamic_shape]))

(defn ->float-broadcast-dynamic-shape
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$float_broadcast_dynamic_shape [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$float_broadcast_dynamic_shape p))
  (^Nd4jCpu$float_broadcast_dynamic_shape []
    (new Nd4jCpu$float_broadcast_dynamic_shape )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$float_broadcast_dynamic_shape`"
  (^org.nd4j.nativeblas.Nd4jCpu$float_broadcast_dynamic_shape [^Nd4jCpu$float_broadcast_dynamic_shape this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.FloatDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$FloatContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$float_broadcast_dynamic_shape this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$FloatContext block]
    (-> this (.calculateOutputShape input-shape block))))

