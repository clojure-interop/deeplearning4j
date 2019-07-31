(ns org.nd4j.nativeblas.Nd4jCpu$double_shapes_of
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$double_shapes_of]))

(defn ->double-shapes-of
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$double_shapes_of [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$double_shapes_of p))
  (^Nd4jCpu$double_shapes_of []
    (new Nd4jCpu$double_shapes_of )))

(defn position
  "position - `long`

  returns: `org.nd4j.nativeblas.Nd4jCpu$double_shapes_of`"
  (^org.nd4j.nativeblas.Nd4jCpu$double_shapes_of [^Nd4jCpu$double_shapes_of this ^Long position]
    (-> this (.position position))))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shape - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$double_shapes_of this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shape ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shape block))))

