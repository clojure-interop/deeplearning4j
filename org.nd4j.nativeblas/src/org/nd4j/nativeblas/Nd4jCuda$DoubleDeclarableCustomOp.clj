(ns org.nd4j.nativeblas.Nd4jCuda$DoubleDeclarableCustomOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$DoubleDeclarableCustomOp]))

(defn ->double-declarable-custom-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$DoubleDeclarableCustomOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$DoubleDeclarableCustomOp p)))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.DoubleDeclarableOp

  input-shapes - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$DoubleDeclarableCustomOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shapes ^org.nd4j.nativeblas.Nd4jCuda$DoubleContext block]
    (-> this (.calculateOutputShape input-shapes block))))

