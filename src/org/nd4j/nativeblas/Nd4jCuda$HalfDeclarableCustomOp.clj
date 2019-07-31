(ns org.nd4j.nativeblas.Nd4jCuda$HalfDeclarableCustomOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCuda$HalfDeclarableCustomOp]))

(defn ->half-declarable-custom-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCuda$HalfDeclarableCustomOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCuda$HalfDeclarableCustomOp p)))

(defn calculate-output-shape
  "Description copied from class: Nd4jCuda.HalfDeclarableOp

  input-shapes - `org.nd4j.nativeblas.Nd4jCuda$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCuda$HalfContext`

  returns: `org.nd4j.nativeblas.Nd4jCuda$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCuda$ShapeList [^Nd4jCuda$HalfDeclarableCustomOp this ^org.nd4j.nativeblas.Nd4jCuda$ShapeList input-shapes ^org.nd4j.nativeblas.Nd4jCuda$HalfContext block]
    (-> this (.calculateOutputShape input-shapes block))))

