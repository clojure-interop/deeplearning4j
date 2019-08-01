(ns org.nd4j.nativeblas.Nd4jCpu$DoubleDeclarableCustomOp
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.nativeblas Nd4jCpu$DoubleDeclarableCustomOp]))

(defn ->double-declarable-custom-op
  "Constructor.

  Pointer cast constructor. Invokes Pointer.Pointer(Pointer).

  p - `org.bytedeco.javacpp.Pointer`"
  (^Nd4jCpu$DoubleDeclarableCustomOp [^org.bytedeco.javacpp.Pointer p]
    (new Nd4jCpu$DoubleDeclarableCustomOp p)))

(defn calculate-output-shape
  "Description copied from class: Nd4jCpu.DoubleDeclarableOp

  input-shapes - `org.nd4j.nativeblas.Nd4jCpu$ShapeList`
  block - `org.nd4j.nativeblas.Nd4jCpu$DoubleContext`

  returns: `org.nd4j.nativeblas.Nd4jCpu$ShapeList`"
  (^org.nd4j.nativeblas.Nd4jCpu$ShapeList [^Nd4jCpu$DoubleDeclarableCustomOp this ^org.nd4j.nativeblas.Nd4jCpu$ShapeList input-shapes ^org.nd4j.nativeblas.Nd4jCpu$DoubleContext block]
    (-> this (.calculateOutputShape input-shapes block))))

